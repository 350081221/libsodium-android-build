package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BottomNavigationKt$placeLabelAndIcon$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ int $iconX;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $selectedIconY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeLabelAndIcon$1(float f5, Placeable placeable, int i5, int i6, int i7, Placeable placeable2, int i8, int i9) {
        super(1);
        this.$iconPositionAnimationProgress = f5;
        this.$labelPlaceable = placeable;
        this.$labelX = i5;
        this.$labelY = i6;
        this.$offset = i7;
        this.$iconPlaceable = placeable2;
        this.$iconX = i8;
        this.$selectedIconY = i9;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        if (!(this.$iconPositionAnimationProgress == 0.0f)) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset, 0.0f, 4, null);
    }
}
