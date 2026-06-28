package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.Placeable;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BlockGraphicsLayerModifier$measure$1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ BlockGraphicsLayerModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockGraphicsLayerModifier$measure$1(Placeable placeable, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = blockGraphicsLayerModifier;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, this.$placeable, 0, 0, 0.0f, this.this$0.getLayerBlock(), 4, null);
    }
}
