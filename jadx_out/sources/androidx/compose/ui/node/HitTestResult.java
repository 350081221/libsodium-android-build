package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;<B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nJ$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012J,\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012J,\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012J\u0017\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0086\bJ\u0011\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\u0011\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0096\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020&2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eH\u0016J\u0006\u0010+\u001a\u00020\u0003R\u001e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u001e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "resizeToHitDepth", "Landroidx/compose/ui/node/DistanceAndInLayer;", "findBestHitDistance-ptXAw2c", "()J", "findBestHitDistance", "ensureContainerSize", "", "hasHit", "acceptHits", "", "distanceFromEdge", "isInLayer", "isHitInMinimumTouchTargetBetter", "node", "Lkotlin/Function0;", "childHitTest", "hit", "hitInMinimumTouchTarget", "speculativeHit", "block", "siblingHits", "element", "contains", "", "elements", "containsAll", "", "index", "get", "indexOf", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "clear", "", "", "values", "[Ljava/lang/Object;", "", "distanceFromEdgeAndInLayer", "[J", "hitDepth", "I", "<set-?>", "size", "getSize", "()I", "<init>", "()V", "HitTestResultIterator", "SubList", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n195#1:342,2\n*E\n"})
/* loaded from: classes.dex */
public final class HitTestResult implements List<Modifier.Node>, w3.a {
    public static final int $stable = 8;
    private int size;

    @l
    private Object[] values = new Object[16];

    @l
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "index", "", "minIndex", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;III)V", "getIndex", "()I", "setIndex", "(I)V", "getMaxIndex", "getMinIndex", "hasNext", "", "hasPrevious", "next", "nextIndex", "previous", "previousIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private final class HitTestResultIterator implements ListIterator<Modifier.Node>, w3.a {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i5, int i6, int i7) {
            this.index = i5;
            this.minIndex = i6;
            this.maxIndex = i7;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public void set2(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i5) {
            this.index = i5;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @l
        public Modifier.Node next() {
            Object[] objArr = HitTestResult.this.values;
            int i5 = this.index;
            this.index = i5 + 1;
            Object obj = objArr[i5];
            l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.ListIterator
        @l
        public Modifier.Node previous() {
            Object[] objArr = HitTestResult.this.values;
            int i5 = this.index - 1;
            this.index = i5;
            Object obj = objArr[i5];
            l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i5, int i6, int i7, int i8, w wVar) {
            this((i8 & 1) != 0 ? 0 : i5, (i8 & 2) != 0 ? 0 : i6, (i8 & 4) != 0 ? hitTestResult.size() : i7);
        }
    }

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0011\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "minIndex", "", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;II)V", "getMaxIndex", "()I", "getMinIndex", "size", "getSize", "contains", "", "element", "containsAll", "elements", "", "get", "index", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n273#1:342,2\n*E\n"})
    /* loaded from: classes.dex */
    private final class SubList implements List<Modifier.Node>, w3.a {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i5, int i6) {
            this.minIndex = i5;
            this.maxIndex = i6;
        }

        /* renamed from: add, reason: avoid collision after fix types in other method */
        public void add2(int i5, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i5, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i5, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return contains((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return indexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<Modifier.Node> iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i5 = this.minIndex;
            return new HitTestResultIterator(i5, i5, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return lastIndexOf((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        @l
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i5 = this.minIndex;
            return new HitTestResultIterator(i5, i5, this.maxIndex);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        public Modifier.Node remove(int i5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i5) {
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
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: set, reason: avoid collision after fix types in other method */
        public Modifier.Node set2(int i5, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i5, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @l
        public List<Modifier.Node> subList(int i5, int i6) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i7 = this.minIndex;
            return new SubList(i5 + i7, i7 + i6);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) v.b(this, tArr);
        }

        public boolean contains(@l Modifier.Node node) {
            return indexOf((Object) node) != -1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.List
        @l
        public Modifier.Node get(int i5) {
            Object obj = HitTestResult.this.values[i5 + this.minIndex];
            l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) obj;
        }

        public int indexOf(@l Modifier.Node node) {
            int i5 = this.minIndex;
            int i6 = this.maxIndex;
            if (i5 > i6) {
                return -1;
            }
            while (!l0.g(HitTestResult.this.values[i5], node)) {
                if (i5 == i6) {
                    return -1;
                }
                i5++;
            }
            return i5 - this.minIndex;
        }

        public int lastIndexOf(@l Modifier.Node node) {
            int i5 = this.maxIndex;
            int i6 = this.minIndex;
            if (i6 > i5) {
                return -1;
            }
            while (!l0.g(HitTestResult.this.values[i5], node)) {
                if (i5 == i6) {
                    return -1;
                }
                i5--;
            }
            return i5 - this.minIndex;
        }

        @Override // java.util.List
        @l
        public ListIterator<Modifier.Node> listIterator(int i5) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i6 = this.minIndex;
            return new HitTestResultIterator(i5 + i6, i6, this.maxIndex);
        }
    }

    private final void ensureContainerSize() {
        int i5 = this.hitDepth;
        Object[] objArr = this.values;
        if (i5 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    /* renamed from: findBestHitDistance-ptXAw2c, reason: not valid java name */
    private final long m5121findBestHitDistanceptXAw2c() {
        long DistanceAndInLayer;
        int G;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i5 = this.hitDepth + 1;
        G = kotlin.collections.w.G(this);
        if (i5 <= G) {
            while (true) {
                long m5113constructorimpl = DistanceAndInLayer.m5113constructorimpl(this.distanceFromEdgeAndInLayer[i5]);
                if (DistanceAndInLayer.m5112compareToS_HNhKs(m5113constructorimpl, DistanceAndInLayer) < 0) {
                    DistanceAndInLayer = m5113constructorimpl;
                }
                if (DistanceAndInLayer.m5116getDistanceimpl(DistanceAndInLayer) < 0.0f && DistanceAndInLayer.m5118isInLayerimpl(DistanceAndInLayer)) {
                    return DistanceAndInLayer;
                }
                if (i5 == G) {
                    break;
                }
                i5++;
            }
        }
        return DistanceAndInLayer;
    }

    private final void resizeToHitDepth() {
        int G;
        int i5 = this.hitDepth + 1;
        G = kotlin.collections.w.G(this);
        if (i5 <= G) {
            while (true) {
                this.values[i5] = null;
                if (i5 == G) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i5, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i5, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i5, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return contains((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long m5121findBestHitDistanceptXAw2c = m5121findBestHitDistanceptXAw2c();
        if (DistanceAndInLayer.m5116getDistanceimpl(m5121findBestHitDistanceptXAw2c) < 0.0f && DistanceAndInLayer.m5118isInLayerimpl(m5121findBestHitDistanceptXAw2c)) {
            return true;
        }
        return false;
    }

    public final void hit(@l Modifier.Node node, boolean z4, @l v3.a<r2> aVar) {
        hitInMinimumTouchTarget(node, -1.0f, z4, aVar);
    }

    public final void hitInMinimumTouchTarget(@l Modifier.Node node, float f5, boolean z4, @l v3.a<r2> aVar) {
        long DistanceAndInLayer;
        int i5 = this.hitDepth;
        this.hitDepth = i5 + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i6 = this.hitDepth;
        objArr[i6] = node;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f5, z4);
        jArr[i6] = DistanceAndInLayer;
        resizeToHitDepth();
        aVar.invoke();
        this.hitDepth = i5;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return indexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f5, boolean z4) {
        int G;
        long DistanceAndInLayer;
        int i5 = this.hitDepth;
        G = kotlin.collections.w.G(this);
        if (i5 == G) {
            return true;
        }
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f5, z4);
        if (DistanceAndInLayer.m5112compareToS_HNhKs(m5121findBestHitDistanceptXAw2c(), DistanceAndInLayer) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<Modifier.Node> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return lastIndexOf((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @l
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Modifier.Node remove(int i5) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i5) {
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
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public Modifier.Node set2(int i5, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i5, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(@l v3.a<r2> aVar) {
        int i5 = this.hitDepth;
        aVar.invoke();
        this.hitDepth = i5;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(@l Modifier.Node node, float f5, boolean z4, @l v3.a<r2> aVar) {
        int G;
        int G2;
        int G3;
        int G4;
        int i5 = this.hitDepth;
        G = kotlin.collections.w.G(this);
        if (i5 == G) {
            hitInMinimumTouchTarget(node, f5, z4, aVar);
            int i6 = this.hitDepth + 1;
            G4 = kotlin.collections.w.G(this);
            if (i6 == G4) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long m5121findBestHitDistanceptXAw2c = m5121findBestHitDistanceptXAw2c();
        int i7 = this.hitDepth;
        G2 = kotlin.collections.w.G(this);
        this.hitDepth = G2;
        hitInMinimumTouchTarget(node, f5, z4, aVar);
        int i8 = this.hitDepth + 1;
        G3 = kotlin.collections.w.G(this);
        if (i8 < G3 && DistanceAndInLayer.m5112compareToS_HNhKs(m5121findBestHitDistanceptXAw2c, m5121findBestHitDistanceptXAw2c()) > 0) {
            int i9 = this.hitDepth + 1;
            int i10 = i7 + 1;
            Object[] objArr = this.values;
            o.B0(objArr, objArr, i10, i9, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            o.A0(jArr, jArr, i10, i9, size());
            this.hitDepth = ((size() + i7) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i7;
    }

    @Override // java.util.List
    @l
    public List<Modifier.Node> subList(int i5, int i6) {
        return new SubList(i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    public boolean contains(@l Modifier.Node node) {
        return indexOf((Object) node) != -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @l
    public Modifier.Node get(int i5) {
        Object obj = this.values[i5];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) obj;
    }

    public int indexOf(@l Modifier.Node node) {
        int G;
        G = kotlin.collections.w.G(this);
        if (G < 0) {
            return -1;
        }
        int i5 = 0;
        while (!l0.g(this.values[i5], node)) {
            if (i5 == G) {
                return -1;
            }
            i5++;
        }
        return i5;
    }

    public int lastIndexOf(@l Modifier.Node node) {
        int G;
        for (G = kotlin.collections.w.G(this); -1 < G; G--) {
            if (l0.g(this.values[G], node)) {
                return G;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @l
    public ListIterator<Modifier.Node> listIterator(int i5) {
        return new HitTestResultIterator(this, i5, 0, 0, 6, null);
    }
}
