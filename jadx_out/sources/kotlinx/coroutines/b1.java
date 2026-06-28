package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/b1;", "T", "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/a1;", "j", "()Ljava/lang/Object;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/g;", "a0", "()Lkotlinx/coroutines/selects/g;", "onAwait", "Lkotlin/coroutines/g;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/g;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class b1<T> extends a<T> implements a1<T> {
    public b1(@p4.l kotlin.coroutines.g gVar, boolean z4) {
        super(gVar, true, z4);
    }

    static /* synthetic */ <T> Object x1(b1<T> b1Var, kotlin.coroutines.d<? super T> dVar) {
        Object X = b1Var.X(dVar);
        kotlin.coroutines.intrinsics.d.l();
        return X;
    }

    @Override // kotlinx.coroutines.a1
    @p4.l
    public kotlinx.coroutines.selects.g<T> a0() {
        kotlinx.coroutines.selects.g<T> gVar = (kotlinx.coroutines.selects.g<T>) x0();
        kotlin.jvm.internal.l0.n(gVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return gVar;
    }

    @Override // kotlinx.coroutines.a1
    @p4.m
    public Object b(@p4.l kotlin.coroutines.d<? super T> dVar) {
        return x1(this, dVar);
    }

    @Override // kotlinx.coroutines.a1
    public T j() {
        return (T) p0();
    }
}
