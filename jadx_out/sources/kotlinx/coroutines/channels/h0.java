package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.b1;
import kotlin.r2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.s0;

@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0001\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J-\u0010\u0011\u001a\u00020\u00042#\u0010\u0010\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\rH&J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/channels/h0;", "E", "", "element", "Lkotlin/r2;", "F", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/p;", bi.aA, "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "handler", "I", "offer", "(Ljava/lang/Object;)Z", "G", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "Lkotlinx/coroutines/selects/i;", "l", "()Lkotlinx/coroutines/selects/i;", "onSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface h0<E> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ boolean a(h0 h0Var, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return h0Var.E(th);
        }

        @f1
        public static /* synthetic */ void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@p4.l h0<? super E> h0Var, E e5) {
            Object p5 = h0Var.p(e5);
            if (p.m(p5)) {
                return true;
            }
            Throwable f5 = p.f(p5);
            if (f5 == null) {
                return false;
            }
            throw s0.o(f5);
        }
    }

    boolean E(@p4.m Throwable th);

    @p4.m
    Object F(E e5, @p4.l kotlin.coroutines.d<? super r2> dVar);

    boolean G();

    void I(@p4.l v3.l<? super Throwable, r2> lVar);

    @p4.l
    kotlinx.coroutines.selects.i<E, h0<E>> l();

    @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e5);

    @p4.l
    Object p(E e5);
}
