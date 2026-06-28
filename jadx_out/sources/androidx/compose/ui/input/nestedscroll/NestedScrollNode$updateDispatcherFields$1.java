package androidx.compose.ui.input.nestedscroll;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.s0;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/s0;", "invoke", "()Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollNode$updateDispatcherFields$1 extends n0 implements a<s0> {
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$updateDispatcherFields$1(NestedScrollNode nestedScrollNode) {
        super(0);
        this.this$0 = nestedScrollNode;
    }

    @Override // v3.a
    @l
    public final s0 invoke() {
        s0 nestedCoroutineScope;
        nestedCoroutineScope = this.this$0.getNestedCoroutineScope();
        return nestedCoroutineScope;
    }
}
