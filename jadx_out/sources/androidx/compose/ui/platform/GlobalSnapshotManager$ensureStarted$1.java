package androidx.compose.ui.platform;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,59:1\n105#2:60\n82#2,6:61\n106#2,2:67\n92#2:69\n88#2,3:70\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n46#1:60\n46#1:61,6\n46#1:67,2\n46#1:69\n46#1:70,3\n*E\n"})
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ kotlinx.coroutines.channels.l<r2> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(kotlinx.coroutines.channels.l<r2> lVar, kotlin.coroutines.d<? super GlobalSnapshotManager$ensureStarted$1> dVar) {
        super(2, dVar);
        this.$channel = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:9:0x0041, B:11:0x0049, B:18:0x0061), top: B:8:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:9:0x0041, B:11:0x0049, B:18:0x0061), top: B:8:0x0041 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003b -> B:8:0x0041). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.channels.g0 r3 = (kotlinx.coroutines.channels.g0) r3
            kotlin.e1.n(r8)     // Catch: java.lang.Throwable -> L6b
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L41
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            kotlin.e1.n(r8)
            kotlinx.coroutines.channels.l<kotlin.r2> r3 = r7.$channel
            kotlinx.coroutines.channels.n r8 = r3.iterator()     // Catch: java.lang.Throwable -> L6b
            r1 = r8
            r8 = r7
        L2e:
            r8.L$0 = r3     // Catch: java.lang.Throwable -> L6b
            r8.L$1 = r1     // Catch: java.lang.Throwable -> L6b
            r8.label = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r4 = r1.c(r8)     // Catch: java.lang.Throwable -> L6b
            if (r4 != r0) goto L3b
            return r0
        L3b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L41:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L68
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L61
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L68
            kotlin.r2 r8 = (kotlin.r2) r8     // Catch: java.lang.Throwable -> L68
            java.util.concurrent.atomic.AtomicBoolean r8 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L68
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L68
            androidx.compose.runtime.snapshots.Snapshot$Companion r8 = androidx.compose.runtime.snapshots.Snapshot.Companion     // Catch: java.lang.Throwable -> L68
            r8.sendApplyNotifications()     // Catch: java.lang.Throwable -> L68
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2e
        L61:
            kotlin.r2 r8 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L68
            r0 = 0
            kotlinx.coroutines.channels.s.b(r4, r0)
            return r8
        L68:
            r8 = move-exception
            r3 = r4
            goto L6c
        L6b:
            r8 = move-exception
        L6c:
            throw r8     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            kotlinx.coroutines.channels.s.b(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
