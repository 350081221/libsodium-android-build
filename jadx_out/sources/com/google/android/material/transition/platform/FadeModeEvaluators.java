package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes2.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f6, f7, f5));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f6, f7, f5), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f6, f7, f5), TransitionUtils.lerp(0, 255, f6, f7, f5));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public FadeModeResult evaluate(float f5, float f6, float f7, float f8) {
            float f9 = ((f7 - f6) * f8) + f6;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f6, f9, f5), TransitionUtils.lerp(0, 255, f9, f7, f5));
        }
    };

    private FadeModeEvaluators() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeEvaluator get(int i5, boolean z4) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return THROUGH;
                    }
                    throw new IllegalArgumentException("Invalid fade mode: " + i5);
                }
                return CROSS;
            }
            if (z4) {
                return OUT;
            }
            return IN;
        }
        if (z4) {
            return IN;
        }
        return OUT;
    }
}
