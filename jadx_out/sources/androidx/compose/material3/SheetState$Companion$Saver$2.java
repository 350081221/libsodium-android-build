package androidx.compose.material3;

import androidx.compose.ui.unit.Density;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/SheetState;", "savedValue", "Landroidx/compose/material3/SheetValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SheetState$Companion$Saver$2 extends kotlin.jvm.internal.n0 implements v3.l<SheetValue, SheetState> {
    final /* synthetic */ v3.l<SheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SheetState$Companion$Saver$2(boolean z4, Density density, v3.l<? super SheetValue, Boolean> lVar) {
        super(1);
        this.$skipPartiallyExpanded = z4;
        this.$density = density;
        this.$confirmValueChange = lVar;
    }

    @Override // v3.l
    @p4.m
    public final SheetState invoke(@p4.l SheetValue sheetValue) {
        return new SheetState(this.$skipPartiallyExpanded, this.$density, sheetValue, this.$confirmValueChange, false, 16, null);
    }
}
