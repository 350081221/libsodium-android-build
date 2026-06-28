package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\t\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u000b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0014\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\u001a\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "containerColor", "contentColor$material3_release", "contentColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "disabledContainerColor", "getDisabledContainerColor-0d7_KjU", "disabledContentColor", "getDisabledContentColor-0d7_KjU", "checkedContainerColor", "getCheckedContainerColor-0d7_KjU", "checkedContentColor", "getCheckedContentColor-0d7_KjU", "<init>", "(JJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private IconToggleButtonColors(long j5, long j6, long j7, long j8, long j9, long j10) {
        this.containerColor = j5;
        this.contentColor = j6;
        this.disabledContainerColor = j7;
        this.disabledContentColor = j8;
        this.checkedContainerColor = j9;
        this.checkedContentColor = j10;
    }

    public /* synthetic */ IconToggleButtonColors(long j5, long j6, long j7, long j8, long j9, long j10, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10);
    }

    @p4.l
    @Composable
    public final State<Color> containerColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1175394478);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i5, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:950)");
        }
        if (!z4) {
            j5 = this.disabledContainerColor;
        } else if (!z5) {
            j5 = this.containerColor;
        } else {
            j5 = this.checkedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    @Composable
    public final State<Color> contentColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1340854054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i5, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:966)");
        }
        if (!z4) {
            j5 = this.disabledContentColor;
        } else if (!z5) {
            j5 = this.contentColor;
        } else {
            j5 = this.checkedContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        if (Color.m3735equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m3735equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m3735equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m3735equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m3735equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m3735equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1927getCheckedContainerColor0d7_KjU() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name */
    public final long m1928getCheckedContentColor0d7_KjU() {
        return this.checkedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1929getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m1930getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m1931getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m1932getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return (((((((((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.contentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContentColor)) * 31) + Color.m3741hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.checkedContentColor);
    }
}
