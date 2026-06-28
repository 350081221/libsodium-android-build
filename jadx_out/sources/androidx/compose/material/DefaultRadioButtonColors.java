package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
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
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "radioColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "selectedColor", "J", "unselectedColor", "disabledColor", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    private DefaultRadioButtonColors(long j5, long j6, long j7) {
        this.selectedColor = j5;
        this.unselectedColor = j6;
        this.disabledColor = j7;
    }

    public /* synthetic */ DefaultRadioButtonColors(long j5, long j6, long j7, w wVar) {
        this(j5, j6, j7);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultRadioButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        if (Color.m3735equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.m3735equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.m3735equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Color.m3741hashCodeimpl(this.selectedColor) * 31) + Color.m3741hashCodeimpl(this.unselectedColor)) * 31) + Color.m3741hashCodeimpl(this.disabledColor);
    }

    @Override // androidx.compose.material.RadioButtonColors
    @l
    @Composable
    public State<Color> radioColor(boolean z4, boolean z5, @m Composer composer, int i5) {
        long j5;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i5, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z4) {
            j5 = this.disabledColor;
        } else if (!z5) {
            j5 = this.unselectedColor;
        } else {
            j5 = this.selectedColor;
        }
        long j6 = j5;
        if (z4) {
            composer.startReplaceableGroup(-1052799107);
            rememberUpdatedState = SingleValueAnimationKt.m96animateColorAsStateeuL9pac(j6, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j6), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
