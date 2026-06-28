package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.j;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {144, 148, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,181:1\n129#2,5:182\n129#2,5:187\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n139#1:182,5\n162#1:187,5\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends o implements p<j<? super T>, d<? super r2>, Object> {
    final /* synthetic */ v3.a<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(v3.a<? extends T> aVar, d<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> dVar) {
        super(2, dVar);
        this.$block = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, dVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l j<? super T> jVar, @m d<? super r2> dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(jVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8 A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:15:0x00e4, B:17:0x00e8, B:21:0x00f2, B:25:0x0100, B:31:0x0116, B:33:0x011f, B:45:0x0142, B:46:0x0145, B:60:0x004b, B:27:0x010b, B:30:0x0113, B:41:0x013d, B:42:0x0140, B:29:0x010f), top: B:59:0x004b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:15:0x00e4, B:17:0x00e8, B:21:0x00f2, B:25:0x0100, B:31:0x0116, B:33:0x011f, B:45:0x0142, B:46:0x0145, B:60:0x004b, B:27:0x010b, B:30:0x0113, B:41:0x013d, B:42:0x0140, B:29:0x010f), top: B:59:0x004b, inners: #0 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
