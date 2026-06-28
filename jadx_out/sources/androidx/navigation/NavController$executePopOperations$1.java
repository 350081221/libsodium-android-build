package androidx.navigation;

import kotlin.collections.k;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "entry", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavController$executePopOperations$1 extends n0 implements l<NavBackStackEntry, r2> {
    final /* synthetic */ k1.a $popped;
    final /* synthetic */ k1.a $receivedPop;
    final /* synthetic */ boolean $saveState;
    final /* synthetic */ k<NavBackStackEntryState> $savedState;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$1(k1.a aVar, k1.a aVar2, NavController navController, boolean z4, k<NavBackStackEntryState> kVar) {
        super(1);
        this.$receivedPop = aVar;
        this.$popped = aVar2;
        this.this$0 = navController;
        this.$saveState = z4;
        this.$savedState = kVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(NavBackStackEntry navBackStackEntry) {
        invoke2(navBackStackEntry);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l NavBackStackEntry entry) {
        l0.p(entry, "entry");
        this.$receivedPop.element = true;
        this.$popped.element = true;
        this.this$0.popEntryFromBackStack(entry, this.$saveState, this.$savedState);
    }
}
