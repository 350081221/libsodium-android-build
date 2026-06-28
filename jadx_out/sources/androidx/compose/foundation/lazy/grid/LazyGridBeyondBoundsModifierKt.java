package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberLazyGridBeyondBoundsState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLazyGridBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,47:1\n36#2:48\n1116#3,6:49\n*S KotlinDebug\n*F\n+ 1 LazyGridBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsModifierKt\n*L\n25#1:48\n25#1:49,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridBeyondBoundsModifierKt {
    @l
    @Composable
    public static final LazyLayoutBeyondBoundsState rememberLazyGridBeyondBoundsState(@l LazyGridState lazyGridState, @m Composer composer, int i5) {
        composer.startReplaceableGroup(2004349821);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2004349821, i5, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyGridBeyondBoundsState(lazyGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyGridBeyondBoundsState lazyGridBeyondBoundsState = (LazyGridBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridBeyondBoundsState;
    }
}
