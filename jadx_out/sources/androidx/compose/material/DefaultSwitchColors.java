package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/DefaultSwitchColors;", "Landroidx/compose/material/SwitchColors;", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "checkedThumbColor", "J", "checkedTrackColor", "uncheckedThumbColor", "uncheckedTrackColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
final class DefaultSwitchColors implements SwitchColors {
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private DefaultSwitchColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.checkedThumbColor = j5;
        this.checkedTrackColor = j6;
        this.uncheckedThumbColor = j7;
        this.uncheckedTrackColor = j8;
        this.disabledCheckedThumbColor = j9;
        this.disabledCheckedTrackColor = j10;
        this.disabledUncheckedThumbColor = j11;
        this.disabledUncheckedTrackColor = j12;
    }

    public /* synthetic */ DefaultSwitchColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSwitchColors.class != obj.getClass()) {
            return false;
        }
        DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) obj;
        if (Color.m3735equalsimpl0(this.checkedThumbColor, defaultSwitchColors.checkedThumbColor) && Color.m3735equalsimpl0(this.checkedTrackColor, defaultSwitchColors.checkedTrackColor) && Color.m3735equalsimpl0(this.uncheckedThumbColor, defaultSwitchColors.uncheckedThumbColor) && Color.m3735equalsimpl0(this.uncheckedTrackColor, defaultSwitchColors.uncheckedTrackColor) && Color.m3735equalsimpl0(this.disabledCheckedThumbColor, defaultSwitchColors.disabledCheckedThumbColor) && Color.m3735equalsimpl0(this.disabledCheckedTrackColor, defaultSwitchColors.disabledCheckedTrackColor) && Color.m3735equalsimpl0(this.disabledUncheckedThumbColor, defaultSwitchColors.disabledUncheckedThumbColor) && Color.m3735equalsimpl0(this.disabledUncheckedTrackColor, defaultSwitchColors.disabledUncheckedTrackColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((Color.m3741hashCodeimpl(this.checkedThumbColor) * 31) + Color.m3741hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m3741hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m3741hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m3741hashCodeimpl(this.disabledUncheckedTrackColor);
    }

    @Override // androidx.compose.material.SwitchColors
    @l
    @Composable
    public State<Color> thumbColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-66424183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66424183, i5, -1, "androidx.compose.material.DefaultSwitchColors.thumbColor (Switch.kt:367)");
        }
        if (z4) {
            if (z5) {
                j5 = this.checkedThumbColor;
            } else {
                j5 = this.uncheckedThumbColor;
            }
        } else if (z5) {
            j5 = this.disabledCheckedThumbColor;
        } else {
            j5 = this.disabledUncheckedThumbColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SwitchColors
    @l
    @Composable
    public State<Color> trackColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1176343362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1176343362, i5, -1, "androidx.compose.material.DefaultSwitchColors.trackColor (Switch.kt:378)");
        }
        if (z4) {
            if (z5) {
                j5 = this.checkedTrackColor;
            } else {
                j5 = this.uncheckedTrackColor;
            }
        } else if (z5) {
            j5 = this.disabledCheckedTrackColor;
        } else {
            j5 = this.disabledUncheckedTrackColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
