package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionMeasurer$drawDebug$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BoxScope $this_drawDebug;
    final /* synthetic */ MotionMeasurer $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionMeasurer$drawDebug$2(MotionMeasurer motionMeasurer, BoxScope boxScope, int i5) {
        super(2);
        this.$tmp0_rcvr = motionMeasurer;
        this.$this_drawDebug = boxScope;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        this.$tmp0_rcvr.drawDebug(this.$this_drawDebug, composer, this.$$changed | 1);
    }
}
