package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/NavBackStackEntry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class NavController$popBackStackInternal$1 extends n0 implements l<NavBackStackEntry, r2> {
    public static final NavController$popBackStackInternal$1 INSTANCE = new NavController$popBackStackInternal$1();

    NavController$popBackStackInternal$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(NavBackStackEntry navBackStackEntry) {
        invoke2(navBackStackEntry);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l NavBackStackEntry it) {
        l0.p(it, "it");
    }
}
