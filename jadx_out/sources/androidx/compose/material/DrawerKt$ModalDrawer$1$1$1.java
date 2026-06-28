package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawerKt$ModalDrawer$1$1$1 extends n0 implements a<r2> {
    final /* synthetic */ Density $density;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1(DrawerState drawerState, Density density, float f5, float f6) {
        super(0);
        this.$drawerState = drawerState;
        this.$density = density;
        this.$minValue = f5;
        this.$maxValue = f6;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$drawerState.setDensity$material_release(this.$density);
        AnchoredDraggableState.updateAnchors$default(this.$drawerState.getAnchoredDraggableState$material_release(), AnchoredDraggableKt.DraggableAnchors(new DrawerKt$ModalDrawer$1$1$1$anchors$1(this.$minValue, this.$maxValue)), null, 2, null);
    }
}
