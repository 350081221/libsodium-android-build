package androidx.compose.ui.node;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends n0 implements l<ObserverNodeOwnerScope, r2> {
    public static final ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1 INSTANCE = new ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1();

    ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
        invoke2(observerNodeOwnerScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ObserverNodeOwnerScope observerNodeOwnerScope) {
        if (observerNodeOwnerScope.isValidOwnerScope()) {
            observerNodeOwnerScope.getObserverNode$ui_release().onObservedReadsChanged();
        }
    }
}
