package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.t0;

@i0(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\b2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\"c\u0010\u001c\u001aQ\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e\"\u0014\u0010$\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001e\"\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'\"\u0014\u0010,\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'\"\u0014\u0010.\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010'\"\u001a\u00102\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u00101*Â\u0001\b\u0007\u00107\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u000303¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(4\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(5\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u00142[\u0012\u0017\u0012\u0015\u0012\u0002\b\u000303¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(4\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(5\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u0014B\u0002\b6*¦\u0001\b\u0007\u00108\"M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014B\u0002\b6*¦\u0001\b\u0007\u00109\"M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0017\u0012\u0015\u0012\u0002\b\u000303¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(4\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00030\u00142M\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0017\u0012\u0015\u0012\u0002\b\u000303¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(4\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00030\u0014B\u0002\b6\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "m", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "", "Lkotlin/v0;", "name", "cause", "onCancellation", "", "o", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/r;", "d", "Lkotlin/Function3;", "", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", bi.ay, "Lv3/q;", "DUMMY_PROCESS_RESULT_FUNCTION", "b", "I", "TRY_SELECT_SUCCESSFUL", "c", "TRY_SELECT_REREGISTER", "TRY_SELECT_CANCELLED", "e", "TRY_SELECT_ALREADY_SELECTED", "Lkotlinx/coroutines/internal/t0;", "f", "Lkotlinx/coroutines/internal/t0;", "STATE_REG", socket.g.f22386a, "STATE_COMPLETED", bi.aJ, "STATE_CANCELLED", "i", "NO_RESULT", "j", "l", "()Lkotlinx/coroutines/internal/t0;", "PARAM_CLAUSE_0", "Lkotlinx/coroutines/selects/m;", "select", "internalResult", "Lkotlinx/coroutines/g2;", "OnCancellationConstructor", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    private static final int f20591b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f20592c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20593d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f20594e = 3;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final v3.q<Object, Object, Object, Object> f20590a = a.INSTANCE;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final t0 f20595f = new t0("STATE_REG");

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final t0 f20596g = new t0("STATE_COMPLETED");

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final t0 f20597h = new t0("STATE_CANCELLED");

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final t0 f20598i = new t0("NO_RESULT");

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private static final t0 f20599j = new t0("PARAM_CLAUSE_0");

    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class a extends n0 implements v3.q {
        public static final a INSTANCE = new a();

        a() {
            super(3);
        }

        @Override // v3.q
        @p4.m
        public final Void invoke(@p4.l Object obj, @p4.m Object obj2, @p4.m Object obj3) {
            return null;
        }
    }

    @g2
    public static /* synthetic */ void a() {
    }

    @g2
    public static /* synthetic */ void b() {
    }

    @g2
    public static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r d(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        return r.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i5).toString());
                }
                return r.CANCELLED;
            }
            return r.REREGISTER;
        }
        return r.SUCCESSFUL;
    }

    @p4.l
    public static final t0 l() {
        return f20599j;
    }

    @p4.m
    public static final <R> Object m(@p4.l v3.l<? super c<? super R>, r2> lVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        l lVar2 = new l(dVar.getContext());
        lVar.invoke(lVar2);
        return lVar2.w(dVar);
    }

    private static final <R> Object n(v3.l<? super c<? super R>, r2> lVar, kotlin.coroutines.d<? super R> dVar) {
        kotlin.jvm.internal.i0.e(3);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(kotlinx.coroutines.p<? super r2> pVar, v3.l<? super Throwable, r2> lVar) {
        Object u4 = pVar.u(r2.f19517a, null, lVar);
        if (u4 == null) {
            return false;
        }
        pVar.K(u4);
        return true;
    }
}
