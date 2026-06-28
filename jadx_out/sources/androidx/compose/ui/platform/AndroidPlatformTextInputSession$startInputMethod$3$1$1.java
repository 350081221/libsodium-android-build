package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidPlatformTextInputSession$startInputMethod$3$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Throwable, r2> {
    final /* synthetic */ InputMethodSession $methodSession;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3$1$1(InputMethodSession inputMethodSession, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
        super(1);
        this.$methodSession = inputMethodSession;
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.m Throwable th) {
        TextInputService textInputService;
        this.$methodSession.dispose();
        textInputService = this.this$0.textInputService;
        textInputService.stopInput();
    }
}
