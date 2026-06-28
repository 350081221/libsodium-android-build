package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/DpOffset;", "invoke-jo-Fl9I", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$1 extends n0 implements l<DpOffset, AnimationVector2D> {
    public static final VectorConvertersKt$DpOffsetToVector$1 INSTANCE = new VectorConvertersKt$DpOffsetToVector$1();

    VectorConvertersKt$DpOffsetToVector$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(DpOffset dpOffset) {
        return m156invokejoFl9I(dpOffset.m6113unboximpl());
    }

    @p4.l
    /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
    public final AnimationVector2D m156invokejoFl9I(long j5) {
        return new AnimationVector2D(DpOffset.m6105getXD9Ej5fM(j5), DpOffset.m6107getYD9Ej5fM(j5));
    }
}
