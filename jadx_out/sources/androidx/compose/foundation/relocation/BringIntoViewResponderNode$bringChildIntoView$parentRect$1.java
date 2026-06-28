package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode$bringChildIntoView$parentRect$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
/* loaded from: classes.dex */
final class BringIntoViewResponderNode$bringChildIntoView$parentRect$1 extends n0 implements a<Rect> {
    final /* synthetic */ a<Rect> $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringChildIntoView$parentRect$1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar) {
        super(0);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @m
    public final Rect invoke() {
        Rect bringChildIntoView$localRect;
        bringChildIntoView$localRect = BringIntoViewResponderNode.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
        if (bringChildIntoView$localRect != null) {
            return this.this$0.getResponder().calculateRectForParent(bringChildIntoView$localRect);
        }
        return null;
    }
}
