package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.b1;
import kotlin.i0;
import kotlinx.coroutines.a2;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u00102\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0001\u0001\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/selects/c;", "R", "", "Lkotlinx/coroutines/selects/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "Lkotlin/r2;", "d", "(Lkotlinx/coroutines/selects/e;Lv3/l;)V", "Q", "Lkotlinx/coroutines/selects/g;", "Lkotlin/Function2;", "c", "(Lkotlinx/coroutines/selects/g;Lv3/p;)V", "P", "Lkotlinx/coroutines/selects/i;", "param", bi.ay, "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lv3/p;)V", bi.aJ, "(Lkotlinx/coroutines/selects/i;Lv3/p;)V", "", "timeMillis", socket.g.f22386a, "(JLv3/l;)V", "Lkotlinx/coroutines/selects/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface c<R> {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@p4.l c<? super R> cVar, @p4.l i<? super P, ? extends Q> iVar, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
            cVar.a(iVar, null, pVar);
        }

        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Replaced with the same extension function", replaceWith = @b1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        @a2
        public static <R> void b(@p4.l c<? super R> cVar, long j5, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
            b.a(cVar, j5, lVar);
        }
    }

    <P, Q> void a(@p4.l i<? super P, ? extends Q> iVar, P p5, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar);

    <Q> void c(@p4.l g<? extends Q> gVar, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar);

    void d(@p4.l e eVar, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar);

    @kotlin.internal.h
    @kotlin.k(level = kotlin.m.ERROR, message = "Replaced with the same extension function", replaceWith = @b1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @a2
    void g(long j5, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar);

    <P, Q> void h(@p4.l i<? super P, ? extends Q> iVar, @p4.l v3.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar);
}
