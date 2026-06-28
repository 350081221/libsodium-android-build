package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/MaterialTheme;", "", "()V", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "getColorScheme", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ColorScheme;", "shapes", "Landroidx/compose/material3/Shapes;", "getShapes", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,139:1\n74#2:140\n74#2:141\n74#2:142\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material3/MaterialTheme\n*L\n87#1:140\n95#1:141\n103#1:142\n*E\n"})
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static final int $stable = 0;

    @p4.l
    public static final MaterialTheme INSTANCE = new MaterialTheme();

    private MaterialTheme() {
    }

    @u3.h(name = "getColorScheme")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public final ColorScheme getColorScheme(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561618718, i5, -1, "androidx.compose.material3.MaterialTheme.<get-colorScheme> (MaterialTheme.kt:86)");
        }
        ColorScheme colorScheme = (ColorScheme) composer.consume(ColorSchemeKt.getLocalColorScheme());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorScheme;
    }

    @u3.h(name = "getShapes")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public final Shapes getShapes(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(419509830, i5, -1, "androidx.compose.material3.MaterialTheme.<get-shapes> (MaterialTheme.kt:102)");
        }
        Shapes shapes = (Shapes) composer.consume(ShapesKt.getLocalShapes());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }

    @u3.h(name = "getTypography")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public final Typography getTypography(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942794935, i5, -1, "androidx.compose.material3.MaterialTheme.<get-typography> (MaterialTheme.kt:94)");
        }
        Typography typography = (Typography) composer.consume(TypographyKt.getLocalTypography());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }
}
