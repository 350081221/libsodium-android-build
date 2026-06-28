package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.math.d;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$4$1 extends n0 implements l<LayoutCoordinates, r2> {
    final /* synthetic */ PopupLayout $popupLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$4$1(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l LayoutCoordinates layoutCoordinates) {
        int L0;
        int L02;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        l0.m(parentLayoutCoordinates);
        long mo5005getSizeYbymL2g = parentLayoutCoordinates.mo5005getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        L0 = d.L0(Offset.m3493getXimpl(positionInWindow));
        L02 = d.L0(Offset.m3494getYimpl(positionInWindow));
        this.$popupLayout.setParentBounds(IntRectKt.m6204IntRectVbeCjmY(IntOffsetKt.IntOffset(L0, L02), mo5005getSizeYbymL2g));
        this.$popupLayout.updatePosition();
    }
}
