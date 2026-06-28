package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.IconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015JN\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015JN\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\nH\u0007¢\u0006\u0002\u0010!J:\u0010 \u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0015JN\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007¢\u0006\u0002\u0010)J:\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0015J\u001f\u0010,\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\u0006\u0010-\u001a\u00020(H\u0007¢\u0006\u0002\u0010.JN\u0010/\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/material3/IconButtonDefaults;", "", "()V", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape", "defaultIconButtonColors", "Landroidx/compose/material3/IconButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultIconButtonColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "filledIconButtonColors", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "filledIconButtonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconButtonColors;", "filledIconToggleButtonColors", "Landroidx/compose/material3/IconToggleButtonColors;", "checkedContainerColor", "checkedContentColor", "filledIconToggleButtonColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/IconToggleButtonColors;", "filledTonalIconButtonColors", "filledTonalIconButtonColors-ro_MJ88", "filledTonalIconToggleButtonColors", "filledTonalIconToggleButtonColors-5tl4gsc", "iconButtonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/IconButtonColors;", "iconButtonColors-ro_MJ88", "iconToggleButtonColors", "iconToggleButtonColors-5tl4gsc", "outlinedIconButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconButtonColors", "outlinedIconButtonColors-ro_MJ88", "outlinedIconToggleButtonBorder", "checked", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedIconToggleButtonColors", "outlinedIconToggleButtonColors-5tl4gsc", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1001:1\n74#2:1002\n74#2:1003\n74#2:1004\n74#2:1005\n74#2:1006\n74#2:1007\n74#2:1008\n74#2:1009\n1116#3,6:1010\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonDefaults\n*L\n554#1:1002\n577#1:1003\n592#1:1004\n619#1:1005\n761#1:1006\n787#1:1007\n827#1:1008\n829#1:1009\n832#1:1010,6\n*E\n"})
/* loaded from: classes.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();

    private IconButtonDefaults() {
    }

    @p4.l
    @Composable
    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1915filledIconButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-669858473);
        if ((i6 & 1) != 0) {
            j9 = ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ColorSchemeKt.m1720contentColorForek8zF_U(j9, composer, i5 & 14);
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-669858473, i5, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButton.kt:651)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j9, j10, j11, j12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @p4.l
    @Composable
    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1916filledIconToggleButtonColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(1887173701);
        if ((i6 & 1) != 0) {
            j11 = ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6);
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getToggleUnselectedColor(), composer, 6);
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = ColorSchemeKt.getValue(FilledIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = ColorSchemeKt.m1720contentColorForek8zF_U(j15, composer, (i5 >> 12) & 14);
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887173701, i5, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButton.kt:682)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @p4.l
    @Composable
    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1917filledTonalIconButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-18532843);
        if ((i6 & 1) != 0) {
            j9 = ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ColorSchemeKt.m1720contentColorForek8zF_U(j9, composer, i5 & 14);
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-18532843, i5, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButton.kt:709)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j9, j10, j11, j12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @p4.l
    @Composable
    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1918filledTonalIconToggleButtonColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-19426557);
        if ((i6 & 1) != 0) {
            j11 = ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor(), composer, 6);
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = ColorSchemeKt.m1720contentColorForek8zF_U(j11, composer, i5 & 14);
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getDisabledColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = ColorSchemeKt.getValue(FilledTonalIconButtonTokens.INSTANCE.getToggleSelectedColor(), composer, 6);
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-19426557, i5, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButton.kt:739)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @p4.l
    @u3.h(name = "getDefaultIconButtonColors")
    @Composable
    public final IconButtonColors getDefaultIconButtonColors(@p4.l ColorScheme colorScheme, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1437915677);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1437915677, i5, -1, "androidx.compose.material3.IconButtonDefaults.<get-defaultIconButtonColors> (IconButton.kt:589)");
        }
        IconButtonColors defaultIconButtonColorsCached$material3_release = colorScheme.getDefaultIconButtonColorsCached$material3_release();
        if (defaultIconButtonColorsCached$material3_release == null) {
            long m3744unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
            Color.Companion companion = Color.Companion;
            defaultIconButtonColorsCached$material3_release = new IconButtonColors(companion.m3769getTransparent0d7_KjU(), m3744unboximpl, companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(m3744unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultIconButtonColorsCached$material3_release(defaultIconButtonColorsCached$material3_release);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultIconButtonColorsCached$material3_release;
    }

    @p4.l
    @u3.h(name = "getFilledShape")
    @Composable
    public final Shape getFilledShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1265841879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1265841879, i5, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButton.kt:540)");
        }
        Shape value = ShapesKt.getValue(FilledIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
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
        composer.startReplaceableGroup(1327125527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1327125527, i5, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButton.kt:545)");
        }
        Shape value = ShapesKt.getValue(OutlinedIconButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @Composable
    public final IconButtonColors iconButtonColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1519621781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1519621781, i5, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:551)");
        }
        IconButtonColors defaultIconButtonColors = getDefaultIconButtonColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 << 3) & 112);
        long m3744unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        if (Color.m3735equalsimpl0(defaultIconButtonColors.m1912getContentColor0d7_KjU(), m3744unboximpl)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return defaultIconButtonColors;
        }
        IconButtonColors m1907copyjRlVdoo$default = IconButtonColors.m1907copyjRlVdoo$default(defaultIconButtonColors, 0L, m3744unboximpl, 0L, Color.m3733copywmQWz5c$default(m3744unboximpl, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1907copyjRlVdoo$default;
    }

    @p4.l
    @Composable
    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1919iconButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(999008085);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
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
            ComposerKt.traceEventStart(999008085, i5, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:580)");
        }
        IconButtonColors m1910copyjRlVdoo = getDefaultIconButtonColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 9) & 112).m1910copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1910copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1920iconToggleButtonColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-2020719549);
        if ((i6 & 1) != 0) {
            j11 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.m3733copywmQWz5c$default(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = ColorSchemeKt.getValue(IconButtonTokens.INSTANCE.getSelectedIconColor(), composer, 6);
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020719549, i5, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButton.kt:625)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }

    @p4.l
    @Composable
    public final BorderStroke outlinedIconButtonBorder(boolean z4, @p4.m Composer composer, int i5) {
        long m3733copywmQWz5c$default;
        composer.startReplaceableGroup(-511461558);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511461558, i5, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButton.kt:824)");
        }
        if (z4) {
            composer.startReplaceableGroup(1252616568);
            m3733copywmQWz5c$default = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1252616623);
            m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceableGroup();
        }
        composer.startReplaceableGroup(1252616777);
        boolean changed = composer.changed(m3733copywmQWz5c$default);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BorderStrokeKt.m228BorderStrokecXLIe8U(OutlinedIconButtonTokens.INSTANCE.m2988getUnselectedOutlineWidthD9Ej5fM(), m3733copywmQWz5c$default);
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
    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m1921outlinedIconButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-1030517545);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1030517545, i5, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButton.kt:765)");
        }
        IconButtonColors iconButtonColors = new IconButtonColors(j9, j10, j11, j12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconButtonColors;
    }

    @Composable
    @p4.m
    public final BorderStroke outlinedIconToggleButtonBorder(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1244729690);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1244729690, i5, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButton.kt:811)");
        }
        if (z5) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }
        BorderStroke outlinedIconButtonBorder = outlinedIconButtonBorder(z4, composer, (i5 & 14) | ((i5 >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return outlinedIconButtonBorder;
    }

    @p4.l
    @Composable
    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m1922outlinedIconToggleButtonColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(2130592709);
        if ((i6 & 1) != 0) {
            j11 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.m3733copywmQWz5c$default(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = ColorSchemeKt.getValue(OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor(), composer, 6);
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = ColorSchemeKt.m1720contentColorForek8zF_U(j15, composer, (i5 >> 12) & 14);
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2130592709, i5, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButton.kt:794)");
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(j11, j12, j13, j14, j15, j16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return iconToggleButtonColors;
    }
}
