package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BasicTooltip_androidKt$handleGestures$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ BasicTooltipState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ BasicTooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 1, 1}, l = {158, 164, 172}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00031 extends kotlin.coroutines.jvm.internal.k implements v3.p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            final /* synthetic */ BasicTooltipState $state;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00041 extends kotlin.coroutines.jvm.internal.k implements v3.p<AwaitPointerEventScope, kotlin.coroutines.d<? super PointerInputChange>, Object> {
                final /* synthetic */ PointerEventPass $pass;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00041(PointerEventPass pointerEventPass, kotlin.coroutines.d<? super C00041> dVar) {
                    super(2, dVar);
                    this.$pass = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    C00041 c00041 = new C00041(this.$pass, dVar);
                    c00041.L$0 = obj;
                    return c00041;
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super PointerInputChange> dVar) {
                    return ((C00041) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
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
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = this.$pass;
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, this);
                        if (obj == l5) {
                            return l5;
                        }
                    }
                    return obj;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ BasicTooltipState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                    super(2, dVar);
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    return new AnonymousClass2(this.$state, dVar);
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            C00031(s0 s0Var, BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super C00031> dVar) {
                super(2, dVar);
                this.$$this$coroutineScope = s0Var;
                this.$state = basicTooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C00031 c00031 = new C00031(this.$$this$coroutineScope, this.$state, dVar);
                c00031.L$0 = obj;
                return c00031;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00031) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00b9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x00c7 A[LOOP:0: B:8:0x00c5->B:9:0x00c7, LOOP_END] */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1.AnonymousClass1.C00031.invokeSuspend(java.lang.Object):java.lang.Object");
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
                C00031 c00031 = new C00031(s0Var, this.$state, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00031, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$handleGestures$1(BasicTooltipState basicTooltipState, kotlin.coroutines.d<? super BasicTooltip_androidKt$handleGestures$1> dVar) {
        super(2, dVar);
        this.$state = basicTooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        BasicTooltip_androidKt$handleGestures$1 basicTooltip_androidKt$handleGestures$1 = new BasicTooltip_androidKt$handleGestures$1(this.$state, dVar);
        basicTooltip_androidKt$handleGestures$1.L$0 = obj;
        return basicTooltip_androidKt$handleGestures$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((BasicTooltip_androidKt$handleGestures$1) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
