package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import w3.d;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H$¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H$J\t\u0010\n\u001a\u00020\tH\u0096\u0002J\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0007H\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/collection/IndexBasedArrayIterator;", "T", "", "", "index", "elementAt", "(I)Ljava/lang/Object;", "Lkotlin/r2;", "removeAt", "", "hasNext", "next", "()Ljava/lang/Object;", "remove", "size", "I", "canRemove", "Z", "startingSize", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, d {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i5) {
        this.size = i5;
    }

    protected abstract T elementAt(int i5);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T elementAt = elementAt(this.index);
            this.index++;
            this.canRemove = true;
            return elementAt;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            int i5 = this.index - 1;
            this.index = i5;
            removeAt(i5);
            this.size--;
            this.canRemove = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }

    protected abstract void removeAt(int i5);
}
