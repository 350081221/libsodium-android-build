package androidx.compose.runtime;

import kotlin.i0;
import p4.l;
import t0.b;

@Stable
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", b.f22420d, "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "providesDefault", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lv3/a;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(@l v3.a<? extends T> aVar) {
        super(aVar, null);
    }

    @l
    public final ProvidedValue<T> provides(T t5) {
        return new ProvidedValue<>(this, t5, true);
    }

    @l
    public final ProvidedValue<T> providesDefault(T t5) {
        return new ProvidedValue<>(this, t5, false);
    }
}
