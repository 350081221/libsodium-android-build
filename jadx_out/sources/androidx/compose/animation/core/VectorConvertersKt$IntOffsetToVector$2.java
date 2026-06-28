package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-Bjo55l4", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$2 extends n0 implements l<AnimationVector2D, IntOffset> {
    public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2();

    VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
        return IntOffset.m6163boximpl(m161invokeBjo55l4(animationVector2D));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m161invokeBjo55l4(@p4.l AnimationVector2D animationVector2D) {
        int L0;
        int L02;
        L0 = kotlin.math.d.L0(animationVector2D.getV1());
        L02 = kotlin.math.d.L0(animationVector2D.getV2());
        return IntOffsetKt.IntOffset(L0, L02);
    }
}
