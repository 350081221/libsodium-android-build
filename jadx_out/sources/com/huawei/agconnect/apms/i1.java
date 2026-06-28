package com.huawei.agconnect.apms;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class i1 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static Intent abc(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public static float bcd(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display cde = cde(context);
        if (cde != null) {
            cde.getRealMetrics(displayMetrics);
            try {
                return (float) Math.sqrt(((float) Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)) + ((float) Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d)));
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public static Display cde(Context context) {
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return windowManager.getDefaultDisplay();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean def(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return false;
            }
            int intExtra = registerReceiver.getIntExtra("status", -1);
            if (intExtra != 2 && intExtra != 5) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("failed to get device charging status: "), abc);
            return false;
        }
    }

    public static String abc(String str) {
        return (str == null || str.length() == 0) ? "unknown" : str;
    }

    public static Object abc(Class<?> cls, String str, Class[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        if (clsArr == null) {
            if (objArr != null) {
                return null;
            }
        } else if (objArr == null || clsArr.length != objArr.length) {
            return null;
        }
        try {
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("exception occurred when invoking method: "), abc);
        }
        try {
            return cls.getMethod(str, clsArr).invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            abc.warn("failed to invoke method: " + e5.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r0.contains("Flyme") != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String abc() {
        /*
            java.lang.String r0 = "ro.build.display.id"
            java.lang.String r1 = "MIUI"
            java.lang.String r2 = "EMUI"
            java.lang.String r3 = "FLYME"
            java.lang.String r4 = "OTHER"
            com.huawei.agconnect.apms.k1 r5 = com.huawei.agconnect.apms.k1.abc()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = "ro.build.version.emui"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L89
            java.lang.String r6 = "ro.build.hw_emui_api_level"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L89
            java.lang.String r6 = "ro.confg.hw_systemversion"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L2d
            goto L89
        L2d:
            java.lang.String r6 = "ro.miui.ui.version.code"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L88
            java.lang.String r6 = "ro.miui.ui.version.name"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L88
            java.lang.String r6 = "ro.miui.internal.storage"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L4c
            goto L88
        L4c:
            java.lang.String r6 = "persist.sys.use.flyme.icon"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L87
            java.lang.String r6 = "ro.meizu.setupwizard.flyme"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 != 0) goto L87
            java.lang.String r6 = "ro.flyme.published"
            java.util.Properties r7 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r7.containsKey(r6)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto L6b
            goto L87
        L6b:
            java.util.Properties r6 = r5.abc     // Catch: java.lang.Throwable -> L8a
            boolean r6 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L8a
            if (r6 == 0) goto Lc4
            java.util.Properties r5 = r5.abc     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r5.getProperty(r0)     // Catch: java.lang.Throwable -> L8a
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L8a
            if (r5 != 0) goto Lc4
            java.lang.String r5 = "Flyme"
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto Lc4
        L87:
            return r3
        L88:
            return r1
        L89:
            return r2
        L8a:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            if (r0 != 0) goto L8f
            goto Lc4
        L8f:
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r5)
            r0.hashCode()
            int r5 = r0.hashCode()
            r6 = -1
            switch(r5) {
                case -1206476313: goto Lb7;
                case -759499589: goto Lac;
                case 74224812: goto La1;
                default: goto La0;
            }
        La0:
            goto Lc1
        La1:
            java.lang.String r5 = "Meizu"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Laa
            goto Lc1
        Laa:
            r6 = 2
            goto Lc1
        Lac:
            java.lang.String r5 = "xiaomi"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lb5
            goto Lc1
        Lb5:
            r6 = 1
            goto Lc1
        Lb7:
            java.lang.String r5 = "huawei"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto Lc0
            goto Lc1
        Lc0:
            r6 = 0
        Lc1:
            switch(r6) {
                case 0: goto Lc8;
                case 1: goto Lc9;
                case 2: goto Lc6;
                default: goto Lc4;
            }
        Lc4:
            r1 = r4
            goto Lc9
        Lc6:
            r1 = r3
            goto Lc9
        Lc8:
            r1 = r2
        Lc9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.i1.abc():java.lang.String");
    }
}
