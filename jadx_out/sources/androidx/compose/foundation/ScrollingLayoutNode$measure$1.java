package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.ranges.u;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollingLayoutNode$measure$1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $side;
    final /* synthetic */ ScrollingLayoutNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutNode$measure$1(ScrollingLayoutNode scrollingLayoutNode, int i5, Placeable placeable) {
        super(1);
        this.this$0 = scrollingLayoutNode;
        this.$side = i5;
        this.$placeable = placeable;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        int I;
        I = u.I(this.this$0.getScrollerState().getValue(), 0, this.$side);
        int i5 = this.this$0.isReversed() ? I - this.$side : -I;
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, this.$placeable, this.this$0.isVertical() ? 0 : i5, this.this$0.isVertical() ? i5 : 0, 0.0f, null, 12, null);
    }
}
