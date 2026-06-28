package androidx.compose.ui.draganddrop;

import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draganddrop/DragAndDropTarget;", "", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", NotificationCompat.CATEGORY_EVENT, "", "onDrop", "Lkotlin/r2;", "onStarted", "onEntered", "onMoved", "onExited", "onChanged", "onEnded", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface DragAndDropTarget {
    default void onChanged(@l DragAndDropEvent dragAndDropEvent) {
    }

    boolean onDrop(@l DragAndDropEvent dragAndDropEvent);

    default void onEnded(@l DragAndDropEvent dragAndDropEvent) {
    }

    default void onEntered(@l DragAndDropEvent dragAndDropEvent) {
    }

    default void onExited(@l DragAndDropEvent dragAndDropEvent) {
    }

    default void onMoved(@l DragAndDropEvent dragAndDropEvent) {
    }

    default void onStarted(@l DragAndDropEvent dragAndDropEvent) {
    }
}
