package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class UpdatableAnimationState$animateToZero$1 extends d {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, kotlin.coroutines.d<? super UpdatableAnimationState$animateToZero$1> dVar) {
        super(dVar);
        this.this$0 = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateToZero(null, null, this);
    }
}
