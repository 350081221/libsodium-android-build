package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NavigationBarKt$placeIcon$1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ int $iconY;
    final /* synthetic */ Placeable $indicatorPlaceable;
    final /* synthetic */ Placeable $indicatorRipplePlaceable;
    final /* synthetic */ int $rippleX;
    final /* synthetic */ int $rippleY;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$placeIcon$1(Placeable placeable, Placeable placeable2, int i5, int i6, Placeable placeable3, int i7, int i8, int i9, int i10) {
        super(1);
        this.$indicatorPlaceable = placeable;
        this.$iconPlaceable = placeable2;
        this.$iconX = i5;
        this.$iconY = i6;
        this.$indicatorRipplePlaceable = placeable3;
        this.$rippleX = i7;
        this.$rippleY = i8;
        this.$width = i9;
        this.$height = i10;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Placeable placeable = this.$indicatorPlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (this.$width - placeable.getWidth()) / 2, (this.$height - placeable.getHeight()) / 2, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$iconPlaceable, this.$iconX, this.$iconY, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$indicatorRipplePlaceable, this.$rippleX, this.$rippleY, 0.0f, 4, null);
    }
}
