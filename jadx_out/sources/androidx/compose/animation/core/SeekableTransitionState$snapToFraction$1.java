package androidx.compose.animation.core;

import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0}, l = {228}, m = "snapToFraction", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SeekableTransitionState$snapToFraction$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$snapToFraction$1(SeekableTransitionState<S> seekableTransitionState, kotlin.coroutines.d<? super SeekableTransitionState$snapToFraction$1> dVar) {
        super(dVar);
        this.this$0 = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.snapToFraction(0.0f, this);
    }
}
