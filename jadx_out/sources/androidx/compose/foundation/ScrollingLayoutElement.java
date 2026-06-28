package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ScrollingLayoutNode;", "create", "node", "Lkotlin/r2;", "update", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "isReversed", "Z", "()Z", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollingLayoutNode> {
    public static final int $stable = 0;
    private final boolean isReversed;
    private final boolean isVertical;

    @p4.l
    private final ScrollState scrollState;

    public ScrollingLayoutElement(@p4.l ScrollState scrollState, boolean z4, boolean z5) {
        this.scrollState = scrollState;
        this.isReversed = z4;
        this.isVertical = z5;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!l0.g(this.scrollState, scrollingLayoutElement.scrollState) || this.isReversed != scrollingLayoutElement.isReversed || this.isVertical != scrollingLayoutElement.isVertical) {
            return false;
        }
        return true;
    }

    @p4.l
    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + Boolean.hashCode(this.isReversed)) * 31) + Boolean.hashCode(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutInScroll");
        inspectorInfo.getProperties().set("state", this.scrollState);
        inspectorInfo.getProperties().set("isReversed", Boolean.valueOf(this.isReversed));
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.isVertical));
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public ScrollingLayoutNode create() {
        return new ScrollingLayoutNode(this.scrollState, this.isReversed, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l ScrollingLayoutNode scrollingLayoutNode) {
        scrollingLayoutNode.setScrollerState(this.scrollState);
        scrollingLayoutNode.setReversed(this.isReversed);
        scrollingLayoutNode.setVertical(this.isVertical);
    }
}
