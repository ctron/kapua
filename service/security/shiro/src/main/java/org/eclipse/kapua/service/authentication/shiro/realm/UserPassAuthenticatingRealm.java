/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.kapua.service.authentication.shiro.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.eclipse.kapua.KapuaException;
import org.eclipse.kapua.KapuaRuntimeException;
import org.eclipse.kapua.commons.security.KapuaSecurityUtils;
import org.eclipse.kapua.locator.KapuaLocator;
import org.eclipse.kapua.service.account.Account;
import org.eclipse.kapua.service.account.AccountService;
import org.eclipse.kapua.service.authentication.UsernamePasswordCredentials;
import org.eclipse.kapua.service.authentication.credential.Credential;
import org.eclipse.kapua.service.authentication.credential.CredentialService;
import org.eclipse.kapua.service.authentication.credential.CredentialType;
import org.eclipse.kapua.service.authentication.shiro.UsernamePasswordCredentialsImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link UsernamePasswordCredentials} based {@link AuthenticatingRealm} implementation.
 * 
 * @since 1.0.0
 * 
 */
public class UserPassAuthenticatingRealm extends AuthenticatingRealm {

    @SuppressWarnings("unused")
    private static final Logger s_logger = LoggerFactory.getLogger(UserPassAuthenticatingRealm.class);

    /**
     * Realm name
     */
    public static final String REALM_NAME = "userPassAuthenticatingRealm";

    /**
     * Constructor
     * 
     * @throws KapuaException
     */
    public UserPassAuthenticatingRealm() throws KapuaException {
        setName(REALM_NAME);

        CredentialsMatcher credentialsMather = new UserPassCredentialsMatcher();
        setCredentialsMatcher(credentialsMather);
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        //
        // Extract credentials
        UsernamePasswordCredentialsImpl token = (UsernamePasswordCredentialsImpl) authenticationToken;
        String tokenKey = token.getUsername();

        //
        // Get Services
        KapuaLocator locator;
        AccountService accountService;
        CredentialService credentialService;

        try {
            locator = KapuaLocator.getInstance();
            accountService = locator.getService(AccountService.class);
            credentialService = locator.getService(CredentialService.class);
        } catch (KapuaRuntimeException kre) {
            throw new ShiroException("Error while getting services!", kre);
        }

        //
        // Find credentials
        final Credential credential;
        try {
            credential = KapuaSecurityUtils.doPriviledge(() -> credentialService.findByKey(tokenKey, token.getSubjectType(), CredentialType.PASSWORD));
        } catch (AuthenticationException ae) {
            throw ae;
        } catch (Exception e) {
            throw new ShiroException("Error while find credentials!", e);
        }

        // Check existence
        if (credential == null) {
            throw new UnknownAccountException();
        }

        //
        // Find account
        final Account account;
        try {
            account = KapuaSecurityUtils.doPriviledge(() -> accountService.find(credential.getScopeId()));
        } catch (AuthenticationException ae) {
            throw ae;
        } catch (Exception e) {
            throw new ShiroException("Error while find account!", e);
        }

        // Check existence
        if (account == null) {
            throw new UnknownAccountException();
        }

        //
        // BuildAuthenticationInfo
        return new LoginAuthenticationInfo(getName(), credential);
    }

    @Override
    protected void assertCredentialsMatch(AuthenticationToken authcToken, AuthenticationInfo info)
            throws AuthenticationException {
        LoginAuthenticationInfo kapuaInfo = (LoginAuthenticationInfo) info;

        super.assertCredentialsMatch(authcToken, info);

        Subject currentSubject = SecurityUtils.getSubject();
        Session session = currentSubject.getSession();
        session.setAttribute("scopeId", kapuaInfo.getScopeId());
        session.setAttribute("subject", kapuaInfo.getSubject());
        session.setAttribute("credentials", kapuaInfo.getCredentials());
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordCredentialsImpl;
    }
}
