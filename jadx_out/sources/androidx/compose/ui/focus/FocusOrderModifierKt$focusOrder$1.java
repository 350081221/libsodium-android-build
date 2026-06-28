package androidx.compose.ui.focus;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/focus/FocusProperties;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusOrderModifierKt$focusOrder$1 extends n0 implements l<FocusProperties, r2> {
    final /* synthetic */ FocusOrderToProperties $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOrderModifierKt$focusOrder$1(FocusOrderToProperties focusOrderToProperties) {
        super(1);
        this.$scope = focusOrderToProperties;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l FocusProperties focusProperties) {
        this.$scope.apply(focusProperties);
    }
}
