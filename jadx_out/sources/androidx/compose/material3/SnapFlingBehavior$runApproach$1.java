package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {154}, m = "runApproach", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$runApproach$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$runApproach$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.d<? super SnapFlingBehavior$runApproach$1> dVar) {
        super(dVar);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object runApproach;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runApproach = this.this$0.runApproach(null, 0.0f, 0.0f, this);
        return runApproach;
    }
}
