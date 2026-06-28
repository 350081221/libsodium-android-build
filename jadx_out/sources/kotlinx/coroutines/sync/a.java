package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import kotlinx.coroutines.selects.i;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\u001f\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&J\u0014\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&R\u0014\u0010\f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00000\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/sync/a;", "", "owner", "", "c", "Lkotlin/r2;", "f", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", bi.aJ, socket.g.f22386a, "d", "()Z", "isLocked", "Lkotlinx/coroutines/selects/i;", "i", "()Lkotlinx/coroutines/selects/i;", "getOnLock$annotations", "()V", "onLock", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface a {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.sync.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0615a {
        @k(level = m.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(a aVar, Object obj, kotlin.coroutines.d dVar, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i5 & 1) != 0) {
                obj = null;
            }
            return aVar.f(obj, dVar);
        }

        public static /* synthetic */ boolean c(a aVar, Object obj, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i5 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj);
        }

        public static /* synthetic */ void d(a aVar, Object obj, int i5, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i5 & 1) != 0) {
                obj = null;
            }
            aVar.g(obj);
        }
    }

    boolean c(@p4.m Object obj);

    boolean d();

    @p4.m
    Object f(@p4.m Object obj, @l kotlin.coroutines.d<? super r2> dVar);

    void g(@p4.m Object obj);

    boolean h(@l Object obj);

    @l
    i<Object, a> i();
}
