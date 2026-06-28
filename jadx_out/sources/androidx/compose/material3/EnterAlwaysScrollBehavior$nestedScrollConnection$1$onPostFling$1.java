package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {2118, 2119}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
/* loaded from: classes.dex */
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, kotlin.coroutines.d<? super EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> dVar) {
        super(dVar);
        this.this$0 = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo390onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
