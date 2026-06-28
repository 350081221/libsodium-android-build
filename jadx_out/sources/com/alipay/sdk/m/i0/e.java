package com.alipay.sdk.m.i0;

import android.content.BroadcastReceiver;

/* loaded from: classes2.dex */
public final class e extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r0 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (android.text.TextUtils.equals(r6.getStringExtra("openIdPackage"), r5.getPackageName()) != false) goto L16;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L87
            if (r6 != 0) goto L6
            goto L87
        L6:
            java.lang.String r0 = "openIdNotifyFlag"
            r1 = 0
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "shouldUpdateId, notifyFlag : "
            java.lang.String r2 = r3.concat(r2)
            f0.e.e(r2)
            r2 = 1
            if (r0 != r2) goto L2e
            java.lang.String r0 = "openIdPackage"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L45
            goto L44
        L2e:
            r3 = 2
            if (r0 != r3) goto L42
            java.lang.String r0 = "openIdPackageList"
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L45
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = r0.contains(r5)
            goto L45
        L42:
            if (r0 != 0) goto L45
        L44:
            r1 = r2
        L45:
            if (r1 != 0) goto L48
            return
        L48:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            f0.e r6 = f0.e.b()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5d
            f0.a r5 = r6.f16063b
            goto L81
        L5d:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L69
            f0.a r5 = r6.f16065d
            goto L81
        L69:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L74
            f0.a r5 = r6.f16064c
            goto L81
        L74:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L80
            f0.a r5 = r6.f16062a
            goto L81
        L80:
            r5 = 0
        L81:
            if (r5 != 0) goto L84
            return
        L84:
            r5.e()
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.i0.e.onReceive(android.content.Context, android.content.Intent):void");
    }
}
