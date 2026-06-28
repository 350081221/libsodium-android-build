package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$FloatToVector$1 extends n0 implements l<Float, AnimationVector1D> {
    public static final VectorConvertersKt$FloatToVector$1 INSTANCE = new VectorConvertersKt$FloatToVector$1();

    VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    @p4.l
    public final AnimationVector1D invoke(float f5) {
        return new AnimationVector1D(f5);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ AnimationVector1D invoke(Float f5) {
        return invoke(f5.floatValue());
    }
}
