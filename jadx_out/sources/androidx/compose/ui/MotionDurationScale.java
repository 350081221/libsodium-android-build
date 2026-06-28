package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import kotlin.coroutines.g;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@Stable
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/MotionDurationScale;", "Lkotlin/coroutines/g$b;", "", "getScaleFactor", "()F", "scaleFactor", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "Key", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface MotionDurationScale extends g.b {

    @l
    public static final Key Key = Key.$$INSTANCE;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(@l MotionDurationScale motionDurationScale, R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(motionDurationScale, r5, pVar);
        }

        @m
        public static <E extends g.b> E get(@l MotionDurationScale motionDurationScale, @l g.c<E> cVar) {
            return (E) g.b.a.b(motionDurationScale, cVar);
        }

        @l
        public static g minusKey(@l MotionDurationScale motionDurationScale, @l g.c<?> cVar) {
            return g.b.a.c(motionDurationScale, cVar);
        }

        @l
        public static g plus(@l MotionDurationScale motionDurationScale, @l g gVar) {
            return g.b.a.d(motionDurationScale, gVar);
        }
    }

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/MotionDurationScale$Key;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/ui/MotionDurationScale;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Key implements g.c<MotionDurationScale> {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // kotlin.coroutines.g.b
    @l
    default g.c<?> getKey() {
        return Key;
    }

    float getScaleFactor();
}
