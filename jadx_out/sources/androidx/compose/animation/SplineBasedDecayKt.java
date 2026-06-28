package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000*\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Lkotlin/r2;", "computeSplineInfo", "T", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "", "Inflection", "F", "StartTension", "EndTension", "P1", "P2", "animation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i5) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i6 = 0; i6 < i5; i6++) {
            float f15 = i6 / i5;
            float f16 = 1.0f;
            while (true) {
                f5 = ((f16 - f13) / 2.0f) + f13;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f17 = (((f6 * 0.175f) + (f5 * P2)) * f7) + f8;
                if (Math.abs(f17 - f15) < 1.0E-5d) {
                    break;
                } else if (f17 > f15) {
                    f16 = f5;
                } else {
                    f13 = f5;
                }
            }
            float f18 = 0.5f;
            fArr[i6] = (f7 * ((f6 * 0.5f) + f5)) + f8;
            float f19 = 1.0f;
            while (true) {
                f9 = ((f19 - f14) / 2.0f) + f14;
                f10 = 1.0f - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f20 = (((f10 * f18) + f9) * f11) + f12;
                if (Math.abs(f20 - f15) >= 1.0E-5d) {
                    if (f20 > f15) {
                        f19 = f9;
                    } else {
                        f14 = f9;
                    }
                    f18 = 0.5f;
                }
            }
            fArr2[i6] = (f11 * ((f10 * 0.175f) + (f9 * P2))) + f12;
        }
        fArr2[i5] = 1.0f;
        fArr[i5] = 1.0f;
    }

    @l
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@l Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
