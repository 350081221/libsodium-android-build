package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$TimePickerTextField$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<TextFieldValue, r2> $onValueChange;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerKt$TimePickerTextField$3(Modifier modifier, TextFieldValue textFieldValue, v3.l<? super TextFieldValue, r2> lVar, TimePickerState timePickerState, int i5, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TimePickerColors timePickerColors, int i6, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$state = timePickerState;
        this.$selection = i5;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$colors = timePickerColors;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TimePickerKt.m2480TimePickerTextFieldlxUZ_iY(this.$modifier, this.$value, this.$onValueChange, this.$state, this.$selection, this.$keyboardOptions, this.$keyboardActions, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
