package w1;

import android.content.Context;
import com.huawei.secure.android.common.ssl.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

@Deprecated
/* loaded from: classes3.dex */
public class d extends SSLSocketFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final X509HostnameVerifier f22617c = new BrowserCompatHostnameVerifier();

    /* renamed from: d, reason: collision with root package name */
    public static final X509HostnameVerifier f22618d = new StrictHostnameVerifier();

    /* renamed from: e, reason: collision with root package name */
    private static volatile d f22619e = null;

    /* renamed from: a, reason: collision with root package name */
    private SSLContext f22620a;

    /* renamed from: b, reason: collision with root package name */
    private Context f22621b;

    private d(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalAccessException {
        this.f22620a = null;
        this.f22621b = context;
        this.f22620a = f.i();
        this.f22620a.init(null, new X509TrustManager[]{new e(this.f22621b)}, null);
    }

    private void a(Socket socket2) {
        SSLSocket sSLSocket = (SSLSocket) socket2;
        f.g(sSLSocket);
        f.f(sSLSocket);
    }

    @Deprecated
    public static d b(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException {
        if (f22619e == null) {
            synchronized (d.class) {
                if (f22619e == null) {
                    f22619e = new d(context);
                }
            }
        }
        return f22619e;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5) throws IOException, UnknownHostException {
        Socket createSocket = this.f22620a.getSocketFactory().createSocket(str, i5);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i5, InetAddress inetAddress, int i6) throws IOException, UnknownHostException {
        return createSocket(str, i5);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i5, InetAddress inetAddress2, int i6) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i5);
    }

    @Deprecated
    public d(InputStream inputStream, String str) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException {
        this.f22620a = null;
        this.f22620a = f.i();
        this.f22620a.init(null, new X509TrustManager[]{new a(inputStream, str)}, null);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket2, String str, int i5, boolean z4) throws IOException {
        Socket createSocket = this.f22620a.getSocketFactory().createSocket(socket2, str, i5, z4);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
        }
        return createSocket;
    }
}
