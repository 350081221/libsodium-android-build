package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"%\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "PlacementScope", "Landroidx/compose/ui/node/Owner;", "owner", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "Lkotlin/u;", "DefaultLayerBlock", "Lv3/l;", "Landroidx/compose/ui/unit/Constraints;", "DefaultConstraints", "J", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PlaceableKt {

    @l
    private static final v3.l<GraphicsLayerScope, r2> DefaultLayerBlock = PlaceableKt$DefaultLayerBlock$1.INSTANCE;
    private static final long DefaultConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @l
    public static final Placeable.PlacementScope PlacementScope(@l LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new LookaheadCapablePlacementScope(lookaheadCapablePlaceable);
    }

    @l
    public static final Placeable.PlacementScope PlacementScope(@l Owner owner) {
        return new OuterPlacementScope(owner);
    }
}
