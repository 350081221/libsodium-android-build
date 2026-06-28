package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/g$b;", "R", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "Key", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends g.b {

    @l
    public static final Key Key = Key.$$INSTANCE;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@l MonotonicFrameClock monotonicFrameClock, R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(monotonicFrameClock, r5, pVar);
        }

        @m
        public static <E extends g.b> E get(@l MonotonicFrameClock monotonicFrameClock, @l g.c<E> cVar) {
            return (E) g.b.a.b(monotonicFrameClock, cVar);
        }

        @l
        @Deprecated
        public static g.c<?> getKey(@l MonotonicFrameClock monotonicFrameClock) {
            return MonotonicFrameClock.super.getKey();
        }

        @l
        public static g minusKey(@l MonotonicFrameClock monotonicFrameClock, @l g.c<?> cVar) {
            return g.b.a.c(monotonicFrameClock, cVar);
        }

        @l
        public static g plus(@l MonotonicFrameClock monotonicFrameClock, @l g gVar) {
            return g.b.a.d(monotonicFrameClock, gVar);
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Key implements g.c<MonotonicFrameClock> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.g.b
    @l
    default g.c<?> getKey() {
        return Key;
    }

    @m
    <R> Object withFrameNanos(@l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar);
}
