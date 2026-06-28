package androidx.compose.material3;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TabIndicatorOffsetNode$measure$4 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ float $offset;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$4(Placeable placeable, MeasureScope measureScope, float f5, long j5) {
        super(1);
        this.$placeable = placeable;
        this.$this_measure = measureScope;
        this.$offset = f5;
        this.$constraints = j5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, this.$this_measure.mo298roundToPx0680j_4(this.$offset), Constraints.m5999getMaxHeightimpl(this.$constraints) - this.$placeable.getHeight(), 0.0f, 4, null);
    }
}
