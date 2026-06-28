package com.huawei.agconnect.apms;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b2 {
    public static final Map<String, a2> abc = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[Catch: all -> 0x007d, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x0012, B:12:0x0052, B:14:0x005e, B:17:0x006a, B:21:0x0078, B:26:0x001d, B:28:0x0025, B:31:0x0030, B:33:0x0038), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized v1.a abc(android.content.Context r4, com.huawei.agconnect.apms.c2 r5) {
        /*
            java.lang.Class<com.huawei.agconnect.apms.b2> r0 = com.huawei.agconnect.apms.b2.class
            monitor-enter(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L7d
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L7d
            r3 = 0
            if (r1 == r2) goto L16
            java.lang.String r1 = "HAInstanceManager"
            java.lang.String r2 = "init must be called in the main thread"
        L12:
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> L7d
            goto L4d
        L16:
            if (r4 != 0) goto L1d
            java.lang.String r1 = "HAInstanceManager"
            java.lang.String r2 = "context cannot be null to init HiAnalyticsInstanceEx."
            goto L12
        L1d:
            java.lang.String r1 = r5.abc     // Catch: java.lang.Throwable -> L7d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L48
            java.lang.String r1 = r5.abc     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L7d
            r2 = 256(0x100, float:3.59E-43)
            if (r1 <= r2) goto L30
            goto L48
        L30:
            java.lang.String r1 = r5.bcd     // Catch: java.lang.Throwable -> L7d
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L43
            java.lang.String r1 = r5.bcd     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L7d
            if (r1 <= r2) goto L41
            goto L43
        L41:
            r3 = 1
            goto L4d
        L43:
            java.lang.String r1 = "HAInstanceManager"
            java.lang.String r2 = "httpheader check failed"
            goto L12
        L48:
            java.lang.String r1 = "HAInstanceManager"
            java.lang.String r2 = "serviceTag check failed"
            goto L12
        L4d:
            if (r3 != 0) goto L52
            monitor-exit(r0)
            r4 = 0
            return r4
        L52:
            java.util.Map<java.lang.String, com.huawei.agconnect.apms.a2> r1 = com.huawei.agconnect.apms.b2.abc     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r5.abc     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L7d
            com.huawei.agconnect.apms.a2 r2 = (com.huawei.agconnect.apms.a2) r2     // Catch: java.lang.Throwable -> L7d
            if (r2 != 0) goto L6a
            com.huawei.agconnect.apms.a2 r2 = new com.huawei.agconnect.apms.a2     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = r5.abc     // Catch: java.lang.Throwable -> L7d
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)
            return r2
        L6a:
            java.lang.String r1 = r5.cde     // Catch: java.lang.Throwable -> L7d
            com.huawei.agconnect.apms.c2 r3 = r2.bcd     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = r3.cde     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L78
            monitor-exit(r0)
            return r2
        L78:
            r2.abc(r4, r5)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r0)
            return r2
        L7d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.b2.abc(android.content.Context, com.huawei.agconnect.apms.c2):v1.a");
    }
}
