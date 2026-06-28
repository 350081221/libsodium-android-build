package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.d1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0004J\u0013\u0010\r\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0013\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/w0;", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/u0;", "flow", "", "d", "", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "f", "(Lkotlinx/coroutines/flow/u0;)[Lkotlin/coroutines/d;", bi.aJ, "i", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,428:1\n1#2:429\n314#3,11:430\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n298#1:430,11\n*E\n"})
/* loaded from: classes4.dex */
public final class w0 extends kotlinx.coroutines.flow.internal.d<u0<?>> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final AtomicReferenceFieldUpdater f20261a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");

    @u3.w
    @p4.m
    private volatile Object _state;

    private final void g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, v3.l<Object, r2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.flow.internal.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@p4.l u0<?> u0Var) {
        kotlinx.coroutines.internal.t0 t0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20261a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        t0Var = v0.f20248a;
        atomicReferenceFieldUpdater.set(this, t0Var);
        return true;
    }

    @p4.m
    public final Object e(@p4.l kotlin.coroutines.d<? super r2> dVar) {
        kotlin.coroutines.d e5;
        kotlinx.coroutines.internal.t0 t0Var;
        Object l5;
        Object l6;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
        qVar.B();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20261a;
        t0Var = v0.f20248a;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, t0Var, qVar)) {
            d1.a aVar = d1.Companion;
            qVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (E == l6) {
            return E;
        }
        return r2.f19517a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @p4.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d<r2>[] b(@p4.l u0<?> u0Var) {
        f20261a.set(this, null);
        return kotlinx.coroutines.flow.internal.c.f20109a;
    }

    public final void h() {
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        kotlinx.coroutines.internal.t0 t0Var3;
        kotlinx.coroutines.internal.t0 t0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20261a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            t0Var = v0.f20249b;
            if (obj == t0Var) {
                return;
            }
            t0Var2 = v0.f20248a;
            if (obj == t0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20261a;
                t0Var3 = v0.f20249b;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, t0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f20261a;
                t0Var4 = v0.f20248a;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater3, this, obj, t0Var4)) {
                    d1.a aVar = d1.Companion;
                    ((kotlinx.coroutines.q) obj).resumeWith(d1.m6444constructorimpl(r2.f19517a));
                    return;
                }
            }
        }
    }

    public final boolean i() {
        kotlinx.coroutines.internal.t0 t0Var;
        kotlinx.coroutines.internal.t0 t0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20261a;
        t0Var = v0.f20248a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, t0Var);
        kotlin.jvm.internal.l0.m(andSet);
        t0Var2 = v0.f20249b;
        if (andSet == t0Var2) {
            return true;
        }
        return false;
    }
}
