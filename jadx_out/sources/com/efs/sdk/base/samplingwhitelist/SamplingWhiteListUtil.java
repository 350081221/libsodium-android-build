package com.efs.sdk.base.samplingwhitelist;

/* loaded from: classes2.dex */
public class SamplingWhiteListUtil {
    private static boolean sHitWL = false;

    public static boolean isHitWL() {
        return sHitWL;
    }

    public static void setHitWL(boolean z4) {
        sHitWL = z4;
    }
}
