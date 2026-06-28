package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0017J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lkotlin/r2;", "configureTlsExtensions", "getSelectedProtocol", "", "isCleartextTrafficPermitted", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketAdapters", "Ljava/util/List;", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@SuppressSignatureCheck
@r1({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
/* loaded from: classes4.dex */
public final class Android10Platform extends Platform {

    @l
    public static final Companion Companion = new Companion(null);
    private static final boolean isSupported;

    @l
    private final List<SocketAdapter> socketAdapters;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @m
        public final Platform buildIfSupported() {
            if (isSupported()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean isSupported() {
            return Android10Platform.isSupported;
        }
    }

    static {
        boolean z4;
        if (Platform.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29) {
            z4 = true;
        } else {
            z4 = false;
        }
        isSupported = z4;
    }

    public Android10Platform() {
        List N;
        N = kotlin.collections.w.N(Android10SocketAdapter.Companion.buildIfSupported(), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : N) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    @l
    public CertificateChainCleaner buildCertificateChainCleaner(@l X509TrustManager trustManager) {
        l0.p(trustManager, "trustManager");
        AndroidCertificateChainCleaner buildIfSupported = AndroidCertificateChainCleaner.Companion.buildIfSupported(trustManager);
        if (buildIfSupported == null) {
            return super.buildCertificateChainCleaner(trustManager);
        }
        return buildIfSupported;
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@l SSLSocket sslSocket, @m String str, @l List<? extends Protocol> protocols) {
        Object obj;
        l0.p(sslSocket, "sslSocket");
        l0.p(protocols, "protocols");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sslSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.configureTlsExtensions(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    @m
    public String getSelectedProtocol(@l SSLSocket sslSocket) {
        Object obj;
        l0.p(sslSocket, "sslSocket");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocket(sslSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.getSelectedProtocol(sslSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressLint({"NewApi"})
    public boolean isCleartextTrafficPermitted(@l String hostname) {
        l0.p(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    @m
    public X509TrustManager trustManager(@l SSLSocketFactory sslSocketFactory) {
        Object obj;
        l0.p(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((SocketAdapter) obj).matchesSocketFactory(sslSocketFactory)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.trustManager(sslSocketFactory);
    }
}
