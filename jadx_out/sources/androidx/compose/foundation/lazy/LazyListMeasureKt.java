package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.j;
import kotlin.ranges.u;

@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0095\u0002\u0010/\u001a\u00020,2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2/\u0010+\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&¢\u0006\u0002\b)\u0012\u0004\u0012\u00020*0%H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\\\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u001fH\u0002\u001a4\u00107\u001a\b\u0012\u0004\u0012\u0002010\u00102\u0006\u00106\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0002\u001a\u008c\u0001\u0010@\u001a\b\u0012\u0004\u0012\u000201002\f\u00108\u001a\b\u0012\u0004\u0012\u0002010\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u0002010\u00102\f\u0010:\u001a\b\u0012\u0004\u0012\u0002010\u00102\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "itemAnimator", "beyondBoundsItemCount", "pinnedItems", "hasLookaheadPassOccurred", "isLookingAhead", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "postLookaheadLayoutInfo", "Lkotlinx/coroutines/s0;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-5IMabDg", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/MutableState;Lv3/q;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "visibleItems", "consumedScroll", "lastPostLookaheadLayoutInfo", "createItemsAfterList", "currentFirstItemIndex", "createItemsBeforeList", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "calculateItemsOffsets", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,606:1\n1#2:607\n33#3,6:608\n33#3,6:614\n235#3,3:620\n33#3,4:623\n238#3,2:627\n38#3:629\n240#3:630\n116#3,2:631\n33#3,6:633\n118#3:639\n116#3,2:640\n33#3,6:642\n118#3:648\n116#3,2:649\n33#3,6:651\n118#3:657\n33#3,6:658\n51#3,6:664\n33#3,6:670\n33#3,6:676\n33#3,6:682\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n288#1:608,6\n305#1:614,6\n376#1:620,3\n376#1:623,4\n376#1:627,2\n376#1:629\n376#1:630\n434#1:631,2\n434#1:633,6\n434#1:639\n451#1:640,2\n451#1:642,6\n451#1:648\n453#1:649,2\n453#1:651,6\n453#1:657\n474#1:658,6\n501#1:664,6\n585#1:670,6\n592#1:676,6\n598#1:682,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i5, int i6, int i7, int i8, int i9, boolean z4, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z5, Density density) {
        int i10;
        boolean z6;
        j le;
        boolean z7;
        if (z4) {
            i10 = i6;
        } else {
            i10 = i5;
        }
        boolean z8 = true;
        if (i7 < Math.min(i10, i8)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            if (i9 == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                throw new IllegalStateException("non-zero itemsScrollOffset".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z6) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z8 = false;
            }
            if (z8) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr[i11] = list.get(calculateItemsOffsets$reverseAware(i11, z5, size)).getSize();
                }
                int[] iArr2 = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    iArr2[i12] = 0;
                }
                if (z4) {
                    if (vertical != null) {
                        vertical.arrange(density, i10, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                    }
                } else if (horizontal != null) {
                    horizontal.arrange(density, i10, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                }
                le = p.le(iArr2);
                if (z5) {
                    le = u.q1(le);
                }
                int e5 = le.e();
                int g5 = le.g();
                int i13 = le.i();
                if ((i13 > 0 && e5 <= g5) || (i13 < 0 && g5 <= e5)) {
                    while (true) {
                        int i14 = iArr2[e5];
                        LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(e5, z5, size));
                        if (z5) {
                            i14 = (i10 - i14) - lazyListMeasuredItem.getSize();
                        }
                        lazyListMeasuredItem.position(i14, i5, i6);
                        arrayList.add(lazyListMeasuredItem);
                        if (e5 == g5) {
                            break;
                        }
                        e5 += i13;
                    }
                }
            } else {
                throw new IllegalArgumentException("no extra items".toString());
            }
        } else {
            int size2 = list2.size();
            int i15 = i9;
            for (int i16 = 0; i16 < size2; i16++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i16);
                i15 -= lazyListMeasuredItem2.getSizeWithSpacings();
                lazyListMeasuredItem2.position(i15, i5, i6);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i17 = i9;
            for (int i18 = 0; i18 < size3; i18++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i18);
                lazyListMeasuredItem3.position(i17, i5, i6);
                arrayList.add(lazyListMeasuredItem3);
                i17 += lazyListMeasuredItem3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i19 = 0; i19 < size4; i19++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i19);
                lazyListMeasuredItem4.position(i17, i5, i6);
                arrayList.add(lazyListMeasuredItem4);
                i17 += lazyListMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i5, boolean z4, int i6) {
        return !z4 ? i5 : (i6 - i5) - 1;
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i5, int i6, List<Integer> list2, float f5, boolean z4, LazyListLayoutInfo lazyListLayoutInfo) {
        Object m32;
        Object m33;
        List<LazyListMeasuredItem> E;
        Object m34;
        Object m35;
        LazyListItemInfo lazyListItemInfo;
        Object m36;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        boolean z5;
        Object m37;
        int sizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        boolean z6;
        int index;
        int min;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        boolean z7;
        m32 = e0.m3(list);
        int i7 = i5 - 1;
        int min2 = Math.min(((LazyListMeasuredItem) m32).getIndex() + i6, i7);
        m33 = e0.m3(list);
        int index2 = ((LazyListMeasuredItem) m33).getIndex() + 1;
        ArrayList arrayList = null;
        if (index2 <= min2) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(index2));
                if (index2 == min2) {
                    break;
                }
                index2++;
            }
        }
        if (z4 && lazyListLayoutInfo != null && (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            for (int size = visibleItemsInfo.size() - 1; -1 < size; size--) {
                if (visibleItemsInfo.get(size).getIndex() > min2 && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= min2)) {
                    lazyListItemInfo = visibleItemsInfo.get(size);
                    break;
                }
            }
            lazyListItemInfo = null;
            m36 = e0.m3(lazyListLayoutInfo.getVisibleItemsInfo());
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) m36;
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (min = Math.min(lazyListItemInfo2.getIndex(), i7))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < size2) {
                                lazyListMeasuredItem5 = arrayList.get(i8);
                                if (lazyListMeasuredItem5.getIndex() == index) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    break;
                                }
                                i8++;
                            } else {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(index));
                    }
                    if (index == min) {
                        break;
                    }
                    index++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f5;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i9 = 0;
                while (index3 < i5 && i9 < viewportEndOffset) {
                    if (index3 <= min2) {
                        int size3 = list.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size3) {
                                lazyListMeasuredItem3 = list.get(i10);
                                if (lazyListMeasuredItem3.getIndex() == index3) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    break;
                                }
                                i10++;
                            } else {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size4) {
                                lazyListMeasuredItem2 = arrayList.get(i11);
                                if (lazyListMeasuredItem2.getIndex() == index3) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    break;
                                }
                                i11++;
                            } else {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        sizeWithSpacings = lazyListMeasuredItem.getSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(index3));
                        index3++;
                        m37 = e0.m3(arrayList);
                        sizeWithSpacings = ((LazyListMeasuredItem) m37).getSizeWithSpacings();
                    }
                    i9 += sizeWithSpacings;
                }
            }
        }
        if (arrayList != null) {
            m34 = e0.m3(arrayList);
            if (((LazyListMeasuredItem) m34).getIndex() > min2) {
                m35 = e0.m3(arrayList);
                min2 = ((LazyListMeasuredItem) m35).getIndex();
            }
        }
        int size5 = list2.size();
        for (int i12 = 0; i12 < size5; i12++) {
            int intValue = list2.get(i12).intValue();
            if (intValue > min2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
            }
        }
        if (arrayList == null) {
            E = w.E();
            return E;
        }
        return arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i5, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i6, List<Integer> list) {
        List<LazyListMeasuredItem> E;
        int max = Math.max(0, i5 - i6);
        int i7 = i5 - 1;
        ArrayList arrayList = null;
        if (max <= i7) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(i7));
                if (i7 == max) {
                    break;
                }
                i7--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i8 = size - 1;
                int intValue = list.get(size).intValue();
                if (intValue < max) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
                }
                if (i8 < 0) {
                    break;
                }
                size = i8;
            }
        }
        if (arrayList == null) {
            E = w.E();
            return E;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c1  */
    @p4.l
    /* renamed from: measureLazyList-5IMabDg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m662measureLazyList5IMabDg(int r36, @p4.l androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r37, int r38, int r39, int r40, int r41, int r42, int r43, float r44, long r45, boolean r47, @p4.l java.util.List<java.lang.Integer> r48, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r49, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r50, boolean r51, @p4.l androidx.compose.ui.unit.Density r52, @p4.l androidx.compose.foundation.lazy.LazyListItemAnimator r53, int r54, @p4.l java.util.List<java.lang.Integer> r55, boolean r56, boolean r57, @p4.m androidx.compose.foundation.lazy.LazyListLayoutInfo r58, @p4.l kotlinx.coroutines.s0 r59, @p4.l androidx.compose.runtime.MutableState<kotlin.r2> r60, @p4.l v3.q<? super java.lang.Integer, ? super java.lang.Integer, ? super v3.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.r2>, ? extends androidx.compose.ui.layout.MeasureResult> r61) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m662measureLazyList5IMabDg(int, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemAnimator, int, java.util.List, boolean, boolean, androidx.compose.foundation.lazy.LazyListLayoutInfo, kotlinx.coroutines.s0, androidx.compose.runtime.MutableState, v3.q):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
