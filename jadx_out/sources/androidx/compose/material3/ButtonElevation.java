package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@Stable
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateElevation", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tonalElevation-u2uoSUM$material3_release", "(Z)F", "tonalElevation", "shadowElevation$material3_release", "shadowElevation", "other", "equals", "", TTDownloadField.TT_HASHCODE, "defaultElevation", "F", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1068:1\n1116#2,6:1069\n1116#2,6:1075\n1116#2,6:1081\n1116#2,6:1087\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n*L\n897#1:1069,6\n898#1:1075,6\n946#1:1081,6\n948#1:1087,6\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonElevation {
    public static final int $stable = 0;
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private ButtonElevation(float f5, float f6, float f7, float f8, float f9) {
        this.defaultElevation = f5;
        this.pressedElevation = f6;
        this.focusedElevation = f7;
        this.hoveredElevation = f8;
        this.disabledElevation = f9;
    }

    public /* synthetic */ ButtonElevation(float f5, float f6, float f7, float f8, float f9, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7, f8, f9);
    }

    @Composable
    private final State<Dp> animateElevation(boolean z4, InteractionSource interactionSource, Composer composer, int i5) {
        boolean z5;
        Object s32;
        float f5;
        boolean z6;
        composer.startReplaceableGroup(-1312510462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1312510462, i5, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:895)");
        }
        composer.startReplaceableGroup(-719928578);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-719928489);
        boolean z7 = true;
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z5 || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ButtonElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue2, composer, (i5 >> 3) & 14);
        s32 = kotlin.collections.e0.s3(snapshotStateList);
        Interaction interaction = (Interaction) s32;
        if (!z4) {
            f5 = this.disabledElevation;
        } else if (interaction instanceof PressInteraction.Press) {
            f5 = this.pressedElevation;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f5 = this.hoveredElevation;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f5 = this.focusedElevation;
        } else {
            f5 = this.defaultElevation;
        }
        float f6 = f5;
        composer.startReplaceableGroup(-719926909);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(Dp.m6042boximpl(f6), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        Animatable animatable = (Animatable) rememberedValue3;
        composer.endReplaceableGroup();
        Dp m6042boximpl = Dp.m6042boximpl(f6);
        composer.startReplaceableGroup(-719926825);
        boolean changedInstance = composer.changedInstance(animatable) | composer.changed(f6);
        if ((((i5 & 14) ^ 6) > 4 && composer.changed(z4)) || (i5 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z8 = changedInstance | z6;
        if ((((i5 & 896) ^ 384) <= 256 || !composer.changed(this)) && (i5 & 384) != 256) {
            z7 = false;
        }
        boolean changedInstance2 = z8 | z7 | composer.changedInstance(interaction);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
            Object buttonElevation$animateElevation$2$1 = new ButtonElevation$animateElevation$2$1(animatable, f6, z4, this, interaction, null);
            composer.updateRememberedValue(buttonElevation$animateElevation$2$1);
            rememberedValue4 = buttonElevation$animateElevation$2$1;
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(m6042boximpl, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue4, composer, 0);
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        if (Dp.m6049equalsimpl0(this.defaultElevation, buttonElevation.defaultElevation) && Dp.m6049equalsimpl0(this.pressedElevation, buttonElevation.pressedElevation) && Dp.m6049equalsimpl0(this.focusedElevation, buttonElevation.focusedElevation) && Dp.m6049equalsimpl0(this.hoveredElevation, buttonElevation.hoveredElevation) && Dp.m6049equalsimpl0(this.disabledElevation, buttonElevation.disabledElevation)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Dp.m6050hashCodeimpl(this.defaultElevation) * 31) + Dp.m6050hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6050hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6050hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6050hashCodeimpl(this.disabledElevation);
    }

    @p4.l
    @Composable
    public final State<Dp> shadowElevation$material3_release(boolean z4, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-2045116089);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045116089, i5, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:887)");
        }
        State<Dp> animateElevation = animateElevation(z4, interactionSource, composer, (i5 & 896) | (i5 & 14) | (i5 & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    /* renamed from: tonalElevation-u2uoSUM$material3_release, reason: not valid java name */
    public final float m1606tonalElevationu2uoSUM$material3_release(boolean z4) {
        return z4 ? this.defaultElevation : this.disabledElevation;
    }
}
