package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a6\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002\u001a2\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\u0011"}, d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "horizontalScroll", "Landroidx/compose/ui/Modifier;", "state", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "scroll", "isScrollable", "isVertical", "verticalScroll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,459:1\n1116#2,6:460\n135#3:466\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n75#1:460,6\n325#1:466\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollKt {
    @p4.l
    public static final Modifier horizontalScroll(@p4.l Modifier modifier, @p4.l ScrollState scrollState, boolean z4, @p4.m FlingBehavior flingBehavior, boolean z5) {
        return scroll(modifier, scrollState, z5, flingBehavior, z4, false);
    }

    public static /* synthetic */ Modifier horizontalScroll$default(Modifier modifier, ScrollState scrollState, boolean z4, FlingBehavior flingBehavior, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i5 & 8) != 0) {
            z5 = false;
        }
        return horizontalScroll(modifier, scrollState, z4, flingBehavior, z5);
    }

    @p4.l
    @Composable
    public static final ScrollState rememberScrollState(int i5, @p4.m Composer composer, int i6, int i7) {
        composer.startReplaceableGroup(-1464256199);
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464256199, i6, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:73)");
        }
        Object[] objArr = new Object[0];
        Saver<ScrollState, ?> saver = ScrollState.Companion.getSaver();
        composer.startReplaceableGroup(-699453458);
        boolean changed = composer.changed(i5);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ScrollKt$rememberScrollState$1$1(i5);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollState scrollState = (ScrollState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) saver, (String) null, (v3.a) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollState;
    }

    private static final Modifier scroll(Modifier modifier, ScrollState scrollState, boolean z4, FlingBehavior flingBehavior, boolean z5, boolean z6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ScrollKt$scroll$$inlined$debugInspectorInfo$1(scrollState, z4, flingBehavior, z5, z6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new ScrollKt$scroll$2(z6, z4, scrollState, z5, flingBehavior));
    }

    @p4.l
    public static final Modifier verticalScroll(@p4.l Modifier modifier, @p4.l ScrollState scrollState, boolean z4, @p4.m FlingBehavior flingBehavior, boolean z5) {
        return scroll(modifier, scrollState, z5, flingBehavior, z4, true);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z4, FlingBehavior flingBehavior, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        if ((i5 & 4) != 0) {
            flingBehavior = null;
        }
        if ((i5 & 8) != 0) {
            z5 = false;
        }
        return verticalScroll(modifier, scrollState, z4, flingBehavior, z5);
    }
}
