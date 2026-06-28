package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.h;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b-\u0010.J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0016\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\tJ\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020#8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R*\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020#8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "E", "Lkotlin/collections/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "build", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "", "elements", "addAll", "retainAll", "removeAll", "containsAll", "remove", "Lkotlin/r2;", "clear", "", "iterator", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnership$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "modCount", "I", "getModCount$runtime_release", "()I", b.f22420d, "size", "getSize", "setSize", "(I)V", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PersistentHashSetBuilder<E> extends h<E> implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private int modCount;

    @l
    private TrieNode<E> node;

    @l
    private MutabilityOwnership ownership = new MutabilityOwnership();

    @l
    private PersistentHashSet<E> set;
    private int size;

    public PersistentHashSetBuilder(@l PersistentHashSet<E> persistentHashSet) {
        this.set = persistentHashSet;
        this.node = this.set.getNode$runtime_release();
        this.size = this.set.size();
    }

    @Override // kotlin.collections.h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e5) {
        int i5;
        int size = size();
        TrieNode<E> trieNode = this.node;
        if (e5 != null) {
            i5 = e5.hashCode();
        } else {
            i5 = 0;
        }
        this.node = trieNode.mutableAdd(i5, e5, 0, this);
        if (size == size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@l Collection<? extends E> collection) {
        PersistentHashSet<E> persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<E> mutableAddAll = this.node.mutableAddAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
            int size2 = (collection.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                this.node = mutableAddAll;
                setSize(size2);
            }
            if (size == size()) {
                return false;
            }
            return true;
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        TrieNode<E> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        l0.n(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@l Collection<? extends Object> collection) {
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).getNode$runtime_release(), 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).node, 0);
        }
        return super.containsAll(collection);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    @l
    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    @l
    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    @Override // kotlin.collections.h
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @l
    public Iterator<E> iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i5;
        int size = size();
        TrieNode<E> trieNode = this.node;
        if (obj != null) {
            i5 = obj.hashCode();
        } else {
            i5 = 0;
        }
        this.node = trieNode.mutableRemove(i5, obj, 0, this);
        if (size == size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@l Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            Object mutableRemoveAll = this.node.mutableRemoveAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
            int count = size - deltaCounter.getCount();
            if (count == 0) {
                clear();
            } else if (count != size) {
                l0.n(mutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.node = (TrieNode) mutableRemoveAll;
                setSize(count);
            }
            if (size == size()) {
                return false;
            }
            return true;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@l Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            Object mutableRetainAll = this.node.mutableRetainAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
            int count = deltaCounter.getCount();
            if (count == 0) {
                clear();
            } else if (count != size) {
                l0.n(mutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.node = (TrieNode) mutableRetainAll;
                setSize(count);
            }
            if (size == size()) {
                return false;
            }
            return true;
        }
        return super.retainAll(collection);
    }

    public void setSize(int i5) {
        this.size = i5;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @l
    public PersistentHashSet<E> build() {
        PersistentHashSet<E> persistentHashSet;
        if (this.node == this.set.getNode$runtime_release()) {
            persistentHashSet = this.set;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet<>(this.node, size());
        }
        this.set = persistentHashSet;
        return persistentHashSet;
    }
}
