package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.instrument.TraceManager;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class c0 implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        TraceManager.notifyToAsyncEnterMethod(new c("okhttp3", i0.NETWORK.abc));
        return chain.proceed(chain.request());
    }
}
