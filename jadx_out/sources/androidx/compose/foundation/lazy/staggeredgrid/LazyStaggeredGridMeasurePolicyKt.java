package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aw\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0002\b\u00162\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001c\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u000b*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlinx/coroutines/s0;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "slots", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/u;", "rememberStaggeredGridMeasurePolicy-1tP8Re8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lv3/a;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/s0;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/runtime/Composer;I)Lv3/p;", "rememberStaggeredGridMeasurePolicy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "startPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "beforePadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "afterPadding", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,167:1\n83#2,3:168\n1116#3,6:171\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n49#1:168,3\n49#1:171,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float afterPadding(PaddingValues paddingValues, Orientation orientation, boolean z4, LayoutDirection layoutDirection) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                if (z4) {
                    return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
                }
                return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            }
            throw new j0();
        }
        if (z4) {
            return paddingValues.mo506calculateTopPaddingD9Ej5fM();
        }
        return paddingValues.mo503calculateBottomPaddingD9Ej5fM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float beforePadding(PaddingValues paddingValues, Orientation orientation, boolean z4, LayoutDirection layoutDirection) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                if (z4) {
                    return PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
                }
                return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            }
            throw new j0();
        }
        if (z4) {
            return paddingValues.mo503calculateBottomPaddingD9Ej5fM();
        }
        return paddingValues.mo506calculateTopPaddingD9Ej5fM();
    }

    @l
    @Composable
    /* renamed from: rememberStaggeredGridMeasurePolicy-1tP8Re8, reason: not valid java name */
    public static final p<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> m755rememberStaggeredGridMeasurePolicy1tP8Re8(@l LazyStaggeredGridState lazyStaggeredGridState, @l a<? extends LazyStaggeredGridItemProvider> aVar, @l PaddingValues paddingValues, boolean z4, @l Orientation orientation, float f5, float f6, @l s0 s0Var, @l LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-72951591);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-72951591, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:48)");
        }
        Object[] objArr = {lazyStaggeredGridState, aVar, paddingValues, Boolean.valueOf(z4), orientation, Dp.m6042boximpl(f5), Dp.m6042boximpl(f6), lazyGridStaggeredGridSlotsProvider};
        composer.startReplaceableGroup(-568225417);
        boolean z5 = false;
        for (int i6 = 0; i6 < 8; i6++) {
            z5 |= composer.changed(objArr[i6]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(orientation, lazyGridStaggeredGridSlotsProvider, aVar, lazyStaggeredGridState, paddingValues, z4, f5, s0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        p<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> pVar = (p) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float startPadding(PaddingValues paddingValues, Orientation orientation, LayoutDirection layoutDirection) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return paddingValues.mo506calculateTopPaddingD9Ej5fM();
            }
            throw new j0();
        }
        return PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
    }
}
