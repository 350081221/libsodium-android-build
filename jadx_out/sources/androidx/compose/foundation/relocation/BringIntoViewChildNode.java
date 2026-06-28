package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00058D@BX\u0084\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewChildNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lkotlin/r2;", "onPlaced", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "defaultParent", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "<set-?>", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getLocalParent", "()Landroidx/compose/foundation/relocation/BringIntoViewParent;", "localParent", "getParent", "parent", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n1#2:90\n*E\n"})
/* loaded from: classes.dex */
public abstract class BringIntoViewChildNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @l
    private final BringIntoViewParent defaultParent = BringIntoViewResponder_androidKt.defaultBringIntoViewParent(this);

    @m
    private LayoutCoordinates layoutCoordinates;

    private final BringIntoViewParent getLocalParent() {
        return (BringIntoViewParent) getCurrent(BringIntoViewKt.getModifierLocalBringIntoViewParent());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final BringIntoViewParent getParent() {
        BringIntoViewParent localParent = getLocalParent();
        return localParent == null ? this.defaultParent : localParent;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@l LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }
}
