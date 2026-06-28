package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\tH'J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H'J\b\u0010\u0015\u001a\u00020\rH'J\u0014\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH&J1\u0010\u001a\u001a\u00020\r2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u0018H&J\u001b\u0010\u001c\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\tH'J<\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bH'¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lkotlinx/coroutines/p;", "T", "Lkotlin/coroutines/d;", t0.b.f22420d, "", "idempotent", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "onCancellation", bi.aK, "(Ljava/lang/Object;Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;", "exception", "i", "token", "K", "B", "", bi.ay, "Lkotlinx/coroutines/CompletionHandler;", "handler", socket.g.f22386a, "Lkotlinx/coroutines/n0;", bi.aG, "(Lkotlinx/coroutines/n0;Ljava/lang/Object;)V", "k", "C", "(Ljava/lang/Object;Lv3/l;)V", "isActive", "()Z", "d", "isCompleted", "isCancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface p<T> extends kotlin.coroutines.d<T> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ boolean a(p pVar, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return pVar.a(th);
        }

        public static /* synthetic */ Object b(p pVar, Object obj, Object obj2, int i5, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i5 & 2) != 0) {
                obj2 = null;
            }
            return pVar.e(obj, obj2);
        }
    }

    @g2
    void B();

    @a2
    void C(T t5, @p4.m v3.l<? super Throwable, kotlin.r2> lVar);

    @g2
    void K(@p4.l Object obj);

    boolean a(@p4.m Throwable th);

    boolean d();

    @g2
    @p4.m
    Object e(T t5, @p4.m Object obj);

    void g(@p4.l v3.l<? super Throwable, kotlin.r2> lVar);

    @g2
    @p4.m
    Object i(@p4.l Throwable th);

    boolean isActive();

    boolean isCancelled();

    @a2
    void k(@p4.l n0 n0Var, @p4.l Throwable th);

    @g2
    @p4.m
    Object u(T t5, @p4.m Object obj, @p4.m v3.l<? super Throwable, kotlin.r2> lVar);

    @a2
    void z(@p4.l n0 n0Var, T t5);
}
