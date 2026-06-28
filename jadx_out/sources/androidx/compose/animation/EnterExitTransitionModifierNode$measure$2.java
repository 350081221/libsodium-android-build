package androidx.compose.animation;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$2 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ l<GraphicsLayerScope, r2> $layerBlock;
    final /* synthetic */ long $offset;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionModifierNode$measure$2(Placeable placeable, long j5, long j6, l<? super GraphicsLayerScope, r2> lVar) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j5;
        this.$offsetDelta = j6;
        this.$layerBlock = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(this.$placeable, IntOffset.m6172getXimpl(this.$offsetDelta) + IntOffset.m6172getXimpl(this.$offset), IntOffset.m6173getYimpl(this.$offsetDelta) + IntOffset.m6173getYimpl(this.$offset), 0.0f, this.$layerBlock);
    }
}
