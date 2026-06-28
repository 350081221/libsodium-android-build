package androidx.compose.foundation.text2;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BasicTextField2Kt$BasicTextField2$1$1 extends n0 implements l<TextFieldValue, r2> {
    final /* synthetic */ l<String, r2> $onValueChange;
    final /* synthetic */ MutableState<TextFieldValue> $valueWithSelection$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTextField2Kt$BasicTextField2$1$1(l<? super String, r2> lVar, MutableState<TextFieldValue> mutableState) {
        super(1);
        this.$onValueChange = lVar;
        this.$valueWithSelection$delegate = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextFieldValue textFieldValue) {
        TextFieldValue BasicTextField2$lambda$2;
        String text = textFieldValue.getText();
        BasicTextField2$lambda$2 = BasicTextField2Kt.BasicTextField2$lambda$2(this.$valueWithSelection$delegate);
        if (!l0.g(text, BasicTextField2$lambda$2.getText())) {
            this.$onValueChange.invoke(textFieldValue.getText());
        }
        this.$valueWithSelection$delegate.setValue(textFieldValue);
    }
}
