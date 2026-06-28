package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001ax\u0010\"\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "slots", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/r2;", "Lkotlin/u;", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lv3/l;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProviderLambda", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "rememberLazyGridMeasurePolicy", "(Lv3/a;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/s0;Landroidx/compose/runtime/Composer;I)Lv3/p;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,376:1\n154#2:377\n487#3,4:378\n491#3,2:386\n495#3:392\n25#4:382\n83#4,3:395\n1116#5,3:383\n1119#5,3:389\n1116#5,6:398\n487#6:388\n74#7:393\n74#7:394\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n63#1:377\n85#1:378,4\n85#1:386,2\n85#1:392\n85#1:382\n168#1:395,3\n85#1:383,3\n85#1:389,3\n168#1:398,6\n85#1:388\n117#1:393\n125#1:394\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LazyGrid(@p4.m androidx.compose.ui.Modifier r30, @p4.l androidx.compose.foundation.lazy.grid.LazyGridState r31, @p4.l androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider r32, @p4.m androidx.compose.foundation.layout.PaddingValues r33, boolean r34, boolean r35, @p4.m androidx.compose.foundation.gestures.FlingBehavior r36, boolean r37, @p4.l androidx.compose.foundation.layout.Arrangement.Vertical r38, @p4.l androidx.compose.foundation.layout.Arrangement.Horizontal r39, @p4.l v3.l<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.r2> r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, v3.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    private static final p<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(a<? extends LazyGridItemProvider> aVar, LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z4, boolean z5, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, s0 s0Var, Composer composer, int i5) {
        composer.startReplaceableGroup(-2068958445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2068958445, i5, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:167)");
        }
        Object[] objArr = {lazyGridState, lazyGridSlotsProvider, paddingValues, Boolean.valueOf(z4), Boolean.valueOf(z5), horizontal, vertical};
        composer.startReplaceableGroup(-568225417);
        boolean z6 = false;
        for (int i6 = 0; i6 < 7; i6++) {
            z6 |= composer.changed(objArr[i6]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyGridKt$rememberLazyGridMeasurePolicy$1$1(z5, paddingValues, z4, aVar, lazyGridSlotsProvider, lazyGridState, vertical, horizontal, s0Var);
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
