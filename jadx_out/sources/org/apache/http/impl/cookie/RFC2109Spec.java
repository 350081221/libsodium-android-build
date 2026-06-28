package org.apache.http.impl.cookie;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.k0;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class RFC2109Spec extends CookieSpecBase {
    private final String[] datepatterns;
    private final boolean oneHeader;
    private static final CookiePathComparator PATH_COMPARATOR = new CookiePathComparator();
    private static final String[] DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", DateUtils.PATTERN_RFC1036, DateUtils.PATTERN_ASCTIME};

    public RFC2109Spec(String[] datepatterns, boolean oneHeader) {
        if (datepatterns != null) {
            this.datepatterns = (String[]) datepatterns.clone();
        } else {
            this.datepatterns = DATE_PATTERNS;
        }
        this.oneHeader = oneHeader;
        registerAttribHandler("version", new RFC2109VersionHandler());
        registerAttribHandler(ClientCookie.PATH_ATTR, new BasicPathHandler());
        registerAttribHandler(ClientCookie.DOMAIN_ATTR, new RFC2109DomainHandler());
        registerAttribHandler(ClientCookie.MAX_AGE_ATTR, new BasicMaxAgeHandler());
        registerAttribHandler(ClientCookie.SECURE_ATTR, new BasicSecureHandler());
        registerAttribHandler(ClientCookie.COMMENT_ATTR, new BasicCommentHandler());
        registerAttribHandler("expires", new BasicExpiresHandler(this.datepatterns));
    }

    public RFC2109Spec() {
        this(null, false);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Cookie> parse(Header header, CookieOrigin origin) throws MalformedCookieException {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (origin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        HeaderElement[] elems = header.getElements();
        return parse(elems, origin);
    }

    @Override // org.apache.http.impl.cookie.CookieSpecBase, org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin origin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        String name = cookie.getName();
        if (name.indexOf(32) != -1) {
            throw new MalformedCookieException("Cookie name may not contain blanks");
        }
        if (name.startsWith("$")) {
            throw new MalformedCookieException("Cookie name may not start with $");
        }
        super.validate(cookie, origin);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public List<Header> formatCookies(List<Cookie> cookies) {
        if (cookies == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        }
        if (cookies.isEmpty()) {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
        if (cookies.size() > 1) {
            cookies = new ArrayList(cookies);
            Collections.sort(cookies, PATH_COMPARATOR);
        }
        if (this.oneHeader) {
            return doFormatOneHeader(cookies);
        }
        return doFormatManyHeaders(cookies);
    }

    private List<Header> doFormatOneHeader(List<Cookie> cookies) {
        int version = Integer.MAX_VALUE;
        for (Cookie cookie : cookies) {
            if (cookie.getVersion() < version) {
                version = cookie.getVersion();
            }
        }
        CharArrayBuffer buffer = new CharArrayBuffer(40 * cookies.size());
        buffer.append(SM.COOKIE);
        buffer.append(": ");
        buffer.append("$Version=");
        buffer.append(Integer.toString(version));
        for (Cookie cooky : cookies) {
            buffer.append("; ");
            formatCookieAsVer(buffer, cooky, version);
        }
        List<Header> headers = new ArrayList<>(1);
        headers.add(new BufferedHeader(buffer));
        return headers;
    }

    private List<Header> doFormatManyHeaders(List<Cookie> cookies) {
        List<Header> headers = new ArrayList<>(cookies.size());
        for (Cookie cookie : cookies) {
            int version = cookie.getVersion();
            CharArrayBuffer buffer = new CharArrayBuffer(40);
            buffer.append("Cookie: ");
            buffer.append("$Version=");
            buffer.append(Integer.toString(version));
            buffer.append("; ");
            formatCookieAsVer(buffer, cookie, version);
            headers.add(new BufferedHeader(buffer));
        }
        return headers;
    }

    protected void formatParamAsVer(CharArrayBuffer buffer, String name, String value, int version) {
        buffer.append(name);
        buffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
        if (value != null) {
            if (version > 0) {
                buffer.append(k0.f19765b);
                buffer.append(value);
                buffer.append(k0.f19765b);
                return;
            }
            buffer.append(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void formatCookieAsVer(CharArrayBuffer buffer, Cookie cookie, int version) {
        formatParamAsVer(buffer, cookie.getName(), cookie.getValue(), version);
        if (cookie.getPath() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PATH_ATTR)) {
            buffer.append("; ");
            formatParamAsVer(buffer, "$Path", cookie.getPath(), version);
        }
        if (cookie.getDomain() != null && (cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
            buffer.append("; ");
            formatParamAsVer(buffer, "$Domain", cookie.getDomain(), version);
        }
    }

    @Override // org.apache.http.cookie.CookieSpec
    public int getVersion() {
        return 1;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public Header getVersionHeader() {
        return null;
    }
}
