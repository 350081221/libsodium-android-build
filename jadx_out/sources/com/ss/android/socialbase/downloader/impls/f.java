package com.ss.android.socialbase.downloader.impls;

import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Instrumented
/* loaded from: classes3.dex */
public class f implements com.ss.android.socialbase.downloader.network.h {
    @Override // com.ss.android.socialbase.downloader.network.h
    public com.ss.android.socialbase.downloader.network.g a(String str, List<com.ss.android.socialbase.downloader.model.c> list) throws IOException {
        Request build;
        OkHttpClient s5 = com.ss.android.socialbase.downloader.downloader.c.s();
        if (s5 != null) {
            Request.Builder head = new Request.Builder().url(str).head();
            if (list != null && list.size() > 0) {
                for (com.ss.android.socialbase.downloader.model.c cVar : list) {
                    head.addHeader(cVar.a(), com.ss.android.socialbase.downloader.i.f.g(cVar.b()));
                }
            }
            if (!(head instanceof Request.Builder)) {
                build = head.build();
            } else {
                build = OkHttp3Instrumentation.build(head);
            }
            final Call newCall = OkHttp3Instrumentation.newCall(s5, build);
            final Response execute = newCall.execute();
            if (execute != null) {
                if (com.ss.android.socialbase.downloader.i.a.a(2097152)) {
                    execute.close();
                }
                return new com.ss.android.socialbase.downloader.network.g() { // from class: com.ss.android.socialbase.downloader.impls.f.1
                    @Override // com.ss.android.socialbase.downloader.network.g
                    public String a(String str2) {
                        return execute.header(str2);
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
                };
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
