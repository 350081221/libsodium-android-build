package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\u0001H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u001c\u0010\u0002\u001a\u00020\u00018\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0003¨\u0006\u0012"}, d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "delegate", "(Lokio/Timeout;)V", "()Lokio/Timeout;", "setDelegate", "clearDeadline", "clearTimeout", "deadlineNanoTime", "", "hasDeadline", "", "throwIfReached", "", m0.a.Z, "unit", "Ljava/util/concurrent/TimeUnit;", "timeoutNanos", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class y extends p1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private p1 f21058a;

    public y(@p4.l p1 delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.f21058a = delegate;
    }

    @p4.l
    @u3.h(name = "delegate")
    public final p1 a() {
        return this.f21058a;
    }

    @p4.l
    public final y b(@p4.l p1 delegate) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.f21058a = delegate;
        return this;
    }

    public final /* synthetic */ void c(p1 p1Var) {
        kotlin.jvm.internal.l0.p(p1Var, "<set-?>");
        this.f21058a = p1Var;
    }

    @Override // okio.p1
    @p4.l
    public p1 clearDeadline() {
        return this.f21058a.clearDeadline();
    }

    @Override // okio.p1
    @p4.l
    public p1 clearTimeout() {
        return this.f21058a.clearTimeout();
    }

    @Override // okio.p1
    public long deadlineNanoTime() {
        return this.f21058a.deadlineNanoTime();
    }

    @Override // okio.p1
    public boolean hasDeadline() {
        return this.f21058a.hasDeadline();
    }

    @Override // okio.p1
    public void throwIfReached() throws IOException {
        this.f21058a.throwIfReached();
    }

    @Override // okio.p1
    @p4.l
    public p1 timeout(long j5, @p4.l TimeUnit unit) {
        kotlin.jvm.internal.l0.p(unit, "unit");
        return this.f21058a.timeout(j5, unit);
    }

    @Override // okio.p1
    public long timeoutNanos() {
        return this.f21058a.timeoutNanos();
    }

    @Override // okio.p1
    @p4.l
    public p1 deadlineNanoTime(long j5) {
        return this.f21058a.deadlineNanoTime(j5);
    }
}
