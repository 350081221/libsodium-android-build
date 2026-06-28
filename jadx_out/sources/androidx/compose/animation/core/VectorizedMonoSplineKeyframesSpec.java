package androidx.compose.animation.core;

import androidx.collection.IntList;
import androidx.collection.IntObjectMap;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@ExperimentalAnimationSpecApi
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "Lkotlin/r2;", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "Landroidx/collection/IntList;", "timestamps", "Landroidx/collection/IntList;", "Landroidx/collection/IntObjectMap;", "keyframes", "Landroidx/collection/IntObjectMap;", "", "durationMillis", "I", "getDurationMillis", "()I", "delayMillis", "getDelayMillis", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "lastInitialValue", "lastTargetValue", "Landroidx/compose/animation/core/MonoSpline;", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "<init>", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;II)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,127:1\n266#2,6:128\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n68#1:128,6\n*E\n"})
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;

    @l
    private final IntObjectMap<V> keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;

    @l
    private final IntList timestamps;
    private V valueVector;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(@l IntList intList, @l IntObjectMap<V> intObjectMap, int i5, int i6) {
        this.timestamps = intList;
        this.keyframes = intObjectMap;
        this.durationMillis = i5;
        this.delayMillis = i6;
    }

    private final void init(V v4, V v5, V v6) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v4);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v6);
        }
        if (this.monoSpline != null) {
            V v7 = this.lastInitialValue;
            V v8 = null;
            if (v7 == null) {
                l0.S("lastInitialValue");
                v7 = null;
            }
            if (l0.g(v7, v4)) {
                V v9 = this.lastTargetValue;
                if (v9 == null) {
                    l0.S("lastTargetValue");
                } else {
                    v8 = v9;
                }
                if (l0.g(v8, v5)) {
                    return;
                }
            }
        }
        this.lastInitialValue = v4;
        this.lastTargetValue = v5;
        int size = this.keyframes.getSize() + 2;
        float[] fArr = new float[size];
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new float[v4.getSize$animation_core_release()]);
        }
        fArr[0] = 0.0f;
        int i6 = size - 1;
        float f5 = (float) 1000;
        fArr[i6] = getDurationMillis() / f5;
        float[] fArr2 = (float[]) arrayList.get(0);
        float[] fArr3 = (float[]) arrayList.get(i6);
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i7 = 0; i7 < size$animation_core_release; i7++) {
            fArr2[i7] = v4.get$animation_core_release(i7);
            fArr3[i7] = v5.get$animation_core_release(i7);
        }
        IntList intList = this.timestamps;
        int[] iArr = intList.content;
        int i8 = intList._size;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            V v10 = this.keyframes.get(i10);
            l0.m(v10);
            V v11 = v10;
            i9++;
            fArr[i9] = i10 / f5;
            float[] fArr4 = (float[]) arrayList.get(i9);
            int length = fArr4.length;
            for (int i11 = 0; i11 < length; i11++) {
                fArr4[i11] = v11.get$animation_core_release(i11);
            }
        }
        this.monoSpline = new MonoSpline(fArr, arrayList);
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
        int clampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, j5 / AnimationKt.MillisToNanos);
        if (this.keyframes.containsKey(clampPlayTime)) {
            V v7 = this.keyframes.get(clampPlayTime);
            l0.m(v7);
            return v7;
        }
        if (clampPlayTime >= getDurationMillis()) {
            return v5;
        }
        if (clampPlayTime <= 0) {
            return v4;
        }
        init(v4, v5, v6);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            l0.S("monoSpline");
            monoSpline = null;
        }
        float f5 = clampPlayTime / ((float) 1000);
        V v8 = this.valueVector;
        if (v8 == null) {
            l0.S("valueVector");
            v8 = null;
        }
        monoSpline.getPos(f5, v8);
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
        long clampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, j5 / AnimationKt.MillisToNanos);
        if (clampPlayTime < 0) {
            return v6;
        }
        init(v4, v5, v6);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            l0.S("monoSpline");
            monoSpline = null;
        }
        float f5 = ((float) clampPlayTime) / ((float) 1000);
        V v7 = this.velocityVector;
        if (v7 == null) {
            l0.S("velocityVector");
            v7 = null;
        }
        monoSpline.getSlope(f5, v7);
        V v8 = this.velocityVector;
        if (v8 == null) {
            l0.S("velocityVector");
            return null;
        }
        return v8;
    }

    public /* synthetic */ VectorizedMonoSplineKeyframesSpec(IntList intList, IntObjectMap intObjectMap, int i5, int i6, int i7, w wVar) {
        this(intList, intObjectMap, i5, (i7 & 8) != 0 ? 0 : i6);
    }
}
