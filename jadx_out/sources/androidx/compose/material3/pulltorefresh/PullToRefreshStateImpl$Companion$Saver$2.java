package androidx.compose.material3.pulltorefresh;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.a;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "isRefreshing", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl$Companion$Saver$2 extends n0 implements l<Boolean, PullToRefreshState> {
    final /* synthetic */ a<Boolean> $enabled;
    final /* synthetic */ float $positionalThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshStateImpl$Companion$Saver$2(float f5, a<Boolean> aVar) {
        super(1);
        this.$positionalThreshold = f5;
        this.$enabled = aVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ PullToRefreshState invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    @m
    public final PullToRefreshState invoke(boolean z4) {
        return new PullToRefreshStateImpl(z4, this.$positionalThreshold, this.$enabled);
    }
}
