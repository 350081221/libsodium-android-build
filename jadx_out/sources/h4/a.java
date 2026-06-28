package h4;

import com.umeng.analytics.pro.bi;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.c;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.internal.m;
import p4.l;
import v3.p;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a#\u0010\u0016\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0082\b\u001a\u001c\u0010\u0017\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/r2;", "d", "(Lv3/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lkotlin/v0;", "name", "cause", "onCancellation", "e", "(Lv3/p;Ljava/lang/Object;Lkotlin/coroutines/d;Lv3/l;)V", "fatalCompletion", "c", "Lkotlin/Function0;", "block", "b", bi.ay, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,68:1\n49#1,6:69\n49#1,6:75\n49#1,6:81\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n17#1:69,6\n29#1:75,6\n38#1:81,6\n*E\n"})
/* loaded from: classes4.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        d1.a aVar = d1.Companion;
        dVar.resumeWith(d1.m6444constructorimpl(e1.a(th)));
        throw th;
    }

    private static final void b(d<?> dVar, v3.a<r2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final void c(@l d<? super r2> dVar, @l d<?> dVar2) {
        d e5;
        try {
            e5 = c.e(dVar);
            d1.a aVar = d1.Companion;
            m.e(e5, d1.m6444constructorimpl(r2.f19517a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    @g2
    public static final <T> void d(@l v3.l<? super d<? super T>, ? extends Object> lVar, @l d<? super T> dVar) {
        d b5;
        d e5;
        try {
            b5 = c.b(lVar, dVar);
            e5 = c.e(b5);
            d1.a aVar = d1.Companion;
            m.e(e5, d1.m6444constructorimpl(r2.f19517a), null, 2, null);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final <R, T> void e(@l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r5, @l d<? super T> dVar, @p4.m v3.l<? super Throwable, r2> lVar) {
        d c5;
        d e5;
        try {
            c5 = c.c(pVar, r5, dVar);
            e5 = c.e(c5);
            d1.a aVar = d1.Companion;
            m.d(e5, d1.m6444constructorimpl(r2.f19517a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, d dVar, v3.l lVar, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        e(pVar, obj, dVar, lVar);
    }
}
