package androidx.compose.material.pullrefresh;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {117}, m = "onPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection$onPreFling$1 extends d {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, kotlin.coroutines.d<? super PullRefreshNestedScrollConnection$onPreFling$1> dVar) {
        super(dVar);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo632onPreFlingQWom1Mo(0L, this);
    }
}
