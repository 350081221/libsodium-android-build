package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.l2;

@kotlin.i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b9\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(R\u001a\u0010-\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010(R\u001a\u00103\u001a\u00020/8VX\u0097\u0004¢\u0006\f\u0012\u0004\b2\u0010%\u001a\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0002048VX\u0097\u0004¢\u0006\f\u0012\u0004\b7\u0010%\u001a\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lkotlinx/coroutines/z2;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/l2;", "", "start", "Lkotlin/r2;", "b0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "y", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/n1;", "t0", "onCancelling", "invokeImmediately", bi.aJ, "cancel", bi.ay, "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "A0", "", "toString", "b", "Ljava/lang/String;", CrashHianalyticsData.MESSAGE, "getParent", "()Lkotlinx/coroutines/l2;", "getParent$annotations", "()V", "parent", "isActive", "()Z", "isActive$annotations", "d", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "getOnJoin$annotations", "onJoin", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class z2 extends kotlin.coroutines.a implements l2 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final z2 f20698a = new z2();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final String f20699b = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private z2() {
        super(l2.U);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public static /* synthetic */ void C0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public static /* synthetic */ void D0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public static /* synthetic */ void E0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public static /* synthetic */ void F0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public static /* synthetic */ void G0() {
    }

    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public static /* synthetic */ void H0() {
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public v A0(@p4.l x xVar) {
        return a3.f19846a;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public l2 H(@p4.l l2 l2Var) {
        return l2.a.j(this, l2Var);
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.l2
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    @p4.m
    public Object b0(@p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.channels.g0
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel(null);
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.channels.d
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public void cancel(@p4.m CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.l2
    public boolean d() {
        return false;
    }

    @Override // kotlinx.coroutines.l2
    @p4.m
    public l2 getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public n1 h(boolean z4, boolean z5, @p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        return a3.f19846a;
    }

    @Override // kotlinx.coroutines.l2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.l2
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public kotlin.sequences.m<l2> o() {
        kotlin.sequences.m<l2> g5;
        g5 = kotlin.sequences.s.g();
        return g5;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    public kotlinx.coroutines.selects.e r0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.l2
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public boolean start() {
        return false;
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public n1 t0(@p4.l v3.l<? super Throwable, kotlin.r2> lVar) {
        return a3.f19846a;
    }

    @p4.l
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.l2
    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = f20699b)
    public CancellationException y() {
        throw new IllegalStateException("This job is always active");
    }
}
