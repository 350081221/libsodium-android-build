package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.q;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008f\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u008f\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/material/ButtonColors;", "colors", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "Button", "(Lv3/a;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "Landroidx/compose/ui/graphics/Color;", "contentColor", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,617:1\n25#2:618\n25#2:626\n25#2:633\n1116#3,6:619\n1116#3,6:627\n1116#3,6:634\n154#4:625\n81#5:640\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n97#1:618\n171#1:626\n225#1:633\n97#1:619,6\n171#1:627,6\n225#1:634,6\n114#1:625\n105#1:640\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Button(@p4.l v3.a<kotlin.r2> r37, @p4.m androidx.compose.ui.Modifier r38, boolean r39, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r40, @p4.m androidx.compose.material.ButtonElevation r41, @p4.m androidx.compose.ui.graphics.Shape r42, @p4.m androidx.compose.foundation.BorderStroke r43, @p4.m androidx.compose.material.ButtonColors r44, @p4.m androidx.compose.foundation.layout.PaddingValues r45, @p4.l v3.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(v3.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m3744unboximpl();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedButton(@l a<r2> aVar, @m Modifier modifier, boolean z4, @m MutableInteractionSource mutableInteractionSource, @m ButtonElevation buttonElevation, @m Shape shape, @m BorderStroke borderStroke, @m ButtonColors buttonColors, @m PaddingValues paddingValues, @l q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5, int i6) {
        Modifier modifier2;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        PaddingValues paddingValues2;
        composer.startReplaceableGroup(-1776134358);
        if ((i6 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i6 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i6 & 16) != 0) {
            buttonElevation2 = null;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((i6 & 32) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        } else {
            shape2 = shape;
        }
        if ((i6 & 64) != 0) {
            borderStroke2 = ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6);
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i6 & 128) != 0) {
            buttonColors2 = ButtonDefaults.INSTANCE.m1248outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7);
        } else {
            buttonColors2 = buttonColors;
        }
        if ((i6 & 256) != 0) {
            paddingValues2 = ButtonDefaults.INSTANCE.getContentPadding();
        } else {
            paddingValues2 = paddingValues;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i5, -1, "androidx.compose.material.OutlinedButton (Button.kt:177)");
        }
        Button(aVar, modifier2, z5, mutableInteractionSource2, buttonElevation2, shape2, borderStroke2, buttonColors2, paddingValues2, qVar, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (1879048192 & i5), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextButton(@l a<r2> aVar, @m Modifier modifier, boolean z4, @m MutableInteractionSource mutableInteractionSource, @m ButtonElevation buttonElevation, @m Shape shape, @m BorderStroke borderStroke, @m ButtonColors buttonColors, @m PaddingValues paddingValues, @l q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, @m Composer composer, int i5, int i6) {
        Modifier modifier2;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        PaddingValues paddingValues2;
        composer.startReplaceableGroup(288797557);
        if ((i6 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i6 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i6 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i6 & 16) != 0) {
            buttonElevation2 = null;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((i6 & 32) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        } else {
            shape2 = shape;
        }
        if ((i6 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i6 & 128) != 0) {
            buttonColors2 = ButtonDefaults.INSTANCE.m1249textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7);
        } else {
            buttonColors2 = buttonColors;
        }
        if ((i6 & 256) != 0) {
            paddingValues2 = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
        } else {
            paddingValues2 = paddingValues;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i5, -1, "androidx.compose.material.TextButton (Button.kt:231)");
        }
        Button(aVar, modifier2, z5, mutableInteractionSource2, buttonElevation2, shape2, borderStroke2, buttonColors2, paddingValues2, qVar, composer, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (1879048192 & i5), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
