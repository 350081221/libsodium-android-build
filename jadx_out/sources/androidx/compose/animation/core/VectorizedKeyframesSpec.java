package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.u0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", t0.b.f22420d, "Lkotlin/r2;", "init", "(Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "", "Lkotlin/u0;", "Landroidx/compose/animation/core/Easing;", "keyframes", "Ljava/util/Map;", "durationMillis", "I", "getDurationMillis", "()I", "delayMillis", "getDelayMillis", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "<init>", "(Ljava/util/Map;II)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;

    @l
    private final Map<Integer, u0<V, Easing>> keyframes;
    private V valueVector;
    private V velocityVector;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorizedKeyframesSpec(@l Map<Integer, ? extends u0<? extends V, ? extends Easing>> map, int i5, int i6) {
        this.keyframes = map;
        this.durationMillis = i5;
        this.delayMillis = i6;
    }

    private final void init(V v4) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v4);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v4);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getValueFromNanos(long j5, @l V v4, @l V v5, @l V v6) {
        Object K;
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j5 / AnimationKt.MillisToNanos);
        if (this.keyframes.containsKey(Integer.valueOf(clampPlayTime))) {
            K = a1.K(this.keyframes, Integer.valueOf(clampPlayTime));
            return (V) ((u0) K).getFirst();
        }
        if (clampPlayTime >= getDurationMillis()) {
            return v5;
        }
        if (clampPlayTime <= 0) {
            return v4;
        }
        int durationMillis = getDurationMillis();
        Easing linearEasing = EasingKt.getLinearEasing();
        int i5 = 0;
        V v7 = v4;
        int i6 = 0;
        for (Map.Entry<Integer, u0<V, Easing>> entry : this.keyframes.entrySet()) {
            int intValue = entry.getKey().intValue();
            u0<V, Easing> value = entry.getValue();
            if (clampPlayTime > intValue && intValue >= i6) {
                v7 = value.getFirst();
                linearEasing = value.getSecond();
                i6 = intValue;
            } else if (clampPlayTime < intValue && intValue <= durationMillis) {
                v5 = value.getFirst();
                durationMillis = intValue;
            }
        }
        float transform = linearEasing.transform((clampPlayTime - i6) / (durationMillis - i6));
        init(v4);
        int size$animation_core_release = v7.getSize$animation_core_release();
        while (true) {
            V v8 = null;
            if (i5 >= size$animation_core_release) {
                break;
            }
            V v9 = this.valueVector;
            if (v9 == null) {
                l0.S("valueVector");
            } else {
                v8 = v9;
            }
            v8.set$animation_core_release(i5, VectorConvertersKt.lerp(v7.get$animation_core_release(i5), v5.get$animation_core_release(i5), transform));
            i5++;
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            l0.S("valueVector");
            return null;
        }
        return v10;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public V getVelocityFromNanos(long j5, @l V v4, @l V v5, @l V v6) {
        long clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j5 / AnimationKt.MillisToNanos);
        if (clampPlayTime <= 0) {
            return v6;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime - 1, v4, v5, v6);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, clampPlayTime, v4, v5, v6);
        init(v4);
        int size$animation_core_release = valueFromMillis.getSize$animation_core_release();
        int i5 = 0;
        while (true) {
            V v7 = null;
            if (i5 >= size$animation_core_release) {
                break;
            }
            V v8 = this.velocityVector;
            if (v8 == null) {
                l0.S("velocityVector");
            } else {
                v7 = v8;
            }
            v7.set$animation_core_release(i5, (valueFromMillis.get$animation_core_release(i5) - valueFromMillis2.get$animation_core_release(i5)) * 1000.0f);
            i5++;
        }
        V v9 = this.velocityVector;
        if (v9 == null) {
            l0.S("velocityVector");
            return null;
        }
        return v9;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i5, int i6, int i7, w wVar) {
        this(map, i5, (i7 & 4) != 0 ? 0 : i6);
    }
}
