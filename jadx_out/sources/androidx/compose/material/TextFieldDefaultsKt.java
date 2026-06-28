package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"animateBorderStrokeAsState", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "focusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release", "focused"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,906:1\n81#2:907\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaultsKt\n*L\n894#1:907\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaultsKt {
    /* renamed from: access$animateBorderStrokeAsState-NuRrP5Q */
    public static final /* synthetic */ State m1502access$animateBorderStrokeAsStateNuRrP5Q(boolean z4, boolean z5, InteractionSource interactionSource, TextFieldColors textFieldColors, float f5, float f6, Composer composer, int i5) {
        return m1503animateBorderStrokeAsStateNuRrP5Q(z4, z5, interactionSource, textFieldColors, f5, f6, composer, i5);
    }

    @Composable
    /* renamed from: animateBorderStrokeAsState-NuRrP5Q */
    public static final State<BorderStroke> m1503animateBorderStrokeAsStateNuRrP5Q(boolean z4, boolean z5, InteractionSource interactionSource, TextFieldColors textFieldColors, float f5, float f6, Composer composer, int i5) {
        float f7;
        State<Dp> rememberUpdatedState;
        composer.startReplaceableGroup(1097899920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097899920, i5, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:892)");
        }
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i5 >> 6) & 14);
        State<Color> indicatorColor = textFieldColors.indicatorColor(z4, z5, interactionSource, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168));
        if (animateBorderStrokeAsState_NuRrP5Q$lambda$0(collectIsFocusedAsState)) {
            f7 = f5;
        } else {
            f7 = f6;
        }
        if (z4) {
            composer.startReplaceableGroup(1685713622);
            rememberUpdatedState = AnimateAsStateKt.m108animateDpAsStateAjpBEmI(f7, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1685713720);
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Dp.m6042boximpl(f6), composer, (i5 >> 15) & 14);
            composer.endReplaceableGroup();
        }
        State<BorderStroke> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new BorderStroke(rememberUpdatedState.getValue().m6058unboximpl(), new SolidColor(indicatorColor.getValue().m3744unboximpl(), null), null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState2;
    }

    private static final boolean animateBorderStrokeAsState_NuRrP5Q$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
