package m1;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: m1.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0622a {
        void a(int i5, String str);

        void a(String str);
    }

    private static StringBuilder a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(str3);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Length: ");
        sb.append(str2.length());
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append(str2);
        sb.append("\r\n");
        return sb;
    }

    private static SSLSocketFactory b(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e5) {
            throw new RuntimeException("No System TLS", e5);
        }
    }

    private static X509TrustManager c() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e5) {
            Log.e("TT_TOOLS", "", e5);
            return null;
        }
    }

    private void f(HttpURLConnection httpURLConnection, InterfaceC0622a interfaceC0622a) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            } else {
                sb.append(readLine);
            }
        }
        if (responseCode == 200) {
            if (interfaceC0622a != null) {
                interfaceC0622a.a(sb.toString());
                return;
            } else {
                Log.d("TT_TOOLS", sb.toString());
                return;
            }
        }
        if (interfaceC0622a != null) {
            interfaceC0622a.a(responseCode, sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.io.File r9, java.lang.String r10, m1.a.InterfaceC0622a r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.d(java.io.File, java.lang.String, m1.a$a):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r5 == 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [m1.a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.net.URLConnection r5 = r1.openConnection()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5d
            java.lang.String r1 = "POST"
            r5.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1 = 20000(0x4e20, float:2.8026E-41)
            r5.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1 = 1
            r5.setDoOutput(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r5.setDoInput(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1 = 0
            r5.setUseCaches(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json; charset=utf-8"
            r5.setRequestProperty(r1, r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            javax.net.ssl.X509TrustManager r1 = c()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            javax.net.ssl.SSLSocketFactory r1 = b(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r5.setSSLSocketFactory(r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r5.connect()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            java.io.OutputStream r2 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L56
            r1.writeBytes(r6)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L74
            r1.flush()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L74
            r1.close()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L74
            r4.f(r5, r0)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L74
            goto L6a
        L51:
            r6 = move-exception
            goto L60
        L53:
            r6 = move-exception
            r1 = r0
            goto L75
        L56:
            r6 = move-exception
            r1 = r0
            goto L60
        L59:
            r6 = move-exception
            r5 = r0
            r1 = r5
            goto L75
        L5d:
            r6 = move-exception
            r5 = r0
            r1 = r5
        L60:
            java.lang.String r2 = "TT_TOOLS"
            java.lang.String r3 = "upload event error"
            android.util.Log.e(r2, r3, r6)     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L6d
        L6a:
            r5.disconnect()
        L6d:
            com.bytedance.tools.d.f.b(r0)
            com.bytedance.tools.d.f.b(r1)
            return
        L74:
            r6 = move-exception
        L75:
            if (r5 == 0) goto L7a
            r5.disconnect()
        L7a:
            com.bytedance.tools.d.f.b(r0)
            com.bytedance.tools.d.f.b(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.e(java.lang.String, java.lang.String):void");
    }
}
