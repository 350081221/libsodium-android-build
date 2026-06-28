package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.Lifecycle;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TouchExplorationStateProvider_androidKt$ObserveState$4 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.l<Lifecycle.Event, r2> $handleEvent;
    final /* synthetic */ v3.a<r2> $onDispose;
    final /* synthetic */ Lifecycle $this_ObserveState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TouchExplorationStateProvider_androidKt$ObserveState$4(Lifecycle lifecycle, v3.l<? super Lifecycle.Event, r2> lVar, v3.a<r2> aVar, int i5, int i6) {
        super(2);
        this.$this_ObserveState = lifecycle;
        this.$handleEvent = lVar;
        this.$onDispose = aVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TouchExplorationStateProvider_androidKt.ObserveState(this.$this_ObserveState, this.$handleEvent, this.$onDispose, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
