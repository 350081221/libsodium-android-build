package androidx.room;

import kotlin.coroutines.g;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"transactionElement"}, s = {"L$0"})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class RoomDatabaseKt$withTransaction$transactionBlock$1<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super R>, Object> {
    final /* synthetic */ v3.l<kotlin.coroutines.d<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, kotlin.coroutines.d<? super RoomDatabaseKt$withTransaction$transactionBlock$1> dVar) {
        super(2, dVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, dVar);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super R> dVar) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        TransactionElement l5;
        Throwable th;
        TransactionElement transactionElement;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    transactionElement = (TransactionElement) this.L$0;
                    try {
                        e1.n(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                g.b bVar = ((s0) this.L$0).getCoroutineContext().get(TransactionElement.Key);
                l0.m(bVar);
                TransactionElement transactionElement2 = (TransactionElement) bVar;
                transactionElement2.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        v3.l<kotlin.coroutines.d<? super R>, Object> lVar = this.$block;
                        this.L$0 = transactionElement2;
                        this.label = 1;
                        Object invoke = lVar.invoke(this);
                        if (invoke == l5) {
                            return l5;
                        }
                        transactionElement = transactionElement2;
                        obj = invoke;
                    } catch (Throwable th3) {
                        th = th3;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th4) {
                    l5 = transactionElement2;
                    th = th4;
                    l5.release();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
