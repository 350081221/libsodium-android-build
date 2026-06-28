package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.PackageUtils;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.apache.http.auth.AUTH;

/* loaded from: classes3.dex */
public class n implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7891a = "ApiKeyInterceptor";

    /* renamed from: b, reason: collision with root package name */
    private AGConnectInstance f7892b;

    public n(AGConnectInstance aGConnectInstance) {
        this.f7892b = aGConnectInstance;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String installedAppSign256 = PackageUtils.getInstalledAppSign256(this.f7892b.getContext(), this.f7892b.getContext().getPackageName());
        String string = this.f7892b.getOptions().getString("/client/api_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(installedAppSign256)) {
            Logger.e(f7891a, "no apikey or fingerPrinter");
        }
        return chain.proceed(chain.request().newBuilder().addHeader("x-apik", string).addHeader("x-cert-fp", installedAppSign256).removeHeader("client_id").removeHeader(AUTH.WWW_AUTH_RESP).build());
    }
}
