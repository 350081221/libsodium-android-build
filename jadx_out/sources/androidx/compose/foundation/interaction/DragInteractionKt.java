package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"collectIsDraggedAsState", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/foundation/interaction/InteractionSource;", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDragInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n25#2:96\n1116#3,6:97\n1116#3,6:103\n*S KotlinDebug\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n*L\n81#1:96\n81#1:97,6\n82#1:103,6\n*E\n"})
/* loaded from: classes.dex */
public final class DragInteractionKt {
    @l
    @Composable
    public static final State<Boolean> collectIsDraggedAsState(@l InteractionSource interactionSource, @m Composer composer, int i5) {
        composer.startReplaceableGroup(101276833);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(101276833, i5, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:79)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(2064727497);
        boolean changed = composer.changed(interactionSource) | composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DragInteractionKt$collectIsDraggedAsState$1$1(interactionSource, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (p<? super s0, ? super d<? super r2>, ? extends Object>) rememberedValue2, composer, (i5 & 14) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
