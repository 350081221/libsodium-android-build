package a1;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f92a = "00:00:00:00:00:00";

    /* renamed from: b, reason: collision with root package name */
    public static c f93b;

    public c(Context context) {
    }

    public static String b(Context context) {
        return c(context).a().substring(0, 8);
    }

    public static c c(Context context) {
        if (f93b == null) {
            f93b = new c(context);
        }
        return f93b;
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static g g(Context context) {
        try {
            NetworkInfo a5 = c1.b.a(null, context);
            if (a5 != null && a5.getType() == 0) {
                return g.a(a5.getSubtype());
            }
            if (a5 != null && a5.getType() == 1) {
                return g.WIFI;
            }
            return g.NONE;
        } catch (Exception unused) {
            return g.NONE;
        }
    }

    public String a() {
        String str = d() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        String e5 = e();
        if (TextUtils.isEmpty(e5)) {
            return str + "000000000000000";
        }
        return str + e5;
    }

    public String d() {
        return "000000000000000";
    }

    public String e() {
        return "000000000000000";
    }

    public String h() {
        return f92a;
    }
}
