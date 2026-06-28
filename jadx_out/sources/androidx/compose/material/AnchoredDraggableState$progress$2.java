package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$progress$2 extends n0 implements a<Float> {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$progress$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Float invoke() {
        float positionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
        float positionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material_release()) - positionOf;
        float abs = Math.abs(positionOf2);
        float f5 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float requireOffset = (this.this$0.requireOffset() - positionOf) / positionOf2;
            if (requireOffset < 1.0E-6f) {
                f5 = 0.0f;
            } else if (requireOffset <= 0.999999f) {
                f5 = requireOffset;
            }
        }
        return Float.valueOf(f5);
    }
}
