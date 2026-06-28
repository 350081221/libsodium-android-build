package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ListItemKt$place$1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $headlinePlaceable;
    final /* synthetic */ int $height;
    final /* synthetic */ boolean $isThreeLine;
    final /* synthetic */ LayoutDirection $layoutDirection;
    final /* synthetic */ Placeable $leadingPlaceable;
    final /* synthetic */ Placeable $overlinePlaceable;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ Placeable $supportingPlaceable;
    final /* synthetic */ MeasureScope $this_place;
    final /* synthetic */ Placeable $trailingPlaceable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$place$1(MeasureScope measureScope, PaddingValues paddingValues, LayoutDirection layoutDirection, Placeable placeable, Placeable placeable2, boolean z4, Placeable placeable3, Placeable placeable4, Placeable placeable5, int i5, int i6) {
        super(1);
        this.$this_place = measureScope;
        this.$paddingValues = paddingValues;
        this.$layoutDirection = layoutDirection;
        this.$leadingPlaceable = placeable;
        this.$trailingPlaceable = placeable2;
        this.$isThreeLine = z4;
        this.$headlinePlaceable = placeable3;
        this.$overlinePlaceable = placeable4;
        this.$supportingPlaceable = placeable5;
        this.$height = i5;
        this.$width = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        int mo298roundToPx0680j_4 = this.$this_place.mo298roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$paddingValues, this.$layoutDirection));
        int mo298roundToPx0680j_42 = this.$this_place.mo298roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$paddingValues, this.$layoutDirection));
        int mo298roundToPx0680j_43 = this.$this_place.mo298roundToPx0680j_4(this.$paddingValues.mo506calculateTopPaddingD9Ej5fM());
        Placeable placeable = this.$leadingPlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, mo298roundToPx0680j_4, this.$isThreeLine ? mo298roundToPx0680j_43 : Alignment.Companion.getCenterVertically().align(placeable.getHeight(), this.$height), 0.0f, 4, null);
        }
        Placeable placeable2 = this.$trailingPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (this.$width - mo298roundToPx0680j_42) - placeable2.getWidth(), this.$isThreeLine ? mo298roundToPx0680j_43 : Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), this.$height), 0.0f, 4, null);
        }
        int widthOrZero = mo298roundToPx0680j_4 + TextFieldImplKt.widthOrZero(this.$leadingPlaceable);
        if (!this.$isThreeLine) {
            mo298roundToPx0680j_43 = Alignment.Companion.getCenterVertically().align(TextFieldImplKt.heightOrZero(this.$headlinePlaceable) + TextFieldImplKt.heightOrZero(this.$overlinePlaceable) + TextFieldImplKt.heightOrZero(this.$supportingPlaceable), this.$height);
        }
        Placeable placeable3 = this.$overlinePlaceable;
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, mo298roundToPx0680j_43, 0.0f, 4, null);
        }
        int heightOrZero = mo298roundToPx0680j_43 + TextFieldImplKt.heightOrZero(this.$overlinePlaceable);
        Placeable placeable4 = this.$headlinePlaceable;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, widthOrZero, heightOrZero, 0.0f, 4, null);
        }
        int heightOrZero2 = heightOrZero + TextFieldImplKt.heightOrZero(this.$headlinePlaceable);
        Placeable placeable5 = this.$supportingPlaceable;
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, widthOrZero, heightOrZero2, 0.0f, 4, null);
        }
    }
}
