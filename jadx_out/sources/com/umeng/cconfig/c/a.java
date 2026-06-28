package com.umeng.cconfig.c;

import android.text.TextUtils;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static HostnameVerifier f12950a;

    public static String a(String str, String str2) {
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                HttpsURLConnection b5 = b(str, str2);
                if (b5 == null || b5.getResponseCode() != 200) {
                    return null;
                }
                InputStreamReader inputStreamReader = new InputStreamReader(b5.getInputStream());
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    int read = inputStreamReader.read();
                    if (read == -1) {
                        return stringBuffer.toString();
                    }
                    stringBuffer.append((char) read);
                }
            } catch (Exception unused) {
                if (i5 == 2) {
                    return null;
                }
                try {
                    Thread.sleep(20000L);
                } catch (InterruptedException unused2) {
                }
            }
        }
        return null;
    }

    private static HttpsURLConnection b(String str, String str2) {
        HttpsURLConnection httpsURLConnection;
        HttpsURLConnection httpsURLConnection2 = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        } catch (Exception e5) {
            e = e5;
        }
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            if (f12950a == null) {
                f12950a = new HostnameVerifier() { // from class: com.umeng.cconfig.c.a.1
                    @Override // javax.net.ssl.HostnameVerifier
                    public final boolean verify(String str3, SSLSession sSLSession) {
                        if (TextUtils.isEmpty(str3)) {
                            return false;
                        }
                        return "ucc.umeng.com".equalsIgnoreCase(str3) || "pslog.umeng.com".equalsIgnoreCase(str3);
                    }
                };
            }
            httpsURLConnection.setHostnameVerifier(f12950a);
            httpsURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setReadTimeout(15000);
            httpsURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, "application/json");
            httpsURLConnection.connect();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(str2.getBytes());
            outputStream.flush();
            outputStream.close();
            return httpsURLConnection;
        } catch (Exception e6) {
            e = e6;
            httpsURLConnection2 = httpsURLConnection;
            e.printStackTrace();
            return httpsURLConnection2;
        }
    }
}
