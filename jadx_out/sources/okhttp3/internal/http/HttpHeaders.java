package okhttp3.internal.http;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.m;
import kotlin.text.e0;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.n;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.protocol.HTTP;
import p4.l;
import u3.h;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lokio/l;", "", "result", "Lkotlin/r2;", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", TTDownloadField.TT_HEADERS, "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "Lokio/n;", "QUOTED_STRING_DELIMITERS", "Lokio/n;", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0})
@h(name = "HttpHeaders")
/* loaded from: classes4.dex */
public final class HttpHeaders {

    @l
    private static final n QUOTED_STRING_DELIMITERS;

    @l
    private static final n TOKEN_DELIMITERS;

    static {
        n.a aVar = n.Companion;
        QUOTED_STRING_DELIMITERS = aVar.l(BasicHeaderValueFormatter.UNSAFE_CHARS);
        TOKEN_DELIMITERS = aVar.l("\t ,=");
    }

    @k(level = m.ERROR, message = "No longer supported", replaceWith = @b1(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@l Response response) {
        l0.p(response, "response");
        return promisesBody(response);
    }

    @l
    public static final List<Challenge> parseChallenges(@l Headers headers, @l String headerName) {
        boolean K1;
        l0.p(headers, "<this>");
        l0.p(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            K1 = e0.K1(headerName, headers.name(i5), true);
            if (K1) {
                try {
                    readChallengeHeader(new okio.l().C(headers.value(i5)), arrayList);
                } catch (EOFException e5) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e5);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@l Response response) {
        boolean K1;
        l0.p(response, "<this>");
        if (l0.g(response.request().method(), HttpHead.METHOD_NAME)) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1) {
            K1 = e0.K1(HTTP.CHUNK_CODING, Response.header$default(response, HTTP.TRANSFER_ENCODING, null, 2, null), true);
            if (!K1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(okio.l r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.e0()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = kotlin.collections.x0.z()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.e0()
            if (r2 == 0) goto L67
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.v.e2(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.l0.o(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 != 0) goto Lba
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = readQuotedString(r7)
            goto L9f
        L9b:
            java.lang.String r6 = readToken(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.e0()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.l, java.util.List):void");
    }

    private static final String readQuotedString(okio.l lVar) throws EOFException {
        boolean z4;
        if (lVar.readByte() == 34) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            okio.l lVar2 = new okio.l();
            while (true) {
                long v4 = lVar.v(QUOTED_STRING_DELIMITERS);
                if (v4 == -1) {
                    return null;
                }
                if (lVar.P(v4) == 34) {
                    lVar2.write(lVar, v4);
                    lVar.readByte();
                    return lVar2.s0();
                }
                if (lVar.M0() == v4 + 1) {
                    return null;
                }
                lVar2.write(lVar, v4);
                lVar.readByte();
                lVar2.write(lVar, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(okio.l lVar) {
        long v4 = lVar.v(TOKEN_DELIMITERS);
        if (v4 == -1) {
            v4 = lVar.M0();
        }
        if (v4 != 0) {
            return lVar.X(v4);
        }
        return null;
    }

    public static final void receiveHeaders(@l CookieJar cookieJar, @l HttpUrl url, @l Headers headers) {
        l0.p(cookieJar, "<this>");
        l0.p(url, "url");
        l0.p(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(okio.l lVar) {
        boolean z4 = false;
        while (!lVar.e0()) {
            byte P = lVar.P(0L);
            boolean z5 = true;
            if (P == 44) {
                lVar.readByte();
                z4 = true;
            } else {
                if (P != 32 && P != 9) {
                    z5 = false;
                }
                if (!z5) {
                    break;
                }
                lVar.readByte();
            }
        }
        return z4;
    }

    private static final boolean startsWith(okio.l lVar, byte b5) {
        return !lVar.e0() && lVar.P(0L) == b5;
    }
}
