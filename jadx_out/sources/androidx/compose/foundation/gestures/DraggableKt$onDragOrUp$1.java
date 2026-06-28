package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
@f(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0}, l = {689}, m = "onDragOrUp-Axegvzg", n = {"hasDragged", "onDrag", "$this$drag_u2dVnAYq1g$iv", "$this$awaitDragOrUp_u2djO51t88$iv$iv", "pointer$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class DraggableKt$onDragOrUp$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DraggableKt$onDragOrUp$1(kotlin.coroutines.d<? super DraggableKt$onDragOrUp$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object m358onDragOrUpAxegvzg;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m358onDragOrUpAxegvzg = DraggableKt.m358onDragOrUpAxegvzg(null, null, 0L, null, this);
        return m358onDragOrUpAxegvzg;
    }
}
