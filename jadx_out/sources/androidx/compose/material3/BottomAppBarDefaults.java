package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.FabSecondaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$JM\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00198Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010 \u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00198Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/BottomAppBarDefaults;", "", "Landroidx/compose/material3/BottomAppBarState;", "state", "Lkotlin/Function0;", "", "canScroll", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingAnimationSpec", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "exitAlwaysScrollBehavior", "(Landroidx/compose/material3/BottomAppBarState;Lv3/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarScrollBehavior;", "Landroidx/compose/ui/unit/Dp;", "ContainerElevation", "F", "getContainerElevation-D9Ej5fM", "()F", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "containerColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "getBottomAppBarFabColor", "bottomAppBarFabColor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BottomAppBarDefaults {
    public static final int $stable = 0;

    @p4.l
    private static final PaddingValues ContentPadding;

    @p4.l
    public static final BottomAppBarDefaults INSTANCE = new BottomAppBarDefaults();
    private static final float ContainerElevation = BottomAppBarTokens.INSTANCE.m2640getContainerElevationD9Ej5fM();

    static {
        float f5;
        float f6;
        f5 = AppBarKt.BottomAppBarHorizontalPadding;
        float bottomAppBarVerticalPadding = AppBarKt.getBottomAppBarVerticalPadding();
        f6 = AppBarKt.BottomAppBarHorizontalPadding;
        ContentPadding = PaddingKt.m550PaddingValuesa9UjIt4$default(f5, bottomAppBarVerticalPadding, f6, 0.0f, 8, null);
    }

    private BottomAppBarDefaults() {
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public final BottomAppBarScrollBehavior exitAlwaysScrollBehavior(@p4.m BottomAppBarState bottomAppBarState, @p4.m v3.a<Boolean> aVar, @p4.m AnimationSpec<Float> animationSpec, @p4.m DecayAnimationSpec<Float> decayAnimationSpec, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(457144034);
        if ((i6 & 1) != 0) {
            bottomAppBarState = AppBarKt.rememberBottomAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i6 & 2) != 0) {
            aVar = BottomAppBarDefaults$exitAlwaysScrollBehavior$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i6 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(457144034, i5, -1, "androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior (AppBar.kt:1348)");
        }
        ExitAlwaysScrollBehavior exitAlwaysScrollBehavior = new ExitAlwaysScrollBehavior(bottomAppBarState, animationSpec, decayAnimationSpec, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitAlwaysScrollBehavior;
    }

    @u3.h(name = "getBottomAppBarFabColor")
    @Composable
    public final long getBottomAppBarFabColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1464561486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464561486, i5, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:1323)");
        }
        long value = ColorSchemeKt.getValue(FabSecondaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getContainerColor")
    @Composable
    public final long getContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-368340078);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, i5, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:1295)");
        }
        long value = ColorSchemeKt.getValue(BottomAppBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1573getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    @p4.l
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @p4.l
    @u3.h(name = "getWindowInsets")
    @Composable
    public final WindowInsets getWindowInsets(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(688896409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688896409, i5, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:1315)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m639plusgK_yJZ4(companion.m649getHorizontalJoeWqyM(), companion.m647getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }
}
