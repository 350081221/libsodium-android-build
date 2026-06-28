package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.selects.l;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J5\u0010\n\u001a\u00020\u0003*\u00020\u00052\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u000f\u001a\u00020\u0003\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u00028\u00010\r2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J[\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000eH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f0\u0019R\b\u0012\u0004\u0012\u00028\u00000\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/selects/t;", "R", "Lkotlinx/coroutines/selects/l;", "Lkotlin/r2;", "N", "Lkotlinx/coroutines/selects/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "d", "(Lkotlinx/coroutines/selects/e;Lv3/l;)V", "Q", "Lkotlinx/coroutines/selects/g;", "Lkotlin/Function2;", "c", "(Lkotlinx/coroutines/selects/g;Lv3/p;)V", "P", "Lkotlinx/coroutines/selects/i;", "param", bi.ay, "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lv3/p;)V", "w", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/selects/l$a;", socket.g.f22386a, "Ljava/util/List;", "clausesToRegister", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@a1
@r1({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n63#1:69,2\n*E\n"})
/* loaded from: classes4.dex */
public class t<R> extends l<R> {

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final List<l<R>.a> f20601g;

    public t(@p4.l kotlin.coroutines.g gVar) {
        super(gVar);
        this.f20601g = new ArrayList();
    }

    @a1
    static /* synthetic */ <R> Object M(t<R> tVar, kotlin.coroutines.d<? super R> dVar) {
        tVar.N();
        return super.w(dVar);
    }

    private final void N() {
        try {
            Collections.shuffle(this.f20601g);
            Iterator<T> it = this.f20601g.iterator();
            while (it.hasNext()) {
                l.G(this, (l.a) it.next(), false, 1, null);
            }
        } finally {
            this.f20601g.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public <P, Q> void a(@p4.l i<? super P, ? extends Q> iVar, P p5, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        this.f20601g.add(new l.a(iVar.d(), iVar.a(), iVar.c(), p5, pVar, iVar.b()));
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public <Q> void c(@p4.l g<? extends Q> gVar, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        this.f20601g.add(new l.a(gVar.d(), gVar.a(), gVar.c(), null, pVar, gVar.b()));
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public void d(@p4.l e eVar, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        this.f20601g.add(new l.a(eVar.d(), eVar.a(), eVar.c(), o.l(), lVar, eVar.b()));
    }

    @Override // kotlinx.coroutines.selects.l
    @a1
    @p4.m
    public Object w(@p4.l kotlin.coroutines.d<? super R> dVar) {
        return M(this, dVar);
    }
}
