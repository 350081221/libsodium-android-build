package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class k extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    /* loaded from: classes3.dex */
    static final class a extends Thread implements j {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public k(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@l3.f Runnable runnable) {
        Thread thread;
        String str = this.prefix + '-' + incrementAndGet();
        if (this.nonBlocking) {
            thread = new a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.prefix + "]";
    }

    public k(String str, int i5) {
        this(str, i5, false);
    }

    public k(String str, int i5, boolean z4) {
        this.prefix = str;
        this.priority = i5;
        this.nonBlocking = z4;
    }
}
