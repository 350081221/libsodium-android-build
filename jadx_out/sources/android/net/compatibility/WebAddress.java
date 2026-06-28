package android.net.compatibility;

import com.tendcloud.tenddata.aa;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/org.apache.http.legacy.boot */
public class WebAddress {
    static final int MATCH_GROUP_AUTHORITY = 2;
    static final int MATCH_GROUP_HOST = 3;
    static final int MATCH_GROUP_PATH = 5;
    static final int MATCH_GROUP_PORT = 4;
    static final int MATCH_GROUP_SCHEME = 1;
    static Pattern sAddressPattern = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-\ufdcfﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
    private String mAuthInfo;
    private String mHost;
    private String mPath;
    private int mPort;
    private String mScheme;

    public WebAddress(String address) throws IllegalArgumentException {
        if (address == null) {
            throw new NullPointerException();
        }
        this.mScheme = "";
        this.mHost = "";
        this.mPort = -1;
        this.mPath = "/";
        this.mAuthInfo = "";
        Matcher m5 = sAddressPattern.matcher(address);
        if (m5.matches()) {
            String t5 = m5.group(1);
            if (t5 != null) {
                this.mScheme = t5.toLowerCase(Locale.ROOT);
            }
            String t6 = m5.group(2);
            if (t6 != null) {
                this.mAuthInfo = t6;
            }
            String t7 = m5.group(3);
            if (t7 != null) {
                this.mHost = t7;
            }
            String t8 = m5.group(4);
            if (t8 != null && t8.length() > 0) {
                try {
                    this.mPort = Integer.parseInt(t8);
                } catch (NumberFormatException e5) {
                    throw new IllegalArgumentException("Bad port");
                }
            }
            String t9 = m5.group(5);
            if (t9 != null && t9.length() > 0) {
                if (t9.charAt(0) == '/') {
                    this.mPath = t9;
                } else {
                    this.mPath = "/" + t9;
                }
            }
            if (this.mPort != 443 || !this.mScheme.equals("")) {
                if (this.mPort == -1) {
                    if (this.mScheme.equals("https")) {
                        this.mPort = 443;
                    } else {
                        this.mPort = 80;
                    }
                }
            } else {
                this.mScheme = "https";
            }
            if (this.mScheme.equals("")) {
                this.mScheme = "http";
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad address");
    }

    public String toString() {
        String port = "";
        if ((this.mPort != 443 && this.mScheme.equals("https")) || (this.mPort != 80 && this.mScheme.equals("http"))) {
            port = ":" + Integer.toString(this.mPort);
        }
        String authInfo = "";
        if (this.mAuthInfo.length() > 0) {
            authInfo = this.mAuthInfo + "@";
        }
        return this.mScheme + aa.f11324a + authInfo + this.mHost + port + this.mPath;
    }

    public void setScheme(String scheme) {
        this.mScheme = scheme;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public void setHost(String host) {
        this.mHost = host;
    }

    public String getHost() {
        return this.mHost;
    }

    public void setPort(int port) {
        this.mPort = port;
    }

    public int getPort() {
        return this.mPort;
    }

    public void setPath(String path) {
        this.mPath = path;
    }

    public String getPath() {
        return this.mPath;
    }

    public void setAuthInfo(String authInfo) {
        this.mAuthInfo = authInfo;
    }

    public String getAuthInfo() {
        return this.mAuthInfo;
    }
}
