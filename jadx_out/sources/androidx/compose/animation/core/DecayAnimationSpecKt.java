package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import p4.l;

@i0(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u001aI\u0010\u0006\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0007*\u00020\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u0002H\u00022\u0006\u0010\f\u001a\u0002H\u0002¢\u0006\u0002\u0010\r\u001a \u0010\u0006\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000f¨\u0006\u0010"}, d2 = {"exponentialDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "frictionMultiplier", "", "absVelocityThreshold", "calculateTargetValue", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "generateDecayAnimationSpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final <T, V extends AnimationVector> T calculateTargetValue(@l DecayAnimationSpec<T> decayAnimationSpec, @l TwoWayConverter<T, V> twoWayConverter, T t5, T t6) {
        return twoWayConverter.getConvertFromVector().invoke(decayAnimationSpec.vectorize(twoWayConverter).getTargetValue(twoWayConverter.getConvertToVector().invoke(t5), twoWayConverter.getConvertToVector().invoke(t6)));
    }

    @l
    public static final <T> DecayAnimationSpec<T> exponentialDecay(@FloatRange(from = 0.0d, fromInclusive = false) float f5, @FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        return generateDecayAnimationSpec(new FloatExponentialDecaySpec(f5, f6));
    }

    public static /* synthetic */ DecayAnimationSpec exponentialDecay$default(float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.1f;
        }
        return exponentialDecay(f5, f6);
    }

    @l
    public static final <T> DecayAnimationSpec<T> generateDecayAnimationSpec(@l FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }

    public static final float calculateTargetValue(@l DecayAnimationSpec<Float> decayAnimationSpec, float f5, float f6) {
        return ((AnimationVector1D) decayAnimationSpec.vectorize(VectorConvertersKt.getVectorConverter(a0.f19382a)).getTargetValue(AnimationVectorsKt.AnimationVector(f5), AnimationVectorsKt.AnimationVector(f6))).getValue();
    }
}
