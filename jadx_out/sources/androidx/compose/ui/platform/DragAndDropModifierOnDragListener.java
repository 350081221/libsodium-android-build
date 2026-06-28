package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.ArraySet;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\\\u0010\u001c\u001aX\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\f\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0004\b)\u0010*J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J;\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016Rj\u0010\u001c\u001aX\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\f\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", NotificationCompat.CATEGORY_EVENT, "", "onDrag", "Landroidx/compose/ui/draganddrop/DragAndDropTransferData;", "transferData", "Landroidx/compose/ui/geometry/Size;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "Lkotlin/u;", "drawDragDecoration", "drag-12SF9DM", "(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLv3/l;)Z", "drag", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "node", "registerNodeInterest", "isInterestedNode", "Lkotlin/Function3;", "Lkotlin/v0;", "name", "startDrag", "Lv3/q;", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "rootDragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Landroidx/collection/ArraySet;", "interestedNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "<init>", "(Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/DragAndDropModifierOnDragListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2348:1\n1855#2,2:2349\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/DragAndDropModifierOnDragListener\n*L\n2300#1:2349,2\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDropModifierOnDragListener implements View.OnDragListener, DragAndDropManager {

    @p4.l
    private final v3.q<DragAndDropTransferData, Size, v3.l<? super DrawScope, r2>, Boolean> startDrag;

    @p4.l
    private final DragAndDropNode rootDragAndDropNode = new DragAndDropNode(DragAndDropModifierOnDragListener$rootDragAndDropNode$1.INSTANCE);

    @p4.l
    private final ArraySet<DragAndDropModifierNode> interestedNodes = new ArraySet<>(0, 1, null);

    @p4.l
    private final Modifier modifier = new ModifierNodeElement<DragAndDropNode>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(@p4.m Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(@p4.l DragAndDropNode dragAndDropNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        @p4.l
        public DragAndDropNode create() {
            DragAndDropNode dragAndDropNode;
            dragAndDropNode = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return dragAndDropNode;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(@p4.l v3.q<? super DragAndDropTransferData, ? super Size, ? super v3.l<? super DrawScope, r2>, Boolean> qVar) {
        this.startDrag = qVar;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    /* renamed from: drag-12SF9DM */
    public boolean mo3382drag12SF9DM(@p4.l DragAndDropTransferData dragAndDropTransferData, long j5, @p4.l v3.l<? super DrawScope, r2> lVar) {
        return this.startDrag.invoke(dragAndDropTransferData, Size.m3550boximpl(j5), lVar).booleanValue();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    @p4.l
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public boolean isInterestedNode(@p4.l DragAndDropModifierNode dragAndDropModifierNode) {
        return this.interestedNodes.contains(dragAndDropModifierNode);
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(@p4.l View view, @p4.l DragEvent dragEvent) {
        DragAndDropEvent dragAndDropEvent = new DragAndDropEvent(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean acceptDragAndDropTransfer = this.rootDragAndDropNode.acceptDragAndDropTransfer(dragAndDropEvent);
                Iterator<DragAndDropModifierNode> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().onStarted(dragAndDropEvent);
                }
                return acceptDragAndDropTransfer;
            case 2:
                this.rootDragAndDropNode.onMoved(dragAndDropEvent);
                return false;
            case 3:
                return this.rootDragAndDropNode.onDrop(dragAndDropEvent);
            case 4:
                this.rootDragAndDropNode.onEnded(dragAndDropEvent);
                return false;
            case 5:
                this.rootDragAndDropNode.onEntered(dragAndDropEvent);
                return false;
            case 6:
                this.rootDragAndDropNode.onExited(dragAndDropEvent);
                return false;
            default:
                return false;
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropManager
    public void registerNodeInterest(@p4.l DragAndDropModifierNode dragAndDropModifierNode) {
        this.interestedNodes.add(dragAndDropModifierNode);
    }
}
