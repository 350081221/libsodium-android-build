package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0010\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "floatDecaySpec", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(Landroidx/compose/animation/core/FloatDecayAnimationSpec;)V", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getFloatDecaySpec", "()Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "targetVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;

    @l
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(@l FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(@l V v4, @l V v5) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v6 = this.velocityVector;
        if (v6 == null) {
            l0.S("velocityVector");
            v6 = null;
        }
        int size$animation_core_release = v6.getSize$animation_core_release();
        long j5 = 0;
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            j5 = Math.max(j5, this.floatDecaySpec.getDurationNanos(v4.get$animation_core_release(i5), v5.get$animation_core_release(i5)));
        }
        return j5;
    }

    @l
    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @l
    public V getTargetValue(@l V v4, @l V v5) {
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v6 = this.targetVector;
        if (v6 == null) {
            l0.S("targetVector");
            v6 = null;
        }
        int size$animation_core_release = v6.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            V v7 = this.targetVector;
            if (v7 == null) {
                l0.S("targetVector");
                v7 = null;
            }
            v7.set$animation_core_release(i5, this.floatDecaySpec.getTargetValue(v4.get$animation_core_release(i5), v5.get$animation_core_release(i5)));
        }
        V v8 = this.targetVector;
        if (v8 == null) {
            l0.S("targetVector");
            return null;
        }
        return v8;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @l
    public V getValueFromNanos(long j5, @l V v4, @l V v5) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v6 = this.valueVector;
        if (v6 == null) {
            l0.S("valueVector");
            v6 = null;
        }
        int size$animation_core_release = v6.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            V v7 = this.valueVector;
            if (v7 == null) {
                l0.S("valueVector");
                v7 = null;
            }
            v7.set$animation_core_release(i5, this.floatDecaySpec.getValueFromNanos(j5, v4.get$animation_core_release(i5), v5.get$animation_core_release(i5)));
        }
        V v8 = this.valueVector;
        if (v8 == null) {
            l0.S("valueVector");
            return null;
        }
        return v8;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @l
    public V getVelocityFromNanos(long j5, @l V v4, @l V v5) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v6 = this.velocityVector;
        if (v6 == null) {
            l0.S("velocityVector");
            v6 = null;
        }
        int size$animation_core_release = v6.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            V v7 = this.velocityVector;
            if (v7 == null) {
                l0.S("velocityVector");
                v7 = null;
            }
            v7.set$animation_core_release(i5, this.floatDecaySpec.getVelocityFromNanos(j5, v4.get$animation_core_release(i5), v5.get$animation_core_release(i5)));
        }
        V v8 = this.velocityVector;
        if (v8 == null) {
            l0.S("velocityVector");
            return null;
        }
        return v8;
    }
}
