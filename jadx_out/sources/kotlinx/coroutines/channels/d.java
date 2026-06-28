package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.b1;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.channels.h0;

@kotlin.k(level = kotlin.m.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0014\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\nH'¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/d;", "E", "Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/channels/g0;", "n", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/r2;", "cancel", "", "", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@c3
/* loaded from: classes4.dex */
public interface d<E> extends h0<E> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ void a(d dVar, CancellationException cancellationException, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                cancellationException = null;
            }
            dVar.cancel(cancellationException);
        }

        public static /* synthetic */ boolean b(d dVar, Throwable th, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i5 & 1) != 0) {
                th = null;
            }
            return dVar.a(th);
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@p4.l d<E> dVar, E e5) {
            return h0.a.c(dVar, e5);
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility only")
    /* synthetic */ boolean a(Throwable th);

    void cancel(@p4.m CancellationException cancellationException);

    @p4.l
    g0<E> n();
}
