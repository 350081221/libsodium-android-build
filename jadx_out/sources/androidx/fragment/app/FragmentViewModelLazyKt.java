package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aV\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aF\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aJ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u001aZ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013²\u0006\u0018\u0010\u0012\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0012\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "ownerProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/d0;", "viewModels", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "activityViewModels", "Lkotlin/reflect/d;", "viewModelClass", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "createViewModelLazy", "owner", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt {
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> activityViewModels(Fragment fragment, v3.a<? extends ViewModelProvider.Factory> aVar) {
        l0.p(fragment, "<this>");
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    public static /* synthetic */ d0 activityViewModels$default(Fragment fragment, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        l0.p(fragment, "<this>");
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ d0 createViewModelLazy(Fragment fragment, kotlin.reflect.d viewModelClass, v3.a storeProducer, v3.a aVar) {
        l0.p(fragment, "<this>");
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new FragmentViewModelLazyKt$createViewModelLazy$1(fragment), aVar);
    }

    public static /* synthetic */ d0 createViewModelLazy$default(Fragment fragment, kotlin.reflect.d dVar, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(fragment, dVar, aVar, aVar2);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> viewModels(Fragment fragment, v3.a<? extends ViewModelStoreOwner> ownerProducer, v3.a<? extends ViewModelProvider.Factory> aVar) {
        d0 b5;
        l0.p(fragment, "<this>");
        l0.p(ownerProducer, "ownerProducer");
        b5 = f0.b(h0.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(b5);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(b5);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$viewModels$4(fragment, b5);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar);
    }

    public static /* synthetic */ d0 viewModels$default(Fragment fragment, v3.a ownerProducer, v3.a aVar, int i5, Object obj) {
        d0 b5;
        if ((i5 & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        l0.p(fragment, "<this>");
        l0.p(ownerProducer, "ownerProducer");
        b5 = f0.b(h0.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(b5);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(b5);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$viewModels$4(fragment, b5);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m6405viewModels$lambda0(d0<? extends ViewModelStoreOwner> d0Var) {
        return d0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m6406viewModels$lambda1(d0<? extends ViewModelStoreOwner> d0Var) {
        return d0Var.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> activityViewModels(Fragment fragment, v3.a<? extends CreationExtras> aVar, v3.a<? extends ViewModelProvider.Factory> aVar2) {
        l0.p(fragment, "<this>");
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    @p4.l
    @MainThread
    public static final <VM extends ViewModel> d0<VM> createViewModelLazy(@p4.l Fragment fragment, @p4.l kotlin.reflect.d<VM> viewModelClass, @p4.l v3.a<? extends ViewModelStore> storeProducer, @p4.l v3.a<? extends CreationExtras> extrasProducer, @p4.m v3.a<? extends ViewModelProvider.Factory> aVar) {
        l0.p(fragment, "<this>");
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(extrasProducer, "extrasProducer");
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(viewModelClass, storeProducer, aVar, extrasProducer);
    }

    public static /* synthetic */ d0 createViewModelLazy$default(Fragment fragment, kotlin.reflect.d dVar, v3.a aVar, v3.a aVar2, v3.a aVar3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$2(fragment);
        }
        if ((i5 & 8) != 0) {
            aVar3 = null;
        }
        return createViewModelLazy(fragment, dVar, aVar, aVar2, aVar3);
    }

    public static /* synthetic */ d0 activityViewModels$default(Fragment fragment, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        if ((i5 & 2) != 0) {
            aVar2 = null;
        }
        l0.p(fragment, "<this>");
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> viewModels(Fragment fragment, v3.a<? extends ViewModelStoreOwner> ownerProducer, v3.a<? extends CreationExtras> aVar, v3.a<? extends ViewModelProvider.Factory> aVar2) {
        d0 b5;
        l0.p(fragment, "<this>");
        l0.p(ownerProducer, "ownerProducer");
        b5 = f0.b(h0.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(b5);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar, b5);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$8(fragment, b5);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar2);
    }

    public static /* synthetic */ d0 viewModels$default(Fragment fragment, v3.a ownerProducer, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        d0 b5;
        if ((i5 & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$5(fragment);
        }
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        if ((i5 & 4) != 0) {
            aVar2 = null;
        }
        l0.p(fragment, "<this>");
        l0.p(ownerProducer, "ownerProducer");
        b5 = f0.b(h0.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        l0.y(4, "VM");
        kotlin.reflect.d d5 = l1.d(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(b5);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar, b5);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$8(fragment, b5);
        }
        return createViewModelLazy(fragment, d5, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar2);
    }
}
