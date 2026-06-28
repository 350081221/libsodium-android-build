package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.credential.Server;
import java.util.Collections;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final s f7955a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f7956b = Boolean.FALSE;

    /* renamed from: c, reason: collision with root package name */
    private OkHttpClient f7957c;

    public u(Context context, s sVar) {
        this.f7955a = sVar;
        a(context);
    }

    private void a(Context context) {
        this.f7957c = new q(context, Collections.singletonList(new Interceptor() { // from class: com.huawei.agconnect.credential.obs.u.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) {
                Request request = chain.request();
                String str = request.url().scheme() + com.tendcloud.tenddata.aa.f11324a + request.url().host();
                if (!Server.GW.equals(str)) {
                    return chain.proceed(request);
                }
                Request build = request.newBuilder().url(request.url().toString().replace(str, "https://" + u.this.f7955a.c())).build();
                if (!u.this.f7956b.booleanValue()) {
                    u.this.f7956b = Boolean.TRUE;
                }
                return chain.proceed(build);
            }
        }), true).a();
    }

    public OkHttpClient a() {
        return this.f7957c;
    }

    public s b() {
        return this.f7955a;
    }

    public Boolean c() {
        return this.f7956b;
    }
}
