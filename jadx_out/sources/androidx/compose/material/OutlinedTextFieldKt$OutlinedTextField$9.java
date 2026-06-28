package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextField$9 extends n0 implements q<p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ p<Composer, Integer, r2> $label;
    final /* synthetic */ p<Composer, Integer, r2> $leadingIcon;
    final /* synthetic */ p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ p<Composer, Integer, r2> $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$9$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
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
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-753611134, i5, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:410)");
            }
            TextFieldDefaults.INSTANCE.m1491BorderBoxnbWgWpA(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$shape, 0.0f, 0.0f, composer, 12582912, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldKt$OutlinedTextField$9(TextFieldValue textFieldValue, boolean z4, boolean z5, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z6, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, TextFieldColors textFieldColors, Shape shape) {
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
        this.$colors = textFieldColors;
        this.$shape = shape;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(p<? super Composer, ? super Integer, ? extends r2> pVar, Composer composer, Integer num) {
        invoke((p<? super Composer, ? super Integer, r2>) pVar, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void invoke(@l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        int i6;
        if ((i5 & 14) == 0) {
            i6 = i5 | (composer.changedInstance(pVar) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1001528775, i6, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:396)");
        }
        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
        String text = this.$value.getText();
        boolean z4 = this.$enabled;
        boolean z5 = this.$singleLine;
        VisualTransformation visualTransformation = this.$visualTransformation;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        boolean z6 = this.$isError;
        p<Composer, Integer, r2> pVar2 = this.$label;
        p<Composer, Integer, r2> pVar3 = this.$placeholder;
        p<Composer, Integer, r2> pVar4 = this.$leadingIcon;
        p<Composer, Integer, r2> pVar5 = this.$trailingIcon;
        int i7 = i6;
        TextFieldColors textFieldColors = this.$colors;
        textFieldDefaults.OutlinedTextFieldDecorationBox(text, pVar, z4, z5, visualTransformation, mutableInteractionSource, z6, pVar2, pVar3, pVar4, pVar5, textFieldColors, null, ComposableLambdaKt.composableLambda(composer, -753611134, true, new AnonymousClass1(z4, z6, mutableInteractionSource, textFieldColors, this.$shape)), composer, (i7 << 3) & 112, 27648, 4096);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
