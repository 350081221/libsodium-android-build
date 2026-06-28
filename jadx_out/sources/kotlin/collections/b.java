package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH$J\b\u0010\n\u001a\u00020\tH\u0004J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/collections/AbstractIterator;", "T", "", "()V", "nextValue", "Ljava/lang/Object;", "state", "Lkotlin/collections/State;", "computeNext", "", "done", "hasNext", "", "next", "()Ljava/lang/Object;", "setNext", t0.b.f22420d, "(Ljava/lang/Object;)V", "tryToComputeNext", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b<T> implements Iterator<T>, w3.a {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private p1 f19092a = p1.NotReady;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private T f19093b;

    @kotlin.i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19094a;

        static {
            int[] iArr = new int[p1.values().length];
            try {
                iArr[p1.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p1.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19094a = iArr;
        }
    }

    private final boolean d() {
        this.f19092a = p1.Failed;
        a();
        if (this.f19092a == p1.Ready) {
            return true;
        }
        return false;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        this.f19092a = p1.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(T t5) {
        this.f19093b = t5;
        this.f19092a = p1.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z4;
        p1 p1Var = this.f19092a;
        if (p1Var != p1.Failed) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i5 = a.f19094a[p1Var.ordinal()];
            if (i5 == 1) {
                return false;
            }
            if (i5 == 2) {
                return true;
            }
            return d();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f19092a = p1.NotReady;
            return this.f19093b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
