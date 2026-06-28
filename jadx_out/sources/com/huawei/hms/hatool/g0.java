package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes3.dex */
public class g0 {
    public static long a(Context context, String str, String str2, long j5) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j5;
        }
        SharedPreferences b5 = b(context, str);
        return b5 != null ? b5.getLong(str2, j5) : j5;
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b5 = b(context, str);
        return b5 != null ? b5.getString(str2, str3) : str3;
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static void a(Context context, String str, String... strArr) {
        String str2;
        if (context == null || TextUtils.isEmpty(str)) {
            str2 = "clearData(): parameter error.context,spname";
        } else {
            if (strArr != null) {
                SharedPreferences b5 = b(context, str);
                if (b5 != null) {
                    SharedPreferences.Editor edit = b5.edit();
                    if (strArr.length == 0) {
                        edit.clear();
                        edit.commit();
                        return;
                    }
                    for (String str3 : strArr) {
                        if (b5.contains(str3)) {
                            edit.remove(str3);
                            edit.commit();
                        }
                    }
                    return;
                }
                return;
            }
            str2 = "clearData(): No data need to be deleted,keys is null";
        }
        y.f("hmsSdk", str2);
    }

    public static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static void b(Context context, String str, String str2, long j5) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b5 = b(context, str);
        if (b5 != null) {
            SharedPreferences.Editor edit = b5.edit();
            edit.putLong(str2, j5);
            edit.commit();
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b5 = b(context, str);
        if (b5 != null) {
            SharedPreferences.Editor edit = b5.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String n5 = c.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(n5)) {
            return "hms_" + str + "_" + packageName;
        }
        return "hms_" + str + "_" + packageName + "_" + n5;
    }
}
