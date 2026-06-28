package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class g extends com.efs.sdk.base.core.f.a {

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f6623b = new ConcurrentHashMap<>(10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f6624a;

        /* renamed from: b, reason: collision with root package name */
        String f6625b;

        /* renamed from: c, reason: collision with root package name */
        String f6626c;

        /* renamed from: d, reason: collision with root package name */
        AtomicInteger f6627d = new AtomicInteger(0);

        a(String str, String str2, String str3) {
            this.f6624a = str;
            this.f6625b = str2;
            this.f6626c = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, String str3) {
        String str4 = str + "_" + str2 + "_" + str3.trim();
        if (!this.f6623b.containsKey(str4) || this.f6623b.get(str4) == null) {
            this.f6623b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f6623b.get(str4).f6627d.incrementAndGet();
    }

    @Override // com.efs.sdk.base.core.f.a
    public final void a() {
        f fVar;
        try {
            if (this.f6605a != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                Iterator<Map.Entry<String, a>> it = this.f6623b.entrySet().iterator();
                while (it.hasNext()) {
                    a value = it.next().getValue();
                    int i5 = value.f6627d.get();
                    if (i5 > 0) {
                        ControllerCenter controllerCenter = this.f6605a;
                        String str = value.f6624a;
                        String str2 = value.f6625b;
                        String str3 = value.f6626c;
                        fVar = f.a.f6622a;
                        b bVar = new b("efs_core", "req_succ_rate", fVar.f6618a.f6612c);
                        bVar.put("rep_code", str);
                        bVar.put("px_code", str2);
                        bVar.put(ClientCookie.PATH_ATTR, str3);
                        bVar.put("cnt", Integer.valueOf(i5));
                        controllerCenter.send(bVar);
                        value.f6627d.addAndGet(i5 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
