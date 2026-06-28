package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/NavigationRailDefaults;", "", "()V", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final NavigationRailDefaults INSTANCE = new NavigationRailDefaults();

    private NavigationRailDefaults() {
    }

    @u3.h(name = "getContainerColor")
    @Composable
    public final long getContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1949394041);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1949394041, i5, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:275)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getWindowInsets")
    @Composable
    public final WindowInsets getWindowInsets(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1546379058);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1546379058, i5, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:282)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m639plusgK_yJZ4(companion.m654getVerticalJoeWqyM(), companion.m652getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }
}
