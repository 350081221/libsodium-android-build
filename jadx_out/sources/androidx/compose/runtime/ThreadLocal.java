package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\t\u0010\u0004J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/ThreadLocal;", "T", "Ljava/lang/ThreadLocal;", "get", "()Ljava/lang/Object;", b.f22420d, "Lkotlin/r2;", "set", "(Ljava/lang/Object;)V", "initialValue", "remove", "Lkotlin/Function0;", "Lv3/a;", "<init>", "(Lv3/a;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ThreadLocal<T> extends java.lang.ThreadLocal<T> {
    public static final int $stable = 0;

    @l
    private final v3.a<T> initialValue;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadLocal(@l v3.a<? extends T> aVar) {
        this.initialValue = aVar;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    @m
    protected T initialValue() {
        return this.initialValue.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T t5) {
        super.set(t5);
    }
}
