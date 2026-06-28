package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\t8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/z;", "T", "Lkotlinx/coroutines/t2;", "Lkotlinx/coroutines/y;", "j", "()Ljava/lang/Object;", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", t0.b.f22420d, "", "M", "(Ljava/lang/Object;)Z", "", "exception", "c", "z0", "()Z", "onCancelComplete", "Lkotlinx/coroutines/selects/g;", "a0", "()Lkotlinx/coroutines/selects/g;", "onAwait", "Lkotlinx/coroutines/l2;", "parent", "<init>", "(Lkotlinx/coroutines/l2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class z<T> extends t2 implements y<T> {
    public z(@p4.m l2 l2Var) {
        super(true);
        H0(l2Var);
    }

    @Override // kotlinx.coroutines.y
    public boolean M(T t5) {
        return Q0(t5);
    }

    @Override // kotlinx.coroutines.a1
    @p4.l
    public kotlinx.coroutines.selects.g<T> a0() {
        kotlinx.coroutines.selects.g<T> gVar = (kotlinx.coroutines.selects.g<T>) x0();
        kotlin.jvm.internal.l0.n(gVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return gVar;
    }

    @Override // kotlinx.coroutines.a1
    @p4.m
    public Object b(@p4.l kotlin.coroutines.d<? super T> dVar) {
        Object X = X(dVar);
        kotlin.coroutines.intrinsics.d.l();
        return X;
    }

    @Override // kotlinx.coroutines.y
    public boolean c(@p4.l Throwable th) {
        return Q0(new d0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.a1
    public T j() {
        return (T) p0();
    }

    @Override // kotlinx.coroutines.t2
    public boolean z0() {
        return true;
    }
}
