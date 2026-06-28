package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.q;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001b\u0012<\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e¢\u0006\u0002\b%\u0012<\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\u0013\u0012\u00110(¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b()\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e¢\u0006\u0002\b%\u0012\u0006\u0010+\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRJ\u0010&\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e¢\u0006\u0002\b%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'RJ\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\u0013\u0012\u00110(¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b()\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050$\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e¢\u0006\u0002\b%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0017¨\u0006."}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/gestures/Draggable2DNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Lv3/l;", "enabled", "Z", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Lkotlin/Function0;", "startDragImmediately", "Lv3/a;", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "Lkotlin/u;", "onDragStarted", "Lv3/q;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lv3/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Draggable2DElement extends ModifierNodeElement<Draggable2DNode> {
    public static final int $stable = 0;

    @l
    private final v3.l<PointerInputChange, Boolean> canDrag;
    private final boolean enabled;

    @m
    private final MutableInteractionSource interactionSource;

    @l
    private final q<s0, Offset, d<? super r2>, Object> onDragStarted;

    @l
    private final q<s0, Velocity, d<? super r2>, Object> onDragStopped;
    private final boolean reverseDirection;

    @l
    private final a<Boolean> startDragImmediately;

    @l
    private final Draggable2DState state;

    /* JADX WARN: Multi-variable type inference failed */
    public Draggable2DElement(@l Draggable2DState draggable2DState, @l v3.l<? super PointerInputChange, Boolean> lVar, boolean z4, @m MutableInteractionSource mutableInteractionSource, @l a<Boolean> aVar, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z5) {
        this.state = draggable2DState;
        this.canDrag = lVar;
        this.enabled = z4;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = aVar;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z5;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        Draggable2DElement draggable2DElement = (Draggable2DElement) obj;
        if (l0.g(this.state, draggable2DElement.state) && l0.g(this.canDrag, draggable2DElement.canDrag) && this.enabled == draggable2DElement.enabled && l0.g(this.interactionSource, draggable2DElement.interactionSource) && l0.g(this.startDragImmediately, draggable2DElement.startDragImmediately) && l0.g(this.onDragStarted, draggable2DElement.onDragStarted) && l0.g(this.onDragStopped, draggable2DElement.onDragStopped) && this.reverseDirection == draggable2DElement.reverseDirection) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i5;
        int hashCode = ((((this.state.hashCode() * 31) + this.canDrag.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            i5 = mutableInteractionSource.hashCode();
        } else {
            i5 = 0;
        }
        return ((((((((hashCode + i5) * 31) + this.startDragImmediately.hashCode()) * 31) + this.onDragStarted.hashCode()) * 31) + this.onDragStopped.hashCode()) * 31) + Boolean.hashCode(this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("draggable2D");
        inspectorInfo.getProperties().set("canDrag", this.canDrag);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("startDragImmediately", this.startDragImmediately);
        inspectorInfo.getProperties().set("onDragStarted", this.onDragStarted);
        inspectorInfo.getProperties().set("onDragStopped", this.onDragStopped);
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.reverseDirection));
        inspectorInfo.getProperties().set("state", this.state);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public Draggable2DNode create() {
        return new Draggable2DNode(this.state, this.canDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l Draggable2DNode draggable2DNode) {
        draggable2DNode.update(this.state, this.canDrag, this.enabled, this.interactionSource, this.startDragImmediately, this.onDragStarted, this.onDragStopped, this.reverseDirection);
    }
}
