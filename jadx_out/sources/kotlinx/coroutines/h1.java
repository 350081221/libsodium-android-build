package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlin.d1;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lkotlinx/coroutines/h1;", "T", "Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/SchedulerTask;", "", "n", "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/r2;", "f", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "j", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "m", "", "c", "I", "resumeMode", "Lkotlin/coroutines/d;", bi.aJ, "()Lkotlin/coroutines/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,220:1\n1#2:221\n107#3,10:222\n118#3,2:236\n218#4:232\n219#4:235\n61#5,2:233\n75#6:238\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n88#1:222,10\n88#1:236,2\n101#1:232\n101#1:235\n101#1:233,2\n140#1:238\n*E\n"})
/* loaded from: classes4.dex */
public abstract class h1<T> extends kotlinx.coroutines.scheduling.k {

    /* renamed from: c, reason: collision with root package name */
    @u3.e
    public int f20294c;

    public h1(int i5) {
        this.f20294c = i5;
    }

    public void f(@p4.m Object obj, @p4.l Throwable th) {
    }

    @p4.l
    public abstract kotlin.coroutines.d<T> h();

    @p4.m
    public Throwable j(@p4.m Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.f19951a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T l(@p4.m Object obj) {
        return obj;
    }

    public final void m(@p4.m Throwable th, @p4.m Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.p.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.l0.m(th);
        p0.b(h().getContext(), new v0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @p4.m
    public abstract Object n();

    @Override // java.lang.Runnable
    public final void run() {
        Object m6444constructorimpl;
        x3<?> x3Var;
        l2 l2Var;
        Object m6444constructorimpl2;
        kotlinx.coroutines.scheduling.l lVar = this.f20532b;
        try {
            kotlin.coroutines.d<T> h5 = h();
            kotlin.jvm.internal.l0.n(h5, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.internal.l lVar2 = (kotlinx.coroutines.internal.l) h5;
            kotlin.coroutines.d<T> dVar = lVar2.f20370e;
            Object obj = lVar2.f20372g;
            kotlin.coroutines.g context = dVar.getContext();
            Object c5 = kotlinx.coroutines.internal.z0.c(context, obj);
            if (c5 != kotlinx.coroutines.internal.z0.f20411a) {
                x3Var = m0.g(dVar, context, c5);
            } else {
                x3Var = null;
            }
            try {
                kotlin.coroutines.g context2 = dVar.getContext();
                Object n5 = n();
                Throwable j5 = j(n5);
                if (j5 == null && i1.c(this.f20294c)) {
                    l2Var = (l2) context2.get(l2.U);
                } else {
                    l2Var = null;
                }
                if (l2Var != null && !l2Var.isActive()) {
                    CancellationException y4 = l2Var.y();
                    f(n5, y4);
                    d1.a aVar = kotlin.d1.Companion;
                    dVar.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(y4)));
                } else if (j5 != null) {
                    d1.a aVar2 = kotlin.d1.Companion;
                    dVar.resumeWith(kotlin.d1.m6444constructorimpl(kotlin.e1.a(j5)));
                } else {
                    d1.a aVar3 = kotlin.d1.Companion;
                    dVar.resumeWith(kotlin.d1.m6444constructorimpl(l(n5)));
                }
                kotlin.r2 r2Var = kotlin.r2.f19517a;
                try {
                    d1.a aVar4 = kotlin.d1.Companion;
                    lVar.f0();
                    m6444constructorimpl2 = kotlin.d1.m6444constructorimpl(r2Var);
                } catch (Throwable th) {
                    d1.a aVar5 = kotlin.d1.Companion;
                    m6444constructorimpl2 = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
                }
                m(null, kotlin.d1.m6447exceptionOrNullimpl(m6444constructorimpl2));
            } finally {
                if (x3Var == null || x3Var.x1()) {
                    kotlinx.coroutines.internal.z0.a(context, c5);
                }
            }
        } catch (Throwable th2) {
            try {
                d1.a aVar6 = kotlin.d1.Companion;
                lVar.f0();
                m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.r2.f19517a);
            } catch (Throwable th3) {
                d1.a aVar7 = kotlin.d1.Companion;
                m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th3));
            }
            m(th2, kotlin.d1.m6447exceptionOrNullimpl(m6444constructorimpl));
        }
    }
}
