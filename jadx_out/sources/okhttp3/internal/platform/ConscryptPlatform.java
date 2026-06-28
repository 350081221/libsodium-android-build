package okhttp3.internal.platform;

import com.umeng.analytics.pro.d;
import java.security.KeyStore;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/platform/ConscryptPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lu3/n;", "protocols", "Lkotlin/r2;", "configureTlsExtensions", "getSelectedProtocol", "newSslSocketFactory", "Ljava/security/Provider;", "provider", "Ljava/security/Provider;", "<init>", "()V", "Companion", "DisabledHostnameVerifier", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
/* loaded from: classes4.dex */
public final class ConscryptPlatform extends Platform {

    @l
    public static final Companion Companion;
    private static final boolean isSupported;

    @l
    private final Provider provider;

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/ConscryptPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "atLeastVersion", "major", "", "minor", "patch", "buildIfSupported", "Lokhttp3/internal/platform/ConscryptPlatform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ boolean atLeastVersion$default(Companion companion, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                i6 = 0;
            }
            if ((i8 & 4) != 0) {
                i7 = 0;
            }
            return companion.atLeastVersion(i5, i6, i7);
        }

        public final boolean atLeastVersion(int i5, int i6, int i7) {
            Conscrypt.Version version = Conscrypt.version();
            if (version.major() != i5) {
                if (version.major() > i5) {
                    return true;
                }
                return false;
            }
            if (version.minor() != i6) {
                if (version.minor() > i6) {
                    return true;
                }
                return false;
            }
            if (version.patch() >= i7) {
                return true;
            }
            return false;
        }

        @m
        public final ConscryptPlatform buildIfSupported() {
            w wVar = null;
            if (isSupported()) {
                return new ConscryptPlatform(wVar);
            }
            return null;
        }

        public final boolean isSupported() {
            return ConscryptPlatform.isSupported;
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/internal/platform/ConscryptPlatform$DisabledHostnameVerifier;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "()V", "verify", "", "certs", "", "Ljava/security/cert/X509Certificate;", "hostname", "", d.aC, "Ljavax/net/ssl/SSLSession;", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {

        @l
        public static final DisabledHostnameVerifier INSTANCE = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }

        public final boolean verify(@m String str, @m SSLSession sSLSession) {
            return true;
        }

        public boolean verify(@m X509Certificate[] x509CertificateArr, @m String str, @m SSLSession sSLSession) {
            return true;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        boolean z4 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.atLeastVersion(2, 1, 0)) {
                    z4 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        isSupported = z4;
    }

    private ConscryptPlatform() {
        Provider newProvider = Conscrypt.newProvider();
        l0.o(newProvider, "newProvider()");
        this.provider = newProvider;
    }

    public /* synthetic */ ConscryptPlatform(w wVar) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@l SSLSocket sslSocket, @m String str, @l List<Protocol> protocols) {
        l0.p(sslSocket, "sslSocket");
        l0.p(protocols, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) Platform.Companion.alpnProtocolNames(protocols).toArray(new String[0]));
        } else {
            super.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @m
    public String getSelectedProtocol(@l SSLSocket sslSocket) {
        l0.p(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return super.getSelectedProtocol(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    @l
    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        l0.o(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    @l
    public SSLSocketFactory newSslSocketFactory(@l X509TrustManager trustManager) {
        l0.p(trustManager, "trustManager");
        SSLContext newSSLContext = newSSLContext();
        newSSLContext.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
        l0.o(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.Platform
    @l
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        l0.m(trustManagers);
        boolean z4 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z4 = false;
        }
        if (z4) {
            TrustManager trustManager = trustManagers[0];
            l0.n(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.INSTANCE);
            return x509TrustManager;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        l0.o(arrays, "toString(this)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, "sslSocketFactory");
        return null;
    }
}
