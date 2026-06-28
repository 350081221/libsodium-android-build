package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.coroutines.g;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlin/coroutines/g$b;", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeApi
/* loaded from: classes.dex */
public interface SnapshotContextElement extends g.b {

    @l
    public static final Key Key = Key.$$INSTANCE;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@l SnapshotContextElement snapshotContextElement, R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(snapshotContextElement, r5, pVar);
        }

        @m
        public static <E extends g.b> E get(@l SnapshotContextElement snapshotContextElement, @l g.c<E> cVar) {
            return (E) g.b.a.b(snapshotContextElement, cVar);
        }

        @l
        public static g minusKey(@l SnapshotContextElement snapshotContextElement, @l g.c<?> cVar) {
            return g.b.a.c(snapshotContextElement, cVar);
        }

        @l
        public static g plus(@l SnapshotContextElement snapshotContextElement, @l g gVar) {
            return g.b.a.d(snapshotContextElement, gVar);
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElement$Key;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Key implements g.c<SnapshotContextElement> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }
}
