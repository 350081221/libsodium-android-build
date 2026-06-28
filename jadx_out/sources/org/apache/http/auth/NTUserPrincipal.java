package org.apache.http.auth;

import com.android.multidex.ClassPathElement;
import java.security.Principal;
import java.util.Locale;
import org.apache.http.util.LangUtils;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class NTUserPrincipal implements Principal {
    private final String domain;
    private final String ntname;
    private final String username;

    public NTUserPrincipal(String domain, String username) {
        if (username == null) {
            throw new IllegalArgumentException("User name may not be null");
        }
        this.username = username;
        if (domain != null) {
            this.domain = domain.toUpperCase(Locale.ENGLISH);
        } else {
            this.domain = null;
        }
        if (this.domain != null && this.domain.length() > 0) {
            this.ntname = this.domain + ClassPathElement.SEPARATOR_CHAR + this.username;
            return;
        }
        this.ntname = this.username;
    }

    @Override // java.security.Principal
    public String getName() {
        return this.ntname;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getUsername() {
        return this.username;
    }

    @Override // java.security.Principal
    public int hashCode() {
        int hash = LangUtils.hashCode(17, this.username);
        return LangUtils.hashCode(hash, this.domain);
    }

    @Override // java.security.Principal
    public boolean equals(Object o5) {
        if (o5 == null) {
            return false;
        }
        if (this == o5) {
            return true;
        }
        if (o5 instanceof NTUserPrincipal) {
            NTUserPrincipal that = (NTUserPrincipal) o5;
            if (LangUtils.equals(this.username, that.username) && LangUtils.equals(this.domain, that.domain)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Principal
    public String toString() {
        return this.ntname;
    }
}
