package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R(\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/x3;", "T", "Lkotlinx/coroutines/internal/p0;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "oldValue", "Lkotlin/r2;", "y1", "", "x1", "state", "s1", "Ljava/lang/ThreadLocal;", "Lkotlin/u0;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,311:1\n1#2:312\n107#3,13:313\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:313,13\n*E\n"})
/* loaded from: classes4.dex */
public final class x3<T> extends kotlinx.coroutines.internal.p0<T> {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final ThreadLocal<kotlin.u0<kotlin.coroutines.g, Object>> f20684e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x3(@p4.l kotlin.coroutines.g r3, @p4.l kotlin.coroutines.d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.y3 r0 = kotlinx.coroutines.y3.f20695a
            kotlin.coroutines.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.g r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f20684e = r0
            kotlin.coroutines.g r4 = r4.getContext()
            kotlin.coroutines.e$b r0 = kotlin.coroutines.e.S
            kotlin.coroutines.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.n0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.z0.c(r3, r4)
            kotlinx.coroutines.internal.z0.a(r3, r4)
            r2.y1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.x3.<init>(kotlin.coroutines.g, kotlin.coroutines.d):void");
    }

    @Override // kotlinx.coroutines.internal.p0, kotlinx.coroutines.a
    protected void s1(@p4.m Object obj) {
        if (this.threadLocalIsSet) {
            kotlin.u0<kotlin.coroutines.g, Object> u0Var = this.f20684e.get();
            if (u0Var != null) {
                kotlinx.coroutines.internal.z0.a(u0Var.component1(), u0Var.component2());
            }
            this.f20684e.remove();
        }
        Object a5 = j0.a(obj, this.f20380d);
        kotlin.coroutines.d<T> dVar = this.f20380d;
        kotlin.coroutines.g context = dVar.getContext();
        x3<?> x3Var = null;
        Object c5 = kotlinx.coroutines.internal.z0.c(context, null);
        if (c5 != kotlinx.coroutines.internal.z0.f20411a) {
            x3Var = m0.g(dVar, context, c5);
        }
        try {
            this.f20380d.resumeWith(a5);
            kotlin.r2 r2Var = kotlin.r2.f19517a;
        } finally {
            if (x3Var == null || x3Var.x1()) {
                kotlinx.coroutines.internal.z0.a(context, c5);
            }
        }
    }

    public final boolean x1() {
        boolean z4;
        if (this.threadLocalIsSet && this.f20684e.get() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f20684e.remove();
        return !z4;
    }

    public final void y1(@p4.l kotlin.coroutines.g gVar, @p4.m Object obj) {
        this.threadLocalIsSet = true;
        this.f20684e.set(kotlin.q1.a(gVar, obj));
    }
}
