package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {145, 183}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", n = {"onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "onPointerSlopReached", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "F$0", "F$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1"})
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends kotlin.coroutines.jvm.internal.d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(kotlin.coroutines.d<? super DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1> dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.m1854awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
