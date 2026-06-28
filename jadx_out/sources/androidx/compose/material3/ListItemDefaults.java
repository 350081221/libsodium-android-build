package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jl\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/ListItemDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/ListItemColors;", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "colors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final float Elevation = ListTokens.INSTANCE.m2930getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    @p4.l
    @Composable
    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m1964colorsJ08w3E(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @p4.m Composer composer, int i5, int i6) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        composer.startReplaceableGroup(-352515689);
        if ((i6 & 1) != 0) {
            j14 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        } else {
            j14 = j5;
        }
        if ((i6 & 2) != 0) {
            j15 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        } else {
            j15 = j6;
        }
        if ((i6 & 4) != 0) {
            j16 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLeadingIconColor(), composer, 6);
        } else {
            j16 = j7;
        }
        if ((i6 & 8) != 0) {
            j17 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemOverlineColor(), composer, 6);
        } else {
            j17 = j8;
        }
        if ((i6 & 16) != 0) {
            j18 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemSupportingTextColor(), composer, 6);
        } else {
            j18 = j9;
        }
        if ((i6 & 32) != 0) {
            j19 = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemTrailingIconColor(), composer, 6);
        } else {
            j19 = j10;
        }
        if ((i6 & 64) != 0) {
            ListTokens listTokens = ListTokens.INSTANCE;
            j20 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(listTokens.getListItemDisabledLabelTextColor(), composer, 6), listTokens.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j20 = j11;
        }
        if ((i6 & 128) != 0) {
            ListTokens listTokens2 = ListTokens.INSTANCE;
            j21 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(listTokens2.getListItemDisabledLeadingIconColor(), composer, 6), listTokens2.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j21 = j12;
        }
        if ((i6 & 256) != 0) {
            ListTokens listTokens3 = ListTokens.INSTANCE;
            j22 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(listTokens3.getListItemDisabledTrailingIconColor(), composer, 6), listTokens3.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j13;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-352515689, i5, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:439)");
        }
        ListItemColors listItemColors = new ListItemColors(j14, j15, j16, j17, j18, j19, j20, j21, j22, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listItemColors;
    }

    @u3.h(name = "getContainerColor")
    @Composable
    @ReadOnlyComposable
    public final long getContainerColor(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1253579929, i5, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:400)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @u3.h(name = "getContentColor")
    @Composable
    @ReadOnlyComposable
    public final long getContentColor(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1076068327, i5, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:405)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1965getElevationD9Ej5fM() {
        return Elevation;
    }

    @u3.h(name = "getShape")
    @p4.l
    @Composable
    @ReadOnlyComposable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-496871597, i5, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:395)");
        }
        Shape value = ShapesKt.getValue(ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}
