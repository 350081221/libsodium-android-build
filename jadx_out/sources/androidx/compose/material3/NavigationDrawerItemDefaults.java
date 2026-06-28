package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "()V", "ItemPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "selectedContainerColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "colors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,948:1\n154#2:949\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerItemDefaults\n*L\n846#1:949\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();

    @p4.l
    private static final PaddingValues ItemPadding = PaddingKt.m548PaddingValuesYgX7TsA$default(Dp.m6044constructorimpl(12), 0.0f, 2, null);

    private NavigationDrawerItemDefaults() {
    }

    @p4.l
    @Composable
    /* renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m2024colorsoq7We08(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @p4.m Composer composer, int i5, int i6) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        composer.startReplaceableGroup(-1574983348);
        if ((i6 & 1) != 0) {
            j13 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        } else {
            j13 = j5;
        }
        if ((i6 & 2) != 0) {
            j14 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j14 = j6;
        }
        if ((i6 & 4) != 0) {
            j15 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), composer, 6);
        } else {
            j15 = j7;
        }
        if ((i6 & 8) != 0) {
            j16 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), composer, 6);
        } else {
            j16 = j8;
        }
        if ((i6 & 16) != 0) {
            j17 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        } else {
            j17 = j9;
        }
        if ((i6 & 32) != 0) {
            j18 = ColorSchemeKt.getValue(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), composer, 6);
        } else {
            j18 = j10;
        }
        if ((i6 & 64) != 0) {
            j19 = j17;
        } else {
            j19 = j11;
        }
        if ((i6 & 128) != 0) {
            j20 = j18;
        } else {
            j20 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574983348, i5, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:830)");
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(j15, j16, j17, j18, j13, j14, j19, j20, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultDrawerItemsColor;
    }

    @p4.l
    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
