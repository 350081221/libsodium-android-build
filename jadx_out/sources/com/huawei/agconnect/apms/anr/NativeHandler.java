package com.huawei.agconnect.apms.anr;

import android.os.Build;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.lmn;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class NativeHandler extends lmn {
    public static NativeHandler efg;

    public NativeHandler() {
        this.bcd = new HashSet();
    }

    public static void anrCallback(String str) {
        if (Agent.isDisabled()) {
            return;
        }
        bcd().abc(str);
    }

    public static NativeHandler bcd() {
        if (efg == null) {
            efg = new NativeHandler();
        }
        return efg;
    }

    public static native int initNativeAnr(int i5, String str, String str2, int i6, int i7, int i8);

    public void abc(boolean z4, String str, String str2) {
        if (!Agent.isDisabled() && z4) {
            int i5 = Build.VERSION.SDK_INT;
            try {
                System.loadLibrary("apms_ndk_anr");
                try {
                    int initNativeAnr = initNativeAnr(i5, str, str2, 50, 50, 200);
                    if (initNativeAnr != 0) {
                        lmn.cde.error("fail to init native anr, code: " + initNativeAnr);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    abc.abc(th, abc.abc("fail to init native anr, "), lmn.cde);
                    return;
                }
            } catch (Throwable th2) {
                abc.abc(th2, abc.abc("fail to load apm anr so library, "), lmn.cde);
                return;
            }
        }
        lmn.cde.warn("APMS agent or anr monitor is disabled, please enable.");
    }
}
