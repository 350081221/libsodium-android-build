package kotlinx.coroutines.channels;

import kotlin.b1;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/channels/c;", "E", "Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/channels/g0;", "Lkotlinx/coroutines/channels/l;", "getChannel", "()Lkotlinx/coroutines/channels/l;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@c3
/* loaded from: classes4.dex */
public interface c<E> extends s0, g0<E> {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        @p4.l
        public static <E> kotlinx.coroutines.selects.g<E> b(@p4.l c<E> cVar) {
            return g0.a.d(cVar);
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @p4.m
        public static <E> E c(@p4.l c<E> cVar) {
            return (E) g0.a.h(cVar);
        }

        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @p4.m
        public static <E> Object d(@p4.l c<E> cVar, @p4.l kotlin.coroutines.d<? super E> dVar) {
            return g0.a.i(cVar, dVar);
        }
    }

    @p4.l
    l<E> getChannel();
}
