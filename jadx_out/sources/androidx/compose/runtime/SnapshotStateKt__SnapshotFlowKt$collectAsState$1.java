package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
@f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", i = {}, l = {64, 65}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"T", "R", "Landroidx/compose/runtime/ProduceStateScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1<R> extends o implements p<ProduceStateScope<R>, d<? super r2>, Object> {
    final /* synthetic */ g $context;
    final /* synthetic */ i<T> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ i<T> $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(i<? extends T> iVar, ProduceStateScope<R> produceStateScope, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_collectAsState = iVar;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                i<T> iVar = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                j jVar = new j() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                    @Override // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(T t5, @l d<? super r2> dVar) {
                        produceStateScope.setValue(t5);
                        return r2.f19517a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(g gVar, i<? extends T> iVar, d<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> dVar) {
        super(2, dVar);
        this.$context = gVar;
        this.$this_collectAsState = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, dVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ProduceStateScope<R> produceStateScope, @m d<? super r2> dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(produceStateScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1 && i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            if (l0.g(this.$context, kotlin.coroutines.i.INSTANCE)) {
                i<T> iVar = this.$this_collectAsState;
                j jVar = new j() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.1
                    @Override // kotlinx.coroutines.flow.j
                    @m
                    public final Object emit(T t5, @l d<? super r2> dVar) {
                        produceStateScope.setValue(t5);
                        return r2.f19517a;
                    }
                };
                this.label = 1;
                if (iVar.collect(jVar, this) == l5) {
                    return l5;
                }
            } else {
                g gVar = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                this.label = 2;
                if (kotlinx.coroutines.i.h(gVar, anonymousClass2, this) == l5) {
                    return l5;
                }
            }
        }
        return r2.f19517a;
    }
}
