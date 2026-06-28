package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J(\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "dampingRatio", "", "stiffness", "visibilityThreshold", "(FFF)V", "getDampingRatio", "()F", "spring", "Landroidx/compose/animation/core/SpringSimulation;", "getStiffness", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "getEndVelocity", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;

    @l
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public FloatSpringSpec(float f5, float f6, float f7) {
        this.dampingRatio = f5;
        this.stiffness = f6;
        this.visibilityThreshold = f7;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f5);
        springSimulation.setStiffness(f6);
        this.spring = springSimulation;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f5, float f6, float f7) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f8 = f5 - f6;
        float f9 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f7 / f9, f8 / f9, 1.0f) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f5, float f6, float f7) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j5, float f5, float f6, float f7) {
        long j6 = j5 / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f6);
        return Motion.m129getValueimpl(this.spring.m135updateValuesIJZedt4$animation_core_release(f5, f7, j6));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j5, float f5, float f6, float f7) {
        long j6 = j5 / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f6);
        return Motion.m130getVelocityimpl(this.spring.m135updateValuesIJZedt4$animation_core_release(f5, f7, j6));
    }

    public /* synthetic */ FloatSpringSpec(float f5, float f6, float f7, int i5, w wVar) {
        this((i5 & 1) != 0 ? 1.0f : f5, (i5 & 2) != 0 ? 1500.0f : f6, (i5 & 4) != 0 ? 0.01f : f7);
    }
}
