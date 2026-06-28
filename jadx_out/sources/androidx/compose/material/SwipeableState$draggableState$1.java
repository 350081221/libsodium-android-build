package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.u;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwipeableState$draggableState$1 extends n0 implements l<Float, r2> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
        invoke(f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5) {
        MutableFloatState mutableFloatState;
        float H;
        MutableFloatState mutableFloatState2;
        MutableFloatState mutableFloatState3;
        MutableFloatState mutableFloatState4;
        mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
        float floatValue = mutableFloatState.getFloatValue() + f5;
        H = u.H(floatValue, this.this$0.getMinBound$material_release(), this.this$0.getMaxBound$material_release());
        float f6 = floatValue - H;
        ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
        float computeResistance = resistance$material_release != null ? resistance$material_release.computeResistance(f6) : 0.0f;
        mutableFloatState2 = ((SwipeableState) this.this$0).offsetState;
        mutableFloatState2.setFloatValue(H + computeResistance);
        mutableFloatState3 = ((SwipeableState) this.this$0).overflowState;
        mutableFloatState3.setFloatValue(f6);
        mutableFloatState4 = ((SwipeableState) this.this$0).absoluteOffset;
        mutableFloatState4.setFloatValue(floatValue);
    }
}
