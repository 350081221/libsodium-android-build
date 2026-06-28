package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ String $partialExpandActionLabel;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1(SheetState sheetState, boolean z4, String str, String str2, String str3, s0 s0Var) {
        super(1);
        this.$state = sheetState;
        this.$sheetSwipeEnabled = z4;
        this.$expandActionLabel = str;
        this.$partialExpandActionLabel = str2;
        this.$dismissActionLabel = str3;
        this.$scope = s0Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SheetState sheetState = this.$state;
        boolean z4 = this.$sheetSwipeEnabled;
        String str = this.$expandActionLabel;
        String str2 = this.$partialExpandActionLabel;
        String str3 = this.$dismissActionLabel;
        s0 s0Var = this.$scope;
        if (sheetState.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z4) {
            return;
        }
        SheetValue currentValue = sheetState.getCurrentValue();
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        if (currentValue == sheetValue) {
            if (sheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1(s0Var, sheetState));
            }
        } else if (sheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(sheetValue).booleanValue()) {
            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2(s0Var, sheetState));
        }
        if (sheetState.getSkipHiddenState$material3_release()) {
            return;
        }
        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3(s0Var, sheetState));
    }
}
