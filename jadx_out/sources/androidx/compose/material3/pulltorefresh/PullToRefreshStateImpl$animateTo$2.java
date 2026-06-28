package androidx.compose.material3.pulltorefresh;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import t0.b;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", b.f22420d, "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PullToRefreshStateImpl$animateTo$2 extends n0 implements p<Float, Float, r2> {
    final /* synthetic */ PullToRefreshStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshStateImpl$animateTo$2(PullToRefreshStateImpl pullToRefreshStateImpl) {
        super(2);
        this.this$0 = pullToRefreshStateImpl;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Float f5, Float f6) {
        invoke(f5.floatValue(), f6.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5, float f6) {
        this.this$0.set_verticalOffset(f5);
    }
}
