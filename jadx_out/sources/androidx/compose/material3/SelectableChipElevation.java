package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001d\u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0019\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\u001f\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/SelectableChipElevation;", "", "", "enabled", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateElevation", "(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tonalElevation-u2uoSUM$material3_release", "(Z)F", "tonalElevation", "shadowElevation$material3_release", "shadowElevation", "other", "equals", "", TTDownloadField.TT_HASHCODE, "elevation", "F", "getElevation-D9Ej5fM", "()F", "pressedElevation", "getPressedElevation-D9Ej5fM", "focusedElevation", "getFocusedElevation-D9Ej5fM", "hoveredElevation", "getHoveredElevation-D9Ej5fM", "draggedElevation", "getDraggedElevation-D9Ej5fM", "disabledElevation", "getDisabledElevation-D9Ej5fM", "<init>", "(FFFFFFLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/interaction/Interaction;", "lastInteraction", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2741:1\n1116#2,6:2742\n1116#2,6:2748\n1116#2,6:2754\n1116#2,6:2760\n1116#2,6:2766\n81#3:2772\n107#3,2:2773\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipElevation\n*L\n2261#1:2742,6\n2262#1:2748,6\n2263#1:2754,6\n2323#1:2760,6\n2325#1:2766,6\n2262#1:2772\n2262#1:2773,2\n*E\n"})
/* loaded from: classes.dex */
public final class SelectableChipElevation {
    public static final int $stable = 0;
    private final float disabledElevation;
    private final float draggedElevation;
    private final float elevation;
    private final float focusedElevation;
    private final float hoveredElevation;
    private final float pressedElevation;

    private SelectableChipElevation(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.elevation = f5;
        this.pressedElevation = f6;
        this.focusedElevation = f7;
        this.hoveredElevation = f8;
        this.draggedElevation = f9;
        this.disabledElevation = f10;
    }

    public /* synthetic */ SelectableChipElevation(float f5, float f6, float f7, float f8, float f9, float f10, kotlin.jvm.internal.w wVar) {
        this(f5, f6, f7, f8, f9, f10);
    }

    @Composable
    private final State<Dp> animateElevation(boolean z4, InteractionSource interactionSource, Composer composer, int i5) {
        boolean z5;
        Object s32;
        float f5;
        composer.startReplaceableGroup(664514136);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(664514136, i5, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2259)");
        }
        composer.startReplaceableGroup(-699454716);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-699454638);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-699454548);
        boolean z6 = true;
        if ((((i5 & 112) ^ 48) > 32 && composer.changed(interactionSource)) || (i5 & 48) == 32) {
            z5 = true;
        } else {
            z5 = false;
        }
        Object rememberedValue3 = composer.rememberedValue();
        if (z5 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SelectableChipElevation$animateElevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue3, composer, (i5 >> 3) & 14);
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
        } else if (interaction instanceof DragInteraction.Start) {
            f5 = this.draggedElevation;
        } else {
            f5 = this.elevation;
        }
        float f6 = f5;
        composer.startReplaceableGroup(-699452563);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new Animatable(Dp.m6042boximpl(f6), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        Animatable animatable = (Animatable) rememberedValue4;
        composer.endReplaceableGroup();
        Dp m6042boximpl = Dp.m6042boximpl(f6);
        composer.startReplaceableGroup(-699452479);
        boolean changedInstance = composer.changedInstance(animatable) | composer.changed(f6);
        if ((((i5 & 14) ^ 6) <= 4 || !composer.changed(z4)) && (i5 & 6) != 4) {
            z6 = false;
        }
        boolean changedInstance2 = changedInstance | z6 | composer.changedInstance(interaction);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
            Object selectableChipElevation$animateElevation$2$1 = new SelectableChipElevation$animateElevation$2$1(animatable, f6, z4, interaction, mutableState, null);
            composer.updateRememberedValue(selectableChipElevation$animateElevation$2$1);
            rememberedValue5 = selectableChipElevation$animateElevation$2$1;
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(m6042boximpl, (v3.p<? super s0, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) rememberedValue5, composer, 0);
        State<Dp> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interaction animateElevation$lambda$2(MutableState<Interaction> mutableState) {
        return mutableState.getValue();
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipElevation)) {
            return false;
        }
        SelectableChipElevation selectableChipElevation = (SelectableChipElevation) obj;
        if (Dp.m6049equalsimpl0(this.elevation, selectableChipElevation.elevation) && Dp.m6049equalsimpl0(this.pressedElevation, selectableChipElevation.pressedElevation) && Dp.m6049equalsimpl0(this.focusedElevation, selectableChipElevation.focusedElevation) && Dp.m6049equalsimpl0(this.hoveredElevation, selectableChipElevation.hoveredElevation) && Dp.m6049equalsimpl0(this.disabledElevation, selectableChipElevation.disabledElevation)) {
            return true;
        }
        return false;
    }

    /* renamed from: getDisabledElevation-D9Ej5fM, reason: not valid java name */
    public final float m2160getDisabledElevationD9Ej5fM() {
        return this.disabledElevation;
    }

    /* renamed from: getDraggedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2161getDraggedElevationD9Ej5fM() {
        return this.draggedElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2162getElevationD9Ej5fM() {
        return this.elevation;
    }

    /* renamed from: getFocusedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2163getFocusedElevationD9Ej5fM() {
        return this.focusedElevation;
    }

    /* renamed from: getHoveredElevation-D9Ej5fM, reason: not valid java name */
    public final float m2164getHoveredElevationD9Ej5fM() {
        return this.hoveredElevation;
    }

    /* renamed from: getPressedElevation-D9Ej5fM, reason: not valid java name */
    public final float m2165getPressedElevationD9Ej5fM() {
        return this.pressedElevation;
    }

    public int hashCode() {
        return (((((((Dp.m6050hashCodeimpl(this.elevation) * 31) + Dp.m6050hashCodeimpl(this.pressedElevation)) * 31) + Dp.m6050hashCodeimpl(this.focusedElevation)) * 31) + Dp.m6050hashCodeimpl(this.hoveredElevation)) * 31) + Dp.m6050hashCodeimpl(this.disabledElevation);
    }

    @p4.l
    @Composable
    public final State<Dp> shadowElevation$material3_release(boolean z4, @p4.l InteractionSource interactionSource, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1888175651);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1888175651, i5, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2251)");
        }
        State<Dp> animateElevation = animateElevation(z4, interactionSource, composer, (i5 & 896) | (i5 & 14) | (i5 & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateElevation;
    }

    /* renamed from: tonalElevation-u2uoSUM$material3_release, reason: not valid java name */
    public final float m2166tonalElevationu2uoSUM$material3_release(boolean z4) {
        return z4 ? this.elevation : this.disabledElevation;
    }
}
