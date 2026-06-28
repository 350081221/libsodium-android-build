package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.channels.c0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.l2;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1", f = "RoomDatabaseExt.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/channels/e0;", "", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class RoomDatabaseKt$invalidationTrackerFlow$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<e0<? super Set<? extends String>>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ l2 $job;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(l2 l2Var) {
            super(0);
            this.$job = l2Var;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            l2.a.b(this.$job, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$invalidationTrackerFlow$1(boolean z4, RoomDatabase roomDatabase, String[] strArr, kotlin.coroutines.d<? super RoomDatabaseKt$invalidationTrackerFlow$1> dVar) {
        super(2, dVar);
        this.$emitInitialState = z4;
        this.$this_invalidationTrackerFlow = roomDatabase;
        this.$tables = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        RoomDatabaseKt$invalidationTrackerFlow$1 roomDatabaseKt$invalidationTrackerFlow$1 = new RoomDatabaseKt$invalidationTrackerFlow$1(this.$emitInitialState, this.$this_invalidationTrackerFlow, this.$tables, dVar);
        roomDatabaseKt$invalidationTrackerFlow$1.L$0 = obj;
        return roomDatabaseKt$invalidationTrackerFlow$1;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(e0<? super Set<? extends String>> e0Var, kotlin.coroutines.d<? super r2> dVar) {
        return invoke2((e0<? super Set<String>>) e0Var, dVar);
    }

    @p4.m
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@p4.l e0<? super Set<String>> e0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1) create(e0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        kotlin.coroutines.e queryDispatcher;
        l2 f5;
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
            final e0 e0Var = (e0) this.L$0;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(this.$emitInitialState);
            final String[] strArr = this.$tables;
            ?? r5 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(@p4.l Set<String> set) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    e0Var.p(set);
                }
            };
            TransactionElement transactionElement = (TransactionElement) e0Var.getCoroutineContext().get(TransactionElement.Key);
            if (transactionElement == null || (queryDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                queryDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.$this_invalidationTrackerFlow);
            }
            f5 = kotlinx.coroutines.k.f(e0Var, queryDispatcher, null, new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, r5, this.$emitInitialState, e0Var, this.$tables, atomicBoolean, null), 2, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(f5);
            this.label = 1;
            if (c0.a(e0Var, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
