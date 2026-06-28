package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public final class EntityUtils {
    private EntityUtils() {
    }

    public static byte[] toByteArray(HttpEntity entity) throws IOException {
        if (entity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream instream = entity.getContent();
        if (instream == null) {
            return new byte[0];
        }
        if (entity.getContentLength() > 2147483647L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        int i5 = (int) entity.getContentLength();
        if (i5 < 0) {
            i5 = 4096;
        }
        ByteArrayBuffer buffer = new ByteArrayBuffer(i5);
        try {
            byte[] tmp = new byte[4096];
            while (true) {
                int l5 = instream.read(tmp);
                if (l5 != -1) {
                    buffer.append(tmp, 0, l5);
                } else {
                    instream.close();
                    return buffer.toByteArray();
                }
            }
        } catch (Throwable th) {
            instream.close();
            throw th;
        }
    }

    public static String getContentCharSet(HttpEntity entity) throws ParseException {
        NameValuePair param;
        if (entity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        if (entity.getContentType() == null) {
            return null;
        }
        HeaderElement[] values = entity.getContentType().getElements();
        if (values.length <= 0 || (param = values[0].getParameterByName("charset")) == null) {
            return null;
        }
        String charset = param.getValue();
        return charset;
    }

    public static String toString(HttpEntity entity, String defaultCharset) throws IOException, ParseException {
        if (entity == null) {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
        InputStream instream = entity.getContent();
        if (instream == null) {
            return "";
        }
        if (entity.getContentLength() > 2147483647L) {
            throw new IllegalArgumentException("HTTP entity too large to be buffered in memory");
        }
        int i5 = (int) entity.getContentLength();
        if (i5 < 0) {
            i5 = 4096;
        }
        String charset = getContentCharSet(entity);
        if (charset == null) {
            charset = defaultCharset;
        }
        if (charset == null) {
            charset = "ISO-8859-1";
        }
        Reader reader = new InputStreamReader(instream, charset);
        CharArrayBuffer buffer = new CharArrayBuffer(i5);
        try {
            char[] tmp = new char[1024];
            while (true) {
                int l5 = reader.read(tmp);
                if (l5 != -1) {
                    buffer.append(tmp, 0, l5);
                } else {
                    reader.close();
                    return buffer.toString();
                }
            }
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    public static String toString(HttpEntity entity) throws IOException, ParseException {
        return toString(entity, null);
    }
}
