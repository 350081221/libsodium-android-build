package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RowColumnMeasurePolicy$measure$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ RowColumnMeasureHelperResult $measureResult;
    final /* synthetic */ RowColumnMeasurementHelper $rowColumnMeasureHelper;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowColumnMeasurePolicy$measure$1(RowColumnMeasurementHelper rowColumnMeasurementHelper, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, MeasureScope measureScope) {
        super(1);
        this.$rowColumnMeasureHelper = rowColumnMeasurementHelper;
        this.$measureResult = rowColumnMeasureHelperResult;
        this.$this_measure = measureScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        this.$rowColumnMeasureHelper.placeHelper(placementScope, this.$measureResult, 0, this.$this_measure.getLayoutDirection());
    }
}
