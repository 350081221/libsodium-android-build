package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults$TextFieldDecorationBox$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ p<Composer, Integer, r2> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ p<Composer, Integer, r2> $label;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldDefaults$TextFieldDecorationBox$1(TextFieldDefaults textFieldDefaults, String str, p<? super Composer, ? super Integer, r2> pVar, boolean z4, boolean z5, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z6, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, p<? super Composer, ? super Integer, r2> pVar5, TextFieldColors textFieldColors, PaddingValues paddingValues, int i5, int i6, int i7) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$value = str;
        this.$innerTextField = pVar;
        this.$enabled = z4;
        this.$singleLine = z5;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = interactionSource;
        this.$isError = z6;
        this.$label = pVar2;
        this.$placeholder = pVar3;
        this.$leadingIcon = pVar4;
        this.$trailingIcon = pVar5;
        this.$colors = textFieldColors;
        this.$contentPadding = paddingValues;
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
        this.$tmp0_rcvr.TextFieldDecorationBox(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$colors, this.$contentPadding, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
