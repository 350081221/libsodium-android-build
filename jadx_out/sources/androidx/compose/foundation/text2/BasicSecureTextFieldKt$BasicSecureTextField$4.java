package androidx.compose.foundation.text2;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text2.input.ImeActionHandler;
import androidx.compose.foundation.text2.input.InputTransformation;
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
public final class BasicSecureTextFieldKt$BasicSecureTextField$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ TextFieldDecorator $decorator;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ InputTransformation $inputTransformation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ int $keyboardType;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ImeActionHandler $onSubmit;
    final /* synthetic */ p<Density, v3.a<TextLayoutResult>, r2> $onTextLayout;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ int $textObfuscationMode;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicSecureTextFieldKt$BasicSecureTextField$4(TextFieldState textFieldState, Modifier modifier, ImeActionHandler imeActionHandler, int i5, int i6, int i7, boolean z4, InputTransformation inputTransformation, TextStyle textStyle, MutableInteractionSource mutableInteractionSource, Brush brush, p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar, TextFieldDecorator textFieldDecorator, ScrollState scrollState, int i8, int i9, int i10) {
        super(2);
        this.$state = textFieldState;
        this.$modifier = modifier;
        this.$onSubmit = imeActionHandler;
        this.$imeAction = i5;
        this.$textObfuscationMode = i6;
        this.$keyboardType = i7;
        this.$enabled = z4;
        this.$inputTransformation = inputTransformation;
        this.$textStyle = textStyle;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$onTextLayout = pVar;
        this.$decorator = textFieldDecorator;
        this.$scrollState = scrollState;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BasicSecureTextFieldKt.m1061BasicSecureTextFieldmMrxcSU(this.$state, this.$modifier, this.$onSubmit, this.$imeAction, this.$textObfuscationMode, this.$keyboardType, this.$enabled, this.$inputTransformation, this.$textStyle, this.$interactionSource, this.$cursorBrush, this.$onTextLayout, this.$decorator, this.$scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
