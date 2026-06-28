package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@Stable
@kotlin.i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u008a\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010%\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0013\b\u0002\u0010#\u001a\r\u0012\u0004\u0012\u00020\u001c0!¢\u0006\u0002\b\"2\u0015\b\u0002\u0010$\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010!¢\u0006\u0002\b\"H\u0007¢\u0006\u0004\b%\u0010&J\"\u0010-\u001a\u00020*2\u0006\u0010'\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020(ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u001d\u0010.\u001a\u00020(8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00102\u001a\u00020(8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0018\u00107\u001a\u00020\u0002*\u0002048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0018\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/material3/SegmentedButtonDefaults;", "", "Landroidx/compose/material3/SegmentedButtonColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SegmentedButtonColors;", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "colors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SegmentedButtonColors;", "", "index", "count", "Landroidx/compose/foundation/shape/CornerBasedShape;", "baseShape", "Landroidx/compose/ui/graphics/Shape;", "itemShape", "(IILandroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/graphics/Shape;", "Lkotlin/r2;", "ActiveIcon", "(Landroidx/compose/runtime/Composer;I)V", "", "active", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "activeContent", "inactiveContent", "Icon", "(ZLv3/p;Lv3/p;Landroidx/compose/runtime/Composer;II)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/foundation/BorderStroke;", "borderStroke-l07J4OM", "(JF)Landroidx/compose/foundation/BorderStroke;", "borderStroke", "BorderWidth", "F", "getBorderWidth-D9Ej5fM", "()F", "IconSize", "getIconSize-D9Ej5fM", "Landroidx/compose/material3/ColorScheme;", "getDefaultSegmentedButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SegmentedButtonColors;", "defaultSegmentedButtonColors", "getBaseShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/CornerBasedShape;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    private static final float BorderWidth;

    @p4.l
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float IconSize;

    static {
        OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
        BorderWidth = outlinedSegmentedButtonTokens.m2991getOutlineWidthD9Ej5fM();
        IconSize = outlinedSegmentedButtonTokens.m2990getIconSizeD9Ej5fM();
    }

    private SegmentedButtonDefaults() {
    }

    /* renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m2147borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j5, float f5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = BorderWidth;
        }
        return segmentedButtonDefaults.m2148borderStrokel07J4OM(j5, f5);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ActiveIcon(@p4.m Composer composer, int i5) {
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1273041460);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(this)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i6, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:553)");
            }
            IconKt.m1925Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, SizeKt.m602size3ABfNKs(Modifier.Companion, IconSize), 0L, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SegmentedButtonDefaults$ActiveIcon$1(this, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Icon(boolean r17, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r18, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r19, @p4.m androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonDefaults.Icon(boolean, v3.p, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @p4.l
    /* renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m2148borderStrokel07J4OM(long j5, float f5) {
        return BorderStrokeKt.m228BorderStrokecXLIe8U(f5, j5);
    }

    @p4.l
    @Composable
    public final SegmentedButtonColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(679457321);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i5, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:438)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3_release = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSegmentedButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m2149colorsXqyqHi0(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @p4.m Composer composer, int i5, int i6, int i7) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        composer.startReplaceableGroup(132526205);
        if ((i7 & 1) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i7 & 2) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i7 & 4) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i7 & 8) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i7 & 16) != 0) {
            j21 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i7 & 32) != 0) {
            j22 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i7 & 64) != 0) {
            j23 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i7 & 128) != 0) {
            j24 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i7 & 256) != 0) {
            j25 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j25 = j13;
        }
        if ((i7 & 512) != 0) {
            j26 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j26 = j14;
        }
        if ((i7 & 1024) != 0) {
            j27 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j27 = j15;
        }
        if ((i7 & 2048) != 0) {
            j28 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j28 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(132526205, i5, i6, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:474)");
        }
        SegmentedButtonColors m2134copy2qZNXz8 = getDefaultSegmentedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2134copy2qZNXz8(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2134copy2qZNXz8;
    }

    @u3.h(name = "getBaseShape")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public final CornerBasedShape getBaseShape(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i5, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:518)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShape;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m2150getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    @p4.l
    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached$material3_release = colorScheme.getDefaultSegmentedButtonColorsCached$material3_release();
        if (defaultSegmentedButtonColorsCached$material3_release == null) {
            OutlinedSegmentedButtonTokens outlinedSegmentedButtonTokens = OutlinedSegmentedButtonTokens.INSTANCE;
            SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), colorScheme.m1706getSurface0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getSelectedContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), outlinedSegmentedButtonTokens.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), outlinedSegmentedButtonTokens.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getDisabledLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, outlinedSegmentedButtonTokens.getOutlineColor()), null);
            colorScheme.setDefaultSegmentedButtonColorsCached$material3_release(segmentedButtonColors);
            return segmentedButtonColors;
        }
        return defaultSegmentedButtonColorsCached$material3_release;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2151getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @p4.l
    @Composable
    @ReadOnlyComposable
    public final Shape itemShape(int i5, int i6, @p4.m CornerBasedShape cornerBasedShape, @p4.m Composer composer, int i7, int i8) {
        Shape rectangleShape;
        if ((i8 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i7 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i7, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:534)");
        }
        if (i6 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return cornerBasedShape;
        }
        if (i5 == 0) {
            rectangleShape = ShapesKt.start(cornerBasedShape);
        } else if (i5 == i6 - 1) {
            rectangleShape = ShapesKt.end(cornerBasedShape);
        } else {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rectangleShape;
    }
}
