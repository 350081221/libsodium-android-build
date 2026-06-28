package kotlinx.coroutines;

import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/f0;", "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/e2;", "Lkotlin/r2;", "dispose", "", "toString", "Lkotlinx/coroutines/t2;", "d", "Lkotlinx/coroutines/t2;", "y", "()Lkotlinx/coroutines/t2;", bi.aG, "(Lkotlinx/coroutines/t2;)V", ServiceManagerNative.JOB, "", "isActive", "()Z", "Lkotlinx/coroutines/y2;", bi.ay, "()Lkotlinx/coroutines/y2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class s2 extends f0 implements n1, e2 {

    /* renamed from: d, reason: collision with root package name */
    public t2 f20471d;

    @Override // kotlinx.coroutines.e2
    @p4.m
    public y2 a() {
        return null;
    }

    @Override // kotlinx.coroutines.n1
    public void dispose() {
        y().g1(this);
    }

    @Override // kotlinx.coroutines.e2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.z
    @p4.l
    public String toString() {
        return x0.a(this) + '@' + x0.b(this) + "[job@" + x0.b(y()) + ']';
    }

    @p4.l
    public final t2 y() {
        t2 t2Var = this.f20471d;
        if (t2Var != null) {
            return t2Var;
        }
        kotlin.jvm.internal.l0.S(ServiceManagerNative.JOB);
        return null;
    }

    public final void z(@p4.l t2 t2Var) {
        this.f20471d = t2Var;
    }
}
