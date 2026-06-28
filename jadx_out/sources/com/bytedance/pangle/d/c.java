package com.bytedance.pangle.d;

import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.h;
import com.bytedance.pangle.util.i;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.File;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static File f4316a;

    /* renamed from: b, reason: collision with root package name */
    private static File f4317b;

    /* renamed from: c, reason: collision with root package name */
    private static File f4318c;

    private static String a(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public static String b() {
        Application appApplication = Zeus.getAppApplication();
        if (f4318c == null) {
            f4318c = new File(appApplication.getFilesDir(), ".pangle" + h.f4451a);
        }
        return a(f4318c);
    }

    public static String c() {
        Application appApplication = Zeus.getAppApplication();
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return null;
            }
            File externalFilesDir = appApplication.getExternalFilesDir(".pangle" + h.f4452b);
            if (externalFilesDir != null) {
                return a(externalFilesDir);
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static void d() {
        if (f4316a == null) {
            File file = new File(Zeus.getAppApplication().getFilesDir(), MediationConstant.ADN_PANGLE + h.f4453c);
            f4316a = file;
            a(file);
        }
    }

    public static String e(String str, int i5) {
        return new File(a(str, "version-".concat(String.valueOf(i5)), "apk", "temp"), "base-1.apk").getPath();
    }

    public static String f(String str, int i5) {
        return new File(a(str, "version-".concat(String.valueOf(i5)), "apk")).getPath();
    }

    public static String g(String str, int i5) {
        return new File(a(str, "version-".concat(String.valueOf(i5)), "apk", "temp")).getPath();
    }

    public static String h(String str, int i5) {
        if (i.i()) {
            return a(str, "version-".concat(String.valueOf(i5)), "apk", "temp", "oat", com.bytedance.pangle.e.b.a());
        }
        return a(str, "version-".concat(String.valueOf(i5)), "dalvik-cache");
    }

    public static String i(String str, int i5) {
        return a(str, "version-".concat(String.valueOf(i5)), "secondary-dexes");
    }

    private static String a(String... strArr) {
        d();
        File file = f4316a;
        if (strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    file = new File(file, str);
                }
            }
        }
        return a(file);
    }

    public static String d(String str, int i5) {
        return a(str, "version-".concat(String.valueOf(i5)), "lib");
    }

    public static String b(String str, int i5) {
        return new File(a(str, "version-".concat(String.valueOf(i5)), "apk"), "base-1.apk").getPath();
    }

    public static String c(String str, int i5) {
        return i.i() ? a(str, "version-".concat(String.valueOf(i5)), "apk", "oat", com.bytedance.pangle.e.b.a()) : a(str, "version-".concat(String.valueOf(i5)), "dalvik-cache");
    }

    public static String a() {
        Application appApplication = Zeus.getAppApplication();
        if (f4317b == null) {
            File downloadDir = GlobalParam.getInstance().getDownloadDir();
            if (downloadDir == null) {
                downloadDir = new File(appApplication.getFilesDir(), ".pangle" + h.f4452b);
            }
            f4317b = downloadDir;
        }
        return a(f4317b);
    }

    public static String a(String str, int i5) {
        d();
        File file = f4316a;
        String[] strArr = {str, "version-".concat(String.valueOf(i5))};
        for (int i6 = 0; i6 < 2; i6++) {
            String str2 = strArr[i6];
            if (!TextUtils.isEmpty(str2)) {
                file = new File(file, str2);
            }
        }
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    public static String a(String str) {
        return a(str);
    }
}
