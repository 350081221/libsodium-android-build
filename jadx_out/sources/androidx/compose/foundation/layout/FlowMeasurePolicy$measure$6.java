package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy$measure$6\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,757:1\n476#2,11:758\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy$measure$6\n*L\n276#1:758,11\n*E\n"})
/* loaded from: classes.dex */
final class FlowMeasurePolicy$measure$6 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ FlowResult $flowResult;
    final /* synthetic */ RowColumnMeasurementHelper $measureHelper;
    final /* synthetic */ int[] $outPosition;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowMeasurePolicy$measure$6(FlowResult flowResult, RowColumnMeasurementHelper rowColumnMeasurementHelper, int[] iArr, MeasureScope measureScope) {
        super(1);
        this.$flowResult = flowResult;
        this.$measureHelper = rowColumnMeasurementHelper;
        this.$outPosition = iArr;
        this.$this_measure = measureScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        MutableVector<RowColumnMeasureHelperResult> items = this.$flowResult.getItems();
        RowColumnMeasurementHelper rowColumnMeasurementHelper = this.$measureHelper;
        int[] iArr = this.$outPosition;
        MeasureScope measureScope = this.$this_measure;
        int size = items.getSize();
        if (size > 0) {
            RowColumnMeasureHelperResult[] content = items.getContent();
            int i5 = 0;
            do {
                rowColumnMeasurementHelper.placeHelper(placementScope, content[i5], iArr[i5], measureScope.getLayoutDirection());
                i5++;
            } while (i5 < size);
        }
    }
}
