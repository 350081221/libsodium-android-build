package androidx.compose.ui.draganddrop;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "startEvent", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DragAndDropNodeKt$DragAndDropModifierNode$2 extends n0 implements l<DragAndDropEvent, DragAndDropTarget> {
    final /* synthetic */ l<DragAndDropEvent, Boolean> $shouldStartDragAndDrop;
    final /* synthetic */ DragAndDropTarget $target;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNodeKt$DragAndDropModifierNode$2(l<? super DragAndDropEvent, Boolean> lVar, DragAndDropTarget dragAndDropTarget) {
        super(1);
        this.$shouldStartDragAndDrop = lVar;
        this.$target = dragAndDropTarget;
    }

    @Override // v3.l
    @m
    public final DragAndDropTarget invoke(@p4.l DragAndDropEvent dragAndDropEvent) {
        if (this.$shouldStartDragAndDrop.invoke(dragAndDropEvent).booleanValue()) {
            return this.$target;
        }
        return null;
    }
}
