package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0, 0}, l = {299}, m = "animateSnap", n = {"this", "animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$animateSnap$1 extends kotlin.coroutines.jvm.internal.d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateSnap$1(SnapFlingBehavior snapFlingBehavior, kotlin.coroutines.d<? super SnapFlingBehavior$animateSnap$1> dVar) {
        super(dVar);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object animateSnap;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateSnap = this.this$0.animateSnap(null, 0.0f, 0.0f, null, null, this);
        return animateSnap;
    }
}
