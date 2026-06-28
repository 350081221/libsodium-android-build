package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a7\u0010\n\u001a\u00020\u0002\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0007*\u00020\u00012\u0019\b\b\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l<? super CreationExtras, ? extends VM> initializer) {
        l0.p(initializerViewModelFactoryBuilder, "<this>");
        l0.p(initializer, "initializer");
        l0.y(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(l1.d(ViewModel.class), initializer);
    }

    @p4.l
    public static final ViewModelProvider.Factory viewModelFactory(@p4.l l<? super InitializerViewModelFactoryBuilder, r2> builder) {
        l0.p(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
