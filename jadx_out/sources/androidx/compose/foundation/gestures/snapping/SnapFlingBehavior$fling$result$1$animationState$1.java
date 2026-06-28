package androidx.compose.foundation.gestures.snapping;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnapFlingBehavior$fling$result$1$animationState$1 extends n0 implements l<Float, r2> {
    final /* synthetic */ l<Float, r2> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ k1.e $remainingScrollOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1$animationState$1(k1.e eVar, l<? super Float, r2> lVar) {
        super(1);
        this.$remainingScrollOffset = eVar;
        this.$onRemainingScrollOffsetUpdate = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
        invoke(f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5) {
        k1.e eVar = this.$remainingScrollOffset;
        float f6 = eVar.element - f5;
        eVar.element = f6;
        this.$onRemainingScrollOffsetUpdate.invoke(Float.valueOf(f6));
    }
}
