package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0002R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "", "", "capacity", "newOffset", "Lkotlin/r2;", "ensureCapacity", "itemIndex", "lane", "setLane", "getLane", "targetLane", "", "assignedToLane", "upperBound", "lowerBound", "reset", "findPreviousItemIndex", "findNextItemIndex", "requestedIndex", "ensureValidIndex", "", "gaps", "setGaps", "getGaps", "anchor", "I", "lanes", "[I", "Lkotlin/collections/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "spannedItems", "Lkotlin/collections/k;", "<init>", "()V", "Companion", "SpannedItem", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridLaneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n1#1,208:1\n1#2:209\n388#3,7:210\n388#3,7:217\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridLaneInfo.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo\n*L\n167#1:210,7\n187#1:217,7\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridLaneInfo {
    public static final int FullSpan = -2;
    private static final int MaxCapacity = 131072;
    public static final int Unset = -1;
    private int anchor;

    @l
    private int[] lanes = new int[16];

    @l
    private final k<SpannedItem> spannedItems = new k<>();

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$Companion;", "", "()V", "FullSpan", "", "MaxCapacity", "Unset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo$SpannedItem;", "", "index", "", "gaps", "", "(I[I)V", "getGaps", "()[I", "setGaps", "([I)V", "getIndex", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SpannedItem {

        @l
        private int[] gaps;
        private final int index;

        public SpannedItem(int i5, @l int[] iArr) {
            this.index = i5;
            this.gaps = iArr;
        }

        @l
        public final int[] getGaps() {
            return this.gaps;
        }

        public final int getIndex() {
            return this.index;
        }

        public final void setGaps(@l int[] iArr) {
            this.gaps = iArr;
        }
    }

    private final void ensureCapacity(int i5, int i6) {
        boolean z4;
        int[] I0;
        if (i5 <= 131072) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int[] iArr = this.lanes;
            if (iArr.length < i5) {
                int length = iArr.length;
                while (length < i5) {
                    length *= 2;
                }
                I0 = o.I0(this.lanes, new int[length], i6, 0, 0, 12, null);
                this.lanes = I0;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i5 + " is larger than max supported: 131072!").toString());
    }

    static /* synthetic */ void ensureCapacity$default(LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        lazyStaggeredGridLaneInfo.ensureCapacity(i5, i6);
    }

    public final boolean assignedToLane(int i5, int i6) {
        int lane = getLane(i5);
        return lane == i6 || lane == -1 || lane == -2;
    }

    public final void ensureValidIndex(int i5) {
        boolean z4;
        int i6 = this.anchor;
        int i7 = i5 - i6;
        if (i7 >= 0 && i7 < 131072) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            ensureCapacity$default(this, i7 + 1, 0, 2, null);
        } else {
            int max = Math.max(i5 - (this.lanes.length / 2), 0);
            this.anchor = max;
            int i8 = max - i6;
            if (i8 >= 0) {
                int[] iArr = this.lanes;
                if (i8 < iArr.length) {
                    o.z0(iArr, iArr, 0, i8, iArr.length);
                }
                int[] iArr2 = this.lanes;
                o.K1(iArr2, 0, Math.max(0, iArr2.length - i8), this.lanes.length);
            } else {
                int i9 = -i8;
                int[] iArr3 = this.lanes;
                if (iArr3.length + i9 < 131072) {
                    ensureCapacity(iArr3.length + i9 + 1, i9);
                } else {
                    if (i9 < iArr3.length) {
                        o.z0(iArr3, iArr3, i9, 0, iArr3.length - i9);
                    }
                    int[] iArr4 = this.lanes;
                    o.K1(iArr4, 0, 0, Math.min(iArr4.length, i9));
                }
            }
        }
        while ((!this.spannedItems.isEmpty()) && this.spannedItems.first().getIndex() < lowerBound()) {
            this.spannedItems.removeFirst();
        }
        while ((!this.spannedItems.isEmpty()) && this.spannedItems.last().getIndex() > upperBound()) {
            this.spannedItems.removeLast();
        }
    }

    public final int findNextItemIndex(int i5, int i6) {
        int upperBound = upperBound();
        for (int i7 = i5 + 1; i7 < upperBound; i7++) {
            if (assignedToLane(i7, i6)) {
                return i7;
            }
        }
        return upperBound();
    }

    public final int findPreviousItemIndex(int i5, int i6) {
        do {
            i5--;
            if (-1 >= i5) {
                return -1;
            }
        } while (!assignedToLane(i5, i6));
        return i5;
    }

    @m
    public final int[] getGaps(int i5) {
        int t5;
        Object T2;
        k<SpannedItem> kVar = this.spannedItems;
        t5 = kotlin.collections.w.t(kVar, 0, kVar.size(), new LazyStaggeredGridLaneInfo$getGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i5)));
        T2 = e0.T2(this.spannedItems, t5);
        SpannedItem spannedItem = (SpannedItem) T2;
        if (spannedItem != null) {
            return spannedItem.getGaps();
        }
        return null;
    }

    public final int getLane(int i5) {
        if (i5 >= lowerBound() && i5 < upperBound()) {
            return this.lanes[i5 - this.anchor] - 1;
        }
        return -1;
    }

    public final int lowerBound() {
        return this.anchor;
    }

    public final void reset() {
        o.T1(this.lanes, 0, 0, 0, 6, null);
        this.spannedItems.clear();
    }

    public final void setGaps(int i5, @m int[] iArr) {
        int t5;
        k<SpannedItem> kVar = this.spannedItems;
        t5 = kotlin.collections.w.t(kVar, 0, kVar.size(), new LazyStaggeredGridLaneInfo$setGaps$$inlined$binarySearchBy$default$1(Integer.valueOf(i5)));
        if (t5 < 0) {
            if (iArr == null) {
                return;
            }
            this.spannedItems.add(-(t5 + 1), new SpannedItem(i5, iArr));
            return;
        }
        if (iArr == null) {
            this.spannedItems.remove(t5);
        } else {
            this.spannedItems.get(t5).setGaps(iArr);
        }
    }

    public final void setLane(int i5, int i6) {
        boolean z4;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            ensureValidIndex(i5);
            this.lanes[i5 - this.anchor] = i6 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported".toString());
    }

    public final int upperBound() {
        return this.anchor + this.lanes.length;
    }
}
