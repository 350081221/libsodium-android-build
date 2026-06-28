package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.bi;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0010\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0013H\u0007\u001a\n\u0010\u0016\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u0013\u001a\u001e\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011\u001a\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0013H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\t*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001d\u0010!\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u00020\u001b*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010 \u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lkotlinx/coroutines/l2;", "parent", "Lkotlinx/coroutines/b0;", bi.ay, "b", "(Lkotlinx/coroutines/l2;)Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/n1;", "handle", "w", "Lkotlin/r2;", "l", "(Lkotlinx/coroutines/l2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "r", bi.aA, "", "q", "Lkotlin/coroutines/g;", "f", "e", "y", "x", "", CrashHianalyticsData.MESSAGE, socket.g.f22386a, "", bi.aJ, "o", "m", "n", ServiceManagerNative.JOB, "B", "(Ljava/lang/Throwable;Lkotlinx/coroutines/l2;)Ljava/lang/Throwable;", "A", "(Lkotlin/coroutines/g;)Z", "isActive", bi.aG, "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/l2;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/JobKt")
@kotlin.jvm.internal.r1({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,685:1\n13#2:686\n1295#3,2:687\n1295#3,2:689\n1295#3,2:691\n1295#3,2:693\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n494#1:686\n521#1:687,2\n535#1:689,2\n629#1:691,2\n653#1:693,2\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 {
    public static final boolean A(@p4.l kotlin.coroutines.g gVar) {
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var != null) {
            return l2Var.isActive();
        }
        return true;
    }

    private static final Throwable B(Throwable th, l2 l2Var) {
        return th == null ? new m2("Job was cancelled", null, l2Var) : th;
    }

    @p4.l
    public static final b0 a(@p4.m l2 l2Var) {
        return new o2(l2Var);
    }

    @u3.h(name = "Job")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ l2 b(l2 l2Var) {
        return p2.a(l2Var);
    }

    public static /* synthetic */ b0 c(l2 l2Var, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            l2Var = null;
        }
        return p2.a(l2Var);
    }

    public static /* synthetic */ l2 d(l2 l2Var, int i5, Object obj) {
        l2 b5;
        if ((i5 & 1) != 0) {
            l2Var = null;
        }
        b5 = b(l2Var);
        return b5;
    }

    public static final void f(@p4.l kotlin.coroutines.g gVar, @p4.m CancellationException cancellationException) {
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var != null) {
            l2Var.cancel(cancellationException);
        }
    }

    public static final void g(@p4.l l2 l2Var, @p4.l String str, @p4.m Throwable th) {
        l2Var.cancel(w1.a(str, th));
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(kotlin.coroutines.g gVar, Throwable th) {
        t2 t2Var;
        g.b bVar = gVar.get(l2.U);
        if (bVar instanceof t2) {
            t2Var = (t2) bVar;
        } else {
            t2Var = null;
        }
        if (t2Var == null) {
            return false;
        }
        t2Var.d0(B(th, t2Var));
        return true;
    }

    public static /* synthetic */ void i(kotlin.coroutines.g gVar, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        p2.f(gVar, cancellationException);
    }

    public static /* synthetic */ void j(l2 l2Var, String str, Throwable th, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            th = null;
        }
        p2.g(l2Var, str, th);
    }

    public static /* synthetic */ boolean k(kotlin.coroutines.g gVar, Throwable th, int i5, Object obj) {
        boolean h5;
        if ((i5 & 1) != 0) {
            th = null;
        }
        h5 = h(gVar, th);
        return h5;
    }

    @p4.m
    public static final Object l(@p4.l l2 l2Var, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        Object l5;
        l2.a.b(l2Var, null, 1, null);
        Object b02 = l2Var.b0(dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (b02 == l5) {
            return b02;
        }
        return kotlin.r2.f19517a;
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(kotlin.coroutines.g gVar, Throwable th) {
        t2 t2Var;
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var == null) {
            return;
        }
        for (l2 l2Var2 : l2Var.o()) {
            if (l2Var2 instanceof t2) {
                t2Var = (t2) l2Var2;
            } else {
                t2Var = null;
            }
            if (t2Var != null) {
                t2Var.d0(B(th, l2Var));
            }
        }
    }

    public static final void o(@p4.l kotlin.coroutines.g gVar, @p4.m CancellationException cancellationException) {
        kotlin.sequences.m<l2> o5;
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var != null && (o5 = l2Var.o()) != null) {
            Iterator<l2> it = o5.iterator();
            while (it.hasNext()) {
                it.next().cancel(cancellationException);
            }
        }
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(l2 l2Var, Throwable th) {
        t2 t2Var;
        for (l2 l2Var2 : l2Var.o()) {
            if (l2Var2 instanceof t2) {
                t2Var = (t2) l2Var2;
            } else {
                t2Var = null;
            }
            if (t2Var != null) {
                t2Var.d0(B(th, l2Var));
            }
        }
    }

    public static final void r(@p4.l l2 l2Var, @p4.m CancellationException cancellationException) {
        Iterator<l2> it = l2Var.o().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void s(kotlin.coroutines.g gVar, Throwable th, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        n(gVar, th);
    }

    public static /* synthetic */ void t(kotlin.coroutines.g gVar, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        p2.o(gVar, cancellationException);
    }

    public static /* synthetic */ void u(l2 l2Var, Throwable th, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        q(l2Var, th);
    }

    public static /* synthetic */ void v(l2 l2Var, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = null;
        }
        p2.r(l2Var, cancellationException);
    }

    @p4.l
    public static final n1 w(@p4.l l2 l2Var, @p4.l n1 n1Var) {
        return l2Var.t0(new p1(n1Var));
    }

    public static final void x(@p4.l kotlin.coroutines.g gVar) {
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var != null) {
            p2.A(l2Var);
        }
    }

    public static final void y(@p4.l l2 l2Var) {
        if (!l2Var.isActive()) {
            throw l2Var.y();
        }
    }

    @p4.l
    public static final l2 z(@p4.l kotlin.coroutines.g gVar) {
        l2 l2Var = (l2) gVar.get(l2.U);
        if (l2Var != null) {
            return l2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }
}
