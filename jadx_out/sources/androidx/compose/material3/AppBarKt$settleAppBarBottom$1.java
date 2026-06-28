package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {1578, 1594}, m = "settleAppBarBottom", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
public final class AppBarKt$settleAppBarBottom$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppBarKt$settleAppBarBottom$1(kotlin.coroutines.d<? super AppBarKt$settleAppBarBottom$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = AppBarKt.settleAppBarBottom(null, 0.0f, null, null, this);
        return obj2;
    }
}
