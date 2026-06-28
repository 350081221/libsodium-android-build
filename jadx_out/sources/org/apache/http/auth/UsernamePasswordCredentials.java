package org.apache.http.auth;

import java.security.Principal;
import org.apache.http.util.LangUtils;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class UsernamePasswordCredentials implements Credentials {
    private final String password;
    private final BasicUserPrincipal principal;

    public UsernamePasswordCredentials(String usernamePassword) {
        if (usernamePassword == null) {
            throw new IllegalArgumentException("Username:password string may not be null");
        }
        int atColon = usernamePassword.indexOf(58);
        if (atColon >= 0) {
            this.principal = new BasicUserPrincipal(usernamePassword.substring(0, atColon));
            this.password = usernamePassword.substring(atColon + 1);
        } else {
            this.principal = new BasicUserPrincipal(usernamePassword);
            this.password = null;
        }
    }

    public UsernamePasswordCredentials(String userName, String password) {
        if (userName == null) {
            throw new IllegalArgumentException("Username may not be null");
        }
        this.principal = new BasicUserPrincipal(userName);
        this.password = password;
    }

    @Override // org.apache.http.auth.Credentials
    public Principal getUserPrincipal() {
        return this.principal;
    }

    public String getUserName() {
        return this.principal.getName();
    }

    @Override // org.apache.http.auth.Credentials
    public String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return this.principal.hashCode();
    }

    public boolean equals(Object o5) {
        if (o5 == null) {
            return false;
        }
        if (this == o5) {
            return true;
        }
        if (o5 instanceof UsernamePasswordCredentials) {
            UsernamePasswordCredentials that = (UsernamePasswordCredentials) o5;
            if (LangUtils.equals(this.principal, that.principal)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.principal.toString();
    }
}
