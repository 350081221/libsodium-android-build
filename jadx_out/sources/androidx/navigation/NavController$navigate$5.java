package androidx.navigation;

import android.os.Bundle;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavController$navigate$5 extends n0 implements l<NavBackStackEntry, r2> {
    final /* synthetic */ Bundle $finalArgs;
    final /* synthetic */ k1.a $navigated;
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$navigate$5(k1.a aVar, NavController navController, NavDestination navDestination, Bundle bundle) {
        super(1);
        this.$navigated = aVar;
        this.this$0 = navController;
        this.$node = navDestination;
        this.$finalArgs = bundle;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(NavBackStackEntry navBackStackEntry) {
        invoke2(navBackStackEntry);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l NavBackStackEntry it) {
        l0.p(it, "it");
        this.$navigated.element = true;
        NavController.addEntryToBackStack$default(this.this$0, this.$node, this.$finalArgs, it, null, 8, null);
    }
}
