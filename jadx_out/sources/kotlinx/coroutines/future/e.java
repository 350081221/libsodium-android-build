package kotlinx.coroutines.future;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.w1;
import kotlinx.coroutines.y;
import p4.m;
import socket.g;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e\u001a\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b*\u00020\u0010\u001a\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015\u001a#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlinx/coroutines/u0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Ljava/util/concurrent/CompletableFuture;", bi.aJ, "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/g;Lkotlinx/coroutines/u0;Lv3/p;)Ljava/util/concurrent/CompletableFuture;", "Lkotlinx/coroutines/a1;", "c", "Lkotlinx/coroutines/l2;", "Lkotlin/r2;", "d", "future", "j", "Ljava/util/concurrent/CompletionStage;", "e", g.f22386a, "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,197:1\n1#2:198\n314#3,11:199\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n172#1:199,11\n*E\n"})
/* loaded from: classes4.dex */
public final class e {

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends n0 implements l<Throwable, r2> {
        final /* synthetic */ CompletableFuture<T> $future;
        final /* synthetic */ a1<T> $this_asCompletableFuture;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CompletableFuture<T> completableFuture, a1<? extends T> a1Var) {
            super(1);
            this.$future = completableFuture;
            this.$this_asCompletableFuture = a1Var;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            try {
                this.$future.complete(this.$this_asCompletableFuture.j());
            } catch (Throwable th2) {
                this.$future.completeExceptionally(th2);
            }
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends n0 implements l<Throwable, r2> {
        final /* synthetic */ CompletableFuture<r2> $future;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CompletableFuture<r2> completableFuture) {
            super(1);
            this.$future = completableFuture;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th == null) {
                this.$future.complete(r2.f19517a);
            } else {
                this.$future.completeExceptionally(th);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", t0.b.f22420d, "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class c<T> extends n0 implements p<T, Throwable, Object> {
        final /* synthetic */ y<T> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y<T> yVar) {
            super(2);
            this.$result = yVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th) {
            return invoke2((c<T>) obj, th);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t5, Throwable th) {
            boolean c5;
            Throwable cause;
            try {
                if (th == null) {
                    c5 = this.$result.M(t5);
                } else {
                    y<T> yVar = this.$result;
                    CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                    if (completionException != null && (cause = completionException.getCause()) != null) {
                        th = cause;
                    }
                    c5 = yVar.c(th);
                }
                return Boolean.valueOf(c5);
            } catch (Throwable th2) {
                p0.b(i.INSTANCE, th2);
                return r2.f19517a;
            }
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class d extends n0 implements l<Throwable, r2> {
        final /* synthetic */ kotlinx.coroutines.future.b<T> $consumer;
        final /* synthetic */ CompletableFuture<T> $future;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CompletableFuture<T> completableFuture, kotlinx.coroutines.future.b<T> bVar) {
            super(1);
            this.$future = completableFuture;
            this.$consumer = bVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            this.$future.cancel(false);
            this.$consumer.cont = null;
        }
    }

    @p4.l
    public static final <T> CompletableFuture<T> c(@p4.l a1<? extends T> a1Var) {
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        j(a1Var, completableFuture);
        a1Var.t0(new a(completableFuture, a1Var));
        return completableFuture;
    }

    @p4.l
    public static final CompletableFuture<r2> d(@p4.l l2 l2Var) {
        CompletableFuture<r2> completableFuture = new CompletableFuture<>();
        j(l2Var, completableFuture);
        l2Var.t0(new b(completableFuture));
        return completableFuture;
    }

    @p4.l
    public static final <T> a1<T> e(@p4.l CompletionStage<T> completionStage) {
        ExecutionException executionException;
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return a0.a(completableFuture.get());
            } catch (Throwable th) {
                th = th;
                if (th instanceof ExecutionException) {
                    executionException = (ExecutionException) th;
                } else {
                    executionException = null;
                }
                if (executionException != null && (cause = executionException.getCause()) != null) {
                    th = cause;
                }
                y c5 = a0.c(null, 1, null);
                c5.c(th);
                return c5;
            }
        }
        y c6 = a0.c(null, 1, null);
        final c cVar = new c(c6);
        completionStage.handle(new BiFunction() { // from class: kotlinx.coroutines.future.c
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object f5;
                f5 = e.f(p.this, obj, (Throwable) obj2);
                return f5;
            }
        });
        p2.x(c6, completableFuture);
        return c6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(p pVar, Object obj, Throwable th) {
        return pVar.invoke(obj, th);
    }

    @m
    public static final <T> Object g(@p4.l CompletionStage<T> completionStage, @p4.l kotlin.coroutines.d<? super T> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e6) {
                Throwable cause = e6.getCause();
                if (cause == null) {
                    throw e6;
                }
                throw cause;
            }
        }
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        kotlinx.coroutines.future.b bVar = new kotlinx.coroutines.future.b(qVar);
        completionStage.handle(bVar);
        qVar.g(new d(completableFuture, bVar));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }

    @p4.l
    public static final <T> CompletableFuture<T> h(@p4.l s0 s0Var, @p4.l kotlin.coroutines.g gVar, @p4.l u0 u0Var, @p4.l p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar) {
        if (!u0Var.isLazy()) {
            kotlin.coroutines.g e5 = m0.e(s0Var, gVar);
            CompletableFuture<T> completableFuture = new CompletableFuture<>();
            kotlinx.coroutines.future.a aVar = new kotlinx.coroutines.future.a(e5, completableFuture);
            completableFuture.handle((BiFunction) aVar);
            aVar.w1(u0Var, aVar, pVar);
            return completableFuture;
        }
        throw new IllegalArgumentException((u0Var + " start is not supported").toString());
    }

    public static /* synthetic */ CompletableFuture i(s0 s0Var, kotlin.coroutines.g gVar, u0 u0Var, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = i.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            u0Var = u0.DEFAULT;
        }
        return h(s0Var, gVar, u0Var, pVar);
    }

    private static final void j(final l2 l2Var, CompletableFuture<?> completableFuture) {
        completableFuture.handle(new BiFunction() { // from class: kotlinx.coroutines.future.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                r2 k5;
                k5 = e.k(l2.this, obj, (Throwable) obj2);
                return k5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r2 k(l2 l2Var, Object obj, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = w1.a("CompletableFuture was completed exceptionally", th);
            }
        }
        l2Var.cancel(cancellationException);
        return r2.f19517a;
    }
}
