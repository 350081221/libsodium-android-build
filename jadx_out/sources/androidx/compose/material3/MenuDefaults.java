package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\rJN\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "()V", "DropdownMenuItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "defaultMenuItemColors", "Landroidx/compose/material3/MenuItemColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultMenuItemColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/MenuItemColors;", "itemColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/MenuItemColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "itemColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,407:1\n154#2:408\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuDefaults\n*L\n123#1:408\n*E\n"})
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;

    @p4.l
    private static final PaddingValues DropdownMenuItemContentPadding;

    @p4.l
    public static final MenuDefaults INSTANCE = new MenuDefaults();

    static {
        float f5;
        f5 = MenuKt.DropdownMenuItemHorizontalPadding;
        DropdownMenuItemContentPadding = PaddingKt.m547PaddingValuesYgX7TsA(f5, Dp.m6044constructorimpl(0));
    }

    private MenuDefaults() {
    }

    @p4.l
    public final MenuItemColors getDefaultMenuItemColors$material3_release(@p4.l ColorScheme colorScheme) {
        MenuItemColors defaultMenuItemColorsCached$material3_release = colorScheme.getDefaultMenuItemColorsCached$material3_release();
        if (defaultMenuItemColorsCached$material3_release == null) {
            MenuTokens menuTokens = MenuTokens.INSTANCE;
            MenuItemColors menuItemColors = new MenuItemColors(ColorSchemeKt.fromToken(colorScheme, menuTokens.getListItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, menuTokens.getListItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, menuTokens.getListItemTrailingIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, menuTokens.getListItemDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, menuTokens.getListItemDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, menuTokens.getListItemDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultMenuItemColorsCached$material3_release(menuItemColors);
            return menuItemColors;
        }
        return defaultMenuItemColorsCached$material3_release;
    }

    @p4.l
    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }

    @p4.l
    @Composable
    public final MenuItemColors itemColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1326531516);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1326531516, i5, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:67)");
        }
        MenuItemColors defaultMenuItemColors$material3_release = getDefaultMenuItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultMenuItemColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final MenuItemColors m1987itemColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(-1278543580);
        if ((i6 & 1) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1278543580, i5, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:91)");
        }
        MenuItemColors m1989copytNS2XkQ = getDefaultMenuItemColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1989copytNS2XkQ(j11, j12, j13, j14, j15, j16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1989copytNS2XkQ;
    }
}
