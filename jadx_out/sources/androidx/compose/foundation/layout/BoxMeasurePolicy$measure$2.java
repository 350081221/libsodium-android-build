package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BoxMeasurePolicy$measure$2 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ int $boxHeight;
    final /* synthetic */ int $boxWidth;
    final /* synthetic */ Measurable $measurable;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ BoxMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxMeasurePolicy$measure$2(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i5, int i6, BoxMeasurePolicy boxMeasurePolicy) {
        super(1);
        this.$placeable = placeable;
        this.$measurable = measurable;
        this.$this_measure = measureScope;
        this.$boxWidth = i5;
        this.$boxHeight = i6;
        this.this$0 = boxMeasurePolicy;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Alignment alignment;
        Placeable placeable = this.$placeable;
        Measurable measurable = this.$measurable;
        LayoutDirection layoutDirection = this.$this_measure.getLayoutDirection();
        int i5 = this.$boxWidth;
        int i6 = this.$boxHeight;
        alignment = this.this$0.alignment;
        BoxKt.placeInBox(placementScope, placeable, measurable, layoutDirection, i5, i6, alignment);
    }
}
