package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MinimumInteractiveComponentSizeModifier$measure$1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumInteractiveComponentSizeModifier$measure$1(int i5, Placeable placeable, int i6) {
        super(1);
        this.$width = i5;
        this.$placeable = placeable;
        this.$height = i6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        int L0;
        int L02;
        L0 = kotlin.math.d.L0((this.$width - this.$placeable.getWidth()) / 2.0f);
        L02 = kotlin.math.d.L0((this.$height - this.$placeable.getHeight()) / 2.0f);
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, L0, L02, 0.0f, 4, null);
    }
}
