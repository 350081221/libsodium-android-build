package com.huawei.agconnect.common.api;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.credential.obs.o;
import com.huawei.agconnect.https.Adapter;
import com.huawei.hmf.tasks.Task;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Authenticator;
import okhttp3.Interceptor;

/* loaded from: classes3.dex */
public class Backend {

    /* loaded from: classes3.dex */
    public interface MethodType {
        public static final int GET = 0;
        public static final int POST = 1;
        public static final int PUT = 2;
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i5, Class<Rsp> cls) {
        return o.a().a(req, i5, cls, AGConnectInstance.getInstance().getOptions());
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i5, Class<Rsp> cls, AGConnectOptions aGConnectOptions) {
        return o.a().a(req, i5, cls, aGConnectOptions);
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i5, Class<Rsp> cls, Adapter.Factory factory, long j5, TimeUnit timeUnit) {
        return call(req, i5, cls, factory, j5, timeUnit, null, null, AGConnectInstance.getInstance().getOptions());
    }

    @Deprecated
    public static <Req, Rsp> Task<Rsp> call(Req req, int i5, Class<Rsp> cls, Adapter.Factory factory, long j5, TimeUnit timeUnit, AGConnectOptions aGConnectOptions) {
        return call(req, i5, cls, factory, j5, timeUnit, null, null, aGConnectOptions);
    }

    public static <Req, Rsp> Task<Rsp> call(Req req, int i5, Class<Rsp> cls, Adapter.Factory factory, long j5, TimeUnit timeUnit, List<Interceptor> list, Authenticator authenticator, AGConnectOptions aGConnectOptions) {
        return o.a().a(req, i5, cls, factory, j5, timeUnit, list, authenticator, aGConnectOptions);
    }
}
