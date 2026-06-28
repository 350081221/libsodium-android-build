package kotlinx.coroutines;

import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "exception", "Lkotlin/r2;", "handleException", "T", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface o0 extends g.b {

    @p4.l
    public static final b T = b.f20432a;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static <R> R a(@p4.l o0 o0Var, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(o0Var, r5, pVar);
        }

        @p4.m
        public static <E extends g.b> E b(@p4.l o0 o0Var, @p4.l g.c<E> cVar) {
            return (E) g.b.a.b(o0Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g c(@p4.l o0 o0Var, @p4.l g.c<?> cVar) {
            return g.b.a.c(o0Var, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g d(@p4.l o0 o0Var, @p4.l kotlin.coroutines.g gVar) {
            return g.b.a.d(o0Var, gVar);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/o0$b;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/o0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b implements g.c<o0> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f20432a = new b();

        private b() {
        }
    }

    void handleException(@p4.l kotlin.coroutines.g gVar, @p4.l Throwable th);
}
