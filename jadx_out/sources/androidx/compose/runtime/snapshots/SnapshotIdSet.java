package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.sequences.q;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B+\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0096\u0002J\u001d\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086\bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "bit", "", "get", "set", "clear", "bits", "andNot", "and", "or", "", "iterator", "Lkotlin/Function1;", "Lkotlin/r2;", "block", "fastForEach", "default", "lowest", "", "toString", "", "upperSet", "J", "lowerSet", "lowerBound", "I", "", "belowBound", "[I", "<init>", "(JJI[I)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nSnapshotIdSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n13600#2,2:398\n1789#3,3:400\n1789#3,3:403\n1789#3,3:406\n1789#3,3:409\n1789#3,3:412\n1549#3:415\n1620#3,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotIdSet.kt\nandroidx/compose/runtime/snapshots/SnapshotIdSet\n*L\n107#1:398,2\n236#1:400,3\n257#1:403,3\n261#1:406,3\n283#1:409,3\n286#1:412,3\n343#1:415\n343#1:416,3\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Integer>, w3.a {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);

    @m
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    private SnapshotIdSet(long j5, long j6, int i5, int[] iArr) {
        this.upperSet = j5;
        this.lowerSet = j6;
        this.lowerBound = i5;
        this.belowBound = iArr;
    }

    @l
    public final SnapshotIdSet and(@l SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (l0.g(snapshotIdSet, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        if (l0.g(this, snapshotIdSet2)) {
            return snapshotIdSet2;
        }
        int i5 = snapshotIdSet.lowerBound;
        int i6 = this.lowerBound;
        if (i5 == i6) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                long j5 = this.upperSet;
                long j6 = snapshotIdSet.upperSet;
                long j7 = j5 & j6;
                long j8 = this.lowerSet;
                long j9 = snapshotIdSet.lowerSet;
                long j10 = j8 & j9;
                if (j7 != 0 || j10 != 0 || iArr2 != null) {
                    return new SnapshotIdSet(j6 & j5, j8 & j9, i6, iArr2);
                }
                return snapshotIdSet2;
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (snapshotIdSet.get(intValue)) {
                    snapshotIdSet2 = snapshotIdSet2.set(intValue);
                }
            }
            return snapshotIdSet2;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        while (it2.hasNext()) {
            int intValue2 = it2.next().intValue();
            if (get(intValue2)) {
                snapshotIdSet2 = snapshotIdSet2.set(intValue2);
            }
        }
        return snapshotIdSet2;
    }

    @l
    public final SnapshotIdSet andNot(@l SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i5 = snapshotIdSet.lowerBound;
        int i6 = this.lowerBound;
        if (i5 == i6) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet & (~snapshotIdSet.upperSet), this.lowerSet & (~snapshotIdSet.lowerSet), i6, iArr2);
            }
        }
        Iterator<Integer> it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.clear(it.next().intValue());
        }
        return snapshotIdSet3;
    }

    @l
    public final SnapshotIdSet clear(int i5) {
        int[] iArr;
        int binarySearch;
        int i6 = this.lowerBound;
        int i7 = i5 - i6;
        if (i7 >= 0 && i7 < 64) {
            long j5 = 1 << i7;
            long j6 = this.lowerSet;
            if ((j6 & j5) != 0) {
                return new SnapshotIdSet(this.upperSet, j6 & (~j5), i6, this.belowBound);
            }
        } else if (i7 >= 64 && i7 < 128) {
            long j7 = 1 << (i7 - 64);
            long j8 = this.upperSet;
            if ((j8 & j7) != 0) {
                return new SnapshotIdSet(j8 & (~j7), this.lowerSet, i6, this.belowBound);
            }
        } else if (i7 < 0 && (iArr = this.belowBound) != null && (binarySearch = SnapshotIdSetKt.binarySearch(iArr, i5)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[length];
            if (binarySearch > 0) {
                o.z0(iArr, iArr2, 0, 0, binarySearch);
            }
            if (binarySearch < length) {
                o.z0(iArr, iArr2, binarySearch, binarySearch + 1, length + 1);
            }
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final void fastForEach(@l v3.l<? super Integer, r2> lVar) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            for (int i5 : iArr) {
                lVar.invoke(Integer.valueOf(i5));
            }
        }
        if (this.lowerSet != 0) {
            for (int i6 = 0; i6 < 64; i6++) {
                if ((this.lowerSet & (1 << i6)) != 0) {
                    lVar.invoke(Integer.valueOf(this.lowerBound + i6));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if ((this.upperSet & (1 << i7)) != 0) {
                    lVar.invoke(Integer.valueOf(i7 + 64 + this.lowerBound));
                }
            }
        }
    }

    public final boolean get(int i5) {
        int[] iArr;
        int i6 = i5 - this.lowerBound;
        boolean z4 = true;
        if (i6 >= 0 && i6 < 64) {
            if (((1 << i6) & this.lowerSet) != 0) {
                return true;
            }
            return false;
        }
        if (i6 >= 64 && i6 < 128) {
            if (((1 << (i6 - 64)) & this.upperSet) != 0) {
                return true;
            }
            return false;
        }
        if (i6 > 0 || (iArr = this.belowBound) == null) {
            return false;
        }
        if (SnapshotIdSetKt.binarySearch(iArr, i5) < 0) {
            z4 = false;
        }
        return z4;
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<Integer> iterator() {
        kotlin.sequences.m b5;
        b5 = q.b(new SnapshotIdSet$iterator$1(this, null));
        return b5.iterator();
    }

    public final int lowest(int i5) {
        int lowestBitOf;
        int lowestBitOf2;
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j5 = this.lowerSet;
        if (j5 != 0) {
            int i6 = this.lowerBound;
            lowestBitOf2 = SnapshotIdSetKt.lowestBitOf(j5);
            return i6 + lowestBitOf2;
        }
        long j6 = this.upperSet;
        if (j6 != 0) {
            int i7 = this.lowerBound + 64;
            lowestBitOf = SnapshotIdSetKt.lowestBitOf(j6);
            return i7 + lowestBitOf;
        }
        return i5;
    }

    @l
    public final SnapshotIdSet or(@l SnapshotIdSet snapshotIdSet) {
        SnapshotIdSet snapshotIdSet2 = EMPTY;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i5 = snapshotIdSet.lowerBound;
        int i6 = this.lowerBound;
        if (i5 == i6) {
            int[] iArr = snapshotIdSet.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.upperSet | snapshotIdSet.upperSet, this.lowerSet | snapshotIdSet.lowerSet, i6, iArr2);
            }
        }
        if (this.belowBound == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.set(it.next().intValue());
            }
            return snapshotIdSet;
        }
        Iterator<Integer> it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.set(it2.next().intValue());
        }
        return snapshotIdSet3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        r3 = kotlin.collections.e0.R5(r9);
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.SnapshotIdSet set(int r20) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.set(int):androidx.compose.runtime.snapshots.SnapshotIdSet");
    }

    @l
    public String toString() {
        int Y;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        Y = x.Y(this, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb.append(ListUtilsKt.fastJoinToString$default(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
