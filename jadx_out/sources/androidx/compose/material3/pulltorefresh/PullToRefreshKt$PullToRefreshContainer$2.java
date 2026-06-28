package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullToRefreshKt$PullToRefreshContainer$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ q<PullToRefreshState, Composer, Integer, r2> $indicator;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ PullToRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PullToRefreshKt$PullToRefreshContainer$2(PullToRefreshState pullToRefreshState, Modifier modifier, q<? super PullToRefreshState, ? super Composer, ? super Integer, r2> qVar, Shape shape, long j5, long j6, int i5, int i6) {
        super(2);
        this.$state = pullToRefreshState;
        this.$modifier = modifier;
        this.$indicator = qVar;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        PullToRefreshKt.m2620PullToRefreshContainerwBJOh4Y(this.$state, this.$modifier, this.$indicator, this.$shape, this.$containerColor, this.$contentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
