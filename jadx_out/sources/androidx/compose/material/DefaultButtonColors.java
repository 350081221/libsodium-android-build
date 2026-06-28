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
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/DefaultButtonColors;", "Landroidx/compose/material/ButtonColors;", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class DefaultButtonColors implements ButtonColors {
    private final long backgroundColor;
    private final long contentColor;
    private final long disabledBackgroundColor;
    private final long disabledContentColor;

    private DefaultButtonColors(long j5, long j6, long j7, long j8) {
        this.backgroundColor = j5;
        this.contentColor = j6;
        this.disabledBackgroundColor = j7;
        this.disabledContentColor = j8;
    }

    public /* synthetic */ DefaultButtonColors(long j5, long j6, long j7, long j8, w wVar) {
        this(j5, j6, j7, j8);
    }

    @Override // androidx.compose.material.ButtonColors
    @l
    @Composable
    public State<Color> backgroundColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-655254499);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655254499, i5, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:585)");
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

    @Override // androidx.compose.material.ButtonColors
    @l
    @Composable
    public State<Color> contentColor(boolean z4, @m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-2133647540);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2133647540, i5, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:590)");
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
        if (obj == null || DefaultButtonColors.class != obj.getClass()) {
            return false;
        }
        DefaultButtonColors defaultButtonColors = (DefaultButtonColors) obj;
        if (Color.m3735equalsimpl0(this.backgroundColor, defaultButtonColors.backgroundColor) && Color.m3735equalsimpl0(this.contentColor, defaultButtonColors.contentColor) && Color.m3735equalsimpl0(this.disabledBackgroundColor, defaultButtonColors.disabledBackgroundColor) && Color.m3735equalsimpl0(this.disabledContentColor, defaultButtonColors.disabledContentColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Color.m3741hashCodeimpl(this.backgroundColor) * 31) + Color.m3741hashCodeimpl(this.contentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContentColor);
    }
}
