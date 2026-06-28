package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.EndpointService;
import com.huawei.hmf.tasks.Task;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import okhttp3.Dns;

/* loaded from: classes3.dex */
public class af implements EndpointService {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7833a = "EndpointServiceImpl";

    /* renamed from: b, reason: collision with root package name */
    private s f7834b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7835c;

    /* loaded from: classes3.dex */
    static class a implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        String f7836a;

        /* renamed from: b, reason: collision with root package name */
        String f7837b;

        a() {
        }

        static a a(String str, String str2) {
            a aVar = new a();
            aVar.f7836a = str;
            aVar.f7837b = str2;
            return aVar;
        }

        private boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                int indexOf = str.indexOf(":");
                Dns.SYSTEM.lookup(indexOf != -1 ? str.substring(0, indexOf) : str);
                return true;
            } catch (UnknownHostException unused) {
                Logger.e(af.f7833a, "checkUrl#UnknownHostException:" + str);
                return false;
            }
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            if (a(this.f7836a)) {
                return this.f7836a;
            }
            if (a(this.f7837b)) {
                return this.f7837b;
            }
            throw new IOException("main/backup url both are invalid");
        }
    }

    public af(Context context, AGConnectInstance aGConnectInstance) {
        this.f7835c = false;
        this.f7834b = new s(aGConnectInstance.getOptions().getString("agcgw/url"), aGConnectInstance.getOptions().getString("agcgw/backurl"));
        if (o.a().b().containsKey(this.f7834b)) {
            this.f7834b = o.a().b().get(this.f7834b).b();
            this.f7835c = o.a().b().get(this.f7834b).c().booleanValue();
        }
    }

    @Override // com.huawei.agconnect.core.service.EndpointService
    public Task<String> getEndpointDomain(boolean z4) {
        if (z4 || !this.f7835c) {
            return com.huawei.hmf.tasks.m.f(a.a(this.f7834b.a(), this.f7834b.b()));
        }
        com.huawei.hmf.tasks.k kVar = new com.huawei.hmf.tasks.k();
        kVar.d(this.f7834b.c());
        return kVar.b();
    }
}
