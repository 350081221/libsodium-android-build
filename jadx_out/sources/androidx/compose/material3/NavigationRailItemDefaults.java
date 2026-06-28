package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "()V", "defaultNavigationRailItemColors", "Landroidx/compose/material3/NavigationRailItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationRailItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationRailItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    @p4.l
    @Composable
    public final NavigationRailItemColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-2014332261);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014332261, i5, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:293)");
        }
        NavigationRailItemColors defaultNavigationRailItemColors$material3_release = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultNavigationRailItemColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationRailItemColors m2045colors69fazGs(long j5, long j6, long j7, long j8, long j9, long j10, long j11, @p4.m Composer composer, int i5, int i6) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        composer.startReplaceableGroup(-2104358508);
        if ((i6 & 1) != 0) {
            j12 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6);
        } else {
            j12 = j5;
        }
        if ((i6 & 2) != 0) {
            j13 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        } else {
            j13 = j6;
        }
        if ((i6 & 4) != 0) {
            j14 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        } else {
            j14 = j7;
        }
        if ((i6 & 8) != 0) {
            j15 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        } else {
            j15 = j8;
        }
        if ((i6 & 16) != 0) {
            j16 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        } else {
            j16 = j9;
        }
        if ((i6 & 32) != 0) {
            j17 = Color.m3733copywmQWz5c$default(j15, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j17 = j10;
        }
        if ((i6 & 64) != 0) {
            j18 = Color.m3733copywmQWz5c$default(j16, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j18 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2104358508, i5, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:317)");
        }
        NavigationRailItemColors m2036copy4JmcsL4 = getDefaultNavigationRailItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2036copy4JmcsL4(j12, j13, j14, j15, j16, j17, j18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2036copy4JmcsL4;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationRailItemColors m2046colorszjMxDiM(long j5, long j6, long j7, long j8, long j9, Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(1621601574);
        if ((i6 & 1) != 0) {
            j10 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIconColor(), composer, 6);
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = ColorSchemeKt.getValue(NavigationRailTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, i5, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:355)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(j10, j11, j12, j13, j14, Color.m3733copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(j14, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationRailItemColors;
    }

    @p4.l
    public final NavigationRailItemColors getDefaultNavigationRailItemColors$material3_release(@p4.l ColorScheme colorScheme) {
        NavigationRailItemColors defaultNavigationRailItemColorsCached$material3_release = colorScheme.getDefaultNavigationRailItemColorsCached$material3_release();
        if (defaultNavigationRailItemColorsCached$material3_release == null) {
            NavigationRailTokens navigationRailTokens = NavigationRailTokens.INSTANCE;
            NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationRailTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultNavigationRailItemColorsCached$material3_release(navigationRailItemColors);
            return navigationRailItemColors;
        }
        return defaultNavigationRailItemColorsCached$material3_release;
    }
}
