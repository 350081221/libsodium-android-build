package okhttp3.internal.ws;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.d0;
import kotlin.text.e0;
import kotlin.text.f0;
import o0.a;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", TTDownloadField.TT_HASHCODE, "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketExtensions {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @m
    @e
    public final Integer clientMaxWindowBits;

    @e
    public final boolean clientNoContextTakeover;

    @e
    public final boolean perMessageDeflate;

    @m
    @e
    public final Integer serverMaxWindowBits;

    @e
    public final boolean serverNoContextTakeover;

    @e
    public final boolean unknownValues;

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final WebSocketExtensions parse(@l Headers responseHeaders) throws IOException {
            boolean K1;
            boolean K12;
            String str;
            boolean K13;
            Integer X0;
            boolean K14;
            boolean K15;
            Integer X02;
            boolean K16;
            l0.p(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z4 = false;
            Integer num = null;
            boolean z5 = false;
            Integer num2 = null;
            boolean z6 = false;
            boolean z7 = false;
            for (int i5 = 0; i5 < size; i5++) {
                K1 = e0.K1(responseHeaders.name(i5), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true);
                if (K1) {
                    String value = responseHeaders.value(i5);
                    int i6 = 0;
                    while (i6 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i6, 0, 4, (Object) null);
                        int delimiterOffset = Util.delimiterOffset(value, ';', i6, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i6, delimiterOffset);
                        int i7 = delimiterOffset + 1;
                        K12 = e0.K1(trimSubstring, "permessage-deflate", true);
                        if (K12) {
                            if (z4) {
                                z7 = true;
                            }
                            i6 = i7;
                            while (i6 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, ';', i6, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, a.f20835h, i6, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i6, delimiterOffset3);
                                if (delimiterOffset3 < delimiterOffset2) {
                                    str = f0.j4(Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2), "\"");
                                } else {
                                    str = null;
                                }
                                i6 = delimiterOffset2 + 1;
                                K13 = e0.K1(trimSubstring2, "client_max_window_bits", true);
                                if (K13) {
                                    if (num != null) {
                                        z7 = true;
                                    }
                                    if (str != null) {
                                        X0 = d0.X0(str);
                                        num = X0;
                                    } else {
                                        num = null;
                                    }
                                    if (num == null) {
                                        z7 = true;
                                    }
                                } else {
                                    K14 = e0.K1(trimSubstring2, "client_no_context_takeover", true);
                                    if (K14) {
                                        if (z5) {
                                            z7 = true;
                                        }
                                        if (str != null) {
                                            z7 = true;
                                        }
                                        z5 = true;
                                    } else {
                                        K15 = e0.K1(trimSubstring2, "server_max_window_bits", true);
                                        if (K15) {
                                            if (num2 != null) {
                                                z7 = true;
                                            }
                                            if (str != null) {
                                                X02 = d0.X0(str);
                                                num2 = X02;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 == null) {
                                                z7 = true;
                                            }
                                        } else {
                                            K16 = e0.K1(trimSubstring2, "server_no_context_takeover", true);
                                            if (K16) {
                                                if (z6) {
                                                    z7 = true;
                                                }
                                                if (str != null) {
                                                    z7 = true;
                                                }
                                                z6 = true;
                                            } else {
                                                z7 = true;
                                            }
                                        }
                                    }
                                }
                            }
                            z4 = true;
                        } else {
                            i6 = i7;
                            z7 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z4, num, z5, num2, z6, z7);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z4, @m Integer num, boolean z5, @m Integer num2, boolean z6, boolean z7) {
        this.perMessageDeflate = z4;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z5;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z6;
        this.unknownValues = z7;
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = webSocketExtensions.perMessageDeflate;
        }
        if ((i5 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i5 & 4) != 0) {
            z5 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z8 = z5;
        if ((i5 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i5 & 16) != 0) {
            z6 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z9 = z6;
        if ((i5 & 32) != 0) {
            z7 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z4, num3, z8, num4, z9, z7);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @m
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @m
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @l
    public final WebSocketExtensions copy(boolean z4, @m Integer num, boolean z5, @m Integer num2, boolean z6, boolean z7) {
        return new WebSocketExtensions(z4, num, z5, num2, z6, z7);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && l0.g(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && l0.g(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z4 = this.perMessageDeflate;
        ?? r02 = z4;
        if (z4) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i5 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i6 = r22;
        if (r22 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode + i6) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i8 = r23;
        if (r23 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode2 + i8) * 31;
        boolean z5 = this.unknownValues;
        return i9 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z4) {
        if (z4) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    @l
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public /* synthetic */ WebSocketExtensions(boolean z4, Integer num, boolean z5, Integer num2, boolean z6, boolean z7, int i5, w wVar) {
        this((i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? null : num, (i5 & 4) != 0 ? false : z5, (i5 & 8) == 0 ? num2 : null, (i5 & 16) != 0 ? false : z6, (i5 & 32) != 0 ? false : z7);
    }
}
