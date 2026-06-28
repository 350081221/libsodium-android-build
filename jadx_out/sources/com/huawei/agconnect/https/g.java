package com.huawei.agconnect.https;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
class g implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private int f8005a;

    /* renamed from: b, reason: collision with root package name */
    private int f8006b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i5) {
        this.f8005a = i5;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed;
        int i5;
        Request request = chain.request();
        while (true) {
            proceed = chain.proceed(request);
            if (proceed.isSuccessful() || (i5 = this.f8006b) >= this.f8005a) {
                break;
            }
            this.f8006b = i5 + 1;
        }
        return proceed;
    }
}
