package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010R\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020 \u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u00100\u001a\u00020\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010\n\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\bS\u0010TJ+\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0004J:\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u0014\u0010&\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001fR\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0019\u001a\u0004\b8\u0010\u001bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001bR\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010\u0019R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u0019R \u0010?\u001a\u00020>8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010AR*\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00028\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u00101\u001a\u0004\bD\u0010AR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\bE\u0010\u001bR$\u0010\u0011\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\bF\u0010\u001bR\"\u0010G\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010#\"\u0004\bI\u0010JR\u0018\u0010M\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0018\u00107\u001a\u00020\u0004*\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010NR\u0011\u0010P\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010\u001bR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "", "mainAxisMap", "copy-4Tuh3kE", "(JLv3/l;)J", "copy", "index", "", "getParentData", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "Lkotlin/r2;", "position", "delta", "applyScrollDelta", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "I", "getIndex", "()I", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "isVertical", "Z", "()Z", "crossAxisSize", "getCrossAxisSize", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/List;", "visualOffset", "J", "contentType", "getContentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "animator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "mainAxisLayoutSize", "minMainAxisOffset", "maxMainAxisOffset", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "()J", "<set-?>", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "getRow", "getColumn", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "(Landroidx/compose/ui/layout/Placeable;)I", "getPlaceablesCount", "placeablesCount", "getCrossAxisOffset", "mainAxisSpacing", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,187:1\n183#1:194\n183#1:195\n183#1:198\n33#2,6:188\n1#3:196\n86#4:197\n86#4:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n136#1:194\n140#1:195\n167#1:198\n72#1:188,6\n157#1:197\n171#1:199\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @l
    private final LazyGridItemPlacementAnimator animator;
    private final int beforeContentPadding;
    private int column;

    @m
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;

    @l
    private final Object key;

    @l
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @l
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i5, Object obj, boolean z4, int i6, int i7, boolean z5, LayoutDirection layoutDirection, int i8, int i9, List<? extends Placeable> list, long j5, Object obj2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator) {
        int u4;
        long IntSize;
        int width;
        this.index = i5;
        this.key = obj;
        this.isVertical = z4;
        this.crossAxisSize = i6;
        this.reverseLayout = z5;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i8;
        this.afterContentPadding = i9;
        this.placeables = list;
        this.visualOffset = j5;
        this.contentType = obj2;
        this.animator = lazyGridItemPlacementAnimator;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = (Placeable) list.get(i11);
            if (this.isVertical) {
                width = placeable.getHeight();
            } else {
                width = placeable.getWidth();
            }
            i10 = Math.max(i10, width);
        }
        this.mainAxisSize = i10;
        u4 = u.u(i7 + i10, 0);
        this.mainAxisSizeWithSpacings = u4;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i10);
        } else {
            IntSize = IntSizeKt.IntSize(i10, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m6182getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    public /* synthetic */ LazyGridMeasuredItem(int i5, Object obj, boolean z4, int i6, int i7, boolean z5, LayoutDirection layoutDirection, int i8, int i9, List list, long j5, Object obj2, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, w wVar) {
        this(i5, obj, z4, i6, i7, z5, layoutDirection, i8, i9, list, j5, obj2, lazyGridItemPlacementAnimator);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m692copy4Tuh3kE(long j5, v3.l<? super Integer, Integer> lVar) {
        int m6172getXimpl = this.isVertical ? IntOffset.m6172getXimpl(j5) : lVar.invoke(Integer.valueOf(IntOffset.m6172getXimpl(j5))).intValue();
        boolean z4 = this.isVertical;
        int m6173getYimpl = IntOffset.m6173getYimpl(j5);
        if (z4) {
            m6173getYimpl = lVar.invoke(Integer.valueOf(m6173getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m693getMainAxisgyyYBs(long j5) {
        return this.isVertical ? IntOffset.m6173getYimpl(j5) : IntOffset.m6172getXimpl(j5);
    }

    public final void applyScrollDelta(int i5) {
        int m6172getXimpl;
        int intValue;
        if (this.nonScrollableItem) {
            return;
        }
        long mo687getOffsetnOccac = mo687getOffsetnOccac();
        if (this.isVertical) {
            m6172getXimpl = IntOffset.m6172getXimpl(mo687getOffsetnOccac);
        } else {
            m6172getXimpl = IntOffset.m6172getXimpl(mo687getOffsetnOccac) + i5;
        }
        boolean z4 = this.isVertical;
        int m6173getYimpl = IntOffset.m6173getYimpl(mo687getOffsetnOccac);
        if (z4) {
            m6173getYimpl += i5;
        }
        this.offset = IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
        int placeablesCount = getPlaceablesCount();
        for (int i6 = 0; i6 < placeablesCount; i6++) {
            LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i6);
            if (animation != null) {
                long m704getRawOffsetnOccac = animation.m704getRawOffsetnOccac();
                if (this.isVertical) {
                    intValue = IntOffset.m6172getXimpl(m704getRawOffsetnOccac);
                } else {
                    intValue = Integer.valueOf(IntOffset.m6172getXimpl(m704getRawOffsetnOccac) + i5).intValue();
                }
                boolean z5 = this.isVertical;
                int m6173getYimpl2 = IntOffset.m6173getYimpl(m704getRawOffsetnOccac);
                if (z5) {
                    m6173getYimpl2 += i5;
                }
                animation.m706setRawOffsetgyyYBs(IntOffsetKt.IntOffset(intValue, m6173getYimpl2));
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @m
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m6172getXimpl(mo687getOffsetnOccac()) : IntOffset.m6173getYimpl(mo687getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @l
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo687getOffsetnOccac() {
        return this.offset;
    }

    @m
    public final Object getParentData(int i5) {
        return this.placeables.get(i5).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo688getSizeYbymL2g() {
        return this.size;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void place(@l Placeable.PlacementScope placementScope) {
        boolean z4;
        int m6172getXimpl;
        int m6173getYimpl;
        if (this.mainAxisLayoutSize != Integer.MIN_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int placeablesCount = getPlaceablesCount();
            for (int i5 = 0; i5 < placeablesCount; i5++) {
                Placeable placeable = this.placeables.get(i5);
                int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
                int i6 = this.maxMainAxisOffset;
                long mo687getOffsetnOccac = mo687getOffsetnOccac();
                LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i5);
                if (animation != null) {
                    long m703getPlacementDeltanOccac = animation.m703getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo687getOffsetnOccac) + IntOffset.m6172getXimpl(m703getPlacementDeltanOccac), IntOffset.m6173getYimpl(mo687getOffsetnOccac) + IntOffset.m6173getYimpl(m703getPlacementDeltanOccac));
                    if ((m693getMainAxisgyyYBs(mo687getOffsetnOccac) <= mainAxisSize && m693getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m693getMainAxisgyyYBs(mo687getOffsetnOccac) >= i6 && m693getMainAxisgyyYBs(IntOffset) >= i6)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo687getOffsetnOccac = IntOffset;
                }
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m6172getXimpl = IntOffset.m6172getXimpl(mo687getOffsetnOccac);
                    } else {
                        m6172getXimpl = (this.mainAxisLayoutSize - IntOffset.m6172getXimpl(mo687getOffsetnOccac)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m6173getYimpl = (this.mainAxisLayoutSize - IntOffset.m6173getYimpl(mo687getOffsetnOccac)) - getMainAxisSize(placeable);
                    } else {
                        m6173getYimpl = IntOffset.m6173getYimpl(mo687getOffsetnOccac);
                    }
                    mo687getOffsetnOccac = IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
                }
                long j5 = this.visualOffset;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo687getOffsetnOccac) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(mo687getOffsetnOccac) + IntOffset.m6173getYimpl(j5));
                if (this.isVertical) {
                    Placeable.PlacementScope.m5052placeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m5051placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        long IntOffset;
        boolean z4 = this.isVertical;
        if (z4) {
            i11 = i8;
        } else {
            i11 = i7;
        }
        this.mainAxisLayoutSize = i11;
        if (!z4) {
            i7 = i8;
        }
        if (z4 && this.layoutDirection == LayoutDirection.Rtl) {
            i6 = (i7 - i6) - this.crossAxisSize;
        }
        if (z4) {
            IntOffset = IntOffsetKt.IntOffset(i6, i5);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i5, i6);
        }
        this.offset = IntOffset;
        this.row = i9;
        this.column = i10;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void setNonScrollableItem(boolean z4) {
        this.nonScrollableItem = z4;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
