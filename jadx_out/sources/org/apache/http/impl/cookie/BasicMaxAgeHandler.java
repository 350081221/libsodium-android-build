package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie cookie, String value) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (value == null) {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
        try {
            int age = Integer.parseInt(value);
            if (age < 0) {
                throw new MalformedCookieException("Negative max-age attribute: " + value);
            }
            cookie.setExpiryDate(new Date(System.currentTimeMillis() + (age * 1000)));
        } catch (NumberFormatException e5) {
            throw new MalformedCookieException("Invalid max-age attribute: " + value);
        }
    }
}
