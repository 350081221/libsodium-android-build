package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a1\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0087Hø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a)\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b.\u0010'\u001a1\u00100\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0087Hø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a#\u00103\u001a\u000202\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b3\u0010'\"\"\u00108\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105\"\"\u0010<\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u00107\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"T", "Lkotlinx/coroutines/flow/i0;", "Lkotlinx/coroutines/flow/i;", "c", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, bi.aJ, "Lkotlinx/coroutines/flow/t0;", "e", socket.g.f22386a, "Lkotlinx/coroutines/flow/j;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/r2;", bi.ay, "Lkotlin/Function3;", "", "Lkotlin/v0;", "name", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "action", "d", "(Lkotlinx/coroutines/flow/i0;Lv3/q;)Lkotlinx/coroutines/flow/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "m", "(Lkotlinx/coroutines/flow/i0;JLv3/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function4;", "attempt", "o", "(Lkotlinx/coroutines/flow/i0;Lv3/r;)Lkotlinx/coroutines/flow/i;", "", "q", "(Lkotlinx/coroutines/flow/i0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "destination", "", bi.aA, "(Lkotlinx/coroutines/flow/i0;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", bi.aE, "", "r", "(Lkotlinx/coroutines/flow/i0;Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "f", "k", "(Lkotlinx/coroutines/flow/j;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/j;)V", "isActive", "i", "(Lkotlinx/coroutines/flow/j;)Lkotlin/coroutines/g;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lint.kt\nkotlinx/coroutines/flow/LintKt$retry$1\n*L\n1#1,193:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<Throwable, kotlin.coroutines.d<? super Boolean>, Object> {
        int label;

        public a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l Throwable th, @p4.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(th, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                return kotlin.coroutines.jvm.internal.b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @b1(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@p4.l j<?> jVar, @p4.m CancellationException cancellationException) {
        k.c1();
        throw new kotlin.y();
    }

    public static /* synthetic */ void b(j jVar, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        a(jVar, cancellationException);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> c(@p4.l i0<? extends T> i0Var) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @b1(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> d(i0<? extends T> i0Var, v3.q<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar) {
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return k.u(i0Var, qVar);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> e(@p4.l t0<? extends T> t0Var) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object f(i0<? extends T> i0Var, kotlin.coroutines.d<? super Integer> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        kotlin.jvm.internal.i0.e(0);
        Object Y = k.Y(i0Var, dVar);
        kotlin.jvm.internal.i0.e(1);
        return Y;
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> g(@p4.l t0<? extends T> t0Var) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> h(@p4.l i0<? extends T> i0Var, @p4.l kotlin.coroutines.g gVar) {
        k.c1();
        throw new kotlin.y();
    }

    @p4.l
    public static final kotlin.coroutines.g i(@p4.l j<?> jVar) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @b1(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(j jVar) {
    }

    public static final boolean k(@p4.l j<?> jVar) {
        k.c1();
        throw new kotlin.y();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @b1(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(j jVar) {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @b1(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> m(i0<? extends T> i0Var, long j5, v3.p<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return k.w1(i0Var, j5, pVar);
    }

    static /* synthetic */ i n(i0 i0Var, long j5, v3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = Long.MAX_VALUE;
        }
        if ((i5 & 2) != 0) {
            pVar = new a(null);
        }
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return k.w1(i0Var, j5, pVar);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @b1(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> i<T> o(i0<? extends T> i0Var, v3.r<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> rVar) {
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return k.y1(i0Var, rVar);
    }

    @kotlin.internal.f
    private static final <T> Object p(i0<? extends T> i0Var, List<T> list, kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.i0.e(0);
        k.Y1(i0Var, list, dVar);
        kotlin.jvm.internal.i0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object q(i0<? extends T> i0Var, kotlin.coroutines.d<? super List<? extends T>> dVar) {
        Object c5;
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        kotlin.jvm.internal.i0.e(0);
        c5 = o.c(i0Var, null, dVar, 1, null);
        kotlin.jvm.internal.i0.e(1);
        return c5;
    }

    @kotlin.internal.f
    private static final <T> Object r(i0<? extends T> i0Var, Set<T> set, kotlin.coroutines.d<?> dVar) {
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.i0.e(0);
        k.a2(i0Var, set, dVar);
        kotlin.jvm.internal.i0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object s(i0<? extends T> i0Var, kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        Object e5;
        kotlin.jvm.internal.l0.n(i0Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        kotlin.jvm.internal.i0.e(0);
        e5 = o.e(i0Var, null, dVar, 1, null);
        kotlin.jvm.internal.i0.e(1);
        return e5;
    }
}
