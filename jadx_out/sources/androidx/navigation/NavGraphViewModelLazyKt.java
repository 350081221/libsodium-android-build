package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.k;
import kotlin.m;
import kotlin.reflect.d;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u001aP\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u001a<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u001aN\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000f\u001a\u00020\u000e\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "", "navGraphId", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/d0;", "navGraphViewModels", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "", "navGraphRoute", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavGraphViewModelLazyKt {
    @k(level = m.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> navGraphViewModels(Fragment fragment, @IdRes int i5, v3.a<? extends ViewModelProvider.Factory> aVar) {
        d0 c5;
        l0.p(fragment, "<this>");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i5));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$1 navGraphViewModelLazyKt$navGraphViewModels$1 = new NavGraphViewModelLazyKt$navGraphViewModels$1(c5);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$2(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, navGraphViewModelLazyKt$navGraphViewModels$1, aVar);
    }

    public static /* synthetic */ d0 navGraphViewModels$default(Fragment fragment, int i5, v3.a aVar, int i6, Object obj) {
        d0 c5;
        if ((i6 & 2) != 0) {
            aVar = null;
        }
        l0.p(fragment, "<this>");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i5));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$1 navGraphViewModelLazyKt$navGraphViewModels$1 = new NavGraphViewModelLazyKt$navGraphViewModels$1(c5);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$2(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, navGraphViewModelLazyKt$navGraphViewModels$1, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-0, reason: not valid java name */
    public static final NavBackStackEntry m6412navGraphViewModels$lambda0(d0<NavBackStackEntry> d0Var) {
        return d0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-1, reason: not valid java name */
    public static final NavBackStackEntry m6413navGraphViewModels$lambda1(d0<NavBackStackEntry> d0Var) {
        return d0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-2, reason: not valid java name */
    public static final NavBackStackEntry m6414navGraphViewModels$lambda2(d0<NavBackStackEntry> d0Var) {
        return d0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navGraphViewModels$lambda-3, reason: not valid java name */
    public static final NavBackStackEntry m6415navGraphViewModels$lambda3(d0<NavBackStackEntry> d0Var) {
        return d0Var.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> navGraphViewModels(Fragment fragment, @IdRes int i5, v3.a<? extends CreationExtras> aVar, v3.a<? extends ViewModelProvider.Factory> aVar2) {
        d0 c5;
        l0.p(fragment, "<this>");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i5));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$3 navGraphViewModelLazyKt$navGraphViewModels$3 = new NavGraphViewModelLazyKt$navGraphViewModels$3(aVar, c5);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$4(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, navGraphViewModelLazyKt$navGraphViewModels$3, aVar2);
    }

    public static /* synthetic */ d0 navGraphViewModels$default(Fragment fragment, int i5, v3.a aVar, v3.a aVar2, int i6, Object obj) {
        d0 c5;
        if ((i6 & 2) != 0) {
            aVar = null;
        }
        if ((i6 & 4) != 0) {
            aVar2 = null;
        }
        l0.p(fragment, "<this>");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, i5));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$3 navGraphViewModelLazyKt$navGraphViewModels$3 = new NavGraphViewModelLazyKt$navGraphViewModels$3(aVar, c5);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$4(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, navGraphViewModelLazyKt$navGraphViewModels$3, aVar2);
    }

    @k(level = m.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> navGraphViewModels(Fragment fragment, String navGraphRoute, v3.a<? extends ViewModelProvider.Factory> aVar) {
        d0 c5;
        l0.p(fragment, "<this>");
        l0.p(navGraphRoute, "navGraphRoute");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$5 navGraphViewModelLazyKt$navGraphViewModels$5 = new NavGraphViewModelLazyKt$navGraphViewModels$5(c5);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$6(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, navGraphViewModelLazyKt$navGraphViewModels$5, aVar);
    }

    public static /* synthetic */ d0 navGraphViewModels$default(Fragment fragment, String navGraphRoute, v3.a aVar, int i5, Object obj) {
        d0 c5;
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        l0.p(fragment, "<this>");
        l0.p(navGraphRoute, "navGraphRoute");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$6(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$5 navGraphViewModelLazyKt$navGraphViewModels$5 = new NavGraphViewModelLazyKt$navGraphViewModels$5(c5);
        if (aVar == null) {
            aVar = new NavGraphViewModelLazyKt$navGraphViewModels$6(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, navGraphViewModelLazyKt$navGraphViewModels$5, aVar);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> navGraphViewModels(Fragment fragment, String navGraphRoute, v3.a<? extends CreationExtras> aVar, v3.a<? extends ViewModelProvider.Factory> aVar2) {
        d0 c5;
        l0.p(fragment, "<this>");
        l0.p(navGraphRoute, "navGraphRoute");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$7 navGraphViewModelLazyKt$navGraphViewModels$7 = new NavGraphViewModelLazyKt$navGraphViewModels$7(aVar, c5);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$8(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, navGraphViewModelLazyKt$navGraphViewModels$7, aVar2);
    }

    public static /* synthetic */ d0 navGraphViewModels$default(Fragment fragment, String navGraphRoute, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        d0 c5;
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        if ((i5 & 4) != 0) {
            aVar2 = null;
        }
        l0.p(fragment, "<this>");
        l0.p(navGraphRoute, "navGraphRoute");
        c5 = f0.c(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(c5);
        l0.y(4, "VM");
        d d5 = l1.d(ViewModel.class);
        NavGraphViewModelLazyKt$navGraphViewModels$7 navGraphViewModelLazyKt$navGraphViewModels$7 = new NavGraphViewModelLazyKt$navGraphViewModels$7(aVar, c5);
        if (aVar2 == null) {
            aVar2 = new NavGraphViewModelLazyKt$navGraphViewModels$8(c5);
        }
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, d5, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, navGraphViewModelLazyKt$navGraphViewModels$7, aVar2);
    }
}
