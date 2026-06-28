package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldKt$TextField$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ p<Composer, Integer, r2> $label;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<String, r2> $onValueChange;
    final /* synthetic */ p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextField$3(String str, l<? super String, r2> lVar, Modifier modifier, boolean z4, boolean z5, TextStyle textStyle, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, boolean z6, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z7, int i5, int i6, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i7, int i8, int i9) {
        super(2);
        this.$value = str;
        this.$onValueChange = lVar;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$readOnly = z5;
        this.$textStyle = textStyle;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$isError = z6;
        this.$visualTransformation = visualTransformation;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z7;
        this.$maxLines = i5;
        this.$minLines = i6;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$colors = textFieldColors;
        this.$$changed = i7;
        this.$$changed1 = i8;
        this.$$default = i9;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        TextFieldKt.TextField(this.$value, this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$interactionSource, this.$shape, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
