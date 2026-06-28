package s;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22319a = "ro.build.version.emui";

    /* renamed from: b, reason: collision with root package name */
    public static final String f22320b = "hw_sc.build.platform.version";

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static q.b b(Context context) {
        String str = Build.BRAND;
        u.a.d("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase("redmi") && !str.equalsIgnoreCase("meitu") && !str.equalsIgnoreCase("小米") && !str.equalsIgnoreCase("blackshark")) {
                if (str.equalsIgnoreCase("vivo")) {
                    return new h();
                }
                if (!str.equalsIgnoreCase("oppo") && !str.equalsIgnoreCase("oneplus") && !str.equalsIgnoreCase("realme")) {
                    if (!str.equalsIgnoreCase("lenovo") && !str.equalsIgnoreCase("zuk")) {
                        if (str.equalsIgnoreCase("nubia")) {
                            return new e();
                        }
                        if (str.equalsIgnoreCase("samsung")) {
                            return new g();
                        }
                        if (c()) {
                            return new b();
                        }
                        if (!str.equalsIgnoreCase("meizu") && !str.equalsIgnoreCase("mblu")) {
                            return null;
                        }
                        return new d();
                    }
                    return new c();
                }
                return new f();
            }
            return new i();
        }
        return new b();
    }

    public static boolean c() {
        String a5 = a(f22319a);
        String a6 = a(f22320b);
        if (TextUtils.isEmpty(a5) && TextUtils.isEmpty(a6)) {
            return false;
        }
        return true;
    }
}
