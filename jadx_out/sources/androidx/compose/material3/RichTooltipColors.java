package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@Stable
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/RichTooltipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RichTooltipColors;", "copy", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "getActionContentColor-0d7_KjU", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,719:1\n658#2:720\n646#2:721\n658#2:722\n646#2:723\n658#2:724\n646#2:725\n658#2:726\n646#2:727\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/RichTooltipColors\n*L\n466#1:720\n466#1:721\n467#1:722\n467#1:723\n468#1:724\n468#1:725\n469#1:726\n469#1:727\n*E\n"})
/* loaded from: classes.dex */
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    private RichTooltipColors(long j5, long j6, long j7, long j8) {
        this.containerColor = j5;
        this.contentColor = j6;
        this.titleContentColor = j7;
        this.actionContentColor = j8;
    }

    public /* synthetic */ RichTooltipColors(long j5, long j6, long j7, long j8, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RichTooltipColors m2100copyjRlVdoo$default(RichTooltipColors richTooltipColors, long j5, long j6, long j7, long j8, int i5, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i5 & 1) != 0) {
            j9 = richTooltipColors.containerColor;
        } else {
            j9 = j5;
        }
        if ((i5 & 2) != 0) {
            j10 = richTooltipColors.contentColor;
        } else {
            j10 = j6;
        }
        if ((i5 & 4) != 0) {
            j11 = richTooltipColors.titleContentColor;
        } else {
            j11 = j7;
        }
        if ((i5 & 8) != 0) {
            j12 = richTooltipColors.actionContentColor;
        } else {
            j12 = j8;
        }
        return richTooltipColors.m2101copyjRlVdoo(j9, j10, j11, j12);
    }

    @p4.l
    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RichTooltipColors m2101copyjRlVdoo(long j5, long j6, long j7, long j8) {
        boolean z4;
        long j9;
        boolean z5;
        long j10;
        boolean z6;
        long j11;
        long j12;
        Color.Companion companion = Color.Companion;
        boolean z7 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j9 = j5;
        } else {
            j9 = this.containerColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j10 = j6;
        } else {
            j10 = this.contentColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j11 = j7;
        } else {
            j11 = this.titleContentColor;
        }
        if (j8 == companion.m3770getUnspecified0d7_KjU()) {
            z7 = false;
        }
        if (z7) {
            j12 = j8;
        } else {
            j12 = this.actionContentColor;
        }
        return new RichTooltipColors(j9, j10, j11, j12, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        if (Color.m3735equalsimpl0(this.containerColor, richTooltipColors.containerColor) && Color.m3735equalsimpl0(this.contentColor, richTooltipColors.contentColor) && Color.m3735equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && Color.m3735equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActionContentColor-0d7_KjU, reason: not valid java name */
    public final long m2102getActionContentColor0d7_KjU() {
        return this.actionContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2103getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m2104getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m2105getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.contentColor)) * 31) + Color.m3741hashCodeimpl(this.titleContentColor)) * 31) + Color.m3741hashCodeimpl(this.actionContentColor);
    }
}
