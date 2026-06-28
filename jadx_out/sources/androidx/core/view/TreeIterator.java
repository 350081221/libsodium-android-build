package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/core/view/TreeIterator;", "T", "", "item", "Lkotlin/r2;", "prepareNextIterator", "(Ljava/lang/Object;)V", "", "hasNext", "next", "()Ljava/lang/Object;", "Lkotlin/Function1;", "getChildIterator", "Lv3/l;", "", "stack", "Ljava/util/List;", "iterator", "Ljava/util/Iterator;", "rootIterator", "<init>", "(Ljava/util/Iterator;Lv3/l;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class TreeIterator<T> implements Iterator<T>, w3.a {

    @p4.l
    private final v3.l<T, Iterator<T>> getChildIterator;

    @p4.l
    private Iterator<? extends T> iterator;

    @p4.l
    private final List<Iterator<T>> stack = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public TreeIterator(@p4.l Iterator<? extends T> it, @p4.l v3.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.getChildIterator = lVar;
        this.iterator = it;
    }

    private final void prepareNextIterator(T t5) {
        Object m32;
        Iterator<T> invoke = this.getChildIterator.invoke(t5);
        if (invoke != null && invoke.hasNext()) {
            this.stack.add(this.iterator);
            this.iterator = invoke;
            return;
        }
        while (!this.iterator.hasNext() && (!this.stack.isEmpty())) {
            m32 = kotlin.collections.e0.m3(this.stack);
            this.iterator = (Iterator) m32;
            kotlin.collections.b0.L0(this.stack);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.iterator.next();
        prepareNextIterator(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
