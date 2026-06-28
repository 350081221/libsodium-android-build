package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/room/TransactionElement;", "Lkotlin/coroutines/g$b;", "Lkotlin/r2;", "acquire", "release", "Lkotlin/coroutines/e;", "transactionDispatcher", "Lkotlin/coroutines/e;", "getTransactionDispatcher$room_ktx_release", "()Lkotlin/coroutines/e;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", DatabaseFileArchive.COLUMN_KEY, "<init>", "(Lkotlin/coroutines/e;)V", "Key", "room-ktx_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class TransactionElement implements g.b {

    @p4.l
    public static final Key Key = new Key(null);

    @p4.l
    private final AtomicInteger referenceCount = new AtomicInteger(0);

    @p4.l
    private final kotlin.coroutines.e transactionDispatcher;

    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/TransactionElement$Key;", "Lkotlin/coroutines/g$c;", "Landroidx/room/TransactionElement;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Key implements g.c<TransactionElement> {
        private Key() {
        }

        public /* synthetic */ Key(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public TransactionElement(@p4.l kotlin.coroutines.e eVar) {
        this.transactionDispatcher = eVar;
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b
    @p4.l
    public g.c<TransactionElement> getKey() {
        return Key;
    }

    @p4.l
    public final kotlin.coroutines.e getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() >= 0) {
        } else {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}
