package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.b1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004JD\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJD\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0004JD\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0004JD\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0004JD\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\fJ)\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#JM\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010 H\u0007¢\u0006\u0004\b$\u0010#R\u0018\u0010(\u001a\u00020\u0002*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010.\u001a\u00020\u0002*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010'R\u0018\u00100\u001a\u00020\u0002*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010'R\u0018\u00102\u001a\u00020\u0002*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "Landroidx/compose/material3/TopAppBarColors;", "topAppBarColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "topAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "smallTopAppBarColors-zjMxDiM", "smallTopAppBarColors", "centerAlignedTopAppBarColors", "centerAlignedTopAppBarColors-zjMxDiM", "mediumTopAppBarColors", "mediumTopAppBarColors-zjMxDiM", "largeTopAppBarColors", "largeTopAppBarColors-zjMxDiM", "Landroidx/compose/material3/TopAppBarState;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "pinnedScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lv3/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "enterAlwaysScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "exitUntilCollapsedScrollBehavior", "Landroidx/compose/material3/ColorScheme;", "getDefaultTopAppBarColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultTopAppBarColors", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "getDefaultCenterAlignedTopAppBarColors$material3_release", "defaultCenterAlignedTopAppBarColors", "getDefaultMediumTopAppBarColors$material3_release", "defaultMediumTopAppBarColors", "getDefaultLargeTopAppBarColors$material3_release", "defaultLargeTopAppBarColors", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class TopAppBarDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();

    private TopAppBarDefaults() {
    }

    @p4.l
    @Composable
    public final TopAppBarColors centerAlignedTopAppBarColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(513940029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, i5, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:798)");
        }
        TopAppBarColors defaultCenterAlignedTopAppBarColors$material3_release = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCenterAlignedTopAppBarColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2607centerAlignedTopAppBarColorszjMxDiM(long j5, long j6, long j7, long j8, long j9, @p4.m Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(1896017784);
        if ((i6 & 1) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i5, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:818)");
        }
        TopAppBarColors m2601copyt635Npw = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2601copyt635Npw(j10, j11, j12, j13, j14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2601copyt635Npw;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(@p4.m TopAppBarState topAppBarState, @p4.m v3.a<Boolean> aVar, @p4.m AnimationSpec<Float> animationSpec, @p4.m DecayAnimationSpec<Float> decayAnimationSpec, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(959086674);
        if ((i6 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i6 & 2) != 0) {
            aVar = TopAppBarDefaults$enterAlwaysScrollBehavior$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i6 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i5, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:994)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterAlwaysScrollBehavior;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(@p4.m TopAppBarState topAppBarState, @p4.m v3.a<Boolean> aVar, @p4.m AnimationSpec<Float> animationSpec, @p4.m DecayAnimationSpec<Float> decayAnimationSpec, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1757023234);
        if ((i6 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i6 & 2) != 0) {
            aVar = TopAppBarDefaults$exitUntilCollapsedScrollBehavior$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i6 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i5, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1027)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitUntilCollapsedScrollBehavior;
    }

    @p4.l
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(@p4.l ColorScheme colorScheme) {
        long fromToken;
        TopAppBarColors defaultCenterAlignedTopAppBarColorsCached$material3_release = colorScheme.getDefaultCenterAlignedTopAppBarColorsCached$material3_release();
        if (defaultCenterAlignedTopAppBarColorsCached$material3_release == null) {
            TopAppBarSmallCenteredTokens topAppBarSmallCenteredTokens = TopAppBarSmallCenteredTokens.INSTANCE;
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor());
            if (Color.m3735equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor()), colorScheme.m1706getSurface0d7_KjU())) {
                fromToken = ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(colorScheme, TopAppBarSmallTokens.INSTANCE.m3191getOnScrollContainerElevationD9Ej5fM());
            } else {
                fromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor());
            }
            defaultCenterAlignedTopAppBarColorsCached$material3_release = new TopAppBarColors(fromToken2, fromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(defaultCenterAlignedTopAppBarColorsCached$material3_release);
        }
        return defaultCenterAlignedTopAppBarColorsCached$material3_release;
    }

    @p4.l
    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(@p4.l ColorScheme colorScheme) {
        long fromToken;
        TopAppBarColors defaultLargeTopAppBarColorsCached$material3_release = colorScheme.getDefaultLargeTopAppBarColorsCached$material3_release();
        if (defaultLargeTopAppBarColorsCached$material3_release == null) {
            TopAppBarLargeTokens topAppBarLargeTokens = TopAppBarLargeTokens.INSTANCE;
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor());
            if (Color.m3735equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor()), colorScheme.m1706getSurface0d7_KjU())) {
                fromToken = ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(colorScheme, TopAppBarSmallTokens.INSTANCE.m3191getOnScrollContainerElevationD9Ej5fM());
            } else {
                fromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor());
            }
            defaultLargeTopAppBarColorsCached$material3_release = new TopAppBarColors(fromToken2, fromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultLargeTopAppBarColorsCached$material3_release(defaultLargeTopAppBarColorsCached$material3_release);
        }
        return defaultLargeTopAppBarColorsCached$material3_release;
    }

    @p4.l
    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(@p4.l ColorScheme colorScheme) {
        long fromToken;
        TopAppBarColors defaultMediumTopAppBarColorsCached$material3_release = colorScheme.getDefaultMediumTopAppBarColorsCached$material3_release();
        if (defaultMediumTopAppBarColorsCached$material3_release == null) {
            TopAppBarMediumTokens topAppBarMediumTokens = TopAppBarMediumTokens.INSTANCE;
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor());
            if (Color.m3735equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor()), colorScheme.m1706getSurface0d7_KjU())) {
                fromToken = ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(colorScheme, TopAppBarSmallTokens.INSTANCE.m3191getOnScrollContainerElevationD9Ej5fM());
            } else {
                fromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor());
            }
            defaultMediumTopAppBarColorsCached$material3_release = new TopAppBarColors(fromToken2, fromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultMediumTopAppBarColorsCached$material3_release(defaultMediumTopAppBarColorsCached$material3_release);
        }
        return defaultMediumTopAppBarColorsCached$material3_release;
    }

    @p4.l
    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(@p4.l ColorScheme colorScheme) {
        long fromToken;
        TopAppBarColors defaultTopAppBarColorsCached$material3_release = colorScheme.getDefaultTopAppBarColorsCached$material3_release();
        if (defaultTopAppBarColorsCached$material3_release == null) {
            TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor());
            if (Color.m3735equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor()), colorScheme.m1706getSurface0d7_KjU())) {
                fromToken = ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(colorScheme, topAppBarSmallTokens.m3191getOnScrollContainerElevationD9Ej5fM());
            } else {
                fromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor());
            }
            defaultTopAppBarColorsCached$material3_release = new TopAppBarColors(fromToken2, fromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultTopAppBarColorsCached$material3_release(defaultTopAppBarColorsCached$material3_release);
        }
        return defaultTopAppBarColorsCached$material3_release;
    }

    @p4.l
    @u3.h(name = "getWindowInsets")
    @Composable
    public final WindowInsets getWindowInsets(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(2143182847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i5, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:788)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m639plusgK_yJZ4(companion.m649getHorizontalJoeWqyM(), companion.m653getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }

    @p4.l
    @Composable
    public final TopAppBarColors largeTopAppBarColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1744932393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744932393, i5, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:906)");
        }
        TopAppBarColors defaultLargeTopAppBarColors$material3_release = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultLargeTopAppBarColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2608largeTopAppBarColorszjMxDiM(long j5, long j6, long j7, long j8, long j9, @p4.m Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(-1471507700);
        if ((i6 & 1) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i5, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:927)");
        }
        TopAppBarColors m2601copyt635Npw = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2601copyt635Npw(j10, j11, j12, j13, j14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2601copyt635Npw;
    }

    @p4.l
    @Composable
    public final TopAppBarColors mediumTopAppBarColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1268886463);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1268886463, i5, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:853)");
        }
        TopAppBarColors defaultMediumTopAppBarColors$material3_release = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultMediumTopAppBarColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2609mediumTopAppBarColorszjMxDiM(long j5, long j6, long j7, long j8, long j9, @p4.m Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(-582474442);
        if ((i6 & 1) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i5, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:874)");
        }
        TopAppBarColors m2601copyt635Npw = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2601copyt635Npw(j10, j11, j12, j13, j14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2601copyt635Npw;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public final TopAppBarScrollBehavior pinnedScrollBehavior(@p4.m TopAppBarState topAppBarState, @p4.m v3.a<Boolean> aVar, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(286497075);
        if ((i6 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i6 & 2) != 0) {
            aVar = TopAppBarDefaults$pinnedScrollBehavior$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i5, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:969)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pinnedScrollBehavior;
    }

    @p4.l
    @Composable
    @kotlin.k(level = kotlin.m.WARNING, message = "Use topAppBarColors instead.", replaceWith = @b1(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    /* renamed from: smallTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2610smallTopAppBarColorszjMxDiM(long j5, long j6, long j7, long j8, long j9, @p4.m Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(-1717201472);
        if ((i6 & 1) != 0) {
            j10 = ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = ColorSchemeKt.m1718applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j10, TopAppBarSmallTokens.INSTANCE.m3191getOnScrollContainerElevationD9Ej5fM(), composer, ((i5 << 3) & 112) | 384);
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1717201472, i5, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:775)");
        }
        TopAppBarColors m2611topAppBarColorszjMxDiM = m2611topAppBarColorszjMxDiM(j10, j11, j12, j13, j14, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2611topAppBarColorszjMxDiM;
    }

    @p4.l
    @Composable
    public final TopAppBarColors topAppBarColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1388520854);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, i5, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:697)");
        }
        TopAppBarColors defaultTopAppBarColors$material3_release = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTopAppBarColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m2611topAppBarColorszjMxDiM(long j5, long j6, long j7, long j8, long j9, @p4.m Composer composer, int i5, int i6) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        composer.startReplaceableGroup(2142919275);
        if ((i6 & 1) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j8;
        }
        if ((i6 & 16) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i5, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:717)");
        }
        TopAppBarColors m2601copyt635Npw = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2601copyt635Npw(j10, j11, j12, j13, j14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2601copyt635Npw;
    }
}
