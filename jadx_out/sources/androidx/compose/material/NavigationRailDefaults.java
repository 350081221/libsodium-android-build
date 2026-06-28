package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material/NavigationRailDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,474:1\n154#2:475\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material/NavigationRailDefaults\n*L\n269#1:475\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailDefaults {
    public static final int $stable = 0;

    @l
    public static final NavigationRailDefaults INSTANCE = new NavigationRailDefaults();
    private static final float Elevation = Dp.m6044constructorimpl(8);

    private NavigationRailDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1382getElevationD9Ej5fM() {
        return Elevation;
    }

    @l
    @h(name = "getWindowInsets")
    @Composable
    public final WindowInsets getWindowInsets(@m Composer composer, int i5) {
        composer.startReplaceableGroup(840451581);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840451581, i5, -1, "androidx.compose.material.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:275)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m639plusgK_yJZ4(companion.m654getVerticalJoeWqyM(), companion.m652getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }
}
