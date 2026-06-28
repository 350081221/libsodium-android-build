package com.huawei.hms.analytics;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.analytics.i;

/* loaded from: classes3.dex */
public final class ai extends ad {
    /* JADX INFO: Access modifiers changed from: protected */
    public ai(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r1 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String ijk() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            android.content.Context r2 = r9.klm     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r1 == 0) goto L2b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r2 == 0) goto L2b
            java.lang.String r2 = "value"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r2 < 0) goto L2b
            java.lang.String r0 = r1.getString(r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
        L2b:
            if (r1 == 0) goto L3d
        L2d:
            r1.close()
            goto L3d
        L31:
            r0 = move-exception
            goto L3e
        L33:
            java.lang.String r2 = "vvOaid"
            java.lang.String r3 = "contentResolver query exception"
            com.huawei.hms.analytics.core.log.HiLog.w(r2, r3)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L3d
            goto L2d
        L3d:
            return r0
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.ai.ijk():java.lang.String");
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Override // com.huawei.hms.analytics.ad
    public final void lmn() {
        String ijk = ijk();
        if (TextUtils.isEmpty(ijk)) {
            lmn("oaid is empty, begin get gaid");
        } else {
            this.lmn.lmn(ijk, "", "oaid");
        }
    }
}
