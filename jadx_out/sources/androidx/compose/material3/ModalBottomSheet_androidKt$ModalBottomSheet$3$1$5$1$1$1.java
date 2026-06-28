package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ v3.a<r2> $animateToDismiss;
    final /* synthetic */ String $collapseActionLabel;
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ s0 $scope;
    final /* synthetic */ SheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1(SheetState sheetState, String str, String str2, String str3, v3.a<r2> aVar, s0 s0Var) {
        super(1);
        this.$sheetState = sheetState;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$animateToDismiss = aVar;
        this.$scope = s0Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SheetState sheetState = this.$sheetState;
        String str = this.$dismissActionLabel;
        String str2 = this.$expandActionLabel;
        String str3 = this.$collapseActionLabel;
        v3.a<r2> aVar = this.$animateToDismiss;
        s0 s0Var = this.$scope;
        SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str, new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$1(aVar));
        if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str2, new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2(sheetState, s0Var, sheetState));
        } else if (sheetState.getHasPartiallyExpandedState()) {
            SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str3, new ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3(sheetState, s0Var));
        }
    }
}
