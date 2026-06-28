package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ q<PressGestureScope, Offset, d<? super r2>, Object> $onPress;
    final /* synthetic */ l<Offset, r2> $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ PointerInputScope $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0}, l = {237, 245}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
        final /* synthetic */ s0 $$this$coroutineScope;
        final /* synthetic */ q<PressGestureScope, Offset, d<? super r2>, Object> $onPress;
        final /* synthetic */ l<Offset, r2> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00121 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00121(PressGestureScopeImpl pressGestureScopeImpl, d<? super C00121> dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new C00121(this.$pressScope, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((C00121) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
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
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    this.label = 1;
                    if (pressGestureScopeImpl.reset(this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ q<PressGestureScope, Offset, d<? super r2>, Object> $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(q<? super PressGestureScope, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$onPress = qVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new AnonymousClass2(this.$onPress, this.$pressScope, this.$down, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
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
                    q<PressGestureScope, Offset, d<? super r2>, Object> qVar = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m3482boximpl = Offset.m3482boximpl(this.$down.m4872getPositionF1C5BW0());
                    this.label = 1;
                    if (qVar.invoke(pressGestureScopeImpl, m3482boximpl, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, d<? super AnonymousClass3> dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new AnonymousClass3(this.$pressScope, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    this.$pressScope.cancel();
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass4 extends o implements p<s0, d<? super r2>, Object> {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, d<? super AnonymousClass4> dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
                return new AnonymousClass4(this.$pressScope, dVar);
            }

            @Override // v3.p
            @m
            public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
                return ((AnonymousClass4) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@p4.l Object obj) {
                kotlin.coroutines.intrinsics.d.l();
                if (this.label == 0) {
                    e1.n(obj);
                    this.$pressScope.release();
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(s0 s0Var, q<? super PressGestureScope, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, l<? super Offset, r2> lVar, PressGestureScopeImpl pressGestureScopeImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$$this$coroutineScope = s0Var;
            this.$onPress = qVar;
            this.$onTap = lVar;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r24) {
            /*
                r23 = this;
                r6 = r23
                java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r6.label
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L2a
                if (r0 == r9) goto L1f
                if (r0 != r8) goto L17
                kotlin.e1.n(r24)
                r0 = r24
                goto L7d
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1f:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                kotlin.e1.n(r24)
                r11 = r0
                r0 = r24
                goto L51
            L2a:
                kotlin.e1.n(r24)
                java.lang.Object r0 = r6.L$0
                r11 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                kotlinx.coroutines.s0 r0 = r6.$$this$coroutineScope
                r1 = 0
                r2 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r6.$pressScope
                r3.<init>(r4, r10)
                r4 = 3
                r5 = 0
                kotlinx.coroutines.i.e(r0, r1, r2, r3, r4, r5)
                r1 = 0
                r6.L$0 = r11
                r6.label = r9
                r0 = r11
                r3 = r23
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L51
                return r7
            L51:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                r0.consume()
                v3.q<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r1 = r6.$onPress
                v3.q r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                if (r1 == r2) goto L72
                kotlinx.coroutines.s0 r12 = r6.$$this$coroutineScope
                r13 = 0
                r14 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                v3.q<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r1 = r6.$onPress
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r6.$pressScope
                r15.<init>(r1, r2, r0, r10)
                r16 = 3
                r17 = 0
                kotlinx.coroutines.i.e(r12, r13, r14, r15, r16, r17)
            L72:
                r6.L$0 = r10
                r6.label = r8
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r11, r10, r6, r9, r10)
                if (r0 != r7) goto L7d
                return r7
            L7d:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                if (r0 != 0) goto L93
                kotlinx.coroutines.s0 r11 = r6.$$this$coroutineScope
                r12 = 0
                r13 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r14 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r6.$pressScope
                r14.<init>(r0, r10)
                r15 = 3
                r16 = 0
                kotlinx.coroutines.i.e(r11, r12, r13, r14, r15, r16)
                goto Lbd
            L93:
                r0.consume()
                kotlinx.coroutines.s0 r1 = r6.$$this$coroutineScope
                r18 = 0
                r19 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r3 = r6.$pressScope
                r2.<init>(r3, r10)
                r21 = 3
                r22 = 0
                r17 = r1
                r20 = r2
                kotlinx.coroutines.i.e(r17, r18, r19, r20, r21, r22)
                v3.l<androidx.compose.ui.geometry.Offset, kotlin.r2> r1 = r6.$onTap
                if (r1 == 0) goto Lbd
                long r2 = r0.m4872getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m3482boximpl(r2)
                r1.invoke(r0)
            Lbd:
                kotlin.r2 r0 = kotlin.r2.f19517a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, l<? super Offset, r2> lVar, PressGestureScopeImpl pressGestureScopeImpl, d<? super TapGestureDetectorKt$detectTapAndPress$2> dVar) {
        super(2, dVar);
        this.$this_detectTapAndPress = pointerInputScope;
        this.$onPress = qVar;
        this.$onTap = lVar;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, dVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
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
            PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(s0Var, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
