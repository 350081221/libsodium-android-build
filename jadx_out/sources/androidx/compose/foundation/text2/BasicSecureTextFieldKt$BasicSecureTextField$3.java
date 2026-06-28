package androidx.compose.foundation.text2;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.ImeActionHandler;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,523:1\n1#2:524\n*E\n"})
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt$BasicSecureTextField$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ CodepointTransformation $codepointTransformation;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ TextFieldDecorator $decorator;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ InputTransformation $inputTransformation;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ int $keyboardType;
    final /* synthetic */ ImeActionHandler $onSubmit;
    final /* synthetic */ p<Density, v3.a<TextLayoutResult>, r2> $onTextLayout;
    final /* synthetic */ boolean $revealLastTypedEnabled;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SecureTextFieldController $secureTextFieldController;
    final /* synthetic */ Modifier $secureTextFieldModifier;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicSecureTextFieldKt$BasicSecureTextField$3(boolean z4, InputTransformation inputTransformation, SecureTextFieldController secureTextFieldController, int i5, int i6, ImeActionHandler imeActionHandler, TextFieldState textFieldState, Modifier modifier, boolean z5, TextStyle textStyle, p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState) {
        super(2);
        this.$revealLastTypedEnabled = z4;
        this.$inputTransformation = inputTransformation;
        this.$secureTextFieldController = secureTextFieldController;
        this.$keyboardType = i5;
        this.$imeAction = i6;
        this.$onSubmit = imeActionHandler;
        this.$state = textFieldState;
        this.$secureTextFieldModifier = modifier;
        this.$enabled = z5;
        this.$textStyle = textStyle;
        this.$onTextLayout = pVar;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$codepointTransformation = codepointTransformation;
        this.$decorator = textFieldDecorator;
        this.$scrollState = scrollState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r1 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.KeyboardActions(new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(r1));
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(@p4.m androidx.compose.runtime.Composer r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r1 & 11
            r3 = 2
            if (r2 != r3) goto L15
            boolean r2 = r22.getSkipping()
            if (r2 != 0) goto L10
            goto L15
        L10:
            r22.skipToGroupEnd()
            goto L8e
        L15:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L24
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)"
            r4 = -1415093334(0xffffffffaba763aa, float:-1.1893726E-12)
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
        L24:
            boolean r1 = r0.$revealLastTypedEnabled
            if (r1 == 0) goto L35
            androidx.compose.foundation.text2.input.InputTransformation r1 = r0.$inputTransformation
            androidx.compose.foundation.text2.SecureTextFieldController r2 = r0.$secureTextFieldController
            androidx.compose.foundation.text2.PasswordRevealFilter r2 = r2.getPasswordRevealFilter()
            androidx.compose.foundation.text2.input.InputTransformation r1 = androidx.compose.foundation.text2.input.InputTransformationKt.thenOrNull(r1, r2)
            goto L37
        L35:
            androidx.compose.foundation.text2.input.InputTransformation r1 = r0.$inputTransformation
        L37:
            r6 = r1
            androidx.compose.foundation.text2.input.TextFieldLineLimits$SingleLine r10 = androidx.compose.foundation.text2.input.TextFieldLineLimits.SingleLine.INSTANCE
            androidx.compose.foundation.text.KeyboardOptions r8 = new androidx.compose.foundation.text.KeyboardOptions
            r12 = 0
            r13 = 0
            int r14 = r0.$keyboardType
            int r15 = r0.$imeAction
            r16 = 0
            r17 = 17
            r18 = 0
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.foundation.text2.input.ImeActionHandler r1 = r0.$onSubmit
            if (r1 == 0) goto L5b
            androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1 r2 = new androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3$1$1
            r2.<init>(r1)
            androidx.compose.foundation.text.KeyboardActions r1 = androidx.compose.foundation.text2.BasicSecureTextFieldKt.access$KeyboardActions(r2)
            if (r1 != 0) goto L61
        L5b:
            androidx.compose.foundation.text.KeyboardActions$Companion r1 = androidx.compose.foundation.text.KeyboardActions.Companion
            androidx.compose.foundation.text.KeyboardActions r1 = r1.getDefault()
        L61:
            r9 = r1
            androidx.compose.foundation.text2.input.TextFieldState r2 = r0.$state
            androidx.compose.ui.Modifier r3 = r0.$secureTextFieldModifier
            boolean r4 = r0.$enabled
            r5 = 0
            androidx.compose.ui.text.TextStyle r7 = r0.$textStyle
            v3.p<androidx.compose.ui.unit.Density, v3.a<androidx.compose.ui.text.TextLayoutResult>, kotlin.r2> r11 = r0.$onTextLayout
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = r0.$interactionSource
            androidx.compose.ui.graphics.Brush r13 = r0.$cursorBrush
            androidx.compose.foundation.text2.input.CodepointTransformation r14 = r0.$codepointTransformation
            androidx.compose.foundation.text2.TextFieldDecorator r15 = r0.$decorator
            androidx.compose.foundation.ScrollState r1 = r0.$scrollState
            r16 = r1
            r18 = 100666368(0x6000c00, float:2.408294E-35)
            r19 = 0
            r20 = 0
            r17 = r22
            androidx.compose.foundation.text2.BasicTextField2Kt.BasicTextField2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L8e
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.BasicSecureTextFieldKt$BasicSecureTextField$3.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
