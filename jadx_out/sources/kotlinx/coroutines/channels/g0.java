package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.s0;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦\u0002J\u001a\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH&J\b\u0010\u000f\u001a\u00020\u000eH\u0017J\u0014\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0010H'J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\bJ\u0015\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001c8&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0018\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/g0;", "E", "", "D", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", "x", "v", "()Ljava/lang/Object;", "Lkotlinx/coroutines/channels/n;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/r2;", "cancel", "", "", bi.ay, "poll", "w", "f", "()Z", "isClosedForReceive$annotations", "()V", "isClosedForReceive", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/g;", "r", "()Lkotlinx/coroutines/selects/g;", "onReceive", bi.aE, "onReceiveCatching", bi.aL, "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface g0<E> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {372}, m = "receiveOrNull", n = {}, s = {})
        @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.channels.g0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0568a<E> extends kotlin.coroutines.jvm.internal.d {
            int label;
            /* synthetic */ Object result;

            C0568a(kotlin.coroutines.d<? super C0568a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.i(null, this);
            }
        }

        public static /* synthetic */ void b(g0 g0Var, CancellationException cancellationException, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                cancellationException = null;
            }
            g0Var.cancel(cancellationException);
        }

        public static /* synthetic */ boolean c(g0 g0Var, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return g0Var.a(th);
        }

        @p4.l
        public static <E> kotlinx.coroutines.selects.g<E> d(@p4.l g0<? extends E> g0Var) {
            l0.n(g0Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((j) g0Var).t();
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @b1(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
        }

        @f1
        public static /* synthetic */ void f() {
        }

        @a2
        public static /* synthetic */ void g() {
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @p4.m
        public static <E> E h(@p4.l g0<? extends E> g0Var) {
            Object v4 = g0Var.v();
            if (p.m(v4)) {
                return (E) p.i(v4);
            }
            Throwable f5 = p.f(v4);
            if (f5 == null) {
                return null;
            }
            throw s0.o(f5);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static <E> java.lang.Object i(@p4.l kotlinx.coroutines.channels.g0<? extends E> r4, @p4.l kotlin.coroutines.d<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.g0.a.C0568a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.g0$a$a r0 = (kotlinx.coroutines.channels.g0.a.C0568a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.g0$a$a r0 = new kotlinx.coroutines.channels.g0$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlin.e1.n(r5)
                kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                java.lang.Object r4 = r5.o()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.e1.n(r5)
                r0.label = r3
                java.lang.Object r4 = r4.x(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = kotlinx.coroutines.channels.p.h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.g0.a.i(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
        }
    }

    @p4.m
    Object D(@p4.l kotlin.coroutines.d<? super E> dVar);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th);

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@p4.m CancellationException cancellationException);

    boolean f();

    boolean isEmpty();

    @p4.l
    n<E> iterator();

    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
    @p4.m
    E poll();

    @p4.l
    kotlinx.coroutines.selects.g<E> r();

    @p4.l
    kotlinx.coroutines.selects.g<p<E>> s();

    @p4.l
    kotlinx.coroutines.selects.g<E> t();

    @p4.l
    Object v();

    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    @p4.m
    Object w(@p4.l kotlin.coroutines.d<? super E> dVar);

    @p4.m
    Object x(@p4.l kotlin.coroutines.d<? super p<? extends E>> dVar);
}
