package com.yuanqi.master;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yuanqi.group.home.HomeViewModel;
import com.yuanqi.master.addapp.AddAppViewModel;
import com.yuanqi.master.location.HistoryViewModel;
import com.yuanqi.master.location.MapViewModel;
import com.yuanqi.master.main.MainViewModel;
import com.yuanqi.master.manager.ManagerViewModel;
import com.yuanqi.master.mine.MineViewModel;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0000\u001a\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"ViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$annotations", "()V", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewModelFactoryKt {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final ViewModelProvider.Factory f14426a = new ViewModelProvider.Factory() { // from class: com.yuanqi.master.ViewModelFactoryKt$ViewModelFactory$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @l
        public <T extends ViewModel> T create(@l Class<T> modelClass, @l CreationExtras extras) {
            T a5;
            l0.p(modelClass, "modelClass");
            l0.p(extras, "extras");
            if (modelClass.isAssignableFrom(AddAppViewModel.class)) {
                a5 = AddAppViewModel.A.b();
            } else if (modelClass.isAssignableFrom(HomeViewModel.class)) {
                a5 = HomeViewModel.A.c();
            } else if (modelClass.isAssignableFrom(MainViewModel.class)) {
                a5 = MainViewModel.f14676l.a();
            } else if (modelClass.isAssignableFrom(MineViewModel.class)) {
                a5 = MineViewModel.f14764q.a();
            } else if (modelClass.isAssignableFrom(ManagerViewModel.class)) {
                a5 = ManagerViewModel.f14726o.a();
            } else if (modelClass.isAssignableFrom(MapViewModel.class)) {
                a5 = MapViewModel.f14645c.a();
            } else if (modelClass.isAssignableFrom(HistoryViewModel.class)) {
                a5 = HistoryViewModel.f14612d.a();
            } else {
                throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
            }
            l0.n(a5, "null cannot be cast to non-null type T of com.yuanqi.master.ViewModelFactoryKt.<clinit>.<no name provided>.create$lambda$0");
            return a5;
        }
    };

    @l
    public static final ViewModelProvider.Factory a() {
        return f14426a;
    }

    public static /* synthetic */ void b() {
    }
}
