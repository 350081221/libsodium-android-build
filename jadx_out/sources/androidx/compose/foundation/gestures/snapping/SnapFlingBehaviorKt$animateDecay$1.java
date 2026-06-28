package androidx.compose.foundation.gestures.snapping;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {364}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$1 extends d {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SnapFlingBehaviorKt$animateDecay$1(kotlin.coroutines.d<? super SnapFlingBehaviorKt$animateDecay$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object animateDecay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        animateDecay = SnapFlingBehaviorKt.animateDecay(null, 0.0f, null, null, null, this);
        return animateDecay;
    }
}
