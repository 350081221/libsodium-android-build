package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/Density;", "invoke-Bjo55l4", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwitchKt$SwitchImpl$1$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Density, IntOffset> {
    final /* synthetic */ float $thumbOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$1$1$1(float f5) {
        super(1);
        this.$thumbOffset = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m6163boximpl(m2339invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m2339invokeBjo55l4(@p4.l Density density) {
        int L0;
        L0 = kotlin.math.d.L0(this.$thumbOffset);
        return IntOffsetKt.IntOffset(L0, 0);
    }
}
