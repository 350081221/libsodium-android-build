package com.a.a.a;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public class h {
    public static boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean b(Context context) {
        String c5 = c();
        if (c5 == null || c5.contains(":")) {
            return false;
        }
        if (!c5.equals(context.getPackageName()) && !c5.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r0 = com.a.a.a.g.a()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "currentProcessName"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L28
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L28
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L28
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L28
            return r1
        L28:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5c
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5c
            java.lang.String r3 = "/proc/self/cmdline"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L5c
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            if (r3 != 0) goto L4c
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L5d
            if (r3 != 0) goto L4c
            r1.close()     // Catch: java.lang.Exception -> L4b
        L4b:
            return r2
        L4c:
            r1.close()     // Catch: java.lang.Exception -> L60
            goto L60
        L50:
            r0 = move-exception
            goto L56
        L52:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L56:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Exception -> L5b
        L5b:
            throw r0
        L5c:
            r1 = r0
        L5d:
            if (r1 == 0) goto L60
            goto L4c
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.a.a.a.h.c():java.lang.String");
    }
}
