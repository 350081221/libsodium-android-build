package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt$handleGestures$2 extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ BasicTooltipState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ BasicTooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
        @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00581 extends kotlin.coroutines.jvm.internal.k implements v3.p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            final /* synthetic */ BasicTooltipState $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
            @kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00591 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ BasicTooltipState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00591(BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super C00591> dVar) {
                    super(2, dVar);
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new C00591(this.$state, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C00591) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
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
                        BasicTooltipState basicTooltipState = this.$state;
                        MutatePriority mutatePriority = MutatePriority.UserInput;
                        this.label = 1;
                        if (basicTooltipState.show(mutatePriority, this) == l5) {
                            return l5;
                        }
                    }
                    return r2.f19517a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00581(s0 s0Var, BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super C00581> dVar) {
                super(2, dVar);
                this.$$this$coroutineScope = s0Var;
                this.$state = basicTooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C00581 c00581 = new C00581(this.$$this$coroutineScope, this.$state, dVar);
                c00581.L$0 = obj;
                return c00581;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00581) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x005e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003b -> B:5:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r14.label
                    r2 = 1
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r14.L$1
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                    java.lang.Object r3 = r14.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    kotlin.e1.n(r15)
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r14
                    goto L41
                L1b:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L23:
                    kotlin.e1.n(r15)
                    java.lang.Object r15 = r14.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                    r3 = r15
                    r15 = r14
                L2e:
                    r15.L$0 = r3
                    r15.L$1 = r1
                    r15.label = r2
                    java.lang.Object r4 = r3.awaitPointerEvent(r1, r15)
                    if (r4 != r0) goto L3b
                    return r0
                L3b:
                    r13 = r0
                    r0 = r15
                    r15 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r13
                L41:
                    androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                    java.util.List r5 = r15.getChanges()
                    r6 = 0
                    java.lang.Object r5 = r5.get(r6)
                    androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
                    int r5 = r5.m4875getTypeT8wyACA()
                    androidx.compose.ui.input.pointer.PointerType$Companion r6 = androidx.compose.ui.input.pointer.PointerType.Companion
                    int r6 = r6.m4949getMouseT8wyACA()
                    boolean r5 = androidx.compose.ui.input.pointer.PointerType.m4944equalsimpl0(r5, r6)
                    if (r5 == 0) goto L8f
                    int r15 = r15.m4814getType7fucELk()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                    int r6 = r5.m4825getEnter7fucELk()
                    boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m4821equalsimpl0(r15, r6)
                    if (r6 == 0) goto L80
                    kotlinx.coroutines.s0 r7 = r0.$$this$coroutineScope
                    r8 = 0
                    r9 = 0
                    androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1$1 r10 = new androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2$1$1$1
                    androidx.compose.material3.BasicTooltipState r15 = r0.$state
                    r5 = 0
                    r10.<init>(r15, r5)
                    r11 = 3
                    r12 = 0
                    kotlinx.coroutines.i.e(r7, r8, r9, r10, r11, r12)
                    goto L8f
                L80:
                    int r5 = r5.m4826getExit7fucELk()
                    boolean r15 = androidx.compose.ui.input.pointer.PointerEventType.m4821equalsimpl0(r15, r5)
                    if (r15 == 0) goto L8f
                    androidx.compose.material3.BasicTooltipState r15 = r0.$state
                    r15.dismiss()
                L8f:
                    r15 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L2e
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BasicTooltip_androidKt$handleGestures$2.AnonymousClass1.C00581.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$state = basicTooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
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
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C00581 c00581 = new C00581(s0Var, this.$state, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(c00581, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$handleGestures$2(BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super BasicTooltip_androidKt$handleGestures$2> dVar) {
        super(2, dVar);
        this.$state = basicTooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        BasicTooltip_androidKt$handleGestures$2 basicTooltip_androidKt$handleGestures$2 = new BasicTooltip_androidKt$handleGestures$2(this.$state, dVar);
        basicTooltip_androidKt$handleGestures$2.L$0 = obj;
        return basicTooltip_androidKt$handleGestures$2;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((BasicTooltip_androidKt$handleGestures$2) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
            this.label = 1;
            if (t0.g(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
