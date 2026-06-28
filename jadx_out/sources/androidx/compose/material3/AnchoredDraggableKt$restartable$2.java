package androidx.compose.material3;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {735}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"I", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.p<I, kotlin.coroutines.d<? super r2>, Object> $block;
    final /* synthetic */ v3.a<I> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.j {
        final /* synthetic */ s0 $$this$coroutineScope;
        final /* synthetic */ v3.p<I, kotlin.coroutines.d<? super r2>, Object> $block;
        final /* synthetic */ k1.h<l2> $previousDrag;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {741}, m = "invokeSuspend", n = {}, s = {})
        @kotlin.i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"I", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ s0 $$this$coroutineScope;
            final /* synthetic */ v3.p<I, kotlin.coroutines.d<? super r2>, Object> $block;
            final /* synthetic */ I $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(v3.p<? super I, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, I i5, s0 s0Var, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$block = pVar;
                this.$latestInputs = i5;
                this.$$this$coroutineScope = s0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, dVar);
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
                    v3.p<I, kotlin.coroutines.d<? super r2>, Object> pVar = this.$block;
                    I i6 = this.$latestInputs;
                    this.label = 1;
                    if (pVar.invoke(i6, this) == l5) {
                        return l5;
                    }
                }
                t0.d(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return r2.f19517a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(k1.h<l2> hVar, s0 s0Var, v3.p<? super I, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar) {
            this.$previousDrag = hVar;
            this.$$this$coroutineScope = s0Var;
            this.$block = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(I r8, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.L$2
                kotlinx.coroutines.l2 r8 = (kotlinx.coroutines.l2) r8
                java.lang.Object r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                androidx.compose.material3.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material3.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                kotlin.e1.n(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.e1.n(r9)
                kotlin.jvm.internal.k1$h<kotlinx.coroutines.l2> r9 = r7.$previousDrag
                T r9 = r9.element
                kotlinx.coroutines.l2 r9 = (kotlinx.coroutines.l2) r9
                if (r9 == 0) goto L5d
                androidx.compose.material3.AnchoredDragFinishedSignal r2 = new androidx.compose.material3.AnchoredDragFinishedSignal
                r2.<init>()
                r9.cancel(r2)
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r9 = r9.b0(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.k1$h<kotlinx.coroutines.l2> r9 = r0.$previousDrag
                kotlinx.coroutines.s0 r1 = r0.$$this$coroutineScope
                r2 = 0
                kotlinx.coroutines.u0 r3 = kotlinx.coroutines.u0.UNDISPATCHED
                androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.material3.AnchoredDraggableKt$restartable$2$1$2
                v3.p<I, kotlin.coroutines.d<? super kotlin.r2>, java.lang.Object> r0 = r0.$block
                r5 = 0
                r4.<init>(r0, r8, r1, r5)
                r5 = 1
                r6 = 0
                kotlinx.coroutines.l2 r8 = kotlinx.coroutines.i.e(r1, r2, r3, r4, r5, r6)
                r9.element = r8
                kotlin.r2 r8 = kotlin.r2.f19517a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2(v3.a<? extends I> aVar, v3.p<? super I, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, kotlin.coroutines.d<? super AnchoredDraggableKt$restartable$2> dVar) {
        super(2, dVar);
        this.$inputs = aVar;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, dVar);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((AnchoredDraggableKt$restartable$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            k1.h hVar = new k1.h();
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(hVar, s0Var, this.$block);
            this.label = 1;
            if (snapshotFlow.collect(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
