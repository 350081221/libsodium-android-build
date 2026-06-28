package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/NavDestination;", "D", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/r2;", "invoke", "(Landroidx/navigation/NavOptionsBuilder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Navigator$onLaunchSingleTop$1 extends n0 implements l<NavOptionsBuilder, r2> {
    public static final Navigator$onLaunchSingleTop$1 INSTANCE = new Navigator$onLaunchSingleTop$1();

    Navigator$onLaunchSingleTop$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(NavOptionsBuilder navOptionsBuilder) {
        invoke2(navOptionsBuilder);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l NavOptionsBuilder navOptions) {
        l0.p(navOptions, "$this$navOptions");
        navOptions.setLaunchSingleTop(true);
    }
}
