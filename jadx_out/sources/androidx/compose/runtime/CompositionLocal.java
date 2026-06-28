package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@Stable
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H ¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u00028\u00008Ç\u0002¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", b.f22420d, "Landroidx/compose/runtime/State;", "previous", "updatedStateOf$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/State;)Landroidx/compose/runtime/State;", "updatedStateOf", "Landroidx/compose/runtime/LazyValueHolder;", "defaultValueHolder", "Landroidx/compose/runtime/LazyValueHolder;", "getDefaultValueHolder$runtime_release", "()Landroidx/compose/runtime/LazyValueHolder;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "getCurrent$annotations", "()V", "current", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lv3/a;)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;

    @l
    private final LazyValueHolder<T> defaultValueHolder;

    private CompositionLocal(v3.a<? extends T> aVar) {
        this.defaultValueHolder = new LazyValueHolder<>(aVar);
    }

    public /* synthetic */ CompositionLocal(v3.a aVar, w wVar) {
        this(aVar);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    @h(name = "getCurrent")
    @Composable
    @ReadOnlyComposable
    public final T getCurrent(@m Composer composer, int i5) {
        return (T) composer.consume(this);
    }

    @l
    public final LazyValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @l
    public abstract State<T> updatedStateOf$runtime_release(T t5, @m State<? extends T> state);
}
