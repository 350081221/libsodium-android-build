package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.Protocol;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/platform/android/SocketAdapter;", "", "", "isSupported", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "matchesSocketFactory", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lkotlin/r2;", "configureTlsExtensions", "getSelectedProtocol", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface SocketAdapter {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(@l SocketAdapter socketAdapter, @l SSLSocketFactory sslSocketFactory) {
            l0.p(sslSocketFactory, "sslSocketFactory");
            return false;
        }

        @m
        public static X509TrustManager trustManager(@l SocketAdapter socketAdapter, @l SSLSocketFactory sslSocketFactory) {
            l0.p(sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    void configureTlsExtensions(@l SSLSocket sSLSocket, @m String str, @l List<? extends Protocol> list);

    @m
    String getSelectedProtocol(@l SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(@l SSLSocket sSLSocket);

    boolean matchesSocketFactory(@l SSLSocketFactory sSLSocketFactory);

    @m
    X509TrustManager trustManager(@l SSLSocketFactory sSLSocketFactory);
}
