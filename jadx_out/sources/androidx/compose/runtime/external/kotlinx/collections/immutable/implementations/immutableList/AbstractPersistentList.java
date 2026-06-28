package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.c;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0002J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/c;", "", "fromIndex", "toIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "subList", "", "elements", "addAll", "index", "c", "element", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "clear", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "", "iterator", "", "listIterator", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends c<E> implements PersistentList<E> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean containsAll(@l Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.c, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.c, java.util.List
    @l
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((AbstractPersistentList<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> addAll(@l Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> remove(E e5) {
        int indexOf = indexOf(e5);
        return indexOf != -1 ? removeAt(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> removeAll(@l Collection<? extends E> collection) {
        return removeAll((v3.l) new AbstractPersistentList$removeAll$1(collection));
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> retainAll(@l Collection<? extends E> collection) {
        return removeAll((v3.l) new AbstractPersistentList$retainAll$1(collection));
    }

    @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    @l
    public ImmutableList<E> subList(int i5, int i6) {
        return super.subList(i5, i6);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> addAll(int i5, @l Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i5, collection);
        return builder.build();
    }
}
