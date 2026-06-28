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

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/DefaultChipColors;", "Landroidx/compose/material/ChipColors;", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor", "leadingIconContentColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
final class DefaultChipColors implements ChipColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;
    private final long disabledLeadingIconContentColor;
    private final long leadingIconContentColor;

    private DefaultChipColors(long j5, long j6, long j7, long j8, long j9, long j10) {
        this.backgroundColor = j5;
        this.contentColor = j6;
        this.leadingIconContentColor = j7;
        this.disabledBackgroundColor = j8;
        this.disabledContentColor = j9;
        this.disabledLeadingIconContentColor = j10;
    }

    public /* synthetic */ DefaultChipColors(long j5, long j6, long j7, long j8, long j9, long j10, w wVar) {
        this(j5, j6, j7, j8, j9, j10);
    }

    @Override // androidx.compose.material.ChipColors
    @l
    @Composable
    public State<Color> backgroundColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-1593588247);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1593588247, i5, -1, "androidx.compose.material.DefaultChipColors.backgroundColor (Chip.kt:599)");
        }
        if (z4) {
            j5 = this.backgroundColor;
        } else {
            j5 = this.disabledBackgroundColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.ChipColors
    @l
    @Composable
    public State<Color> contentColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(483145880);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(483145880, i5, -1, "androidx.compose.material.DefaultChipColors.contentColor (Chip.kt:604)");
        }
        if (z4) {
            j5 = this.contentColor;
        } else {
            j5 = this.disabledContentColor;
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
        if (obj == null || DefaultChipColors.class != obj.getClass()) {
            return false;
        }
        DefaultChipColors defaultChipColors = (DefaultChipColors) obj;
        if (Color.m3735equalsimpl0(this.backgroundColor, defaultChipColors.backgroundColor) && Color.m3735equalsimpl0(this.contentColor, defaultChipColors.contentColor) && Color.m3735equalsimpl0(this.leadingIconContentColor, defaultChipColors.leadingIconContentColor) && Color.m3735equalsimpl0(this.disabledBackgroundColor, defaultChipColors.disabledBackgroundColor) && Color.m3735equalsimpl0(this.disabledContentColor, defaultChipColors.disabledContentColor) && Color.m3735equalsimpl0(this.disabledLeadingIconContentColor, defaultChipColors.disabledLeadingIconContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((Color.m3741hashCodeimpl(this.backgroundColor) * 31) + Color.m3741hashCodeimpl(this.contentColor)) * 31) + Color.m3741hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLeadingIconContentColor);
    }

    @Override // androidx.compose.material.ChipColors
    @l
    @Composable
    public State<Color> leadingIconContentColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1955749013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955749013, i5, -1, "androidx.compose.material.DefaultChipColors.leadingIconContentColor (Chip.kt:609)");
        }
        if (z4) {
            j5 = this.leadingIconContentColor;
        } else {
            j5 = this.disabledLeadingIconContentColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
