package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/DrawerValue;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material/DraggableAnchorsConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawerKt$ModalDrawer$1$1$1$anchors$1 extends n0 implements l<DraggableAnchorsConfig<DrawerValue>, r2> {
    final /* synthetic */ float $maxValue;
    final /* synthetic */ float $minValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$1$1$anchors$1(float f5, float f6) {
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
