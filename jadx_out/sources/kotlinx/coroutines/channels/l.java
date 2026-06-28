package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.b1;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.internal.w0;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/l;", "E", "Lkotlinx/coroutines/channels/h0;", "Lkotlinx/coroutines/channels/g0;", "V", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface l<E> extends h0<E>, g0<E> {

    @p4.l
    public static final b V = b.f19930a;
    public static final int W = Integer.MAX_VALUE;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f19925a0 = 0;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f19926b0 = -1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f19927c0 = -2;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f19928d0 = -3;

    /* renamed from: e0, reason: collision with root package name */
    @p4.l
    public static final String f19929e0 = "kotlinx.coroutines.channels.defaultBuffer";

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        @p4.l
        public static <E> kotlinx.coroutines.selects.g<E> b(@p4.l l<E> lVar) {
            return g0.a.d(lVar);
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@p4.l l<E> lVar, E e5) {
            return h0.a.c(lVar, e5);
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @p4.m
        public static <E> E d(@p4.l l<E> lVar) {
            return (E) g0.a.h(lVar);
        }

        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @p4.m
        public static <E> Object e(@p4.l l<E> lVar, @p4.l kotlin.coroutines.d<? super E> dVar) {
            return g0.a.i(lVar, dVar);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/l$b;", "", "", "b", "I", "UNLIMITED", "c", "RENDEZVOUS", "d", "CONFLATED", "e", "BUFFERED", "f", "OPTIONAL_CHANNEL", "", socket.g.f22386a, "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", bi.aJ, bi.ay, "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f19931b = Integer.MAX_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public static final int f19932c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f19933d = -1;

        /* renamed from: e, reason: collision with root package name */
        public static final int f19934e = -2;

        /* renamed from: f, reason: collision with root package name */
        public static final int f19935f = -3;

        /* renamed from: g, reason: collision with root package name */
        @p4.l
        public static final String f19936g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f19930a = new b();

        /* renamed from: h, reason: collision with root package name */
        private static final int f19937h = w0.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        public final int a() {
            return f19937h;
        }
    }
}
