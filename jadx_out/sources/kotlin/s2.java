package kotlin;

import java.io.Serializable;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", t0.b.f22420d, "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s2<T> implements d0<T>, Serializable {

    @p4.m
    private Object _value;

    @p4.m
    private v3.a<? extends T> initializer;

    public s2(@p4.l v3.a<? extends T> initializer) {
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        this.initializer = initializer;
        this._value = k2.f19493a;
    }

    private final Object writeReplace() {
        return new x(getValue());
    }

    @Override // kotlin.d0
    public T getValue() {
        if (this._value == k2.f19493a) {
            v3.a<? extends T> aVar = this.initializer;
            kotlin.jvm.internal.l0.m(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    @Override // kotlin.d0
    public boolean isInitialized() {
        return this._value != k2.f19493a;
    }

    @p4.l
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
