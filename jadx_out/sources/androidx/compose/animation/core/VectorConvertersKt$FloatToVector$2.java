package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke", "(Landroidx/compose/animation/core/AnimationVector1D;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$FloatToVector$2 extends n0 implements l<AnimationVector1D, Float> {
    public static final VectorConvertersKt$FloatToVector$2 INSTANCE = new VectorConvertersKt$FloatToVector$2();

    VectorConvertersKt$FloatToVector$2() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Float invoke(@p4.l AnimationVector1D animationVector1D) {
        return Float.valueOf(animationVector1D.getValue());
    }
}
