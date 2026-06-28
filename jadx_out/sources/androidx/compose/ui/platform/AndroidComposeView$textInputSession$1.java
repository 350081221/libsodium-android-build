package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {428}, m = "textInputSession", n = {}, s = {})
/* loaded from: classes.dex */
public final class AndroidComposeView$textInputSession$1 extends kotlin.coroutines.jvm.internal.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$1(AndroidComposeView androidComposeView, kotlin.coroutines.d<? super AndroidComposeView$textInputSession$1> dVar) {
        super(dVar);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.textInputSession(null, this);
    }
}
