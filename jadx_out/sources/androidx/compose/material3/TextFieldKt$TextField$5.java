package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$5\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1164:1\n50#2:1165\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt$TextField$5\n*L\n350#1:1165\n*E\n"})
/* loaded from: classes.dex */
final class TextFieldKt$TextField$5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<TextFieldValue, r2> $onValueChange;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ v3.p<Composer, Integer, r2> $prefix;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ v3.p<Composer, Integer, r2> $suffix;
    final /* synthetic */ v3.p<Composer, Integer, r2> $supportingText;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.TextFieldKt$TextField$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.q<v3.p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ v3.p<Composer, Integer, r2> $label;
        final /* synthetic */ v3.p<Composer, Integer, r2> $leadingIcon;
        final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
        final /* synthetic */ v3.p<Composer, Integer, r2> $prefix;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ v3.p<Composer, Integer, r2> $suffix;
        final /* synthetic */ v3.p<Composer, Integer, r2> $supportingText;
        final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(TextFieldValue textFieldValue, boolean z4, boolean z5, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z6, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, v3.p<? super Composer, ? super Integer, r2> pVar6, v3.p<? super Composer, ? super Integer, r2> pVar7, Shape shape, TextFieldColors textFieldColors) {
            super(3);
            this.$value = textFieldValue;
            this.$enabled = z4;
            this.$singleLine = z5;
            this.$visualTransformation = visualTransformation;
            this.$interactionSource = mutableInteractionSource;
            this.$isError = z6;
            this.$label = pVar;
            this.$placeholder = pVar2;
            this.$leadingIcon = pVar3;
            this.$trailingIcon = pVar4;
            this.$prefix = pVar5;
            this.$suffix = pVar6;
            this.$supportingText = pVar7;
            this.$shape = shape;
            this.$colors = textFieldColors;
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
                ComposerKt.traceEventStart(1751957978, i6, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:368)");
            }
            TextFieldDefaults.INSTANCE.DecorationBox(this.$value.getText(), pVar, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$shape, this.$colors, null, null, composer, (i6 << 3) & 112, 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKt$TextField$5(Modifier modifier, boolean z4, TextFieldColors textFieldColors, TextFieldValue textFieldValue, v3.l<? super TextFieldValue, r2> lVar, boolean z5, boolean z6, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z7, int i5, int i6, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, v3.p<? super Composer, ? super Integer, r2> pVar6, v3.p<? super Composer, ? super Integer, r2> pVar7, Shape shape) {
        super(2);
        this.$modifier = modifier;
        this.$isError = z4;
        this.$colors = textFieldColors;
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
        this.$enabled = z5;
        this.$readOnly = z6;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z7;
        this.$maxLines = i5;
        this.$minLines = i6;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$prefix = pVar5;
        this.$suffix = pVar6;
        this.$supportingText = pVar7;
        this.$shape = shape;
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
            ComposerKt.traceEventStart(-1163788208, i5, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:346)");
        }
        Modifier modifier = this.$modifier;
        boolean z4 = this.$isError;
        Strings.Companion companion = Strings.Companion;
        Modifier defaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier, z4, Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0));
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        Modifier m586defaultMinSizeVpY3zN4 = SizeKt.m586defaultMinSizeVpY3zN4(defaultErrorSemantics, textFieldDefaults.m2428getMinWidthD9Ej5fM(), textFieldDefaults.m2427getMinHeightD9Ej5fM());
        SolidColor solidColor = new SolidColor(this.$colors.cursorColor$material3_release(this.$isError, composer, 0).getValue().m3744unboximpl(), null);
        TextFieldValue textFieldValue = this.$value;
        v3.l<TextFieldValue, r2> lVar = this.$onValueChange;
        boolean z5 = this.$enabled;
        boolean z6 = this.$readOnly;
        TextStyle textStyle = this.$mergedTextStyle;
        KeyboardOptions keyboardOptions = this.$keyboardOptions;
        KeyboardActions keyboardActions = this.$keyboardActions;
        boolean z7 = this.$singleLine;
        int i6 = this.$maxLines;
        int i7 = this.$minLines;
        VisualTransformation visualTransformation = this.$visualTransformation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        BasicTextFieldKt.BasicTextField(textFieldValue, lVar, m586defaultMinSizeVpY3zN4, z5, z6, textStyle, keyboardOptions, keyboardActions, z7, i6, i7, visualTransformation, (v3.l<? super TextLayoutResult, r2>) null, mutableInteractionSource, solidColor, ComposableLambdaKt.composableLambda(composer, 1751957978, true, new AnonymousClass1(textFieldValue, z5, z7, visualTransformation, mutableInteractionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$shape, this.$colors)), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
