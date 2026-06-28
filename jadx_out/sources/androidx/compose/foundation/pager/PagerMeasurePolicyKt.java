package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0099\u0001\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0018¢\u0006\u0002\b\u001c2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010#\u001a\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0000H\u0082\b\u001a\u0014\u0010%\u001a\u00020\u000b*\u00020\u00032\u0006\u0010$\u001a\u00020\u000bH\u0000\"\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "snapPositionInLayout", "pageCount", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "rememberPagerMeasurePolicy-121YqSk", "(Lv3/a;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;Lv3/a;Landroidx/compose/runtime/Composer;II)Lv3/p;", "rememberPagerMeasurePolicy", "", "generateMsg", "Lkotlin/r2;", "debugLog", "pageSizeWithSpacing", "calculateCurrentPageLayoutOffset", "DEBUG", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,221:1\n195#1,4:240\n83#2,3:222\n1116#3,6:225\n116#4,2:231\n33#4,6:233\n118#4:239\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n213#1:240,4\n57#1:222,3\n57#1:225,6\n203#1:231,2\n203#1:233,6\n203#1:239\n*E\n"})
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt {
    private static final boolean DEBUG = false;

    public static final int calculateCurrentPageLayoutOffset(@l PagerState pagerState, int i5) {
        PageInfo pageInfo;
        float f5;
        int L0;
        boolean z4;
        List<PageInfo> visiblePagesInfo = pagerState.getLayoutInfo().getVisiblePagesInfo();
        int size = visiblePagesInfo.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                pageInfo = visiblePagesInfo.get(i7);
                if (pageInfo.getIndex() == pagerState.getCurrentPage()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    break;
                }
                i7++;
            } else {
                pageInfo = null;
                break;
            }
        }
        PageInfo pageInfo2 = pageInfo;
        if (pageInfo2 != null) {
            i6 = pageInfo2.getOffset();
        }
        if (i5 == 0) {
            f5 = pagerState.getCurrentPageOffsetFraction();
        } else {
            f5 = (-i6) / i5;
        }
        L0 = d.L0(((pagerState.getCurrentPageOffsetFraction() - f5) * i5) - i6);
        return -L0;
    }

    private static final void debugLog(v3.a<String> aVar) {
    }

    @l
    @Composable
    /* renamed from: rememberPagerMeasurePolicy-121YqSk, reason: not valid java name */
    public static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> m787rememberPagerMeasurePolicy121YqSk(@l v3.a<PagerLazyLayoutItemProvider> aVar, @l PagerState pagerState, @l PaddingValues paddingValues, boolean z4, @l Orientation orientation, int i5, float f5, @l PageSize pageSize, @m Alignment.Horizontal horizontal, @m Alignment.Vertical vertical, @l SnapPositionInLayout snapPositionInLayout, @l v3.a<Integer> aVar2, @m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(-1615726010);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1615726010, i6, i7, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        Object[] objArr = {pagerState, paddingValues, Boolean.valueOf(z4), orientation, horizontal, vertical, Dp.m6042boximpl(f5), pageSize, snapPositionInLayout, aVar2};
        composer.startReplaceableGroup(-568225417);
        boolean z5 = false;
        for (int i8 = 0; i8 < 10; i8++) {
            z5 |= composer.changed(objArr[i8]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(orientation, paddingValues, z4, pagerState, f5, pageSize, aVar, aVar2, vertical, horizontal, i5, snapPositionInLayout);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar = (p) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }
}
