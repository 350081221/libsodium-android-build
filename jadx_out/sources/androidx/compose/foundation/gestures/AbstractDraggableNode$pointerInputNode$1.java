package androidx.compose.foundation.gestures;

import a1.n;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AbstractDraggableNode$pointerInputNode$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {458}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", i = {0, 1, 1}, l = {n.f158i, 475}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, s = {"L$0", "L$0", "I$0"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00091 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00091(s0 s0Var, AbstractDraggableNode abstractDraggableNode, d<? super C00091> dVar) {
                super(2, dVar);
                this.$$this$coroutineScope = s0Var;
                this.this$0 = abstractDraggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                C00091 c00091 = new C00091(this.$$this$coroutineScope, this.this$0, dVar);
                c00091.L$0 = obj;
                return c00091;
            }

            @Override // v3.p
            @m
            public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
                return ((C00091) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:28|(1:30)|31|32|33|34|35|(1:37)(5:38|9|10|11|(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0127, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0128, code lost:
            
                r12 = r2;
                r2 = r15;
                r11 = r20;
                r10 = r13;
                r14 = r22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
            
                r11 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
            
                r12 = r2;
                r2 = r15;
                r11 = r12;
                r10 = r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0131, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
            
                r20 = r12;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
            
                r0 = androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0165 A[Catch: all -> 0x0166, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0166, blocks: (B:43:0x0145, B:47:0x0165), top: B:42:0x0145 }] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00dd -> B:9:0x00e6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01a6 -> B:18:0x0052). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r24) {
                /*
                    Method dump skipped, instructions count: 434
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.C00091.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, AbstractDraggableNode abstractDraggableNode, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.s0 r0 = (kotlinx.coroutines.s0) r0
                kotlin.e1.n(r8)     // Catch: java.util.concurrent.CancellationException -> L13
                goto L43
            L13:
                r8 = move-exception
                goto L3d
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                kotlin.e1.n(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.s0 r8 = (kotlinx.coroutines.s0) r8
                androidx.compose.ui.input.pointer.PointerInputScope r1 = r7.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L39
                androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1 r3 = new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1     // Catch: java.util.concurrent.CancellationException -> L39
                androidx.compose.foundation.gestures.AbstractDraggableNode r4 = r7.this$0     // Catch: java.util.concurrent.CancellationException -> L39
                r5 = 0
                r3.<init>(r8, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L39
                r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L39
                r7.label = r2     // Catch: java.util.concurrent.CancellationException -> L39
                java.lang.Object r8 = r1.awaitPointerEventScope(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L39
                if (r8 != r0) goto L43
                return r0
            L39:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L3d:
                boolean r0 = kotlinx.coroutines.t0.k(r0)
                if (r0 == 0) goto L46
            L43:
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            L46:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, d<? super AbstractDraggableNode$pointerInputNode$1> dVar) {
        super(2, dVar);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, dVar);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((AbstractDraggableNode$pointerInputNode$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (!this.this$0.getEnabled()) {
                return r2.f19517a;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.this$0, null);
            this.label = 1;
            if (t0.g(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
