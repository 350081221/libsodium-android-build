package kotlin;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", t0.b.f22420d, "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n1<T> implements d0<T>, Serializable {

    @p4.m
    private volatile Object _value;

    @p4.m
    private v3.a<? extends T> initializer;

    @p4.l
    private final Object lock;

    public n1(@p4.l v3.a<? extends T> initializer, @p4.m Object obj) {
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        this.initializer = initializer;
        this._value = k2.f19493a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new x(getValue());
    }

    @Override // kotlin.d0
    public T getValue() {
        T t5;
        T t6 = (T) this._value;
        k2 k2Var = k2.f19493a;
        if (t6 != k2Var) {
            return t6;
        }
        synchronized (this.lock) {
            t5 = (T) this._value;
            if (t5 == k2Var) {
                v3.a<? extends T> aVar = this.initializer;
                kotlin.jvm.internal.l0.m(aVar);
                t5 = aVar.invoke();
                this._value = t5;
                this.initializer = null;
            }
        }
        return t5;
    }

    @Override // kotlin.d0
    public boolean isInitialized() {
        return this._value != k2.f19493a;
    }

    @p4.l
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ n1(v3.a aVar, Object obj, int i5, kotlin.jvm.internal.w wVar) {
        this(aVar, (i5 & 2) != 0 ? null : obj);
    }
}
