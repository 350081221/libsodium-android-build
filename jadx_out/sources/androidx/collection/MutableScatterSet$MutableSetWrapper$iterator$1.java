package androidx.collection;

import java.util.Iterator;
import kotlin.i0;
import kotlin.sequences.q;
import p4.l;
import w3.d;

/* JADX INFO: Add missing generic type declarations: [E] */
@i0(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"androidx/collection/MutableScatterSet$MutableSetWrapper$iterator$1", "", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/r2;", "remove", "", "current", "I", "getCurrent", "()I", "setCurrent", "(I)V", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "collection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements Iterator<E>, d {
    private int current = -1;

    @l
    private final Iterator<E> iterator;
    final /* synthetic */ MutableScatterSet<E> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet<E> mutableScatterSet) {
        Iterator<E> a5;
        this.this$0 = mutableScatterSet;
        a5 = q.a(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(mutableScatterSet, this, null));
        this.iterator = a5;
    }

    public final int getCurrent() {
        return this.current;
    }

    @l
    public final Iterator<E> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i5 = this.current;
        if (i5 != -1) {
            this.this$0.removeElementAt(i5);
            this.current = -1;
        }
    }

    public final void setCurrent(int i5) {
        this.current = i5;
    }
}
