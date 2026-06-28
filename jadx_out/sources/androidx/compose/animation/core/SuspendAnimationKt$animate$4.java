package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {239, 278}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SuspendAnimationKt$animate$4(kotlin.coroutines.d<? super SuspendAnimationKt$animate$4> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SuspendAnimationKt.animate(null, null, 0L, null, this);
    }
}
