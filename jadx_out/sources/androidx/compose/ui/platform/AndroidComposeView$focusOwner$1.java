package androidx.compose.ui.platform;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "it", "invoke", "(Lv3/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidComposeView$focusOwner$1 extends kotlin.jvm.internal.n0 implements v3.l<v3.a<? extends r2>, r2> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$focusOwner$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(v3.a<? extends r2> aVar) {
        invoke2((v3.a<r2>) aVar);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l v3.a<r2> aVar) {
        this.this$0.registerOnEndApplyChangesListener(aVar);
    }
}
