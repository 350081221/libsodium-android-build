package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ AlignmentLine $alignmentLine;
    final /* synthetic */ float $before;
    final /* synthetic */ int $height;
    final /* synthetic */ int $paddingAfter;
    final /* synthetic */ int $paddingBefore;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f5, int i5, int i6, int i7, Placeable placeable, int i8) {
        super(1);
        this.$alignmentLine = alignmentLine;
        this.$before = f5;
        this.$paddingBefore = i5;
        this.$width = i6;
        this.$paddingAfter = i7;
        this.$placeable = placeable;
        this.$height = i8;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        boolean horizontal;
        int width;
        boolean horizontal2;
        horizontal = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        int i5 = 0;
        if (horizontal) {
            width = 0;
        } else {
            width = !Dp.m6049equalsimpl0(this.$before, Dp.Companion.m6064getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$width - this.$paddingAfter) - this.$placeable.getWidth();
        }
        horizontal2 = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        if (horizontal2) {
            i5 = !Dp.m6049equalsimpl0(this.$before, Dp.Companion.m6064getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$height - this.$paddingAfter) - this.$placeable.getHeight();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, width, i5, 0.0f, 4, null);
    }
}
