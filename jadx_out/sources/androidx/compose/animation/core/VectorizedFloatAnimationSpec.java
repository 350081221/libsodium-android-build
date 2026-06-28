package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "anim", "Landroidx/compose/animation/core/FloatAnimationSpec;", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "anims", "Landroidx/compose/animation/core/Animations;", "(Landroidx/compose/animation/core/Animations;)V", "endVelocityVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,818:1\n1855#2,2:819\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n809#1:819,2\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    @l
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(@l Animations animations) {
        this.anims = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@l V v4, @l V v5, @l V v6) {
        kotlin.ranges.l W1;
        W1 = u.W1(0, v4.getSize$animation_core_release());
        Iterator<Integer> it = W1.iterator();
        long j5 = 0;
        while (it.hasNext()) {
            int nextInt = ((s0) it).nextInt();
            j5 = Math.max(j5, this.anims.get(nextInt).getDurationNanos(v4.get$animation_core_release(nextInt), v5.get$animation_core_release(nextInt), v6.get$animation_core_release(nextInt)));
        }
        return j5;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getEndVelocity(@l V v4, @l V v5, @l V v6) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(v6);
        }
        V v7 = this.endVelocityVector;
        if (v7 == null) {
            l0.S("endVelocityVector");
            v7 = null;
        }
        int size$animation_core_release = v7.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            V v8 = this.endVelocityVector;
            if (v8 == null) {
                l0.S("endVelocityVector");
                v8 = null;
            }
            v8.set$animation_core_release(i5, this.anims.get(i5).getEndVelocity(v4.get$animation_core_release(i5), v5.get$animation_core_release(i5), v6.get$animation_core_release(i5)));
        }
        V v9 = this.endVelocityVector;
        if (v9 == null) {
            l0.S("endVelocityVector");
            return null;
        }
        return v9;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getValueFromNanos(long j5, @l V v4, @l V v5, @l V v6) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v4);
        }
        V v7 = this.valueVector;
        if (v7 == null) {
            l0.S("valueVector");
            v7 = null;
        }
        int size$animation_core_release = v7.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            V v8 = this.valueVector;
            if (v8 == null) {
                l0.S("valueVector");
                v8 = null;
            }
            v8.set$animation_core_release(i5, this.anims.get(i5).getValueFromNanos(j5, v4.get$animation_core_release(i5), v5.get$animation_core_release(i5), v6.get$animation_core_release(i5)));
        }
        V v9 = this.valueVector;
        if (v9 == null) {
            l0.S("valueVector");
            return null;
        }
        return v9;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getVelocityFromNanos(long j5, @l V v4, @l V v5, @l V v6) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v6);
        }
        V v7 = this.velocityVector;
        if (v7 == null) {
            l0.S("velocityVector");
            v7 = null;
        }
        int size$animation_core_release = v7.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            V v8 = this.velocityVector;
            if (v8 == null) {
                l0.S("velocityVector");
                v8 = null;
            }
            v8.set$animation_core_release(i5, this.anims.get(i5).getVelocityFromNanos(j5, v4.get$animation_core_release(i5), v5.get$animation_core_release(i5), v6.get$animation_core_release(i5)));
        }
        V v9 = this.velocityVector;
        if (v9 == null) {
            l0.S("velocityVector");
            return null;
        }
        return v9;
    }

    public VectorizedFloatAnimationSpec(@l final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            @l
            public FloatAnimationSpec get(int i5) {
                return FloatAnimationSpec.this;
            }
        });
    }
}
