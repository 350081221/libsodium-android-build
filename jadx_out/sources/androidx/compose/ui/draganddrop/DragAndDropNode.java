package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B,\u0012#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\n¢\u0006\u0004\b+\u0010,J\b\u0010\u0005\u001a\u00020\u0004H\u0016J;\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0002\b\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R1\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Lkotlin/r2;", "onDetach", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/u;", "drawDragDecoration", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLv3/l;)V", "drag", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "startEvent", "", "acceptDragAndDropTransfer", NotificationCompat.CATEGORY_EVENT, "onStarted", "onEntered", "onMoved", "onChanged", "onExited", "onDrop", "onEnded", "Lkotlin/v0;", "name", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "onDragAndDropStart", "Lv3/l;", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "lastChildDragAndDropModifierNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "thisDragAndDropTarget", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "<init>", "(Lv3/l;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion\n*L\n1#1,307:1\n122#2,10:308\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n216#1:308,10\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode {

    @m
    private DragAndDropModifierNode lastChildDragAndDropModifierNode;

    @l
    private final v3.l<DragAndDropEvent, DragAndDropTarget> onDragAndDropStart;

    @m
    private DragAndDropTarget thisDragAndDropTarget;

    @l
    private final Object traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion;", "", "()V", "firstChildOrNull", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "predicate", "Lkotlin/Function1;", "", "DragAndDropTraversableKey", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropNode$Companion$DragAndDropTraversableKey;", "", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        private static final class DragAndDropTraversableKey {

            @l
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final DragAndDropModifierNode firstChildOrNull(DragAndDropModifierNode dragAndDropModifierNode, v3.l<? super DragAndDropModifierNode, Boolean> lVar) {
            if (!dragAndDropModifierNode.getNode().isAttached()) {
                return null;
            }
            k1.h hVar = new k1.h();
            TraversableNodeKt.traverseDescendants(dragAndDropModifierNode, DragAndDropTraversableKey.INSTANCE, new DragAndDropNode$Companion$firstChildOrNull$1(lVar, hVar));
            return (DragAndDropModifierNode) hVar.element;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(@l v3.l<? super DragAndDropEvent, ? extends DragAndDropTarget> lVar) {
        this.onDragAndDropStart = lVar;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(@l DragAndDropEvent dragAndDropEvent) {
        boolean z4;
        if (!isAttached()) {
            return false;
        }
        if (this.thisDragAndDropTarget == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.thisDragAndDropTarget = this.onDragAndDropStart.invoke(dragAndDropEvent);
            k1.a aVar = new k1.a();
            TraversableNodeKt.traverseChildren(this, new DragAndDropNode$acceptDragAndDropTransfer$2(aVar, dragAndDropEvent, this));
            if (!aVar.element && this.thisDragAndDropTarget == null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    /* renamed from: drag-12SF9DM */
    public void mo3383drag12SF9DM(@l DragAndDropTransferData dragAndDropTransferData, long j5, @l v3.l<? super DrawScope, r2> lVar) {
        DelegatableNodeKt.requireOwner(this).getDragAndDropManager().mo3382drag12SF9DM(dragAndDropTransferData, j5, lVar);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @l
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(@l DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onChanged(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.onChanged(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(@l DragAndDropEvent dragAndDropEvent) {
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode == null) {
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                return dragAndDropTarget.onDrop(dragAndDropEvent);
            }
            return false;
        }
        return dragAndDropModifierNode.onDrop(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(@l DragAndDropEvent dragAndDropEvent) {
        if (!getNode().isAttached()) {
            return;
        }
        TraversableNodeKt.traverseChildren(this, new DragAndDropNode$onEnded$1(dragAndDropEvent));
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEnded(dragAndDropEvent);
        }
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(@l DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onEntered(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.onEntered(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(@l DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onMoved(@l DragAndDropEvent dragAndDropEvent) {
        DragAndDropModifierNode dragAndDropModifierNode;
        boolean m3385containsUv8p0NA;
        DragAndDropModifierNode dragAndDropModifierNode2 = this.lastChildDragAndDropModifierNode;
        boolean z4 = false;
        if (dragAndDropModifierNode2 != null) {
            m3385containsUv8p0NA = DragAndDropNodeKt.m3385containsUv8p0NA(dragAndDropModifierNode2, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent));
            if (m3385containsUv8p0NA) {
                z4 = true;
            }
        }
        if (z4) {
            dragAndDropModifierNode = dragAndDropModifierNode2;
        } else if (!getNode().isAttached()) {
            dragAndDropModifierNode = null;
        } else {
            k1.h hVar = new k1.h();
            TraversableNodeKt.traverseDescendants(this, Companion.DragAndDropTraversableKey.INSTANCE, new DragAndDropNode$onMoved$$inlined$firstChildOrNull$1(hVar, this, dragAndDropEvent));
            dragAndDropModifierNode = (DragAndDropModifierNode) hVar.element;
        }
        if (dragAndDropModifierNode != null && dragAndDropModifierNode2 == null) {
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(dragAndDropEvent);
            }
            DragAndDropNodeKt.dispatchEntered(dragAndDropModifierNode, dragAndDropEvent);
        } else if (dragAndDropModifierNode == null && dragAndDropModifierNode2 != null) {
            dragAndDropModifierNode2.onExited(dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropTarget2, dragAndDropEvent);
            }
        } else if (!l0.g(dragAndDropModifierNode, dragAndDropModifierNode2)) {
            if (dragAndDropModifierNode2 != null) {
                dragAndDropModifierNode2.onExited(dragAndDropEvent);
            }
            if (dragAndDropModifierNode != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropModifierNode, dragAndDropEvent);
            }
        } else if (dragAndDropModifierNode != null) {
            dragAndDropModifierNode.onMoved(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.onMoved(dragAndDropEvent);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropModifierNode;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(@l DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            DragAndDropModifierNode dragAndDropModifierNode = this.lastChildDragAndDropModifierNode;
            if (dragAndDropModifierNode != null) {
                dragAndDropModifierNode.onStarted(dragAndDropEvent);
                return;
            }
            return;
        }
        dragAndDropTarget.onStarted(dragAndDropEvent);
    }
}
