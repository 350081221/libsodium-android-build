package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0003\b\t\nJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "", "calculateCrossAxisCellSizes", "", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "Adaptive", "Fixed", "FixedSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GridCells {

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Adaptive;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/unit/Dp;", "minSize", "F", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,563:1\n154#2:564\n1#3:565\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Adaptive\n*L\n304#1:564\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Adaptive implements GridCells {
        public static final int $stable = 0;
        private final float minSize;

        private Adaptive(float f5) {
            this.minSize = f5;
            if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl((float) 0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + ((Object) Dp.m6055toStringimpl(f5)) + " should be larger than zero.").toString());
        }

        public /* synthetic */ Adaptive(float f5, w wVar) {
            this(f5);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @l
        public List<Integer> calculateCrossAxisCellSizes(@l Density density, int i5, int i6) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i5, Math.max((i5 + i6) / (density.mo298roundToPx0680j_4(this.minSize) + i6), 1), i6);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(@m Object obj) {
            return (obj instanceof Adaptive) && Dp.m6049equalsimpl0(this.minSize, ((Adaptive) obj).minSize);
        }

        public int hashCode() {
            return Dp.m6050hashCodeimpl(this.minSize);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0003H\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "count", "", "(I)V", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "calculateCrossAxisCellSizes", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$Fixed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,563:1\n1#2:564\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Fixed implements GridCells {
        public static final int $stable = 0;
        private final int count;

        public Fixed(int i5) {
            boolean z4;
            this.count = i5;
            if (i5 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return;
            }
            throw new IllegalArgumentException(("Provided count " + i5 + " should be larger than zero").toString());
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @l
        public List<Integer> calculateCrossAxisCellSizes(@l Density density, int i5, int i6) {
            List<Integer> calculateCellsCrossAxisSizeImpl;
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i5, this.count, i6);
            return calculateCellsCrossAxisSizeImpl;
        }

        public boolean equals(@m Object obj) {
            return (obj instanceof Fixed) && this.count == ((Fixed) obj).count;
        }

        public int hashCode() {
            return -this.count;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$FixedSize;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/unit/Dp;", "size", "F", "<init>", "(FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,563:1\n154#2:564\n1#3:565\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/GridCells$FixedSize\n*L\n337#1:564\n*E\n"})
    /* loaded from: classes.dex */
    public static final class FixedSize implements GridCells {
        public static final int $stable = 0;
        private final float size;

        private FixedSize(float f5) {
            this.size = f5;
            if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl((float) 0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided size " + ((Object) Dp.m6055toStringimpl(f5)) + " should be larger than zero.").toString());
        }

        public /* synthetic */ FixedSize(float f5, w wVar) {
            this(f5);
        }

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        @l
        public List<Integer> calculateCrossAxisCellSizes(@l Density density, int i5, int i6) {
            int mo298roundToPx0680j_4 = density.mo298roundToPx0680j_4(this.size);
            int i7 = mo298roundToPx0680j_4 + i6;
            int i8 = i6 + i5;
            if (i7 < i8) {
                int i9 = i8 / i7;
                ArrayList arrayList = new ArrayList(i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    arrayList.add(Integer.valueOf(mo298roundToPx0680j_4));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(Integer.valueOf(i5));
            return arrayList2;
        }

        public boolean equals(@m Object obj) {
            return (obj instanceof FixedSize) && Dp.m6049equalsimpl0(this.size, ((FixedSize) obj).size);
        }

        public int hashCode() {
            return Dp.m6050hashCodeimpl(this.size);
        }
    }

    @l
    List<Integer> calculateCrossAxisCellSizes(@l Density density, int i5, int i6);
}
