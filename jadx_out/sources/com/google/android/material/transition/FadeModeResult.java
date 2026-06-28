package com.google.android.material.transition;

/* loaded from: classes2.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i5, int i6, boolean z4) {
        this.startAlpha = i5;
        this.endAlpha = i6;
        this.endOnTop = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeResult endOnTop(int i5, int i6) {
        return new FadeModeResult(i5, i6, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeResult startOnTop(int i5, int i6) {
        return new FadeModeResult(i5, i6, false);
    }
}
