package kotlinx.coroutines;

import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u000b\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/s3;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "cause", "Lkotlin/r2;", "Lkotlinx/coroutines/CompletionHandler;", "", "state", "", "b", "e", bi.ay, "c", "Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/n1;", "cancelHandle", "Lkotlinx/atomicfu/AtomicInt;", "_state", "<init>", "(Lkotlinx/coroutines/l2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class s3 implements v3.l<Throwable, kotlin.r2> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20472d = AtomicIntegerFieldUpdater.newUpdater(s3.class, "_state");

    @u3.w
    private volatile int _state;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final l2 f20473a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f20474b = Thread.currentThread();

    /* renamed from: c, reason: collision with root package name */
    @p4.m
    private n1 f20475c;

    public s3(@p4.l l2 l2Var) {
        this.f20473a = l2Var;
    }

    private final Void b(int i5) {
        throw new IllegalStateException(("Illegal state " + i5).toString());
    }

    private final void d(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, v3.l<? super Integer, kotlin.r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final void a() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20472d;
        while (true) {
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i5);
                        throw new kotlin.y();
                    }
                }
            } else if (f20472d.compareAndSet(this, i5, 1)) {
                n1 n1Var = this.f20475c;
                if (n1Var != null) {
                    n1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public void c(@p4.m Throwable th) {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f20472d;
        do {
            i5 = atomicIntegerFieldUpdater2.get(this);
            if (i5 != 0) {
                if (i5 != 1 && i5 != 2 && i5 != 3) {
                    b(i5);
                    throw new kotlin.y();
                }
                return;
            }
            atomicIntegerFieldUpdater = f20472d;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 2));
        this.f20474b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void e() {
        int i5;
        this.f20475c = this.f20473a.h(true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20472d;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 2 && i5 != 3) {
                    b(i5);
                    throw new kotlin.y();
                }
                return;
            }
        } while (!f20472d.compareAndSet(this, i5, 0));
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ kotlin.r2 invoke(Throwable th) {
        c(th);
        return kotlin.r2.f19517a;
    }
}
