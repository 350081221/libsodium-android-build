package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import com.umeng.analytics.pro.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlinx.coroutines.n3;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/n3;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/g;", d.X, "updateThreadContext", "oldState", "Lkotlin/r2;", "restoreThreadContext", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeApi
/* loaded from: classes.dex */
final class SnapshotContextElementImpl implements SnapshotContextElement, n3<Snapshot> {

    @l
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(@l Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @m
    public <E extends g.b> E get(@l g.c<E> cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // kotlin.coroutines.g.b
    @l
    public g.c<?> getKey() {
        return SnapshotContextElement.Key;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    public g minusKey(@l g.c<?> cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @l
    public g plus(@l g gVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, gVar);
    }

    @Override // kotlinx.coroutines.n3
    public void restoreThreadContext(@l g gVar, @m Snapshot snapshot) {
        this.snapshot.unsafeLeave(snapshot);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.n3
    @m
    public Snapshot updateThreadContext(@l g gVar) {
        return this.snapshot.unsafeEnter();
    }
}
