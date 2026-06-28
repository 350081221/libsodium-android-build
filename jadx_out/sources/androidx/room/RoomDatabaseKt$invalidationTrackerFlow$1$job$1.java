package androidx.room;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt$invalidationTrackerFlow$1$job$1", f = "RoomDatabaseExt.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class RoomDatabaseKt$invalidationTrackerFlow$1$job$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ e0<Set<String>> $$this$callbackFlow;
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ AtomicBoolean $ignoreInvalidation;
    final /* synthetic */ RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 $observer;
    final /* synthetic */ String[] $tables;
    final /* synthetic */ RoomDatabase $this_invalidationTrackerFlow;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$invalidationTrackerFlow$1$job$1(RoomDatabase roomDatabase, RoomDatabaseKt$invalidationTrackerFlow$1$observer$1 roomDatabaseKt$invalidationTrackerFlow$1$observer$1, boolean z4, e0<? super Set<String>> e0Var, String[] strArr, AtomicBoolean atomicBoolean, kotlin.coroutines.d<? super RoomDatabaseKt$invalidationTrackerFlow$1$job$1> dVar) {
        super(2, dVar);
        this.$this_invalidationTrackerFlow = roomDatabase;
        this.$observer = roomDatabaseKt$invalidationTrackerFlow$1$observer$1;
        this.$emitInitialState = z4;
        this.$$this$callbackFlow = e0Var;
        this.$tables = strArr;
        this.$ignoreInvalidation = atomicBoolean;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new RoomDatabaseKt$invalidationTrackerFlow$1$job$1(this.$this_invalidationTrackerFlow, this.$observer, this.$emitInitialState, this.$$this$callbackFlow, this.$tables, this.$ignoreInvalidation, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((RoomDatabaseKt$invalidationTrackerFlow$1$job$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Set<String> lz;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                this.$this_invalidationTrackerFlow.getInvalidationTracker().addObserver(this.$observer);
                if (this.$emitInitialState) {
                    e0<Set<String>> e0Var = this.$$this$callbackFlow;
                    lz = kotlin.collections.p.lz(this.$tables);
                    e0Var.p(lz);
                }
                this.$ignoreInvalidation.set(false);
                this.label = 1;
                if (d1.a(this) == l5) {
                    return l5;
                }
            }
            throw new kotlin.y();
        } catch (Throwable th) {
            this.$this_invalidationTrackerFlow.getInvalidationTracker().removeObserver(this.$observer);
            throw th;
        }
    }
}
