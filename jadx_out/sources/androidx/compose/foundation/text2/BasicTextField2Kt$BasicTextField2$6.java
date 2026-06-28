package androidx.compose.foundation.text2;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldLineLimits;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextField2Kt$BasicTextField2$6 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ CodepointTransformation $codepointTransformation;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ TextFieldDecorator $decorator;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InputTransformation $inputTransformation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ TextFieldLineLimits $lineLimits;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ p<Density, v3.a<TextLayoutResult>, r2> $onTextLayout;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextField2Kt$BasicTextField2$6(TextFieldState textFieldState, Modifier modifier, boolean z4, boolean z5, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, TextFieldLineLimits textFieldLineLimits, p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, int i5, int i6, int i7) {
        super(2);
        this.$state = textFieldState;
        this.$modifier = modifier;
        this.$enabled = z4;
        this.$readOnly = z5;
        this.$inputTransformation = inputTransformation;
        this.$textStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$lineLimits = textFieldLineLimits;
        this.$onTextLayout = pVar;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$codepointTransformation = codepointTransformation;
        this.$decorator = textFieldDecorator;
        this.$scrollState = scrollState;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BasicTextField2Kt.BasicTextField2(this.$state, this.$modifier, this.$enabled, this.$readOnly, this.$inputTransformation, this.$textStyle, this.$keyboardOptions, this.$keyboardActions, this.$lineLimits, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$codepointTransformation, this.$decorator, this.$scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
