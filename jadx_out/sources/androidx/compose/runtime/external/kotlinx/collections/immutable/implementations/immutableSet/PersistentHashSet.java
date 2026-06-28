package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001$B\u001d\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "retainAll", "containsAll", "clear", "", "iterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getNode$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "size", "I", "getSize", "()I", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPersistentHashSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,72:1\n31#2:73\n31#2:74\n31#2:75\n31#2:76\n*S KotlinDebug\n*F\n+ 1 PersistentHashSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet\n*L\n24#1:73\n34#1:74\n38#1:75\n42#1:76\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentHashSet<E> extends i<E> implements PersistentSet<E> {

    @l
    private final TrieNode<E> node;
    private final int size;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0002\b\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentHashSet.EMPTY;
        }
    }

    public PersistentHashSet(@l TrieNode<E> trieNode, int i5) {
        this.node = trieNode;
        this.size = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentHashSet<E>) obj);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.node.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean containsAll(@l Collection<? extends Object> collection) {
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).node, 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).getNode$runtime_release(), 0);
        }
        return super.containsAll(collection);
    }

    @l
    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    @Override // kotlin.collections.a
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.i, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((PersistentHashSet<E>) obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> add(E e5) {
        TrieNode<E> add = this.node.add(e5 != null ? e5.hashCode() : 0, e5, 0);
        return this.node == add ? this : new PersistentHashSet(add, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> addAll(@l Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet.Builder<E> builder() {
        return new PersistentHashSetBuilder(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> remove(E e5) {
        TrieNode<E> remove = this.node.remove(e5 != null ? e5.hashCode() : 0, e5, 0);
        return this.node == remove ? this : new PersistentHashSet(remove, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> retainAll(@l Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> removeAll(@l Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentSet<E> removeAll(@l v3.l<? super E, Boolean> lVar) {
        PersistentSet.Builder<E> builder = builder();
        b0.D0(builder, lVar);
        return builder.build();
    }
}
