package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$4", f = "ProduceState.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$4 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ p<ProduceStateScope<T>, d<? super r2>, Object> $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__ProduceStateKt$produceState$4(p<? super ProduceStateScope<T>, ? super d<? super r2>, ? extends Object> pVar, MutableState<T> mutableState, d<? super SnapshotStateKt__ProduceStateKt$produceState$4> dVar) {
        super(2, dVar);
        this.$producer = pVar;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        SnapshotStateKt__ProduceStateKt$produceState$4 snapshotStateKt__ProduceStateKt$produceState$4 = new SnapshotStateKt__ProduceStateKt$produceState$4(this.$producer, this.$result, dVar);
        snapshotStateKt__ProduceStateKt$produceState$4.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$4;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$4) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            p<ProduceStateScope<T>, d<? super r2>, Object> pVar = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, s0Var.getCoroutineContext());
            this.label = 1;
            if (pVar.invoke(produceStateScopeImpl, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
