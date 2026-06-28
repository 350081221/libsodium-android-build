package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&JD\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "width", "height", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Lkotlin/r2;", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "DragHandle", "Elevation", "F", "getElevation-D9Ej5fM", "()F", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "SheetMaxWidth", "getSheetMaxWidth-D9Ej5fM", "getHiddenShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getExpandedShape", "ExpandedShape", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "ContainerColor", "getScrimColor", "ScrimColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,503:1\n127#2:504\n1116#3,6:505\n154#4:511\n154#4:512\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n398#1:504\n402#1:505,6\n372#1:511\n377#1:512\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float Elevation = SheetBottomTokens.INSTANCE.m3110getDockedModalContainerElevationD9Ej5fM();
    private static final float SheetPeekHeight = Dp.m6044constructorimpl(56);
    private static final float SheetMaxWidth = Dp.m6044constructorimpl(640);

    private BottomSheetDefaults() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1574DragHandlelgZ2HuY(@p4.m androidx.compose.ui.Modifier r25, float r26, float r27, @p4.m androidx.compose.ui.graphics.Shape r28, long r29, @p4.m androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetDefaults.m1574DragHandlelgZ2HuY(androidx.compose.ui.Modifier, float, float, androidx.compose.ui.graphics.Shape, long, androidx.compose.runtime.Composer, int, int):void");
    }

    @u3.h(name = "getContainerColor")
    @Composable
    public final long getContainerColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(433375448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i5, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:358)");
        }
        long value = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1575getElevationD9Ej5fM() {
        return Elevation;
    }

    @p4.l
    @u3.h(name = "getExpandedShape")
    @Composable
    public final Shape getExpandedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1683783414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i5, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:353)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getHiddenShape")
    @Composable
    public final Shape getHiddenShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1971658024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i5, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:348)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @u3.h(name = "getScrimColor")
    @Composable
    public final long getScrimColor(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-2040719176);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i5, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:366)");
        }
        long m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3733copywmQWz5c$default;
    }

    /* renamed from: getSheetMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m1576getSheetMaxWidthD9Ej5fM() {
        return SheetMaxWidth;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1577getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    @p4.l
    @u3.h(name = "getWindowInsets")
    @Composable
    public final WindowInsets getWindowInsets(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-511309409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i5, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:383)");
        }
        WindowInsets m628onlybOOhFvg = WindowInsetsKt.m628onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.Companion.m654getVerticalJoeWqyM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m628onlybOOhFvg;
    }
}
