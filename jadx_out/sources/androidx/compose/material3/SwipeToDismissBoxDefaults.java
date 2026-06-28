package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR,\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\u00028G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxDefaults;", "", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "totalDistance", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lv3/l;", "positionalThreshold", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,480:1\n74#2:481\n1116#3,6:482\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n*L\n326#1:481\n327#1:482,6\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeToDismissBoxDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final SwipeToDismissBoxDefaults INSTANCE = new SwipeToDismissBoxDefaults();

    private SwipeToDismissBoxDefaults() {
    }

    @p4.l
    @u3.h(name = "getPositionalThreshold")
    @Composable
    public final v3.l<Float, Float> getPositionalThreshold(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1545861529);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1545861529, i5, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:325)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(308181361);
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SwipeToDismissBoxDefaults$positionalThreshold$1$1$1(density);
            composer.updateRememberedValue(rememberedValue);
        }
        v3.l<Float, Float> lVar = (v3.l) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lVar;
    }
}
