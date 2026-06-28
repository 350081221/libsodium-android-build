package androidx.compose.foundation.gestures;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {536, 539, 541}, m = "processDragStart", n = {"this", "$this$processDragStart", NotificationCompat.CATEGORY_EVENT, "this", "$this$processDragStart", NotificationCompat.CATEGORY_EVENT, "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes.dex */
public final class AbstractDraggableNode$processDragStart$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$processDragStart$1(AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.d<? super AbstractDraggableNode$processDragStart$1> dVar) {
        super(dVar);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object processDragStart;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragStart = this.this$0.processDragStart(null, null, this);
        return processDragStart;
    }
}
