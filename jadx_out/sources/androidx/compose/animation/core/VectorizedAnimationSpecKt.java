package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a1\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\fH\u0000\u001a9\u0010\u000f\u001a\u00020\f\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u00102\u0006\u0010\u0011\u001a\u0002H\u00042\u0006\u0010\u0012\u001a\u0002H\u00042\u0006\u0010\u0013\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u0014\u001aA\u0010\u0015\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u0005*\b\u0012\u0004\u0012\u0002H\u00040\u00102\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u0002H\u00042\u0006\u0010\u0018\u001a\u0002H\u00042\u0006\u0010\u0019\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"InfiniteIterations", "", "createSpringAnimations", "Landroidx/compose/animation/core/Animations;", "V", "Landroidx/compose/animation/core/AnimationVector;", "visibilityThreshold", "dampingRatio", "", "stiffness", "(Landroidx/compose/animation/core/AnimationVector;FF)Landroidx/compose/animation/core/Animations;", "clampPlayTime", "", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "playTime", "getDurationMillis", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getValueFromMillis", "playTimeMillis", "start", "end", "startVelocity", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedAnimationSpecKt {
    private static final int InfiniteIterations = Integer.MAX_VALUE;

    public static final /* synthetic */ Animations access$createSpringAnimations(AnimationVector animationVector, float f5, float f6) {
        return createSpringAnimations(animationVector, f5, f6);
    }

    public static final long clampPlayTime(@l VectorizedDurationBasedAnimationSpec<?> vectorizedDurationBasedAnimationSpec, long j5) {
        long K;
        K = u.K(j5 - vectorizedDurationBasedAnimationSpec.getDelayMillis(), 0L, vectorizedDurationBasedAnimationSpec.getDurationMillis());
        return K;
    }

    public static final <V extends AnimationVector> Animations createSpringAnimations(V v4, float f5, float f6) {
        if (v4 != null) {
            return new Animations(v4, f5, f6) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1

                @l
                private final List<FloatSpringSpec> anims;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
                {
                    kotlin.ranges.l W1;
                    int Y;
                    W1 = u.W1(0, v4.getSize$animation_core_release());
                    Y = x.Y(W1, 10);
                    ArrayList arrayList = new ArrayList(Y);
                    Iterator<Integer> it = W1.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new FloatSpringSpec(f5, f6, v4.get$animation_core_release(((s0) it).nextInt())));
                    }
                    this.anims = arrayList;
                }

                @Override // androidx.compose.animation.core.Animations
                @l
                public FloatSpringSpec get(int i5) {
                    return this.anims.get(i5);
                }
            };
        }
        return new Animations(f5, f6) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2

            @l
            private final FloatSpringSpec anim;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.anim = new FloatSpringSpec(f5, f6, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            @l
            public FloatSpringSpec get(int i5) {
                return this.anim;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(@l VectorizedAnimationSpec<V> vectorizedAnimationSpec, @l V v4, @l V v5, @l V v6) {
        return vectorizedAnimationSpec.getDurationNanos(v4, v5, v6) / AnimationKt.MillisToNanos;
    }

    @l
    public static final <V extends AnimationVector> V getValueFromMillis(@l VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j5, @l V v4, @l V v5, @l V v6) {
        return vectorizedAnimationSpec.getValueFromNanos(j5 * AnimationKt.MillisToNanos, v4, v5, v6);
    }
}
