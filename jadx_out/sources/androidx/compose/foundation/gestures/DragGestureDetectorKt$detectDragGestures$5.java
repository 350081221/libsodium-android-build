package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {175, 884, 926, 192}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "J$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n+ 2 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n659#2,10:876\n669#2,4:895\n673#2,38:906\n116#3,2:886\n33#3,6:888\n118#3:894\n33#3,6:899\n118#3:905\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGestures$5\n*L\n179#1:876,10\n179#1:895,4\n179#1:906,38\n179#1:886,2\n179#1:888,6\n179#1:894\n179#1:899,6\n179#1:905\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGestures$5 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ p<PointerInputChange, Offset, r2> $onDrag;
    final /* synthetic */ a<r2> $onDragCancel;
    final /* synthetic */ a<r2> $onDragEnd;
    final /* synthetic */ l<Offset, r2> $onDragStart;
    float F$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<PointerInputChange, r2> {
        final /* synthetic */ p<PointerInputChange, Offset, r2> $onDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super PointerInputChange, ? super Offset, r2> pVar) {
            super(1);
            this.$onDrag = pVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l PointerInputChange pointerInputChange) {
            this.$onDrag.invoke(pointerInputChange, Offset.m3482boximpl(PointerEventKt.positionChange(pointerInputChange)));
            pointerInputChange.consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGestures$5(l<? super Offset, r2> lVar, p<? super PointerInputChange, ? super Offset, r2> pVar, a<r2> aVar, a<r2> aVar2, d<? super DragGestureDetectorKt$detectDragGestures$5> dVar) {
        super(2, dVar);
        this.$onDragStart = lVar;
        this.$onDrag = pVar;
        this.$onDragCancel = aVar;
        this.$onDragEnd = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, dVar);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00de -> B:21:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0154 -> B:21:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x018b -> B:29:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01d3 -> B:18:0x01da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01fe -> B:21:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0264 -> B:29:0x00f9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
