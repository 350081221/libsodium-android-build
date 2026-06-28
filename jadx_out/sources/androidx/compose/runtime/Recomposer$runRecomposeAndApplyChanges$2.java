package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {540, 551}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n82#2:1565\n33#3,6:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n533#1:1565\n534#1:1566,6\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends o implements q<s0, MonotonicFrameClock, d<? super r2>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1564:1\n46#2,5:1565\n46#2,3:1570\n50#2:1586\n82#3:1573\n82#3:1587\n82#3:1610\n33#4,6:1574\n33#4,6:1580\n33#4,6:1588\n33#4,6:1594\n33#4,6:1600\n1855#5,2:1606\n1855#5,2:1608\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2$1\n*L\n555#1:1565,5\n565#1:1570,3\n565#1:1586\n569#1:1573\n600#1:1587\n679#1:1610\n570#1:1574,6\n581#1:1580,6\n601#1:1588,6\n635#1:1594,6\n638#1:1600,6\n653#1:1606,2\n667#1:1608,2\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Long, r2> {
        final /* synthetic */ IdentityArraySet<ControlledComposition> $alreadyComposed;
        final /* synthetic */ IdentityArraySet<Object> $modifiedValues;
        final /* synthetic */ List<ControlledComposition> $toApply;
        final /* synthetic */ Set<ControlledComposition> $toComplete;
        final /* synthetic */ List<MovableContentStateReference> $toInsert;
        final /* synthetic */ Set<ControlledComposition> $toLateApply;
        final /* synthetic */ List<ControlledComposition> $toRecompose;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Recomposer recomposer, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2, List<ControlledComposition> list, List<MovableContentStateReference> list2, Set<ControlledComposition> set, List<ControlledComposition> list3, Set<ControlledComposition> set2) {
            super(1);
            this.this$0 = recomposer;
            this.$modifiedValues = identityArraySet;
            this.$alreadyComposed = identityArraySet2;
            this.$toRecompose = list;
            this.$toInsert = list2;
            this.$toLateApply = set;
            this.$toApply = list3;
            this.$toComplete = set2;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(long j5) {
            boolean hasBroadcastFrameClockAwaiters;
            Object beginSection;
            List performInsertValues;
            ControlledComposition performRecompose;
            BroadcastFrameClock broadcastFrameClock;
            hasBroadcastFrameClockAwaiters = this.this$0.getHasBroadcastFrameClockAwaiters();
            if (hasBroadcastFrameClockAwaiters) {
                Recomposer recomposer = this.this$0;
                Trace trace = Trace.INSTANCE;
                beginSection = trace.beginSection("Recomposer:animation");
                try {
                    broadcastFrameClock = recomposer.broadcastFrameClock;
                    broadcastFrameClock.sendFrame(j5);
                    Snapshot.Companion.sendApplyNotifications();
                    r2 r2Var = r2.f19517a;
                    trace.endSection(beginSection);
                } finally {
                }
            }
            Recomposer recomposer2 = this.this$0;
            IdentityArraySet<Object> identityArraySet = this.$modifiedValues;
            IdentityArraySet<ControlledComposition> identityArraySet2 = this.$alreadyComposed;
            List<ControlledComposition> list = this.$toRecompose;
            List<MovableContentStateReference> list2 = this.$toInsert;
            Set<ControlledComposition> set = this.$toLateApply;
            List<ControlledComposition> list3 = this.$toApply;
            Set<ControlledComposition> set2 = this.$toComplete;
            beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
            try {
                recomposer2.recordComposerModifications();
                synchronized (recomposer2.stateLock) {
                    List list4 = recomposer2.compositionInvalidations;
                    int size = list4.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        list.add((ControlledComposition) list4.get(i5));
                    }
                    recomposer2.compositionInvalidations.clear();
                    r2 r2Var2 = r2.f19517a;
                }
                identityArraySet.clear();
                identityArraySet2.clear();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    try {
                        try {
                            int size2 = list.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ControlledComposition controlledComposition = list.get(i6);
                                identityArraySet2.add(controlledComposition);
                                performRecompose = recomposer2.performRecompose(controlledComposition, identityArraySet);
                                if (performRecompose != null) {
                                    list3.add(performRecompose);
                                }
                            }
                            list.clear();
                            if (identityArraySet.isNotEmpty()) {
                                synchronized (recomposer2.stateLock) {
                                    List knownCompositions = recomposer2.getKnownCompositions();
                                    int size3 = knownCompositions.size();
                                    for (int i7 = 0; i7 < size3; i7++) {
                                        ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositions.get(i7);
                                        if (!identityArraySet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet)) {
                                            list.add(controlledComposition2);
                                        }
                                    }
                                    r2 r2Var3 = r2.f19517a;
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer2);
                                    while (!list2.isEmpty()) {
                                        performInsertValues = recomposer2.performInsertValues(list2, identityArraySet);
                                        b0.n0(set, performInsertValues);
                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer2);
                                    }
                                } catch (Exception e5) {
                                    Recomposer.processCompositionError$default(recomposer2, e5, null, true, 2, null);
                                    Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                                    return;
                                }
                            }
                        } catch (Exception e6) {
                            Recomposer.processCompositionError$default(recomposer2, e6, null, true, 2, null);
                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                            list.clear();
                            return;
                        }
                    } catch (Throwable th) {
                        list.clear();
                        throw th;
                    }
                }
                if (!list3.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    try {
                        int size4 = list3.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            set2.add(list3.get(i8));
                        }
                        int size5 = list3.size();
                        for (int i9 = 0; i9 < size5; i9++) {
                            list3.get(i9).applyChanges();
                        }
                    } catch (Exception e7) {
                        Recomposer.processCompositionError$default(recomposer2, e7, null, false, 6, null);
                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                        return;
                    } finally {
                        list3.clear();
                    }
                }
                if (!set.isEmpty()) {
                    try {
                        try {
                            b0.n0(set2, set);
                            Iterator<T> it = set.iterator();
                            while (it.hasNext()) {
                                ((ControlledComposition) it.next()).applyLateChanges();
                            }
                        } catch (Exception e8) {
                            Recomposer.processCompositionError$default(recomposer2, e8, null, false, 6, null);
                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                            set.clear();
                            return;
                        }
                    } finally {
                        set.clear();
                    }
                }
                try {
                    if (!set2.isEmpty()) {
                        try {
                            Iterator<T> it2 = set2.iterator();
                            while (it2.hasNext()) {
                                ((ControlledComposition) it2.next()).changesApplied();
                            }
                        } catch (Exception e9) {
                            Recomposer.processCompositionError$default(recomposer2, e9, null, false, 6, null);
                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet, identityArraySet2);
                            set2.clear();
                            return;
                        }
                    }
                    synchronized (recomposer2.stateLock) {
                        recomposer2.deriveStateLocked();
                    }
                    Snapshot.Companion.notifyObjectsInitialized();
                    identityArraySet2.clear();
                    identityArraySet.clear();
                    recomposer2.compositionsRemoved = null;
                    r2 r2Var4 = r2.f19517a;
                } finally {
                    set2.clear();
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, d<? super Recomposer$runRecomposeAndApplyChanges$2> dVar) {
        super(3, dVar);
        this.this$0 = recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, Set<ControlledComposition> set, Set<ControlledComposition> set2, IdentityArraySet<Object> identityArraySet, IdentityArraySet<ControlledComposition> identityArraySet2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        identityArraySet.clear();
        identityArraySet2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.add((MovableContentStateReference) list2.get(i5));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            r2 r2Var = r2.f19517a;
        }
    }

    @Override // v3.q
    @m
    public final Object invoke(@p4.l s0 s0Var, @p4.l MonotonicFrameClock monotonicFrameClock, @m d<? super r2> dVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, dVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0146  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0120 -> B:6:0x0127). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0131 -> B:7:0x0143). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
