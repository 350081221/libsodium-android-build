package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$measure$1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $containerPlaceable;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $prefixPlaceable;
    final /* synthetic */ Placeable $suffixPlaceable;
    final /* synthetic */ Placeable $supportingPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ int $totalHeight;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i5, int i6, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, TextFieldMeasurePolicy textFieldMeasurePolicy, int i7, MeasureScope measureScope) {
        super(1);
        this.$labelPlaceable = placeable;
        this.$width = i5;
        this.$totalHeight = i6;
        this.$textFieldPlaceable = placeable2;
        this.$placeholderPlaceable = placeable3;
        this.$leadingPlaceable = placeable4;
        this.$trailingPlaceable = placeable5;
        this.$prefixPlaceable = placeable6;
        this.$suffixPlaceable = placeable7;
        this.$containerPlaceable = placeable8;
        this.$supportingPlaceable = placeable9;
        this.this$0 = textFieldMeasurePolicy;
        this.$topPaddingValue = i7;
        this.$this_measure = measureScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        boolean z4;
        PaddingValues paddingValues;
        boolean z5;
        float f5;
        Placeable placeable = this.$labelPlaceable;
        if (placeable != null) {
            int i5 = this.$width;
            int i6 = this.$totalHeight;
            Placeable placeable2 = this.$textFieldPlaceable;
            Placeable placeable3 = this.$placeholderPlaceable;
            Placeable placeable4 = this.$leadingPlaceable;
            Placeable placeable5 = this.$trailingPlaceable;
            Placeable placeable6 = this.$prefixPlaceable;
            Placeable placeable7 = this.$suffixPlaceable;
            Placeable placeable8 = this.$containerPlaceable;
            Placeable placeable9 = this.$supportingPlaceable;
            z5 = this.this$0.singleLine;
            int i7 = this.$topPaddingValue;
            int height = this.$labelPlaceable.getHeight() + i7;
            f5 = this.this$0.animationProgress;
            TextFieldKt.placeWithLabel(placementScope, i5, i6, placeable2, placeable, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, placeable9, z5, i7, height, f5, this.$this_measure.getDensity());
            return;
        }
        int i8 = this.$width;
        int i9 = this.$totalHeight;
        Placeable placeable10 = this.$textFieldPlaceable;
        Placeable placeable11 = this.$placeholderPlaceable;
        Placeable placeable12 = this.$leadingPlaceable;
        Placeable placeable13 = this.$trailingPlaceable;
        Placeable placeable14 = this.$prefixPlaceable;
        Placeable placeable15 = this.$suffixPlaceable;
        Placeable placeable16 = this.$containerPlaceable;
        Placeable placeable17 = this.$supportingPlaceable;
        z4 = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        paddingValues = this.this$0.paddingValues;
        TextFieldKt.placeWithoutLabel(placementScope, i8, i9, placeable10, placeable11, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, z4, density, paddingValues);
    }
}
