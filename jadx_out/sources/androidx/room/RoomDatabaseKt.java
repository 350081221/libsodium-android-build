package androidx.room;

import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.g;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.o3;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aN\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n¢\u0006\u0002\b\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0012\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u001a;\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00190\u0018*\u00020\u00012\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "Lkotlin/Function2;", "Lkotlinx/coroutines/s0;", "Lkotlin/u;", "transactionBlock", "startTransactionCoroutine", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/g;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/e;", "dispatcher", "createTransactionContext", "", "", "tables", "", "emitInitialState", "Lkotlinx/coroutines/flow/i;", "", "invalidationTrackerFlow", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Z)Lkotlinx/coroutines/flow/i;", "room-ktx_release"}, k = 2, mv = {1, 8, 0})
@u3.h(name = "RoomDatabaseKt")
@r1({"SMAP\nRoomDatabaseExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,239:1\n314#2,11:240\n*S KotlinDebug\n*F\n+ 1 RoomDatabaseExt.kt\nandroidx/room/RoomDatabaseKt\n*L\n92#1:240,11\n*E\n"})
/* loaded from: classes2.dex */
public final class RoomDatabaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.g createTransactionContext(RoomDatabase roomDatabase, kotlin.coroutines.e eVar) {
        TransactionElement transactionElement = new TransactionElement(eVar);
        return eVar.plus(transactionElement).plus(o3.a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    @p4.l
    public static final kotlinx.coroutines.flow.i<Set<String>> invalidationTrackerFlow(@p4.l RoomDatabase roomDatabase, @p4.l String[] strArr, boolean z4) {
        return kotlinx.coroutines.flow.k.s(new RoomDatabaseKt$invalidationTrackerFlow$1(z4, roomDatabase, strArr, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        return invalidationTrackerFlow(roomDatabase, strArr, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine(final RoomDatabase roomDatabase, final kotlin.coroutines.g gVar, final v3.p<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super R> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
        qVar.B();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

                @kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
                @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
                    final /* synthetic */ kotlinx.coroutines.p<R> $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ v3.p<s0, kotlin.coroutines.d<? super R>, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(RoomDatabase roomDatabase, kotlinx.coroutines.p<? super R> pVar, v3.p<? super s0, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar2, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                        super(2, dVar);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = pVar;
                        this.$transactionBlock = pVar2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.l
                    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, dVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // v3.p
                    @p4.m
                    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                        return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @p4.m
                    public final Object invokeSuspend(@p4.l Object obj) {
                        Object l5;
                        kotlin.coroutines.g createTransactionContext;
                        kotlin.coroutines.d dVar;
                        l5 = kotlin.coroutines.intrinsics.d.l();
                        int i5 = this.label;
                        if (i5 != 0) {
                            if (i5 == 1) {
                                dVar = (kotlin.coroutines.d) this.L$0;
                                e1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            e1.n(obj);
                            g.b bVar = ((s0) this.L$0).getCoroutineContext().get(kotlin.coroutines.e.S);
                            l0.m(bVar);
                            createTransactionContext = RoomDatabaseKt.createTransactionContext(this.$this_startTransactionCoroutine, (kotlin.coroutines.e) bVar);
                            kotlin.coroutines.d dVar2 = this.$continuation;
                            d1.a aVar = d1.Companion;
                            v3.p<s0, kotlin.coroutines.d<? super R>, Object> pVar = this.$transactionBlock;
                            this.L$0 = dVar2;
                            this.label = 1;
                            obj = kotlinx.coroutines.i.h(createTransactionContext, pVar, this);
                            if (obj == l5) {
                                return l5;
                            }
                            dVar = dVar2;
                        }
                        dVar.resumeWith(d1.m6444constructorimpl(obj));
                        return r2.f19517a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        kotlinx.coroutines.i.f(kotlin.coroutines.g.this.minusKey(kotlin.coroutines.e.S), new AnonymousClass1(roomDatabase, qVar, pVar, null));
                    } catch (Throwable th) {
                        qVar.a(th);
                    }
                }
            });
        } catch (RejectedExecutionException e6) {
            qVar.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e6));
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    @p4.m
    public static final <R> Object withTransaction(@p4.l RoomDatabase roomDatabase, @p4.l v3.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        kotlin.coroutines.e eVar = null;
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, lVar, null);
        TransactionElement transactionElement = (TransactionElement) dVar.getContext().get(TransactionElement.Key);
        if (transactionElement != null) {
            eVar = transactionElement.getTransactionDispatcher$room_ktx_release();
        }
        if (eVar != null) {
            return kotlinx.coroutines.i.h(eVar, roomDatabaseKt$withTransaction$transactionBlock$1, dVar);
        }
        return startTransactionCoroutine(roomDatabase, dVar.getContext(), roomDatabaseKt$withTransaction$transactionBlock$1, dVar);
    }
}
