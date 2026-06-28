package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.p;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "frameTime", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", "invoke", "(J)Lkotlinx/coroutines/p;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n46#2,5:1565\n46#2,3:1570\n50#2:1599\n82#3:1573\n82#3:1598\n33#4,6:1574\n33#4,6:1580\n33#4,6:1586\n33#4,6:1592\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n882#1:1565,5\n892#1:1570,3\n892#1:1599\n897#1:1573\n930#1:1598\n898#1:1574,6\n900#1:1580,6\n908#1:1586,6\n923#1:1592,6\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runFrameLoop$2 extends n0 implements l<Long, p<? super r2>> {
    final /* synthetic */ ProduceFrameSignal $frameSignal;
    final /* synthetic */ List<ControlledComposition> $toApply;
    final /* synthetic */ List<ControlledComposition> $toRecompose;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runFrameLoop$2(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, ProduceFrameSignal produceFrameSignal) {
        super(1);
        this.this$0 = recomposer;
        this.$toRecompose = list;
        this.$toApply = list2;
        this.$frameSignal = produceFrameSignal;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ p<? super r2> invoke(Long l5) {
        return invoke(l5.longValue());
    }

    @m
    public final p<r2> invoke(long j5) {
        boolean hasBroadcastFrameClockAwaiters;
        Object beginSection;
        List list;
        int i5;
        List list2;
        p<r2> deriveStateLocked;
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
        List<ControlledComposition> list3 = this.$toRecompose;
        List<ControlledComposition> list4 = this.$toApply;
        ProduceFrameSignal produceFrameSignal = this.$frameSignal;
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer2.recordComposerModifications();
            synchronized (recomposer2.stateLock) {
                list = recomposer2.compositionsAwaitingApply;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    list4.add((ControlledComposition) list.get(i6));
                }
                list2 = recomposer2.compositionsAwaitingApply;
                list2.clear();
                List list5 = recomposer2.compositionInvalidations;
                int size2 = list5.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    list3.add((ControlledComposition) list5.get(i7));
                }
                recomposer2.compositionInvalidations.clear();
                produceFrameSignal.takeFrameRequestLocked();
                r2 r2Var2 = r2.f19517a;
            }
            IdentityArraySet identityArraySet = new IdentityArraySet();
            try {
                int size3 = list3.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    performRecompose = recomposer2.performRecompose(list3.get(i8), identityArraySet);
                    if (performRecompose != null) {
                        list4.add(performRecompose);
                    }
                }
                list3.clear();
                if (!list4.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                }
                try {
                    int size4 = list4.size();
                    for (i5 = 0; i5 < size4; i5++) {
                        list4.get(i5).applyChanges();
                    }
                    list4.clear();
                    synchronized (recomposer2.stateLock) {
                        deriveStateLocked = recomposer2.deriveStateLocked();
                    }
                    return deriveStateLocked;
                } catch (Throwable th) {
                    list4.clear();
                    throw th;
                }
            } catch (Throwable th2) {
                list3.clear();
                throw th2;
            }
        } finally {
        }
    }
}
