package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Dp;", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke-u2uoSUM", "(Landroidx/compose/animation/core/AnimationVector1D;)F"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$DpToVector$2 extends n0 implements l<AnimationVector1D, Dp> {
    public static final VectorConvertersKt$DpToVector$2 INSTANCE = new VectorConvertersKt$DpToVector$2();

    VectorConvertersKt$DpToVector$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Dp invoke(AnimationVector1D animationVector1D) {
        return Dp.m6042boximpl(m159invokeu2uoSUM(animationVector1D));
    }

    /* renamed from: invoke-u2uoSUM, reason: not valid java name */
    public final float m159invokeu2uoSUM(@p4.l AnimationVector1D animationVector1D) {
        return Dp.m6044constructorimpl(animationVector1D.getValue());
    }
}
