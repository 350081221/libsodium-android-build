package w1;

import android.content.Context;
import com.huawei.secure.android.common.ssl.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

@Deprecated
/* loaded from: classes3.dex */
public class c extends SSLSocketFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final X509HostnameVerifier f22612c = new BrowserCompatHostnameVerifier();

    /* renamed from: d, reason: collision with root package name */
    public static final X509HostnameVerifier f22613d = new StrictHostnameVerifier();

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f22614e = null;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f22615a;

    /* renamed from: b, reason: collision with root package name */
    private Context f22616b;

    private c(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
    }

    private void a(Socket socket2) {
        SSLSocket sSLSocket = (SSLSocket) socket2;
        f.g(sSLSocket);
        f.f(sSLSocket);
    }

    @Deprecated
    public static c b(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalAccessException {
        if (f22614e == null) {
            synchronized (c.class) {
                if (f22614e == null) {
                    f22614e = new c(keyStore, context);
                }
            }
        }
        return f22614e;
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
        Socket createSocket = this.f22615a.getSocketFactory().createSocket(socket2, str, i5, z4);
        a(createSocket);
        return createSocket;
    }

    private c(KeyStore keyStore, Context context) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException, IllegalAccessException {
        super(keyStore);
        this.f22616b = context;
        this.f22615a = f.i();
        this.f22615a.init(null, new X509TrustManager[]{new e(this.f22616b)}, null);
    }

    @Override // org.apache.http.conn.ssl.SSLSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() throws IOException {
        Socket createSocket = this.f22615a.getSocketFactory().createSocket();
        a(createSocket);
        return createSocket;
    }

    @Deprecated
    public c(KeyStore keyStore, InputStream inputStream, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException, CertificateException, IOException {
        super(keyStore);
        this.f22615a = f.i();
        this.f22615a.init(null, new X509TrustManager[]{new a(inputStream, str)}, null);
    }
}
