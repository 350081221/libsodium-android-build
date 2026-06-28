package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isSwipeMostlyHorizontal(float f5, float f6) {
        return Math.abs(f5) > Math.abs(f6);
    }
}
