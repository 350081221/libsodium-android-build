package androidx.compose.material;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState$targetValue$2<T> extends n0 implements a<T> {
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$targetValue$2(AnchoredDraggableState<T> anchoredDraggableState) {
        super(0);
        this.this$0 = anchoredDraggableState;
    }

    @Override // v3.a
    public final T invoke() {
        Object dragTarget;
        Object computeTarget;
        dragTarget = this.this$0.getDragTarget();
        T t5 = (T) dragTarget;
        if (t5 == null) {
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            float offset = anchoredDraggableState.getOffset();
            if (!Float.isNaN(offset)) {
                computeTarget = anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
                return (T) computeTarget;
            }
            return anchoredDraggableState.getCurrentValue();
        }
        return t5;
    }
}
