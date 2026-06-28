package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.common.api.BaseResponse;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.exception.AGCNetworkException;
import com.huawei.agconnect.exception.AGCServerException;
import com.huawei.agconnect.https.Adapter;
import com.huawei.agconnect.https.HttpsException;
import com.huawei.agconnect.https.HttpsKit;
import com.huawei.agconnect.https.HttpsResult;
import com.huawei.agconnect.https.Method;
import com.huawei.agconnect.https.adapter.JsonAdapterFactory;
import com.huawei.hmf.tasks.Task;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.Interceptor;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7893a = "BackendImpl";

    /* renamed from: b, reason: collision with root package name */
    private static final long f7894b = 5000;

    /* renamed from: c, reason: collision with root package name */
    private static final o f7895c = new o();

    /* renamed from: d, reason: collision with root package name */
    private static final ExecutorService f7896d = w.a();

    /* renamed from: e, reason: collision with root package name */
    private final Map<s, u> f7897e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Adapter.Factory f7898f = new JsonAdapterFactory();

    private o() {
    }

    public static o a() {
        return f7895c;
    }

    private HttpsKit a(Context context, List<Interceptor> list, Authenticator authenticator, long j5, TimeUnit timeUnit) {
        if (j5 == 0) {
            timeUnit = TimeUnit.MILLISECONDS;
            j5 = 5000;
        }
        return new HttpsKit.Builder().client(new q(context, Collections.unmodifiableList(list), true).a(authenticator).a(j5, timeUnit)).executor(f7896d).build();
    }

    private <Req> Method a(Req req, int i5, Adapter.Factory factory) {
        return i5 == 1 ? new Method.Post(req, factory) : i5 == 2 ? new Method.Put(req, factory) : new Method.Get(req);
    }

    public <Req, Rsp> Task<Rsp> a(Req req, int i5, Class<Rsp> cls, AGConnectOptions aGConnectOptions) {
        return a(req, i5, cls, this.f7898f, 5000L, TimeUnit.MILLISECONDS, null, null, aGConnectOptions);
    }

    public <Req, Rsp> Task<Rsp> a(Req req, int i5, final Class<Rsp> cls, Adapter.Factory factory, long j5, TimeUnit timeUnit, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        final Adapter.Factory factory2 = factory != null ? factory : this.f7898f;
        String string = aGConnectOptions.getString("agcgw/url");
        String string2 = aGConnectOptions.getString("agcgw/backurl");
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            throw new InvalidParameterException("url is null");
        }
        Context b5 = x.a().b();
        final com.huawei.hmf.tasks.k kVar = new com.huawei.hmf.tasks.k();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        } else {
            arrayList.add(new v(string, string2));
        }
        a(b5, arrayList, authenticator, j5, timeUnit).create(b5).execute(a(req, i5, factory2)).l(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.i<HttpsResult>() { // from class: com.huawei.agconnect.credential.obs.o.2
            @Override // com.huawei.hmf.tasks.i
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(HttpsResult httpsResult) {
                Object response;
                if (httpsResult.isSuccess()) {
                    if (String.class.equals(cls)) {
                        response = httpsResult.getResponse();
                    } else {
                        try {
                            response = httpsResult.getResponse(cls, factory2);
                        } catch (RuntimeException e5) {
                            kVar.c(e5);
                            return;
                        }
                    }
                    kVar.d(response);
                    return;
                }
                if (httpsResult.code() == 401) {
                    try {
                        BaseResponse baseResponse = (BaseResponse) httpsResult.getResponse(BaseResponse.class, factory2);
                        if (baseResponse != null && baseResponse.getRet() != null) {
                            kVar.c(new AGCServerException(httpsResult.getErrorMsg(), httpsResult.code(), baseResponse.getRet().getCode()));
                            return;
                        }
                    } catch (RuntimeException unused) {
                        Logger.e(o.f7893a, "get base response error");
                    }
                }
                kVar.c(new AGCServerException(httpsResult.getErrorMsg(), httpsResult.code()));
            }
        }).i(com.huawei.hmf.tasks.l.b(), new com.huawei.hmf.tasks.h() { // from class: com.huawei.agconnect.credential.obs.o.1
            @Override // com.huawei.hmf.tasks.h
            public void onFailure(Exception exc) {
                kVar.c(exc instanceof HttpsException ? !((HttpsException) exc).hasRequest() ? new AGCNetworkException(exc.getMessage(), 0) : new AGCNetworkException(exc.getMessage(), 1) : new AGCServerException(exc.getMessage(), 2));
            }
        });
        return kVar.b();
    }

    public <Req, Rsp> Task<Rsp> a(Req req, int i5, Class<Rsp> cls, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        return a(req, i5, cls, this.f7898f, 5000L, TimeUnit.MILLISECONDS, list, authenticator, aGConnectOptions);
    }

    public Map<s, u> b() {
        return this.f7897e;
    }
}
