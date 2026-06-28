package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/navigation/NavBackStackEntry;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8\n*L\n1#1,220:1\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8 extends n0 implements v3.a<NavBackStackEntry> {
    final /* synthetic */ String $navGraphRoute;
    final /* synthetic */ Fragment $this_navGraphViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(Fragment fragment, String str) {
        super(0);
        this.$this_navGraphViewModels = fragment;
        this.$navGraphRoute = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphRoute);
    }
}
