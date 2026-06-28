package androidx.navigation.fragment;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FragmentNavigator$attachClearViewModel$viewModel$1$1 extends n0 implements l<CreationExtras, FragmentNavigator.ClearEntryStateViewModel> {
    public static final FragmentNavigator$attachClearViewModel$viewModel$1$1 INSTANCE = new FragmentNavigator$attachClearViewModel$viewModel$1$1();

    FragmentNavigator$attachClearViewModel$viewModel$1$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final FragmentNavigator.ClearEntryStateViewModel invoke(@p4.l CreationExtras initializer) {
        l0.p(initializer, "$this$initializer");
        return new FragmentNavigator.ClearEntryStateViewModel();
    }
}
