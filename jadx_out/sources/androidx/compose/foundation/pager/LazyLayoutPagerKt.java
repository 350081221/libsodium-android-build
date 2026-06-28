package androidx.compose.foundation.pager;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayout;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÖ\u0001\u0010(\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d21\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0083\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00020+0)2\u0006\u0010\u0003\u001a\u00020\u000221\u0010%\u001a-\u0012\u0004\u0012\u00020 \u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\"0\u001f¢\u0006\u0002\b#¢\u0006\u0002\b$2#\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0003¢\u0006\u0004\b,\u0010-\u001a\u0014\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "index", "", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "pageContent", "Pager-fs30GE4", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lv3/l;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Lv3/r;Landroidx/compose/runtime/Composer;III)V", "Pager", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "rememberPagerItemProviderLambda", "(Landroidx/compose/foundation/pager/PagerState;Lv3/r;Lv3/l;Lv3/a;Landroidx/compose/runtime/Composer;I)Lv3/a;", "dragDirectionDetector", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,328:1\n154#2:329\n1116#3,6:330\n1116#3,6:336\n1116#3,6:344\n1116#3,6:351\n1116#3,6:362\n50#4:342\n49#4:343\n36#4:350\n83#4,3:359\n74#5:357\n74#5:358\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n83#1:329\n108#1:330,6\n122#1:336,6\n125#1:344,6\n135#1:351,6\n251#1:362,6\n125#1:342\n125#1:343\n135#1:350\n251#1:359,3\n156#1:357\n164#1:358\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Pager-fs30GE4, reason: not valid java name */
    public static final void m776Pagerfs30GE4(@l Modifier modifier, @l PagerState pagerState, @l PaddingValues paddingValues, boolean z4, @l Orientation orientation, @l SnapFlingBehavior snapFlingBehavior, boolean z5, int i5, float f5, @l PageSize pageSize, @l NestedScrollConnection nestedScrollConnection, @m v3.l<? super Integer, ? extends Object> lVar, @l Alignment.Horizontal horizontal, @l Alignment.Vertical vertical, @l r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar, @m Composer composer, int i6, int i7, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-301644943);
        int i9 = (i8 & 128) != 0 ? 0 : i5;
        float m6044constructorimpl = (i8 & 256) != 0 ? Dp.m6044constructorimpl(0) : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-301644943, i6, i7, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:95)");
        }
        if (i9 >= 0) {
            ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
            OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-735094232);
            boolean changed = startRestartGroup.changed(pagerState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LazyLayoutPagerKt$Pager$pagerItemProvider$1$1(pagerState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            int i10 = i6 >> 3;
            int i11 = i10 & 14;
            v3.a<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda = rememberPagerItemProviderLambda(pagerState, rVar, lVar, (v3.a) rememberedValue, startRestartGroup, i11 | ((i7 >> 9) & 112) | ((i7 << 3) & 896));
            SnapPositionInLayout snapAlignmentStartToStart = PagerStateKt.getSnapAlignmentStartToStart();
            startRestartGroup.startReplaceableGroup(-735093678);
            boolean changed2 = startRestartGroup.changed(pagerState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new LazyLayoutPagerKt$Pager$measurePolicy$1$1(pagerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i12 = i6 & 7168;
            int i13 = i6 >> 6;
            int i14 = i7 << 18;
            int i15 = i9;
            p<LazyLayoutMeasureScope, Constraints, MeasureResult> m787rememberPagerMeasurePolicy121YqSk = PagerMeasurePolicyKt.m787rememberPagerMeasurePolicy121YqSk(rememberPagerItemProviderLambda, pagerState, paddingValues, z4, orientation, i9, m6044constructorimpl, pageSize, horizontal, vertical, snapAlignmentStartToStart, (v3.a) rememberedValue2, startRestartGroup, (i6 & 112) | (i6 & 896) | i12 | (i6 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (234881024 & i14) | (i14 & 1879048192), 0);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed3 = startRestartGroup.changed(snapFlingBehavior) | startRestartGroup.changed(pagerState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new PagerWrapperFlingBehavior(snapFlingBehavior, pagerState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) rememberedValue3;
            LazyLayoutSemanticState rememberPagerSemanticState = PagerSemanticsKt.rememberPagerSemanticState(pagerState, z4, orientation == Orientation.Vertical, startRestartGroup, i11 | (i13 & 112));
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed4 = startRestartGroup.changed(pagerState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new PagerBringIntoViewSpec(pagerState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            LazyLayoutKt.LazyLayout(rememberPagerItemProviderLambda, NestedScrollModifierKt.nestedScroll$default(dragDirectionDetector(ScrollableKt.scrollable(OverscrollKt.overscroll(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(pagerState.getRemeasurementModifier$foundation_release()).then(pagerState.getAwaitLayoutModifier$foundation_release()), rememberPagerItemProviderLambda, rememberPagerSemanticState, orientation, z5, z4, startRestartGroup, (i10 & 7168) | (i13 & 57344) | ((i6 << 6) & 458752)), orientation), PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(pagerState, i15, startRestartGroup, i11 | ((i6 >> 18) & 112)), pagerState.getBeyondBoundsInfo$foundation_release(), z4, (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5, startRestartGroup, (MutableVector.$stable << 6) | i12 | ((i6 << 3) & 458752) | (i6 & 3670016)), overscrollEffect), pagerState, orientation, overscrollEffect, z5, scrollableDefaults.reverseDirection((LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z4), pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource$foundation_release(), (PagerBringIntoViewSpec) rememberedValue4), pagerState), nestedScrollConnection, null, 2, null), pagerState.getPrefetchState$foundation_release(), m787rememberPagerMeasurePolicy121YqSk, startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new LazyLayoutPagerKt$Pager$2(modifier, pagerState, paddingValues, z4, orientation, snapFlingBehavior, z5, i15, m6044constructorimpl, pageSize, nestedScrollConnection, lVar, horizontal, vertical, rVar, i6, i7, i8));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("beyondBoundsPageCount should be greater than or equal to 0, you selected " + i9).toString());
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(pagerState, null)));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final v3.a<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(PagerState pagerState, r<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, r2> rVar, v3.l<? super Integer, ? extends Object> lVar, v3.a<Integer> aVar, Composer composer, int i5) {
        composer.startReplaceableGroup(-1372505274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i5, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:247)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rVar, composer, (i5 >> 3) & 14);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i5 >> 6) & 14);
        Object[] objArr = {pagerState, rememberUpdatedState, rememberUpdatedState2, aVar};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i6 = 0; i6 < 4; i6++) {
            z4 |= composer.changed(objArr[i6]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(rememberUpdatedState, rememberUpdatedState2, aVar)), pagerState));
            rememberedValue = new e1(derivedStateOf) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.e1, kotlin.reflect.p
                @m
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        kotlin.reflect.p pVar = (kotlin.reflect.p) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }
}
