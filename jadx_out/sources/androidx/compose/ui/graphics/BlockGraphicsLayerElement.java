package androidx.compose.ui.graphics;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u001a\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bHÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\u0019\b\u0002\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R(\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/u;", "component1", "block", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/l;", "getBlock", "()Lv3/l;", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends ModifierNodeElement<BlockGraphicsLayerModifier> {

    @p4.l
    private final v3.l<GraphicsLayerScope, r2> block;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(@p4.l v3.l<? super GraphicsLayerScope, r2> lVar) {
        this.block = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlockGraphicsLayerElement copy$default(BlockGraphicsLayerElement blockGraphicsLayerElement, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lVar = blockGraphicsLayerElement.block;
        }
        return blockGraphicsLayerElement.copy(lVar);
    }

    @p4.l
    public final v3.l<GraphicsLayerScope, r2> component1() {
        return this.block;
    }

    @p4.l
    public final BlockGraphicsLayerElement copy(@p4.l v3.l<? super GraphicsLayerScope, r2> lVar) {
        return new BlockGraphicsLayerElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && kotlin.jvm.internal.l0.g(this.block, ((BlockGraphicsLayerElement) obj).block);
    }

    @p4.l
    public final v3.l<GraphicsLayerScope, r2> getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("block", this.block);
    }

    @p4.l
    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.block + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.setLayerBlock(this.block);
        blockGraphicsLayerModifier.invalidateLayerBlock();
    }
}
