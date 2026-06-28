package com.huawei.hms.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class bb extends aq {
    public bb(Context context) {
        super(context, "global_v2", "common_prop");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.huawei.hms.analytics.aq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lmn() {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r5.ikl
            if (r0 != 0) goto L58
            java.lang.String r0 = r5.ijk()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "userPro"
            if (r1 == 0) goto L16
            java.lang.String r0 = "commonprop is empty"
            com.huawei.hms.analytics.core.log.HiLog.i(r2, r0)
            goto L58
        L16:
            com.huawei.hms.analytics.bo r1 = com.huawei.hms.analytics.bo.lmn()
            java.lang.String r1 = r1.klm()
            java.lang.String r3 = com.huawei.hms.analytics.aq.lmn(r1, r0)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L3c
            java.lang.String r3 = com.huawei.hms.analytics.core.crypto.AesCipher.decryptCbc(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L35
            java.lang.String r0 = ""
            goto L3d
        L35:
            java.lang.String r0 = com.huawei.hms.analytics.aq.klm(r1, r3)
            r5.lmn(r0)
        L3c:
            r0 = r3
        L3d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4c
            java.lang.String r0 = "customParams is error"
        L45:
            com.huawei.hms.analytics.core.log.HiLog.i(r2, r0)
            r5.hij()
            goto L58
        L4c:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L55
            r1.<init>(r0)     // Catch: org.json.JSONException -> L55
            r5.lmn(r1)     // Catch: org.json.JSONException -> L55
            goto L58
        L55:
            java.lang.String r0 = "cache user properties is no json"
            goto L45
        L58:
            super.lmn()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.bb.lmn():void");
    }

    @Override // com.huawei.hms.analytics.aq
    public final void lmn(Bundle bundle) {
    }

    @Override // com.huawei.hms.analytics.aq
    public final void lmn(String str, Object obj) {
        if (this.ikl == null) {
            this.ikl = new ConcurrentHashMap<>();
        }
        if (this.ikl.size() == 0 && obj == null) {
            return;
        }
        if (obj == null) {
            this.ikl.remove(str);
        } else if (lmn(25)) {
            this.ikl.put(str, obj);
        }
        String fgh = fgh();
        if (TextUtils.isEmpty(fgh)) {
            return;
        }
        lmn(aq.klm(bo.lmn().klm(), fgh));
    }
}
