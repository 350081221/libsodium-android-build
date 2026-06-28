package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy$measure$2 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $containerPlaceable;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $prefixPlaceable;
    final /* synthetic */ Placeable $suffixPlaceable;
    final /* synthetic */ Placeable $supportingPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $totalHeight;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ OutlinedTextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$2(int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, MeasureScope measureScope) {
        super(1);
        this.$totalHeight = i5;
        this.$width = i6;
        this.$leadingPlaceable = placeable;
        this.$trailingPlaceable = placeable2;
        this.$prefixPlaceable = placeable3;
        this.$suffixPlaceable = placeable4;
        this.$textFieldPlaceable = placeable5;
        this.$labelPlaceable = placeable6;
        this.$placeholderPlaceable = placeable7;
        this.$containerPlaceable = placeable8;
        this.$supportingPlaceable = placeable9;
        this.this$0 = outlinedTextFieldMeasurePolicy;
        this.$this_measure = measureScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        float f5;
        boolean z4;
        PaddingValues paddingValues;
        int i5 = this.$totalHeight;
        int i6 = this.$width;
        Placeable placeable = this.$leadingPlaceable;
        Placeable placeable2 = this.$trailingPlaceable;
        Placeable placeable3 = this.$prefixPlaceable;
        Placeable placeable4 = this.$suffixPlaceable;
        Placeable placeable5 = this.$textFieldPlaceable;
        Placeable placeable6 = this.$labelPlaceable;
        Placeable placeable7 = this.$placeholderPlaceable;
        Placeable placeable8 = this.$containerPlaceable;
        Placeable placeable9 = this.$supportingPlaceable;
        f5 = this.this$0.animationProgress;
        z4 = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        LayoutDirection layoutDirection = this.$this_measure.getLayoutDirection();
        paddingValues = this.this$0.paddingValues;
        OutlinedTextFieldKt.place(placementScope, i5, i6, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, placeable9, f5, z4, density, layoutDirection, paddingValues);
    }
}
