package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NavigationDrawerKt$ModalNavigationDrawer$1$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ Density $density;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/DraggableAnchorsConfig;", "Landroidx/compose/material3/DrawerValue;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/DraggableAnchorsConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<DraggableAnchorsConfig<DrawerValue>, r2> {
        final /* synthetic */ float $maxValue;
        final /* synthetic */ float $minValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f5, float f6) {
            super(1);
            this.$minValue = f5;
            this.$maxValue = f6;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
            invoke2(draggableAnchorsConfig);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
            draggableAnchorsConfig.at(DrawerValue.Closed, this.$minValue);
            draggableAnchorsConfig.at(DrawerValue.Open, this.$maxValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$ModalNavigationDrawer$1$1(DrawerState drawerState, Density density, float f5, float f6) {
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
        this.$drawerState.setDensity$material3_release(this.$density);
        AnchoredDraggableState.updateAnchors$default(this.$drawerState.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new AnonymousClass1(this.$minValue, this.$maxValue)), null, 2, null);
    }
}
