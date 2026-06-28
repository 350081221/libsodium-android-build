package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextField$2\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n*L\n1#1,1156:1\n50#2:1157\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt$OutlinedTextField$2\n*L\n185#1:1157\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextField$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
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
    final /* synthetic */ v3.l<String, r2> $onValueChange;
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ v3.p<Composer, Integer, r2> $prefix;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ v3.p<Composer, Integer, r2> $suffix;
    final /* synthetic */ v3.p<Composer, Integer, r2> $supportingText;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<SemanticsPropertyReceiver, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n0 implements v3.q<v3.p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
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
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
            final /* synthetic */ TextFieldColors $colors;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ boolean $isError;
            final /* synthetic */ Shape $shape;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z4, boolean z5, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape) {
                super(2);
                this.$enabled = z4;
                this.$isError = z5;
                this.$interactionSource = mutableInteractionSource;
                this.$colors = textFieldColors;
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
                    ComposerKt.traceEventStart(2108828640, i5, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:219)");
                }
                OutlinedTextFieldDefaults.INSTANCE.m2053ContainerBoxnbWgWpA(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$shape, 0.0f, 0.0f, composer, 12582912, 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, boolean z4, boolean z5, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z6, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, v3.p<? super Composer, ? super Integer, r2> pVar6, v3.p<? super Composer, ? super Integer, r2> pVar7, TextFieldColors textFieldColors, Shape shape) {
            super(3);
            this.$value = str;
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
            this.$colors = textFieldColors;
            this.$shape = shape;
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
                ComposerKt.traceEventStart(1474611661, i6, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:202)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            String str = this.$value;
            boolean z4 = this.$enabled;
            boolean z5 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            boolean z6 = this.$isError;
            v3.p<Composer, Integer, r2> pVar2 = this.$label;
            v3.p<Composer, Integer, r2> pVar3 = this.$placeholder;
            v3.p<Composer, Integer, r2> pVar4 = this.$leadingIcon;
            v3.p<Composer, Integer, r2> pVar5 = this.$trailingIcon;
            v3.p<Composer, Integer, r2> pVar6 = this.$prefix;
            int i7 = i6;
            v3.p<Composer, Integer, r2> pVar7 = this.$suffix;
            v3.p<Composer, Integer, r2> pVar8 = this.$supportingText;
            TextFieldColors textFieldColors = this.$colors;
            outlinedTextFieldDefaults.DecorationBox(str, pVar, z4, z5, visualTransformation, mutableInteractionSource, z6, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, textFieldColors, null, ComposableLambdaKt.composableLambda(composer, 2108828640, true, new AnonymousClass1(z4, z6, mutableInteractionSource, textFieldColors, this.$shape)), composer, (i7 << 3) & 112, 14155776, 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldKt$OutlinedTextField$2(v3.p<? super Composer, ? super Integer, r2> pVar, Modifier modifier, boolean z4, TextFieldColors textFieldColors, String str, v3.l<? super String, r2> lVar, boolean z5, boolean z6, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z7, int i5, int i6, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, v3.p<? super Composer, ? super Integer, r2> pVar6, v3.p<? super Composer, ? super Integer, r2> pVar7, Shape shape) {
        super(2);
        this.$label = pVar;
        this.$modifier = modifier;
        this.$isError = z4;
        this.$colors = textFieldColors;
        this.$value = str;
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
        Modifier modifier;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1886965181, i5, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:173)");
        }
        if (this.$label != null) {
            modifier = PaddingKt.m557paddingqDBjuR0$default(SemanticsModifierKt.semantics(this.$modifier, true, AnonymousClass1.INSTANCE), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, null);
        } else {
            modifier = this.$modifier;
        }
        boolean z4 = this.$isError;
        Strings.Companion companion = Strings.Companion;
        Modifier defaultErrorSemantics = TextFieldImplKt.defaultErrorSemantics(modifier, z4, Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(androidx.compose.ui.R.string.default_error_message), composer, 0));
        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
        Modifier m586defaultMinSizeVpY3zN4 = SizeKt.m586defaultMinSizeVpY3zN4(defaultErrorSemantics, outlinedTextFieldDefaults.m2058getMinWidthD9Ej5fM(), outlinedTextFieldDefaults.m2057getMinHeightD9Ej5fM());
        SolidColor solidColor = new SolidColor(this.$colors.cursorColor$material3_release(this.$isError, composer, 0).getValue().m3744unboximpl(), null);
        String str = this.$value;
        v3.l<String, r2> lVar = this.$onValueChange;
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
        BasicTextFieldKt.BasicTextField(str, lVar, m586defaultMinSizeVpY3zN4, z5, z6, textStyle, keyboardOptions, keyboardActions, z7, i6, i7, visualTransformation, (v3.l<? super TextLayoutResult, r2>) null, mutableInteractionSource, solidColor, ComposableLambdaKt.composableLambda(composer, 1474611661, true, new AnonymousClass2(str, z5, z7, visualTransformation, mutableInteractionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$colors, this.$shape)), composer, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
