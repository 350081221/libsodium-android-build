package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/ScrollableNode;", "create", "node", "Lkotlin/r2;", "update", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/ScrollableState;", "getState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "enabled", "Z", "getEnabled", "()Z", "reverseDirection", "getReverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getBringIntoViewSpec", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableElement extends ModifierNodeElement<ScrollableNode> {

    @l
    private final BringIntoViewSpec bringIntoViewSpec;
    private final boolean enabled;

    @m
    private final FlingBehavior flingBehavior;

    @m
    private final MutableInteractionSource interactionSource;

    @l
    private final Orientation orientation;

    @m
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;

    @l
    private final ScrollableState state;

    public ScrollableElement(@l ScrollableState scrollableState, @l Orientation orientation, @m OverscrollEffect overscrollEffect, boolean z4, boolean z5, @m FlingBehavior flingBehavior, @m MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z4;
        this.reverseDirection = z5;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (l0.g(this.state, scrollableElement.state) && this.orientation == scrollableElement.orientation && l0.g(this.overscrollEffect, scrollableElement.overscrollEffect) && this.enabled == scrollableElement.enabled && this.reverseDirection == scrollableElement.reverseDirection && l0.g(this.flingBehavior, scrollableElement.flingBehavior) && l0.g(this.interactionSource, scrollableElement.interactionSource) && l0.g(this.bringIntoViewSpec, scrollableElement.bringIntoViewSpec)) {
            return true;
        }
        return false;
    }

    @l
    public final BringIntoViewSpec getBringIntoViewSpec() {
        return this.bringIntoViewSpec;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @m
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @l
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @m
    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @l
    public final ScrollableState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int i6;
        int hashCode = ((this.state.hashCode() * 31) + this.orientation.hashCode()) * 31;
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        int i7 = 0;
        if (overscrollEffect != null) {
            i5 = overscrollEffect.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((((hashCode + i5) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.reverseDirection)) * 31;
        FlingBehavior flingBehavior = this.flingBehavior;
        if (flingBehavior != null) {
            i6 = flingBehavior.hashCode();
        } else {
            i6 = 0;
        }
        int i8 = (hashCode2 + i6) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            i7 = mutableInteractionSource.hashCode();
        }
        return ((i8 + i7) * 31) + this.bringIntoViewSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("scrollable");
        inspectorInfo.getProperties().set("orientation", this.orientation);
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("flingBehavior", this.flingBehavior);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("scrollableBringIntoViewConfig", this.bringIntoViewSpec);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public ScrollableNode create() {
        return new ScrollableNode(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l ScrollableNode scrollableNode) {
        scrollableNode.update(this.state, this.orientation, this.overscrollEffect, this.enabled, this.reverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
    }
}
