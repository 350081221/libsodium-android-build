package org.apache.http.message;

import kotlin.text.k0;
import o0.a;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public class BasicHeaderValueFormatter implements HeaderValueFormatter {
    public static final BasicHeaderValueFormatter DEFAULT = new BasicHeaderValueFormatter();
    public static final String SEPARATORS = " ;,:@()<>\\\"/[]?={}\t";
    public static final String UNSAFE_CHARS = "\"\\";

    public static final String formatElements(HeaderElement[] elems, boolean quote, HeaderValueFormatter formatter) {
        if (formatter == null) {
            formatter = DEFAULT;
        }
        return formatter.formatElements(null, elems, quote).toString();
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatElements(CharArrayBuffer buffer, HeaderElement[] elems, boolean quote) {
        if (elems == null) {
            throw new IllegalArgumentException("Header element array must not be null.");
        }
        int len = estimateElementsLen(elems);
        if (buffer == null) {
            buffer = new CharArrayBuffer(len);
        } else {
            buffer.ensureCapacity(len);
        }
        for (int i5 = 0; i5 < elems.length; i5++) {
            if (i5 > 0) {
                buffer.append(", ");
            }
            formatHeaderElement(buffer, elems[i5], quote);
        }
        return buffer;
    }

    protected int estimateElementsLen(HeaderElement[] elems) {
        if (elems == null || elems.length < 1) {
            return 0;
        }
        int result = (elems.length - 1) * 2;
        for (HeaderElement headerElement : elems) {
            result += estimateHeaderElementLen(headerElement);
        }
        return result;
    }

    public static final String formatHeaderElement(HeaderElement elem, boolean quote, HeaderValueFormatter formatter) {
        if (formatter == null) {
            formatter = DEFAULT;
        }
        return formatter.formatHeaderElement(null, elem, quote).toString();
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatHeaderElement(CharArrayBuffer buffer, HeaderElement elem, boolean quote) {
        if (elem == null) {
            throw new IllegalArgumentException("Header element must not be null.");
        }
        int len = estimateHeaderElementLen(elem);
        if (buffer == null) {
            buffer = new CharArrayBuffer(len);
        } else {
            buffer.ensureCapacity(len);
        }
        buffer.append(elem.getName());
        String value = elem.getValue();
        if (value != null) {
            buffer.append(a.f20835h);
            doFormatValue(buffer, value, quote);
        }
        int parcnt = elem.getParameterCount();
        if (parcnt > 0) {
            for (int i5 = 0; i5 < parcnt; i5++) {
                buffer.append("; ");
                formatNameValuePair(buffer, elem.getParameter(i5), quote);
            }
        }
        return buffer;
    }

    protected int estimateHeaderElementLen(HeaderElement elem) {
        if (elem == null) {
            return 0;
        }
        int result = elem.getName().length();
        String value = elem.getValue();
        if (value != null) {
            result += 3 + value.length();
        }
        int parcnt = elem.getParameterCount();
        if (parcnt > 0) {
            for (int i5 = 0; i5 < parcnt; i5++) {
                result += 2 + estimateNameValuePairLen(elem.getParameter(i5));
            }
        }
        return result;
    }

    public static final String formatParameters(NameValuePair[] nvps, boolean quote, HeaderValueFormatter formatter) {
        if (formatter == null) {
            formatter = DEFAULT;
        }
        return formatter.formatParameters(null, nvps, quote).toString();
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatParameters(CharArrayBuffer buffer, NameValuePair[] nvps, boolean quote) {
        if (nvps == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        int len = estimateParametersLen(nvps);
        if (buffer == null) {
            buffer = new CharArrayBuffer(len);
        } else {
            buffer.ensureCapacity(len);
        }
        for (int i5 = 0; i5 < nvps.length; i5++) {
            if (i5 > 0) {
                buffer.append("; ");
            }
            formatNameValuePair(buffer, nvps[i5], quote);
        }
        return buffer;
    }

    protected int estimateParametersLen(NameValuePair[] nvps) {
        if (nvps == null || nvps.length < 1) {
            return 0;
        }
        int result = (nvps.length - 1) * 2;
        for (NameValuePair nameValuePair : nvps) {
            result += estimateNameValuePairLen(nameValuePair);
        }
        return result;
    }

    public static final String formatNameValuePair(NameValuePair nvp, boolean quote, HeaderValueFormatter formatter) {
        if (formatter == null) {
            formatter = DEFAULT;
        }
        return formatter.formatNameValuePair(null, nvp, quote).toString();
    }

    @Override // org.apache.http.message.HeaderValueFormatter
    public CharArrayBuffer formatNameValuePair(CharArrayBuffer buffer, NameValuePair nvp, boolean quote) {
        if (nvp == null) {
            throw new IllegalArgumentException("NameValuePair must not be null.");
        }
        int len = estimateNameValuePairLen(nvp);
        if (buffer == null) {
            buffer = new CharArrayBuffer(len);
        } else {
            buffer.ensureCapacity(len);
        }
        buffer.append(nvp.getName());
        String value = nvp.getValue();
        if (value != null) {
            buffer.append(a.f20835h);
            doFormatValue(buffer, value, quote);
        }
        return buffer;
    }

    protected int estimateNameValuePairLen(NameValuePair nvp) {
        if (nvp == null) {
            return 0;
        }
        int result = nvp.getName().length();
        String value = nvp.getValue();
        if (value != null) {
            return result + 3 + value.length();
        }
        return result;
    }

    protected void doFormatValue(CharArrayBuffer buffer, String value, boolean quote) {
        if (!quote) {
            boolean quote2 = quote;
            for (int i5 = 0; i5 < value.length() && !quote2; i5++) {
                quote2 = isSeparator(value.charAt(i5));
            }
            quote = quote2;
        }
        if (quote) {
            buffer.append(k0.f19765b);
        }
        for (int i6 = 0; i6 < value.length(); i6++) {
            char ch = value.charAt(i6);
            if (isUnsafe(ch)) {
                buffer.append('\\');
            }
            buffer.append(ch);
        }
        if (quote) {
            buffer.append(k0.f19765b);
        }
    }

    protected boolean isSeparator(char ch) {
        return SEPARATORS.indexOf(ch) >= 0;
    }

    protected boolean isUnsafe(char ch) {
        return UNSAFE_CHARS.indexOf(ch) >= 0;
    }
}
