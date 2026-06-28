package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u001aF\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/d0;", "viewModels", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "activity_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> viewModels(ComponentActivity componentActivity, v3.a<? extends ViewModelProvider.Factory> aVar) {
        l0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        l0.y(4, "VM");
        return new ViewModelLazy(l1.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ d0 viewModels$default(ComponentActivity componentActivity, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        l0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        l0.y(4, "VM");
        return new ViewModelLazy(l1.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> d0<VM> viewModels(ComponentActivity componentActivity, v3.a<? extends CreationExtras> aVar, v3.a<? extends ViewModelProvider.Factory> aVar2) {
        l0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        l0.y(4, "VM");
        return new ViewModelLazy(l1.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }

    public static /* synthetic */ d0 viewModels$default(ComponentActivity componentActivity, v3.a aVar, v3.a aVar2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = null;
        }
        if ((i5 & 2) != 0) {
            aVar2 = null;
        }
        l0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        l0.y(4, "VM");
        return new ViewModelLazy(l1.d(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }
}
