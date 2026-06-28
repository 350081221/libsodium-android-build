package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.u1;
import p4.l;
import p4.m;
import w3.d;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "Lkotlin/r2;", "checkNextWasInvoked", "checkForComodification", "next", "()Ljava/lang/Object;", "remove", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "lastIteratedElement", "Ljava/lang/Object;", "", "nextWasInvoked", "Z", "", "expectedModCount", "I", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements Iterator<E>, d {
    public static final int $stable = 8;

    @l
    private final PersistentOrderedSetBuilder<E> builder;
    private int expectedModCount;

    @m
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentOrderedSetMutableIterator(@l PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.getFirstElement$runtime_release(), persistentOrderedSetBuilder.getHashMapBuilder$runtime_release());
        this.builder = persistentOrderedSetBuilder;
        this.expectedModCount = persistentOrderedSetBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() == this.expectedModCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (this.nextWasInvoked) {
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e5 = (E) super.next();
        this.lastIteratedElement = e5;
        this.nextWasInvoked = true;
        return e5;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        u1.a(this.builder).remove(this.lastIteratedElement);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        setIndex$runtime_release(getIndex$runtime_release() - 1);
    }
}
