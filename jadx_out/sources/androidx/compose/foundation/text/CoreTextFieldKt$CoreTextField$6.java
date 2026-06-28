package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$6 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ q<p<? super Composer, ? super Integer, r2>, Composer, Integer, r2> $decorationBox;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<TextLayoutResult, r2> $onTextLayout;
    final /* synthetic */ l<TextFieldValue, r2> $onValueChange;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$6(TextFieldValue textFieldValue, l<? super TextFieldValue, r2> lVar, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, l<? super TextLayoutResult, r2> lVar2, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z4, int i5, int i6, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z5, boolean z6, q<? super p<? super Composer, ? super Integer, r2>, ? super Composer, ? super Integer, r2> qVar, int i7, int i8, int i9) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$modifier = modifier;
        this.$textStyle = textStyle;
        this.$visualTransformation = visualTransformation;
        this.$onTextLayout = lVar2;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$softWrap = z4;
        this.$maxLines = i5;
        this.$minLines = i6;
        this.$imeOptions = imeOptions;
        this.$keyboardActions = keyboardActions;
        this.$enabled = z5;
        this.$readOnly = z6;
        this.$decorationBox = qVar;
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
        CoreTextFieldKt.CoreTextField(this.$value, this.$onValueChange, this.$modifier, this.$textStyle, this.$visualTransformation, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$softWrap, this.$maxLines, this.$minLines, this.$imeOptions, this.$keyboardActions, this.$enabled, this.$readOnly, this.$decorationBox, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
