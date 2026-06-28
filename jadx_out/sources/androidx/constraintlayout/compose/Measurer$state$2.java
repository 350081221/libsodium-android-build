package androidx.constraintlayout.compose;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Measurer$state$2 extends n0 implements v3.a<State> {
    final /* synthetic */ Measurer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Measurer$state$2(Measurer measurer) {
        super(0);
        this.this$0 = measurer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final State invoke() {
        return new State(this.this$0.getDensity());
    }
}
