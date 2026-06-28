package androidx.compose.foundation.text.selection;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2 extends n0 implements v3.a<Integer> {
    final /* synthetic */ int $currentRawOffset;
    final /* synthetic */ SelectableInfo $info;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(SelectableInfo selectableInfo, int i5) {
        super(0);
        this.$info = selectableInfo;
        this.$currentRawOffset = i5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Integer invoke() {
        return Integer.valueOf(this.$info.getTextLayoutResult().getLineForOffset(this.$currentRawOffset));
    }
}
