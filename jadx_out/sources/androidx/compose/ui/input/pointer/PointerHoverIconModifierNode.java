package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b1\u00102J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J*\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u00100\u001a\u0004\u0018\u00010-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Lkotlin/r2;", "displayIcon", "displayDefaultIcon", "displayIconIfDescendantsDoNotHavePriority", "findDescendantNodeWithCursorInBounds", "displayIconFromCurrentNodeOrDescendantsWithCursorInBounds", "findOverridingAncestorNode", "displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "onDetach", "", "traverseKey", "Ljava/lang/String;", "getTraverseKey", "()Ljava/lang/String;", "Landroidx/compose/ui/input/pointer/PointerIcon;", t0.b.f22420d, "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "setIcon", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "", "overrideDescendants", "Z", "getOverrideDescendants", "()Z", "setOverrideDescendants", "(Z)V", "cursorInBoundsOfNode", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;

    @l
    private PointerIcon icon;
    private boolean overrideDescendants;

    @l
    private final String traverseKey;

    public /* synthetic */ PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z4, int i5, w wVar) {
        this(pointerIcon, (i5 & 2) != 0 ? false : z4);
    }

    private final void displayDefaultIcon() {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(null);
        }
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        PointerHoverIconModifierNode findOverridingAncestorNode = findOverridingAncestorNode();
        if (findOverridingAncestorNode == null || (pointerIcon = findOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        r2 r2Var;
        k1.h hVar = new k1.h();
        TraversableNodeKt.traverseAncestors(this, new PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(hVar));
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) hVar.element;
        if (pointerHoverIconModifierNode != null) {
            pointerHoverIconModifierNode.displayIcon();
            r2Var = r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            displayDefaultIcon();
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        PointerHoverIconModifierNode pointerHoverIconModifierNode;
        if (!this.cursorInBoundsOfNode) {
            return;
        }
        if (this.overrideDescendants || (pointerHoverIconModifierNode = findDescendantNodeWithCursorInBounds()) == null) {
            pointerHoverIconModifierNode = this;
        }
        pointerHoverIconModifierNode.displayIcon();
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        k1.a aVar = new k1.a();
        aVar.element = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(aVar));
        }
        if (aVar.element) {
            displayIcon();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PointerHoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        k1.h hVar = new k1.h();
        TraversableNodeKt.traverseDescendants(this, new PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(hVar));
        return (PointerHoverIconModifierNode) hVar.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PointerHoverIconModifierNode findOverridingAncestorNode() {
        k1.h hVar = new k1.h();
        TraversableNodeKt.traverseAncestors(this, new PointerHoverIconModifierNode$findOverridingAncestorNode$1(hVar));
        return (PointerHoverIconModifierNode) hVar.element;
    }

    private final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @l
    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.cursorInBoundsOfNode = false;
        displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo170onPointerEventH0pRuoY(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5) {
        if (pointerEventPass == PointerEventPass.Main) {
            int m4814getType7fucELk = pointerEvent.m4814getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m4821equalsimpl0(m4814getType7fucELk, companion.m4825getEnter7fucELk())) {
                this.cursorInBoundsOfNode = true;
                displayIconIfDescendantsDoNotHavePriority();
            } else if (PointerEventType.m4821equalsimpl0(pointerEvent.m4814getType7fucELk(), companion.m4826getExit7fucELk())) {
                this.cursorInBoundsOfNode = false;
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    public final void setIcon(@l PointerIcon pointerIcon) {
        if (!l0.g(this.icon, pointerIcon)) {
            this.icon = pointerIcon;
            if (this.cursorInBoundsOfNode) {
                displayIconIfDescendantsDoNotHavePriority();
            }
        }
    }

    public final void setOverrideDescendants(boolean z4) {
        if (this.overrideDescendants != z4) {
            this.overrideDescendants = z4;
            if (z4) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    public PointerHoverIconModifierNode(@l PointerIcon pointerIcon, boolean z4) {
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.icon = pointerIcon;
        this.overrideDescendants = z4;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @l
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
