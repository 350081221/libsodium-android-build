package org.apache.http.client.utils;

import com.android.multidex.ClassPathElement;
import com.tendcloud.tenddata.aa;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpHost;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class URIUtils {
    public static URI createURI(String scheme, String host, int port, String path, String query, String fragment) throws URISyntaxException {
        StringBuilder buffer = new StringBuilder();
        if (host != null) {
            if (scheme != null) {
                buffer.append(scheme);
                buffer.append(aa.f11324a);
            }
            buffer.append(host);
            if (port > 0) {
                buffer.append(':');
                buffer.append(port);
            }
        }
        if (path == null || !path.startsWith("/")) {
            buffer.append(ClassPathElement.SEPARATOR_CHAR);
        }
        if (path != null) {
            buffer.append(path);
        }
        if (query != null) {
            buffer.append('?');
            buffer.append(query);
        }
        if (fragment != null) {
            buffer.append('#');
            buffer.append(fragment);
        }
        return new URI(buffer.toString());
    }

    public static URI rewriteURI(URI uri, HttpHost target, boolean dropFragment) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        }
        String str = null;
        if (target != null) {
            String schemeName = target.getSchemeName();
            String hostName = target.getHostName();
            int port = target.getPort();
            String rawPath = uri.getRawPath();
            String rawQuery = uri.getRawQuery();
            if (!dropFragment) {
                str = uri.getRawFragment();
            }
            return createURI(schemeName, hostName, port, rawPath, rawQuery, str);
        }
        String rawPath2 = uri.getRawPath();
        String rawQuery2 = uri.getRawQuery();
        if (!dropFragment) {
            str = uri.getRawFragment();
        }
        return createURI(null, null, -1, rawPath2, rawQuery2, str);
    }

    public static URI rewriteURI(URI uri, HttpHost target) throws URISyntaxException {
        return rewriteURI(uri, target, false);
    }

    public static URI resolve(URI baseURI, String reference) {
        return resolve(baseURI, URI.create(reference));
    }

    public static URI resolve(URI baseURI, URI reference) {
        if (baseURI == null) {
            throw new IllegalArgumentException("Base URI may nor be null");
        }
        if (reference == null) {
            throw new IllegalArgumentException("Reference URI may nor be null");
        }
        boolean emptyReference = reference.toString().length() == 0;
        if (emptyReference) {
            reference = URI.create("#");
        }
        URI resolved = baseURI.resolve(reference);
        if (emptyReference) {
            String resolvedString = resolved.toString();
            return URI.create(resolvedString.substring(0, resolvedString.indexOf(35)));
        }
        return resolved;
    }

    private URIUtils() {
    }
}
