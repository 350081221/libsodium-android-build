package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u001d\u0010\u0018J\u0006\u0010\u0004\u001a\u00020\u0003J&\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016R3\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/r2;", "invalidateLayerBlock", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "layerBlock", "Lv3/l;", "getLayerBlock", "()Lv3/l;", "setLayerBlock", "(Lv3/l;)V", "", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n72#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n*L\n568#1:673\n*E\n"})
/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {

    @p4.l
    private v3.l<? super GraphicsLayerScope, r2> layerBlock;

    public BlockGraphicsLayerModifier(@p4.l v3.l<? super GraphicsLayerScope, r2> lVar) {
        this.layerBlock = lVar;
    }

    @p4.l
    public final v3.l<GraphicsLayerScope, r2> getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m5101requireCoordinator64DMado(this, NodeKind.m5204constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new BlockGraphicsLayerModifier$measure$1(mo4998measureBRTryo0, this), 4, null);
    }

    public final void setLayerBlock(@p4.l v3.l<? super GraphicsLayerScope, r2> lVar) {
        this.layerBlock = lVar;
    }

    @p4.l
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
