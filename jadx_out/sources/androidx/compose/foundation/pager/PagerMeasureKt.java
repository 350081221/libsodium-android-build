package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.k;
import kotlin.collections.p;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.j;
import kotlin.ranges.u;
import p4.m;
import v3.l;
import v3.q;

@i0(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aé\u0001\u0010)\u001a\u00020&*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2/\u0010%\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aH\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020,0 H\u0002\u001a@\u00100\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010/\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020,0 H\u0002\u001a@\u00104\u001a\u0004\u0018\u00010,2\u0006\u00101\u001a\u00020\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u001aj\u0010-\u001a\u00020,*\u00020\u00002\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u00108\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u008c\u0001\u0010F\u001a\b\u0012\u0004\u0012\u00020,0E*\u00020\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020,0\u00192\f\u0010<\u001a\b\u0012\u0004\u0012\u00020,0\u00192\f\u0010=\u001a\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0017\u0010J\u001a\u00020\"2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0GH\u0082\b\"\u0014\u0010L\u001a\u00020K8\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010M\"\u0014\u0010N\u001a\u00020K8\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010M\"\u0014\u0010O\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010P\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "visualPageOffset", "pageAvailableSize", "beyondBoundsPageCount", "", "pinnedPages", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "snapPositionInLayout", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager-_JDW0YA", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Landroidx/compose/runtime/MutableState;Lv3/q;)Landroidx/compose/foundation/pager/PagerMeasureResult;", "measurePager", "currentLastPage", "pagesCount", "Landroidx/compose/foundation/pager/MeasuredPage;", "getAndMeasure", "createPagesAfterList", "currentFirstPage", "createPagesBeforeList", "viewportSize", "visiblePagesInfo", "itemSize", "calculateNewCurrentPage", "index", "childConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getAndMeasure-SGf7dI0", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJLandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;JLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZI)Landroidx/compose/foundation/pager/MeasuredPage;", d.f12498t, "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "Landroidx/compose/ui/unit/Density;", "density", "", "calculatePagesOffsets", "Lkotlin/Function0;", "", "generateMsg", "debugLog", "", "MinPageOffset", "F", "MaxPageOffset", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,631:1\n627#1,4:633\n627#1,4:660\n1#2:632\n33#3,6:637\n33#3,6:643\n235#3,3:649\n33#3,4:652\n238#3,2:656\n38#3:658\n240#3:659\n33#3,6:664\n33#3,6:670\n171#3,13:676\n33#3,6:689\n33#3,6:695\n33#3,6:701\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n66#1:633,4\n402#1:660,4\n312#1:637,6\n338#1:643,6\n378#1:649,3\n378#1:652,4\n378#1:656,2\n378#1:658\n378#1:659\n449#1:664,6\n474#1:670,6\n493#1:676,13\n600#1:689,6\n607#1:695,6\n613#1:701,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasureKt {
    private static final boolean DEBUG = false;
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final MeasuredPage calculateNewCurrentPage(int i5, List<MeasuredPage> list, int i6, int i7, int i8, SnapPositionInLayout snapPositionInLayout) {
        int G;
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            MeasuredPage measuredPage2 = list.get(0);
            MeasuredPage measuredPage3 = measuredPage2;
            float f5 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(i5, i6, i7, i8, measuredPage3.getOffset(), measuredPage3.getIndex(), snapPositionInLayout));
            G = w.G(list);
            int i9 = 1;
            if (1 <= G) {
                while (true) {
                    MeasuredPage measuredPage4 = list.get(i9);
                    MeasuredPage measuredPage5 = measuredPage4;
                    float f6 = -Math.abs(SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(i5, i6, i7, i8, measuredPage5.getOffset(), measuredPage5.getIndex(), snapPositionInLayout));
                    if (Float.compare(f5, f6) < 0) {
                        measuredPage2 = measuredPage4;
                        f5 = f6;
                    }
                    if (i9 == G) {
                        break;
                    }
                    i9++;
                }
            }
            measuredPage = measuredPage2;
        }
        return measuredPage;
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i5, int i6, int i7, int i8, int i9, Orientation orientation, boolean z4, Density density, int i10, int i11) {
        int i12;
        int i13;
        boolean z5;
        j le;
        boolean z6;
        int i14 = i9;
        int i15 = i11 + i10;
        if (orientation == Orientation.Vertical) {
            i12 = i8;
            i13 = i6;
        } else {
            i12 = i8;
            i13 = i5;
        }
        boolean z7 = true;
        if (i7 < Math.min(i13, i12)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (i14 == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                throw new IllegalStateException(("non-zero pagesScrollOffset=" + i14).toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z5) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z7 = false;
            }
            if (z7) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i16 = 0; i16 < size; i16++) {
                    iArr[i16] = i11;
                }
                int[] iArr2 = new int[size];
                for (int i17 = 0; i17 < size; i17++) {
                    iArr2[i17] = 0;
                }
                Arrangement.HorizontalOrVertical m465spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m465spacedBy0680j_4(lazyLayoutMeasureScope.mo301toDpu2uoSUM(i10));
                if (orientation == Orientation.Vertical) {
                    m465spacedBy0680j_4.arrange(density, i13, iArr, iArr2);
                } else {
                    m465spacedBy0680j_4.arrange(density, i13, iArr, LayoutDirection.Ltr, iArr2);
                }
                le = p.le(iArr2);
                if (z4) {
                    le = u.q1(le);
                }
                int e5 = le.e();
                int g5 = le.g();
                int i18 = le.i();
                if ((i18 > 0 && e5 <= g5) || (i18 < 0 && g5 <= e5)) {
                    while (true) {
                        int i19 = iArr2[e5];
                        MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(e5, z4, size));
                        if (z4) {
                            i19 = (i13 - i19) - measuredPage.getSize();
                        }
                        measuredPage.position(i19, i5, i6);
                        arrayList.add(measuredPage);
                        if (e5 == g5) {
                            break;
                        }
                        e5 += i18;
                    }
                }
            } else {
                throw new IllegalArgumentException("No extra pages".toString());
            }
        } else {
            int size2 = list2.size();
            int i20 = i14;
            for (int i21 = 0; i21 < size2; i21++) {
                MeasuredPage measuredPage2 = list2.get(i21);
                i20 -= i15;
                measuredPage2.position(i20, i5, i6);
                arrayList.add(measuredPage2);
            }
            int size3 = list.size();
            for (int i22 = 0; i22 < size3; i22++) {
                MeasuredPage measuredPage3 = list.get(i22);
                measuredPage3.position(i14, i5, i6);
                arrayList.add(measuredPage3);
                i14 += i15;
            }
            int size4 = list3.size();
            for (int i23 = 0; i23 < size4; i23++) {
                MeasuredPage measuredPage4 = list3.get(i23);
                measuredPage4.position(i14, i5, i6);
                arrayList.add(measuredPage4);
                i14 += i15;
            }
        }
        return arrayList;
    }

    private static final int calculatePagesOffsets$reverseAware(int i5, boolean z4, int i6) {
        return !z4 ? i5 : (i6 - i5) - 1;
    }

    private static final List<MeasuredPage> createPagesAfterList(int i5, int i6, int i7, List<Integer> list, l<? super Integer, MeasuredPage> lVar) {
        List<MeasuredPage> E;
        boolean z4;
        int min = Math.min(i7 + i5, i6 - 1);
        int i8 = i5 + 1;
        ArrayList arrayList = null;
        if (i8 <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i8)));
                if (i8 == min) {
                    break;
                }
                i8++;
            }
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            int intValue = list.get(i9).intValue();
            if (min + 1 <= intValue && intValue < i6) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            E = w.E();
            return E;
        }
        return arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i5, int i6, List<Integer> list, l<? super Integer, MeasuredPage> lVar) {
        List<MeasuredPage> E;
        int max = Math.max(0, i5 - i6);
        int i7 = i5 - 1;
        ArrayList arrayList = null;
        if (max <= i7) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(i7)));
                if (i7 == max) {
                    break;
                }
                i7--;
            }
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = list.get(i8).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(Integer.valueOf(intValue)));
            }
        }
        if (arrayList == null) {
            E = w.E();
            return E;
        }
        return arrayList;
    }

    private static final void debugLog(v3.a<String> aVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m785getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i5, long j5, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j6, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z4, int i6) {
        return new MeasuredPage(i5, i6, lazyLayoutMeasureScope.mo717measure0kLqBqw(i5, j5), j6, pagerLazyLayoutItemProvider.getKey(i5), orientation, horizontal, vertical, layoutDirection, z4, null);
    }

    @p4.l
    /* renamed from: measurePager-_JDW0YA, reason: not valid java name */
    public static final PagerMeasureResult m786measurePager_JDW0YA(@p4.l LazyLayoutMeasureScope lazyLayoutMeasureScope, int i5, @p4.l PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i6, int i7, int i8, int i9, int i10, int i11, long j5, @p4.l Orientation orientation, @m Alignment.Vertical vertical, @m Alignment.Horizontal horizontal, boolean z4, long j6, int i12, int i13, @p4.l List<Integer> list, @p4.l SnapPositionInLayout snapPositionInLayout, @p4.l MutableState<r2> mutableState, @p4.l q<? super Integer, ? super Integer, ? super l<? super Placeable.PlacementScope, r2>, ? extends MeasureResult> qVar) {
        int u4;
        int i14;
        int i15;
        int u5;
        boolean z5;
        int i16;
        int i17;
        int i18;
        int i19;
        int G;
        long j7;
        int i20;
        List<MeasuredPage> list2;
        int i21;
        int i22;
        int i23;
        List E;
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i8 >= 0) {
            u4 = u.u(i12 + i9, 0);
            if (i5 <= 0) {
                E = w.E();
                return new PagerMeasureResult(E, i12, i9, i8, orientation, -i7, i6 + i8, false, i13, null, null, 0.0f, 0, false, qVar.invoke(Integer.valueOf(Constraints.m6002getMinWidthimpl(j5)), Integer.valueOf(Constraints.m6001getMinHeightimpl(j5)), PagerMeasureKt$measurePager$4.INSTANCE), false);
            }
            Orientation orientation2 = Orientation.Vertical;
            long Constraints$default = ConstraintsKt.Constraints$default(0, orientation == orientation2 ? Constraints.m6000getMaxWidthimpl(j5) : i12, 0, orientation != orientation2 ? Constraints.m5999getMaxHeightimpl(j5) : i12, 5, null);
            int i24 = i10;
            int i25 = i11;
            while (i24 > 0 && i25 > 0) {
                i24--;
                i25 -= u4;
            }
            int i26 = i25 * (-1);
            if (i24 >= i5) {
                i24 = i5 - 1;
                i26 = 0;
            }
            k kVar = new k();
            int i27 = -i7;
            if (i9 < 0) {
                i15 = i9;
                i14 = i24;
            } else {
                i14 = i24;
                i15 = 0;
            }
            int i28 = i27 + i15;
            int i29 = 0;
            int i30 = i26 + i28;
            int i31 = i14;
            while (i30 < 0 && i31 > 0) {
                int i32 = i31 - 1;
                MeasuredPage m785getAndMeasureSGf7dI0 = m785getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i32, Constraints$default, pagerLazyLayoutItemProvider, j6, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z4, i12);
                kVar.add(0, m785getAndMeasureSGf7dI0);
                i29 = Math.max(i29, m785getAndMeasureSGf7dI0.getCrossAxisSize());
                i30 += u4;
                i31 = i32;
            }
            if (i30 < i28) {
                i30 = i28;
            }
            int i33 = i30 - i28;
            int i34 = i6 + i8;
            int i35 = i31;
            u5 = u.u(i34, 0);
            int i36 = i35;
            boolean z6 = false;
            int i37 = -i33;
            int i38 = 0;
            while (i38 < kVar.size()) {
                if (i37 >= u5) {
                    kVar.remove(i38);
                    z6 = true;
                } else {
                    i36++;
                    i37 += u4;
                    i38++;
                }
            }
            boolean z7 = z6;
            int i39 = i36;
            int i40 = i33;
            while (i39 < i5 && (i37 < u5 || i37 <= 0 || kVar.isEmpty())) {
                int i41 = u5;
                MeasuredPage m785getAndMeasureSGf7dI02 = m785getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i39, Constraints$default, pagerLazyLayoutItemProvider, j6, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z4, i12);
                int i42 = i5 - 1;
                i37 += i39 == i42 ? i12 : u4;
                if (i37 > i28 || i39 == i42) {
                    i29 = Math.max(i29, m785getAndMeasureSGf7dI02.getCrossAxisSize());
                    kVar.add(m785getAndMeasureSGf7dI02);
                    i23 = i35;
                } else {
                    i23 = i39 + 1;
                    i40 -= u4;
                    z7 = true;
                }
                i39++;
                i35 = i23;
                u5 = i41;
            }
            if (i37 < i6) {
                int i43 = i6 - i37;
                i40 -= i43;
                i37 += i43;
                i16 = i35;
                while (i40 < i7 && i16 > 0) {
                    i16--;
                    MeasuredPage m785getAndMeasureSGf7dI03 = m785getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i16, Constraints$default, pagerLazyLayoutItemProvider, j6, orientation, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z4, i12);
                    kVar.add(0, m785getAndMeasureSGf7dI03);
                    i29 = Math.max(i29, m785getAndMeasureSGf7dI03.getCrossAxisSize());
                    i40 += u4;
                }
                z5 = false;
                if (i40 < 0) {
                    i37 += i40;
                    i40 = 0;
                }
            } else {
                z5 = false;
                i16 = i35;
            }
            int i44 = i29;
            int i45 = i37;
            if (i40 >= 0 ? true : z5) {
                int i46 = -i40;
                MeasuredPage measuredPage = (MeasuredPage) kVar.first();
                if (i7 > 0 || i9 < 0) {
                    int size = kVar.size();
                    i17 = i44;
                    int i47 = i40;
                    int i48 = 0;
                    while (i48 < size && i47 != 0 && u4 <= i47) {
                        i18 = i46;
                        G = w.G(kVar);
                        if (i48 == G) {
                            break;
                        }
                        i47 -= u4;
                        i48++;
                        measuredPage = (MeasuredPage) kVar.get(i48);
                        i46 = i18;
                    }
                    i18 = i46;
                    i19 = i47;
                } else {
                    i19 = i40;
                    i17 = i44;
                    i18 = i46;
                }
                MeasuredPage measuredPage2 = measuredPage;
                List<MeasuredPage> createPagesBeforeList = createPagesBeforeList(i16, i13, list, new PagerMeasureKt$measurePager$extraPagesBefore$1(lazyLayoutMeasureScope, Constraints$default, pagerLazyLayoutItemProvider, j6, orientation, horizontal, vertical, z4, i12));
                int i49 = i17;
                int i50 = 0;
                for (int size2 = createPagesBeforeList.size(); i50 < size2; size2 = size2) {
                    i49 = Math.max(i49, createPagesBeforeList.get(i50).getCrossAxisSize());
                    i50++;
                }
                List<MeasuredPage> createPagesAfterList = createPagesAfterList(((MeasuredPage) kVar.last()).getIndex(), i5, i13, list, new PagerMeasureKt$measurePager$extraPagesAfter$1(lazyLayoutMeasureScope, Constraints$default, pagerLazyLayoutItemProvider, j6, orientation, horizontal, vertical, z4, i12));
                int size3 = createPagesAfterList.size();
                for (int i51 = 0; i51 < size3; i51++) {
                    i49 = Math.max(i49, createPagesAfterList.get(i51).getCrossAxisSize());
                }
                boolean z8 = l0.g(measuredPage2, kVar.first()) && createPagesBeforeList.isEmpty() && createPagesAfterList.isEmpty();
                Orientation orientation3 = Orientation.Vertical;
                if (orientation == orientation3) {
                    j7 = j5;
                    i20 = i49;
                } else {
                    j7 = j5;
                    i20 = i49;
                    i49 = i45;
                }
                int m6014constrainWidthK40F9xA = ConstraintsKt.m6014constrainWidthK40F9xA(j7, i49);
                int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(j7, orientation == orientation3 ? i45 : i20);
                int i52 = i39;
                List<MeasuredPage> calculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, kVar, createPagesBeforeList, createPagesAfterList, m6014constrainWidthK40F9xA, m6013constrainHeightK40F9xA, i45, i6, i18, orientation, z4, lazyLayoutMeasureScope, i9, i12);
                if (z8) {
                    list2 = calculatePagesOffsets;
                } else {
                    ArrayList arrayList = new ArrayList(calculatePagesOffsets.size());
                    int size4 = calculatePagesOffsets.size();
                    for (int i53 = 0; i53 < size4; i53++) {
                        MeasuredPage measuredPage3 = calculatePagesOffsets.get(i53);
                        MeasuredPage measuredPage4 = measuredPage3;
                        if (measuredPage4.getIndex() >= ((MeasuredPage) kVar.first()).getIndex() && measuredPage4.getIndex() <= ((MeasuredPage) kVar.last()).getIndex()) {
                            arrayList.add(measuredPage3);
                        }
                    }
                    list2 = arrayList;
                }
                MeasuredPage calculateNewCurrentPage = calculateNewCurrentPage(orientation == Orientation.Vertical ? m6013constrainHeightK40F9xA : m6014constrainWidthK40F9xA, list2, i7, i8, u4, snapPositionInLayout);
                if (calculateNewCurrentPage != null) {
                    i22 = calculateNewCurrentPage.getOffset();
                    i21 = u4;
                } else {
                    i21 = u4;
                    i22 = 0;
                }
                return new PagerMeasureResult(list2, i12, i9, i8, orientation, i27, i34, z4, i13, measuredPage2, calculateNewCurrentPage, i21 == 0 ? 0.0f : u.H((-i22) / i21, -0.5f, 0.5f), i19, i52 < i5 || i45 > i6, qVar.invoke(Integer.valueOf(m6014constrainWidthK40F9xA), Integer.valueOf(m6013constrainHeightK40F9xA), new PagerMeasureKt$measurePager$9(calculatePagesOffsets, mutableState)), z7);
            }
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
        }
        throw new IllegalArgumentException("negative afterContentPadding".toString());
    }
}
