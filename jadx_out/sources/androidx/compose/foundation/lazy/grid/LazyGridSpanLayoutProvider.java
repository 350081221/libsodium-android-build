package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\u0003-./B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR*\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010$¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "", "currentSlotsPerLine", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "getDefaultSpans", "Lkotlin/r2;", "invalidateCache", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "getLineConfiguration", "itemIndex", "getLineIndexOfItem", "maxSpan", "spanOf", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "gridContent", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Ljava/util/ArrayList;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "Lkotlin/collections/ArrayList;", "buckets", "Ljava/util/ArrayList;", "lastLineIndex", "I", "lastLineStartItemIndex", "lastLineStartKnownSpan", "cachedBucketIndex", "", "cachedBucket", "Ljava/util/List;", "previousDefaultSpans", b.f22420d, "slotsPerLine", "getSlotsPerLine", "()I", "setSlotsPerLine", "(I)V", "getBucketSize", "bucketSize", "getTotalSize", "totalSize", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;)V", "Bucket", "LazyGridItemSpanScopeImpl", "LineConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    public static final int $stable = 8;

    @l
    private final ArrayList<Bucket> buckets;

    @l
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;

    @l
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;

    @l
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "()V", "maxCurrentLineSpan", "", "getMaxCurrentLineSpan", "()I", "setMaxCurrentLineSpan", "(I)V", "maxLineSpan", "getMaxLineSpan", "setMaxLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {

        @l
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i5) {
            maxCurrentLineSpan = i5;
        }

        public void setMaxLineSpan(int i5) {
            maxLineSpan = i5;
        }
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$LineConfiguration;", "", "firstItemIndex", "", "spans", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "(ILjava/util/List;)V", "getFirstItemIndex", "()I", "getSpans", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;

        @l
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i5, @l List<GridItemSpan> list) {
            this.firstItemIndex = i5;
            this.spans = list;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        @l
        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(@l LazyGridIntervalContent lazyGridIntervalContent) {
        List<GridItemSpan> E;
        this.gridContent = lazyGridIntervalContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i5 = 0;
        arrayList.add(new Bucket(i5, i5, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        E = w.E();
        this.previousDefaultSpans = E;
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i5) {
        if (i5 == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(GridItemSpan.m670boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i5 = 0;
        this.buckets.add(new Bucket(i5, i5, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac A[ADDED_TO_REGION, LOOP:0: B:25:0x00ac->B:53:0x00ac, LOOP_START, PHI: r2 r4 r5
      0x00ac: PHI (r2v10 int) = (r2v9 int), (r2v14 int) binds: [B:24:0x00aa, B:53:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r4v6 int) = (r4v5 int), (r4v7 int) binds: [B:24:0x00aa, B:53:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r5v6 int) = (r5v5 int), (r5v14 int) binds: [B:24:0x00aa, B:53:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a9  */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r11) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(int i5) {
        boolean z4;
        int w4;
        boolean z5;
        int i6;
        int i7 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i5 < getTotalSize()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (!this.gridContent.getHasCustomSpans$foundation_release()) {
                return i5 / this.slotsPerLine;
            }
            w4 = w.w(this.buckets, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i5), 3, null);
            int i8 = 2;
            if (w4 < 0) {
                w4 = (-w4) - 2;
            }
            int bucketSize = getBucketSize() * w4;
            int firstItemIndex = this.buckets.get(w4).getFirstItemIndex();
            if (firstItemIndex <= i5) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i9 = 0;
                while (firstItemIndex < i5) {
                    int i10 = firstItemIndex + 1;
                    int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i9);
                    i9 += spanOf;
                    int i11 = this.slotsPerLine;
                    if (i9 >= i11) {
                        if (i9 == i11) {
                            bucketSize++;
                            i9 = 0;
                        } else {
                            bucketSize++;
                            i9 = spanOf;
                        }
                    }
                    if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                        ArrayList<Bucket> arrayList = this.buckets;
                        if (i9 > 0) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        arrayList.add(new Bucket(i10 - i6, i7, i8, null));
                    }
                    firstItemIndex = i10;
                }
                if (i9 + spanOf(i5, this.slotsPerLine - i9) > this.slotsPerLine) {
                    return bucketSize + 1;
                }
                return bucketSize;
            }
            throw new IllegalArgumentException("currentItemIndex > itemIndex".toString());
        }
        throw new IllegalArgumentException("ItemIndex > total count".toString());
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i5) {
        if (i5 != this.slotsPerLine) {
            this.slotsPerLine = i5;
            invalidateCache();
        }
    }

    public final int spanOf(int i5, int i6) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i6);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i5);
        return GridItemSpan.m674getCurrentLineSpanimpl(interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i5 - interval.getStartIndex())).m677unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider$Bucket;", "", "firstItemIndex", "", "firstItemKnownSpan", "(II)V", "getFirstItemIndex", "()I", "getFirstItemKnownSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i5, int i6) {
            this.firstItemIndex = i5;
            this.firstItemKnownSpan = i6;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
            this(i5, (i7 & 2) != 0 ? 0 : i6);
        }
    }
}
