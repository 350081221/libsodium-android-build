package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0089\u0001\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "slots", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/r2;", "Lkotlin/u;", "content", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLv3/l;Landroidx/compose/runtime/Composer;III)V", "LazyStaggeredGrid", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,125:1\n154#2:126\n154#2:127\n154#2:128\n487#3,4:129\n491#3,2:137\n495#3:143\n25#4:133\n1116#5,3:134\n1119#5,3:140\n487#6:139\n74#7:144\n74#7:145\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n49#1:126\n57#1:127\n59#1:128\n66#1:129,4\n66#1:137,2\n66#1:143\n66#1:133\n66#1:134,3\n66#1:140,3\n66#1:139\n96#1:144\n104#1:145\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m745LazyStaggeredGridLJWHXA8(@l LazyStaggeredGridState lazyStaggeredGridState, @l Orientation orientation, @l LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, @m Modifier modifier, @m PaddingValues paddingValues, boolean z4, @m FlingBehavior flingBehavior, boolean z5, float f5, float f6, @l v3.l<? super LazyStaggeredGridScope, r2> lVar, @m Composer composer, int i5, int i6, int i7) {
        FlingBehavior flingBehavior2;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(288295126);
        Modifier modifier2 = (i7 & 8) != 0 ? Modifier.Companion : modifier;
        PaddingValues m546PaddingValues0680j_4 = (i7 & 16) != 0 ? PaddingKt.m546PaddingValues0680j_4(Dp.m6044constructorimpl(0)) : paddingValues;
        boolean z6 = (i7 & 32) != 0 ? false : z4;
        if ((i7 & 64) != 0) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
            i8 = i5 & (-3670017);
        } else {
            flingBehavior2 = flingBehavior;
            i8 = i5;
        }
        boolean z7 = (i7 & 128) != 0 ? true : z5;
        float m6044constructorimpl = (i7 & 256) != 0 ? Dp.m6044constructorimpl(0) : f5;
        float m6044constructorimpl2 = (i7 & 512) != 0 ? Dp.m6044constructorimpl(0) : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288295126, i8, i6, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:61)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(startRestartGroup, 6);
        a<LazyStaggeredGridItemProvider> rememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState, lVar, startRestartGroup, ((i6 << 3) & 112) | 8);
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, startRestartGroup));
            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        startRestartGroup.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        int i9 = i8 >> 6;
        int i10 = i9 & 7168;
        int i11 = i8 >> 9;
        int i12 = i8;
        boolean z8 = z6;
        Modifier modifier3 = modifier2;
        LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, ScrollableKt.scrollable$default(OverscrollKt.overscroll(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier$foundation_release()).then(lazyStaggeredGridState.getAwaitLayoutModifier$foundation_release()), rememberStaggeredGridItemProviderLambda, LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z8, startRestartGroup, ((i12 >> 12) & 112) | 8), orientation, z7, z8, startRestartGroup, ((i12 << 6) & 7168) | (i11 & 57344) | (i12 & 458752)), orientation), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState, startRestartGroup, 8), lazyStaggeredGridState.getBeyondBoundsInfo$foundation_release(), z8, (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z7, startRestartGroup, (MutableVector.$stable << 6) | i10 | ((i12 << 12) & 458752) | ((i12 >> 3) & 3670016)), overscrollEffect), lazyStaggeredGridState, orientation, overscrollEffect, z7, scrollableDefaults.reverseDirection((LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z8), flingBehavior2, lazyStaggeredGridState.getMutableInteractionSource$foundation_release(), null, 128, null), lazyStaggeredGridState.getPrefetchState$foundation_release(), LazyStaggeredGridMeasurePolicyKt.m755rememberStaggeredGridMeasurePolicy1tP8Re8(lazyStaggeredGridState, rememberStaggeredGridItemProviderLambda, m546PaddingValues0680j_4, z6, orientation, m6044constructorimpl, m6044constructorimpl2, coroutineScope, lazyGridStaggeredGridSlotsProvider, startRestartGroup, (i9 & 896) | 16777224 | i10 | ((i8 << 9) & 57344) | (i11 & 458752) | (i11 & 3670016) | ((i8 << 18) & 234881024)), startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridKt$LazyStaggeredGrid$1(lazyStaggeredGridState, orientation, lazyGridStaggeredGridSlotsProvider, modifier3, m546PaddingValues0680j_4, z8, flingBehavior2, z7, m6044constructorimpl, m6044constructorimpl2, lVar, i5, i6, i7));
        }
    }
}
