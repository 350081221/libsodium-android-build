package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\tJD\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NavigationBarItemDefaults;", "", "()V", "defaultNavigationBarItemColors", "Landroidx/compose/material3/NavigationBarItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationBarItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationBarItemColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationBarItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationBarItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    @p4.l
    @Composable
    public final NavigationBarItemColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1018883954);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i5, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:297)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3_release = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultNavigationBarItemColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m2016colors69fazGs(long j5, long j6, long j7, long j8, long j9, long j10, long j11, @p4.m Composer composer, int i5, int i6) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        composer.startReplaceableGroup(-1618564327);
        if ((i6 & 1) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j5;
        }
        if ((i6 & 2) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j6;
        }
        if ((i6 & 4) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j7;
        }
        if ((i6 & 8) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j8;
        }
        if ((i6 & 16) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j9;
        }
        if ((i6 & 32) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j10;
        }
        if ((i6 & 64) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1618564327, i5, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:321)");
        }
        NavigationBarItemColors m2007copy4JmcsL4 = getDefaultNavigationBarItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2007copy4JmcsL4(j12, j13, j14, j15, j16, j17, j18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2007copy4JmcsL4;
    }

    @Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m2017colorszjMxDiM(long j5, long j6, long j7, long j8, long j9, Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(-213647161);
        if ((i6 & 1) != 0) {
            j10 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIconColor(), composer, 6);
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i5, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:359)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(j10, j11, j12, j13, j14, Color.m3733copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(j14, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navigationBarItemColors;
    }

    @p4.l
    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3_release(@p4.l ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached$material3_release = colorScheme.getDefaultNavigationBarItemColorsCached$material3_release();
        if (defaultNavigationBarItemColorsCached$material3_release == null) {
            NavigationBarTokens navigationBarTokens = NavigationBarTokens.INSTANCE;
            NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, navigationBarTokens.getInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultNavigationBarItemColorsCached$material3_release(navigationBarItemColors);
            return navigationBarItemColors;
        }
        return defaultNavigationBarItemColorsCached$material3_release;
    }
}
