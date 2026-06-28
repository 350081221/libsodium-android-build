package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlinx.coroutines.flow.k;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"T", "Lkotlinx/coroutines/flow/i;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "flowWithLifecycle", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FlowExtKt {
    @l
    public static final <T> kotlinx.coroutines.flow.i<T> flowWithLifecycle(@l kotlinx.coroutines.flow.i<? extends T> iVar, @l Lifecycle lifecycle, @l Lifecycle.State state) {
        return k.s(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, iVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i flowWithLifecycle$default(kotlinx.coroutines.flow.i iVar, Lifecycle lifecycle, Lifecycle.State state, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(iVar, lifecycle, state);
    }
}
