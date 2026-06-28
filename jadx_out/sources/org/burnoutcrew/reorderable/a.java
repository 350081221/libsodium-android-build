package org.burnoutcrew.reorderable;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lorg/burnoutcrew/reorderable/l;", "state", bi.ay, "b", "reorderable"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class a {

    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorder$1", f = "DetectReorder.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: org.burnoutcrew.reorderable.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0628a extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ l<?> $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorder$1$1", f = "DetectReorder.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: org.burnoutcrew.reorderable.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0629a extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ l<?> $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorder$1$1$1", f = "DetectReorder.kt", i = {0, 1, 1, 1}, l = {30, 34}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "down", "overSlop"}, s = {"L$0", "L$0", "L$1", "L$2"})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: org.burnoutcrew.reorderable.a$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0630a extends kotlin.coroutines.jvm.internal.k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
                final /* synthetic */ l<?> $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX INFO: Access modifiers changed from: package-private */
                @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "change", "Landroidx/compose/ui/geometry/Offset;", "over", "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                /* renamed from: org.burnoutcrew.reorderable.a$a$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0631a extends n0 implements p<PointerInputChange, Offset, r2> {
                    final /* synthetic */ k1.g $overSlop;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0631a(k1.g gVar) {
                        super(2);
                        this.$overSlop = gVar;
                    }

                    @Override // v3.p
                    public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                        m6596invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
                        return r2.f19517a;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m6596invokeUv8p0NA(@p4.l PointerInputChange change, long j5) {
                        l0.p(change, "change");
                        change.consume();
                        this.$overSlop.element = j5;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0630a(l<?> lVar, kotlin.coroutines.d<? super C0630a> dVar) {
                    super(2, dVar);
                    this.$state = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    C0630a c0630a = new C0630a(this.$state, dVar);
                    c0630a.L$0 = obj;
                    return c0630a;
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                    return ((C0630a) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0075 -> B:6:0x0078). Please report as a decompilation issue!!! */
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
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2f
                        if (r1 == r3) goto L27
                        if (r1 != r2) goto L1f
                        java.lang.Object r1 = r12.L$2
                        kotlin.jvm.internal.k1$g r1 = (kotlin.jvm.internal.k1.g) r1
                        java.lang.Object r3 = r12.L$1
                        androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
                        java.lang.Object r4 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        kotlin.e1.n(r13)
                        r10 = r12
                        goto L78
                    L1f:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L27:
                        java.lang.Object r1 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.e1.n(r13)
                        goto L43
                    L2f:
                        kotlin.e1.n(r13)
                        java.lang.Object r13 = r12.L$0
                        r1 = r13
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        r12.L$0 = r1
                        r12.label = r3
                        r13 = 0
                        java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r13, r12)
                        if (r13 != r0) goto L43
                        return r0
                    L43:
                        androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                        kotlin.jvm.internal.k1$g r3 = new kotlin.jvm.internal.k1$g
                        r3.<init>()
                        androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.Companion
                        long r4 = r4.m3509getZeroF1C5BW0()
                        r3.element = r4
                        r10 = r12
                        r11 = r3
                        r3 = r13
                        r13 = r1
                        r1 = r11
                    L57:
                        long r5 = r3.m4870getIdJ3iCeTQ()
                        int r7 = r3.m4875getTypeT8wyACA()
                        org.burnoutcrew.reorderable.a$a$a$a$a r8 = new org.burnoutcrew.reorderable.a$a$a$a$a
                        r8.<init>(r1)
                        r10.L$0 = r13
                        r10.L$1 = r3
                        r10.L$2 = r1
                        r10.label = r2
                        r4 = r13
                        r9 = r10
                        java.lang.Object r4 = org.burnoutcrew.reorderable.c.c(r4, r5, r7, r8, r9)
                        if (r4 != r0) goto L75
                        return r0
                    L75:
                        r11 = r4
                        r4 = r13
                        r13 = r11
                    L78:
                        androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                        if (r13 == 0) goto L85
                        boolean r5 = r13.isConsumed()
                        if (r5 == 0) goto L83
                        goto L85
                    L83:
                        r13 = r4
                        goto L57
                    L85:
                        if (r13 == 0) goto La0
                        org.burnoutcrew.reorderable.l<?> r13 = r10.$state
                        kotlinx.coroutines.channels.l r13 = r13.w()
                        org.burnoutcrew.reorderable.n r0 = new org.burnoutcrew.reorderable.n
                        long r2 = r3.m4870getIdJ3iCeTQ()
                        long r4 = r1.element
                        androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m3482boximpl(r4)
                        r4 = 0
                        r0.<init>(r2, r1, r4)
                        r13.p(r0)
                    La0:
                        kotlin.r2 r13 = kotlin.r2.f19517a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.a.C0628a.C0629a.C0630a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0629a(l<?> lVar, kotlin.coroutines.d<? super C0629a> dVar) {
                super(2, dVar);
                this.$state = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C0629a c0629a = new C0629a(this.$state, dVar);
                c0629a.L$0 = obj;
                return c0629a;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0629a) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
                    PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                    C0630a c0630a = new C0630a(this.$state, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c0630a, this) == l5) {
                        return l5;
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0628a(l<?> lVar, kotlin.coroutines.d<? super C0628a> dVar) {
            super(2, dVar);
            this.$state = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            C0628a c0628a = new C0628a(this.$state, dVar);
            c0628a.L$0 = obj;
            return c0628a;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((C0628a) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C0629a c0629a = new C0629a(this.$state, null);
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(pointerInputScope, c0629a, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorderAfterLongPress$1", f = "DetectReorder.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class b extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ l<?> $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorderAfterLongPress$1$1", f = "DetectReorder.kt", i = {0, 1}, l = {52, 55}, m = "invokeSuspend", n = {"$this$forEachGesture", "down"}, s = {"L$0", "L$0"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: org.burnoutcrew.reorderable.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0632a extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ l<?> $state;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.DetectReorderKt$detectReorderAfterLongPress$1$1$down$1", f = "DetectReorder.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: org.burnoutcrew.reorderable.a$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0633a extends kotlin.coroutines.jvm.internal.k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super PointerInputChange>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C0633a(kotlin.coroutines.d<? super C0633a> dVar) {
                    super(2, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    C0633a c0633a = new C0633a(dVar);
                    c0633a.L$0 = obj;
                    return c0633a;
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super PointerInputChange> dVar) {
                    return ((C0633a) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
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
                        this.label = 1;
                        obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, this);
                        if (obj == l5) {
                            return l5;
                        }
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0632a(l<?> lVar, kotlin.coroutines.d<? super C0632a> dVar) {
                super(2, dVar);
                this.$state = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                C0632a c0632a = new C0632a(this.$state, dVar);
                c0632a.L$0 = obj;
                return c0632a;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C0632a) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
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
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    java.lang.Object r0 = r8.L$0
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                    kotlin.e1.n(r9)
                    goto L4e
                L16:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1e:
                    java.lang.Object r1 = r8.L$0
                    androidx.compose.ui.input.pointer.PointerInputScope r1 = (androidx.compose.ui.input.pointer.PointerInputScope) r1
                    kotlin.e1.n(r9)
                    goto L3f
                L26:
                    kotlin.e1.n(r9)
                    java.lang.Object r9 = r8.L$0
                    r1 = r9
                    androidx.compose.ui.input.pointer.PointerInputScope r1 = (androidx.compose.ui.input.pointer.PointerInputScope) r1
                    org.burnoutcrew.reorderable.a$b$a$a r9 = new org.burnoutcrew.reorderable.a$b$a$a
                    r4 = 0
                    r9.<init>(r4)
                    r8.L$0 = r1
                    r8.label = r3
                    java.lang.Object r9 = r1.awaitPointerEventScope(r9, r8)
                    if (r9 != r0) goto L3f
                    return r0
                L3f:
                    androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                    r8.L$0 = r9
                    r8.label = r2
                    java.lang.Object r1 = org.burnoutcrew.reorderable.c.b(r1, r9, r8)
                    if (r1 != r0) goto L4c
                    return r0
                L4c:
                    r0 = r9
                    r9 = r1
                L4e:
                    androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                    if (r9 == 0) goto L68
                    org.burnoutcrew.reorderable.l<?> r9 = r8.$state
                    kotlinx.coroutines.channels.l r9 = r9.w()
                    org.burnoutcrew.reorderable.n r7 = new org.burnoutcrew.reorderable.n
                    long r2 = r0.m4870getIdJ3iCeTQ()
                    r4 = 0
                    r5 = 2
                    r6 = 0
                    r1 = r7
                    r1.<init>(r2, r4, r5, r6)
                    r9.p(r7)
                L68:
                    kotlin.r2 r9 = kotlin.r2.f19517a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.a.b.C0632a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l<?> lVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.$state = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.$state, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((b) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                C0632a c0632a = new C0632a(this.$state, null);
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(pointerInputScope, c0632a, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @p4.l
    public static final Modifier a(@p4.l Modifier modifier, @p4.l l<?> state) {
        l0.p(modifier, "<this>");
        l0.p(state, "state");
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, r2.f19517a, new C0628a(state, null)));
    }

    @p4.l
    public static final Modifier b(@p4.l Modifier modifier, @p4.l l<?> state) {
        l0.p(modifier, "<this>");
        l0.p(state, "state");
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, r2.f19517a, new b(state, null)));
    }
}
