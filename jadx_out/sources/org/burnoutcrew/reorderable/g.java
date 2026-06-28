package org.burnoutcrew.reorderable;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.p;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001\u001a}\u0010\u0013\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000726\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\u000bH\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lorg/burnoutcrew/reorderable/l;", "state", "c", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "down", "Lkotlin/Function0;", "Lkotlin/r2;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/v0;", "name", "change", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "onDrag", bi.ay, "(Landroidx/compose/ui/input/pointer/PointerInputScope;JLv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "reorderable"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes4.dex */
public final class g {

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class a extends n0 implements v3.a<r2> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class b extends n0 implements v3.a<r2> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableKt$detectDrag$4", f = "Reorderable.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ long $down;
        final /* synthetic */ p<PointerInputChange, Offset, r2> $onDrag;
        final /* synthetic */ v3.a<r2> $onDragCancel;
        final /* synthetic */ v3.a<r2> $onDragEnd;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes4.dex */
        public static final class a extends n0 implements v3.l<PointerInputChange, r2> {
            final /* synthetic */ p<PointerInputChange, Offset, r2> $onDrag;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super PointerInputChange, ? super Offset, r2> pVar) {
                super(1);
                this.$onDrag = pVar;
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return r2.f19517a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@p4.l PointerInputChange it) {
                l0.p(it, "it");
                this.$onDrag.invoke(it, Offset.m3482boximpl(PointerEventKt.positionChange(it)));
                it.consume();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(long j5, v3.a<r2> aVar, v3.a<r2> aVar2, p<? super PointerInputChange, ? super Offset, r2> pVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$down = j5;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
            this.$onDrag = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.$down, this.$onDragEnd, this.$onDragCancel, this.$onDrag, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            AwaitPointerEventScope awaitPointerEventScope;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                long j5 = this.$down;
                a aVar = new a(this.$onDrag);
                this.L$0 = awaitPointerEventScope2;
                this.label = 1;
                Object m339dragjO51t88 = DragGestureDetectorKt.m339dragjO51t88(awaitPointerEventScope2, j5, aVar, this);
                if (m339dragjO51t88 == l5) {
                    return l5;
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                obj = m339dragjO51t88;
            }
            if (((Boolean) obj).booleanValue()) {
                for (PointerInputChange pointerInputChange : awaitPointerEventScope.getCurrentEvent().getChanges()) {
                    if (PointerEventKt.changedToUp(pointerInputChange)) {
                        pointerInputChange.consume();
                    }
                }
                this.$onDragEnd.invoke();
            } else {
                this.$onDragCancel.invoke();
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableKt$reorderable$1", f = "Reorderable.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    public static final class d extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ l<?> $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableKt$reorderable$1$1", f = "Reorderable.kt", i = {0, 1, 1}, l = {35, 36, 43}, m = "invokeSuspend", n = {"$this$forEachGesture", "$this$forEachGesture", "dragStart"}, s = {"L$0", "L$0", "L$1"})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes4.dex */
        public static final class a extends o implements p<PointerInputScope, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ l<?> $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: org.burnoutcrew.reorderable.g$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0635a extends n0 implements v3.a<r2> {
                final /* synthetic */ l<?> $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0635a(l<?> lVar) {
                    super(0);
                    this.$state = lVar;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$state.K();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* loaded from: classes4.dex */
            public static final class b extends n0 implements v3.a<r2> {
                final /* synthetic */ l<?> $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(l<?> lVar) {
                    super(0);
                    this.$state = lVar;
                }

                @Override // v3.a
                public /* bridge */ /* synthetic */ r2 invoke() {
                    invoke2();
                    return r2.f19517a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.$state.K();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "change", "Landroidx/compose/ui/geometry/Offset;", "dragAmount", "Lkotlin/r2;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* loaded from: classes4.dex */
            public static final class c extends n0 implements p<PointerInputChange, Offset, r2> {
                final /* synthetic */ l<?> $state;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(l<?> lVar) {
                    super(2);
                    this.$state = lVar;
                }

                @Override // v3.p
                public /* bridge */ /* synthetic */ r2 invoke(PointerInputChange pointerInputChange, Offset offset) {
                    m6597invokeUv8p0NA(pointerInputChange, offset.m3503unboximpl());
                    return r2.f19517a;
                }

                /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                public final void m6597invokeUv8p0NA(@p4.l PointerInputChange change, long j5) {
                    l0.p(change, "change");
                    change.consume();
                    this.$state.J((int) Offset.m3493getXimpl(j5), (int) Offset.m3494getYimpl(j5));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "org.burnoutcrew.reorderable.ReorderableKt$reorderable$1$1$down$1", f = "Reorderable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            /* renamed from: org.burnoutcrew.reorderable.g$d$a$d, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0636d extends kotlin.coroutines.jvm.internal.k implements p<AwaitPointerEventScope, kotlin.coroutines.d<? super PointerInputChange>, Object> {
                final /* synthetic */ n $dragStart;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0636d(n nVar, kotlin.coroutines.d<? super C0636d> dVar) {
                    super(2, dVar);
                    this.$dragStart = nVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.l
                public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                    C0636d c0636d = new C0636d(this.$dragStart, dVar);
                    c0636d.L$0 = obj;
                    return c0636d;
                }

                @Override // v3.p
                @p4.m
                public final Object invoke(@p4.l AwaitPointerEventScope awaitPointerEventScope, @p4.m kotlin.coroutines.d<? super PointerInputChange> dVar) {
                    return ((C0636d) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @p4.m
                public final Object invokeSuspend(@p4.l Object obj) {
                    kotlin.coroutines.intrinsics.d.l();
                    if (this.label == 0) {
                        e1.n(obj);
                        List<PointerInputChange> changes = ((AwaitPointerEventScope) this.L$0).getCurrentEvent().getChanges();
                        n nVar = this.$dragStart;
                        int size = changes.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            PointerInputChange pointerInputChange = changes.get(i5);
                            if (PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), nVar.e())) {
                                return pointerInputChange;
                            }
                        }
                        return null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l<?> lVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.$state = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.$state, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((a) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00c3 A[RETURN] */
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
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L34
                    if (r1 == r4) goto L2c
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    kotlin.e1.n(r15)
                    goto Lc4
                L17:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1f:
                    java.lang.Object r1 = r14.L$1
                    org.burnoutcrew.reorderable.n r1 = (org.burnoutcrew.reorderable.n) r1
                    java.lang.Object r3 = r14.L$0
                    androidx.compose.ui.input.pointer.PointerInputScope r3 = (androidx.compose.ui.input.pointer.PointerInputScope) r3
                    kotlin.e1.n(r15)
                    r6 = r3
                    goto L66
                L2c:
                    java.lang.Object r1 = r14.L$0
                    androidx.compose.ui.input.pointer.PointerInputScope r1 = (androidx.compose.ui.input.pointer.PointerInputScope) r1
                    kotlin.e1.n(r15)
                    goto L4f
                L34:
                    kotlin.e1.n(r15)
                    java.lang.Object r15 = r14.L$0
                    androidx.compose.ui.input.pointer.PointerInputScope r15 = (androidx.compose.ui.input.pointer.PointerInputScope) r15
                    org.burnoutcrew.reorderable.l<?> r1 = r14.$state
                    kotlinx.coroutines.channels.l r1 = r1.w()
                    r14.L$0 = r15
                    r14.label = r4
                    java.lang.Object r1 = r1.D(r14)
                    if (r1 != r0) goto L4c
                    return r0
                L4c:
                    r13 = r1
                    r1 = r15
                    r15 = r13
                L4f:
                    org.burnoutcrew.reorderable.n r15 = (org.burnoutcrew.reorderable.n) r15
                    org.burnoutcrew.reorderable.g$d$a$d r4 = new org.burnoutcrew.reorderable.g$d$a$d
                    r4.<init>(r15, r5)
                    r14.L$0 = r1
                    r14.L$1 = r15
                    r14.label = r3
                    java.lang.Object r3 = r1.awaitPointerEventScope(r4, r14)
                    if (r3 != r0) goto L63
                    return r0
                L63:
                    r6 = r1
                    r1 = r15
                    r15 = r3
                L66:
                    androidx.compose.ui.input.pointer.PointerInputChange r15 = (androidx.compose.ui.input.pointer.PointerInputChange) r15
                    if (r15 == 0) goto Lc4
                    org.burnoutcrew.reorderable.l<?> r3 = r14.$state
                    long r7 = r15.m4872getPositionF1C5BW0()
                    float r4 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r7)
                    int r4 = (int) r4
                    long r7 = r15.m4872getPositionF1C5BW0()
                    float r7 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r7)
                    int r7 = (int) r7
                    boolean r3 = r3.L(r4, r7)
                    if (r3 == 0) goto Lc4
                    androidx.compose.ui.geometry.Offset r1 = r1.f()
                    if (r1 == 0) goto L9d
                    org.burnoutcrew.reorderable.l<?> r3 = r14.$state
                    long r7 = r1.m3503unboximpl()
                    float r1 = androidx.compose.ui.geometry.Offset.m3493getXimpl(r7)
                    int r1 = (int) r1
                    float r4 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r7)
                    int r4 = (int) r4
                    r3.J(r1, r4)
                L9d:
                    long r7 = r15.m4870getIdJ3iCeTQ()
                    org.burnoutcrew.reorderable.g$d$a$a r9 = new org.burnoutcrew.reorderable.g$d$a$a
                    org.burnoutcrew.reorderable.l<?> r15 = r14.$state
                    r9.<init>(r15)
                    org.burnoutcrew.reorderable.g$d$a$b r10 = new org.burnoutcrew.reorderable.g$d$a$b
                    org.burnoutcrew.reorderable.l<?> r15 = r14.$state
                    r10.<init>(r15)
                    org.burnoutcrew.reorderable.g$d$a$c r11 = new org.burnoutcrew.reorderable.g$d$a$c
                    org.burnoutcrew.reorderable.l<?> r15 = r14.$state
                    r11.<init>(r15)
                    r14.L$0 = r5
                    r14.L$1 = r5
                    r14.label = r2
                    r12 = r14
                    java.lang.Object r15 = org.burnoutcrew.reorderable.g.a(r6, r7, r9, r10, r11, r12)
                    if (r15 != r0) goto Lc4
                    return r0
                Lc4:
                    kotlin.r2 r15 = kotlin.r2.f19517a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: org.burnoutcrew.reorderable.g.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l<?> lVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.$state = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.$state, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l PointerInputScope pointerInputScope, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((d) create(pointerInputScope, dVar)).invokeSuspend(r2.f19517a);
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
                a aVar = new a(this.$state, null);
                this.label = 1;
                if (ForEachGestureKt.forEachGesture(pointerInputScope, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @p4.m
    public static final Object a(@p4.l PointerInputScope pointerInputScope, long j5, @p4.l v3.a<r2> aVar, @p4.l v3.a<r2> aVar2, @p4.l p<? super PointerInputChange, ? super Offset, r2> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new c(j5, aVar, aVar2, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitPointerEventScope == l5 ? awaitPointerEventScope : r2.f19517a;
    }

    public static /* synthetic */ Object b(PointerInputScope pointerInputScope, long j5, v3.a aVar, v3.a aVar2, p pVar, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = a.INSTANCE;
        }
        v3.a aVar3 = aVar;
        if ((i5 & 4) != 0) {
            aVar2 = b.INSTANCE;
        }
        return a(pointerInputScope, j5, aVar3, aVar2, pVar, dVar);
    }

    @p4.l
    public static final Modifier c(@p4.l Modifier modifier, @p4.l l<?> state) {
        l0.p(modifier, "<this>");
        l0.p(state, "state");
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, r2.f19517a, new d(state, null)));
    }
}
