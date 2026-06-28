package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/o0;", "", "Lkotlinx/coroutines/flow/t0;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/m0;", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface o0 {

    /* renamed from: a */
    @p4.l
    public static final a f20189a = a.f20190a;

    @kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/flow/o0$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/o0;", bi.ay, "b", "Lkotlinx/coroutines/flow/o0;", "c", "()Lkotlinx/coroutines/flow/o0;", "Eagerly", "d", "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f20190a = new a();

        /* renamed from: b */
        @p4.l
        private static final o0 f20191b = new q0();

        /* renamed from: c */
        @p4.l
        private static final o0 f20192c = new r0();

        private a() {
        }

        public static /* synthetic */ o0 b(a aVar, long j5, long j6, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                j5 = 0;
            }
            if ((i5 & 2) != 0) {
                j6 = Long.MAX_VALUE;
            }
            return aVar.a(j5, j6);
        }

        @p4.l
        public final o0 a(long j5, long j6) {
            return new s0(j5, j6);
        }

        @p4.l
        public final o0 c() {
            return f20191b;
        }

        @p4.l
        public final o0 d() {
            return f20192c;
        }
    }

    @p4.l
    i<m0> a(@p4.l t0<Integer> t0Var);
}
