package androidx.compose.ui.graphics.vector;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VectorPainter$vector$1$1 extends n0 implements a<r2> {
    final /* synthetic */ VectorPainter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainter$vector$1$1(VectorPainter vectorPainter) {
        super(0);
        this.this$0 = vectorPainter;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int i5;
        int invalidateCount;
        int invalidateCount2;
        i5 = this.this$0.drawCount;
        invalidateCount = this.this$0.getInvalidateCount();
        if (i5 == invalidateCount) {
            VectorPainter vectorPainter = this.this$0;
            invalidateCount2 = vectorPainter.getInvalidateCount();
            vectorPainter.setInvalidateCount(invalidateCount2 + 1);
        }
    }
}
