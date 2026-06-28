package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b \u0010!JL\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/MenuItemColors;", "", "Landroidx/compose/ui/graphics/Color;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/MenuItemColors;", "copy", "", "enabled", "Landroidx/compose/runtime/State;", "textColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "leadingIconColor-XeAY9LY$material3_release", "(ZLandroidx/compose/runtime/Composer;I)J", "trailingIconColor-XeAY9LY$material3_release", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getTextColor-0d7_KjU", "()J", "getLeadingIconColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "<init>", "(JJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,407:1\n658#2:408\n646#2:409\n658#2:410\n646#2:411\n658#2:412\n646#2:413\n658#2:414\n646#2:415\n658#2:416\n646#2:417\n658#2:418\n646#2:419\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material3/MenuItemColors\n*L\n165#1:408\n165#1:409\n166#1:410\n166#1:411\n167#1:412\n167#1:413\n168#1:414\n168#1:415\n169#1:416\n169#1:417\n170#1:418\n170#1:419\n*E\n"})
/* loaded from: classes.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    private MenuItemColors(long j5, long j6, long j7, long j8, long j9, long j10) {
        this.textColor = j5;
        this.leadingIconColor = j6;
        this.trailingIconColor = j7;
        this.disabledTextColor = j8;
        this.disabledLeadingIconColor = j9;
        this.disabledTrailingIconColor = j10;
    }

    public /* synthetic */ MenuItemColors(long j5, long j6, long j7, long j8, long j9, long j10, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m1988copytNS2XkQ$default(MenuItemColors menuItemColors, long j5, long j6, long j7, long j8, long j9, long j10, int i5, Object obj) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        if ((i5 & 1) != 0) {
            j11 = menuItemColors.textColor;
        } else {
            j11 = j5;
        }
        if ((i5 & 2) != 0) {
            j12 = menuItemColors.leadingIconColor;
        } else {
            j12 = j6;
        }
        if ((i5 & 4) != 0) {
            j13 = menuItemColors.trailingIconColor;
        } else {
            j13 = j7;
        }
        if ((i5 & 8) != 0) {
            j14 = menuItemColors.disabledTextColor;
        } else {
            j14 = j8;
        }
        if ((i5 & 16) != 0) {
            j15 = menuItemColors.disabledLeadingIconColor;
        } else {
            j15 = j9;
        }
        if ((i5 & 32) != 0) {
            j16 = menuItemColors.disabledTrailingIconColor;
        } else {
            j16 = j10;
        }
        return menuItemColors.m1989copytNS2XkQ(j11, j12, j13, j14, j15, j16);
    }

    @p4.l
    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m1989copytNS2XkQ(long j5, long j6, long j7, long j8, long j9, long j10) {
        boolean z4;
        long j11;
        boolean z5;
        long j12;
        boolean z6;
        long j13;
        boolean z7;
        long j14;
        boolean z8;
        long j15;
        long j16;
        Color.Companion companion = Color.Companion;
        boolean z9 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j11 = j5;
        } else {
            j11 = this.textColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j12 = j6;
        } else {
            j12 = this.leadingIconColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j13 = j7;
        } else {
            j13 = this.trailingIconColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j14 = j8;
        } else {
            j14 = this.disabledTextColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j15 = j9;
        } else {
            j15 = this.disabledLeadingIconColor;
        }
        if (j10 == companion.m3770getUnspecified0d7_KjU()) {
            z9 = false;
        }
        if (z9) {
            j16 = j10;
        } else {
            j16 = this.disabledTrailingIconColor;
        }
        return new MenuItemColors(j11, j12, j13, j14, j15, j16, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        if (Color.m3735equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m3735equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m3735equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m3735equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m3735equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m3735equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m1990getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m1991getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m1992getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m1993getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m1994getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m1995getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    public int hashCode() {
        return (((((((((Color.m3741hashCodeimpl(this.textColor) * 31) + Color.m3741hashCodeimpl(this.leadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.trailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTextColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTrailingIconColor);
    }

    @Composable
    /* renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m1996leadingIconColorXeAY9LY$material3_release(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-395881771);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-395881771, i5, -1, "androidx.compose.material3.MenuItemColors.leadingIconColor (Menu.kt:189)");
        }
        if (z4) {
            j5 = this.leadingIconColor;
        } else {
            j5 = this.disabledLeadingIconColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j5;
    }

    @p4.l
    @Composable
    public final State<Color> textColor$material3_release(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1023108655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1023108655, i5, -1, "androidx.compose.material3.MenuItemColors.textColor (Menu.kt:178)");
        }
        if (z4) {
            j5 = this.textColor;
        } else {
            j5 = this.disabledTextColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Composable
    /* renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m1997trailingIconColorXeAY9LY$material3_release(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-892832569);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-892832569, i5, -1, "androidx.compose.material3.MenuItemColors.trailingIconColor (Menu.kt:198)");
        }
        if (z4) {
            j5 = this.trailingIconColor;
        } else {
            j5 = this.disabledTrailingIconColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j5;
    }
}
