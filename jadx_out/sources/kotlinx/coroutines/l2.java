package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 02\u00020\u0001:\u00011J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\b\u0010\t\u001a\u00020\bH\u0017J\u0014\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'J\u0013\u0010\u0010\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001a\u00020\u00172'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0012j\u0002`\u0015H&JE\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0012j\u0002`\u0015H'J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0097\u0002R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00008&X§\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00000(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lkotlinx/coroutines/l2;", "Lkotlin/coroutines/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "y", "", "start", "cause", "Lkotlin/r2;", "cancel", "", bi.ay, "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "A0", "b0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/n1;", "t0", "onCancelling", "invokeImmediately", bi.aJ, "other", "H", "getParent", "()Lkotlinx/coroutines/l2;", "getParent$annotations", "()V", "parent", "isActive", "()Z", "d", "isCompleted", "isCancelled", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "children", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "onJoin", "U", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface l2 extends g.b {

    @p4.l
    public static final b U = b.f20428a;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(l2 l2Var) {
            l2Var.cancel(null);
        }

        public static /* synthetic */ void b(l2 l2Var, CancellationException cancellationException, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                cancellationException = null;
            }
            l2Var.cancel(cancellationException);
        }

        public static /* synthetic */ boolean c(l2 l2Var, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return l2Var.a(th);
        }

        public static <R> R d(@p4.l l2 l2Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(l2Var, r5, pVar);
        }

        @p4.m
        public static <E extends g.b> E e(@p4.l l2 l2Var, @p4.l g.c<E> cVar) {
            return (E) g.b.a.b(l2Var, cVar);
        }

        @a2
        public static /* synthetic */ void f() {
        }

        public static /* synthetic */ n1 g(l2 l2Var, boolean z4, boolean z5, v3.l lVar, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i5 & 1) != 0) {
                z4 = false;
            }
            if ((i5 & 2) != 0) {
                z5 = true;
            }
            return l2Var.h(z4, z5, lVar);
        }

        @p4.l
        public static kotlin.coroutines.g h(@p4.l l2 l2Var, @p4.l g.c<?> cVar) {
            return g.b.a.c(l2Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g i(@p4.l l2 l2Var, @p4.l kotlin.coroutines.g gVar) {
            return g.b.a.d(l2Var, gVar);
        }

        @p4.l
        @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static l2 j(@p4.l l2 l2Var, @p4.l l2 l2Var2) {
            return l2Var2;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/l2$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/l2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b implements g.c<l2> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f20428a = new b();

        private b() {
        }
    }

    @p4.l
    @g2
    v A0(@p4.l x xVar);

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    l2 H(@p4.l l2 l2Var);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th);

    @p4.m
    Object b0(@p4.l kotlin.coroutines.d<? super kotlin.r2> dVar);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@p4.m CancellationException cancellationException);

    boolean d();

    @p4.m
    l2 getParent();

    @p4.l
    @g2
    n1 h(boolean z4, boolean z5, @p4.l v3.l<? super Throwable, kotlin.r2> lVar);

    boolean isActive();

    boolean isCancelled();

    @p4.l
    kotlin.sequences.m<l2> o();

    @p4.l
    kotlinx.coroutines.selects.e r0();

    boolean start();

    @p4.l
    n1 t0(@p4.l v3.l<? super Throwable, kotlin.r2> lVar);

    @p4.l
    @g2
    CancellationException y();
}
