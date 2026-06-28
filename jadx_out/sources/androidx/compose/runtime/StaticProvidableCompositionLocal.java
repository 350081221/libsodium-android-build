package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", b.f22420d, "Landroidx/compose/runtime/State;", "previous", "updatedStateOf$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/State;", "updatedStateOf", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lv3/a;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    public static final int $stable = 0;

    public StaticProvidableCompositionLocal(@l v3.a<? extends T> aVar) {
        super(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    @l
    public State<T> updatedStateOf$runtime_release(T t5, @m State<? extends T> state) {
        if (state == 0 || !l0.g(state.getValue(), t5)) {
            return new StaticValueHolder(t5);
        }
        return state;
    }
}
