package androidx.lifecycle;

import kotlin.i0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.m3;
import kotlinx.coroutines.s0;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "JOB_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/s0;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/s0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ViewModelKt {

    @l
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @l
    public static final s0 getViewModelScope(@l ViewModel viewModel) {
        s0 s0Var = (s0) viewModel.getTag(JOB_KEY);
        if (s0Var != null) {
            return s0Var;
        }
        return (s0) viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(m3.c(null, 1, null).plus(k1.e().E0())));
    }
}
