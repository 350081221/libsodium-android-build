package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class CookieIdentityComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public int compare(Cookie c12, Cookie c22) {
        int res = c12.getName().compareTo(c22.getName());
        if (res == 0) {
            String d12 = c12.getDomain();
            if (d12 == null) {
                d12 = "";
            }
            String d22 = c22.getDomain();
            if (d22 == null) {
                d22 = "";
            }
            return d12.compareToIgnoreCase(d22);
        }
        return res;
    }
}
