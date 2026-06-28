package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.comparisons.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.internal.Util;
import p4.l;
import p4.m;
import u3.e;
import u3.h;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0002'&B9\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 \u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 ¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\u001e\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n¨\u0006("}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "supportedSpec", "", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuites", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersions", "tlsVersions", "-deprecated_supportsTlsExtensions", "()Z", "supportsTlsExtensions", "Lkotlin/r2;", "apply$okhttp", "(Ljavax/net/ssl/SSLSocket;Z)V", "apply", "socket", "isCompatible", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "isTls", "Z", "", "cipherSuitesAsString", "[Ljava/lang/String;", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,350:1\n11065#2:351\n11400#2,3:352\n11065#2:355\n11400#2,3:356\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec\n*L\n59#1:351\n59#1:352,3\n75#1:355\n75#1:356,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ConnectionSpec {

    @l
    private static final CipherSuite[] APPROVED_CIPHER_SUITES;

    @l
    @e
    public static final ConnectionSpec CLEARTEXT;

    @l
    @e
    public static final ConnectionSpec COMPATIBLE_TLS;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final ConnectionSpec MODERN_TLS;

    @l
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;

    @l
    @e
    public static final ConnectionSpec RESTRICTED_TLS;

    @m
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;

    @m
    private final String[] tlsVersionsAsString;

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
        CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = cipherSuiteArr2;
        Builder cipherSuites = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        RESTRICTED_TLS = cipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        MODERN_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new Builder(false).build();
    }

    public ConnectionSpec(boolean z4, boolean z5, @m String[] strArr, @m String[] strArr2) {
        this.isTls = z4;
        this.supportsTlsExtensions = z5;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final ConnectionSpec supportedSpec(SSLSocket sSLSocket, boolean z4) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Comparator q5;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            l0.o(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.intersect(enabledCipherSuites, this.cipherSuitesAsString, CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            l0.o(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr = this.tlsVersionsAsString;
            q5 = g.q();
            tlsVersionsIntersection = Util.intersect(enabledProtocols, strArr, q5);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        l0.o(supportedCipherSuites, "supportedCipherSuites");
        int indexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.Companion.getORDER_BY_NAME$okhttp());
        if (z4 && indexOf != -1) {
            l0.o(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[indexOf];
            l0.o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.concat(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        l0.o(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder cipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        l0.o(tlsVersionsIntersection, "tlsVersionsIntersection");
        return cipherSuites.tlsVersions((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).build();
    }

    @h(name = "-deprecated_cipherSuites")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cipherSuites", imports = {}))
    @m
    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final List<CipherSuite> m6484deprecated_cipherSuites() {
        return cipherSuites();
    }

    @h(name = "-deprecated_supportsTlsExtensions")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "supportsTlsExtensions", imports = {}))
    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m6485deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @h(name = "-deprecated_tlsVersions")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "tlsVersions", imports = {}))
    @m
    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final List<TlsVersion> m6486deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(@l SSLSocket sslSocket, boolean z4) {
        l0.p(sslSocket, "sslSocket");
        ConnectionSpec supportedSpec = supportedSpec(sslSocket, z4);
        if (supportedSpec.tlsVersions() != null) {
            sslSocket.setEnabledProtocols(supportedSpec.tlsVersionsAsString);
        }
        if (supportedSpec.cipherSuites() != null) {
            sslSocket.setEnabledCipherSuites(supportedSpec.cipherSuitesAsString);
        }
    }

    @h(name = "cipherSuites")
    @m
    public final List<CipherSuite> cipherSuites() {
        List<CipherSuite> S5;
        String[] strArr = this.cipherSuitesAsString;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(CipherSuite.Companion.forJavaName(str));
            }
            S5 = e0.S5(arrayList);
            return S5;
        }
        return null;
    }

    public boolean equals(@m Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z4 = this.isTls;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z4 != connectionSpec.isTls) {
            return false;
        }
        if (z4 && (!Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) || !Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) || this.supportsTlsExtensions != connectionSpec.supportsTlsExtensions)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i5;
        if (this.isTls) {
            String[] strArr = this.cipherSuitesAsString;
            int i6 = 0;
            if (strArr != null) {
                i5 = Arrays.hashCode(strArr);
            } else {
                i5 = 0;
            }
            int i7 = (527 + i5) * 31;
            String[] strArr2 = this.tlsVersionsAsString;
            if (strArr2 != null) {
                i6 = Arrays.hashCode(strArr2);
            }
            return ((i7 + i6) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
        }
        return 17;
    }

    public final boolean isCompatible(@l SSLSocket socket2) {
        Comparator q5;
        l0.p(socket2, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null) {
            String[] enabledProtocols = socket2.getEnabledProtocols();
            q5 = g.q();
            if (!Util.hasIntersection(strArr, enabledProtocols, q5)) {
                return false;
            }
        }
        String[] strArr2 = this.cipherSuitesAsString;
        if (strArr2 != null && !Util.hasIntersection(strArr2, socket2.getEnabledCipherSuites(), CipherSuite.Companion.getORDER_BY_NAME$okhttp())) {
            return false;
        }
        return true;
    }

    @h(name = "isTls")
    public final boolean isTls() {
        return this.isTls;
    }

    @h(name = "supportsTlsExtensions")
    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @h(name = "tlsVersions")
    @m
    public final List<TlsVersion> tlsVersions() {
        List<TlsVersion> S5;
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(TlsVersion.Companion.forJavaName(str));
            }
            S5 = e0.S5(arrayList);
            return S5;
        }
        return null;
    }

    @l
    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\t\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007J\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\t\"\u00020\u001f¢\u0006\u0002\u0010 R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0004R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006!"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "tls", "", "(Z)V", "connectionSpec", "Lokhttp3/ConnectionSpec;", "(Lokhttp3/ConnectionSpec;)V", "cipherSuites", "", "", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "supportsTlsExtensions", "getSupportsTlsExtensions$okhttp", "()Z", "setSupportsTlsExtensions$okhttp", "getTls$okhttp", "setTls$okhttp", "tlsVersions", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "allEnabledCipherSuites", "allEnabledTlsVersions", "build", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/CipherSuite;", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/TlsVersion;", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nConnectionSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,350:1\n1#2:351\n11065#3:352\n11400#3,3:353\n11065#3:358\n11400#3,3:359\n37#4,2:356\n37#4,2:362\n*S KotlinDebug\n*F\n+ 1 ConnectionSpec.kt\nokhttp3/ConnectionSpec$Builder\n*L\n225#1:352\n225#1:353,3\n244#1:358\n244#1:359,3\n225#1:356,2\n244#1:362,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {

        @m
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;

        @m
        private String[] tlsVersions;

        public Builder(boolean z4) {
            this.tls = z4;
        }

        @l
        public final Builder allEnabledCipherSuites() {
            if (this.tls) {
                this.cipherSuites = null;
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @l
        public final Builder allEnabledTlsVersions() {
            if (this.tls) {
                this.tlsVersions = null;
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @l
        public final ConnectionSpec build() {
            return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @l
        public final Builder cipherSuites(@l CipherSuite... cipherSuites) {
            l0.p(cipherSuites, "cipherSuites");
            if (this.tls) {
                ArrayList arrayList = new ArrayList(cipherSuites.length);
                for (CipherSuite cipherSuite : cipherSuites) {
                    arrayList.add(cipherSuite.javaName());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @m
        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        @m
        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(@m String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z4) {
            this.supportsTlsExtensions = z4;
        }

        public final void setTls$okhttp(boolean z4) {
            this.tls = z4;
        }

        public final void setTlsVersions$okhttp(@m String[] strArr) {
            this.tlsVersions = strArr;
        }

        @l
        @k(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final Builder supportsTlsExtensions(boolean z4) {
            if (this.tls) {
                this.supportsTlsExtensions = z4;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @l
        public final Builder tlsVersions(@l TlsVersion... tlsVersions) {
            l0.p(tlsVersions, "tlsVersions");
            if (this.tls) {
                ArrayList arrayList = new ArrayList(tlsVersions.length);
                for (TlsVersion tlsVersion : tlsVersions) {
                    arrayList.add(tlsVersion.javaName());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public Builder(@l ConnectionSpec connectionSpec) {
            l0.p(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.isTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
        }

        @l
        public final Builder cipherSuites(@l String... cipherSuites) {
            l0.p(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(cipherSuites.length == 0)) {
                this.cipherSuites = (String[]) cipherSuites.clone();
                return this;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }

        @l
        public final Builder tlsVersions(@l String... tlsVersions) {
            l0.p(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(tlsVersions.length == 0)) {
                this.tlsVersions = (String[]) tlsVersions.clone();
                return this;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
    }
}
