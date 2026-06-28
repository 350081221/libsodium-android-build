package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", t0.b.f22420d, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n<T> extends o<T> implements Iterator<T>, kotlin.coroutines.d<r2>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    private int f19645a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private T f19646b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private Iterator<? extends T> f19647c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private kotlin.coroutines.d<? super r2> f19648d;

    private final Throwable m() {
        int i5 = this.f19645a;
        if (i5 != 4) {
            if (i5 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f19645a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T o() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.o
    @p4.m
    public Object b(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object l6;
        Object l7;
        this.f19646b = t5;
        this.f19645a = 3;
        this.f19648d = dVar;
        l5 = kotlin.coroutines.intrinsics.d.l();
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (l5 == l6) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l7 = kotlin.coroutines.intrinsics.d.l();
        if (l5 == l7) {
            return l5;
        }
        return r2.f19517a;
    }

    @Override // kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        return kotlin.coroutines.i.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i5 = this.f19645a;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        return true;
                    }
                    if (i5 == 4) {
                        return false;
                    }
                    throw m();
                }
                Iterator<? extends T> it = this.f19647c;
                l0.m(it);
                if (it.hasNext()) {
                    this.f19645a = 2;
                    return true;
                }
                this.f19647c = null;
            }
            this.f19645a = 5;
            kotlin.coroutines.d<? super r2> dVar = this.f19648d;
            l0.m(dVar);
            this.f19648d = null;
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    @Override // kotlin.sequences.o
    @p4.m
    public Object j(@p4.l Iterator<? extends T> it, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object l6;
        Object l7;
        if (!it.hasNext()) {
            return r2.f19517a;
        }
        this.f19647c = it;
        this.f19645a = 2;
        this.f19648d = dVar;
        l5 = kotlin.coroutines.intrinsics.d.l();
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (l5 == l6) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l7 = kotlin.coroutines.intrinsics.d.l();
        if (l5 == l7) {
            return l5;
        }
        return r2.f19517a;
    }

    @p4.m
    public final kotlin.coroutines.d<r2> n() {
        return this.f19648d;
    }

    @Override // java.util.Iterator
    public T next() {
        int i5 = this.f19645a;
        if (i5 != 0 && i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    this.f19645a = 0;
                    T t5 = this.f19646b;
                    this.f19646b = null;
                    return t5;
                }
                throw m();
            }
            this.f19645a = 1;
            Iterator<? extends T> it = this.f19647c;
            l0.m(it);
            return it.next();
        }
        return o();
    }

    public final void p(@p4.m kotlin.coroutines.d<? super r2> dVar) {
        this.f19648d = dVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@p4.l Object obj) {
        e1.n(obj);
        this.f19645a = 4;
    }
}
