package com.bytedance.pangle.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.pangle.util.MethodUtils;
import com.bytedance.pangle.util.i;
import dalvik.system.VMRuntime;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f4341a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f4342b = 2;

    public static SharedPreferences a(Context context) {
        return context.getApplicationContext().getSharedPreferences("plugin_oat_info", 0);
    }

    public static String b(String str) {
        String str2;
        String substring = str.substring(str.lastIndexOf("."));
        if (Build.VERSION.SDK_INT < 26) {
            str2 = ".dex";
        } else {
            str2 = ".odex";
        }
        if (".dex".equals(substring)) {
            return substring;
        }
        if (!".zip".equals(substring) && !".apk".equals(substring)) {
            return str + str2;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] a(String str, String str2, int i5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        arrayList.add("--runtime-arg");
        arrayList.add("-classpath");
        arrayList.add("--runtime-arg");
        arrayList.add("&");
        arrayList.add("--instruction-set=" + a());
        if (i5 == f4341a) {
            if (i.i()) {
                arrayList.add("--compiler-filter=quicken");
            } else {
                arrayList.add("--compiler-filter=interpret-only");
            }
        } else if (i5 == f4342b) {
            arrayList.add("--compiler-filter=speed");
        }
        arrayList.add("--dex-file=".concat(String.valueOf(str)));
        arrayList.add("--oat-file=".concat(String.valueOf(str2)));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String a() {
        try {
            return (String) MethodUtils.invokeStaticMethod(VMRuntime.class, "getCurrentInstructionSet", new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        String substring = str.substring(str.lastIndexOf("/") + 1);
        String substring2 = substring.substring(substring.lastIndexOf("."));
        String str2 = Build.VERSION.SDK_INT >= 26 ? ".odex" : ".dex";
        if (".dex".equals(substring2)) {
            return substring;
        }
        if (!".zip".equals(substring2) && !".apk".equals(substring2)) {
            return substring + str2;
        }
        return substring.replace(substring2, str2);
    }

    public static boolean a(String str, String str2) {
        return a.a(a(str, str2, f4341a));
    }

    public static boolean a(String... strArr) {
        for (int i5 = 0; i5 <= 0; i5++) {
            File file = new File(strArr[0]);
            if (!file.exists() || !h.a(file)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String... strArr) {
        for (String str2 : strArr) {
            if (!new File(str + File.separator + a(str2)).exists()) {
                return false;
            }
        }
        return true;
    }
}
