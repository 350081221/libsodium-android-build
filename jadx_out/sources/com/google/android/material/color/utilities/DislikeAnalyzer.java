package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        throw new UnsupportedOperationException();
    }

    public static Hct fixIfDisliked(Hct hct) {
        if (isDisliked(hct)) {
            return Hct.from(hct.getHue(), hct.getChroma(), 70.0d);
        }
        return hct;
    }

    public static boolean isDisliked(Hct hct) {
        boolean z4;
        boolean z5;
        boolean z6;
        if (Math.round(hct.getHue()) >= 90.0d && Math.round(hct.getHue()) <= 111.0d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (Math.round(hct.getChroma()) > 16.0d) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (Math.round(hct.getTone()) < 65.0d) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z4 && z5 && z6) {
            return true;
        }
        return false;
    }
}
