package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "size", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke", "(ILandroidx/compose/ui/unit/LayoutDirection;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Arrangement$spacedBy$2 extends n0 implements p<Integer, LayoutDirection, Integer> {
    final /* synthetic */ Alignment.Horizontal $alignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$spacedBy$2(Alignment.Horizontal horizontal) {
        super(2);
        this.$alignment = horizontal;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
        return invoke(num.intValue(), layoutDirection);
    }

    @l
    public final Integer invoke(int i5, @l LayoutDirection layoutDirection) {
        return Integer.valueOf(this.$alignment.align(0, i5, layoutDirection));
    }
}
