package i2;

import com.huawei.secure.android.common.ssl.util.i;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public class b implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            i.b("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            d.a(str, x509Certificate, true);
            return true;
        } catch (SSLException e5) {
            i.d("", "SSLException : " + e5.getMessage());
            return false;
        }
    }
}
