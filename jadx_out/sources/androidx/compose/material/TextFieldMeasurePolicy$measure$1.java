package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.u;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy$measure$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ int $effectiveLabelBaseline;
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $lastBaseline;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $placeholderPlaceable;
    final /* synthetic */ Placeable $textFieldPlaceable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $topPadding;
    final /* synthetic */ int $topPaddingValue;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(Placeable placeable, int i5, int i6, int i7, int i8, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i9, int i10, MeasureScope measureScope) {
        super(1);
        this.$labelPlaceable = placeable;
        this.$topPaddingValue = i5;
        this.$lastBaseline = i6;
        this.$width = i7;
        this.$height = i8;
        this.$textFieldPlaceable = placeable2;
        this.$placeholderPlaceable = placeable3;
        this.$leadingPlaceable = placeable4;
        this.$trailingPlaceable = placeable5;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i9;
        this.$topPadding = i10;
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
        int u4;
        boolean z5;
        float f5;
        if (this.$labelPlaceable != null) {
            u4 = u.u(this.$topPaddingValue - this.$lastBaseline, 0);
            int i5 = this.$width;
            int i6 = this.$height;
            Placeable placeable = this.$textFieldPlaceable;
            Placeable placeable2 = this.$labelPlaceable;
            Placeable placeable3 = this.$placeholderPlaceable;
            Placeable placeable4 = this.$leadingPlaceable;
            Placeable placeable5 = this.$trailingPlaceable;
            z5 = this.this$0.singleLine;
            int i7 = this.$effectiveLabelBaseline + this.$topPadding;
            f5 = this.this$0.animationProgress;
            TextFieldKt.placeWithLabel(placementScope, i5, i6, placeable, placeable2, placeable3, placeable4, placeable5, z5, u4, i7, f5, this.$this_measure.getDensity());
            return;
        }
        int i8 = this.$width;
        int i9 = this.$height;
        Placeable placeable6 = this.$textFieldPlaceable;
        Placeable placeable7 = this.$placeholderPlaceable;
        Placeable placeable8 = this.$leadingPlaceable;
        Placeable placeable9 = this.$trailingPlaceable;
        z4 = this.this$0.singleLine;
        float density = this.$this_measure.getDensity();
        paddingValues = this.this$0.paddingValues;
        TextFieldKt.placeWithoutLabel(placementScope, i8, i9, placeable6, placeable7, placeable8, placeable9, z4, density, paddingValues);
    }
}
