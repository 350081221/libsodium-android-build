package okhttp3.internal.platform;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import p4.l;
import p4.m;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006H\u0017J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lu3/n;", "protocols", "Lkotlin/r2;", "configureTlsExtensions", "getSelectedProtocol", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
/* loaded from: classes4.dex */
public class Jdk9Platform extends Platform {

    @l
    public static final Companion Companion = new Companion(0 == true ? 1 : 0);
    private static final boolean isAvailable;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/Jdk9Platform$Companion;", "", "()V", "isAvailable", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Jdk9Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @m
        public final Jdk9Platform buildIfSupported() {
            if (isAvailable()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean isAvailable() {
            return Jdk9Platform.isAvailable;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1.intValue() >= 9) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        /*
            okhttp3.internal.platform.Jdk9Platform$Companion r0 = new okhttp3.internal.platform.Jdk9Platform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk9Platform.Companion = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = kotlin.text.v.X0(r0)
        L14:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L21
            goto L2c
        L21:
            r0 = r2
            goto L2c
        L23:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
        L2c:
            okhttp3.internal.platform.Jdk9Platform.isAvailable = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Jdk9Platform.<clinit>():void");
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void configureTlsExtensions(@l SSLSocket sslSocket, @m String str, @l List<Protocol> protocols) {
        l0.p(sslSocket, "sslSocket");
        l0.p(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.alpnProtocolNames(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    @m
    public String getSelectedProtocol(@l SSLSocket sslSocket) {
        String applicationProtocol;
        boolean g5;
        l0.p(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                g5 = true;
            } else {
                g5 = l0.g(applicationProtocol, "");
            }
            if (g5) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sslSocketFactory) {
        l0.p(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
