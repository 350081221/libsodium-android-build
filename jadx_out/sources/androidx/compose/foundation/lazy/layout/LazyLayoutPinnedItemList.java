package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.i0;
import kotlin.jvm.internal.v;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0017\b\u0002\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d¢\u0006\u0004\b#\u0010$B\t\b\u0016¢\u0006\u0004\b#\u0010%J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "element", "", "contains", "", "elements", "containsAll", "", "index", "get", "indexOf", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "item", "Lkotlin/r2;", "pin$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;)V", "pin", "release$foundation_release", "release", "", "items", "Ljava/util/List;", "getSize", "()I", "size", "<init>", "(Ljava/util/List;)V", "()V", "PinnedItem", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutPinnedItemList implements List<PinnedItem>, a {
    public static final int $stable = 8;

    @l
    private final List<PinnedItem> items;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "", "index", "", "getIndex", "()I", DatabaseFileArchive.COLUMN_KEY, "getKey", "()Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @ExperimentalFoundationApi
    /* loaded from: classes.dex */
    public interface PinnedItem {
        int getIndex();

        @m
        Object getKey();
    }

    private LazyLayoutPinnedItemList(List<PinnedItem> list) {
        this.items = list;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i5, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i5, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends PinnedItem> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@l PinnedItem pinnedItem) {
        return this.items.contains(pinnedItem);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof PinnedItem) {
            return contains((PinnedItem) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        return this.items.containsAll(collection);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @l
    public PinnedItem get(int i5) {
        return this.items.get(i5);
    }

    public int getSize() {
        return this.items.size();
    }

    public int indexOf(@l PinnedItem pinnedItem) {
        return this.items.indexOf(pinnedItem);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof PinnedItem) {
            return indexOf((PinnedItem) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<PinnedItem> iterator() {
        return this.items.iterator();
    }

    public int lastIndexOf(@l PinnedItem pinnedItem) {
        return this.items.lastIndexOf(pinnedItem);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof PinnedItem) {
            return lastIndexOf((PinnedItem) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @l
    public ListIterator<PinnedItem> listIterator() {
        return this.items.listIterator();
    }

    @Override // java.util.List
    @l
    public ListIterator<PinnedItem> listIterator(int i5) {
        return this.items.listIterator(i5);
    }

    public final void pin$foundation_release(@l PinnedItem pinnedItem) {
        this.items.add(pinnedItem);
    }

    public final void release$foundation_release(@l PinnedItem pinnedItem) {
        this.items.remove(pinnedItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public PinnedItem remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ PinnedItem remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<PinnedItem> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public PinnedItem set2(int i5, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ PinnedItem set(int i5, PinnedItem pinnedItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super PinnedItem> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @l
    public List<PinnedItem> subList(int i5, int i6) {
        return this.items.subList(i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    public LazyLayoutPinnedItemList() {
        this(new SnapshotStateList());
    }
}
