package com.huawei.hms.analytics;

import android.os.Bundle;
import com.huawei.hms.analytics.efg;
import com.huawei.hms.analytics.type.HAParamType;

/* loaded from: classes3.dex */
public final class j extends efg.lmn {
    private bh klm;
    String lmn;

    public j(bh bhVar) {
        this.klm = bhVar;
    }

    private static Bundle lmn(Bundle bundle) {
        String str;
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                if ("$HA_METHOD".equals(str2)) {
                    str = HAParamType.CHANNEL;
                } else if ("$HA_RESULT".equals(str2)) {
                    str = HAParamType.EVTRESULT;
                }
                bundle2.putString(str, bundle.getString(str2));
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[SYNTHETIC] */
    @Override // com.huawei.hms.analytics.efg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lmn(java.util.List<com.huawei.hms.analytics.CustomEvent> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "$HA_LOGIN"
            com.huawei.hms.analytics.ar r1 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r1 = r1.lmn
            boolean r1 = r1.fgh
            r2 = -1
            java.lang.String r3 = "ServiceRingback"
            if (r1 != 0) goto L15
            java.lang.String r12 = "isAnalyticsEnabled is false"
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r12)
            return r2
        L15:
            boolean r1 = com.huawei.hms.analytics.ba.lmn()
            if (r1 != 0) goto L29
            java.lang.String r1 = r11.lmn
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L29
            java.lang.String r12 = "opennessInitComplete is false"
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r12)
            return r2
        L29:
            java.lang.String r1 = "ServiceCallback#handleCustomEvent(List<CustomEvent>)"
            com.huawei.hms.analytics.cc r4 = com.huawei.hms.analytics.cd.lmn(r1)
            r4.ikl = r1
            if (r12 == 0) goto Ldf
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto Ldf
            com.huawei.hms.analytics.bh r1 = r11.klm
            if (r1 != 0) goto L3f
            goto Ldf
        L3f:
            java.lang.String r1 = "events got"
            com.huawei.hms.analytics.core.log.HiLog.i(r3, r1)
            java.lang.String r1 = r11.lmn     // Catch: java.lang.RuntimeException -> Ld6
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.RuntimeException -> Ld6
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.RuntimeException -> Ld6
            r5.<init>()     // Catch: java.lang.RuntimeException -> Ld6
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.RuntimeException -> Ld6
        L53:
            boolean r6 = r12.hasNext()     // Catch: java.lang.RuntimeException -> Ld6
            r7 = 0
            if (r6 == 0) goto Lc1
            java.lang.Object r6 = r12.next()     // Catch: java.lang.RuntimeException -> Ld6
            com.huawei.hms.analytics.CustomEvent r6 = (com.huawei.hms.analytics.CustomEvent) r6     // Catch: java.lang.RuntimeException -> Ld6
            java.lang.String r8 = r6.lmn     // Catch: java.lang.RuntimeException -> Ld6
            com.huawei.hms.analytics.ar r9 = com.huawei.hms.analytics.ar.lmn()     // Catch: java.lang.RuntimeException -> Ld6
            com.huawei.hms.analytics.at r9 = r9.lmn     // Catch: java.lang.RuntimeException -> Ld6
            android.content.Context r9 = r9.ghi     // Catch: java.lang.RuntimeException -> Ld6
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.RuntimeException -> Ld6
            boolean r8 = r8.equals(r9)     // Catch: java.lang.RuntimeException -> Ld6
            if (r8 == 0) goto L53
            java.lang.String r8 = r6.klm     // Catch: java.lang.RuntimeException -> Ld6
            android.os.Bundle r6 = r6.ikl     // Catch: java.lang.RuntimeException -> Ld6
            boolean r9 = r0.equals(r8)     // Catch: java.lang.RuntimeException -> Ld6
            java.lang.String r10 = "$HA_LOGOUT"
            if (r9 != 0) goto L89
            boolean r9 = r10.equals(r8)     // Catch: java.lang.RuntimeException -> Ld6
            if (r9 == 0) goto L87
            goto L89
        L87:
            r9 = r8
            goto La0
        L89:
            boolean r9 = r0.equals(r8)     // Catch: java.lang.RuntimeException -> Ld6
            if (r9 == 0) goto L92
            java.lang.String r9 = "$SignIn"
            goto L9c
        L92:
            boolean r9 = r10.equals(r8)     // Catch: java.lang.RuntimeException -> Ld6
            if (r9 == 0) goto L9b
            java.lang.String r9 = "$SignOut"
            goto L9c
        L9b:
            r9 = 0
        L9c:
            android.os.Bundle r6 = lmn(r6)     // Catch: java.lang.RuntimeException -> Ld6
        La0:
            com.huawei.hms.analytics.dj r10 = new com.huawei.hms.analytics.dj     // Catch: java.lang.RuntimeException -> Ld6
            r10.<init>(r9, r7)     // Catch: java.lang.RuntimeException -> Ld6
            boolean r6 = r10.lmn(r6)     // Catch: java.lang.RuntimeException -> Ld6
            if (r6 != 0) goto Lb1
            java.lang.String r6 = "bundle params is invalid."
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r6)     // Catch: java.lang.RuntimeException -> Ld6
            goto L53
        Lb1:
            if (r1 == 0) goto Lbd
            com.huawei.hms.analytics.bh r6 = r11.klm     // Catch: java.lang.RuntimeException -> Ld6
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.RuntimeException -> Ld6
            r6.lmn(r9, r10, r7)     // Catch: java.lang.RuntimeException -> Ld6
            goto L53
        Lbd:
            r5.put(r8, r10)     // Catch: java.lang.RuntimeException -> Ld6
            goto L53
        Lc1:
            if (r1 != 0) goto Lce
            com.huawei.hms.analytics.bh r12 = r11.klm     // Catch: java.lang.RuntimeException -> Ld6
            java.lang.String r0 = r11.lmn     // Catch: java.lang.RuntimeException -> Ld6
            r12.lmn(r0, r5)     // Catch: java.lang.RuntimeException -> Ld6
            java.lang.String r12 = ""
            r11.lmn = r12     // Catch: java.lang.RuntimeException -> Ld6
        Lce:
            java.lang.String r12 = "0"
            r4.lmn = r12
            com.huawei.hms.analytics.cd.lmn(r4)
            return r7
        Ld6:
            java.lang.String r12 = "handleCustomEvent RuntimeException"
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r12)
            com.huawei.hms.analytics.cd.lmn(r4)
            return r2
        Ldf:
            java.lang.String r12 = "events empty"
            com.huawei.hms.analytics.core.log.HiLog.w(r3, r12)
            com.huawei.hms.analytics.cd.lmn(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.j.lmn(java.util.List):int");
    }
}
