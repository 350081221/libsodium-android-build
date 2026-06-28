package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/AppBarDefaults;", "", "()V", "BottomAppBarElevation", "Landroidx/compose/ui/unit/Dp;", "getBottomAppBarElevation-D9Ej5fM", "()F", "F", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "TopAppBarElevation", "getTopAppBarElevation-D9Ej5fM", "bottomAppBarWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getBottomAppBarWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "topAppBarWindowInsets", "getTopAppBarWindowInsets", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,758:1\n154#2:759\n154#2:760\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n438#1:759\n443#1:760\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarDefaults {
    public static final int $stable = 0;

    @l
    private static final PaddingValues ContentPadding;

    @l
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();
    private static final float TopAppBarElevation = Dp.m6044constructorimpl(4);
    private static final float BottomAppBarElevation = Dp.m6044constructorimpl(8);

    static {
        float f5;
        float f6;
        f5 = AppBarKt.AppBarHorizontalPadding;
        f6 = AppBarKt.AppBarHorizontalPadding;
        ContentPadding = PaddingKt.m550PaddingValuesa9UjIt4$default(f5, 0.0f, f6, 0.0f, 10, null);
    }

    private AppBarDefaults() {
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m1197getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    @l
    @h(name = "getBottomAppBarWindowInsets")
    @Composable
    public final WindowInsets getBottomAppBarWindowInsets(@m Composer composer, int i5) {
        composer.startReplaceableGroup(1469837023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1469837023, i5, -1, "androidx.compose.material.AppBarDefaults.<get-bottomAppBarWindowInsets> (AppBar.kt:465)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m639plusgK_yJZ4(companion.m649getHorizontalJoeWqyM(), companion.m647getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }

    @l
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m1198getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }

    @l
    @h(name = "getTopAppBarWindowInsets")
    @Composable
    public final WindowInsets getTopAppBarWindowInsets(@m Composer composer, int i5) {
        composer.startReplaceableGroup(-427176825);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-427176825, i5, -1, "androidx.compose.material.AppBarDefaults.<get-topAppBarWindowInsets> (AppBar.kt:457)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m639plusgK_yJZ4(companion.m649getHorizontalJoeWqyM(), companion.m653getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }
}
