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
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {234, 235, 240}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,875:1\n33#2,6:876\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$detectDragGesturesAfterLongPress$5\n*L\n246#1:876,6\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ p<PointerInputChange, Offset, r2> $onDrag;
    final /* synthetic */ a<r2> $onDragCancel;
    final /* synthetic */ a<r2> $onDragEnd;
    final /* synthetic */ l<Offset, r2> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<PointerInputChange, r2> {
        final /* synthetic */ p<PointerInputChange, Offset, r2> $onDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super PointerInputChange, ? super Offset, r2> pVar) {
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
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(l<? super Offset, r2> lVar, a<r2> aVar, a<r2> aVar2, p<? super PointerInputChange, ? super Offset, r2> pVar, d<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> dVar) {
        super(2, dVar);
        this.$onDragStart = lVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
        this.$onDrag = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, dVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:8:0x0015, B:9:0x0086, B:11:0x008e, B:13:0x009d, B:15:0x00a9, B:17:0x00ac, B:20:0x00af, B:24:0x00b5, B:28:0x0025, B:29:0x005e, B:31:0x0062, B:36:0x002d, B:37:0x004d, B:41:0x0040), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[Catch: CancellationException -> 0x0031, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:8:0x0015, B:9:0x0086, B:11:0x008e, B:13:0x009d, B:15:0x00a9, B:17:0x00ac, B:20:0x00af, B:24:0x00b5, B:28:0x0025, B:29:0x005e, B:31:0x0062, B:36:0x002d, B:37:0x004d, B:41:0x0040), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:8:0x0015, B:9:0x0086, B:11:0x008e, B:13:0x009d, B:15:0x00a9, B:17:0x00ac, B:20:0x00af, B:24:0x00b5, B:28:0x0025, B:29:0x005e, B:31:0x0062, B:36:0x002d, B:37:0x004d, B:41:0x0040), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            kotlin.e1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L86
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L5e
        L29:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L4d
        L31:
            r12 = move-exception
            goto Lbd
        L34:
            kotlin.e1.n(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L31
            r11.label = r4     // Catch: java.util.concurrent.CancellationException -> L31
            r5 = r1
            r8 = r11
            java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r12 != r0) goto L4d
            return r0
        L4d:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> L31
            long r4 = r12.m4870getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L31
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L31
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m330awaitLongPressOrCancellationrnUCldI(r1, r4, r11)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r12 != r0) goto L5e
            return r0
        L5e:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> L31
            if (r12 == 0) goto Lba
            v3.l<androidx.compose.ui.geometry.Offset, kotlin.r2> r3 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> L31
            long r4 = r12.m4872getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> L31
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m3482boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> L31
            r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L31
            long r3 = r12.m4870getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> L31
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch: java.util.concurrent.CancellationException -> L31
            v3.p<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.r2> r5 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> L31
            r12.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L31
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L31
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m339dragjO51t88(r1, r3, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r12 != r0) goto L85
            return r0
        L85:
            r0 = r1
        L86:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> L31
            boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L31
            if (r12 == 0) goto Lb5
            androidx.compose.ui.input.pointer.PointerEvent r12 = r0.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> L31
            java.util.List r12 = r12.getChanges()     // Catch: java.util.concurrent.CancellationException -> L31
            int r0 = r12.size()     // Catch: java.util.concurrent.CancellationException -> L31
            r1 = 0
        L9b:
            if (r1 >= r0) goto Laf
            java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> L31
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2     // Catch: java.util.concurrent.CancellationException -> L31
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r2)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r3 == 0) goto Lac
            r2.consume()     // Catch: java.util.concurrent.CancellationException -> L31
        Lac:
            int r1 = r1 + 1
            goto L9b
        Laf:
            v3.a<kotlin.r2> r12 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> L31
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L31
            goto Lba
        Lb5:
            v3.a<kotlin.r2> r12 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> L31
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L31
        Lba:
            kotlin.r2 r12 = kotlin.r2.f19517a
            return r12
        Lbd:
            v3.a<kotlin.r2> r0 = r11.$onDragCancel
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
