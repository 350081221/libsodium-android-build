package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.w;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000W\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001 \u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0082\b\u001a\u0014\u0010\u0011\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\"\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\" \u0010\u001a\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\" \u0010$\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u001e\u00101\u001a\u00020\u0000*\u00020,8BX\u0082\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "Lkotlin/r2;", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/d;)Ljava/lang/Object;", "animateToPreviousPage", "", "generateMsg", "debugLog", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "calculateNewMaxScrollOffset", "Landroidx/compose/ui/unit/Dp;", "DefaultPositionThreshold", "F", "getDefaultPositionThreshold", "()F", "MaxPagesForAnimateScroll", "I", "PagesToPrefetch", "EmptyLayoutInfo", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo$annotations", "()V", "androidx/compose/foundation/pager/PagerStateKt$UnitDensity$1", "UnitDensity", "Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "SnapAlignmentStartToStart", "Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart", "()Landroidx/compose/foundation/gestures/snapping/SnapPositionInLayout;", "getSnapAlignmentStartToStart$annotations", "", "DEBUG", "Z", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getSingleAxisViewPort", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)I", "getSingleAxisViewPort$annotations", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V", "singleAxisViewPort", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,787:1\n1116#2,6:788\n154#3:794\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n81#1:788,6\n729#1:794\n*E\n"})
/* loaded from: classes.dex */
public final class PagerStateKt {
    private static final boolean DEBUG = false;
    private static final float DefaultPositionThreshold = Dp.m6044constructorimpl(56);

    @l
    private static final PagerMeasureResult EmptyLayoutInfo;
    private static final int MaxPagesForAnimateScroll = 3;
    public static final int PagesToPrefetch = 1;

    @l
    private static final SnapPositionInLayout SnapAlignmentStartToStart;

    @l
    private static final PagerStateKt$UnitDensity$1 UnitDensity;

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1] */
    static {
        List E;
        E = w.E();
        EmptyLayoutInfo = new PagerMeasureResult(E, 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, new MeasureResult() { // from class: androidx.compose.foundation.pager.PagerStateKt$EmptyLayoutInfo$1

            @l
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final int width;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                Map<AlignmentLine, Integer> z4;
                z4 = a1.z();
                this.alignmentLines = z4;
            }

            public static /* synthetic */ void getAlignmentLines$annotations() {
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @l
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        }, false);
        UnitDensity = new Density() { // from class: androidx.compose.foundation.pager.PagerStateKt$UnitDensity$1
            private final float density = 1.0f;
            private final float fontScale = 1.0f;

            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.density;
            }

            @Override // androidx.compose.ui.unit.FontScaling
            public float getFontScale() {
                return this.fontScale;
            }
        };
        SnapAlignmentStartToStart = new SnapPositionInLayout() { // from class: androidx.compose.foundation.pager.a
            @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
            public final int position(int i5, int i6, int i7, int i8, int i9) {
                int SnapAlignmentStartToStart$lambda$2;
                SnapAlignmentStartToStart$lambda$2 = PagerStateKt.SnapAlignmentStartToStart$lambda$2(i5, i6, i7, i8, i9);
                return SnapAlignmentStartToStart$lambda$2;
            }
        };
    }

    public static final int SnapAlignmentStartToStart$lambda$2(int i5, int i6, int i7, int i8, int i9) {
        return 0;
    }

    @m
    public static final Object animateToNextPage(@l PagerState pagerState, @l d<? super r2> dVar) {
        Object l5;
        if (pagerState.getCurrentPage() + 1 < pagerState.getPageCount()) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() + 1, 0.0f, null, dVar, 6, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (animateScrollToPage$default == l5) {
                return animateScrollToPage$default;
            }
            return r2.f19517a;
        }
        return r2.f19517a;
    }

    @m
    public static final Object animateToPreviousPage(@l PagerState pagerState, @l d<? super r2> dVar) {
        Object l5;
        if (pagerState.getCurrentPage() - 1 >= 0) {
            Object animateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, pagerState.getCurrentPage() - 1, 0.0f, null, dVar, 6, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (animateScrollToPage$default == l5) {
                return animateScrollToPage$default;
            }
            return r2.f19517a;
        }
        return r2.f19517a;
    }

    public static final int calculateNewMaxScrollOffset(PagerMeasureResult pagerMeasureResult, int i5) {
        int u4;
        u4 = u.u((((pagerMeasureResult.getBeforeContentPadding() + (i5 * (pagerMeasureResult.getPageSpacing() + pagerMeasureResult.getPageSize()))) + pagerMeasureResult.getAfterContentPadding()) - pagerMeasureResult.getPageSpacing()) - getSingleAxisViewPort(pagerMeasureResult), 0);
        return u4;
    }

    private static final void debugLog(v3.a<String> aVar) {
    }

    public static final float getDefaultPositionThreshold() {
        return DefaultPositionThreshold;
    }

    @l
    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return EmptyLayoutInfo;
    }

    public static /* synthetic */ void getEmptyLayoutInfo$annotations() {
    }

    private static final int getSingleAxisViewPort(PagerLayoutInfo pagerLayoutInfo) {
        return pagerLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m6213getHeightimpl(pagerLayoutInfo.mo783getViewportSizeYbymL2g()) : IntSize.m6214getWidthimpl(pagerLayoutInfo.mo783getViewportSizeYbymL2g());
    }

    private static /* synthetic */ void getSingleAxisViewPort$annotations(PagerLayoutInfo pagerLayoutInfo) {
    }

    @l
    public static final SnapPositionInLayout getSnapAlignmentStartToStart() {
        return SnapAlignmentStartToStart;
    }

    public static /* synthetic */ void getSnapAlignmentStartToStart$annotations() {
    }

    @l
    @Composable
    @ExperimentalFoundationApi
    public static final PagerState rememberPagerState(int i5, float f5, @l v3.a<Integer> aVar, @m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(-1210768637);
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            f5 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1210768637, i6, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:79)");
        }
        Object[] objArr = new Object[0];
        Saver<PagerStateImpl, ?> saver = PagerStateImpl.Companion.getSaver();
        composer.startReplaceableGroup(-382513842);
        boolean changed = composer.changed(i5) | composer.changed(f5) | composer.changedInstance(aVar);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerStateKt$rememberPagerState$1$1(i5, f5, aVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerStateImpl pagerStateImpl = (PagerStateImpl) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (v3.a) rememberedValue, composer, 72, 4);
        pagerStateImpl.getPageCountState().setValue(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerStateImpl;
    }
}
