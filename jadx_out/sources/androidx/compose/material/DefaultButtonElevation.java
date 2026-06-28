package androidx.compose.material;

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
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "elevation", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "defaultElevation", "F", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFFLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,617:1\n25#2:618\n25#2:631\n1116#3,6:619\n1116#3,6:625\n1116#3,6:632\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n*L\n506#1:618\n548#1:631\n506#1:619,6\n507#1:625,6\n548#1:632,6\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultButtonElevation implements ButtonElevation {
    private final float defaultElevation;
    private final float disabledElevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private DefaultButtonElevation(float f5, float f6, float f7, float f8, float f9) {
        this.defaultElevation = f5;
        this.pressedElevation = f6;
        this.disabledElevation = f7;
        this.hoveredElevation = f8;
        this.focusedElevation = f9;
    }

    public /* synthetic */ DefaultButtonElevation(float f5, float f6, float f7, float f8, float f9, w wVar) {
        this(f5, f6, f7, f8, f9);
    }

    @Override // androidx.compose.material.ButtonElevation
    @l
    @Composable
    public State<Dp> elevation(boolean z4, @l InteractionSource interactionSource, @m Composer composer, int i5) {
        Object s32;
        float f5;
        composer.startReplaceableGroup(-1588756907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, i5, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:504)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        composer.startReplaceableGroup(181869764);
        boolean changed = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (p<? super s0, ? super d<? super r2>, ? extends Object>) rememberedValue2, composer, ((i5 >> 3) & 14) | 64);
        s32 = e0.s3(snapshotStateList);
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
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(Dp.m6042boximpl(f6), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        EffectsKt.LaunchedEffect(Dp.m6042boximpl(f6), new DefaultButtonElevation$elevation$2(animatable, f6, z4, this, interaction, null), composer, 64);
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }
}
