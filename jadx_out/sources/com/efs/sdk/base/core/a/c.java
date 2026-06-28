package com.efs.sdk.base.core.a;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.text.TextUtils;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.EfsConstant;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.PackageUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.analytics.pro.bi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    String f6482a;

    /* renamed from: b, reason: collision with root package name */
    String f6483b;

    /* renamed from: c, reason: collision with root package name */
    String f6484c;

    /* renamed from: d, reason: collision with root package name */
    public String f6485d;

    /* renamed from: e, reason: collision with root package name */
    public int f6486e;

    /* renamed from: f, reason: collision with root package name */
    public String f6487f;

    /* renamed from: g, reason: collision with root package name */
    public byte f6488g;

    /* renamed from: h, reason: collision with root package name */
    public String f6489h;

    /* renamed from: i, reason: collision with root package name */
    String f6490i;

    /* renamed from: j, reason: collision with root package name */
    String f6491j;

    /* renamed from: k, reason: collision with root package name */
    String f6492k;

    /* renamed from: l, reason: collision with root package name */
    String f6493l;

    /* renamed from: m, reason: collision with root package name */
    public long f6494m = 0;

    public static c a() {
        c cVar = new c();
        cVar.f6482a = ControllerCenter.getGlobalEnvStruct().getAppid();
        cVar.f6483b = ControllerCenter.getGlobalEnvStruct().getSecret();
        cVar.f6493l = ControllerCenter.getGlobalEnvStruct().getUid();
        cVar.f6491j = BuildConfig.VERSION_NAME;
        cVar.f6484c = PackageUtil.getAppVersionName(ControllerCenter.getGlobalEnvStruct().mAppContext);
        cVar.f6490i = String.valueOf(com.efs.sdk.base.core.config.a.c.a().f6564d.f6552a);
        cVar.f6492k = EfsConstant.UM_SDK_VERSION;
        return cVar;
    }

    public final String b() {
        a.a();
        String valueOf = String.valueOf(a.b() / 1000);
        String a5 = com.efs.sdk.base.core.util.b.b.a(com.efs.sdk.base.core.util.b.a.a(this.f6493l + valueOf, this.f6483b));
        TreeMap treeMap = new TreeMap();
        treeMap.put("app", this.f6482a);
        treeMap.put("sd", a5);
        String a6 = a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        if (!TextUtils.isEmpty(a6)) {
            treeMap.put("wl_dd", com.efs.sdk.base.core.util.b.b.a(com.efs.sdk.base.core.util.b.a.a(a6 + "_" + valueOf, this.f6483b)));
        }
        if (!TextUtils.isEmpty(this.f6485d)) {
            treeMap.put(i0.b.f16159m, this.f6485d);
        }
        if (this.f6488g != 0) {
            treeMap.put("de", String.valueOf(this.f6486e));
            treeMap.put("type", this.f6489h);
            String str = this.f6487f;
            if (TextUtils.isEmpty(str)) {
                a.a();
                long b5 = a.b();
                str = String.format(Locale.SIMPLIFIED_CHINESE, "%d%04d", Long.valueOf(b5), Integer.valueOf(new Random(b5).nextInt(10000)));
            }
            treeMap.put("seq", str);
        }
        treeMap.put("cver", this.f6490i);
        treeMap.put(bi.f12278x, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        treeMap.put("sver", this.f6490i);
        treeMap.put("tm", valueOf);
        treeMap.put("ver", this.f6484c);
        treeMap.put("um_sdk_ver", this.f6492k);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = ((String) entry.getKey()) + ContainerUtils.KEY_VALUE_DELIMITER + ((String) entry.getValue());
            sb2.append(str2);
            sb.append(str2);
            sb.append("&");
        }
        String a7 = com.efs.sdk.base.core.util.b.b.a(sb2.toString() + this.f6483b);
        sb.append("sign=");
        sb.append(a7);
        Log.d("efs.config", sb.toString());
        return com.efs.sdk.base.core.util.b.b.b(sb.toString());
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.UMConfigure");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getUMIDString", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }
}
