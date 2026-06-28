package kotlinx.coroutines.scheduling;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.concurrent.Executor;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.x1;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0014\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J+\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\tH\u0016J\u000f\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lkotlinx/coroutines/scheduling/i;", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/scheduling/a;", "D0", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "dispatch", "dispatchYield", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "E0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", ILivePush.ClickType.CLOSE, "H0", "()V", "", m0.a.Z, "G0", "(J)V", "F0", "", "b", "I", "corePoolSize", "c", "maxPoolSize", "d", "J", "idleWorkerKeepAliveNs", "", "e", "Ljava/lang/String;", "schedulerName", "f", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "C0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class i extends x1 {

    /* renamed from: b, reason: collision with root package name */
    private final int f20526b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20527c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20528d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final String f20529e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private a f20530f;

    public i() {
        this(0, 0, 0L, null, 15, null);
    }

    public /* synthetic */ i(int i5, int i6, long j5, String str, int i7, w wVar) {
        this((i7 & 1) != 0 ? o.f20537c : i5, (i7 & 2) != 0 ? o.f20538d : i6, (i7 & 4) != 0 ? o.f20539e : j5, (i7 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final a D0() {
        return new a(this.f20526b, this.f20527c, this.f20528d, this.f20529e);
    }

    @Override // kotlinx.coroutines.x1
    @p4.l
    public Executor C0() {
        return this.f20530f;
    }

    public final void E0(@p4.l Runnable runnable, @p4.l l lVar, boolean z4) {
        this.f20530f.y(runnable, lVar, z4);
    }

    public final void F0() {
        H0();
    }

    public final synchronized void G0(long j5) {
        this.f20530f.r0(j5);
    }

    public final synchronized void H0() {
        this.f20530f.r0(1000L);
        this.f20530f = D0();
    }

    @Override // kotlinx.coroutines.x1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20530f.close();
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        a.A(this.f20530f, runnable, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.n0
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        a.A(this.f20530f, runnable, null, true, 2, null);
    }

    public i(int i5, int i6, long j5, @p4.l String str) {
        this.f20526b = i5;
        this.f20527c = i6;
        this.f20528d = j5;
        this.f20529e = str;
        this.f20530f = D0();
    }
}
