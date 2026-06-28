package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/e2;", "", "toString", "", bi.ay, "Z", "isActive", "()Z", "Lkotlinx/coroutines/y2;", "()Lkotlinx/coroutines/y2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class q1 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f20446a;

    public q1(boolean z4) {
        this.f20446a = z4;
    }

    @Override // kotlinx.coroutines.e2
    @p4.m
    public y2 a() {
        return null;
    }

    @Override // kotlinx.coroutines.e2
    public boolean isActive() {
        return this.f20446a;
    }

    @p4.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
