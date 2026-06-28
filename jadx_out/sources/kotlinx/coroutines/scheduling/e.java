package kotlinx.coroutines.scheduling;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.x1;
import kotlinx.coroutines.y0;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b,\u0010.B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b,\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ+\u0010\u0017\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lkotlinx/coroutines/scheduling/e;", "Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/scheduling/a;", "F0", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "dispatch", "dispatchYield", ILivePush.ClickType.CLOSE, "", "toString", "", "parallelism", "Lkotlinx/coroutines/n0;", "D0", "H0", "Lkotlinx/coroutines/scheduling/l;", "", "tailDispatch", "G0", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/l;Z)V", "b", "I", "corePoolSize", "c", "maxPoolSize", "", "d", "J", "idleWorkerKeepAliveNs", "e", "Ljava/lang/String;", "schedulerName", "f", "Lkotlinx/coroutines/scheduling/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "C0", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@a1
@r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
/* loaded from: classes4.dex */
public class e extends x1 {

    /* renamed from: b, reason: collision with root package name */
    private final int f20514b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20515c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20516d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final String f20517e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private a f20518f;

    public /* synthetic */ e(int i5, int i6, long j5, String str, int i7, w wVar) {
        this(i5, i6, j5, (i7 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public static /* synthetic */ n0 E0(e eVar, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if ((i6 & 1) != 0) {
            i5 = 16;
        }
        return eVar.D0(i5);
    }

    private final a F0() {
        return new a(this.f20514b, this.f20515c, this.f20516d, this.f20517e);
    }

    @Override // kotlinx.coroutines.x1
    @p4.l
    public Executor C0() {
        return this.f20518f;
    }

    @p4.l
    public final n0 D0(int i5) {
        boolean z4;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new g(this, i5, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i5).toString());
    }

    public final void G0(@p4.l Runnable runnable, @p4.l l lVar, boolean z4) {
        try {
            this.f20518f.y(runnable, lVar, z4);
        } catch (RejectedExecutionException unused) {
            y0.f20685g.V0(this.f20518f.j(runnable, lVar));
        }
    }

    @p4.l
    public final n0 H0(int i5) {
        boolean z4;
        boolean z5 = true;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 > this.f20514b) {
                z5 = false;
            }
            if (z5) {
                return new g(this, i5, null, 0);
            }
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f20514b + "), but have " + i5).toString());
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i5).toString());
    }

    @Override // kotlinx.coroutines.x1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20518f.close();
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        try {
            a.A(this.f20518f, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            y0.f20685g.dispatch(gVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.n0
    public void dispatchYield(@p4.l kotlin.coroutines.g gVar, @p4.l Runnable runnable) {
        try {
            a.A(this.f20518f, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            y0.f20685g.dispatchYield(gVar, runnable);
        }
    }

    @Override // kotlinx.coroutines.n0
    @p4.l
    public String toString() {
        return super.toString() + "[scheduler = " + this.f20518f + ']';
    }

    public e(int i5, int i6, long j5, @p4.l String str) {
        this.f20514b = i5;
        this.f20515c = i6;
        this.f20516d = j5;
        this.f20517e = str;
        this.f20518f = F0();
    }

    public /* synthetic */ e(int i5, int i6, String str, int i7, w wVar) {
        this((i7 & 1) != 0 ? o.f20537c : i5, (i7 & 2) != 0 ? o.f20538d : i6, (i7 & 4) != 0 ? o.f20535a : str);
    }

    public e(int i5, int i6, @p4.l String str) {
        this(i5, i6, o.f20539e, str);
    }

    public /* synthetic */ e(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? o.f20537c : i5, (i7 & 2) != 0 ? o.f20538d : i6);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ e(int i5, int i6) {
        this(i5, i6, o.f20539e, null, 8, null);
    }
}
