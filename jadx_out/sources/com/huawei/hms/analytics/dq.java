package com.huawei.hms.analytics;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes3.dex */
public final class dq {
    private static final dq lmn = new dq();
    private boolean klm = false;

    public static dq lmn() {
        return lmn;
    }

    public final boolean lmn(Context context) {
        if (!this.klm) {
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.klm = userManager.isUserUnlocked();
            } else {
                this.klm = false;
            }
        }
        return this.klm;
    }
}
