package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullToRefreshKt$CircularArrowProgressIndicator$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ a<Float> $progress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$3(a<Float> aVar, long j5, int i5) {
        super(2);
        this.$progress = aVar;
        this.$color = j5;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        PullToRefreshKt.m2619CircularArrowProgressIndicatorRPmYEkk(this.$progress, this.$color, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
