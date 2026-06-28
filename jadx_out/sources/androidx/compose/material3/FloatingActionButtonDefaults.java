package androidx.compose.material3;

import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryLargeTokens;
import androidx.compose.material3.tokens.FabPrimarySmallTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010 R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonDefaults;", "", "()V", "LargeIconSize", "Landroidx/compose/ui/unit/Dp;", "getLargeIconSize-D9Ej5fM", "()F", "F", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "extendedFabShape", "Landroidx/compose/ui/graphics/Shape;", "getExtendedFabShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "largeShape", "getLargeShape", "shape", "getShape", "smallShape", "getSmallShape", "bottomAppBarFabElevation", "Landroidx/compose/material3/FloatingActionButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "bottomAppBarFabElevation-a9UjIt4", "(FFFF)Landroidx/compose/material3/FloatingActionButtonElevation;", "elevation", "elevation-xZ9-QkE", "(FFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/FloatingActionButtonElevation;", "loweredElevation", "loweredElevation-xZ9-QkE", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,671:1\n154#2:672\n154#2:673\n154#2:674\n154#2:675\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonDefaults\n*L\n463#1:672\n464#1:673\n465#1:674\n466#1:675\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();
    private static final float LargeIconSize = FabPrimaryLargeTokens.INSTANCE.m2820getIconSizeD9Ej5fM();

    private FloatingActionButtonDefaults() {
    }

    /* renamed from: bottomAppBarFabElevation-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ FloatingActionButtonElevation m1894bottomAppBarFabElevationa9UjIt4$default(FloatingActionButtonDefaults floatingActionButtonDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        }
        return floatingActionButtonDefaults.m1895bottomAppBarFabElevationa9UjIt4(f5, f6, f7, f8);
    }

    @p4.l
    /* renamed from: bottomAppBarFabElevation-a9UjIt4, reason: not valid java name */
    public final FloatingActionButtonElevation m1895bottomAppBarFabElevationa9UjIt4(float f5, float f6, float f7, float f8) {
        return new FloatingActionButtonElevation(f5, f6, f7, f8, null);
    }

    @p4.l
    @Composable
    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1896elevationxZ9QkE(float f5, float f6, float f7, float f8, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-241106249);
        if ((i6 & 1) != 0) {
            f5 = FabPrimaryTokens.INSTANCE.m2837getContainerElevationD9Ej5fM();
        }
        float f9 = f5;
        if ((i6 & 2) != 0) {
            f6 = FabPrimaryTokens.INSTANCE.m2847getPressedContainerElevationD9Ej5fM();
        }
        float f10 = f6;
        if ((i6 & 4) != 0) {
            f7 = FabPrimaryTokens.INSTANCE.m2840getFocusContainerElevationD9Ej5fM();
        }
        float f11 = f7;
        if ((i6 & 8) != 0) {
            f8 = FabPrimaryTokens.INSTANCE.m2841getHoverContainerElevationD9Ej5fM();
        }
        float f12 = f8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-241106249, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:421)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f9, f10, f11, f12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }

    @u3.h(name = "getContainerColor")
    @Composable
    public final long getContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1855656391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855656391, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:402)");
        }
        long value = ColorSchemeKt.getValue(FabPrimaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getExtendedFabShape")
    @Composable
    public final Shape getExtendedFabShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-536021915);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-536021915, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-extendedFabShape> (FloatingActionButton.kt:399)");
        }
        Shape value = ShapesKt.getValue(ExtendedFabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1897getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    @p4.l
    @u3.h(name = "getLargeShape")
    @Composable
    public final Shape getLargeShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1835912187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835912187, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-largeShape> (FloatingActionButton.kt:395)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryLargeTokens.INSTANCE.getContainerShape(), composer, 6);
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
        composer.startReplaceableGroup(-53247565);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53247565, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:389)");
        }
        Shape value = ShapesKt.getValue(FabPrimaryTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getSmallShape")
    @Composable
    public final Shape getSmallShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(394933381);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394933381, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-smallShape> (FloatingActionButton.kt:392)");
        }
        Shape value = ShapesKt.getValue(FabPrimarySmallTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @Composable
    /* renamed from: loweredElevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1898loweredElevationxZ9QkE(float f5, float f6, float f7, float f8, @p4.m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-285065125);
        if ((i6 & 1) != 0) {
            f5 = FabPrimaryTokens.INSTANCE.m2843getLoweredContainerElevationD9Ej5fM();
        }
        float f9 = f5;
        if ((i6 & 2) != 0) {
            f6 = FabPrimaryTokens.INSTANCE.m2846getLoweredPressedContainerElevationD9Ej5fM();
        }
        float f10 = f6;
        if ((i6 & 4) != 0) {
            f7 = FabPrimaryTokens.INSTANCE.m2844getLoweredFocusContainerElevationD9Ej5fM();
        }
        float f11 = f7;
        if ((i6 & 8) != 0) {
            f8 = FabPrimaryTokens.INSTANCE.m2845getLoweredHoverContainerElevationD9Ej5fM();
        }
        float f12 = f8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285065125, i5, -1, "androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation (FloatingActionButton.kt:444)");
        }
        FloatingActionButtonElevation floatingActionButtonElevation = new FloatingActionButtonElevation(f9, f10, f11, f12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return floatingActionButtonElevation;
    }
}
