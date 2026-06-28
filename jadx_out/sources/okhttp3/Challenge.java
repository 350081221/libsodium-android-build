package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.b1;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.m;
import p4.l;
import u3.h;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR!\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0019"}, d2 = {"Lokhttp3/Challenge;", "", "scheme", "", "realm", "(Ljava/lang/String;Ljava/lang/String;)V", "authParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "()Ljava/util/Map;", "charset", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "()Ljava/lang/String;", "-deprecated_authParams", "-deprecated_charset", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "-deprecated_realm", "-deprecated_scheme", "toString", "withCharset", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Challenge {

    @l
    private final Map<String, String> authParams;

    @l
    private final String scheme;

    public Challenge(@l String scheme, @l Map<String, String> authParams) {
        String str;
        l0.p(scheme, "scheme");
        l0.p(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                l0.o(US, "US");
                str = key.toLowerCase(US);
                l0.o(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l0.o(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = unmodifiableMap;
    }

    @l
    @h(name = "-deprecated_authParams")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "authParams", imports = {}))
    /* renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m6479deprecated_authParams() {
        return this.authParams;
    }

    @l
    @h(name = "-deprecated_charset")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "charset", imports = {}))
    /* renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m6480deprecated_charset() {
        return charset();
    }

    @h(name = "-deprecated_realm")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "realm", imports = {}))
    @p4.m
    /* renamed from: -deprecated_realm, reason: not valid java name */
    public final String m6481deprecated_realm() {
        return realm();
    }

    @l
    @h(name = "-deprecated_scheme")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "scheme", imports = {}))
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m6482deprecated_scheme() {
        return this.scheme;
    }

    @l
    @h(name = "authParams")
    public final Map<String, String> authParams() {
        return this.authParams;
    }

    @l
    @h(name = "charset")
    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                l0.o(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        l0.o(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (l0.g(challenge.scheme, this.scheme) && l0.g(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @h(name = "realm")
    @p4.m
    public final String realm() {
        return this.authParams.get("realm");
    }

    @l
    @h(name = "scheme")
    public final String scheme() {
        return this.scheme;
    }

    @l
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    @l
    public final Challenge withCharset(@l Charset charset) {
        Map J0;
        l0.p(charset, "charset");
        J0 = a1.J0(this.authParams);
        String name = charset.name();
        l0.o(name, "charset.name()");
        J0.put("charset", name);
        return new Challenge(this.scheme, (Map<String, String>) J0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Challenge(@p4.l java.lang.String r2, @p4.l java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "realm"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r0 = "singletonMap(\"realm\", realm)"
            kotlin.jvm.internal.l0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Challenge.<init>(java.lang.String, java.lang.String):void");
    }
}
