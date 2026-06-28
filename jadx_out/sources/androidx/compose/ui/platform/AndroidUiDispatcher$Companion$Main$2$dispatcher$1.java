package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.r2;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Choreographer>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(kotlin.coroutines.d<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super Choreographer> dVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            kotlin.e1.n(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
