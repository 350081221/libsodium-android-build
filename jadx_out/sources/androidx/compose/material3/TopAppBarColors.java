package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/TopAppBarColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "copy-t635Npw", "(JJJJJ)Landroidx/compose/material3/TopAppBarColors;", "copy", "", "colorTransitionFraction", "containerColor-vNxB06k$material3_release", "(F)J", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getContainerColor-0d7_KjU", "()J", "getScrolledContainerColor-0d7_KjU", "getNavigationIconContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "getActionIconContentColor-0d7_KjU", "<init>", "(JJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2283:1\n658#2:2284\n646#2:2285\n658#2:2286\n646#2:2287\n658#2:2288\n646#2:2289\n658#2:2290\n646#2:2291\n658#2:2292\n646#2:2293\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarColors\n*L\n1198#1:2284\n1198#1:2285\n1199#1:2286\n1199#1:2287\n1200#1:2288\n1200#1:2289\n1201#1:2290\n1201#1:2291\n1202#1:2292\n1202#1:2293\n*E\n"})
/* loaded from: classes.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long titleContentColor;

    private TopAppBarColors(long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j5;
        this.scrolledContainerColor = j6;
        this.navigationIconContentColor = j7;
        this.titleContentColor = j8;
        this.actionIconContentColor = j9;
    }

    public /* synthetic */ TopAppBarColors(long j5, long j6, long j7, long j8, long j9, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m2599copyt635Npw$default(TopAppBarColors topAppBarColors, long j5, long j6, long j7, long j8, long j9, int i5, Object obj) {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if ((i5 & 1) != 0) {
            j10 = topAppBarColors.containerColor;
        } else {
            j10 = j5;
        }
        if ((i5 & 2) != 0) {
            j11 = topAppBarColors.scrolledContainerColor;
        } else {
            j11 = j6;
        }
        if ((i5 & 4) != 0) {
            j12 = topAppBarColors.navigationIconContentColor;
        } else {
            j12 = j7;
        }
        if ((i5 & 8) != 0) {
            j13 = topAppBarColors.titleContentColor;
        } else {
            j13 = j8;
        }
        if ((i5 & 16) != 0) {
            j14 = topAppBarColors.actionIconContentColor;
        } else {
            j14 = j9;
        }
        return topAppBarColors.m2601copyt635Npw(j10, j11, j12, j13, j14);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2600containerColorvNxB06k$material3_release(float f5) {
        return ColorKt.m3785lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f5));
    }

    @p4.l
    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final TopAppBarColors m2601copyt635Npw(long j5, long j6, long j7, long j8, long j9) {
        boolean z4;
        long j10;
        boolean z5;
        long j11;
        boolean z6;
        long j12;
        boolean z7;
        long j13;
        long j14;
        Color.Companion companion = Color.Companion;
        boolean z8 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j10 = j5;
        } else {
            j10 = this.containerColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j11 = j6;
        } else {
            j11 = this.scrolledContainerColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j12 = j7;
        } else {
            j12 = this.navigationIconContentColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j13 = j8;
        } else {
            j13 = this.titleContentColor;
        }
        if (j9 == companion.m3770getUnspecified0d7_KjU()) {
            z8 = false;
        }
        if (z8) {
            j14 = j9;
        } else {
            j14 = this.actionIconContentColor;
        }
        return new TopAppBarColors(j10, j11, j12, j13, j14, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        if (Color.m3735equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m3735equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m3735equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m3735equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m3735equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2602getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2603getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m2604getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2605getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2606getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m3741hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m3741hashCodeimpl(this.titleContentColor)) * 31) + Color.m3741hashCodeimpl(this.actionIconContentColor);
    }
}
