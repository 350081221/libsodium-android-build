package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1843:1\n1116#2,6:1844\n1116#2,6:1850\n1116#2,6:1856\n1116#2,6:1862\n1116#2,6:1868\n1116#2,6:1874\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimeInputImpl$1$1\n*L\n840#1:1844,6\n852#1:1850,6\n867#1:1856,6\n873#1:1862,6\n886#1:1868,6\n901#1:1874,6\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerKt$TimeInputImpl$1$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1(MutableState<TextFieldValue> mutableState, TimePickerState timePickerState, TimePickerColors timePickerColors, MutableState<TextFieldValue> mutableState2) {
        super(2);
        this.$hourValue$delegate = mutableState;
        this.$state = timePickerState;
        this.$colors = timePickerColors;
        this.$minuteValue$delegate = mutableState2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        TextFieldValue TimeInputImpl$lambda$5;
        float f5;
        TextFieldValue TimeInputImpl$lambda$8;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1306700887, i5, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:837)");
        }
        Modifier.Companion companion = Modifier.Companion;
        composer.startReplaceableGroup(-1645133303);
        boolean changed = composer.changed(this.$hourValue$delegate) | composer.changed(this.$state);
        TimePickerState timePickerState = this.$state;
        MutableState<TextFieldValue> mutableState = this.$hourValue$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TimePickerKt$TimeInputImpl$1$1$1$1(timePickerState, mutableState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (v3.l) rememberedValue);
        TimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate);
        composer.startReplaceableGroup(-1645132823);
        boolean changed2 = composer.changed(this.$state) | composer.changed(this.$hourValue$delegate);
        TimePickerState timePickerState2 = this.$state;
        MutableState<TextFieldValue> mutableState2 = this.$hourValue$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TimePickerKt$TimeInputImpl$1$1$2$1(timePickerState2, mutableState2);
            composer.updateRememberedValue(rememberedValue2);
        }
        v3.l lVar = (v3.l) rememberedValue2;
        composer.endReplaceableGroup();
        TimePickerState timePickerState3 = this.$state;
        Selection.Companion companion2 = Selection.Companion;
        int m2176getHourJiIwxys = companion2.m2176getHourJiIwxys();
        ImeAction.Companion companion3 = ImeAction.Companion;
        int m5724getNexteUduSuo = companion3.m5724getNexteUduSuo();
        KeyboardType.Companion companion4 = KeyboardType.Companion;
        KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, companion4.m5772getNumberPjHm6EE(), m5724getNexteUduSuo, null, 19, null);
        composer.startReplaceableGroup(-1645132161);
        boolean changed3 = composer.changed(this.$state);
        TimePickerState timePickerState4 = this.$state;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new TimePickerKt$TimeInputImpl$1$1$3$1(timePickerState4);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        TimePickerKt.m2480TimePickerTextFieldlxUZ_iY(onKeyEvent, TimeInputImpl$lambda$5, lVar, timePickerState3, m2176getHourJiIwxys, keyboardOptions, new KeyboardActions(null, null, (v3.l) rememberedValue3, null, null, null, 59, null), this.$colors, composer, 24576, 0);
        f5 = TimePickerKt.DisplaySeparatorWidth;
        TimePickerKt.DisplaySeparator(SizeKt.m604sizeVpY3zN4(companion, f5, TimeInputTokens.INSTANCE.m3155getPeriodSelectorContainerHeightD9Ej5fM()), composer, 6);
        composer.startReplaceableGroup(-1645131867);
        boolean changed4 = composer.changed(this.$minuteValue$delegate) | composer.changed(this.$state);
        TimePickerState timePickerState5 = this.$state;
        MutableState<TextFieldValue> mutableState3 = this.$minuteValue$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new TimePickerKt$TimeInputImpl$1$1$4$1(timePickerState5, mutableState3);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion, (v3.l) rememberedValue4);
        TimeInputImpl$lambda$8 = TimePickerKt.TimeInputImpl$lambda$8(this.$minuteValue$delegate);
        composer.startReplaceableGroup(-1645131419);
        boolean changed5 = composer.changed(this.$state) | composer.changed(this.$minuteValue$delegate);
        TimePickerState timePickerState6 = this.$state;
        MutableState<TextFieldValue> mutableState4 = this.$minuteValue$delegate;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed5 || rememberedValue5 == Composer.Companion.getEmpty()) {
            rememberedValue5 = new TimePickerKt$TimeInputImpl$1$1$5$1(timePickerState6, mutableState4);
            composer.updateRememberedValue(rememberedValue5);
        }
        v3.l lVar2 = (v3.l) rememberedValue5;
        composer.endReplaceableGroup();
        TimePickerState timePickerState7 = this.$state;
        int m2177getMinuteJiIwxys = companion2.m2177getMinuteJiIwxys();
        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, companion4.m5772getNumberPjHm6EE(), companion3.m5722getDoneeUduSuo(), null, 19, null);
        composer.startReplaceableGroup(-1645130777);
        boolean changed6 = composer.changed(this.$state);
        TimePickerState timePickerState8 = this.$state;
        Object rememberedValue6 = composer.rememberedValue();
        if (changed6 || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new TimePickerKt$TimeInputImpl$1$1$6$1(timePickerState8);
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        TimePickerKt.m2480TimePickerTextFieldlxUZ_iY(onPreviewKeyEvent, TimeInputImpl$lambda$8, lVar2, timePickerState7, m2177getMinuteJiIwxys, keyboardOptions2, new KeyboardActions(null, null, (v3.l) rememberedValue6, null, null, null, 59, null), this.$colors, composer, 24576, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
