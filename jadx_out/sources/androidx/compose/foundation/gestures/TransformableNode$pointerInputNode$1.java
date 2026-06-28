package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1", f = "Transformable.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransformableNode$pointerInputNode$1 extends o implements p<PointerInputScope, d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransformableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TransformableNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {158, 161}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch"}, s = {"L$0", "L$1", "L$0"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00151 extends o implements p<s0, d<? super r2>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00161 extends o implements p<TransformScope, d<? super r2>, Object> {
                final /* synthetic */ k1.h<TransformEvent> $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00161(k1.h<TransformEvent> hVar, TransformableNode transformableNode, d<? super C00161> dVar) {
                    super(2, dVar);
                    this.$event = hVar;
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @l
                public final d<r2> create(@m Object obj, @l d<?> dVar) {
                    C00161 c00161 = new C00161(this.$event, this.this$0, dVar);
                    c00161.L$0 = obj;
                    return c00161;
                }

                @Override // v3.p
                @m
                public final Object invoke(@l TransformScope transformScope, @m d<? super r2> dVar) {
                    return ((C00161) create(transformScope, dVar)).invokeSuspend(r2.f19517a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:5:0x0068). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r8.label
                        r2 = 1
                        if (r1 == 0) goto L23
                        if (r1 != r2) goto L1b
                        java.lang.Object r1 = r8.L$1
                        kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                        java.lang.Object r3 = r8.L$0
                        androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                        kotlin.e1.n(r9)
                        r4 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r8
                        goto L68
                    L1b:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L23:
                        kotlin.e1.n(r9)
                        java.lang.Object r9 = r8.L$0
                        androidx.compose.foundation.gestures.TransformScope r9 = (androidx.compose.foundation.gestures.TransformScope) r9
                        r3 = r9
                        r9 = r8
                    L2c:
                        kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.TransformEvent> r1 = r9.$event
                        T r1 = r1.element
                        boolean r4 = r1 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                        if (r4 != 0) goto L6e
                        boolean r4 = r1 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                        if (r4 == 0) goto L3b
                        androidx.compose.foundation.gestures.TransformEvent$TransformDelta r1 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r1
                        goto L3c
                    L3b:
                        r1 = 0
                    L3c:
                        if (r1 == 0) goto L4d
                        float r4 = r1.getZoomChange()
                        long r5 = r1.m408getPanChangeF1C5BW0()
                        float r1 = r1.getRotationChange()
                        r3.mo320transformByd4ec7I(r4, r5, r1)
                    L4d:
                        kotlin.jvm.internal.k1$h<androidx.compose.foundation.gestures.TransformEvent> r1 = r9.$event
                        androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                        kotlinx.coroutines.channels.l r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                        r9.L$0 = r3
                        r9.L$1 = r1
                        r9.label = r2
                        java.lang.Object r4 = r4.D(r9)
                        if (r4 != r0) goto L62
                        return r0
                    L62:
                        r7 = r0
                        r0 = r9
                        r9 = r4
                        r4 = r3
                        r3 = r1
                        r1 = r7
                    L68:
                        r3.element = r9
                        r9 = r0
                        r0 = r1
                        r3 = r4
                        goto L2c
                    L6e:
                        kotlin.r2 r9 = kotlin.r2.f19517a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00151.C00161.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00151(TransformableNode transformableNode, d<? super C00151> dVar) {
                super(2, dVar);
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                C00151 c00151 = new C00151(this.this$0, dVar);
                c00151.L$0 = obj;
                return c00151;
            }

            @Override // v3.p
            @m
            public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00151) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x0039). Please report as a decompilation issue!!! */
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
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L31
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r11.L$0
                    kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                    kotlin.e1.n(r12)     // Catch: java.util.concurrent.CancellationException -> L15
                L15:
                    r12 = r1
                    goto L38
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    java.lang.Object r1 = r11.L$2
                    kotlin.jvm.internal.k1$h r1 = (kotlin.jvm.internal.k1.h) r1
                    java.lang.Object r4 = r11.L$1
                    kotlin.jvm.internal.k1$h r4 = (kotlin.jvm.internal.k1.h) r4
                    java.lang.Object r5 = r11.L$0
                    kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
                    kotlin.e1.n(r12)
                    r6 = r4
                    r4 = r11
                    goto L5f
                L31:
                    kotlin.e1.n(r12)
                    java.lang.Object r12 = r11.L$0
                    kotlinx.coroutines.s0 r12 = (kotlinx.coroutines.s0) r12
                L38:
                    r1 = r11
                L39:
                    boolean r4 = kotlinx.coroutines.t0.k(r12)
                    if (r4 == 0) goto L89
                    kotlin.jvm.internal.k1$h r4 = new kotlin.jvm.internal.k1$h
                    r4.<init>()
                    androidx.compose.foundation.gestures.TransformableNode r5 = r1.this$0
                    kotlinx.coroutines.channels.l r5 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r5)
                    r1.L$0 = r12
                    r1.L$1 = r4
                    r1.L$2 = r4
                    r1.label = r3
                    java.lang.Object r5 = r5.D(r1)
                    if (r5 != r0) goto L59
                    return r0
                L59:
                    r6 = r4
                    r4 = r1
                    r1 = r6
                    r10 = r5
                    r5 = r12
                    r12 = r10
                L5f:
                    r1.element = r12
                    T r12 = r6.element
                    boolean r12 = r12 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                    if (r12 == 0) goto L86
                    androidx.compose.foundation.gestures.TransformableNode r12 = r4.this$0     // Catch: java.util.concurrent.CancellationException -> L86
                    androidx.compose.foundation.gestures.TransformableState r12 = androidx.compose.foundation.gestures.TransformableNode.access$getState$p(r12)     // Catch: java.util.concurrent.CancellationException -> L86
                    androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L86
                    androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r7 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L86
                    androidx.compose.foundation.gestures.TransformableNode r8 = r4.this$0     // Catch: java.util.concurrent.CancellationException -> L86
                    r9 = 0
                    r7.<init>(r6, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L86
                    r4.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L86
                    r4.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L86
                    r4.L$2 = r9     // Catch: java.util.concurrent.CancellationException -> L86
                    r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L86
                    java.lang.Object r12 = r12.transform(r1, r7, r4)     // Catch: java.util.concurrent.CancellationException -> L86
                    if (r12 != r0) goto L86
                    return r0
                L86:
                    r1 = r4
                    r12 = r5
                    goto L39
                L89:
                    kotlin.r2 r12 = kotlin.r2.f19517a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00151.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TransformableNode transformableNode, s0 s0Var, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = transformableNode;
                this.$$this$coroutineScope = s0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @l
            public final d<r2> create(@m Object obj, @l d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // v3.p
            @m
            public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
                return ((AnonymousClass2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object obj) {
                Object l5;
                kotlinx.coroutines.channels.l lVar;
                boolean z4;
                kotlinx.coroutines.channels.l lVar2;
                v3.l lVar3;
                Object detectZoom;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                try {
                    try {
                        if (i5 != 0) {
                            if (i5 == 1) {
                                e1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            e1.n(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            z4 = this.this$0.lockRotationOnZoomPan;
                            lVar2 = this.this$0.channel;
                            lVar3 = this.this$0.updatedCanPan;
                            this.label = 1;
                            detectZoom = TransformableKt.detectZoom(awaitPointerEventScope, z4, lVar2, lVar3, this);
                            if (detectZoom == l5) {
                                return l5;
                            }
                        }
                    } catch (CancellationException e5) {
                        if (!t0.k(this.$$this$coroutineScope)) {
                            throw e5;
                        }
                    }
                    return r2.f19517a;
                } finally {
                    lVar = this.this$0.channel;
                    lVar.p(TransformEvent.TransformStopped.INSTANCE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = transformableNode;
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
                s0 s0Var = (s0) this.L$0;
                kotlinx.coroutines.k.f(s0Var, null, u0.UNDISPATCHED, new C00151(this.this$0, null), 1, null);
                PointerInputScope pointerInputScope = this.$$this$SuspendingPointerInputModifierNode;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, s0Var, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$pointerInputNode$1(TransformableNode transformableNode, d<? super TransformableNode$pointerInputNode$1> dVar) {
        super(2, dVar);
        this.this$0 = transformableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        TransformableNode$pointerInputNode$1 transformableNode$pointerInputNode$1 = new TransformableNode$pointerInputNode$1(this.this$0, dVar);
        transformableNode$pointerInputNode$1.L$0 = obj;
        return transformableNode$pointerInputNode$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l PointerInputScope pointerInputScope, @m d<? super r2> dVar) {
        return ((TransformableNode$pointerInputNode$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        boolean z4;
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
            z4 = this.this$0.enabled;
            if (!z4) {
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
