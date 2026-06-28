package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.constraintlayout.motion.widget.Key;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, 61}, m = "invokeSuspend", n = {"$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$awaitEachGesture", Key.ROTATION, "zoom", "pan", "pastTouchSlop", "touchSlop", "lockedToPanZoom"}, s = {"L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n101#2,2:256\n33#2,6:258\n103#2:264\n33#2,6:265\n101#2,2:271\n33#2,6:273\n103#2:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt$detectTransformGestures$2\n*L\n62#1:256,2\n62#1:258,6\n62#1:264\n96#1:265,6\n103#1:271,2\n103#1:273,6\n103#1:279\n*E\n"})
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ r<Offset, Offset, Float, Float, r2> $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z4, r<? super Offset, ? super Offset, ? super Float, ? super Float, r2> rVar, d<? super TransformGestureDetectorKt$detectTransformGestures$2> dVar) {
        super(2, dVar);
        this.$panZoomLock = z4;
        this.$onGesture = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, dVar);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0157, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m3490equalsimpl0(r11, androidx.compose.ui.geometry.Offset.Companion.m3509getZeroF1C5BW0()) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x009f -> B:6:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
