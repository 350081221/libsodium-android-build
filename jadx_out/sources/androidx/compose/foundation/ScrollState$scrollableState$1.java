package androidx.compose.foundation;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.ranges.u;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends n0 implements v3.l<Float, Float> {
    final /* synthetic */ ScrollState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Float invoke(Float f5) {
        return invoke(f5.floatValue());
    }

    @p4.l
    public final Float invoke(float f5) {
        float f6;
        float H;
        int L0;
        f6 = this.this$0.accumulator;
        float value = this.this$0.getValue() + f5 + f6;
        H = u.H(value, 0.0f, this.this$0.getMaxValue());
        boolean z4 = !(value == H);
        float value2 = H - this.this$0.getValue();
        L0 = kotlin.math.d.L0(value2);
        ScrollState scrollState = this.this$0;
        scrollState.setValue(scrollState.getValue() + L0);
        this.this$0.accumulator = value2 - L0;
        if (z4) {
            f5 = value2;
        }
        return Float.valueOf(f5);
    }
}
