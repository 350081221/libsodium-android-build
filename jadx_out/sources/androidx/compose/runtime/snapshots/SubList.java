package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.ranges.u;
import p4.l;
import w3.e;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0016\u0010\u001d\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u0016\u0010\u001f\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J \u0010 \u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R$\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", "T", "", "Lkotlin/r2;", "validateModification", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "", "listIterator", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "parentList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", TypedValues.CycleType.S_WAVE_OFFSET, "I", "structure", "<set-?>", "size", "getSize", "()I", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,484:1\n1726#2,3:485\n1855#2,2:488\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n336#1:485,3\n345#1:488,2\n*E\n"})
/* loaded from: classes.dex */
public final class SubList<T> implements List<T>, e {
    private final int offset;

    @l
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public SubList(@l SnapshotStateList<T> snapshotStateList, int i5, int i6) {
        this.parentList = snapshotStateList;
        this.offset = i5;
        this.structure = snapshotStateList.getStructure$runtime_release();
        this.size = i6 - i5;
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() == this.structure) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t5) {
        validateModification();
        this.parentList.add(this.offset + size(), t5);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i5, @l Collection<? extends T> collection) {
        validateModification();
        boolean addAll = this.parentList.addAll(i5 + this.offset, collection);
        if (addAll) {
            this.size = size() + collection.size();
            this.structure = this.parentList.getStructure$runtime_release();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i5 = this.offset;
            snapshotStateList.removeRange(i5, size() + i5);
            this.size = 0;
            this.structure = this.parentList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public T get(int i5) {
        validateModification();
        SnapshotStateListKt.validateRange(i5, size());
        return this.parentList.get(this.offset + i5);
    }

    @l
    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        kotlin.ranges.l W1;
        validateModification();
        int i5 = this.offset;
        W1 = u.W1(i5, size() + i5);
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((s0) it).nextInt();
            if (l0.g(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!l0.g(obj, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    @l
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i5) {
        return removeAt(i5);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z4 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    public T removeAt(int i5) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i5);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@l Collection<? extends Object> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i5 = this.offset;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i5, size() + i5);
        if (retainAllInRange$runtime_release > 0) {
            this.structure = this.parentList.getStructure$runtime_release();
            this.size = size() - retainAllInRange$runtime_release;
        }
        if (retainAllInRange$runtime_release > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T set(int i5, T t5) {
        SnapshotStateListKt.validateRange(i5, size());
        validateModification();
        T t6 = this.parentList.set(i5 + this.offset, t5);
        this.structure = this.parentList.getStructure$runtime_release();
        return t6;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @l
    public List<T> subList(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0 && i5 <= i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || i6 > size()) {
            z5 = false;
        }
        if (z5) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i7 = this.offset;
            return new SubList(snapshotStateList, i5 + i7, i6 + i7);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    @Override // java.util.List
    @l
    public ListIterator<T> listIterator(int i5) {
        validateModification();
        k1.f fVar = new k1.f();
        fVar.element = i5 - 1;
        return new SubList$listIterator$1(fVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public void add(int i5, T t5) {
        validateModification();
        this.parentList.add(this.offset + i5, t5);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@l Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
