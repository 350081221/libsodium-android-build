package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", bi.ay, "(Lkotlin/coroutines/g;Lv3/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xs = "kotlinx/coroutines/BuildersKt")
@kotlin.jvm.internal.r1({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes4.dex */
public final /* synthetic */ class j {
    public static final <T> T a(@p4.l kotlin.coroutines.g gVar, @p4.l v3.p<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar) throws InterruptedException {
        r1 r1Var;
        r1 a5;
        kotlin.coroutines.g e5;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) gVar.get(kotlin.coroutines.e.S);
        if (eVar == null) {
            a5 = p3.f20437a.b();
            e5 = m0.e(c2.f19867a, gVar.plus(a5));
        } else {
            r1 r1Var2 = null;
            if (eVar instanceof r1) {
                r1Var = (r1) eVar;
            } else {
                r1Var = null;
            }
            if (r1Var != null) {
                if (r1Var.O0()) {
                    r1Var2 = r1Var;
                }
                if (r1Var2 != null) {
                    a5 = r1Var2;
                    e5 = m0.e(c2.f19867a, gVar);
                }
            }
            a5 = p3.f20437a.a();
            e5 = m0.e(c2.f19867a, gVar);
        }
        g gVar2 = new g(e5, currentThread, a5);
        gVar2.w1(u0.DEFAULT, gVar2, pVar);
        return (T) gVar2.x1();
    }

    public static /* synthetic */ Object b(kotlin.coroutines.g gVar, v3.p pVar, int i5, Object obj) throws InterruptedException {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        return i.f(gVar, pVar);
    }
}
