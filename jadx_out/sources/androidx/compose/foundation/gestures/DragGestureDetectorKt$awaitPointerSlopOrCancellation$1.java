package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {667, 693}, m = "awaitPointerSlopOrCancellation-pn7EDYM", n = {"$this$awaitPointerSlopOrCancellation_u2dpn7EDYM", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "touchSlop", "totalPositionChange", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM", "pointerDirectionConfig", "onPointerSlopReached", "pointer", "dragEvent", "touchSlop", "totalPositionChange"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "J$0"})
@i0(k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitPointerSlopOrCancellation$1\n*L\n1#1,875:1\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends d {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(kotlin.coroutines.d<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m331awaitPointerSlopOrCancellationpn7EDYM(null, 0L, 0, null, null, this);
    }
}
