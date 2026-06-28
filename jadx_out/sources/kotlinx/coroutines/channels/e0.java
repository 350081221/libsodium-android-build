package kotlinx.coroutines.channels;

import kotlin.b1;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "E", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/channels/h0;", "getChannel", "()Lkotlinx/coroutines/channels/h0;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface e0<E> extends s0, h0<E> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@p4.l e0<? super E> e0Var, E e5) {
            return h0.a.c(e0Var, e5);
        }
    }

    @p4.l
    h0<E> getChannel();
}
