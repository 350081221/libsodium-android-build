package kotlinx.coroutines.scheduling;

import kotlin.i0;
import kotlinx.coroutines.x0;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/scheduling/n;", "Lkotlinx/coroutines/scheduling/k;", "Lkotlin/r2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "c", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/l;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class n extends k {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public final Runnable f20534c;

    public n(@p4.l Runnable runnable, long j5, @p4.l l lVar) {
        super(j5, lVar);
        this.f20534c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f20534c.run();
        } finally {
            this.f20532b.f0();
        }
    }

    @p4.l
    public String toString() {
        return "Task[" + x0.a(this.f20534c) + '@' + x0.b(this.f20534c) + ", " + this.f20531a + ", " + this.f20532b + ']';
    }
}
