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
public final class TextFieldImplKt$CommonDecorationBox$4 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ p<Composer, Integer, r2> $border;
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
    final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ TextFieldType $type;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$4(TextFieldType textFieldType, String str, p<? super Composer, ? super Integer, r2> pVar, VisualTransformation visualTransformation, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, p<? super Composer, ? super Integer, r2> pVar5, boolean z4, boolean z5, boolean z6, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, p<? super Composer, ? super Integer, r2> pVar6, int i5, int i6, int i7) {
        super(2);
        this.$type = textFieldType;
        this.$value = str;
        this.$innerTextField = pVar;
        this.$visualTransformation = visualTransformation;
        this.$label = pVar2;
        this.$placeholder = pVar3;
        this.$leadingIcon = pVar4;
        this.$trailingIcon = pVar5;
        this.$singleLine = z4;
        this.$enabled = z5;
        this.$isError = z6;
        this.$interactionSource = interactionSource;
        this.$contentPadding = paddingValues;
        this.$colors = textFieldColors;
        this.$border = pVar6;
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
        TextFieldImplKt.CommonDecorationBox(this.$type, this.$value, this.$innerTextField, this.$visualTransformation, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$singleLine, this.$enabled, this.$isError, this.$interactionSource, this.$contentPadding, this.$colors, this.$border, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
