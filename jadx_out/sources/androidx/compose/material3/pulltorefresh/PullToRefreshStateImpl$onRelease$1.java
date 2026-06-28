package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl", f = "PullToRefresh.kt", i = {0, 0}, l = {364}, m = "onRelease", n = {"this", "velocity"}, s = {"L$0", "F$0"})
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl$onRelease$1 extends d {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshStateImpl$onRelease$1(PullToRefreshStateImpl pullToRefreshStateImpl, kotlin.coroutines.d<? super PullToRefreshStateImpl$onRelease$1> dVar) {
        super(dVar);
        this.this$0 = pullToRefreshStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onRelease(0.0f, this);
    }
}
