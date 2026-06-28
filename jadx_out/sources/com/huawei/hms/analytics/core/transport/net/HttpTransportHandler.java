package com.huawei.hms.analytics.core.transport.net;

import android.content.Context;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.transport.CallbackListener;
import com.huawei.hms.analytics.core.transport.ITransportHandler;
import com.huawei.secure.android.common.ssl.i;
import com.lody.virtual.server.pm.installer.PackageHelper;
import i2.b;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class HttpTransportHandler implements ITransportHandler {
    private static final int RECONNECTION_TIMES = 3;
    private static final String TAG = "HttpTransportCommander";
    private String[] collectURLs;
    private HttpURLConnection connection;
    private Context context;
    private Map<String, String> headers;
    private byte[] reportData;
    private String requestMethod;

    private void closeConnection() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    private void createConnection(String str) {
        this.connection = (HttpURLConnection) new URL(str).openConnection();
        setHttpsConn();
        this.connection.setRequestMethod(this.requestMethod);
        this.connection.setConnectTimeout(15000);
        this.connection.setReadTimeout(15000);
        if (HttpPost.METHOD_NAME.equals(this.requestMethod)) {
            this.connection.setDoOutput(true);
        }
        this.connection.setRequestProperty(HTTP.CONTENT_TYPE, "application/json; charset=UTF-8");
        byte[] bArr = this.reportData;
        this.connection.setRequestProperty(HTTP.CONTENT_LEN, String.valueOf(bArr == null ? 0 : bArr.length));
        this.connection.setRequestProperty(HTTP.CONN_DIRECTIVE, ILivePush.ClickType.CLOSE);
        Map<String, String> map = this.headers;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            String key = entry.getKey();
            if (key != null && !key.isEmpty()) {
                this.connection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
            }
        }
    }

    private Response handlerException(Exception exc) {
        String str;
        if (exc instanceof SecurityException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE003, "No Permission：INTERNET.");
            return new Response(-101, "");
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE002, "Certificate has not been verified,Request is restricted!");
            return new Response(PackageHelper.INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME, "");
        }
        if (exc instanceof SSLHandshakeException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE002, "SSL Handshake Exception : " + exc.getMessage());
            return new Response(PackageHelper.INSTALL_PARSE_FAILED_MANIFEST_EMPTY, "");
        }
        if (exc instanceof ConnectException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE005, "Network is unreachable or Connection refused");
            return new Response(PackageHelper.INSTALL_PARSE_FAILED_NO_CERTIFICATES, "");
        }
        if (exc instanceof UnknownHostException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE006, "Invalid URL.No address associated with hostname");
            return new Response(PackageHelper.INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES, "");
        }
        if (exc instanceof IOException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE004, "post request IO Exception.");
            return new Response(PackageHelper.INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION, "");
        }
        if (exc instanceof com.huawei.hms.analytics.core.transport.a.a) {
            HiLog.e(TAG, HiLog.ErrorCode.NE001, "SSLConfigException:" + exc.getMessage());
            return new Response(PackageHelper.INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING, "");
        }
        if (exc instanceof IllegalAccessException) {
            str = exc.getMessage();
        } else {
            str = "other exception: " + exc.getMessage();
        }
        HiLog.e(TAG, str);
        return new Response(PackageHelper.INSTALL_PARSE_FAILED_MANIFEST_MALFORMED, "");
    }

    private Response post(String str) {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        OutputStream outputStream;
        createConnection(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            byte[] bArr = this.reportData;
            if (bArr == null || bArr.length <= 0) {
                HiLog.i(TAG, "report data is empty");
                outputStream = null;
            } else {
                outputStream = this.connection.getOutputStream();
                try {
                    bufferedOutputStream = new BufferedOutputStream(outputStream);
                    try {
                        bufferedOutputStream.write(this.reportData);
                        bufferedOutputStream.flush();
                        bufferedOutputStream2 = bufferedOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        a.a(bufferedOutputStream);
                        a.a(outputStream);
                        closeConnection();
                        throw th;
                    }
                } catch (Throwable th3) {
                    bufferedOutputStream = bufferedOutputStream2;
                    th = th3;
                }
            }
            Response response = new Response(this.connection.getResponseCode(), readResponse());
            a.a(bufferedOutputStream2);
            a.a(outputStream);
            closeConnection();
            return response;
        } catch (Throwable th4) {
            bufferedOutputStream = null;
            th = th4;
            outputStream = null;
        }
    }

    private String readResponse() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                inputStream = this.connection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException unused) {
                }
            } catch (Throwable th2) {
                byteArrayOutputStream = null;
                th = th2;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream3 = byteArrayOutputStream.toString("UTF-8");
                        a.a(byteArrayOutputStream);
                        a.a(inputStream);
                        return byteArrayOutputStream3;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } catch (IOException unused2) {
                byteArrayOutputStream2 = byteArrayOutputStream;
                HiLog.e(TAG, "stream read IOException!");
                a.a(byteArrayOutputStream2);
                a.a(inputStream);
                return "";
            } catch (Throwable th3) {
                th = th3;
                a.a(byteArrayOutputStream);
                a.a(inputStream);
                throw th;
            }
        } catch (IOException unused3) {
            inputStream = null;
        } catch (Throwable th4) {
            byteArrayOutputStream = null;
            th = th4;
            inputStream = null;
        }
    }

    private Response reconnection(String str) {
        Response response = new Response(PackageHelper.INSTALL_PARSE_FAILED_MANIFEST_MALFORMED, "");
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                return post(str);
            } catch (Exception e5) {
                response = handlerException(e5);
                if (response.getHttpCode() != -104) {
                    return response;
                }
            }
        }
        return response;
    }

    private void setHttpsConn() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            try {
                httpsURLConnection.setSSLSocketFactory(i.e(this.context));
                httpsURLConnection.setHostnameVerifier(new b());
            } catch (Exception unused) {
                throw new com.huawei.hms.analytics.core.transport.a.a("No ssl socket factory set");
            }
        }
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public Response execute() {
        String[] strArr = this.collectURLs;
        if (strArr == null || strArr.length == 0) {
            HiLog.e(TAG, "collectUrls is empty");
            return new Response(-100, "");
        }
        int i5 = 0;
        Response response = null;
        while (true) {
            if (response == null || (response.getHttpCode() == -104 && i5 < this.collectURLs.length)) {
                response = reconnection(this.collectURLs[i5]);
                i5++;
                HiLog.d(TAG, "request times: ".concat(String.valueOf(i5)));
            }
        }
        return response;
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void execute(final CallbackListener callbackListener) {
        new Thread(new Runnable() { // from class: com.huawei.hms.analytics.core.transport.net.HttpTransportHandler.1
            @Override // java.lang.Runnable
            public final void run() {
                if (callbackListener != null) {
                    Response execute = HttpTransportHandler.this.execute();
                    if (200 != execute.getHttpCode()) {
                        callbackListener.onFailure(execute.getHttpCode());
                    } else {
                        callbackListener.onSuccess(execute);
                    }
                }
            }
        }).start();
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void setContext(Context context) {
        this.context = context;
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void setHttpHeaders(Map<String, String> map) {
        this.headers = map;
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void setReportData(String str) {
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void setReportData(byte[] bArr) {
        this.reportData = bArr != null ? (byte[]) bArr.clone() : new byte[0];
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void setRequestMethod(String str) {
        this.requestMethod = str;
    }

    @Override // com.huawei.hms.analytics.core.transport.ITransportHandler
    public void setUrls(String[] strArr) {
        this.collectURLs = strArr != null ? (String[]) strArr.clone() : null;
    }
}
