package androidx.compose.foundation.lazy.grid;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
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
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JL\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\bJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0004R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0018\u00100\u001a\u00020\u0014*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/grid/ItemInfo;", "itemInfo", "Lkotlin/r2;", "initializeAnimation", "startAnimationsIfNeeded", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "", "isVertical", "Lkotlinx/coroutines/s0;", "coroutineScope", "onMeasured", "reset", DatabaseFileArchive.COLUMN_KEY, "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "getAnimation", "Landroidx/collection/MutableScatterMap;", "keyToItemInfoMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "firstVisibleIndex", "I", "Landroidx/collection/MutableScatterSet;", "movingAwayKeys", "Landroidx/collection/MutableScatterSet;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "getHasAnimations", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;)Z", "hasAnimations", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,368:1\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,4:403\n38#2:411\n33#2,6:414\n33#2,6:422\n33#2,6:459\n33#2,6:467\n405#3,3:378\n363#3,6:381\n373#3,3:388\n376#3,2:392\n409#3,2:394\n379#3,6:396\n411#3:402\n1810#4:387\n1672#4:391\n1810#4:439\n1672#4:443\n1#5:407\n13579#6:408\n13580#6:410\n12744#6,2:447\n13579#6:473\n13580#6:476\n13579#6:477\n13580#6:479\n86#7:409\n79#7:474\n86#7:475\n79#7:478\n1011#8,2:412\n1002#8,2:420\n1011#8,2:457\n1002#8,2:465\n267#9,4:428\n237#9,7:432\n248#9,3:440\n251#9,2:444\n272#9:446\n273#9:449\n254#9,6:450\n274#9:456\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n68#1:369,2\n68#1:371,6\n68#1:377\n91#1:403,4\n91#1:411\n138#1:414,6\n155#1:422,6\n206#1:459,6\n232#1:467,6\n89#1:378,3\n89#1:381,6\n89#1:388,3\n89#1:392,2\n89#1:394,2\n89#1:396,6\n89#1:402\n89#1:387\n89#1:391\n169#1:439\n169#1:443\n117#1:408\n117#1:410\n189#1:447,2\n286#1:473\n286#1:476\n297#1:477\n297#1:479\n121#1:409\n289#1:474\n290#1:475\n304#1:478\n137#1:412,2\n154#1:420,2\n205#1:457,2\n231#1:465,2\n169#1:428,4\n169#1:432,7\n169#1:440,3\n169#1:444,2\n169#1:446\n169#1:449\n169#1:450,6\n169#1:456\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {
    public static final int $stable = 8;
    private int firstVisibleIndex;

    @l
    private final MutableScatterMap<Object, ItemInfo> keyToItemInfoMap = ScatterMapKt.mutableScatterMapOf();

    @l
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;

    @l
    private final MutableScatterSet<Object> movingAwayKeys = ScatterSetKt.mutableScatterSetOf();

    @l
    private final List<LazyGridMeasuredItem> movingInFromStartBound = new ArrayList();

    @l
    private final List<LazyGridMeasuredItem> movingInFromEndBound = new ArrayList();

    @l
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();

    @l
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    private final boolean getHasAnimations(LazyGridMeasuredItem lazyGridMeasuredItem) {
        LazyLayoutAnimationSpecsNode specs;
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i5 = 0; i5 < placeablesCount; i5++) {
            specs = LazyGridItemPlacementAnimatorKt.getSpecs(lazyGridMeasuredItem.getParentData(i5));
            if (specs != null) {
                return true;
            }
        }
        return false;
    }

    private final void initializeAnimation(LazyGridMeasuredItem lazyGridMeasuredItem, int i5, ItemInfo itemInfo) {
        long m6168copyiSbpLlY$default;
        long mo687getOffsetnOccac = lazyGridMeasuredItem.mo687getOffsetnOccac();
        if (lazyGridMeasuredItem.isVertical()) {
            m6168copyiSbpLlY$default = IntOffset.m6168copyiSbpLlY$default(mo687getOffsetnOccac, 0, i5, 1, null);
        } else {
            m6168copyiSbpLlY$default = IntOffset.m6168copyiSbpLlY$default(mo687getOffsetnOccac, i5, 0, 2, null);
        }
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long mo687getOffsetnOccac2 = lazyGridMeasuredItem.mo687getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo687getOffsetnOccac2) - IntOffset.m6172getXimpl(mo687getOffsetnOccac), IntOffset.m6173getYimpl(mo687getOffsetnOccac2) - IntOffset.m6173getYimpl(mo687getOffsetnOccac));
                lazyLayoutAnimation.m706setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6168copyiSbpLlY$default) + IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(m6168copyiSbpLlY$default) + IntOffset.m6173getYimpl(IntOffset)));
            }
        }
    }

    static /* synthetic */ void initializeAnimation$default(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, LazyGridMeasuredItem lazyGridMeasuredItem, int i5, ItemInfo itemInfo, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            ItemInfo itemInfo2 = lazyGridItemPlacementAnimator.keyToItemInfoMap.get(lazyGridMeasuredItem.getKey());
            l0.m(itemInfo2);
            itemInfo = itemInfo2;
        }
        lazyGridItemPlacementAnimator.initializeAnimation(lazyGridMeasuredItem, i5, itemInfo);
    }

    private final void startAnimationsIfNeeded(LazyGridMeasuredItem lazyGridMeasuredItem) {
        ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyGridMeasuredItem.getKey());
        l0.m(itemInfo);
        for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo.getAnimations()) {
            if (lazyLayoutAnimation != null) {
                long mo687getOffsetnOccac = lazyGridMeasuredItem.mo687getOffsetnOccac();
                long m704getRawOffsetnOccac = lazyLayoutAnimation.m704getRawOffsetnOccac();
                if (!IntOffset.m6171equalsimpl0(m704getRawOffsetnOccac, LazyLayoutAnimation.Companion.m707getNotInitializednOccac()) && !IntOffset.m6171equalsimpl0(m704getRawOffsetnOccac, mo687getOffsetnOccac)) {
                    lazyLayoutAnimation.m701animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo687getOffsetnOccac) - IntOffset.m6172getXimpl(m704getRawOffsetnOccac), IntOffset.m6173getYimpl(mo687getOffsetnOccac) - IntOffset.m6173getYimpl(m704getRawOffsetnOccac)));
                }
                lazyLayoutAnimation.m706setRawOffsetgyyYBs(mo687getOffsetnOccac);
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

    /* JADX WARN: Removed duplicated region for block: B:146:0x031b A[LOOP:9: B:139:0x0301->B:146:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0319 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasured(int r36, int r37, int r38, @p4.l java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r39, @p4.l androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r40, @p4.l androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r41, boolean r42, @p4.l kotlinx.coroutines.s0 r43) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, boolean, kotlinx.coroutines.s0):void");
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }
}
