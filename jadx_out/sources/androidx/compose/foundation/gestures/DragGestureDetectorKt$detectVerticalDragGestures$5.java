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
import kotlin.r2;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1}, l = {390, 392, 400}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "overSlop"}, s = {"L$0", "L$0", "L$1"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectVerticalDragGestures$5 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ a<r2> $onDragCancel;
    final /* synthetic */ a<r2> $onDragEnd;
    final /* synthetic */ l<Offset, r2> $onDragStart;
    final /* synthetic */ p<PointerInputChange, Float, r2> $onVerticalDrag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<PointerInputChange, r2> {
        final /* synthetic */ p<PointerInputChange, Float, r2> $onVerticalDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super PointerInputChange, ? super Float, r2> pVar) {
            super(1);
            this.$onVerticalDrag = pVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l PointerInputChange pointerInputChange) {
            this.$onVerticalDrag.invoke(pointerInputChange, Float.valueOf(Offset.m3494getYimpl(PointerEventKt.positionChange(pointerInputChange))));
            pointerInputChange.consume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectVerticalDragGestures$5(l<? super Offset, r2> lVar, p<? super PointerInputChange, ? super Float, r2> pVar, a<r2> aVar, a<r2> aVar2, d<? super DragGestureDetectorKt$detectVerticalDragGestures$5> dVar) {
        super(2, dVar);
        this.$onDragStart = lVar;
        this.$onVerticalDrag = pVar;
        this.$onDragEnd = aVar;
        this.$onDragCancel = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        DragGestureDetectorKt$detectVerticalDragGestures$5 dragGestureDetectorKt$detectVerticalDragGestures$5 = new DragGestureDetectorKt$detectVerticalDragGestures$5(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, dVar);
        dragGestureDetectorKt$detectVerticalDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectVerticalDragGestures$5;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((DragGestureDetectorKt$detectVerticalDragGestures$5) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.e1.n(r13)
            goto La7
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.L$1
            kotlin.jvm.internal.k1$e r1 = (kotlin.jvm.internal.k1.e) r1
            java.lang.Object r3 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
            kotlin.e1.n(r13)
            goto L72
        L2a:
            java.lang.Object r1 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r13)
            goto L4d
        L32:
            kotlin.e1.n(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
            r6 = 0
            r7 = 0
            r9 = 2
            r10 = 0
            r12.L$0 = r13
            r12.label = r4
            r5 = r13
            r8 = r12
            java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
            if (r1 != r0) goto L4a
            return r0
        L4a:
            r11 = r1
            r1 = r13
            r13 = r11
        L4d:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            kotlin.jvm.internal.k1$e r10 = new kotlin.jvm.internal.k1$e
            r10.<init>()
            long r5 = r13.m4870getIdJ3iCeTQ()
            int r7 = r13.m4875getTypeT8wyACA()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$drag$1
            r8.<init>(r10)
            r12.L$0 = r1
            r12.L$1 = r10
            r12.label = r3
            r4 = r1
            r9 = r12
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m335awaitVerticalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
            if (r13 != r0) goto L70
            return r0
        L70:
            r3 = r1
            r1 = r10
        L72:
            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
            if (r13 == 0) goto Lba
            v3.l<androidx.compose.ui.geometry.Offset, kotlin.r2> r4 = r12.$onDragStart
            long r5 = r13.m4872getPositionF1C5BW0()
            androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m3482boximpl(r5)
            r4.invoke(r5)
            v3.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.r2> r4 = r12.$onVerticalDrag
            float r1 = r1.element
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.e(r1)
            r4.invoke(r13, r1)
            long r4 = r13.m4870getIdJ3iCeTQ()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1 r13 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$1
            v3.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, kotlin.r2> r1 = r12.$onVerticalDrag
            r13.<init>(r1)
            r1 = 0
            r12.L$0 = r1
            r12.L$1 = r1
            r12.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m343verticalDragjO51t88(r3, r4, r13, r12)
            if (r13 != r0) goto La7
            return r0
        La7:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb5
            v3.a<kotlin.r2> r13 = r12.$onDragEnd
            r13.invoke()
            goto Lba
        Lb5:
            v3.a<kotlin.r2> r13 = r12.$onDragCancel
            r13.invoke()
        Lba:
            kotlin.r2 r13 = kotlin.r2.f19517a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
