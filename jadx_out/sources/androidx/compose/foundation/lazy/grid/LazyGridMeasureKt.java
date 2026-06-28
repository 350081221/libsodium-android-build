package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.j;
import kotlin.ranges.u;
import v3.l;

@i0(d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001aõ\u0001\u0010-\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$¢\u0006\u0002\b'\u0012\u0004\u0012\u00020(0#H\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aM\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0$2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100$H\u0083\b\u001a\u008c\u0001\u0010<\u001a\b\u0012\u0004\u0012\u0002000;2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001d2\f\u00104\u001a\b\u0012\u0004\u0012\u0002000\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u0002000\u001d2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "", "pinnedItems", "Lkotlinx/coroutines/s0;", "coroutineScope", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-W2FL7xs", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Ljava/util/List;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/MutableState;Lv3/q;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "itemConstraints", "filter", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "calculateExtraItems", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "calculateItemsOffsets", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,440:1\n334#1,3:442\n337#1,12:449\n350#1:462\n334#1,3:463\n337#1,12:470\n350#1:483\n1#2:441\n33#3,4:445\n38#3:461\n33#3,4:466\n38#3:482\n235#3,3:484\n33#3,4:487\n238#3,2:491\n38#3:493\n240#3:494\n33#3,6:495\n132#3,3:501\n33#3,4:504\n135#3,2:508\n38#3:510\n137#3:511\n51#3,6:512\n33#3,6:518\n33#3,6:524\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n230#1:442,3\n230#1:449,12\n230#1:462\n237#1:463,3\n237#1:470,12\n237#1:483\n230#1:445,4\n230#1:461\n237#1:466,4\n237#1:482\n313#1:484,3\n313#1:487,4\n313#1:491,2\n313#1:493\n313#1:494\n336#1:495,6\n377#1:501,3\n377#1:504,4\n377#1:508,2\n377#1:510\n377#1:511\n420#1:512,6\n427#1:518,6\n432#1:524,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, l<? super Integer, Constraints> lVar, l<? super Integer, Boolean> lVar2) {
        List<LazyGridMeasuredItem> E;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = list.get(i5).intValue();
            if (lVar2.invoke(Integer.valueOf(intValue)).booleanValue()) {
                LazyGridMeasuredItem m694getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m694getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, intValue, 0, lVar.invoke(Integer.valueOf(intValue)).m6006unboximpl(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m694getAndMeasure3p2s80s$default);
            }
        }
        if (arrayList == null) {
            E = w.E();
            return E;
        }
        return arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i5, int i6, int i7, int i8, int i9, boolean z4, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z5, Density density) {
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
                throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
            }
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += list.get(i12).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i11);
        if (z6) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z8 = false;
            }
            if (z8) {
                int size2 = list.size();
                int[] iArr = new int[size2];
                for (int i13 = 0; i13 < size2; i13++) {
                    iArr[i13] = list.get(calculateItemsOffsets$reverseAware(i13, z5, size2)).getMainAxisSize();
                }
                int[] iArr2 = new int[size2];
                for (int i14 = 0; i14 < size2; i14++) {
                    iArr2[i14] = 0;
                }
                if (z4) {
                    if (vertical != null) {
                        vertical.arrange(density, i10, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("null verticalArrangement".toString());
                    }
                } else if (horizontal != null) {
                    horizontal.arrange(density, i10, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
                }
                le = p.le(iArr2);
                if (z5) {
                    le = u.q1(le);
                }
                int e5 = le.e();
                int g5 = le.g();
                int i15 = le.i();
                if ((i15 > 0 && e5 <= g5) || (i15 < 0 && g5 <= e5)) {
                    while (true) {
                        int i16 = iArr2[e5];
                        LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(e5, z5, size2));
                        if (z5) {
                            i16 = (i10 - i16) - lazyGridMeasuredLine.getMainAxisSize();
                        }
                        b0.p0(arrayList, lazyGridMeasuredLine.position(i16, i5, i6));
                        if (e5 == g5) {
                            break;
                        }
                        e5 += i15;
                    }
                }
            } else {
                throw new IllegalArgumentException("no items".toString());
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int i17 = i9;
                while (true) {
                    int i18 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    int mainAxisSizeWithSpacings = i17 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i5, i6, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i18 < 0) {
                        break;
                    }
                    size3 = i18;
                    i17 = mainAxisSizeWithSpacings;
                }
            }
            int size4 = list.size();
            int i19 = i9;
            for (int i20 = 0; i20 < size4; i20++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i20);
                b0.p0(arrayList, lazyGridMeasuredLine2.position(i19, i5, i6));
                i19 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int i21 = i19;
            int i22 = 0;
            for (int size5 = list3.size(); i22 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i22);
                lazyGridMeasuredItem2.position(i21, 0, i5, i6, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem2);
                i21 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i22++;
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i5, boolean z4, int i6) {
        return !z4 ? i5 : (i6 - i5) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216  */
    @p4.l
    /* renamed from: measureLazyGrid-W2FL7xs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m691measureLazyGridW2FL7xs(int r32, @p4.l androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider r33, @p4.l androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, long r42, boolean r44, @p4.m androidx.compose.foundation.layout.Arrangement.Vertical r45, @p4.m androidx.compose.foundation.layout.Arrangement.Horizontal r46, boolean r47, @p4.l androidx.compose.ui.unit.Density r48, @p4.l androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r49, @p4.l androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r50, @p4.l java.util.List<java.lang.Integer> r51, @p4.l kotlinx.coroutines.s0 r52, @p4.l androidx.compose.runtime.MutableState<kotlin.r2> r53, @p4.l v3.q<? super java.lang.Integer, ? super java.lang.Integer, ? super v3.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.r2>, ? extends androidx.compose.ui.layout.MeasureResult> r54) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m691measureLazyGridW2FL7xs(int, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, java.util.List, kotlinx.coroutines.s0, androidx.compose.runtime.MutableState, v3.q):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }
}
