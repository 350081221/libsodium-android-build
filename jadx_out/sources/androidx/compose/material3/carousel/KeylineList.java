package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.ranges.j;
import kotlin.ranges.u;
import p4.l;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0002H\u0096\u0003J\u0017\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0096\u0001J\u000e\u0010$\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020%J\u0011\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\tH\u0096\u0003J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%J\u000e\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%J\u0011\u0010+\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0002H\u0096\u0001J\t\u0010,\u001a\u00020\u001fH\u0096\u0001J\u0006\u0010-\u001a\u00020\u001fJ\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020%J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0096\u0003J\u000e\u00102\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020%J\u0011\u00103\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0002H\u0096\u0001J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0096\u0001J\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u0002052\u0006\u0010'\u001a\u00020\tH\u0096\u0001J\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\tH\u0096\u0001R\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0012\u0010\u001c\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000b¨\u00069"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "keylines", "(Ljava/util/List;)V", "firstFocal", "getFirstFocal", "()Landroidx/compose/material3/carousel/Keyline;", "firstFocalIndex", "", "getFirstFocalIndex", "()I", "firstNonAnchor", "getFirstNonAnchor", "firstNonAnchorIndex", "getFirstNonAnchorIndex", "lastFocal", "getLastFocal", "lastFocalIndex", "getLastFocalIndex", "lastNonAnchor", "getLastNonAnchor", "lastNonAnchorIndex", "getLastNonAnchorIndex", "pivot", "getPivot", "pivotIndex", "getPivotIndex", "size", "getSize", "contains", "", "element", "containsAll", "elements", "", "firstIndexAfterFocalRangeWithSize", "", "get", "index", "getKeylineAfter", "unadjustedOffset", "getKeylineBefore", "indexOf", "isEmpty", "isFirstFocalItemAtStartOfContainer", "isLastFocalItemAtEndOfContainer", "carouselMainAxisSize", "iterator", "", "lastIndexBeforeFocalRangeWithSize", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nKeyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,471:1\n350#2,7:472\n350#2,7:479\n378#2,7:486\n350#2,7:493\n378#2,7:500\n288#2,2:507\n288#2,2:509\n116#3,2:511\n33#3,6:513\n118#3:519\n*S KotlinDebug\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineList\n*L\n70#1:472,7\n79#1:479,7\n91#1:486,7\n103#1:493,7\n116#1:500,7\n164#1:507,2\n178#1:509,2\n201#1:511,2\n201#1:513,6\n201#1:519\n*E\n"})
/* loaded from: classes.dex */
public final class KeylineList implements List<Keyline>, a {
    public static final int $stable = 8;
    private final /* synthetic */ List<Keyline> $$delegate_0;

    @l
    private final Keyline firstFocal;
    private final int firstFocalIndex;

    @l
    private final Keyline firstNonAnchor;
    private final int firstNonAnchorIndex;

    @l
    private final Keyline lastFocal;
    private final int lastFocalIndex;

    @l
    private final Keyline lastNonAnchor;
    private final int lastNonAnchorIndex;

    @l
    private final Keyline pivot;
    private final int pivotIndex;

    public KeylineList(@l List<Keyline> list) {
        int i5;
        int i6;
        Object T2;
        Object T22;
        this.$$delegate_0 = list;
        Iterator<Keyline> it = iterator();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i5 = -1;
            if (it.hasNext()) {
                if (it.next().isPivot()) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        this.pivotIndex = i8;
        this.pivot = get(i8);
        Iterator<Keyline> it2 = iterator();
        int i9 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (!it2.next().isAnchor()) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        this.firstNonAnchorIndex = i9;
        this.firstNonAnchor = get(i9);
        ListIterator<Keyline> listIterator = listIterator(size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (!listIterator.previous().isAnchor()) {
                    i6 = listIterator.nextIndex();
                    break;
                }
            } else {
                i6 = -1;
                break;
            }
        }
        this.lastNonAnchorIndex = i6;
        this.lastNonAnchor = get(i6);
        Iterator<Keyline> it3 = iterator();
        while (true) {
            if (it3.hasNext()) {
                if (it3.next().isFocal()) {
                    break;
                } else {
                    i7++;
                }
            } else {
                i7 = -1;
                break;
            }
        }
        this.firstFocalIndex = i7;
        T2 = e0.T2(this, i7);
        Keyline keyline = (Keyline) T2;
        if (keyline != null) {
            this.firstFocal = keyline;
            ListIterator<Keyline> listIterator2 = listIterator(size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                } else if (listIterator2.previous().isFocal()) {
                    i5 = listIterator2.nextIndex();
                    break;
                }
            }
            this.lastFocalIndex = i5;
            T22 = e0.T2(this, i5);
            Keyline keyline2 = (Keyline) T22;
            if (keyline2 != null) {
                this.lastFocal = keyline2;
                return;
            }
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i5, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i5, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Keyline> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@l Keyline keyline) {
        return this.$$delegate_0.contains(keyline);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Keyline) {
            return contains((Keyline) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        return this.$$delegate_0.containsAll(collection);
    }

    public final int firstIndexAfterFocalRangeWithSize(float f5) {
        int G;
        Integer num;
        int G2;
        boolean z4;
        int i5 = this.lastFocalIndex;
        G = w.G(this);
        Iterator<Integer> it = new kotlin.ranges.l(i5, G).iterator();
        while (true) {
            if (it.hasNext()) {
                num = it.next();
                if (get(num.intValue()).getSize() == f5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
            } else {
                num = null;
                break;
            }
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        G2 = w.G(this);
        return G2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @l
    public Keyline get(int i5) {
        return this.$$delegate_0.get(i5);
    }

    @l
    public final Keyline getFirstFocal() {
        return this.firstFocal;
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    @l
    public final Keyline getFirstNonAnchor() {
        return this.firstNonAnchor;
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    @l
    public final Keyline getKeylineAfter(float f5) {
        Keyline keyline;
        Object m32;
        boolean z4;
        int size = size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                keyline = get(i5);
                if (keyline.getUnadjustedOffset() >= f5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i5++;
            } else {
                keyline = null;
                break;
            }
        }
        Keyline keyline2 = keyline;
        if (keyline2 == null) {
            m32 = e0.m3(this);
            return (Keyline) m32;
        }
        return keyline2;
    }

    @l
    public final Keyline getKeylineBefore(float f5) {
        Object y22;
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() < f5) {
                    return keyline;
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        y22 = e0.y2(this);
        return (Keyline) y22;
    }

    @l
    public final Keyline getLastFocal() {
        return this.lastFocal;
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    @l
    public final Keyline getLastNonAnchor() {
        return this.lastNonAnchor;
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    @l
    public final Keyline getPivot() {
        return this.pivot;
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public int getSize() {
        return this.$$delegate_0.size();
    }

    public int indexOf(@l Keyline keyline) {
        return this.$$delegate_0.indexOf(keyline);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Keyline) {
            return indexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.$$delegate_0.isEmpty();
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        if (this.firstFocal.getOffset() - (this.firstFocal.getSize() / 2) >= 0.0f && l0.g(this.firstFocal, this.firstNonAnchor)) {
            return true;
        }
        return false;
    }

    public final boolean isLastFocalItemAtEndOfContainer(float f5) {
        if (this.lastFocal.getOffset() + (this.lastFocal.getSize() / 2) <= f5 && l0.g(this.lastFocal, this.lastNonAnchor)) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<Keyline> iterator() {
        return this.$$delegate_0.iterator();
    }

    public final int lastIndexBeforeFocalRangeWithSize(float f5) {
        j k02;
        Integer num;
        boolean z4;
        k02 = u.k0(this.firstFocalIndex - 1, 0);
        Iterator<Integer> it = k02.iterator();
        while (true) {
            if (it.hasNext()) {
                num = it.next();
                if (get(num.intValue()).getSize() == f5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
            } else {
                num = null;
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    public int lastIndexOf(@l Keyline keyline) {
        return this.$$delegate_0.lastIndexOf(keyline);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Keyline) {
            return lastIndexOf((Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @l
    public ListIterator<Keyline> listIterator() {
        return this.$$delegate_0.listIterator();
    }

    @Override // java.util.List
    @l
    public ListIterator<Keyline> listIterator(int i5) {
        return this.$$delegate_0.listIterator(i5);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Keyline remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline remove(int i5) {
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
    public void replaceAll(UnaryOperator<Keyline> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Keyline set2(int i5, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Keyline set(int i5, Keyline keyline) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Keyline> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @l
    public List<Keyline> subList(int i5, int i6) {
        return this.$$delegate_0.subList(i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }
}
