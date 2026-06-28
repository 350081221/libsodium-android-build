package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.g;

@kotlin.i0(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", bi.ay, "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/r2;", "b", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/time/e;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/c1;", "d", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/c1;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n314#2,11:174\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n106#1:163,11\n127#1:174,11\n*E\n"})
/* loaded from: classes4.dex */
public final class d1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {163}, m = "awaitCancellation", n = {}, s = {})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d1.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@p4.l kotlin.coroutines.d<?> r4) {
        /*
            boolean r0 = r4 instanceof kotlinx.coroutines.d1.a
            if (r0 == 0) goto L13
            r0 = r4
            kotlinx.coroutines.d1$a r0 = (kotlinx.coroutines.d1.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.d1$a r0 = new kotlinx.coroutines.d1$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            kotlin.e1.n(r4)
            goto L52
        L31:
            kotlin.e1.n(r4)
            r0.label = r3
            kotlinx.coroutines.q r4 = new kotlinx.coroutines.q
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)
            r4.<init>(r2, r3)
            r4.B()
            java.lang.Object r4 = r4.E()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            if (r4 != r2) goto L4f
            kotlin.coroutines.jvm.internal.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            kotlin.y r4 = new kotlin.y
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.d1.a(kotlin.coroutines.d):java.lang.Object");
    }

    @p4.m
    public static final Object b(long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        Object l6;
        if (j5 <= 0) {
            return kotlin.r2.f19517a;
        }
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        if (j5 < Long.MAX_VALUE) {
            d(qVar.getContext()).p(j5, qVar);
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
        return kotlin.r2.f19517a;
    }

    @p4.m
    public static final Object c(long j5, @p4.l kotlin.coroutines.d<? super kotlin.r2> dVar) {
        Object l5;
        Object b5 = b(e(j5), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return b5 == l5 ? b5 : kotlin.r2.f19517a;
    }

    @p4.l
    public static final c1 d(@p4.l kotlin.coroutines.g gVar) {
        g.b bVar = gVar.get(kotlin.coroutines.e.S);
        c1 c1Var = bVar instanceof c1 ? (c1) bVar : null;
        return c1Var == null ? z0.a() : c1Var;
    }

    public static final long e(long j5) {
        long v4;
        if (kotlin.time.e.l(j5, kotlin.time.e.f19812b.W()) <= 0) {
            return 0L;
        }
        v4 = kotlin.ranges.u.v(kotlin.time.e.M(j5), 1L);
        return v4;
    }
}
