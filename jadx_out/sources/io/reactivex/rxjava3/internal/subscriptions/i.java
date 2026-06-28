package io.reactivex.rxjava3.internal.subscriptions;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.q;

/* loaded from: classes3.dex */
public class i extends AtomicInteger implements q {
    private static final long serialVersionUID = -2189523197179400958L;
    q actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<q> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public i(boolean z4) {
        this.cancelOnReplace = z4;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int i5 = 1;
        long j5 = 0;
        q qVar = null;
        do {
            q qVar2 = this.missedSubscription.get();
            if (qVar2 != null) {
                qVar2 = this.missedSubscription.getAndSet(null);
            }
            long j6 = this.missedRequested.get();
            if (j6 != 0) {
                j6 = this.missedRequested.getAndSet(0L);
            }
            long j7 = this.missedProduced.get();
            if (j7 != 0) {
                j7 = this.missedProduced.getAndSet(0L);
            }
            q qVar3 = this.actual;
            if (this.cancelled) {
                if (qVar3 != null) {
                    qVar3.cancel();
                    this.actual = null;
                }
                if (qVar2 != null) {
                    qVar2.cancel();
                }
            } else {
                long j8 = this.requested;
                if (j8 != Long.MAX_VALUE) {
                    j8 = io.reactivex.rxjava3.internal.util.d.c(j8, j6);
                    if (j8 != Long.MAX_VALUE) {
                        j8 -= j7;
                        if (j8 < 0) {
                            j.reportMoreProduced(j8);
                            j8 = 0;
                        }
                    }
                    this.requested = j8;
                }
                if (qVar2 != null) {
                    if (qVar3 != null && this.cancelOnReplace) {
                        qVar3.cancel();
                    }
                    this.actual = qVar2;
                    if (j8 != 0) {
                        j5 = io.reactivex.rxjava3.internal.util.d.c(j5, j8);
                        qVar = qVar2;
                    }
                } else if (qVar3 != null && j6 != 0) {
                    j5 = io.reactivex.rxjava3.internal.util.d.c(j5, j6);
                    qVar = qVar3;
                }
            }
            i5 = addAndGet(-i5);
        } while (i5 != 0);
        if (j5 != 0) {
            qVar.request(j5);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j5) {
        if (this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j6 = this.requested;
            if (j6 != Long.MAX_VALUE) {
                long j7 = j6 - j5;
                if (j7 < 0) {
                    j.reportMoreProduced(j7);
                    j7 = 0;
                }
                this.requested = j7;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            drainLoop();
            return;
        }
        io.reactivex.rxjava3.internal.util.d.a(this.missedProduced, j5);
        drain();
    }

    @Override // org.reactivestreams.q
    public final void request(long j5) {
        if (!j.validate(j5) || this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j6 = this.requested;
            if (j6 != Long.MAX_VALUE) {
                long c5 = io.reactivex.rxjava3.internal.util.d.c(j6, j5);
                this.requested = c5;
                if (c5 == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            q qVar = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (qVar != null) {
                qVar.request(j5);
                return;
            }
            return;
        }
        io.reactivex.rxjava3.internal.util.d.a(this.missedRequested, j5);
        drain();
    }

    public final void setSubscription(q qVar) {
        if (this.cancelled) {
            qVar.cancel();
            return;
        }
        Objects.requireNonNull(qVar, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            q qVar2 = this.actual;
            if (qVar2 != null && this.cancelOnReplace) {
                qVar2.cancel();
            }
            this.actual = qVar;
            long j5 = this.requested;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (j5 != 0) {
                qVar.request(j5);
                return;
            }
            return;
        }
        q andSet = this.missedSubscription.getAndSet(qVar);
        if (andSet != null && this.cancelOnReplace) {
            andSet.cancel();
        }
        drain();
    }
}
