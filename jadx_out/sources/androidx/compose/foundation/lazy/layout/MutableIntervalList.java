package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "itemIndex", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "getIntervalForIndex", "index", "Lkotlin/r2;", "checkIndexBounds", "", "contains", "size", b.f22420d, "addInterval", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "forEach", "get", "Landroidx/compose/runtime/collection/MutableVector;", "intervals", "Landroidx/compose/runtime/collection/MutableVector;", "<set-?>", "I", "getSize", "()I", "lastInterval", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n1208#2:223\n1187#2,2:224\n523#3:226\n523#3:227\n523#3:228\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n104#1:223\n104#1:224,2\n156#1:226\n158#1:227\n175#1:228\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;

    @l
    private final MutableVector<IntervalList.Interval<T>> intervals = new MutableVector<>(new IntervalList.Interval[16], 0);

    @m
    private IntervalList.Interval<? extends T> lastInterval;
    private int size;

    private final void checkIndexBounds(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < getSize()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + ", size " + getSize());
    }

    private final boolean contains(IntervalList.Interval<? extends T> interval, int i5) {
        return i5 < interval.getStartIndex() + interval.getSize() && interval.getStartIndex() <= i5;
    }

    private final IntervalList.Interval<T> getIntervalForIndex(int i5) {
        int binarySearch;
        IntervalList.Interval<? extends T> interval = this.lastInterval;
        if (interval == null || !contains(interval, i5)) {
            MutableVector<IntervalList.Interval<T>> mutableVector = this.intervals;
            binarySearch = IntervalListKt.binarySearch(mutableVector, i5);
            IntervalList.Interval interval2 = (IntervalList.Interval<? extends T>) mutableVector.getContent()[binarySearch];
            this.lastInterval = interval2;
            return interval2;
        }
        return interval;
    }

    public final void addInterval(int i5, T t5) {
        boolean z4;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 == 0) {
                return;
            }
            IntervalList.Interval<T> interval = new IntervalList.Interval<>(getSize(), i5, t5);
            this.size = getSize() + i5;
            this.intervals.add(interval);
            return;
        }
        throw new IllegalArgumentException(("size should be >=0, but was " + i5).toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i5, int i6, @l v3.l<? super IntervalList.Interval<? extends T>, r2> lVar) {
        boolean z4;
        int binarySearch;
        checkIndexBounds(i5);
        checkIndexBounds(i6);
        if (i6 >= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            binarySearch = IntervalListKt.binarySearch(this.intervals, i5);
            int startIndex = this.intervals.getContent()[binarySearch].getStartIndex();
            while (startIndex <= i6) {
                IntervalList.Interval<T> interval = this.intervals.getContent()[binarySearch];
                lVar.invoke(interval);
                startIndex += interval.getSize();
                binarySearch++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i6 + ") should be not smaller than fromIndex (" + i5 + ')').toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    @l
    public IntervalList.Interval<T> get(int i5) {
        checkIndexBounds(i5);
        return getIntervalForIndex(i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.size;
    }
}
