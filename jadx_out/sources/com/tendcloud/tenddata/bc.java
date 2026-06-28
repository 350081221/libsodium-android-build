package com.tendcloud.tenddata;

import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.tendcloud.tenddata.an;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bc {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11470a = "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2";

    /* renamed from: b, reason: collision with root package name */
    private static final String f11471b = "hAF3uVnSYyk2qN3trMjXFVsijBTGcR";

    /* renamed from: c, reason: collision with root package name */
    private static bc f11472c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f11473d = null;

    /* loaded from: classes3.dex */
    public enum a {
        UNSTOP(0),
        STOP(1);

        private final int index;

        a(int i5) {
            this.index = i5;
        }

        public int index() {
            return this.index;
        }
    }

    private bc() {
    }

    public void getShortUrl(final TDGenerateUrl tDGenerateUrl) {
        new Thread(new Runnable() { // from class: com.tendcloud.tenddata.bc.1
            @Override // java.lang.Runnable
            public void run() {
                InputStream inputStream;
                ByteArrayOutputStream byteArrayOutputStream;
                OutputStream outputStream;
                InputStream inputStream2 = null;
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : bc.this.f11473d.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    byte[] a5 = u.a(jSONObject.toString().getBytes());
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    URL url = new URL("https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2?sign=" + bc.this.a(jSONObject, valueOf) + "&nonce=" + valueOf);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Short url serve: ");
                    sb.append(url);
                    h.dForInternal(sb.toString());
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(15000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, an.a.UNIVERSAL_STREAM.getName());
                    httpURLConnection.setRequestProperty(HTTP.CONTENT_LEN, String.valueOf(a5.length));
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(a5);
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr, 0, read);
                                        }
                                    }
                                    byteArrayOutputStream.flush();
                                    String str = new String(u.b(byteArrayOutputStream.toByteArray()), Charset.forName("UTF-8"));
                                    h.dForInternal("TD getShortUrl success:", str);
                                    JSONObject jSONObject2 = new JSONObject(str);
                                    if (jSONObject2.getInt(PluginConstants.KEY_ERROR_CODE) != 200) {
                                        h.eForInternal("TD getShortUrl Error:", str);
                                        tDGenerateUrl.callback(null);
                                    } else {
                                        tDGenerateUrl.callback(jSONObject2.getString("result"));
                                    }
                                    inputStream2 = inputStream;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        th.printStackTrace();
                                        tDGenerateUrl.callback(null);
                                        bc.this.a(outputStream);
                                        bc.this.a(inputStream);
                                        bc.this.a(byteArrayOutputStream);
                                    } catch (Throwable th2) {
                                        bc.this.a(outputStream);
                                        bc.this.a(inputStream);
                                        bc.this.a(byteArrayOutputStream);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = null;
                            }
                        } else {
                            h.eForInternal("TD getShortUrl Http Error:" + responseCode);
                            tDGenerateUrl.callback(null);
                            byteArrayOutputStream = null;
                        }
                        bc.this.a(outputStream);
                        bc.this.a(inputStream2);
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = null;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                    byteArrayOutputStream = null;
                    outputStream = null;
                }
                bc.this.a(byteArrayOutputStream);
            }
        }).start();
    }

    public static bc a() {
        return new bc();
    }

    public bc a(Map<String, Object> map) {
        this.f11473d = map;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(JSONObject jSONObject, String str) {
        return y.c(jSONObject.get("pageUrl") + "." + jSONObject.get("shortUrl") + "." + jSONObject.get("is_retargeting") + "." + str + "." + f11471b);
    }
}
