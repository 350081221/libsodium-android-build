package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends n0 implements l<Offset, AnimationVector2D> {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 INSTANCE = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
        return m998invokek4lQ0M(offset.m3503unboximpl());
    }

    @p4.l
    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final AnimationVector2D m998invokek4lQ0M(long j5) {
        AnimationVector2D animationVector2D;
        if (OffsetKt.m3512isSpecifiedk4lQ0M(j5)) {
            return new AnimationVector2D(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
        }
        animationVector2D = SelectionMagnifierKt.UnspecifiedAnimationVector2D;
        return animationVector2D;
    }
}
