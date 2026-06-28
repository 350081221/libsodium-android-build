package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0015\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010#\u001a\u00020\u0015\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020\u0015\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u0004\u0012\u0006\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\n\u0012\b\u00109\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bW\u0010XJ+\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u001b\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010$R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001cR\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u001cR\u0014\u00102\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001cR\u001a\u00103\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00105\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010\f\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00048\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0013\u0010\u001eR\u001a\u0010?\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010\u001eR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001eR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u001c\u001a\u0004\bD\u0010\u001eR\"\u0010E\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010$\u001a\u0004\bF\u0010%\"\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u001cR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010\u001cR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\u001cR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u0010T\u001a\u00020\u0004*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010V\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bU\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "", "mainAxisMap", "copy-4Tuh3kE", "(JLv3/l;)J", "copy", "index", "", "getParentData", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "Lkotlin/r2;", "position", "getOffset-Bjo55l4", "(I)J", "getOffset", "delta", "", "updateAnimations", "applyScrollDelta", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "isLookingAhead", "place", "I", "getIndex", "()I", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/List;", "isVertical", "Z", "()Z", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "beforeContentPadding", "afterContentPadding", "spacing", "visualOffset", "J", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "contentType", "getContentType", "Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "animator", "Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "<set-?>", "size", "getSize", "sizeWithSpacings", "getSizeWithSpacings", "crossAxisSize", "getCrossAxisSize", "nonScrollableItem", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "mainAxisLayoutSize", "minMainAxisOffset", "maxMainAxisOffset", "", "placeableOffsets", "[I", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "getPlaceablesCount", "placeablesCount", "<init>", "(ILjava/util/List;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZIIIJLjava/lang/Object;Ljava/lang/Object;Landroidx/compose/foundation/lazy/LazyListItemAnimator;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,224:1\n220#1:237\n220#1:240\n33#2,6:225\n69#2,6:231\n1#3:238\n86#4:239\n86#4:241\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n160#1:237\n204#1:240\n93#1:225,6\n119#1:231,6\n188#1:239\n208#1:241\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo {
    public static final int $stable = 8;
    private final int afterContentPadding;

    @l
    private final LazyListItemAnimator animator;
    private final int beforeContentPadding;

    @m
    private final Object contentType;
    private final int crossAxisSize;

    @m
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;

    @l
    private final Object key;

    @l
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;

    @l
    private final int[] placeableOffsets;

    @l
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;

    @m
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i5, List<? extends Placeable> list, boolean z4, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z5, int i6, int i7, int i8, long j5, Object obj, Object obj2, LazyListItemAnimator lazyListItemAnimator) {
        int u4;
        int width;
        int width2;
        this.index = i5;
        this.placeables = list;
        this.isVertical = z4;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z5;
        this.beforeContentPadding = i6;
        this.afterContentPadding = i7;
        this.spacing = i8;
        this.visualOffset = j5;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyListItemAnimator;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = (Placeable) list.get(i11);
            if (this.isVertical) {
                width = placeable.getHeight();
            } else {
                width = placeable.getWidth();
            }
            i9 += width;
            if (!this.isVertical) {
                width2 = placeable.getHeight();
            } else {
                width2 = placeable.getWidth();
            }
            i10 = Math.max(i10, width2);
        }
        this.size = i9;
        u4 = u.u(getSize() + this.spacing, 0);
        this.sizeWithSpacings = u4;
        this.crossAxisSize = i10;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @ExperimentalFoundationApi
    public /* synthetic */ LazyListMeasuredItem(int i5, List list, boolean z4, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z5, int i6, int i7, int i8, long j5, Object obj, Object obj2, LazyListItemAnimator lazyListItemAnimator, w wVar) {
        this(i5, list, z4, horizontal, vertical, layoutDirection, z5, i6, i7, i8, j5, obj, obj2, lazyListItemAnimator);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m663copy4Tuh3kE(long j5, v3.l<? super Integer, Integer> lVar) {
        int m6172getXimpl = this.isVertical ? IntOffset.m6172getXimpl(j5) : lVar.invoke(Integer.valueOf(IntOffset.m6172getXimpl(j5))).intValue();
        boolean z4 = this.isVertical;
        int m6173getYimpl = IntOffset.m6173getYimpl(j5);
        if (z4) {
            m6173getYimpl = lVar.invoke(Integer.valueOf(m6173getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m664getMainAxisgyyYBs(long j5) {
        return this.isVertical ? IntOffset.m6173getYimpl(j5) : IntOffset.m6172getXimpl(j5);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    public final void applyScrollDelta(int i5, boolean z4) {
        int intValue;
        if (this.nonScrollableItem) {
            return;
        }
        this.offset = getOffset() + i5;
        int length = this.placeableOffsets.length;
        for (int i6 = 0; i6 < length; i6++) {
            boolean z5 = this.isVertical;
            if ((z5 && i6 % 2 == 1) || (!z5 && i6 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i6] = iArr[i6] + i5;
            }
        }
        if (z4) {
            int placeablesCount = getPlaceablesCount();
            for (int i7 = 0; i7 < placeablesCount; i7++) {
                LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i7);
                if (animation != null) {
                    long m704getRawOffsetnOccac = animation.m704getRawOffsetnOccac();
                    if (this.isVertical) {
                        intValue = IntOffset.m6172getXimpl(m704getRawOffsetnOccac);
                    } else {
                        intValue = Integer.valueOf(IntOffset.m6172getXimpl(m704getRawOffsetnOccac) + i5).intValue();
                    }
                    boolean z6 = this.isVertical;
                    int m6173getYimpl = IntOffset.m6173getYimpl(m704getRawOffsetnOccac);
                    if (z6) {
                        m6173getYimpl += i5;
                    }
                    animation.m706setRawOffsetgyyYBs(IntOffsetKt.IntOffset(intValue, m6173getYimpl));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @m
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    @l
    public Object getKey() {
        return this.key;
    }

    public final boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m665getOffsetBjo55l4(int i5) {
        int[] iArr = this.placeableOffsets;
        int i6 = i5 * 2;
        return IntOffsetKt.IntOffset(iArr[i6], iArr[i6 + 1]);
    }

    @m
    public final Object getParentData(int i5) {
        return this.placeables.get(i5).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void place(@l Placeable.PlacementScope placementScope, boolean z4) {
        boolean z5;
        v3.l<GraphicsLayerScope, r2> defaultLayerBlock;
        int m6172getXimpl;
        int m6173getYimpl;
        if (this.mainAxisLayoutSize != Integer.MIN_VALUE) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            int placeablesCount = getPlaceablesCount();
            for (int i5 = 0; i5 < placeablesCount; i5++) {
                Placeable placeable = this.placeables.get(i5);
                int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
                int i6 = this.maxMainAxisOffset;
                long m665getOffsetBjo55l4 = m665getOffsetBjo55l4(i5);
                LazyLayoutAnimation animation = this.animator.getAnimation(getKey(), i5);
                if (animation != null) {
                    if (z4) {
                        animation.m705setLookaheadOffsetgyyYBs(m665getOffsetBjo55l4);
                    } else {
                        if (!IntOffset.m6171equalsimpl0(animation.m702getLookaheadOffsetnOccac(), LazyLayoutAnimation.Companion.m707getNotInitializednOccac())) {
                            m665getOffsetBjo55l4 = animation.m702getLookaheadOffsetnOccac();
                        }
                        long m703getPlacementDeltanOccac = animation.m703getPlacementDeltanOccac();
                        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m665getOffsetBjo55l4) + IntOffset.m6172getXimpl(m703getPlacementDeltanOccac), IntOffset.m6173getYimpl(m665getOffsetBjo55l4) + IntOffset.m6173getYimpl(m703getPlacementDeltanOccac));
                        if ((m664getMainAxisgyyYBs(m665getOffsetBjo55l4) <= mainAxisSize && m664getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m664getMainAxisgyyYBs(m665getOffsetBjo55l4) >= i6 && m664getMainAxisgyyYBs(IntOffset) >= i6)) {
                            animation.cancelPlacementAnimation();
                        }
                        m665getOffsetBjo55l4 = IntOffset;
                    }
                    defaultLayerBlock = animation.getLayerBlock();
                } else {
                    defaultLayerBlock = LazyLayoutAnimationKt.getDefaultLayerBlock();
                }
                v3.l<GraphicsLayerScope, r2> lVar = defaultLayerBlock;
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m6172getXimpl = IntOffset.m6172getXimpl(m665getOffsetBjo55l4);
                    } else {
                        m6172getXimpl = (this.mainAxisLayoutSize - IntOffset.m6172getXimpl(m665getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m6173getYimpl = (this.mainAxisLayoutSize - IntOffset.m6173getYimpl(m665getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    } else {
                        m6173getYimpl = IntOffset.m6173getYimpl(m665getOffsetBjo55l4);
                    }
                    m665getOffsetBjo55l4 = IntOffsetKt.IntOffset(m6172getXimpl, m6173getYimpl);
                }
                long j5 = this.visualOffset;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m665getOffsetBjo55l4) + IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(m665getOffsetBjo55l4) + IntOffset.m6173getYimpl(j5));
                if (this.isVertical) {
                    Placeable.PlacementScope.m5052placeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, lVar, 2, null);
                } else {
                    Placeable.PlacementScope.m5051placeRelativeWithLayeraW9wM$default(placementScope, placeable, IntOffset2, 0.0f, lVar, 2, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i5, int i6, int i7) {
        int i8;
        int width;
        this.offset = i5;
        if (this.isVertical) {
            i8 = i7;
        } else {
            i8 = i6;
        }
        this.mainAxisLayoutSize = i8;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Placeable placeable = list.get(i9);
            int i10 = i9 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal != null) {
                    iArr[i10] = horizontal.align(placeable.getWidth(), i6, this.layoutDirection);
                    this.placeableOffsets[i10 + 1] = i5;
                    width = placeable.getHeight();
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i10] = i5;
                int i11 = i10 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical != null) {
                    iArr2[i11] = vertical.align(placeable.getHeight(), i7);
                    width = placeable.getWidth();
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
            }
            i5 += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void setNonScrollableItem(boolean z4) {
        this.nonScrollableItem = z4;
    }
}
