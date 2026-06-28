package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.u1;
import p4.l;
import p4.m;
import w3.d;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b$\u0010%J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\t\u0010\n\u001a\u00020\tH\u0096\u0002J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "Lkotlin/r2;", "checkHasNext", "checkNextWasInvoked", "checkForComodification", "", "hasNext", "next", "remove", "", "nextKey", "Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "lastIteratedKey", "getLastIteratedKey$runtime_release", "()Ljava/lang/Object;", "setLastIteratedKey$runtime_release", "(Ljava/lang/Object;)V", "nextWasInvoked", "Z", "", "expectedModCount", "I", "index", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, d {
    public static final int $stable = 8;

    @l
    private final PersistentOrderedMapBuilder<K, V> builder;
    private int expectedModCount;
    private int index;

    @m
    private Object lastIteratedKey = EndOfChain.INSTANCE;

    @m
    private Object nextKey;
    private boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(@m Object obj, @l PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.nextKey = obj;
        this.builder = persistentOrderedMapBuilder;
        this.expectedModCount = persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() == this.expectedModCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasNext() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    private final void checkNextWasInvoked() {
        if (this.nextWasInvoked) {
        } else {
            throw new IllegalStateException();
        }
    }

    @l
    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime_release() {
        return this.builder;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    @m
    public final Object getLastIteratedKey$runtime_release() {
        return this.lastIteratedKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        u1.k(this.builder).remove(this.lastIteratedKey);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.index--;
    }

    public final void setIndex$runtime_release(int i5) {
        this.index = i5;
    }

    public final void setLastIteratedKey$runtime_release(@m Object obj) {
        this.lastIteratedKey = obj;
    }

    @Override // java.util.Iterator
    @l
    public LinkedValue<V> next() {
        checkForComodification();
        checkHasNext();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        this.index++;
        LinkedValue<V> linkedValue = this.builder.getHashMapBuilder$runtime_release().get(this.nextKey);
        if (linkedValue != null) {
            LinkedValue<V> linkedValue2 = linkedValue;
            this.nextKey = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
    }
}
