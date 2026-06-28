package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/t;", "Lkotlinx/coroutines/d0;", "", "c", "Lkotlinx/atomicfu/AtomicBoolean;", "_resumed", "Lkotlin/coroutines/d;", "continuation", "", "cause", "handled", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class t extends d0 {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20631c = AtomicIntegerFieldUpdater.newUpdater(t.class, "_resumed");

    @u3.w
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(@p4.l kotlin.coroutines.d<?> r3, @p4.m java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.t.<init>(kotlin.coroutines.d, java.lang.Throwable, boolean):void");
    }

    public final boolean c() {
        return f20631c.compareAndSet(this, 0, 1);
    }
}
