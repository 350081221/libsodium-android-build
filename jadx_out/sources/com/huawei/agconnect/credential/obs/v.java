package com.huawei.agconnect.credential.obs;

import android.text.TextUtils;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.credential.Server;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7959a = "UrlInterceptorV2";

    /* renamed from: b, reason: collision with root package name */
    private List<s> f7960b;

    public v(BackendService.Options options) {
        this.f7960b = l.a().a(options.getApp());
    }

    public v(String str, String str2) {
        this.f7960b = Collections.singletonList(new s(str, str2));
    }

    private Response a(Interceptor.Chain chain, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Request request = chain.request();
        String[] split = str.split(":");
        int i5 = 443;
        try {
            if (split.length == 2) {
                try {
                    i5 = Integer.parseInt(split[1]);
                    str2 = split[0];
                } catch (NumberFormatException unused) {
                    Logger.e(f7959a, "port is error:" + i5 + ", use default 443");
                }
                return chain.proceed(request.newBuilder().url(request.url().newBuilder().scheme("https").host(str2).port(i5).build()).build());
            }
            return chain.proceed(request.newBuilder().url(request.url().newBuilder().scheme("https").host(str2).port(i5).build()).build());
        } catch (IOException e5) {
            if (!(e5 instanceof UnknownHostException)) {
                throw e5;
            }
            Logger.e(f7959a, "UnknownHostException" + str);
            return null;
        }
        str2 = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        l.a().a(request.header("sdkServiceName"));
        if (!Server.GW.equals(request.url().scheme() + com.tendcloud.tenddata.aa.f11324a + request.url().host()) || this.f7960b.isEmpty()) {
            return chain.proceed(request);
        }
        UnknownHostException unknownHostException = null;
        int i5 = 0;
        UnknownHostException unknownHostException2 = null;
        Response response = null;
        while (true) {
            if (i5 >= this.f7960b.size()) {
                unknownHostException = unknownHostException2;
                break;
            }
            s sVar = this.f7960b.get(i5);
            if (!TextUtils.isEmpty(sVar.e())) {
                return a(chain, sVar.c());
            }
            String a5 = sVar.a();
            String b5 = sVar.b();
            Response a6 = a(chain, a5);
            if (a6 == null) {
                response = a(chain, b5);
                if (response != null) {
                    sVar.a(b5, true);
                    break;
                }
                unknownHostException2 = new UnknownHostException("no host can access");
                i5++;
            } else {
                sVar.a(a5, false);
                response = a6;
                break;
            }
        }
        if (unknownHostException == null) {
            return response;
        }
        throw unknownHostException;
    }
}
