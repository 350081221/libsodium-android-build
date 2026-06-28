package androidx.compose.ui.platform;

import kotlin.coroutines.g;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Lkotlin/coroutines/g$b;", "R", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "onInfiniteOperation", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "Key", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends g.b {

    @p4.l
    public static final Key Key = Key.$$INSTANCE;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@p4.l InfiniteAnimationPolicy infiniteAnimationPolicy, R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(infiniteAnimationPolicy, r5, pVar);
        }

        @p4.m
        public static <E extends g.b> E get(@p4.l InfiniteAnimationPolicy infiniteAnimationPolicy, @p4.l g.c<E> cVar) {
            return (E) g.b.a.b(infiniteAnimationPolicy, cVar);
        }

        @p4.l
        @Deprecated
        public static g.c<?> getKey(@p4.l InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        @p4.l
        public static kotlin.coroutines.g minusKey(@p4.l InfiniteAnimationPolicy infiniteAnimationPolicy, @p4.l g.c<?> cVar) {
            return g.b.a.c(infiniteAnimationPolicy, cVar);
        }

        @p4.l
        public static kotlin.coroutines.g plus(@p4.l InfiniteAnimationPolicy infiniteAnimationPolicy, @p4.l kotlin.coroutines.g gVar) {
            return g.b.a.d(infiniteAnimationPolicy, gVar);
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Key implements g.c<InfiniteAnimationPolicy> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.g.b
    @p4.l
    default g.c<?> getKey() {
        return Key;
    }

    @p4.m
    <R> Object onInfiniteOperation(@p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @p4.l kotlin.coroutines.d<? super R> dVar);
}
