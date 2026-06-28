package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u001a#\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "", "consumeScrollDelta", "Landroidx/compose/foundation/gestures/ScrollableState;", "ScrollableState", "rememberScrollableState", "(Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/ScrollableState;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nScrollableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,195:1\n25#2:196\n1116#3,6:197\n*S KotlinDebug\n*F\n+ 1 ScrollableState.kt\nandroidx/compose/foundation/gestures/ScrollableStateKt\n*L\n146#1:196\n146#1:197,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableStateKt {
    @l
    public static final ScrollableState ScrollableState(@l v3.l<? super Float, Float> lVar) {
        return new DefaultScrollableState(lVar);
    }

    @l
    @Composable
    public static final ScrollableState rememberScrollableState(@l v3.l<? super Float, Float> lVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-180460798);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180460798, i5, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i5 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = ScrollableState(new ScrollableStateKt$rememberScrollableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollableState scrollableState = (ScrollableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollableState;
    }
}
