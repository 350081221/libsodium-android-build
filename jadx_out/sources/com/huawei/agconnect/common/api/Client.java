package com.huawei.agconnect.common.api;

import android.content.Context;
import com.huawei.agconnect.credential.obs.q;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public class Client {
    public static OkHttpClient build(Context context, List<Interceptor> list) {
        return new q(context, list, false).a();
    }

    public static OkHttpClient build(Context context, List<Interceptor> list, boolean z4) {
        return new q(context, list, z4).a();
    }
}
