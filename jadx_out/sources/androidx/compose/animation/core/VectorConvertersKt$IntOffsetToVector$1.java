package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/IntOffset;", "invoke--gyyYBs", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$IntOffsetToVector$1 extends n0 implements l<IntOffset, AnimationVector2D> {
    public static final VectorConvertersKt$IntOffsetToVector$1 INSTANCE = new VectorConvertersKt$IntOffsetToVector$1();

    VectorConvertersKt$IntOffsetToVector$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(IntOffset intOffset) {
        return m160invokegyyYBs(intOffset.m6181unboximpl());
    }

    @p4.l
    /* renamed from: invoke--gyyYBs, reason: not valid java name */
    public final AnimationVector2D m160invokegyyYBs(long j5) {
        return new AnimationVector2D(IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(j5));
    }
}
