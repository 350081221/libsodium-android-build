package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberLazyStaggeredGridBeyondBoundsState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyStaggeredGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n36#2:50\n1116#3,6:51\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsModifierKt\n*L\n27#1:50\n27#1:51,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridBeyondBoundsModifierKt {
    @l
    @Composable
    public static final LazyLayoutBeyondBoundsState rememberLazyStaggeredGridBeyondBoundsState(@l LazyStaggeredGridState lazyStaggeredGridState, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-363070453);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-363070453, i5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridBeyondBoundsState (LazyStaggeredGridBeyondBoundsModifier.kt:25)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyStaggeredGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridBeyondBoundsState lazyStaggeredGridBeyondBoundsState = (LazyStaggeredGridBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridBeyondBoundsState;
    }
}
