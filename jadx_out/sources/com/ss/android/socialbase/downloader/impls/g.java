package com.ss.android.socialbase.downloader.impls;

import android.net.Uri;
import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.http.protocol.HTTP;

@Instrumented
/* loaded from: classes3.dex */
public class g implements IDownloadHttpService {

    /* renamed from: a, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.i.h<String, OkHttpClient> f11014a = new com.ss.android.socialbase.downloader.i.h<>(4, 8);

    private OkHttpClient a(String str, final String str2) {
        try {
            final String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(str2)) {
                String str3 = host + "_" + str2;
                synchronized (this.f11014a) {
                    OkHttpClient okHttpClient = this.f11014a.get(str3);
                    if (okHttpClient != null) {
                        return okHttpClient;
                    }
                    OkHttpClient.Builder u4 = com.ss.android.socialbase.downloader.downloader.c.u();
                    u4.dns(new Dns() { // from class: com.ss.android.socialbase.downloader.impls.g.2
                    });
                    OkHttpClient build = OkHttp3Instrumentation.build(u4);
                    synchronized (this.f11014a) {
                        this.f11014a.put(str3, build);
                    }
                    return build;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return com.ss.android.socialbase.downloader.downloader.c.s();
    }

    @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpService
    public com.ss.android.socialbase.downloader.network.i downloadWithConnection(int i5, String str, List<com.ss.android.socialbase.downloader.model.c> list) throws IOException {
        String str2;
        OkHttpClient s5;
        Request build;
        final InputStream inputStream;
        Request.Builder url = new Request.Builder().url(str);
        if (list != null && list.size() > 0) {
            str2 = null;
            for (com.ss.android.socialbase.downloader.model.c cVar : list) {
                String a5 = cVar.a();
                if (str2 == null && "ss_d_request_host_ip_114".equals(a5)) {
                    str2 = cVar.b();
                } else {
                    url.addHeader(a5, com.ss.android.socialbase.downloader.i.f.g(cVar.b()));
                }
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            s5 = a(str, str2);
        } else {
            s5 = com.ss.android.socialbase.downloader.downloader.c.s();
        }
        if (s5 != null) {
            if (!(url instanceof Request.Builder)) {
                build = url.build();
            } else {
                build = OkHttp3Instrumentation.build(url);
            }
            final Call newCall = OkHttp3Instrumentation.newCall(s5, build);
            final Response execute = newCall.execute();
            if (execute != null) {
                final ResponseBody body = execute.body();
                if (body == null) {
                    return null;
                }
                InputStream byteStream = body.byteStream();
                String header = execute.header(HTTP.CONTENT_ENCODING);
                if (header != null && Constants.CP_GZIP.equalsIgnoreCase(header) && !(byteStream instanceof GZIPInputStream)) {
                    inputStream = new GZIPInputStream(byteStream);
                } else {
                    inputStream = byteStream;
                }
                return new com.ss.android.socialbase.downloader.network.e() { // from class: com.ss.android.socialbase.downloader.impls.g.1
                    @Override // com.ss.android.socialbase.downloader.network.i
                    public InputStream a() throws IOException {
                        return inputStream;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.g
                    public int b() throws IOException {
                        return execute.code();
                    }

                    @Override // com.ss.android.socialbase.downloader.network.g
                    public void c() {
                        Call call = newCall;
                        if (call != null && !call.isCanceled()) {
                            newCall.cancel();
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.network.i
                    public void d() {
                        try {
                            ResponseBody responseBody = body;
                            if (responseBody != null) {
                                responseBody.close();
                            }
                            Call call = newCall;
                            if (call != null && !call.isCanceled()) {
                                newCall.cancel();
                            }
                        } catch (Throwable unused) {
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.network.a
                    public String e() {
                        return "";
                    }

                    @Override // com.ss.android.socialbase.downloader.network.g
                    public String a(String str3) {
                        return execute.header(str3);
                    }
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
