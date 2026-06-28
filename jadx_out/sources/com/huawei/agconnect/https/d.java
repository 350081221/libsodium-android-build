package com.huawei.agconnect.https;

import com.huawei.agconnect.https.connector.HttpsPlatform;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.m;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class d implements Service {

    /* renamed from: a, reason: collision with root package name */
    private OkHttpClient f7997a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f7998b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(OkHttpClient okHttpClient, Executor executor) {
        this.f7997a = okHttpClient;
        this.f7998b = executor;
    }

    @Override // com.huawei.agconnect.https.Service
    public Task<HttpsResult> execute(final Method method) {
        return m.g(this.f7998b, new Callable<HttpsResult>() { // from class: com.huawei.agconnect.https.d.1
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public HttpsResult call() throws Exception {
                if (!HttpsPlatform.getInstance().getConnector().hasActiveNetwork()) {
                    throw new HttpsException(false, "There's no network");
                }
                try {
                    Response execute = d.this.f7997a.newCall(method.create().build()).execute();
                    return new HttpsResult(true, execute.code(), execute);
                } catch (IOException e5) {
                    throw new HttpsException(true, e5);
                }
            }
        });
    }
}
