package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.a0;
import kotlin.collections.a1;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.comparisons.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b2\u00103J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JT\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\bJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0004R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00010&j\b\u0012\u0004\u0012\u00020\u0001`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0018\u00101\u001a\u00020\u0012*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/LazyListItemAnimator$ItemInfo;", "itemInfo", "Lkotlin/r2;", "initializeAnimation", "startPlacementAnimationsIfNeeded", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemProvider", "", "isVertical", "isLookingAhead", "hasLookaheadOccurred", "Lkotlinx/coroutines/s0;", "coroutineScope", "onMeasured", "reset", DatabaseFileArchive.COLUMN_KEY, "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "getAnimation", "", "keyToItemInfoMap", "Ljava/util/Map;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "firstVisibleIndex", "I", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "getHasAnimations", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;)Z", "hasAnimations", "<init>", "()V", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyListItemAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,331:1\n101#2,2:332\n33#2,6:334\n103#2:340\n33#2,4:341\n38#2:351\n33#2,6:354\n33#2,6:362\n33#2,6:374\n33#2,6:382\n1#3:345\n13579#4,2:346\n13579#4:348\n13580#4:350\n12744#4,2:369\n13644#4,2:388\n13646#4:392\n13644#4,2:393\n13646#4:396\n86#5:349\n79#5:390\n86#5:391\n79#5:395\n1011#6,2:352\n1002#6,2:360\n1855#6:368\n1856#6:371\n1011#6,2:372\n1002#6,2:380\n*S KotlinDebug\n*F\n+ 1 LazyListItemAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemAnimator\n*L\n72#1:332,2\n72#1:334,6\n72#1:340\n97#1:341,4\n97#1:351\n149#1:354,6\n157#1:362,6\n193#1:374,6\n208#1:382,6\n122#1:346,2\n130#1:348\n130#1:350\n178#1:369,2\n257#1:388,2\n257#1:392\n268#1:393,2\n268#1:396\n134#1:349\n260#1:390\n261#1:391\n275#1:395\n148#1:352,2\n156#1:360,2\n165#1:368\n165#1:371\n192#1:372,2\n207#1:380,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListItemAnimator {
    public static final int $stable = 8;
    private int firstVisibleIndex;

    @m
    private LazyLayoutKeyIndexMap keyIndexMap;

    @l
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();

    @l
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();

    @l
    private final List<LazyListMeasuredItem> movingInFromStartBound = new ArrayList();

    @l
    private final List<LazyListMeasuredItem> movingInFromEndBound = new ArrayList();

    @l
    private final List<LazyListMeasuredItem> movingAwayToStartBound = new ArrayList();

    @l
    private final List<LazyListMeasuredItem> movingAwayToEndBound = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R4\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemAnimator$ItemInfo;", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "positionedItem", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlin/r2;", "updateAnimation", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "<set-?>", "animations", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimation;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ItemInfo {

        @l
        private LazyLayoutAnimation[] animations = LazyListItemAnimatorKt.access$getEmptyArray$p();

        @l
        public final LazyLayoutAnimation[] getAnimations() {
            return this.animations;
        }

        public final void updateAnimation(@l LazyListMeasuredItem lazyListMeasuredItem, @l s0 s0Var) {
            int length = this.animations.length;
            for (int placeablesCount = lazyListMeasuredItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutAnimation lazyLayoutAnimation = this.animations[placeablesCount];
                if (lazyLayoutAnimation != null) {
                    lazyLayoutAnimation.stopAnimations();
                }
            }
            if (this.animations.length != lazyListMeasuredItem.getPlaceablesCount()) {
                Object[] copyOf = Arrays.copyOf(this.animations, lazyListMeasuredItem.getPlaceablesCount());
                l0.o(copyOf, "copyOf(this, newSize)");
                this.animations = (LazyLayoutAnimation[]) copyOf;
            }
            int placeablesCount2 = lazyListMeasuredItem.getPlaceablesCount();
            for (int i5 = 0; i5 < placeablesCount2; i5++) {
                LazyLayoutAnimationSpecsNode access$getSpecs = LazyListItemAnimatorKt.access$getSpecs(lazyListMeasuredItem.getParentData(i5));
                if (access$getSpecs == null) {
                    LazyLayoutAnimation lazyLayoutAnimation2 = this.animations[i5];
                    if (lazyLayoutAnimation2 != null) {
                        lazyLayoutAnimation2.stopAnimations();
                    }
                    this.animations[i5] = null;
                } else {
                    LazyLayoutAnimation lazyLayoutAnimation3 = this.animations[i5];
                    if (lazyLayoutAnimation3 == null) {
                        lazyLayoutAnimation3 = new LazyLayoutAnimation(s0Var);
                        this.animations[i5] = lazyLayoutAnimation3;
                    }
                    lazyLayoutAnimation3.setAppearanceSpec(access$getSpecs.getAppearanceSpec());
                    lazyLayoutAnimation3.setPlacementSpec(access$getSpecs.getPlacementSpec());
                }
            }
        }
    }

    private final boolean getHasAnimations(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i5 = 0; i5 < placeablesCount; i5++) {
            if (LazyListItemAnimatorKt.access$getSpecs(lazyListMeasuredItem.getParentData(i5)) != null) {
                return true;
            }
        }
        return false;
    }

    private final void initializeAnimation(LazyListMeasuredItem lazyListMeasuredItem, int i5, ItemInfo itemInfo) {
        long m6168copyiSbpLlY$default;
        int i6 = 0;
        long m665getOffsetBjo55l4 = lazyListMeasuredItem.m665getOffsetBjo55l4(0);
        if (lazyListMeasuredItem.isVertical()) {
            m6168copyiSbpLlY$default = IntOffset.m6168copyiSbpLlY$default(m665getOffsetBjo55l4, 0, i5, 1, null);
        } else {
            m6168copyiSbpLlY$default = IntOffset.m6168copyiSbpLlY$default(m665getOffsetBjo55l4, i5, 0, 2, null);
        }
        LazyLayoutAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i7 = 0;
        while (i6 < length) {
            LazyLayoutAnimation lazyLayoutAnimation = animations[i6];
            int i8 = i7 + 1;
            if (lazyLayoutAnimation != null) {
                long m665getOffsetBjo55l42 = lazyListMeasuredItem.m665getOffsetBjo55l4(i7);
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m665getOffsetBjo55l42) - IntOffset.m6172getXimpl(m665getOffsetBjo55l4), IntOffset.m6173getYimpl(m665getOffsetBjo55l42) - IntOffset.m6173getYimpl(m665getOffsetBjo55l4));
                lazyLayoutAnimation.m706setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6168copyiSbpLlY$default) + IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(m6168copyiSbpLlY$default) + IntOffset.m6173getYimpl(IntOffset)));
            }
            i6++;
            i7 = i8;
        }
    }

    static /* synthetic */ void initializeAnimation$default(LazyListItemAnimator lazyListItemAnimator, LazyListMeasuredItem lazyListMeasuredItem, int i5, ItemInfo itemInfo, int i6, Object obj) {
        Object K;
        if ((i6 & 4) != 0) {
            K = a1.K(lazyListItemAnimator.keyToItemInfoMap, lazyListMeasuredItem.getKey());
            itemInfo = (ItemInfo) K;
        }
        lazyListItemAnimator.initializeAnimation(lazyListMeasuredItem, i5, itemInfo);
    }

    private final void startPlacementAnimationsIfNeeded(LazyListMeasuredItem lazyListMeasuredItem) {
        Object K;
        K = a1.K(this.keyToItemInfoMap, lazyListMeasuredItem.getKey());
        LazyLayoutAnimation[] animations = ((ItemInfo) K).getAnimations();
        int length = animations.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            LazyLayoutAnimation lazyLayoutAnimation = animations[i5];
            int i7 = i6 + 1;
            if (lazyLayoutAnimation != null) {
                long m665getOffsetBjo55l4 = lazyListMeasuredItem.m665getOffsetBjo55l4(i6);
                long m704getRawOffsetnOccac = lazyLayoutAnimation.m704getRawOffsetnOccac();
                if (!IntOffset.m6171equalsimpl0(m704getRawOffsetnOccac, LazyLayoutAnimation.Companion.m707getNotInitializednOccac()) && !IntOffset.m6171equalsimpl0(m704getRawOffsetnOccac, m665getOffsetBjo55l4)) {
                    lazyLayoutAnimation.m701animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m665getOffsetBjo55l4) - IntOffset.m6172getXimpl(m704getRawOffsetnOccac), IntOffset.m6173getYimpl(m665getOffsetBjo55l4) - IntOffset.m6173getYimpl(m704getRawOffsetnOccac)));
                }
                lazyLayoutAnimation.m706setRawOffsetgyyYBs(m665getOffsetBjo55l4);
            }
            i5++;
            i6 = i7;
        }
    }

    @m
    public final LazyLayoutAnimation getAnimation(@l Object obj, int i5) {
        LazyLayoutAnimation[] animations;
        ItemInfo itemInfo = this.keyToItemInfoMap.get(obj);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[i5];
    }

    public final void onMeasured(int i5, int i6, int i7, @l List<LazyListMeasuredItem> list, @l LazyListMeasuredItemProvider lazyListMeasuredItemProvider, boolean z4, boolean z5, boolean z6, @l s0 s0Var) {
        boolean z7;
        Object D2;
        int i8;
        int i9;
        long IntOffset;
        boolean z8;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        int i10;
        Object m32;
        int i11;
        Object y22;
        Object K;
        boolean z9;
        boolean z10;
        boolean z11;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
        int i12;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
        int i13;
        int m6172getXimpl;
        List<LazyListMeasuredItem> list2 = list;
        s0 s0Var2 = s0Var;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap4 = this.keyIndexMap;
        final LazyLayoutKeyIndexMap keyIndexMap = lazyListMeasuredItemProvider.getKeyIndexMap();
        this.keyIndexMap = keyIndexMap;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                if (getHasAnimations(list2.get(i14))) {
                    z7 = true;
                    break;
                }
                i14++;
            } else {
                z7 = false;
                break;
            }
        }
        if (!z7 && this.keyToItemInfoMap.isEmpty()) {
            reset();
            return;
        }
        int i15 = this.firstVisibleIndex;
        D2 = e0.D2(list);
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) D2;
        if (lazyListMeasuredItem != null) {
            i8 = lazyListMeasuredItem.getIndex();
        } else {
            i8 = 0;
        }
        this.firstVisibleIndex = i8;
        if (z4) {
            i9 = i7;
        } else {
            i9 = i6;
        }
        if (z4) {
            IntOffset = IntOffsetKt.IntOffset(0, i5);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i5, 0);
        }
        if (!z5 && z6) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = list.size();
        int i16 = 0;
        while (i16 < size2) {
            LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i16);
            int i17 = size2;
            this.movingAwayKeys.remove(lazyListMeasuredItem2.getKey());
            if (getHasAnimations(lazyListMeasuredItem2)) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyListMeasuredItem2.getKey());
                if (itemInfo == null) {
                    ItemInfo itemInfo2 = new ItemInfo();
                    itemInfo2.updateAnimation(lazyListMeasuredItem2, s0Var2);
                    this.keyToItemInfoMap.put(lazyListMeasuredItem2.getKey(), itemInfo2);
                    if (lazyLayoutKeyIndexMap4 != null) {
                        i13 = lazyLayoutKeyIndexMap4.getIndex(lazyListMeasuredItem2.getKey());
                    } else {
                        i13 = -1;
                    }
                    if (lazyListMeasuredItem2.getIndex() != i13 && i13 != -1) {
                        if (i13 < i15) {
                            this.movingInFromStartBound.add(lazyListMeasuredItem2);
                        } else {
                            this.movingInFromEndBound.add(lazyListMeasuredItem2);
                        }
                    } else {
                        long m665getOffsetBjo55l4 = lazyListMeasuredItem2.m665getOffsetBjo55l4(0);
                        if (lazyListMeasuredItem2.isVertical()) {
                            m6172getXimpl = IntOffset.m6173getYimpl(m665getOffsetBjo55l4);
                        } else {
                            m6172getXimpl = IntOffset.m6172getXimpl(m665getOffsetBjo55l4);
                        }
                        initializeAnimation(lazyListMeasuredItem2, m6172getXimpl, itemInfo2);
                        if (i13 == -1 && lazyLayoutKeyIndexMap4 != null) {
                            for (LazyLayoutAnimation lazyLayoutAnimation : itemInfo2.getAnimations()) {
                                if (lazyLayoutAnimation != null) {
                                    lazyLayoutAnimation.animateAppearance();
                                }
                            }
                        }
                    }
                } else if (z8) {
                    itemInfo.updateAnimation(lazyListMeasuredItem2, s0Var2);
                    LazyLayoutAnimation[] animations = itemInfo.getAnimations();
                    int length = animations.length;
                    int i18 = 0;
                    while (i18 < length) {
                        LazyLayoutAnimation lazyLayoutAnimation2 = animations[i18];
                        if (lazyLayoutAnimation2 != null) {
                            i12 = length;
                            lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap4;
                            if (!IntOffset.m6171equalsimpl0(lazyLayoutAnimation2.m704getRawOffsetnOccac(), LazyLayoutAnimation.Companion.m707getNotInitializednOccac())) {
                                long m704getRawOffsetnOccac = lazyLayoutAnimation2.m704getRawOffsetnOccac();
                                lazyLayoutAnimation2.m706setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m704getRawOffsetnOccac) + IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(m704getRawOffsetnOccac) + IntOffset.m6173getYimpl(IntOffset)));
                            }
                        } else {
                            i12 = length;
                            lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap4;
                        }
                        i18++;
                        lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap3;
                        length = i12;
                    }
                    lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap4;
                    startPlacementAnimationsIfNeeded(lazyListMeasuredItem2);
                }
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap4;
            } else {
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap4;
                this.keyToItemInfoMap.remove(lazyListMeasuredItem2.getKey());
            }
            i16++;
            list2 = list;
            size2 = i17;
            s0Var2 = s0Var;
            lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap2;
        }
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap5 = lazyLayoutKeyIndexMap4;
        if (z8 && lazyLayoutKeyIndexMap5 != null) {
            List<LazyListMeasuredItem> list3 = this.movingInFromStartBound;
            if (list3.size() > 1) {
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap5;
                a0.m0(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t6) {
                        int l5;
                        l5 = g.l(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t6).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t5).getKey())));
                        return l5;
                    }
                });
            } else {
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap5;
            }
            List<LazyListMeasuredItem> list4 = this.movingInFromStartBound;
            int size3 = list4.size();
            int i19 = 0;
            int i20 = 0;
            while (i20 < size3) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list4.get(i20);
                int sizeWithSpacings = i19 + lazyListMeasuredItem3.getSizeWithSpacings();
                initializeAnimation$default(this, lazyListMeasuredItem3, 0 - sizeWithSpacings, null, 4, null);
                startPlacementAnimationsIfNeeded(lazyListMeasuredItem3);
                i20++;
                i19 = sizeWithSpacings;
            }
            List<LazyListMeasuredItem> list5 = this.movingInFromEndBound;
            if (list5.size() > 1) {
                a0.m0(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t6) {
                        int l5;
                        l5 = g.l(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t5).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t6).getKey())));
                        return l5;
                    }
                });
            }
            List<LazyListMeasuredItem> list6 = this.movingInFromEndBound;
            int size4 = list6.size();
            int i21 = 0;
            int i22 = 0;
            while (i22 < size4) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list6.get(i22);
                int sizeWithSpacings2 = i21 + lazyListMeasuredItem4.getSizeWithSpacings();
                initializeAnimation$default(this, lazyListMeasuredItem4, i9 + i21, null, 4, null);
                startPlacementAnimationsIfNeeded(lazyListMeasuredItem4);
                i22++;
                i21 = sizeWithSpacings2;
            }
        } else {
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap5;
        }
        for (Object obj : this.movingAwayKeys) {
            int index = keyIndexMap.getIndex(obj);
            if (index == -1) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyListMeasuredItem andMeasure = lazyListMeasuredItemProvider.getAndMeasure(index);
                boolean z12 = true;
                andMeasure.setNonScrollableItem(true);
                K = a1.K(this.keyToItemInfoMap, obj);
                LazyLayoutAnimation[] animations2 = ((ItemInfo) K).getAnimations();
                int length2 = animations2.length;
                int i23 = 0;
                while (true) {
                    if (i23 < length2) {
                        LazyLayoutAnimation lazyLayoutAnimation3 = animations2[i23];
                        if (lazyLayoutAnimation3 != null && lazyLayoutAnimation3.isPlacementAnimationInProgress() == z12) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z9 = true;
                            break;
                        } else {
                            i23++;
                            z12 = true;
                        }
                    } else {
                        z9 = false;
                        break;
                    }
                }
                if (!z9) {
                    if (lazyLayoutKeyIndexMap != null && index == lazyLayoutKeyIndexMap.getIndex(obj)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.keyToItemInfoMap.remove(obj);
                    }
                }
                if (index < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(andMeasure);
                } else {
                    this.movingAwayToEndBound.add(andMeasure);
                }
            }
        }
        List<LazyListMeasuredItem> list7 = this.movingAwayToStartBound;
        if (list7.size() > 1) {
            a0.m0(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t5, T t6) {
                    int l5;
                    l5 = g.l(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t6).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t5).getKey())));
                    return l5;
                }
            });
        }
        List<LazyListMeasuredItem> list8 = this.movingAwayToStartBound;
        int size5 = list8.size();
        int i24 = 0;
        for (int i25 = 0; i25 < size5; i25++) {
            LazyListMeasuredItem lazyListMeasuredItem5 = list8.get(i25);
            i24 += lazyListMeasuredItem5.getSizeWithSpacings();
            if (z5) {
                y22 = e0.y2(list);
                i11 = ((LazyListMeasuredItem) y22).getOffset() - i24;
            } else {
                i11 = 0 - i24;
            }
            lazyListMeasuredItem5.position(i11, i6, i7);
            if (z8) {
                startPlacementAnimationsIfNeeded(lazyListMeasuredItem5);
            }
        }
        List<LazyListMeasuredItem> list9 = this.movingAwayToEndBound;
        if (list9.size() > 1) {
            a0.m0(list9, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t5, T t6) {
                    int l5;
                    l5 = g.l(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t5).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t6).getKey())));
                    return l5;
                }
            });
        }
        List<LazyListMeasuredItem> list10 = this.movingAwayToEndBound;
        int size6 = list10.size();
        int i26 = 0;
        for (int i27 = 0; i27 < size6; i27++) {
            LazyListMeasuredItem lazyListMeasuredItem6 = list10.get(i27);
            if (z5) {
                m32 = e0.m3(list);
                LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) m32;
                i10 = lazyListMeasuredItem7.getOffset() + lazyListMeasuredItem7.getSizeWithSpacings() + i26;
            } else {
                i10 = i9 + i26;
            }
            i26 += lazyListMeasuredItem6.getSizeWithSpacings();
            lazyListMeasuredItem6.position(i10, i6, i7);
            if (z8) {
                startPlacementAnimationsIfNeeded(lazyListMeasuredItem6);
            }
        }
        List<LazyListMeasuredItem> list11 = this.movingAwayToStartBound;
        d0.o1(list11);
        r2 r2Var = r2.f19517a;
        list.addAll(0, list11);
        list.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }
}
