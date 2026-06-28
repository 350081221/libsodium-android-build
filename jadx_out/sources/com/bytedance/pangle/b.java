package com.bytedance.pangle;

import android.os.Build;
import com.bytedance.pangle.flipped.FlippedV2Impl;
import com.bytedance.pangle.log.IZeusReporter;

/* loaded from: classes2.dex */
public final class b {
    public static void a() {
        boolean z4;
        com.bytedance.pangle.flipped.c aVar;
        GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_FLIPPED, "start");
        int i5 = Build.VERSION.SDK_INT;
        boolean z5 = false;
        if (i5 < 30 && (i5 != 29 || Build.VERSION.PREVIEW_SDK_INT <= 0)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            aVar = new FlippedV2Impl();
        } else {
            if (i5 >= 28 || (i5 == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                z5 = true;
            }
            if (z5) {
                aVar = new com.bytedance.pangle.flipped.b();
            } else {
                aVar = new com.bytedance.pangle.flipped.a();
            }
        }
        aVar.invokeHiddenApiRestrictions();
        GlobalParam.getInstance().getReporter().saveRecord(IZeusReporter.ZEUS_STAGE_FLIPPED, "finish");
    }
}
