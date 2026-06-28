package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "it", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1843:1\n154#2:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n*L\n1635#1:1844\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerKt$TimePickerTextField$1$1$2 extends kotlin.jvm.internal.n0 implements v3.q<v3.p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldColors $textFieldColors;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ TextFieldColors $textFieldColors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
            super(2);
            this.$interactionSource = mutableInteractionSource;
            this.$textFieldColors = textFieldColors;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@p4.m Composer composer, int i5) {
            if ((i5 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-968963953, i5, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1636)");
            }
            OutlinedTextFieldDefaults.INSTANCE.m2053ContainerBoxnbWgWpA(true, false, this.$interactionSource, this.$textFieldColors, ShapesKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer, 6), 0.0f, 0.0f, composer, 12583350, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$1$1$2(TextFieldValue textFieldValue, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        super(3);
        this.$value = textFieldValue;
        this.$interactionSource = mutableInteractionSource;
        this.$textFieldColors = textFieldColors;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(v3.p<? super Composer, ? super Integer, ? extends r2> pVar, Composer composer, Integer num) {
        invoke((v3.p<? super Composer, ? super Integer, r2>) pVar, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void invoke(@p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        if ((i5 & 6) == 0) {
            i6 = i5 | (composer.changedInstance(pVar) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2133555260, i6, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1626)");
        }
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        String text = this.$value.getText();
        VisualTransformation none = VisualTransformation.Companion.getNone();
        PaddingValues m546PaddingValues0680j_4 = PaddingKt.m546PaddingValues0680j_4(Dp.m6044constructorimpl(0));
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        TextFieldColors textFieldColors = this.$textFieldColors;
        outlinedTextFieldDefaults.DecorationBox(text, pVar, true, true, none, mutableInteractionSource, false, null, null, null, null, null, null, null, textFieldColors, m546PaddingValues0680j_4, ComposableLambdaKt.composableLambda(composer, -968963953, true, new AnonymousClass1(mutableInteractionSource, textFieldColors)), composer, ((i6 << 3) & 112) | 224640, 14352384, 16320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
