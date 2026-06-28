package okhttp3.internal.http;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import okhttp3.Protocol;
import okhttp3.Response;
import p4.l;
import u3.e;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", PluginConstants.KEY_ERROR_CODE, "", CrashHianalyticsData.MESSAGE, "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StatusLine {

    @l
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;

    @e
    public final int code;

    @l
    @e
    public final String message;

    @l
    @e
    public final Protocol protocol;

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "HTTP_CONTINUE", "", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final StatusLine get(@l Response response) {
            l0.p(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        @l
        public final StatusLine parse(@l String statusLine) throws IOException {
            boolean s22;
            boolean s23;
            Protocol protocol;
            int i5;
            String str;
            l0.p(statusLine, "statusLine");
            s22 = e0.s2(statusLine, "HTTP/1.", false, 2, null);
            if (s22) {
                i5 = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException("Unexpected status line: " + statusLine);
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            } else {
                s23 = e0.s2(statusLine, "ICY ", false, 2, null);
                if (s23) {
                    protocol = Protocol.HTTP_1_0;
                    i5 = 4;
                } else {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            int i6 = i5 + 3;
            if (statusLine.length() >= i6) {
                try {
                    String substring = statusLine.substring(i5, i6);
                    l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i6) {
                        if (statusLine.charAt(i6) == ' ') {
                            str = statusLine.substring(i5 + 4);
                            l0.o(str, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException("Unexpected status line: " + statusLine);
                        }
                    } else {
                        str = "";
                    }
                    return new StatusLine(protocol, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
            }
            throw new ProtocolException("Unexpected status line: " + statusLine);
        }
    }

    public StatusLine(@l Protocol protocol, int i5, @l String message) {
        l0.p(protocol, "protocol");
        l0.p(message, "message");
        this.protocol = protocol;
        this.code = i5;
        this.message = message;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
