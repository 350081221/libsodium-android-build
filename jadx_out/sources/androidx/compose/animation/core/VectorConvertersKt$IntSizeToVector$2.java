package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-YEO4UFw", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$IntSizeToVector$2 extends n0 implements l<AnimationVector2D, IntSize> {
    public static final VectorConvertersKt$IntSizeToVector$2 INSTANCE = new VectorConvertersKt$IntSizeToVector$2();

    VectorConvertersKt$IntSizeToVector$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntSize invoke(AnimationVector2D animationVector2D) {
        return IntSize.m6206boximpl(m163invokeYEO4UFw(animationVector2D));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m163invokeYEO4UFw(@p4.l AnimationVector2D animationVector2D) {
        int L0;
        int L02;
        L0 = kotlin.math.d.L0(animationVector2D.getV1());
        L02 = kotlin.math.d.L0(animationVector2D.getV2());
        return IntSizeKt.IntSize(L0, L02);
    }
}
