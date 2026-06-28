package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a+\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BasicTooltipState", "Landroidx/compose/foundation/BasicTooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BasicTooltipState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,246:1\n50#2:247\n49#2:248\n1116#3,6:249\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:247\n83#1:248\n83#1:249,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    @Stable
    @p4.l
    @ExperimentalFoundationApi
    public static final BasicTooltipState BasicTooltipState(boolean z4, boolean z5, @p4.l MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z4, z5, mutatorMutex);
    }

    public static /* synthetic */ BasicTooltipState BasicTooltipState$default(boolean z4, boolean z5, MutatorMutex mutatorMutex, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        if ((i5 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z4, z5, mutatorMutex);
    }

    @p4.l
    @Composable
    @ExperimentalFoundationApi
    public static final BasicTooltipState rememberBasicTooltipState(boolean z4, boolean z5, @p4.m MutatorMutex mutatorMutex, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1123859613);
        if ((i6 & 1) != 0) {
            z4 = false;
        }
        if ((i6 & 2) != 0) {
            z5 = true;
        }
        if ((i6 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123859613, i5, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:82)");
        }
        Boolean valueOf = Boolean.valueOf(z5);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(mutatorMutex);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTooltipStateImpl(z4, z5, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return basicTooltipStateImpl;
    }
}
