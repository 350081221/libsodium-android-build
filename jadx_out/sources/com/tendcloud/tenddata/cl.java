package com.tendcloud.tenddata;

import android.content.Context;

/* loaded from: classes3.dex */
public class cl {
    public static boolean a() {
        String a5;
        try {
            if (bx.f() && (a5 = a(t0.c.f22432c, "0")) != null) {
                return a5.equals("1");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectVIVO(Context context) {
        try {
            df.a().setOAID(a("oaid", null, context));
        } catch (Throwable unused) {
        }
        try {
            df.a().setVAID(a("vaid", null, context));
        } catch (Throwable unused2) {
        }
        try {
            df.a().setAAID(a(com.huawei.agconnect.credential.obs.c.f7851a, null, context));
        } catch (Throwable unused3) {
        }
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x0001, B:15:0x0071, B:17:0x007f, B:19:0x0085, B:20:0x0090, B:24:0x003e, B:26:0x0054, B:27:0x006a, B:28:0x0017, B:31:0x0021, B:34:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:3:0x0001, B:15:0x0071, B:17:0x007f, B:19:0x0085, B:20:0x0090, B:24:0x003e, B:26:0x0054, B:27:0x006a, B:28:0x0017, B:31:0x0021, B:34:0x002b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r7, java.lang.String r8, android.content.Context r9) {
        /*
            r0 = 0
            int r1 = r7.hashCode()     // Catch: java.lang.Throwable -> L93
            r2 = 2986299(0x2d913b, float:4.184696E-39)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L2b
            r2 = 3403373(0x33ee6d, float:4.769141E-39)
            if (r1 == r2) goto L21
            r2 = 3611910(0x371d06, float:5.061364E-39)
            if (r1 == r2) goto L17
            goto L35
        L17:
            java.lang.String r1 = "vaid"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L35
            r7 = r4
            goto L36
        L21:
            java.lang.String r1 = "oaid"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L35
            r7 = 0
            goto L36
        L2b:
            java.lang.String r1 = "aaid"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L35
            r7 = r3
            goto L36
        L35:
            r7 = -1
        L36:
            if (r7 == 0) goto L6a
            if (r7 == r4) goto L54
            if (r7 == r3) goto L3e
            r2 = r0
            goto L71
        L3e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r7.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r7.append(r1)     // Catch: java.lang.Throwable -> L93
            r7.append(r8)     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L93
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L93
            goto L70
        L54:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r7.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r7.append(r1)     // Catch: java.lang.Throwable -> L93
            r7.append(r8)     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L93
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L93
            goto L70
        L6a:
            java.lang.String r7 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L93
        L70:
            r2 = r7
        L71:
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L93
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L93
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L90
            java.lang.String r8 = "value"
            int r8 = r7.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L93
            r0 = r8
        L90:
            r7.close()     // Catch: java.lang.Throwable -> L93
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.cl.a(java.lang.String, java.lang.String, android.content.Context):java.lang.String");
    }
}
