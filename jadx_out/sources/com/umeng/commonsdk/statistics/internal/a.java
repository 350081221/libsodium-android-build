package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f13341a;

    /* renamed from: b, reason: collision with root package name */
    private String f13342b;

    /* renamed from: c, reason: collision with root package name */
    private String f13343c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0247a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13344a = new a();

        private C0247a() {
        }
    }

    public static a a(Context context) {
        if (f13341a == null && context != null) {
            f13341a = context.getApplicationContext();
        }
        return C0247a.f13344a;
    }

    private void f(String str) {
        try {
            this.f13342b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", "/") + "/Android " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f13341a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f13341a, th);
        }
    }

    private void g(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&=");
                StringBuilder sb = new StringBuilder();
                sb.append(bi.aT);
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        String substring = str3.substring(0, 2);
                        if (substring.endsWith(ContainerUtils.KEY_VALUE_DELIMITER)) {
                            substring = substring.replace(ContainerUtils.KEY_VALUE_DELIMITER, "");
                        }
                        sb.append(substring);
                    }
                }
                this.f13343c = sb.toString();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f13341a, th);
        }
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(bi.aL);
    }

    public boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(bi.aG);
        }
        return false;
    }

    public boolean d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(bi.aJ);
        }
        return false;
    }

    public void e(String str) {
        String substring = str.substring(0, str.indexOf(95));
        g(substring);
        f(substring);
    }

    private a() {
        this.f13342b = null;
        this.f13343c = null;
    }

    public String b() {
        return this.f13342b;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(bi.ay);
    }

    public String a() {
        return this.f13343c;
    }
}
