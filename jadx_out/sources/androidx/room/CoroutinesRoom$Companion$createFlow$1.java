package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/flow/j;", "Lu3/n;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CoroutinesRoom$Companion$createFlow$1<R> extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.flow.j<R>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.j<R> $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {128, 130}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C00791 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ kotlinx.coroutines.channels.l<r2> $observerChannel;
            final /* synthetic */ kotlinx.coroutines.channels.l<R> $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00791(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, kotlinx.coroutines.channels.l<r2> lVar, Callable<R> callable, kotlinx.coroutines.channels.l<R> lVar2, kotlin.coroutines.d<? super C00791> dVar) {
                super(2, dVar);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = lVar;
                this.$callable = callable;
                this.$resultChannel = lVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C00791(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00791) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:11:0x003e, B:16:0x004c, B:18:0x0054), top: B:10:0x003e }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006a -> B:10:0x003e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r7.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r7.L$0
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L7c
                    r8 = r1
                    goto L3d
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1f:
                    java.lang.Object r1 = r7.L$0
                    kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                    kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L7c
                    r4 = r1
                    r1 = r7
                    goto L4c
                L29:
                    kotlin.e1.n(r8)
                    androidx.room.RoomDatabase r8 = r7.$db
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r7.$observer
                    r8.addObserver(r1)
                    kotlinx.coroutines.channels.l<kotlin.r2> r8 = r7.$observerChannel     // Catch: java.lang.Throwable -> L7c
                    kotlinx.coroutines.channels.n r8 = r8.iterator()     // Catch: java.lang.Throwable -> L7c
                L3d:
                    r1 = r7
                L3e:
                    r1.L$0 = r8     // Catch: java.lang.Throwable -> L7a
                    r1.label = r3     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r4 = r8.c(r1)     // Catch: java.lang.Throwable -> L7a
                    if (r4 != r0) goto L49
                    return r0
                L49:
                    r6 = r4
                    r4 = r8
                    r8 = r6
                L4c:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7a
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7a
                    if (r8 == 0) goto L6c
                    r4.next()     // Catch: java.lang.Throwable -> L7a
                    java.util.concurrent.Callable<R> r8 = r1.$callable     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L7a
                    kotlinx.coroutines.channels.l<R> r5 = r1.$resultChannel     // Catch: java.lang.Throwable -> L7a
                    r1.L$0 = r4     // Catch: java.lang.Throwable -> L7a
                    r1.label = r2     // Catch: java.lang.Throwable -> L7a
                    java.lang.Object r8 = r5.F(r8, r1)     // Catch: java.lang.Throwable -> L7a
                    if (r8 != r0) goto L6a
                    return r0
                L6a:
                    r8 = r4
                    goto L3e
                L6c:
                    androidx.room.RoomDatabase r8 = r1.$db
                    androidx.room.InvalidationTracker r8 = r8.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r0 = r1.$observer
                    r8.removeObserver(r0)
                    kotlin.r2 r8 = kotlin.r2.f19517a
                    return r8
                L7a:
                    r8 = move-exception
                    goto L7e
                L7c:
                    r8 = move-exception
                    r1 = r7
                L7e:
                    androidx.room.RoomDatabase r0 = r1.$db
                    androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
                    androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 r1 = r1.$observer
                    r0.removeObserver(r1)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00791.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z4, RoomDatabase roomDatabase, kotlinx.coroutines.flow.j<R> jVar, String[] strArr, Callable<R> callable, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$inTransaction = z4;
            this.$db = roomDatabase;
            this.$$this$flow = jVar;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            kotlin.coroutines.e queryDispatcher;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                s0 s0Var = (s0) this.L$0;
                final kotlinx.coroutines.channels.l d5 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
                final String[] strArr = this.$tableNames;
                ?? r7 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(@p4.l Set<String> set) {
                        d5.p(r2.f19517a);
                    }
                };
                d5.p(r2.f19517a);
                TransactionElement transactionElement = (TransactionElement) s0Var.getCoroutineContext().get(TransactionElement.Key);
                if (transactionElement == null || (queryDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                    if (this.$inTransaction) {
                        queryDispatcher = CoroutinesRoomKt.getTransactionDispatcher(this.$db);
                    } else {
                        queryDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.$db);
                    }
                }
                kotlinx.coroutines.channels.l d6 = kotlinx.coroutines.channels.o.d(0, null, null, 7, null);
                kotlinx.coroutines.k.f(s0Var, queryDispatcher, null, new C00791(this.$db, r7, d5, this.$callable, d6, null), 2, null);
                kotlinx.coroutines.flow.j<R> jVar = this.$$this$flow;
                this.label = 1;
                if (kotlinx.coroutines.flow.k.l0(jVar, d6, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z4, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, kotlin.coroutines.d<? super CoroutinesRoom$Companion$createFlow$1> dVar) {
        super(2, dVar);
        this.$inTransaction = z4;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, dVar);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlinx.coroutines.flow.j<R> jVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(jVar, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inTransaction, this.$db, (kotlinx.coroutines.flow.j) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (t0.g(anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
