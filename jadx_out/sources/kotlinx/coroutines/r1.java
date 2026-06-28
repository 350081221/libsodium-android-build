package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tJ\u0010\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010\u001e¨\u0006*"}, d2 = {"Lkotlinx/coroutines/r1;", "Lkotlinx/coroutines/n0;", "", "unconfined", "", "E0", "M0", "N0", "O0", "Lkotlinx/coroutines/h1;", "task", "Lkotlin/r2;", "F0", "H0", "C0", "", "parallelism", "limitedParallelism", "shutdown", bi.ay, "J", "useCount", "b", "Z", "shared", "Lkotlin/collections/k;", "c", "Lkotlin/collections/k;", "unconfinedQueue", "J0", "()Z", "isEmpty", "G0", "()J", "nextTime", "isActive", "K0", "isUnconfinedLoopActive", "L0", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: classes4.dex */
public abstract class r1 extends n0 {

    /* renamed from: a, reason: collision with root package name */
    private long f20459a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20460b;

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private kotlin.collections.k<h1<?>> f20461c;

    public static /* synthetic */ void D0(r1 r1Var, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        r1Var.C0(z4);
    }

    private final long E0(boolean z4) {
        return z4 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void I0(r1 r1Var, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        r1Var.H0(z4);
    }

    public final void C0(boolean z4) {
        long E0 = this.f20459a - E0(z4);
        this.f20459a = E0;
        if (E0 <= 0 && this.f20460b) {
            shutdown();
        }
    }

    public final void F0(@p4.l h1<?> h1Var) {
        kotlin.collections.k<h1<?>> kVar = this.f20461c;
        if (kVar == null) {
            kVar = new kotlin.collections.k<>();
            this.f20461c = kVar;
        }
        kVar.addLast(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long G0() {
        kotlin.collections.k<h1<?>> kVar = this.f20461c;
        if (kVar == null || kVar.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void H0(boolean z4) {
        this.f20459a += E0(z4);
        if (!z4) {
            this.f20460b = true;
        }
    }

    protected boolean J0() {
        return L0();
    }

    public final boolean K0() {
        return this.f20459a >= E0(true);
    }

    public final boolean L0() {
        kotlin.collections.k<h1<?>> kVar = this.f20461c;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    public long M0() {
        return !N0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean N0() {
        h1<?> q5;
        kotlin.collections.k<h1<?>> kVar = this.f20461c;
        if (kVar == null || (q5 = kVar.q()) == null) {
            return false;
        }
        q5.run();
        return true;
    }

    public boolean O0() {
        return false;
    }

    public final boolean isActive() {
        return this.f20459a > 0;
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public final n0 limitedParallelism(int i5) {
        kotlinx.coroutines.internal.u.a(i5);
        return this;
    }

    public void shutdown() {
    }
}
