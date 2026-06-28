package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {878}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", "hasDragged", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@i0(k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$drag$2\n*L\n1#1,875:1\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$drag$2 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DragGestureDetectorKt$drag$2(kotlin.coroutines.d<? super DragGestureDetectorKt$drag$2> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m337dragVnAYq1g(null, 0L, null, null, null, this);
    }
}
