package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/s0;", "it", "Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "invoke", "(Lkotlinx/coroutines/s0;)Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidComposeView$textInputSession$2 extends kotlin.jvm.internal.n0 implements v3.l<kotlinx.coroutines.s0, AndroidPlatformTextInputSession> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$2(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // v3.l
    @p4.l
    public final AndroidPlatformTextInputSession invoke(@p4.l kotlinx.coroutines.s0 s0Var) {
        AndroidComposeView androidComposeView = this.this$0;
        return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), s0Var);
    }
}
