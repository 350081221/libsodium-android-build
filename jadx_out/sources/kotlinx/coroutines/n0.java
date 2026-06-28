package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.e;
import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/n0;", "Lkotlin/coroutines/a;", "Lkotlin/coroutines/e;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "isDispatchNeeded", "", "parallelism", "limitedParallelism", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "dispatch", "dispatchYield", "T", "Lkotlin/coroutines/d;", "continuation", "interceptContinuation", "releaseInterceptedContinuation", "other", "plus", "", "toString", "<init>", "()V", "Key", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class n0 extends kotlin.coroutines.a implements kotlin.coroutines.e {

    @p4.l
    public static final a Key = new a(null);

    @kotlin.r
    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/n0$a;", "Lkotlin/coroutines/b;", "Lkotlin/coroutines/e;", "Lkotlinx/coroutines/n0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.e, n0> {

        @kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/g$b;", "it", "Lkotlinx/coroutines/n0;", "invoke", "(Lkotlin/coroutines/g$b;)Lkotlinx/coroutines/n0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.n0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0611a extends kotlin.jvm.internal.n0 implements v3.l<g.b, n0> {
            public static final C0611a INSTANCE = new C0611a();

            C0611a() {
                super(1);
            }

            @Override // v3.l
            @p4.m
            public final n0 invoke(@p4.l g.b bVar) {
                if (bVar instanceof n0) {
                    return (n0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(kotlin.coroutines.e.S, C0611a.INSTANCE);
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public n0() {
        super(kotlin.coroutines.e.S);
    }

    public abstract void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable);

    @g2
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        dispatch(gVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) e.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.e
    @p4.l
    public final <T> kotlin.coroutines.d<T> interceptContinuation(@p4.l kotlin.coroutines.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.l(this, dVar);
    }

    public boolean isDispatchNeeded(@p4.l kotlin.coroutines.g gVar) {
        return true;
    }

    @p4.l
    @a2
    public n0 limitedParallelism(int i5) {
        kotlinx.coroutines.internal.u.a(i5);
        return new kotlinx.coroutines.internal.t(this, i5);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return e.a.c(this, cVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final n0 plus(@p4.l n0 n0Var) {
        return n0Var;
    }

    @Override // kotlin.coroutines.e
    public final void releaseInterceptedContinuation(@p4.l kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.l0.n(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((kotlinx.coroutines.internal.l) dVar).x();
    }

    @p4.l
    public String toString() {
        return x0.a(this) + '@' + x0.b(this);
    }
}
