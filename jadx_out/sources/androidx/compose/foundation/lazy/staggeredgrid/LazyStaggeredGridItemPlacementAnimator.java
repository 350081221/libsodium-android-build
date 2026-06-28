package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JL\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0004R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0018\u0010/\u001a\u00020\u0012*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;", "itemInfo", "Lkotlin/r2;", "initializeAnimation", "startAnimationsIfNeeded", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "itemProvider", "", "isVertical", "laneCount", "Lkotlinx/coroutines/s0;", "coroutineScope", "onMeasured", "reset", DatabaseFileArchive.COLUMN_KEY, "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "getAnimation", "Landroidx/collection/MutableScatterMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "firstVisibleIndex", "I", "Landroidx/collection/MutableScatterSet;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "getHasAnimations", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)Z", "hasAnimations", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,329:1\n101#2,2:330\n33#2,6:332\n103#2:338\n33#2,4:364\n38#2:372\n33#2,6:375\n33#2,6:383\n33#2,6:420\n33#2,6:428\n405#3,3:339\n363#3,6:342\n373#3,3:349\n376#3,2:353\n409#3,2:355\n379#3,6:357\n411#3:363\n1810#4:348\n1672#4:352\n1810#4:400\n1672#4:404\n1#5:368\n13579#6:369\n13580#6:371\n12744#6,2:408\n13579#6:434\n13580#6:437\n13579#6:438\n13580#6:440\n86#7:370\n79#7:435\n86#7:436\n79#7:439\n1011#8,2:373\n1002#8,2:381\n1011#8,2:418\n1002#8,2:426\n267#9,4:389\n237#9,7:393\n248#9,3:401\n251#9,2:405\n272#9:407\n273#9:410\n254#9,6:411\n274#9:417\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n68#1:330,2\n68#1:332,6\n68#1:338\n91#1:364,4\n91#1:372\n138#1:375,6\n148#1:383,6\n188#1:420,6\n201#1:428,6\n89#1:339,3\n89#1:342,6\n89#1:349,3\n89#1:353,2\n89#1:355,2\n89#1:357,6\n89#1:363\n89#1:348\n89#1:352\n157#1:400\n157#1:404\n117#1:369\n117#1:371\n173#1:408,2\n243#1:434\n243#1:437\n254#1:438\n254#1:440\n121#1:370\n246#1:435\n247#1:436\n261#1:439\n137#1:373,2\n147#1:381,2\n187#1:418,2\n200#1:426,2\n157#1:389,4\n157#1:393,7\n157#1:401,3\n157#1:405,2\n157#1:407\n157#1:410\n157#1:411,6\n157#1:417\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemPlacementAnimator {
    public static final int $stable = 8;
    private int firstVisibleIndex;

    @l
    private final MutableScatterMap<Object, ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();

    @l
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;

    @l
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();

    @l
    private final List<LazyStaggeredGridMeasuredItem> movingInFromStartBound = new ArrayList();

    @l
    private final List<LazyStaggeredGridMeasuredItem> movingInFromEndBound = new ArrayList();

    @l
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToStartBound = new ArrayList();

    @l
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    private final boolean getHasAnimations(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i5 = 0; i5 < placeablesCount; i5++) {
            if (LazyStaggeredGridItemPlacementAnimatorKt.access$getSpecs(lazyStaggeredGridMeasuredItem.getParentData(i5)) != null) {
                return true;
            }
        }
        return false;
    }

    private final void initializeAnimation(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, int i5, ItemInfo itemInfo) {
        long m6168copyiSbpLlY$default;
        long mo743getOffsetnOccac = lazyStaggeredGridMeasuredItem.mo743getOffsetnOccac();
        if (lazyStaggeredGridMeasuredItem.isVertical()) {
            m6168copyiSbpLlY$default = IntOffset.m6168copyiSbpLlY$default(mo743getOffsetnOccac, 0, i5, 1, null);
        } else {
            m6168copyiSbpLlY$default = IntOffset.m6168copyiSbpLlY$default(mo743getOffsetnOccac, i5, 0, 2, null);
        }
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long mo743getOffsetnOccac2 = lazyStaggeredGridMeasuredItem.mo743getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo743getOffsetnOccac2) - IntOffset.m6172getXimpl(mo743getOffsetnOccac), IntOffset.m6173getYimpl(mo743getOffsetnOccac2) - IntOffset.m6173getYimpl(mo743getOffsetnOccac));
                lazyLayoutAnimation.m706setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6168copyiSbpLlY$default) + IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(m6168copyiSbpLlY$default) + IntOffset.m6173getYimpl(IntOffset)));
            }
        }
    }

    static /* synthetic */ void initializeAnimation$default(LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator, LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, int i5, ItemInfo itemInfo, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            ItemInfo itemInfo2 = lazyStaggeredGridItemPlacementAnimator.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem.getKey());
            l0.m(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyStaggeredGridItemPlacementAnimator.initializeAnimation(lazyStaggeredGridMeasuredItem, i5, itemInfo);
    }

    private final void startAnimationsIfNeeded(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem.getKey());
        l0.m(itemInfo);
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long mo743getOffsetnOccac = lazyStaggeredGridMeasuredItem.mo743getOffsetnOccac();
                long m704getRawOffsetnOccac = lazyLayoutAnimation.m704getRawOffsetnOccac();
                if (!IntOffset.m6171equalsimpl0(m704getRawOffsetnOccac, LazyLayoutAnimation.Companion.m707getNotInitializednOccac()) && !IntOffset.m6171equalsimpl0(m704getRawOffsetnOccac, mo743getOffsetnOccac)) {
                    lazyLayoutAnimation.m701animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo743getOffsetnOccac) - IntOffset.m6172getXimpl(m704getRawOffsetnOccac), IntOffset.m6173getYimpl(mo743getOffsetnOccac) - IntOffset.m6173getYimpl(m704getRawOffsetnOccac)));
                }
                lazyLayoutAnimation.m706setRawOffsetgyyYBs(mo743getOffsetnOccac);
            }
        }
    }

    @m
    public final LazyLayoutAnimation getAnimation(@l Object obj, int i5) {
        ItemInfo itemInfo;
        LazyLayoutAnimation[] animations;
        if (this.keyToItemInfoMap.isEmpty() || (itemInfo = this.keyToItemInfoMap.get(obj)) == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i5];
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x032c A[LOOP:10: B:123:0x0312->B:130:0x032c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasured(int r31, int r32, int r33, @p4.l java.util.List<androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasuredItem> r34, @p4.l androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider r35, boolean r36, int r37, @p4.l kotlinx.coroutines.s0 r38) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider, boolean, int, kotlinx.coroutines.s0):void");
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }
}
