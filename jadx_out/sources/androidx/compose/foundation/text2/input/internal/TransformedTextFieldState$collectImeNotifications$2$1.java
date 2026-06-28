package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransformedTextFieldState$collectImeNotifications$2$1 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ TextFieldState.NotifyImeListener $notifyImeListener;
    final /* synthetic */ TransformedTextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$2$1(TransformedTextFieldState transformedTextFieldState, TextFieldState.NotifyImeListener notifyImeListener) {
        super(1);
        this.this$0 = transformedTextFieldState;
        this.$notifyImeListener = notifyImeListener;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        this.this$0.textFieldState.removeNotifyImeListener$foundation_release(this.$notifyImeListener);
    }
}
