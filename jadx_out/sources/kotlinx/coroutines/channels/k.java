package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.r2;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.internal.y0;

@kotlin.i0(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b?\u001a,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000\u001a*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002\u001aN\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u00002%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0010\u0010\u0000\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0002\"\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!\"\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&\"\u0014\u0010-\u001a\u00020*8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00101\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,\"\u0014\u00105\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,\"\u0014\u00107\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,\"\u0014\u00109\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010,\"\u0014\u0010;\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010,\"\u001a\u0010?\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010>\"\u0014\u0010A\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010,\"\u0014\u0010C\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010,\"\u0014\u0010E\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010,\"\u0014\u0010G\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010!\"\u0014\u0010I\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010!\"\u0014\u0010K\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010!\"\u0014\u0010M\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010!\"\u0014\u0010N\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010!\"\u0014\u0010O\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010!\"\u0014\u0010P\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,\"\u0014\u0010Q\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,\"\u0014\u0010R\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010,\"\u0014\u0010T\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010,\"\u0014\u0010V\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010!\"\u0014\u0010X\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010!\"\u0014\u0010Z\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010!\"\u0014\u0010[\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0000\u0010!\"\u0014\u0010\\\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010!\"\u0014\u0010^\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010&\"\u0014\u0010`\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010&\"\u0014\u0010a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010&\"\u0019\u0010c\u001a\u00020\u0002*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010b\"\u0019\u0010e\u001a\u00020\u0015*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010d\"\u0019\u0010f\u001a\u00020\u0002*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010b\"\u0019\u0010h\u001a\u00020\u0012*\u00020\u00028Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010g¨\u0006i"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/r;", "y", "id", "prev", "x", "T", "Lkotlinx/coroutines/p;", t0.b.f22420d, "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "onCancellation", "", "F", "(Lkotlinx/coroutines/p;Ljava/lang/Object;Lv3/l;)Z", "", "capacity", "counter", "closeStatus", "w", "pauseEB", "v", "", bi.ay, "Lkotlinx/coroutines/channels/r;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "d", "J", "BUFFER_END_RENDEZVOUS", "e", "BUFFER_END_UNLIMITED", "Lkotlinx/coroutines/internal/t0;", "f", "Lkotlinx/coroutines/internal/t0;", "BUFFERED", socket.g.f22386a, "IN_BUFFER", bi.aJ, "RESUMING_BY_RCV", "i", "RESUMING_BY_EB", "j", "POISONED", "k", "DONE_RCV", "l", "INTERRUPTED_SEND", "m", "INTERRUPTED_RCV", "n", bi.aG, "()Lkotlinx/coroutines/internal/t0;", "CHANNEL_CLOSED", "o", "SUSPEND", bi.aA, "SUSPEND_NO_WAITER", "q", "FAILED", "r", "RESULT_RENDEZVOUS", bi.aE, "RESULT_BUFFERED", bi.aL, "RESULT_SUSPEND", bi.aK, "RESULT_SUSPEND_NO_WAITER", "RESULT_CLOSED", "RESULT_FAILED", "NO_RECEIVE_RESULT", "CLOSE_HANDLER_CLOSED", "CLOSE_HANDLER_INVOKED", "A", "NO_CLOSE_CAUSE", "B", "CLOSE_STATUS_ACTIVE", "C", "CLOSE_STATUS_CANCELLATION_STARTED", "D", "CLOSE_STATUS_CLOSED", "CLOSE_STATUS_CANCELLED", "SENDERS_CLOSE_STATUS_SHIFT", "G", "SENDERS_COUNTER_MASK", "H", "EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT", "EB_COMPLETED_COUNTER_MASK", "(J)J", "sendersCounter", "(J)I", "sendersCloseStatus", "ebCompletedCounter", "(J)Z", "ebPauseExpandBuffers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class k {

    @p4.l
    private static final t0 A;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 60;
    private static final long G = 1152921504606846975L;
    private static final long H = 4611686018427387904L;
    private static final long I = 4611686018427387903L;

    /* renamed from: a */
    @p4.l
    private static final r<Object> f19898a = new r<>(-1, null, null, 0);

    /* renamed from: b */
    @u3.e
    public static final int f19899b;

    /* renamed from: c */
    private static final int f19900c;

    /* renamed from: d */
    private static final long f19901d = 0;

    /* renamed from: e */
    private static final long f19902e = Long.MAX_VALUE;

    /* renamed from: f */
    @p4.l
    @u3.e
    public static final t0 f19903f;

    /* renamed from: g */
    @p4.l
    private static final t0 f19904g;

    /* renamed from: h */
    @p4.l
    private static final t0 f19905h;

    /* renamed from: i */
    @p4.l
    private static final t0 f19906i;

    /* renamed from: j */
    @p4.l
    private static final t0 f19907j;

    /* renamed from: k */
    @p4.l
    private static final t0 f19908k;

    /* renamed from: l */
    @p4.l
    private static final t0 f19909l;

    /* renamed from: m */
    @p4.l
    private static final t0 f19910m;

    /* renamed from: n */
    @p4.l
    private static final t0 f19911n;

    /* renamed from: o */
    @p4.l
    private static final t0 f19912o;

    /* renamed from: p */
    @p4.l
    private static final t0 f19913p;

    /* renamed from: q */
    @p4.l
    private static final t0 f19914q;

    /* renamed from: r */
    private static final int f19915r = 0;

    /* renamed from: s */
    private static final int f19916s = 1;

    /* renamed from: t */
    private static final int f19917t = 2;

    /* renamed from: u */
    private static final int f19918u = 3;

    /* renamed from: v */
    private static final int f19919v = 4;

    /* renamed from: w */
    private static final int f19920w = 5;

    /* renamed from: x */
    @p4.l
    private static final t0 f19921x;

    /* renamed from: y */
    @p4.l
    private static final t0 f19922y;

    /* renamed from: z */
    @p4.l
    private static final t0 f19923z;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a<E> extends kotlin.jvm.internal.h0 implements v3.p<Long, r<E>, r<E>> {
        public static final a INSTANCE = new a();

        a() {
            super(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Long l5, Object obj) {
            return invoke(l5.longValue(), (r) obj);
        }

        @p4.l
        public final r<E> invoke(long j5, @p4.l r<E> rVar) {
            return k.x(j5, rVar);
        }
    }

    static {
        int e5;
        int e6;
        e5 = y0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f19899b = e5;
        e6 = y0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f19900c = e6;
        f19903f = new t0("BUFFERED");
        f19904g = new t0("SHOULD_BUFFER");
        f19905h = new t0("S_RESUMING_BY_RCV");
        f19906i = new t0("RESUMING_BY_EB");
        f19907j = new t0("POISONED");
        f19908k = new t0("DONE_RCV");
        f19909l = new t0("INTERRUPTED_SEND");
        f19910m = new t0("INTERRUPTED_RCV");
        f19911n = new t0("CHANNEL_CLOSED");
        f19912o = new t0("SUSPEND");
        f19913p = new t0("SUSPEND_NO_WAITER");
        f19914q = new t0("FAILED");
        f19921x = new t0("NO_RECEIVE_RESULT");
        f19922y = new t0("CLOSE_HANDLER_CLOSED");
        f19923z = new t0("CLOSE_HANDLER_INVOKED");
        A = new t0("NO_CLOSE_CAUSE");
    }

    private static final long A(long j5) {
        return j5 & 4611686018427387903L;
    }

    private static final boolean B(long j5) {
        return (j5 & H) != 0;
    }

    private static final int C(long j5) {
        return (int) (j5 >> 60);
    }

    private static final long D(long j5) {
        return j5 & G;
    }

    public static final long E(int i5) {
        if (i5 == 0) {
            return 0L;
        }
        if (i5 != Integer.MAX_VALUE) {
            return i5;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean F(kotlinx.coroutines.p<? super T> pVar, T t5, v3.l<? super Throwable, r2> lVar) {
        Object u4 = pVar.u(t5, null, lVar);
        if (u4 != null) {
            pVar.K(u4);
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean G(kotlinx.coroutines.p pVar, Object obj, v3.l lVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        return F(pVar, obj, lVar);
    }

    public static final /* synthetic */ long a(long j5, boolean z4) {
        return v(j5, z4);
    }

    public static final /* synthetic */ long b(long j5, int i5) {
        return w(j5, i5);
    }

    public static final /* synthetic */ t0 d() {
        return f19922y;
    }

    public static final /* synthetic */ t0 e() {
        return f19923z;
    }

    public static final /* synthetic */ t0 f() {
        return f19908k;
    }

    public static final /* synthetic */ int g() {
        return f19900c;
    }

    public static final /* synthetic */ t0 h() {
        return f19914q;
    }

    public static final /* synthetic */ t0 i() {
        return f19910m;
    }

    public static final /* synthetic */ t0 j() {
        return f19909l;
    }

    public static final /* synthetic */ t0 k() {
        return f19904g;
    }

    public static final /* synthetic */ t0 l() {
        return A;
    }

    public static final /* synthetic */ t0 m() {
        return f19921x;
    }

    public static final /* synthetic */ r n() {
        return f19898a;
    }

    public static final /* synthetic */ t0 o() {
        return f19907j;
    }

    public static final /* synthetic */ t0 p() {
        return f19906i;
    }

    public static final /* synthetic */ t0 q() {
        return f19905h;
    }

    public static final /* synthetic */ t0 r() {
        return f19912o;
    }

    public static final /* synthetic */ t0 s() {
        return f19913p;
    }

    public static final /* synthetic */ long t(int i5) {
        return E(i5);
    }

    public static final /* synthetic */ boolean u(kotlinx.coroutines.p pVar, Object obj, v3.l lVar) {
        return F(pVar, obj, lVar);
    }

    public static final long v(long j5, boolean z4) {
        return (z4 ? H : 0L) + j5;
    }

    public static final long w(long j5, int i5) {
        return (i5 << 60) + j5;
    }

    public static final <E> r<E> x(long j5, r<E> rVar) {
        return new r<>(j5, rVar, rVar.w(), 0);
    }

    @p4.l
    public static final <E> kotlin.reflect.i<r<E>> y() {
        return a.INSTANCE;
    }

    @p4.l
    public static final t0 z() {
        return f19911n;
    }
}
