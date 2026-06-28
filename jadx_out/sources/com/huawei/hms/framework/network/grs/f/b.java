package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, b> f8425b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8426c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private a f8427a;

    public b(Context context, GrsBaseInfo grsBaseInfo, boolean z4) {
        a(context, z4);
        f8425b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
    }

    public static b a(String str, GrsBaseInfo grsBaseInfo) {
        return f8425b.get(str + grsBaseInfo.uniqueCode());
    }

    public static void a(Context context, GrsBaseInfo grsBaseInfo) {
        b a5 = a(context.getPackageName(), grsBaseInfo);
        if (a5 != null) {
            Logger.i("LocalManagerProxy", "appGrs is not null and clear services.");
            synchronized (f8426c) {
                a5.f8427a.a();
            }
        }
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f8427a.b();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z4) {
        synchronized (f8426c) {
            String a5 = this.f8427a.a(context, aVar, grsBaseInfo, str, str2, z4);
            if (!TextUtils.isEmpty(a5) || !this.f8427a.d()) {
                return a5;
            }
            a(context, true);
            a(grsBaseInfo);
            f8425b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
            return this.f8427a.a(context, aVar, grsBaseInfo, str, str2, z4);
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z4) {
        synchronized (f8426c) {
            Map<String, String> a5 = this.f8427a.a(context, aVar, grsBaseInfo, str, z4);
            if ((a5 != null && !a5.isEmpty()) || !this.f8427a.d()) {
                return a5;
            }
            a(context, true);
            a(grsBaseInfo);
            f8425b.put(context.getPackageName() + grsBaseInfo.uniqueCode(), this);
            return this.f8427a.a(context, aVar, grsBaseInfo, str, z4);
        }
    }

    public void a(Context context, boolean z4) {
        String[] list = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
        List<String> arrayList = list == null ? new ArrayList<>() : Arrays.asList(list);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is" + appConfigName);
        this.f8427a = new d(false, z4);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f8427a = new d(context, appConfigName, z4);
        }
        if (!this.f8427a.e() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f8427a = new c(context, z4);
        }
        this.f8427a.a(context, arrayList);
    }

    public void a(GrsBaseInfo grsBaseInfo) {
        this.f8427a.a(grsBaseInfo);
    }

    public Set<String> b() {
        return this.f8427a.c();
    }
}
