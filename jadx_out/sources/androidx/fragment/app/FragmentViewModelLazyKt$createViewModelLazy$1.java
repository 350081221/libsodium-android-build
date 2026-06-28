package androidx.fragment.app;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt$createViewModelLazy$1 extends n0 implements v3.a<CreationExtras> {
    final /* synthetic */ Fragment $this_createViewModelLazy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$createViewModelLazy$1(Fragment fragment) {
        super(0);
        this.$this_createViewModelLazy = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final CreationExtras invoke() {
        CreationExtras defaultViewModelCreationExtras = this.$this_createViewModelLazy.getDefaultViewModelCreationExtras();
        l0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
