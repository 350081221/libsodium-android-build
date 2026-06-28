package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/ChipBorder;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "borderStroke$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "borderStroke", "other", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/graphics/Color;", "borderColor", "J", "disabledBorderColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "F", "<init>", "(JJFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@kotlin.k(level = kotlin.m.WARNING, message = "Maintained for binary compatibility. Use the chipBorder functions instead")
/* loaded from: classes.dex */
public final class ChipBorder {
    public static final int $stable = 0;
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    private ChipBorder(long j5, long j6, float f5) {
        this.borderColor = j5;
        this.disabledBorderColor = j6;
        this.borderWidth = f5;
    }

    public /* synthetic */ ChipBorder(long j5, long j6, float f5, kotlin.jvm.internal.w wVar) {
        this(j5, j6, f5);
    }

    @p4.l
    @Composable
    public final State<BorderStroke> borderStroke$material3_release(boolean z4, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(1899621712);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i5, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2677)");
        }
        float f5 = this.borderWidth;
        if (z4) {
            j5 = this.borderColor;
        } else {
            j5 = this.disabledBorderColor;
        }
        State<BorderStroke> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m228BorderStrokecXLIe8U(f5, j5), composer, 0);
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
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        if (Color.m3735equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m3735equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && Dp.m6049equalsimpl0(this.borderWidth, chipBorder.borderWidth)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m3741hashCodeimpl(this.borderColor) * 31) + Color.m3741hashCodeimpl(this.disabledBorderColor)) * 31) + Dp.m6050hashCodeimpl(this.borderWidth);
    }
}
