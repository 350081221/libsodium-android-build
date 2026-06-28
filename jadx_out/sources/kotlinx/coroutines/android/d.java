package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lkotlinx/coroutines/android/d;", "Lkotlinx/coroutines/android/e;", "Lkotlinx/coroutines/c1;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/r2;", "H0", "", "isDispatchNeeded", "dispatch", "", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", bi.aA, "Lkotlinx/coroutines/n1;", "I", "", "toString", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "Landroid/os/Handler;", bi.ay, "Landroid/os/Handler;", "handler", "b", "Ljava/lang/String;", "name", "c", "Z", "invokeImmediately", "_immediate", "Lkotlinx/coroutines/android/d;", "d", "I0", "()Lkotlinx/coroutines/android/d;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,217:1\n1#2:218\n17#3:219\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n147#1:219\n*E\n"})
/* loaded from: classes4.dex */
public final class d extends e implements c1 {

    @m
    private volatile d _immediate;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final Handler f19851a;

    /* renamed from: b, reason: collision with root package name */
    @m
    private final String f19852b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f19853c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final d f19854d;

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/r2;", "run", "()V", "kotlinx/coroutines/h3$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,18:1\n148#2:19\n149#2:21\n1#3:20\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f19855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f19856b;

        public a(p pVar, d dVar) {
            this.f19855a = pVar;
            this.f19856b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19855a.z(this.f19856b, r2.f19517a);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class b extends n0 implements v3.l<Throwable, r2> {
        final /* synthetic */ Runnable $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.$block = runnable;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
            invoke2(th);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            d.this.f19851a.removeCallbacks(this.$block);
        }
    }

    private d(Handler handler, String str, boolean z4) {
        super(null);
        this.f19851a = handler;
        this.f19852b = str;
        this.f19853c = z4;
        this._immediate = z4 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f19854d = dVar;
    }

    private final void H0(kotlin.coroutines.g gVar, Runnable runnable) {
        p2.f(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        k1.c().dispatch(gVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(d dVar, Runnable runnable) {
        dVar.f19851a.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.android.e, kotlinx.coroutines.c1
    @l
    public n1 I(long j5, @l final Runnable runnable, @l kotlin.coroutines.g gVar) {
        long C;
        Handler handler = this.f19851a;
        C = u.C(j5, kotlin.time.g.f19821c);
        if (handler.postDelayed(runnable, C)) {
            return new n1() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.n1
                public final void dispose() {
                    d.J0(d.this, runnable);
                }
            };
        }
        H0(gVar, runnable);
        return a3.f19846a;
    }

    @Override // kotlinx.coroutines.android.e
    @l
    /* renamed from: I0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d E0() {
        return this.f19854d;
    }

    @Override // kotlinx.coroutines.n0
    public void dispatch(@l kotlin.coroutines.g gVar, @l Runnable runnable) {
        if (!this.f19851a.post(runnable)) {
            H0(gVar, runnable);
        }
    }

    public boolean equals(@m Object obj) {
        return (obj instanceof d) && ((d) obj).f19851a == this.f19851a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f19851a);
    }

    @Override // kotlinx.coroutines.n0
    public boolean isDispatchNeeded(@l kotlin.coroutines.g gVar) {
        return (this.f19853c && l0.g(Looper.myLooper(), this.f19851a.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.c1
    public void p(long j5, @l p<? super r2> pVar) {
        long C;
        a aVar = new a(pVar, this);
        Handler handler = this.f19851a;
        C = u.C(j5, kotlin.time.g.f19821c);
        if (handler.postDelayed(aVar, C)) {
            pVar.g(new b(aVar));
        } else {
            H0(pVar.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.x2, kotlinx.coroutines.n0
    @l
    public String toString() {
        String D0 = D0();
        if (D0 == null) {
            String str = this.f19852b;
            if (str == null) {
                str = this.f19851a.toString();
            }
            if (this.f19853c) {
                return str + ".immediate";
            }
            return str;
        }
        return D0;
    }

    public /* synthetic */ d(Handler handler, String str, int i5, w wVar) {
        this(handler, (i5 & 2) != 0 ? null : str);
    }

    public d(@l Handler handler, @m String str) {
        this(handler, str, false);
    }
}
