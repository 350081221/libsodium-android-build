package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$3$1 extends n0 implements a<r2> {
    final /* synthetic */ TextFieldValue $textFieldValue;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(TextFieldValue textFieldValue, MutableState<TextFieldValue> mutableState) {
        super(0);
        this.$textFieldValue = textFieldValue;
        this.$textFieldValueState$delegate = mutableState;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextFieldValue BasicTextField$lambda$2;
        TextFieldValue BasicTextField$lambda$22;
        long m5783getSelectiond9O1mEE = this.$textFieldValue.m5783getSelectiond9O1mEE();
        BasicTextField$lambda$2 = BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate);
        if (TextRange.m5538equalsimpl0(m5783getSelectiond9O1mEE, BasicTextField$lambda$2.m5783getSelectiond9O1mEE())) {
            TextRange m5782getCompositionMzsxiRA = this.$textFieldValue.m5782getCompositionMzsxiRA();
            BasicTextField$lambda$22 = BasicTextFieldKt.BasicTextField$lambda$2(this.$textFieldValueState$delegate);
            if (l0.g(m5782getCompositionMzsxiRA, BasicTextField$lambda$22.m5782getCompositionMzsxiRA())) {
                return;
            }
        }
        this.$textFieldValueState$delegate.setValue(this.$textFieldValue);
    }
}
