package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {261}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$animateDecay$1 extends kotlin.coroutines.jvm.internal.d {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateDecay$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.d<? super SnapFlingBehavior$animateDecay$1> dVar) {
        super(dVar);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object animateDecay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateDecay = this.this$0.animateDecay(null, 0.0f, null, null, this);
        return animateDecay;
    }
}
