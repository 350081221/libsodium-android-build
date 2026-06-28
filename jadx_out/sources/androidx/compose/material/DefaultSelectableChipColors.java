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

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\bJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/DefaultSelectableChipColors;", "Landroidx/compose/material/SelectableChipColors;", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor", "leadingIconColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
final class DefaultSelectableChipColors implements SelectableChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconColor;
    private final long leadingIconColor;
    private final long selectedBackgroundColor;
    private final long selectedContentColor;
    private final long selectedLeadingIconColor;

    private DefaultSelectableChipColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.backgroundColor = j5;
        this.contentColor = j6;
        this.leadingIconColor = j7;
        this.disabledBackgroundColor = j8;
        this.disabledContentColor = j9;
        this.disabledLeadingIconColor = j10;
        this.selectedBackgroundColor = j11;
        this.selectedContentColor = j12;
        this.selectedLeadingIconColor = j13;
    }

    public /* synthetic */ DefaultSelectableChipColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @l
    @Composable
    public State<Color> backgroundColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-403836585);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-403836585, i5, -1, "androidx.compose.material.DefaultSelectableChipColors.backgroundColor (Chip.kt:661)");
        }
        if (!z4) {
            j5 = this.disabledBackgroundColor;
        } else if (!z5) {
            j5 = this.backgroundColor;
        } else {
            j5 = this.selectedBackgroundColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.SelectableChipColors
    @l
    @Composable
    public State<Color> contentColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(2025240134);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025240134, i5, -1, "androidx.compose.material.DefaultSelectableChipColors.contentColor (Chip.kt:671)");
        }
        if (!z4) {
            j5 = this.disabledContentColor;
        } else if (!z5) {
            j5 = this.contentColor;
        } else {
            j5 = this.selectedContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultSelectableChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultSelectableChipColors defaultSelectableChipColors = (DefaultSelectableChipColors) obj;
        if (Color.m3735equalsimpl0(this.backgroundColor, defaultSelectableChipColors.backgroundColor) && Color.m3735equalsimpl0(this.contentColor, defaultSelectableChipColors.contentColor) && Color.m3735equalsimpl0(this.leadingIconColor, defaultSelectableChipColors.leadingIconColor) && Color.m3735equalsimpl0(this.disabledBackgroundColor, defaultSelectableChipColors.disabledBackgroundColor) && Color.m3735equalsimpl0(this.disabledContentColor, defaultSelectableChipColors.disabledContentColor) && Color.m3735equalsimpl0(this.disabledLeadingIconColor, defaultSelectableChipColors.disabledLeadingIconColor) && Color.m3735equalsimpl0(this.selectedBackgroundColor, defaultSelectableChipColors.selectedBackgroundColor) && Color.m3735equalsimpl0(this.selectedContentColor, defaultSelectableChipColors.selectedContentColor) && Color.m3735equalsimpl0(this.selectedLeadingIconColor, defaultSelectableChipColors.selectedLeadingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((Color.m3741hashCodeimpl(this.backgroundColor) * 31) + Color.m3741hashCodeimpl(this.contentColor)) * 31) + Color.m3741hashCodeimpl(this.leadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.selectedBackgroundColor)) * 31) + Color.m3741hashCodeimpl(this.selectedContentColor)) * 31) + Color.m3741hashCodeimpl(this.selectedLeadingIconColor);
    }

    @Override // androidx.compose.material.SelectableChipColors
    @l
    @Composable
    public State<Color> leadingIconColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(189838188);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(189838188, i5, -1, "androidx.compose.material.DefaultSelectableChipColors.leadingIconColor (Chip.kt:681)");
        }
        if (!z4) {
            j5 = this.disabledLeadingIconColor;
        } else if (!z5) {
            j5 = this.leadingIconColor;
        } else {
            j5 = this.selectedLeadingIconColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
