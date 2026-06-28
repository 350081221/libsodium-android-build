package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.collections.b0;
import kotlin.i0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import w3.a;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "slotIds", "Lkotlin/r2;", "getSlotsToRetain", "slotId", "reusableSlotId", "", "areCompatible", "SlotIdsSet", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0003J\u0019\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0096\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0001J\u0019\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH\u0096\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0012J\u0016\u0010\u0014\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001c\u0010\u0014\u001a\u00020\u00042\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0012J\u0006\u0010\u0016\u001a\u00020\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "element", "", "contains", "elements", "containsAll", "isEmpty", "slotId", "add$ui_release", "(Ljava/lang/Object;)Z", "add", "", "iterator", "remove", "slotIds", "removeAll", "Lkotlin/Function1;", "predicate", "retainAll", "Lkotlin/r2;", "clear", "", "set", "Ljava/util/Set;", "", "getSize", "()I", "size", "<init>", "(Ljava/util/Set;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class SlotIdsSet implements Collection<Object>, a {
        public static final int $stable = 8;

        @l
        private final Set<Object> set;

        /* JADX WARN: Multi-variable type inference failed */
        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public SlotIdsSet(@l Set<Object> set) {
            this.set = set;
        }

        @Override // java.util.Collection
        /* renamed from: add$ui_release, reason: merged with bridge method [inline-methods] */
        public final boolean add(@m Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@m Object obj) {
            return this.set.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> collection) {
            return this.set.containsAll(collection);
        }

        public int getSize() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @l
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@m Object obj) {
            return this.set.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@l Collection<? extends Object> collection) {
            return this.set.remove(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@l Collection<? extends Object> collection) {
            return this.set.retainAll(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }

        public final boolean removeAll(@l v3.l<Object, Boolean> lVar) {
            boolean D0;
            D0 = b0.D0(this.set, lVar);
            return D0;
        }

        public final boolean retainAll(@l v3.l<Object, Boolean> lVar) {
            boolean N0;
            N0 = b0.N0(this.set, lVar);
            return N0;
        }

        public /* synthetic */ SlotIdsSet(Set set, int i5, w wVar) {
            this((i5 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    boolean areCompatible(@m Object obj, @m Object obj2);

    void getSlotsToRetain(@l SlotIdsSet slotIdsSet);
}
