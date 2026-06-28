package androidx.fragment.app;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt$viewModels$8 extends n0 implements v3.a<ViewModelProvider.Factory> {
    final /* synthetic */ d0<ViewModelStoreOwner> $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$8(Fragment fragment, d0<? extends ViewModelStoreOwner> d0Var) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = d0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final ViewModelProvider.Factory invoke() {
        ViewModelStoreOwner m6406viewModels$lambda1;
        ViewModelProvider.Factory defaultViewModelProviderFactory;
        m6406viewModels$lambda1 = FragmentViewModelLazyKt.m6406viewModels$lambda1(this.$owner$delegate);
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m6406viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m6406viewModels$lambda1 : null;
        if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
            return defaultViewModelProviderFactory;
        }
        ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.$this_viewModels.getDefaultViewModelProviderFactory();
        l0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory2;
    }
}
