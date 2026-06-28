package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a&\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001a\u001d\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a%\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", com.alipay.sdk.m.x.c.f3016c, "Landroidx/compose/animation/core/AnimationVector1D;", "AnimationVector", com.alipay.sdk.m.x.c.f3017d, "Landroidx/compose/animation/core/AnimationVector2D;", "v3", "Landroidx/compose/animation/core/AnimationVector3D;", "v4", "Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "T", "newInstance", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copy", "source", "Lkotlin/r2;", "copyFrom", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimationVectorsKt {
    @l
    public static final AnimationVector1D AnimationVector(float f5) {
        return new AnimationVector1D(f5);
    }

    @l
    public static final <T extends AnimationVector> T copy(@l T t5) {
        T t6 = (T) newInstance(t5);
        int size$animation_core_release = t6.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            t6.set$animation_core_release(i5, t5.get$animation_core_release(i5));
        }
        return t6;
    }

    public static final <T extends AnimationVector> void copyFrom(@l T t5, @l T t6) {
        int size$animation_core_release = t5.getSize$animation_core_release();
        for (int i5 = 0; i5 < size$animation_core_release; i5++) {
            t5.set$animation_core_release(i5, t6.get$animation_core_release(i5));
        }
    }

    @l
    public static final <T extends AnimationVector> T newInstance(@l T t5) {
        T t6 = (T) t5.newVector$animation_core_release();
        l0.n(t6, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t6;
    }

    @l
    public static final AnimationVector2D AnimationVector(float f5, float f6) {
        return new AnimationVector2D(f5, f6);
    }

    @l
    public static final AnimationVector3D AnimationVector(float f5, float f6, float f7) {
        return new AnimationVector3D(f5, f6, f7);
    }

    @l
    public static final AnimationVector4D AnimationVector(float f5, float f6, float f7, float f8) {
        return new AnimationVector4D(f5, f6, f7, f8);
    }
}
