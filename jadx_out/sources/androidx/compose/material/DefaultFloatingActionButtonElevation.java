package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/DefaultFloatingActionButtonElevation;", "Landroidx/compose/material/FloatingActionButtonElevation;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "elevation", "(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "defaultElevation", "F", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,413:1\n36#2:414\n1116#3,6:415\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n*L\n271#1:414\n271#1:415,6\n*E\n"})
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation implements FloatingActionButtonElevation {
    private final float defaultElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private DefaultFloatingActionButtonElevation(float f5, float f6, float f7, float f8) {
        this.defaultElevation = f5;
        this.pressedElevation = f6;
        this.hoveredElevation = f7;
        this.focusedElevation = f8;
    }

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f5, float f6, float f7, float f8, w wVar) {
        this(f5, f6, f7, f8);
    }

    @Override // androidx.compose.material.FloatingActionButtonElevation
    @l
    @Composable
    public State<Dp> elevation(@l InteractionSource interactionSource, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-478475335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-478475335, i5, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:269)");
        }
        int i6 = i5 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(interactionSource);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) rememberedValue;
        EffectsKt.LaunchedEffect(this, new DefaultFloatingActionButtonElevation$elevation$1(floatingActionButtonElevationAnimatable, this, null), composer, ((i5 >> 3) & 14) | 64);
        EffectsKt.LaunchedEffect(interactionSource, new DefaultFloatingActionButtonElevation$elevation$2(interactionSource, floatingActionButtonElevationAnimatable, null), composer, i6 | 64);
        State<Dp> asState = floatingActionButtonElevationAnimatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultFloatingActionButtonElevation)) {
            return false;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) obj;
        if (!Dp.m6049equalsimpl0(this.defaultElevation, defaultFloatingActionButtonElevation.defaultElevation) || !Dp.m6049equalsimpl0(this.pressedElevation, defaultFloatingActionButtonElevation.pressedElevation) || !Dp.m6049equalsimpl0(this.hoveredElevation, defaultFloatingActionButtonElevation.hoveredElevation)) {
            return false;
        }
        return Dp.m6049equalsimpl0(this.focusedElevation, defaultFloatingActionButtonElevation.focusedElevation);
    }

    public int hashCode() {
        return (((((Dp.m6050hashCodeimpl(this.defaultElevation) * 31) + Dp.m6050hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6050hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6050hashCodeimpl(this.focusedElevation);
    }
}
