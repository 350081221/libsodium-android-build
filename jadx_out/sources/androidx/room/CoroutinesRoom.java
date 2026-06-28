package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.l2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "()V", "Companion", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class CoroutinesRoom {

    @p4.l
    public static final Companion Companion = new Companion(null);

    private CoroutinesRoom() {
    }

    @p4.l
    @u3.m
    public static final <R> kotlinx.coroutines.flow.i<R> createFlow(@p4.l RoomDatabase roomDatabase, boolean z4, @p4.l String[] strArr, @p4.l Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z4, strArr, callable);
    }

    @p4.m
    @u3.m
    public static final <R> Object execute(@p4.l RoomDatabase roomDatabase, boolean z4, @p4.m CancellationSignal cancellationSignal, @p4.l Callable<R> callable, @p4.l kotlin.coroutines.d<? super R> dVar) {
        return Companion.execute(roomDatabase, z4, cancellationSignal, callable, dVar);
    }

    @p4.m
    @u3.m
    public static final <R> Object execute(@p4.l RoomDatabase roomDatabase, boolean z4, @p4.l Callable<R> callable, @p4.l kotlin.coroutines.d<? super R> dVar) {
        return Companion.execute(roomDatabase, z4, callable, dVar);
    }

    @i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJA\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\rJL\u0010\u0013\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00120\u0011\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "execute", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/i;", "Lu3/n;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/i;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nCoroutinesRoom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,162:1\n314#2,11:163\n*S KotlinDebug\n*F\n+ 1 CoroutinesRoom.kt\nandroidx/room/CoroutinesRoom$Companion\n*L\n84#1:163,11\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        @u3.m
        public final <R> kotlinx.coroutines.flow.i<R> createFlow(@p4.l RoomDatabase roomDatabase, boolean z4, @p4.l String[] strArr, @p4.l Callable<R> callable) {
            return kotlinx.coroutines.flow.k.J0(new CoroutinesRoom$Companion$createFlow$1(z4, roomDatabase, strArr, callable, null));
        }

        @p4.m
        @u3.m
        public final <R> Object execute(@p4.l RoomDatabase roomDatabase, boolean z4, @p4.l Callable<R> callable, @p4.l kotlin.coroutines.d<? super R> dVar) {
            kotlin.coroutines.e transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z4 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return kotlinx.coroutines.i.h(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), dVar);
        }

        @p4.m
        @u3.m
        public final <R> Object execute(@p4.l RoomDatabase roomDatabase, boolean z4, @p4.m CancellationSignal cancellationSignal, @p4.l Callable<R> callable, @p4.l kotlin.coroutines.d<? super R> dVar) {
            kotlin.coroutines.e transactionDispatcher;
            kotlin.coroutines.d e5;
            l2 f5;
            Object l5;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z4 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            kotlin.coroutines.e eVar = transactionDispatcher;
            e5 = kotlin.coroutines.intrinsics.c.e(dVar);
            kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
            qVar.B();
            f5 = kotlinx.coroutines.k.f(c2.f19867a, eVar, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, qVar, null), 2, null);
            qVar.g(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, f5));
            Object E = qVar.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return E;
        }
    }
}
