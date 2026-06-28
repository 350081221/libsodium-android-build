package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberPagerBeyondBoundsState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "beyondBoundsPageCount", "", "(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPagerBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,55:1\n50#2:56\n49#2:57\n1116#3,6:58\n*S KotlinDebug\n*F\n+ 1 PagerBeyondBoundsModifier.kt\nandroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt\n*L\n29#1:56\n29#1:57\n29#1:58,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerBeyondBoundsModifierKt {
    @l
    @Composable
    public static final LazyLayoutBeyondBoundsState rememberPagerBeyondBoundsState(@l PagerState pagerState, int i5, @m Composer composer, int i6) {
        composer.startReplaceableGroup(373558254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(373558254, i6, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:27)");
        }
        Integer valueOf = Integer.valueOf(i5);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(pagerState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PagerBeyondBoundsState(pagerState, i5);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PagerBeyondBoundsState pagerBeyondBoundsState = (PagerBeyondBoundsState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pagerBeyondBoundsState;
    }
}
