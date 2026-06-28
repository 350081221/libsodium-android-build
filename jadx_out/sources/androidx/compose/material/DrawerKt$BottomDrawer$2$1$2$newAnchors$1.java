package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/BottomDrawerValue;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material/DraggableAnchorsConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$2$1$2$newAnchors$1 extends n0 implements l<DraggableAnchorsConfig<BottomDrawerValue>, r2> {
    final /* synthetic */ float $drawerHeight;
    final /* synthetic */ float $fullHeight;
    final /* synthetic */ boolean $isLandscape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$2$newAnchors$1(float f5, float f6, boolean z4) {
        super(1);
        this.$fullHeight = f5;
        this.$drawerHeight = f6;
        this.$isLandscape = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
        invoke2(draggableAnchorsConfig);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DraggableAnchorsConfig<BottomDrawerValue> draggableAnchorsConfig) {
        draggableAnchorsConfig.at(BottomDrawerValue.Closed, this.$fullHeight);
        float f5 = this.$fullHeight * 0.5f;
        if (this.$drawerHeight > f5 || this.$isLandscape) {
            draggableAnchorsConfig.at(BottomDrawerValue.Open, f5);
        }
        float f6 = this.$drawerHeight;
        if (f6 > 0.0f) {
            draggableAnchorsConfig.at(BottomDrawerValue.Expanded, Math.max(0.0f, this.$fullHeight - f6));
        }
    }
}
