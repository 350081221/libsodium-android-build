package com.lody.virtual.helper.compat;

import mirror.RefStaticInt;
import mirror.android.os.StrictMode;

/* loaded from: classes3.dex */
public class StrictModeCompat {
    public static int DETECT_VM_FILE_URI_EXPOSURE;
    public static int PENALTY_DEATH_ON_FILE_URI_EXPOSURE;

    static {
        int i5;
        int i6;
        RefStaticInt refStaticInt = StrictMode.DETECT_VM_FILE_URI_EXPOSURE;
        if (refStaticInt == null) {
            i5 = 8192;
        } else {
            i5 = refStaticInt.get();
        }
        DETECT_VM_FILE_URI_EXPOSURE = i5;
        RefStaticInt refStaticInt2 = StrictMode.PENALTY_DEATH_ON_FILE_URI_EXPOSURE;
        if (refStaticInt2 == null) {
            i6 = 67108864;
        } else {
            i6 = refStaticInt2.get();
        }
        PENALTY_DEATH_ON_FILE_URI_EXPOSURE = i6;
    }

    public static boolean disableDeathOnFileUriExposure() {
        try {
            try {
                StrictMode.disableDeathOnFileUriExposure.call(new Object[0]);
                return true;
            } catch (Throwable unused) {
                StrictMode.sVmPolicyMask.set(StrictMode.sVmPolicyMask.get() & (~(DETECT_VM_FILE_URI_EXPOSURE | PENALTY_DEATH_ON_FILE_URI_EXPOSURE)));
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
