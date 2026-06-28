package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/SnackbarDefaults;", "", "()V", "actionColor", "Landroidx/compose/ui/graphics/Color;", "getActionColor", "(Landroidx/compose/runtime/Composer;I)J", "actionContentColor", "getActionContentColor", TypedValues.Custom.S_COLOR, "getColor", "contentColor", "getContentColor", "dismissActionContentColor", "getDismissActionContentColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();

    private SnackbarDefaults() {
    }

    @u3.h(name = "getActionColor")
    @Composable
    public final long getActionColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(743425465);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743425465, i5, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionColor> (Snackbar.kt:419)");
        }
        long value = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getActionContentColor")
    @Composable
    public final long getActionContentColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1313141593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1313141593, i5, -1, "androidx.compose.material3.SnackbarDefaults.<get-actionContentColor> (Snackbar.kt:422)");
        }
        long value = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getActionLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getColor")
    @Composable
    public final long getColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(987938253);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(987938253, i5, -1, "androidx.compose.material3.SnackbarDefaults.<get-color> (Snackbar.kt:413)");
        }
        long value = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getContentColor")
    @Composable
    public final long getContentColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1021310823);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1021310823, i5, -1, "androidx.compose.material3.SnackbarDefaults.<get-contentColor> (Snackbar.kt:416)");
        }
        long value = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getDismissActionContentColor")
    @Composable
    public final long getDismissActionContentColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-528602817);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-528602817, i5, -1, "androidx.compose.material3.SnackbarDefaults.<get-dismissActionContentColor> (Snackbar.kt:425)");
        }
        long value = ColorSchemeKt.getValue(SnackbarTokens.INSTANCE.getIconColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-551629101);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-551629101, i5, -1, "androidx.compose.material3.SnackbarDefaults.<get-shape> (Snackbar.kt:410)");
        }
        Shape value = ShapesKt.getValue(SnackbarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }
}
