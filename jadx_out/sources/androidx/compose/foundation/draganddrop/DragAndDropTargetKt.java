package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\u0000*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "Lkotlin/v0;", "name", "startEvent", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/DragAndDropTarget;", TypedValues.AttributesType.S_TARGET, "dragAndDropTarget", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DragAndDropTargetKt {
    @l
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropTarget(@l Modifier modifier, @l v3.l<? super DragAndDropEvent, Boolean> lVar, @l DragAndDropTarget dragAndDropTarget) {
        return modifier.then(new DropTargetElement(lVar, dragAndDropTarget));
    }
}
