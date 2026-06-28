package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0012\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u000b\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/g1;", "T", "Lkotlinx/coroutines/internal/p0;", "", "A1", "z1", "", "state", "Lkotlin/r2;", "W", "s1", "x1", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class g1<T> extends kotlinx.coroutines.internal.p0<T> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final AtomicIntegerFieldUpdater f20290e = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_decision");

    @u3.w
    private volatile int _decision;

    public g1(@p4.l kotlin.coroutines.g gVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean A1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20290e;
        do {
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f20290e.compareAndSet(this, 0, 1));
        return true;
    }

    private final void y1(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, v3.l<? super Integer, kotlin.r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final boolean z1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20290e;
        do {
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f20290e.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.p0, kotlinx.coroutines.t2
    public void W(@p4.m Object obj) {
        s1(obj);
    }

    @Override // kotlinx.coroutines.internal.p0, kotlinx.coroutines.a
    protected void s1(@p4.m Object obj) {
        kotlin.coroutines.d e5;
        if (z1()) {
            return;
        }
        e5 = kotlin.coroutines.intrinsics.c.e(this.f20380d);
        kotlinx.coroutines.internal.m.e(e5, j0.a(obj, this.f20380d), null, 2, null);
    }

    @p4.m
    public final Object x1() {
        Object l5;
        if (A1()) {
            l5 = kotlin.coroutines.intrinsics.d.l();
            return l5;
        }
        Object h5 = u2.h(E0());
        if (!(h5 instanceof d0)) {
            return h5;
        }
        throw ((d0) h5).f19951a;
    }
}
