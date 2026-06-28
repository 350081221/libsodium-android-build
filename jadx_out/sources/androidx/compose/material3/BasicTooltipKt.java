package androidx.compose.material3;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001\u001a+\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"BasicTooltipState", "Landroidx/compose/material3/BasicTooltipState;", "initialIsVisible", "", "isPersistent", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "rememberBasicTooltipState", "(ZZLandroidx/compose/foundation/MutatorMutex;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BasicTooltipState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,248:1\n1116#2,6:249\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/BasicTooltipKt\n*L\n88#1:249,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    @Stable
    @p4.l
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
    public static final BasicTooltipState rememberBasicTooltipState(boolean z4, boolean z5, @p4.m MutatorMutex mutatorMutex, @p4.m Composer composer, int i5, int i6) {
        boolean z6;
        composer.startReplaceableGroup(-1386430812);
        boolean z7 = false;
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
            ComposerKt.traceEventStart(-1386430812, i5, -1, "androidx.compose.material3.rememberBasicTooltipState (BasicTooltip.kt:87)");
        }
        composer.startReplaceableGroup(-459690368);
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(z5)) || (i5 & 48) == 32) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((((i5 & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i5 & 384) == 256) {
            z7 = true;
        }
        boolean z8 = z6 | z7;
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTooltipStateImpl(z4, z5, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return basicTooltipStateImpl;
    }
}
