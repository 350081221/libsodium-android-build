package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@Stable
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&JV\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010$\u001a\u00020\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b#\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/NavigationRailItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "selectedIconColor", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "copy-4JmcsL4", "(JJJJJJJ)Landroidx/compose/material3/NavigationRailItemColors;", "copy", "", "selected", "enabled", "Landroidx/compose/runtime/State;", "iconColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "iconColor", "textColor$material3_release", "textColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getSelectedIconColor-0d7_KjU", "()J", "getSelectedTextColor-0d7_KjU", "getSelectedIndicatorColor-0d7_KjU", "getUnselectedIconColor-0d7_KjU", "getUnselectedTextColor-0d7_KjU", "getDisabledIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getIndicatorColor-0d7_KjU$material3_release", "indicatorColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nNavigationRail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,742:1\n658#2:743\n646#2:744\n658#2:745\n646#2:746\n658#2:747\n646#2:748\n658#2:749\n646#2:750\n658#2:751\n646#2:752\n658#2:753\n646#2:754\n658#2:755\n646#2:756\n*S KotlinDebug\n*F\n+ 1 NavigationRail.kt\nandroidx/compose/material3/NavigationRailItemColors\n*L\n403#1:743\n403#1:744\n404#1:745\n404#1:746\n405#1:747\n405#1:748\n406#1:749\n406#1:750\n407#1:751\n407#1:752\n408#1:753\n408#1:754\n409#1:755\n409#1:756\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationRailItemColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.selectedIconColor = j5;
        this.selectedTextColor = j6;
        this.selectedIndicatorColor = j7;
        this.unselectedIconColor = j8;
        this.unselectedTextColor = j9;
        this.disabledIconColor = j10;
        this.disabledTextColor = j11;
    }

    public /* synthetic */ NavigationRailItemColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11);
    }

    /* renamed from: copy-4JmcsL4$default, reason: not valid java name */
    public static /* synthetic */ NavigationRailItemColors m2035copy4JmcsL4$default(NavigationRailItemColors navigationRailItemColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i5, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        if ((i5 & 1) != 0) {
            j12 = navigationRailItemColors.selectedIconColor;
        } else {
            j12 = j5;
        }
        if ((i5 & 2) != 0) {
            j13 = navigationRailItemColors.selectedTextColor;
        } else {
            j13 = j6;
        }
        if ((i5 & 4) != 0) {
            j14 = navigationRailItemColors.selectedIndicatorColor;
        } else {
            j14 = j7;
        }
        if ((i5 & 8) != 0) {
            j15 = navigationRailItemColors.unselectedIconColor;
        } else {
            j15 = j8;
        }
        if ((i5 & 16) != 0) {
            j16 = navigationRailItemColors.unselectedTextColor;
        } else {
            j16 = j9;
        }
        if ((i5 & 32) != 0) {
            j17 = navigationRailItemColors.disabledIconColor;
        } else {
            j17 = j10;
        }
        if ((i5 & 64) != 0) {
            j18 = navigationRailItemColors.disabledTextColor;
        } else {
            j18 = j11;
        }
        return navigationRailItemColors.m2036copy4JmcsL4(j12, j13, j14, j15, j16, j17, j18);
    }

    @p4.l
    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationRailItemColors m2036copy4JmcsL4(long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        boolean z4;
        long j12;
        boolean z5;
        long j13;
        boolean z6;
        long j14;
        boolean z7;
        long j15;
        boolean z8;
        long j16;
        boolean z9;
        long j17;
        long j18;
        Color.Companion companion = Color.Companion;
        boolean z10 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j12 = j5;
        } else {
            j12 = this.selectedIconColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j13 = j6;
        } else {
            j13 = this.selectedTextColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j14 = j7;
        } else {
            j14 = this.selectedIndicatorColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j15 = j8;
        } else {
            j15 = this.unselectedIconColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j16 = j9;
        } else {
            j16 = this.unselectedTextColor;
        }
        if (j10 != companion.m3770getUnspecified0d7_KjU()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j17 = j10;
        } else {
            j17 = this.disabledIconColor;
        }
        if (j11 == companion.m3770getUnspecified0d7_KjU()) {
            z10 = false;
        }
        if (z10) {
            j18 = j11;
        } else {
            j18 = this.disabledTextColor;
        }
        return new NavigationRailItemColors(j12, j13, j14, j15, j16, j17, j18, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        if (Color.m3735equalsimpl0(this.selectedIconColor, navigationRailItemColors.selectedIconColor) && Color.m3735equalsimpl0(this.unselectedIconColor, navigationRailItemColors.unselectedIconColor) && Color.m3735equalsimpl0(this.selectedTextColor, navigationRailItemColors.selectedTextColor) && Color.m3735equalsimpl0(this.unselectedTextColor, navigationRailItemColors.unselectedTextColor) && Color.m3735equalsimpl0(this.selectedIndicatorColor, navigationRailItemColors.selectedIndicatorColor) && Color.m3735equalsimpl0(this.disabledIconColor, navigationRailItemColors.disabledIconColor) && Color.m3735equalsimpl0(this.disabledTextColor, navigationRailItemColors.disabledTextColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2037getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2038getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m2039getIndicatorColor0d7_KjU$material3_release() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2040getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m2041getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2042getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m2043getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m2044getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        return (((((((((((Color.m3741hashCodeimpl(this.selectedIconColor) * 31) + Color.m3741hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m3741hashCodeimpl(this.selectedTextColor)) * 31) + Color.m3741hashCodeimpl(this.unselectedTextColor)) * 31) + Color.m3741hashCodeimpl(this.selectedIndicatorColor)) * 31) + Color.m3741hashCodeimpl(this.disabledIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTextColor);
    }

    @p4.l
    @Composable
    public final State<Color> iconColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(2131995553);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2131995553, i5, -1, "androidx.compose.material3.NavigationRailItemColors.iconColor (NavigationRail.kt:418)");
        }
        if (!z5) {
            j5 = this.disabledIconColor;
        } else if (z4) {
            j5 = this.selectedIconColor;
        } else {
            j5 = this.unselectedIconColor;
        }
        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j5, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }

    @p4.l
    @Composable
    public final State<Color> textColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-758555563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-758555563, i5, -1, "androidx.compose.material3.NavigationRailItemColors.textColor (NavigationRail.kt:437)");
        }
        if (!z5) {
            j5 = this.disabledTextColor;
        } else if (z4) {
            j5 = this.selectedTextColor;
        } else {
            j5 = this.unselectedTextColor;
        }
        State<Color> m96animateColorAsStateeuL9pac = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j5, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }
}
