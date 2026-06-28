package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.i0;
import p4.l;
import p4.m;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "E", "", "Lkotlin/r2;", "checkHasNext", "", "hasNext", "next", "()Ljava/lang/Object;", "", "nextElement", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "map", "Ljava/util/Map;", "getMap$runtime_release", "()Ljava/util/Map;", "", "index", "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, a {
    public static final int $stable = 8;
    private int index;

    @l
    private final Map<E, Links> map;

    @m
    private Object nextElement;

    public PersistentOrderedSetIterator(@m Object obj, @l Map<E, Links> map) {
        this.nextElement = obj;
        this.map = map;
    }

    private final void checkHasNext() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    @l
    public final Map<E, Links> getMap$runtime_release() {
        return this.map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.map.size();
    }

    @Override // java.util.Iterator
    public E next() {
        checkHasNext();
        E e5 = (E) this.nextElement;
        this.index++;
        Links links = this.map.get(e5);
        if (links != null) {
            this.nextElement = links.getNext();
            return e5;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e5 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i5) {
        this.index = i5;
    }
}
