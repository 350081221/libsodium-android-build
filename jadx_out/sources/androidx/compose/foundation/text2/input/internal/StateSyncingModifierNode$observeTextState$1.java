package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class StateSyncingModifierNode$observeTextState$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ k1.h<TextFieldCharSequence> $text;
    final /* synthetic */ StateSyncingModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateSyncingModifierNode$observeTextState$1(k1.h<TextFieldCharSequence> hVar, StateSyncingModifierNode stateSyncingModifierNode) {
        super(0);
        this.$text = hVar;
        this.this$0 = stateSyncingModifierNode;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.foundation.text2.input.TextFieldCharSequence, T] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextFieldState textFieldState;
        k1.h<TextFieldCharSequence> hVar = this.$text;
        textFieldState = this.this$0.state;
        hVar.element = textFieldState.getText();
    }
}
