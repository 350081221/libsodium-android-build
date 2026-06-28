package com.huawei.hms.analytics;

import android.content.Context;
import com.huawei.hms.analytics.az;

/* loaded from: classes3.dex */
public final class cj {
    private static boolean klm = false;
    public final bh lmn;

    public cj(String str) {
        this.lmn = fgh.lmn().lmn(str);
    }

    public static az lmn() {
        if (klm) {
            return null;
        }
        Context context = ar.lmn().lmn.ghi;
        if (z.lmn() || z.klm()) {
            return new az.lmn(context);
        }
        if (z.ghi() || z.ijk()) {
            return new az.klm(context);
        }
        if (z.ikl()) {
            return new az.ikl();
        }
        if (z.hij()) {
            return new az.ijk(context);
        }
        klm = true;
        return null;
    }
}
