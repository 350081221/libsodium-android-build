package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.ElevatedCardTokens;
import androidx.compose.material3.tokens.FilledCardTokens;
import androidx.compose.material3.tokens.OutlinedCardTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0014\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJN\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u0010(\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001cJN\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'J\u0017\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0002\u00100J\r\u00101\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0015J:\u00101\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cJN\u00103\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020 2\b\b\u0002\u0010%\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010'R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/material3/CardDefaults;", "", "()V", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "defaultCardColors", "Landroidx/compose/material3/CardColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCardColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/CardColors;", "defaultElevatedCardColors", "getDefaultElevatedCardColors$material3_release", "defaultOutlinedCardColors", "getDefaultOutlinedCardColors$material3_release", "cardColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/CardColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "cardColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardColors;", "cardElevation", "Landroidx/compose/material3/CardElevation;", "defaultElevation", "Landroidx/compose/ui/unit/Dp;", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "cardElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/CardElevation;", "elevatedCardColors", "elevatedCardColors-ro_MJ88", "elevatedCardElevation", "elevatedCardElevation-aqJV_2Y", "outlinedCardBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "outlinedCardColors", "outlinedCardColors-ro_MJ88", "outlinedCardElevation", "outlinedCardElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,850:1\n1116#2,6:851\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardDefaults\n*L\n603#1:851,6\n*E\n"})
/* loaded from: classes.dex */
public final class CardDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final CardDefaults INSTANCE = new CardDefaults();

    private CardDefaults() {
    }

    @p4.l
    @Composable
    public final CardColors cardColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1876034303);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1876034303, i5, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:448)");
        }
        CardColors defaultCardColors$material3_release = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCardColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: cardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1615cardColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-1589582123);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ColorSchemeKt.m1720contentColorForek8zF_U(j9, composer, i5 & 14);
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589582123, i5, -1, "androidx.compose.material3.CardDefaults.cardColors (Card.kt:465)");
        }
        CardColors m1610copyjRlVdoo = getDefaultCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1610copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1610copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: cardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1616cardElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(-574898487);
        if ((i6 & 1) != 0) {
            f11 = FilledCardTokens.INSTANCE.m2876getContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = FilledCardTokens.INSTANCE.m2882getPressedContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = FilledCardTokens.INSTANCE.m2879getFocusContainerElevationD9Ej5fM();
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = FilledCardTokens.INSTANCE.m2880getHoverContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = FilledCardTokens.INSTANCE.m2878getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = FilledCardTokens.INSTANCE.m2877getDisabledContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-574898487, i5, -1, "androidx.compose.material3.CardDefaults.cardElevation (Card.kt:378)");
        }
        CardElevation cardElevation = new CardElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @p4.l
    @Composable
    public final CardColors elevatedCardColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1610137975);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1610137975, i5, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:498)");
        }
        CardColors defaultElevatedCardColors$material3_release = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedCardColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1617elevatedCardColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(139558303);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ColorSchemeKt.m1720contentColorForek8zF_U(j9, composer, i5 & 14);
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139558303, i5, -1, "androidx.compose.material3.CardDefaults.elevatedCardColors (Card.kt:515)");
        }
        CardColors m1610copyjRlVdoo = getDefaultElevatedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1610copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1610copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1618elevatedCardElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(1154241939);
        if ((i6 & 1) != 0) {
            f11 = ElevatedCardTokens.INSTANCE.m2792getContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = ElevatedCardTokens.INSTANCE.m2798getPressedContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = ElevatedCardTokens.INSTANCE.m2795getFocusContainerElevationD9Ej5fM();
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = ElevatedCardTokens.INSTANCE.m2796getHoverContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = ElevatedCardTokens.INSTANCE.m2794getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = ElevatedCardTokens.INSTANCE.m2793getDisabledContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1154241939, i5, -1, "androidx.compose.material3.CardDefaults.elevatedCardElevation (Card.kt:406)");
        }
        CardElevation cardElevation = new CardElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }

    @p4.l
    public final CardColors getDefaultCardColors$material3_release(@p4.l ColorScheme colorScheme) {
        CardColors defaultCardColorsCached$material3_release = colorScheme.getDefaultCardColorsCached$material3_release();
        if (defaultCardColorsCached$material3_release == null) {
            FilledCardTokens filledCardTokens = FilledCardTokens.INSTANCE;
            CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor()), ColorSchemeKt.m1719contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(colorScheme, filledCardTokens.m2877getDisabledContainerElevationD9Ej5fM())), Color.m3733copywmQWz5c$default(ColorSchemeKt.m1719contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, filledCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultCardColorsCached$material3_release(cardColors);
            return cardColors;
        }
        return defaultCardColorsCached$material3_release;
    }

    @p4.l
    public final CardColors getDefaultElevatedCardColors$material3_release(@p4.l ColorScheme colorScheme) {
        CardColors defaultElevatedCardColorsCached$material3_release = colorScheme.getDefaultElevatedCardColorsCached$material3_release();
        if (defaultElevatedCardColorsCached$material3_release == null) {
            ElevatedCardTokens elevatedCardTokens = ElevatedCardTokens.INSTANCE;
            CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor()), ColorSchemeKt.m1719contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(colorScheme, elevatedCardTokens.m2793getDisabledContainerElevationD9Ej5fM())), Color.m3733copywmQWz5c$default(ColorSchemeKt.m1719contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, elevatedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultElevatedCardColorsCached$material3_release(cardColors);
            return cardColors;
        }
        return defaultElevatedCardColorsCached$material3_release;
    }

    @p4.l
    public final CardColors getDefaultOutlinedCardColors$material3_release(@p4.l ColorScheme colorScheme) {
        CardColors defaultOutlinedCardColorsCached$material3_release = colorScheme.getDefaultOutlinedCardColorsCached$material3_release();
        if (defaultOutlinedCardColorsCached$material3_release == null) {
            OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            CardColors cardColors = new CardColors(ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), ColorSchemeKt.m1719contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.m1719contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, outlinedCardTokens.getContainerColor())), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultOutlinedCardColorsCached$material3_release(cardColors);
            return cardColors;
        }
        return defaultOutlinedCardColorsCached$material3_release;
    }

    @p4.l
    @u3.h(name = "getElevatedShape")
    @Composable
    public final Shape getElevatedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-133496185);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-133496185, i5, -1, "androidx.compose.material3.CardDefaults.<get-elevatedShape> (Card.kt:355)");
        }
        Shape value = ShapesKt.getValue(ElevatedCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getOutlinedShape")
    @Composable
    public final Shape getOutlinedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1095404023);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1095404023, i5, -1, "androidx.compose.material3.CardDefaults.<get-outlinedShape> (Card.kt:358)");
        }
        Shape value = ShapesKt.getValue(OutlinedCardTokens.INSTANCE.getContainerShape(), composer, 6);
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
        composer.startReplaceableGroup(1266660211);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1266660211, i5, -1, "androidx.compose.material3.CardDefaults.<get-shape> (Card.kt:352)");
        }
        Shape value = ShapesKt.getValue(FilledCardTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @Composable
    public final BorderStroke outlinedCardBorder(boolean z4, @p4.m Composer composer, int i5, int i6) {
        long m3779compositeOverOWjLjI;
        composer.startReplaceableGroup(-392936593);
        if ((i6 & 1) != 0) {
            z4 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-392936593, i5, -1, "androidx.compose.material3.CardDefaults.outlinedCardBorder (Card.kt:590)");
        }
        if (z4) {
            composer.startReplaceableGroup(-31426386);
            m3779compositeOverOWjLjI = ColorSchemeKt.getValue(OutlinedCardTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-31426319);
            OutlinedCardTokens outlinedCardTokens = OutlinedCardTokens.INSTANCE;
            m3779compositeOverOWjLjI = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(outlinedCardTokens.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m1729surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), outlinedCardTokens.m2979getDisabledContainerElevationD9Ej5fM()));
            composer.endReplaceableGroup();
        }
        composer.startReplaceableGroup(-31425948);
        boolean changed = composer.changed(m3779compositeOverOWjLjI);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m228BorderStrokecXLIe8U(OutlinedCardTokens.INSTANCE.m2984getOutlineWidthD9Ej5fM(), m3779compositeOverOWjLjI);
            composer.updateRememberedValue(rememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStroke;
    }

    @p4.l
    @Composable
    public final CardColors outlinedCardColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1204388929);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1204388929, i5, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:547)");
        }
        CardColors defaultOutlinedCardColors$material3_release = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedCardColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: outlinedCardColors-ro_MJ88, reason: not valid java name */
    public final CardColors m1619outlinedCardColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-1112362409);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ColorSchemeKt.m1720contentColorForek8zF_U(j9, composer, i5 & 14);
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(ColorSchemeKt.m1720contentColorForek8zF_U(j9, composer, i5 & 14), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1112362409, i5, -1, "androidx.compose.material3.CardDefaults.outlinedCardColors (Card.kt:564)");
        }
        CardColors m1610copyjRlVdoo = getDefaultOutlinedCardColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1610copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1610copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: outlinedCardElevation-aqJV_2Y, reason: not valid java name */
    public final CardElevation m1620outlinedCardElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(-97678773);
        if ((i6 & 1) != 0) {
            f11 = OutlinedCardTokens.INSTANCE.m2978getContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = f11;
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = f11;
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = f11;
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = OutlinedCardTokens.INSTANCE.m2980getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = OutlinedCardTokens.INSTANCE.m2979getDisabledContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-97678773, i5, -1, "androidx.compose.material3.CardDefaults.outlinedCardElevation (Card.kt:434)");
        }
        CardElevation cardElevation = new CardElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return cardElevation;
    }
}
