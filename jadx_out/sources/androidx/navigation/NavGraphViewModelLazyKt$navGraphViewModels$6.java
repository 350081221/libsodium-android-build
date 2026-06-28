package androidx.navigation;

import androidx.lifecycle.ViewModelProvider;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nNavGraphViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphViewModelLazy.kt\nandroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$6\n*L\n1#1,220:1\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$6 extends n0 implements v3.a<ViewModelProvider.Factory> {
    final /* synthetic */ d0<NavBackStackEntry> $backStackEntry$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$6(d0<NavBackStackEntry> d0Var) {
        super(0);
        this.$backStackEntry$delegate = d0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final ViewModelProvider.Factory invoke() {
        NavBackStackEntry m6414navGraphViewModels$lambda2;
        m6414navGraphViewModels$lambda2 = NavGraphViewModelLazyKt.m6414navGraphViewModels$lambda2(this.$backStackEntry$delegate);
        return m6414navGraphViewModels$lambda2.getDefaultViewModelProviderFactory();
    }
}
