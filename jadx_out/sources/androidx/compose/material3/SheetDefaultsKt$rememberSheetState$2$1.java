package androidx.compose.material3;

import androidx.compose.ui.unit.Density;

@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material3/SheetState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SheetDefaultsKt$rememberSheetState$2$1 extends kotlin.jvm.internal.n0 implements v3.a<SheetState> {
    final /* synthetic */ v3.l<SheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ SheetValue $initialValue;
    final /* synthetic */ boolean $skipHiddenState;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SheetDefaultsKt$rememberSheetState$2$1(boolean z4, Density density, SheetValue sheetValue, v3.l<? super SheetValue, Boolean> lVar, boolean z5) {
        super(0);
        this.$skipPartiallyExpanded = z4;
        this.$density = density;
        this.$initialValue = sheetValue;
        this.$confirmValueChange = lVar;
        this.$skipHiddenState = z5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final SheetState invoke() {
        return new SheetState(this.$skipPartiallyExpanded, this.$density, this.$initialValue, this.$confirmValueChange, this.$skipHiddenState);
    }
}
