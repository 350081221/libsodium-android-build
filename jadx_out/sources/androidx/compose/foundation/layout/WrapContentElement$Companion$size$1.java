package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke-5SAbXVA", "(JLandroidx/compose/ui/unit/LayoutDirection;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement$Companion$size$1 extends n0 implements p<IntSize, LayoutDirection, IntOffset> {
    final /* synthetic */ Alignment $align;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$size$1(Alignment alignment) {
        super(2);
        this.$align = alignment;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize, LayoutDirection layoutDirection) {
        return IntOffset.m6163boximpl(m656invoke5SAbXVA(intSize.m6218unboximpl(), layoutDirection));
    }

    /* renamed from: invoke-5SAbXVA, reason: not valid java name */
    public final long m656invoke5SAbXVA(long j5, @l LayoutDirection layoutDirection) {
        return this.$align.mo3370alignKFBX0sM(IntSize.Companion.m6219getZeroYbymL2g(), j5, layoutDirection);
    }
}
