package androidx.compose.foundation.gestures;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AbstractDraggableNode$startListeningForEvents$1 extends o implements p<s0, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0, 1}, l = {437, 438}, m = "invokeSuspend", n = {"$this$drag", "$this$drag"}, s = {"L$0", "L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/AbstractDragScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/AbstractDraggableNode$startListeningForEvents$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<AbstractDragScope, d<? super r2>, Object> {
        final /* synthetic */ k1.h<DragEvent> $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(k1.h<DragEvent> hVar, AbstractDraggableNode abstractDraggableNode, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$event = hVar;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l AbstractDragScope abstractDragScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(abstractDragScope, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:6:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r9.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r1 = r9.L$1
                kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                java.lang.Object r4 = r9.L$0
                androidx.compose.foundation.gestures.AbstractDragScope r4 = (androidx.compose.foundation.gestures.AbstractDragScope) r4
                kotlin.e1.n(r10)
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L83
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.L$0
                androidx.compose.foundation.gestures.AbstractDragScope r1 = (androidx.compose.foundation.gestures.AbstractDragScope) r1
                kotlin.e1.n(r10)
                r10 = r9
                goto L67
            L30:
                kotlin.e1.n(r10)
                java.lang.Object r10 = r9.L$0
                androidx.compose.foundation.gestures.AbstractDragScope r10 = (androidx.compose.foundation.gestures.AbstractDragScope) r10
                r1 = r10
                r10 = r9
            L39:
                kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.DragEvent> r4 = r10.$event
                T r4 = r4.element
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                if (r5 != 0) goto L89
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                if (r5 != 0) goto L89
                boolean r5 = r4 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                r6 = 0
                if (r5 == 0) goto L4e
                r5 = r4
                androidx.compose.foundation.gestures.DragEvent$DragDelta r5 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r5
                goto L4f
            L4e:
                r5 = r6
            L4f:
                if (r5 == 0) goto L67
                androidx.compose.foundation.gestures.AbstractDraggableNode r5 = r10.this$0
                java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta"
                kotlin.jvm.internal.l0.n(r4, r7)
                androidx.compose.foundation.gestures.DragEvent$DragDelta r4 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r4
                r10.L$0 = r1
                r10.L$1 = r6
                r10.label = r3
                java.lang.Object r4 = r5.draggingBy(r1, r4, r10)
                if (r4 != r0) goto L67
                return r0
            L67:
                r4 = r1
                kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.DragEvent> r1 = r10.$event
                androidx.compose.foundation.gestures.AbstractDraggableNode r5 = r10.this$0
                kotlinx.coroutines.channels.l r5 = androidx.compose.foundation.gestures.AbstractDraggableNode.access$getChannel$p(r5)
                r10.L$0 = r4
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r5 = r5.D(r10)
                if (r5 != r0) goto L7d
                return r0
            L7d:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r1
                r1 = r8
            L83:
                r4.element = r10
                r10 = r0
                r0 = r1
                r1 = r5
                goto L39
            L89:
                kotlin.r2 r10 = kotlin.r2.f19517a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$startListeningForEvents$1(AbstractDraggableNode abstractDraggableNode, d<? super AbstractDraggableNode$startListeningForEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new AbstractDraggableNode$startListeningForEvents$1(this.this$0, dVar);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((AbstractDraggableNode$startListeningForEvents$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: CancellationException -> 0x00f2, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:27:0x00be, B:29:0x00c4, B:33:0x00db, B:35:0x00df), top: B:26:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[Catch: CancellationException -> 0x00f2, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:27:0x00be, B:29:0x00c4, B:33:0x00db, B:35:0x00df), top: B:26:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ef -> B:9:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0107 -> B:9:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
