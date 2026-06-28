package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode", f = "Draggable.kt", i = {0, 0}, l = {554, 557}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class AbstractDraggableNode$processDragCancel$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$processDragCancel$1(AbstractDraggableNode abstractDraggableNode, kotlin.coroutines.d<? super AbstractDraggableNode$processDragCancel$1> dVar) {
        super(dVar);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object processDragCancel;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processDragCancel = this.this$0.processDragCancel(null, this);
        return processDragCancel;
    }
}
