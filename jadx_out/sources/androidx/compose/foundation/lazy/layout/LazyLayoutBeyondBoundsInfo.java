package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "", "", "start", "end", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "addInterval", bi.aX, "Lkotlin/r2;", "removeInterval", "", "hasIntervals", "Landroidx/compose/runtime/collection/MutableVector;", "beyondBoundsItems", "Landroidx/compose/runtime/collection/MutableVector;", "getStart", "()I", "getEnd", "<init>", "()V", "Interval", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1208#2:127\n1187#2,2:128\n460#3,11:130\n460#3,11:142\n1#4:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:142,11\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsInfo {
    public static final int $stable = MutableVector.$stable;

    @l
    private final MutableVector<Interval> beyondBoundsItems = new MutableVector<>(new Interval[16], 0);

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "", "start", "", "end", "(II)V", "getEnd", "()I", "getStart", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Interval {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Interval(int i5, int i6) {
            boolean z4;
            this.start = i5;
            this.end = i6;
            if (i5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i6 >= i5) {
                    return;
                } else {
                    throw new IllegalArgumentException("end index greater than start".toString());
                }
            }
            throw new IllegalArgumentException("negative start index".toString());
        }

        public static /* synthetic */ Interval copy$default(Interval interval, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i5 = interval.start;
            }
            if ((i7 & 2) != 0) {
                i6 = interval.end;
            }
            return interval.copy(i5, i6);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        @l
        public final Interval copy(int i5, int i6) {
            return new Interval(i5, i6);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.start == interval.start && this.end == interval.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end);
        }

        @l
        public String toString() {
            return "Interval(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    @l
    public final Interval addInterval(int i5, int i6) {
        Interval interval = new Interval(i5, i6);
        this.beyondBoundsItems.add(interval);
        return interval;
    }

    public final int getEnd() {
        int end = this.beyondBoundsItems.first().getEnd();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                Interval interval = content[i5];
                if (interval.getEnd() > end) {
                    end = interval.getEnd();
                }
                i5++;
            } while (i5 < size);
        }
        return end;
    }

    public final int getStart() {
        int start = this.beyondBoundsItems.first().getStart();
        MutableVector<Interval> mutableVector = this.beyondBoundsItems;
        int size = mutableVector.getSize();
        boolean z4 = false;
        if (size > 0) {
            Interval[] content = mutableVector.getContent();
            int i5 = 0;
            do {
                Interval interval = content[i5];
                if (interval.getStart() < start) {
                    start = interval.getStart();
                }
                i5++;
            } while (i5 < size);
        }
        if (start >= 0) {
            z4 = true;
        }
        if (z4) {
            return start;
        }
        throw new IllegalArgumentException("negative minIndex".toString());
    }

    public final boolean hasIntervals() {
        return this.beyondBoundsItems.isNotEmpty();
    }

    public final void removeInterval(@l Interval interval) {
        this.beyondBoundsItems.remove(interval);
    }
}
