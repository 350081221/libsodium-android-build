package com.bytedance.sdk.openadsdk.api.plugin.b;

import a1.i;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public class c {

    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f4844a = new c();
    }

    public static c a() {
        return a.f4844a;
    }

    private X509TrustManager b() throws IOException {
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
            throw new IOException("No System TLS", e5);
        }
    }

    private c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(boolean r4, java.lang.String r5, byte[] r6) {
        /*
            r3 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            javax.net.ssl.X509TrustManager r5 = r3.b()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            javax.net.ssl.SSLSocketFactory r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.net.URLConnection r5 = r1.openConnection()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r1 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            com.bytedance.sdk.openadsdk.api.plugin.b.a r1 = com.bytedance.sdk.openadsdk.api.plugin.b.a.f4835a     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r5.setHostnameVerifier(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            if (r4 == 0) goto L48
            if (r6 == 0) goto L48
            int r4 = r6.length     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            if (r4 == 0) goto L48
            r4 = 1
            r5.setDoOutput(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            int r4 = r6.length     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r5.setFixedLengthStreamingMode(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            java.io.OutputStream r1 = r5.getOutputStream()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r4.<init>(r1)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r4.write(r6)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r4.flush()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r4.close()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            java.lang.String r4 = "POST"
            r5.setRequestMethod(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            goto L4d
        L48:
            java.lang.String r4 = "GET"
            r5.setRequestMethod(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
        L4d:
            int r4 = r5.getResponseCode()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 < r6) goto L79
            r6 = 300(0x12c, float:4.2E-43)
            if (r4 >= r6) goto L79
            java.lang.String r4 = "Content-Type"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            java.lang.String r6 = "utf-8"
            java.lang.String r4 = a(r4, r6)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            java.io.InputStream r1 = r5.getInputStream()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r1 = a(r1, r2)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r6.<init>(r1, r4)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8a
            r5.disconnect()     // Catch: java.lang.Exception -> L78
        L78:
            return r6
        L79:
            r5.disconnect()     // Catch: java.lang.Exception -> L89
            goto L89
        L7d:
            r4 = move-exception
            goto L83
        L7f:
            r4 = move-exception
            goto L8c
        L81:
            r4 = move-exception
            r5 = r0
        L83:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L89
            goto L79
        L89:
            return r0
        L8a:
            r4 = move-exception
            r0 = r5
        L8c:
            if (r0 == 0) goto L91
            r0.disconnect()     // Catch: java.lang.Exception -> L91
        L91:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.api.plugin.b.c.a(boolean, java.lang.String, byte[]):java.lang.String");
    }

    private static byte[] a(InputStream inputStream, int i5) throws IOException {
        if (inputStream == null) {
            return null;
        }
        if (i5 < 1) {
            i5 = 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i5];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static String a(String str, String str2) {
        if (str != null) {
            String[] split = str.split(i.f136b, 0);
            for (int i5 = 1; i5 < split.length; i5++) {
                String[] split2 = split[i5].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str2;
    }

    private SSLSocketFactory a(X509TrustManager x509TrustManager) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e5) {
            throw new IOException("No System TLS", e5);
        }
    }
}
