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

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/material/DefaultSliderColors;", "Landroidx/compose/material/SliderColors;", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "active", "trackColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tickColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "<init>", "(JJJJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class DefaultSliderColors implements SliderColors {
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    private DefaultSliderColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.thumbColor = j5;
        this.disabledThumbColor = j6;
        this.activeTrackColor = j7;
        this.inactiveTrackColor = j8;
        this.disabledActiveTrackColor = j9;
        this.disabledInactiveTrackColor = j10;
        this.activeTickColor = j11;
        this.inactiveTickColor = j12;
        this.disabledActiveTickColor = j13;
        this.disabledInactiveTickColor = j14;
    }

    public /* synthetic */ DefaultSliderColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSliderColors.class != obj.getClass()) {
            return false;
        }
        DefaultSliderColors defaultSliderColors = (DefaultSliderColors) obj;
        if (Color.m3735equalsimpl0(this.thumbColor, defaultSliderColors.thumbColor) && Color.m3735equalsimpl0(this.disabledThumbColor, defaultSliderColors.disabledThumbColor) && Color.m3735equalsimpl0(this.activeTrackColor, defaultSliderColors.activeTrackColor) && Color.m3735equalsimpl0(this.inactiveTrackColor, defaultSliderColors.inactiveTrackColor) && Color.m3735equalsimpl0(this.disabledActiveTrackColor, defaultSliderColors.disabledActiveTrackColor) && Color.m3735equalsimpl0(this.disabledInactiveTrackColor, defaultSliderColors.disabledInactiveTrackColor) && Color.m3735equalsimpl0(this.activeTickColor, defaultSliderColors.activeTickColor) && Color.m3735equalsimpl0(this.inactiveTickColor, defaultSliderColors.inactiveTickColor) && Color.m3735equalsimpl0(this.disabledActiveTickColor, defaultSliderColors.disabledActiveTickColor) && Color.m3735equalsimpl0(this.disabledInactiveTickColor, defaultSliderColors.disabledInactiveTickColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((Color.m3741hashCodeimpl(this.thumbColor) * 31) + Color.m3741hashCodeimpl(this.disabledThumbColor)) * 31) + Color.m3741hashCodeimpl(this.activeTrackColor)) * 31) + Color.m3741hashCodeimpl(this.inactiveTrackColor)) * 31) + Color.m3741hashCodeimpl(this.disabledActiveTrackColor)) * 31) + Color.m3741hashCodeimpl(this.disabledInactiveTrackColor)) * 31) + Color.m3741hashCodeimpl(this.activeTickColor)) * 31) + Color.m3741hashCodeimpl(this.inactiveTickColor)) * 31) + Color.m3741hashCodeimpl(this.disabledActiveTickColor)) * 31) + Color.m3741hashCodeimpl(this.disabledInactiveTickColor);
    }

    @Override // androidx.compose.material.SliderColors
    @l
    @Composable
    public State<Color> thumbColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1733795637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1733795637, i5, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1090)");
        }
        if (z4) {
            j5 = this.thumbColor;
        } else {
            j5 = this.disabledThumbColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @l
    @Composable
    public State<Color> tickColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1491563694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1491563694, i5, -1, "androidx.compose.material.DefaultSliderColors.tickColor (Slider.kt:1106)");
        }
        if (z4) {
            if (z5) {
                j5 = this.activeTickColor;
            } else {
                j5 = this.inactiveTickColor;
            }
        } else if (z5) {
            j5 = this.disabledActiveTickColor;
        } else {
            j5 = this.disabledInactiveTickColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SliderColors
    @l
    @Composable
    public State<Color> trackColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1575395620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1575395620, i5, -1, "androidx.compose.material.DefaultSliderColors.trackColor (Slider.kt:1095)");
        }
        if (z4) {
            if (z5) {
                j5 = this.activeTrackColor;
            } else {
                j5 = this.inactiveTrackColor;
            }
        } else if (z5) {
            j5 = this.disabledActiveTrackColor;
        } else {
            j5 = this.disabledInactiveTrackColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
