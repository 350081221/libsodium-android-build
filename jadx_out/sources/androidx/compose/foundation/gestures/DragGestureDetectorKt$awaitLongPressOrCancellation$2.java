package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {812, 829}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n86#2,2:876\n33#2,6:878\n88#2:884\n101#2,2:885\n33#2,6:887\n103#2:893\n101#2,2:894\n33#2,6:896\n103#2:902\n116#2,2:903\n33#2,6:905\n118#2:911\n116#2,2:912\n33#2,6:914\n118#2:920\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n813#1:876,2\n813#1:878,6\n813#1:884\n819#1:885,2\n819#1:887,6\n819#1:893\n830#1:894,2\n830#1:896,6\n830#1:902\n834#1:903,2\n834#1:905,6\n834#1:911\n844#1:912,2\n844#1:914,6\n844#1:920\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ k1.h<PointerInputChange> $currentDown;
    final /* synthetic */ k1.h<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(k1.h<PointerInputChange> hVar, k1.h<PointerInputChange> hVar2, d<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> dVar) {
        super(2, dVar);
        this.$currentDown = hVar;
        this.$longPress = hVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, dVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v10, types: [androidx.compose.ui.input.pointer.PointerInputChange, T] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00c3 -> B:6:0x00c5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
