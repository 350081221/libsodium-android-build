package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/ButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/ButtonColors;", "copy", "", "enabled", "containerColor-vNxB06k$material3_release", "(Z)J", "contentColor-vNxB06k$material3_release", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1068:1\n658#2:1069\n646#2:1070\n658#2:1071\n646#2:1072\n658#2:1073\n646#2:1074\n658#2:1075\n646#2:1076\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonColors\n*L\n1024#1:1069\n1024#1:1070\n1025#1:1071\n1025#1:1072\n1026#1:1073\n1026#1:1074\n1027#1:1075\n1027#1:1076\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private ButtonColors(long j5, long j6, long j7, long j8) {
        this.containerColor = j5;
        this.contentColor = j6;
        this.disabledContainerColor = j7;
        this.disabledContentColor = j8;
    }

    public /* synthetic */ ButtonColors(long j5, long j6, long j7, long j8, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ ButtonColors m1586copyjRlVdoo$default(ButtonColors buttonColors, long j5, long j6, long j7, long j8, int i5, Object obj) {
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i5 & 1) != 0) {
            j9 = buttonColors.containerColor;
        } else {
            j9 = j5;
        }
        if ((i5 & 2) != 0) {
            j10 = buttonColors.contentColor;
        } else {
            j10 = j6;
        }
        if ((i5 & 4) != 0) {
            j11 = buttonColors.disabledContainerColor;
        } else {
            j11 = j7;
        }
        if ((i5 & 8) != 0) {
            j12 = buttonColors.disabledContentColor;
        } else {
            j12 = j8;
        }
        return buttonColors.m1589copyjRlVdoo(j9, j10, j11, j12);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1587containerColorvNxB06k$material3_release(boolean z4) {
        return z4 ? this.containerColor : this.disabledContainerColor;
    }

    @Stable
    /* renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m1588contentColorvNxB06k$material3_release(boolean z4) {
        return z4 ? this.contentColor : this.disabledContentColor;
    }

    @p4.l
    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final ButtonColors m1589copyjRlVdoo(long j5, long j6, long j7, long j8) {
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
            j11 = this.disabledContainerColor;
        }
        if (j8 == companion.m3770getUnspecified0d7_KjU()) {
            z7 = false;
        }
        if (z7) {
            j12 = j8;
        } else {
            j12 = this.disabledContentColor;
        }
        return new ButtonColors(j9, j10, j11, j12, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        if (Color.m3735equalsimpl0(this.containerColor, buttonColors.containerColor) && Color.m3735equalsimpl0(this.contentColor, buttonColors.contentColor) && Color.m3735equalsimpl0(this.disabledContainerColor, buttonColors.disabledContainerColor) && Color.m3735equalsimpl0(this.disabledContentColor, buttonColors.disabledContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1590getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m1591getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1592getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m1593getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return (((((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.contentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContentColor);
    }
}
