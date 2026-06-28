package androidx.compose.material3.pulltorefresh;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$nestedScrollConnection$1", f = "PullToRefresh.kt", i = {}, l = {341}, m = "onPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1 extends d {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullToRefreshStateImpl$nestedScrollConnection$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1(PullToRefreshStateImpl$nestedScrollConnection$1 pullToRefreshStateImpl$nestedScrollConnection$1, kotlin.coroutines.d<? super PullToRefreshStateImpl$nestedScrollConnection$1$onPreFling$1> dVar) {
        super(dVar);
        this.this$0 = pullToRefreshStateImpl$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo632onPreFlingQWom1Mo(0L, this);
    }
}
