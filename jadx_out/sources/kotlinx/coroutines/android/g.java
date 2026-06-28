package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002\u001a\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002\"\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/e;", "i", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/e;", "Landroid/os/Looper;", "", "async", "e", "", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", socket.g.f22386a, "Lkotlinx/coroutines/p;", "cont", "Lkotlin/r2;", "n", "Landroid/view/Choreographer;", "choreographer", "l", bi.ay, "J", "MAX_DELAY", "b", "Lkotlinx/coroutines/android/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n314#2,11:218\n314#2,9:229\n323#2,2:239\n17#3:238\n1#4:241\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n189#1:218,11\n197#1:229,9\n197#1:239,2\n201#1:238\n*E\n"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f19858a = 4611686018427387903L;

    /* renamed from: b, reason: collision with root package name */
    @m
    @u3.e
    public static final e f19859b;

    @m
    private static volatile Choreographer choreographer;

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/r2;", "run", "()V", "kotlinx/coroutines/h3$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,18:1\n202#2,2:19\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f19860a;

        public a(p pVar) {
            this.f19860a = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.n(this.f19860a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object m6444constructorimpl;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            d1.a aVar = d1.Companion;
            m6444constructorimpl = d1.m6444constructorimpl(new d(e(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
        }
        f19859b = (e) (d1.m6450isFailureimpl(m6444constructorimpl) ? null : m6444constructorimpl);
    }

    @l
    @VisibleForTesting
    public static final Handler e(@l Looper looper, boolean z4) {
        if (z4) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                l0.n(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @m
    public static final Object f(@l kotlin.coroutines.d<? super Long> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            e5 = kotlin.coroutines.intrinsics.c.e(dVar);
            q qVar = new q(e5, 1);
            qVar.B();
            l(choreographer2, qVar);
            Object E = qVar.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                h.c(dVar);
            }
            return E;
        }
        return g(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object g(kotlin.coroutines.d<? super Long> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n(qVar);
        } else {
            k1.e().dispatch(qVar.getContext(), new a(qVar));
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }

    @l
    @u3.h(name = TypedValues.TransitionType.S_FROM)
    @i
    public static final e h(@l Handler handler) {
        return j(handler, null, 1, null);
    }

    @l
    @u3.h(name = TypedValues.TransitionType.S_FROM)
    @i
    public static final e i(@l Handler handler, @m String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e j(Handler handler, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        return i(handler, str);
    }

    @k(level = kotlin.m.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Choreographer choreographer2, final p<? super Long> pVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                g.m(p.this, j5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(p pVar, long j5) {
        pVar.z(k1.e(), Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(p<? super Long> pVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            l0.m(choreographer2);
            choreographer = choreographer2;
        }
        l(choreographer2, pVar);
    }
}
