package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010S\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\n\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\bT\u0010UJ+\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001a\u0010)\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001aR\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001aR\u001c\u0010/\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00104\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010'\u001a\u0004\b4\u0010(\"\u0004\b5\u00106R\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010\u001cR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u0010\u001cR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u001a\u001a\u0004\b<\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u001aR\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u001aR\"\u0010?\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b@\u0010(\"\u0004\bA\u00106R \u0010C\u001a\u00020B8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR*\u0010H\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u00028\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u0018\u0010\f\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0019\u00107\u001a\u00020\u0004*\u00020\"8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010LR\u0011\u0010N\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bM\u0010\u001cR\u0011\u0010P\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bO\u0010\u001cR\u0011\u0010R\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "", "mainAxisMap", "copy-4Tuh3kE", "(JLv3/l;)J", "copy", "index", "", "getParentData", "mainAxis", "crossAxis", "mainAxisLayoutSize", "Lkotlin/r2;", "position", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", d.X, "place", "delta", "applyScrollDelta", "", "toString", "I", "getIndex", "()I", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/List;", "", "isVertical", "Z", "()Z", "lane", "getLane", "span", "getSpan", "beforeContentPadding", "afterContentPadding", "contentType", "getContentType", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "animator", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "isVisible", "setVisible", "(Z)V", "mainAxisSize", "getMainAxisSize", "sizeWithSpacings", "getSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "minMainAxisOffset", "maxMainAxisOffset", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "Landroidx/compose/ui/unit/IntSize;", "size", "J", "getSize-YbymL2g", "()J", "<set-?>", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset-nOcc-ac", "getMainAxis--gyyYBs", "(J)I", "(Landroidx/compose/ui/layout/Placeable;)I", "getPlaceablesCount", "placeablesCount", "getMainAxisOffset", "mainAxisOffset", "getCrossAxisOffset", "crossAxisOffset", "spacing", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1225:1\n1212#1:1247\n1214#1:1249\n1212#1:1250\n1214#1:1253\n1214#1:1254\n317#2,8:1226\n317#2,8:1234\n69#2,4:1243\n74#2:1252\n1#3:1242\n86#4:1248\n86#4:1251\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1172#1:1247\n1188#1:1249\n1189#1:1250\n1202#1:1253\n1206#1:1254\n1119#1:1226,8\n1125#1:1234,8\n1171#1:1243,4\n1171#1:1252\n1178#1:1248\n1192#1:1251\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @l
    private final LazyStaggeredGridItemPlacementAnimator animator;
    private final int beforeContentPadding;

    @m
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private boolean isVisible = true;

    @l
    private final Object key;
    private final int lane;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private long offset;

    @l
    private final List<Placeable> placeables;
    private final long size;
    private final int sizeWithSpacings;
    private final int span;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i5, @l Object obj, @l List<? extends Placeable> list, boolean z4, int i6, int i7, int i8, int i9, int i10, @m Object obj2, @l LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator) {
        int width;
        Integer valueOf;
        int G;
        int width2;
        int i11;
        int u4;
        long IntSize;
        int height;
        int G2;
        int height2;
        this.index = i5;
        this.key = obj;
        this.placeables = list;
        this.isVertical = z4;
        this.lane = i7;
        this.span = i8;
        this.beforeContentPadding = i9;
        this.afterContentPadding = i10;
        this.contentType = obj2;
        this.animator = lazyStaggeredGridItemPlacementAnimator;
        int i12 = 1;
        Integer num = null;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            if (z4) {
                width = placeable.getHeight();
            } else {
                width = placeable.getWidth();
            }
            valueOf = Integer.valueOf(width);
            G = w.G(list);
            if (1 <= G) {
                int i13 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i13);
                    if (this.isVertical) {
                        width2 = placeable2.getHeight();
                    } else {
                        width2 = placeable2.getWidth();
                    }
                    Integer valueOf2 = Integer.valueOf(width2);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i13 == G) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        Integer num2 = valueOf;
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = 0;
        }
        this.mainAxisSize = i11;
        u4 = u.u(i11 + i6, 0);
        this.sizeWithSpacings = u4;
        List<Placeable> list2 = this.placeables;
        if (!list2.isEmpty()) {
            Placeable placeable3 = list2.get(0);
            if (this.isVertical) {
                height = placeable3.getWidth();
            } else {
                height = placeable3.getHeight();
            }
            Integer valueOf3 = Integer.valueOf(height);
            G2 = w.G(list2);
            if (1 <= G2) {
                while (true) {
                    Placeable placeable4 = list2.get(i12);
                    if (this.isVertical) {
                        height2 = placeable4.getWidth();
                    } else {
                        height2 = placeable4.getHeight();
                    }
                    Integer valueOf4 = Integer.valueOf(height2);
                    valueOf3 = valueOf4.compareTo(valueOf3) > 0 ? valueOf4 : valueOf3;
                    if (i12 == G2) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            num = valueOf3;
        }
        Integer num3 = num;
        int intValue = num3 != null ? num3.intValue() : 0;
        this.crossAxisSize = intValue;
        this.mainAxisLayoutSize = -1;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(intValue, this.mainAxisSize);
        } else {
            IntSize = IntSizeKt.IntSize(this.mainAxisSize, intValue);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m6182getZeronOccac();
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m759copy4Tuh3kE(long j5, v3.l<? super Integer, Integer> lVar) {
        int m6172getXimpl = this.isVertical ? IntOffset.m6172getXimpl(j5) : lVar.invoke(Integer.valueOf(IntOffset.m6172getXimpl(j5))).intValue();
        boolean z4 = this.isVertical;
        int m6173getYimpl = IntOffset.m6173getYimpl(j5);
        if (z4) {
            m6173getYimpl = lVar.invoke(Integer.valueOf(m6173getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m760getMainAxisgyyYBs(long j5) {
        return this.isVertical ? IntOffset.m6173getYimpl(j5) : IntOffset.m6172getXimpl(j5);
    }

    public final void applyScrollDelta(int i5) {
        int m6172getXimpl;
        int intValue;
        if (this.nonScrollableItem) {
            return;
        }
        long mo743getOffsetnOccac = mo743getOffsetnOccac();
        if (this.isVertical) {
            m6172getXimpl = IntOffset.m6172getXimpl(mo743getOffsetnOccac);
        } else {
            m6172getXimpl = IntOffset.m6172getXimpl(mo743getOffsetnOccac) + i5;
        }
        boolean z4 = this.isVertical;
        int m6173getYimpl = IntOffset.m6173getYimpl(mo743getOffsetnOccac);
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

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @m
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m6172getXimpl(mo743getOffsetnOccac()) : IntOffset.m6173getYimpl(mo743getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @l
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisOffset() {
        return !this.isVertical ? IntOffset.m6172getXimpl(mo743getOffsetnOccac()) : IntOffset.m6173getYimpl(mo743getOffsetnOccac());
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo743getOffsetnOccac() {
        return this.offset;
    }

    @m
    public final Object getParentData(int i5) {
        return this.placeables.get(i5).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo744getSizeYbymL2g() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpan() {
        return this.span;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void place(@l Placeable.PlacementScope placementScope, @l LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        boolean z4;
        int width;
        int width2;
        int i5;
        int m6173getYimpl;
        int width3;
        if (this.mainAxisLayoutSize != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            List<Placeable> list = this.placeables;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Placeable placeable = list.get(i6);
                int i7 = this.minMainAxisOffset;
                if (this.isVertical) {
                    width = placeable.getHeight();
                } else {
                    width = placeable.getWidth();
                }
                int i8 = i7 - width;
                int i9 = this.maxMainAxisOffset;
                long mo743getOffsetnOccac = mo743getOffsetnOccac();
                LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i6);
                if (animation != null) {
                    long m703getPlacementDeltanOccac = animation.m703getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo743getOffsetnOccac) + IntOffset.m6172getXimpl(m703getPlacementDeltanOccac), IntOffset.m6173getYimpl(mo743getOffsetnOccac) + IntOffset.m6173getYimpl(m703getPlacementDeltanOccac));
                    if ((m760getMainAxisgyyYBs(mo743getOffsetnOccac) <= i8 && m760getMainAxisgyyYBs(IntOffset) <= i8) || (m760getMainAxisgyyYBs(mo743getOffsetnOccac) >= i9 && m760getMainAxisgyyYBs(IntOffset) >= i9)) {
                        animation.cancelPlacementAnimation();
                    }
                    mo743getOffsetnOccac = IntOffset;
                }
                if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                    if (this.isVertical) {
                        i5 = IntOffset.m6172getXimpl(mo743getOffsetnOccac);
                    } else {
                        int m6172getXimpl = this.mainAxisLayoutSize - IntOffset.m6172getXimpl(mo743getOffsetnOccac);
                        if (this.isVertical) {
                            width2 = placeable.getHeight();
                        } else {
                            width2 = placeable.getWidth();
                        }
                        i5 = m6172getXimpl - width2;
                    }
                    if (this.isVertical) {
                        int m6173getYimpl2 = this.mainAxisLayoutSize - IntOffset.m6173getYimpl(mo743getOffsetnOccac);
                        if (this.isVertical) {
                            width3 = placeable.getHeight();
                        } else {
                            width3 = placeable.getWidth();
                        }
                        m6173getYimpl = m6173getYimpl2 - width3;
                    } else {
                        m6173getYimpl = IntOffset.m6173getYimpl(mo743getOffsetnOccac);
                    }
                    mo743getOffsetnOccac = IntOffsetKt.IntOffset(i5, m6173getYimpl);
                }
                long m748getContentOffsetnOccac = lazyStaggeredGridMeasureContext.m748getContentOffsetnOccac();
                Placeable.PlacementScope.m5051placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo743getOffsetnOccac) + IntOffset.m6172getXimpl(m748getContentOffsetnOccac), IntOffset.m6173getYimpl(mo743getOffsetnOccac) + IntOffset.m6173getYimpl(m748getContentOffsetnOccac)), 0.0f, null, 6, null);
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i5, int i6, int i7) {
        long IntOffset;
        this.mainAxisLayoutSize = i7;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = i7 + this.afterContentPadding;
        if (this.isVertical) {
            IntOffset = IntOffsetKt.IntOffset(i6, i5);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i5, i6);
        }
        this.offset = IntOffset;
    }

    public final void setNonScrollableItem(boolean z4) {
        this.nonScrollableItem = z4;
    }

    public final void setVisible(boolean z4) {
        this.isVisible = z4;
    }

    @l
    public String toString() {
        return super.toString();
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
