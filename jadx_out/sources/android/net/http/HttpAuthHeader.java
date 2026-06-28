package android.net.http;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import i0.b;
import java.util.Locale;

/* loaded from: assets/org.apache.http.legacy.boot */
public class HttpAuthHeader {
    private static final String ALGORITHM_TOKEN = "algorithm";
    public static final int BASIC = 1;
    public static final String BASIC_TOKEN = "Basic";
    public static final int DIGEST = 2;
    public static final String DIGEST_TOKEN = "Digest";
    private static final String NONCE_TOKEN = "nonce";
    private static final String OPAQUE_TOKEN = "opaque";
    private static final String QOP_TOKEN = "qop";
    private static final String REALM_TOKEN = "realm";
    private static final String STALE_TOKEN = "stale";
    public static final int UNKNOWN = 0;
    private String mAlgorithm;
    private boolean mIsProxy;
    private String mNonce;
    private String mOpaque;
    private String mPassword;
    private String mQop;
    private String mRealm;
    private int mScheme;
    private boolean mStale;
    private String mUsername;

    public HttpAuthHeader(String header) {
        if (header != null) {
            parseHeader(header);
        }
    }

    public boolean isProxy() {
        return this.mIsProxy;
    }

    public void setProxy() {
        this.mIsProxy = true;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public void setUsername(String username) {
        this.mUsername = username;
    }

    public String getPassword() {
        return this.mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }

    public boolean isBasic() {
        return this.mScheme == 1;
    }

    public boolean isDigest() {
        return this.mScheme == 2;
    }

    public int getScheme() {
        return this.mScheme;
    }

    public boolean getStale() {
        return this.mStale;
    }

    public String getRealm() {
        return this.mRealm;
    }

    public String getNonce() {
        return this.mNonce;
    }

    public String getOpaque() {
        return this.mOpaque;
    }

    public String getQop() {
        return this.mQop;
    }

    public String getAlgorithm() {
        return this.mAlgorithm;
    }

    public boolean isSupportedScheme() {
        if (this.mRealm != null) {
            if (this.mScheme == 1) {
                return true;
            }
            if (this.mScheme == 2 && this.mAlgorithm.equals(TTDownloadField.TT_MD5)) {
                return this.mQop == null || this.mQop.equals(b.f16161n);
            }
            return false;
        }
        return false;
    }

    private void parseHeader(String header) {
        String parameters;
        if (header != null && (parameters = parseScheme(header)) != null && this.mScheme != 0) {
            parseParameters(parameters);
        }
    }

    private String parseScheme(String header) {
        int i5;
        if (header != null && (i5 = header.indexOf(32)) >= 0) {
            String scheme = header.substring(0, i5).trim();
            if (scheme.equalsIgnoreCase("Digest")) {
                this.mScheme = 2;
                this.mAlgorithm = TTDownloadField.TT_MD5;
            } else if (scheme.equalsIgnoreCase("Basic")) {
                this.mScheme = 1;
            }
            return header.substring(i5 + 1);
        }
        return null;
    }

    private void parseParameters(String parameters) {
        int i5;
        if (parameters == null) {
            return;
        }
        do {
            i5 = parameters.indexOf(44);
            if (i5 < 0) {
                parseParameter(parameters);
            } else {
                parseParameter(parameters.substring(0, i5));
                parameters = parameters.substring(i5 + 1);
            }
        } while (i5 >= 0);
    }

    private void parseParameter(String parameter) {
        int i5;
        if (parameter != null && (i5 = parameter.indexOf(61)) >= 0) {
            String token = parameter.substring(0, i5).trim();
            String value = trimDoubleQuotesIfAny(parameter.substring(i5 + 1).trim());
            if (token.equalsIgnoreCase(REALM_TOKEN)) {
                this.mRealm = value;
            } else if (this.mScheme == 2) {
                parseParameter(token, value);
            }
        }
    }

    private void parseParameter(String token, String value) {
        if (token != null && value != null) {
            if (token.equalsIgnoreCase(NONCE_TOKEN)) {
                this.mNonce = value;
                return;
            }
            if (token.equalsIgnoreCase(STALE_TOKEN)) {
                parseStale(value);
                return;
            }
            if (token.equalsIgnoreCase(OPAQUE_TOKEN)) {
                this.mOpaque = value;
            } else if (token.equalsIgnoreCase(QOP_TOKEN)) {
                this.mQop = value.toLowerCase(Locale.ROOT);
            } else if (token.equalsIgnoreCase(ALGORITHM_TOKEN)) {
                this.mAlgorithm = value.toLowerCase(Locale.ROOT);
            }
        }
    }

    private void parseStale(String value) {
        if (value != null && value.equalsIgnoreCase("true")) {
            this.mStale = true;
        }
    }

    private static String trimDoubleQuotesIfAny(String value) {
        int len;
        if (value != null && (len = value.length()) > 2 && value.charAt(0) == '\"' && value.charAt(len - 1) == '\"') {
            return value.substring(1, len - 1);
        }
        return value;
    }
}
