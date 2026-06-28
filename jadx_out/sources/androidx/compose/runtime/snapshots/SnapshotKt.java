package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.a1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.y;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000°\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a$\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a@\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u00020\b2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a8\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b \u0010!\u001a\b\u0010 \u001a\u00020\u0006H\u0002\u001a<\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\bH\u0002\u001a \u0010'\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010'\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010+\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020(2\u0006\u0010*\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a#\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b+\u0010/\u001a+\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\b+\u00100\u001a\b\u00102\u001a\u000201H\u0002\u001a\u0012\u00103\u001a\u0004\u0018\u00010(2\u0006\u0010.\u001a\u00020-H\u0002\u001a\u0010\u00104\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0002\u001a!\u00106\u001a\u00020(*\u00020(2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e0\u000bH\u0082\b\u001a\b\u00107\u001a\u00020\u0006H\u0002\u001a\u0010\u00108\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0002\u001a-\u00109\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\bH\u0001¢\u0006\u0004\b9\u00100\u001a5\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\b2\u0006\u0010:\u001a\u00028\u0000H\u0000¢\u0006\u0004\b;\u0010<\u001a-\u0010=\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\bH\u0000¢\u0006\u0004\b=\u00100\u001a-\u0010>\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b>\u00100\u001a%\u0010?\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(*\u00028\u00002\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b?\u0010/\u001a\u0018\u0010@\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0001\u001aM\u0010C\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020(\"\u0004\b\u0001\u0010A*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\bBH\u0086\b¢\u0006\u0004\bC\u0010D\u001aE\u0010C\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020(\"\u0004\b\u0001\u0010A*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\bBH\u0086\b¢\u0006\u0004\bC\u0010E\u001aM\u0010F\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020(\"\u0004\b\u0001\u0010A*\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u0010:\u001a\u00028\u00002\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\bBH\u0080\b¢\u0006\u0004\bF\u0010G\u001a.\u0010L\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010K2\u0006\u0010\t\u001a\u00020H2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\u0002H\u0002\u001a\b\u0010M\u001a\u000201H\u0002\u001a)\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(2\u0006\u0010*\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\bH\u0001¢\u0006\u0004\bN\u0010O\u001a!\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020(2\u0006\u0010*\u001a\u00028\u0000H\u0001¢\u0006\u0004\bN\u0010P\u001aG\u0010Q\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020(\"\u0004\b\u0001\u0010A*\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020\u0000H\u0000\"/\u0010V\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W\"\u0014\u0010X\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010Y\"\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\\" \u0010]\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010b\u001a\u0004\b_\u0010`\"\u0016\u0010c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d\"\u0016\u0010e\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010Y\"\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h\"\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020-0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k\"4\u0010o\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060m0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010p\"(\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010p\"4\u0010v\u001a\"\u0012\f\u0012\n t*\u0004\u0018\u00010s0s0rj\u0010\u0012\f\u0012\n t*\u0004\u0018\u00010s0s`u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w\" \u0010x\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b|\u0010b\u001a\u0004\bz\u0010{\"\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "handle", "Lkotlin/r2;", "releasePinningLocked", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "parentObserver", "mergeReadObserver", "mergedReadObserver", "writeObserver", "mergedWriteObserver", "T", "Lkotlin/Function0;", "block", "sync", "(Lv3/a;)Ljava/lang/Object;", "previousGlobalSnapshot", "Lkotlin/v0;", "name", "takeNewGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lv3/l;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lv3/l;)Ljava/lang/Object;", "takeNewSnapshot", "(Lv3/l;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "candidateSnapshot", "valid", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "r", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "usedLocked", "overwriteUnusedRecordsLocked", "predicate", "findYoungestOr", "checkAndOverwriteUnusedRecordsLocked", "processForUnusedRecordsLocked", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newWritableRecordLocked", "newOverwritableRecordLocked", "notifyWrite", "R", "Lkotlin/u;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lv3/l;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lv3/l;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lv3/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "reportReadonlySnapshotWrite", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lv3/l;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "until", "addRange", "emptyLambda", "Lv3/l;", "INVALID_SNAPSHOT", "I", "Landroidx/compose/runtime/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "()V", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "extraStateObjects", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer$annotations", "Landroidx/compose/runtime/AtomicInt;", "pendingApplyObserverCount", "Landroidx/compose/runtime/AtomicInt;", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 5 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#1:2295\n1714#1:2298\n1714#1:2300\n1714#1:2308\n1714#1:2317\n1714#1:2319\n2033#1,9:2321\n1714#1:2358\n1714#1:2360\n1714#1:2362\n1714#1:2365\n1714#1:2367\n1714#1:2376\n82#2:2296\n82#2:2297\n82#2:2299\n82#2:2301\n82#2:2309\n82#2:2318\n82#2:2320\n82#2:2359\n82#2:2361\n82#2:2363\n82#2:2366\n82#2:2368\n82#2:2377\n33#3,6:2302\n108#4,7:2310\n108#4,7:2369\n125#5,28:2330\n1#6:2364\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n611#1:2295\n1774#1:2298\n1800#1:2300\n1822#1:2308\n1852#1:2317\n1905#1:2319\n2015#1:2321,9\n2088#1:2358\n2097#1:2360\n2165#1:2362\n2177#1:2365\n2205#1:2367\n2270#1:2376\n611#1:2296\n1714#1:2297\n1774#1:2299\n1800#1:2301\n1822#1:2309\n1852#1:2318\n1905#1:2320\n2088#1:2359\n2097#1:2361\n2165#1:2363\n2177#1:2366\n2205#1:2368\n2270#1:2377\n1814#1:2302,6\n1824#1:2310,7\n2228#1:2369,7\n2045#1:2330,28\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;

    @l
    private static List<? extends p<? super Set<? extends Object>, ? super Snapshot, r2>> applyObservers;

    @l
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;

    @l
    private static final SnapshotWeakSet<StateObject> extraStateObjects;

    @l
    private static List<? extends v3.l<Object, r2>> globalWriteObservers;
    private static int nextSnapshotId;

    @l
    private static SnapshotIdSet openSnapshots;

    @l
    private static AtomicInt pendingApplyObserverCount;

    @l
    private static final SnapshotDoubleIndexHeap pinningTable;

    @l
    private static final Snapshot snapshotInitializer;

    @l
    private static final v3.l<SnapshotIdSet, r2> emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;

    @l
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();

    @l
    private static final Object lock = new Object();

    static {
        List<? extends p<? super Set<? extends Object>, ? super Snapshot, r2>> E;
        List<? extends v3.l<Object, r2>> E2;
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        E = w.E();
        applyObservers = E;
        E2 = w.E();
        globalWriteObservers = E2;
        int i5 = nextSnapshotId;
        nextSnapshotId = i5 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i5, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        snapshotInitializer = atomicReference.get();
        pendingApplyObserverCount = new AtomicInt(0);
    }

    @l
    public static final SnapshotIdSet addRange(@l SnapshotIdSet snapshotIdSet, int i5, int i6) {
        while (i5 < i6) {
            snapshotIdSet = snapshotIdSet.set(i5);
            i5++;
        }
        return snapshotIdSet;
    }

    public static final <T> T advanceGlobalSnapshot(v3.l<? super SnapshotIdSet, ? extends T> lVar) {
        GlobalSnapshot globalSnapshot;
        IdentityArraySet<StateObject> modified$runtime_release;
        T t5;
        Snapshot snapshot = snapshotInitializer;
        l0.n(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            globalSnapshot = currentGlobalSnapshot.get();
            modified$runtime_release = globalSnapshot.getModified$runtime_release();
            if (modified$runtime_release != null) {
                pendingApplyObserverCount.add(1);
            }
            t5 = (T) takeNewGlobalSnapshot(globalSnapshot, lVar);
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends p<? super Set<? extends Object>, ? super Snapshot, r2>> list = applyObservers;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    list.get(i5).invoke(modified$runtime_release, globalSnapshot);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            checkAndOverwriteUnusedRecordsLocked();
            if (modified$runtime_release != null) {
                Object[] values = modified$runtime_release.getValues();
                int size2 = modified$runtime_release.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = values[i6];
                    l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    processForUnusedRecordsLocked((StateObject) obj);
                }
                r2 r2Var = r2.f19517a;
            }
        }
        return t5;
    }

    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            StateObject stateObject = null;
            if (i5 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i5];
            if (weakReference != null) {
                stateObject = weakReference.get();
            }
            if (stateObject != null && !(!overwriteUnusedRecordsLocked(stateObject))) {
                if (i6 != i5) {
                    snapshotWeakSet.getValues$runtime_release()[i6] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i6] = snapshotWeakSet.getHashes$runtime_release()[i5];
                }
                i6++;
            }
            i5++;
        }
        for (int i7 = i6; i7 < size$runtime_release; i7++) {
            snapshotWeakSet.getValues$runtime_release()[i7] = null;
            snapshotWeakSet.getHashes$runtime_release()[i7] = 0;
        }
        if (i6 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i6);
        }
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, v3.l<Object, r2> lVar, boolean z4) {
        MutableSnapshot mutableSnapshot;
        boolean z5 = snapshot instanceof MutableSnapshot;
        if (!z5 && snapshot != null) {
            return new TransparentObserverSnapshot(snapshot, lVar, false, z4);
        }
        if (z5) {
            mutableSnapshot = (MutableSnapshot) snapshot;
        } else {
            mutableSnapshot = null;
        }
        return new TransparentObserverMutableSnapshot(mutableSnapshot, lVar, null, false, z4);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, v3.l lVar, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, lVar, z4);
    }

    @l
    @a1
    public static final <T extends StateRecord> T current(@l T t5, @l Snapshot snapshot) {
        T t6 = (T) readable(t5, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t6 != null) {
            return t6;
        }
        readError();
        throw new y();
    }

    @l
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        return snapshot == null ? currentGlobalSnapshot.get() : snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, v3.l<? super StateRecord, Boolean> lVar) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (lVar.invoke(stateRecord).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime_release();
        }
        return stateRecord2;
    }

    @l
    public static final Object getLock() {
        return lock;
    }

    @a1
    public static /* synthetic */ void getLock$annotations() {
    }

    @l
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    @a1
    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    public static final v3.l<Object, r2> mergedReadObserver(v3.l<Object, r2> lVar, v3.l<Object, r2> lVar2, boolean z4) {
        if (!z4) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && !l0.g(lVar, lVar2)) {
            return new SnapshotKt$mergedReadObserver$1(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static /* synthetic */ v3.l mergedReadObserver$default(v3.l lVar, v3.l lVar2, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        return mergedReadObserver(lVar, lVar2, z4);
    }

    public static final v3.l<Object, r2> mergedWriteObserver(v3.l<Object, r2> lVar, v3.l<Object, r2> lVar2) {
        if (lVar != null && lVar2 != null && !l0.g(lVar, lVar2)) {
            return new SnapshotKt$mergedWriteObserver$1(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    @l
    public static final <T extends StateRecord> T newOverwritableRecordLocked(@l T t5, @l StateObject stateObject) {
        T t6 = (T) usedLocked(stateObject);
        if (t6 != null) {
            t6.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t6;
        }
        T t7 = (T) t5.create();
        t7.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t7.setNext$runtime_release(stateObject.getFirstStateRecord());
        l0.n(t7, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        stateObject.prependStateRecord(t7);
        l0.n(t7, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t7;
    }

    @l
    public static final <T extends StateRecord> T newWritableRecord(@l T t5, @l StateObject stateObject, @l Snapshot snapshot) {
        T t6;
        synchronized (getLock()) {
            t6 = (T) newWritableRecordLocked(t5, stateObject, snapshot);
        }
        return t6;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t5, StateObject stateObject, Snapshot snapshot) {
        T t6 = (T) newOverwritableRecordLocked(t5, stateObject);
        t6.assign(t5);
        t6.setSnapshotId$runtime_release(snapshot.getId());
        return t6;
    }

    @a1
    public static final void notifyWrite(@l Snapshot snapshot, @l StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        v3.l<Object, r2> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord readable;
        IdentityArraySet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        Object[] values = modified$runtime_release.getValues();
        int size = modified$runtime_release.size();
        HashMap hashMap = null;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = values[i5];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            StateObject stateObject = (StateObject) obj;
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord readable2 = readable(firstStateRecord, id, snapshotIdSet);
            if (readable2 != null && (readable = readable(firstStateRecord, id, or)) != null && !l0.g(readable2, readable)) {
                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (readable3 != null) {
                    StateRecord mergeRecords = stateObject.mergeRecords(readable, readable2, readable3);
                    if (mergeRecords == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(readable2, mergeRecords);
                    hashMap = hashMap;
                } else {
                    readError();
                    throw new y();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends StateRecord, R> R overwritable(@l T t5, @l StateObject stateObject, @l T t6, @l v3.l<? super T, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(overwritableRecord(t5, stateObject, current, t6));
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        notifyWrite(current, stateObject);
        return invoke;
    }

    @l
    public static final <T extends StateRecord> T overwritableRecord(@l T t5, @l StateObject stateObject, @l Snapshot snapshot, @l T t6) {
        T t7;
        if (snapshot.getReadOnly()) {
            snapshot.mo3354recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t6.getSnapshotId$runtime_release() == id) {
            return t6;
        }
        synchronized (getLock()) {
            t7 = (T) newOverwritableRecordLocked(t5, stateObject);
        }
        t7.setSnapshotId$runtime_release(id);
        snapshot.mo3354recordModified$runtime_release(stateObject);
        return t7;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        boolean z4;
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i5 = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release < lowestOrDefault) {
                    if (stateRecord2 == null) {
                        i5++;
                        stateRecord2 = firstStateRecord;
                    } else {
                        if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                            stateRecord = stateRecord2;
                            stateRecord2 = firstStateRecord;
                        } else {
                            stateRecord = firstStateRecord;
                        }
                        if (stateRecord3 == null) {
                            stateRecord3 = stateObject.getFirstStateRecord();
                            StateRecord stateRecord4 = stateRecord3;
                            while (true) {
                                if (stateRecord3 != null) {
                                    if (stateRecord3.getSnapshotId$runtime_release() >= lowestOrDefault) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        break;
                                    }
                                    if (stateRecord4.getSnapshotId$runtime_release() < stateRecord3.getSnapshotId$runtime_release()) {
                                        stateRecord4 = stateRecord3;
                                    }
                                    stateRecord3 = stateRecord3.getNext$runtime_release();
                                } else {
                                    stateRecord3 = stateRecord4;
                                    break;
                                }
                            }
                        }
                        stateRecord2.setSnapshotId$runtime_release(0);
                        stateRecord2.assign(stateRecord3);
                        stateRecord2 = stateRecord;
                    }
                } else {
                    i5++;
                }
            }
        }
        if (i5 <= 1) {
            return false;
        }
        return true;
    }

    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends StateRecord> T readable(T t5, int i5, SnapshotIdSet snapshotIdSet) {
        T t6 = null;
        while (t5 != null) {
            if (valid(t5, i5, snapshotIdSet) && (t6 == null || t6.getSnapshotId$runtime_release() < t5.getSnapshotId$runtime_release())) {
                t6 = t5;
            }
            t5 = (T) t5.getNext$runtime_release();
        }
        if (t6 != null) {
            return t6;
        }
        return null;
    }

    public static final void releasePinningLocked(int i5) {
        pinningTable.remove(i5);
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @a1
    public static final <T> T sync(@l v3.a<? extends T> aVar) {
        T invoke;
        synchronized (getLock()) {
            try {
                invoke = aVar.invoke();
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        return invoke;
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, v3.l<? super SnapshotIdSet, ? extends T> lVar) {
        T invoke = lVar.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i5 = nextSnapshotId;
            nextSnapshotId = i5 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i5, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i5);
            r2 r2Var = r2.f19517a;
        }
        return invoke;
    }

    public static final <T extends Snapshot> T takeNewSnapshot(v3.l<? super SnapshotIdSet, ? extends T> lVar) {
        return (T) advanceGlobalSnapshot(new SnapshotKt$takeNewSnapshot$1(lVar));
    }

    public static final int trackPinning(int i5, @l SnapshotIdSet snapshotIdSet) {
        int add;
        int lowest = snapshotIdSet.lowest(i5);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowestOrDefault, empty)) {
                if (stateRecord == null) {
                    stateRecord = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId$runtime_release() >= stateRecord.getSnapshotId$runtime_release()) {
                        return stateRecord;
                    }
                    return firstStateRecord;
                }
            }
        }
        return null;
    }

    private static final boolean valid(int i5, int i6, SnapshotIdSet snapshotIdSet) {
        return (i6 == 0 || i6 > i5 || snapshotIdSet.get(i6)) ? false : true;
    }

    public static final void validateOpen(Snapshot snapshot) {
        MutableSnapshot mutableSnapshot;
        Object obj;
        int lowestOrDefault;
        if (!openSnapshots.get(snapshot.getId())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Snapshot is not open: id=");
            sb.append(snapshot.getId());
            sb.append(", disposed=");
            sb.append(snapshot.getDisposed$runtime_release());
            sb.append(", applied=");
            if (snapshot instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) snapshot;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null) {
                obj = Boolean.valueOf(mutableSnapshot.getApplied$runtime_release());
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (getLock()) {
                lowestOrDefault = pinningTable.lowestOrDefault(-1);
            }
            sb.append(lowestOrDefault);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(@l T t5, @l v3.l<? super T, ? extends R> lVar) {
        return lVar.invoke(current(t5));
    }

    public static final <T extends StateRecord, R> R writable(@l T t5, @l StateObject stateObject, @l v3.l<? super T, ? extends R> lVar) {
        Snapshot current;
        R invoke;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = lVar.invoke(writableRecord(t5, stateObject, current));
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        notifyWrite(current, stateObject);
        return invoke;
    }

    @l
    @a1
    public static final <T extends StateRecord> T writableRecord(@l T t5, @l StateObject stateObject, @l Snapshot snapshot) {
        if (snapshot.getReadOnly()) {
            snapshot.mo3354recordModified$runtime_release(stateObject);
        }
        T t6 = (T) readable(t5, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t6 != null) {
            if (t6.getSnapshotId$runtime_release() == snapshot.getId()) {
                return t6;
            }
            T t7 = (T) newWritableRecord(t6, stateObject, snapshot);
            snapshot.mo3354recordModified$runtime_release(stateObject);
            return t7;
        }
        readError();
        throw new y();
    }

    @l
    @a1
    public static final <T extends StateRecord> T current(@l T t5) {
        T t6;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t7 = (T) readable(t5, current.getId(), current.getInvalid$runtime_release());
        if (t7 != null) {
            return t7;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t6 = (T) readable(t5, current2.getId(), current2.getInvalid$runtime_release());
        }
        if (t6 != null) {
            return t6;
        }
        readError();
        throw new y();
    }

    private static final boolean valid(StateRecord stateRecord, int i5, SnapshotIdSet snapshotIdSet) {
        return valid(i5, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    @l
    public static final <T extends StateRecord> T readable(@l T t5, @l StateObject stateObject) {
        T t6;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        v3.l<Object, r2> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t7 = (T) readable(t5, current.getId(), current.getInvalid$runtime_release());
        if (t7 != null) {
            return t7;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            l0.n(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t6 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid$runtime_release());
            if (t6 == null) {
                readError();
                throw new y();
            }
        }
        return t6;
    }

    public static final <T extends StateRecord, R> R writable(@l T t5, @l StateObject stateObject, @l Snapshot snapshot, @l v3.l<? super T, ? extends R> lVar) {
        R invoke;
        synchronized (getLock()) {
            try {
                invoke = lVar.invoke(writableRecord(t5, stateObject, snapshot));
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        notifyWrite(snapshot, stateObject);
        return invoke;
    }

    @l
    public static final <T extends StateRecord> T readable(@l T t5, @l StateObject stateObject, @l Snapshot snapshot) {
        v3.l<Object, r2> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t6 = (T) readable(t5, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t6 != null) {
            return t6;
        }
        readError();
        throw new y();
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(SnapshotKt$advanceGlobalSnapshot$3.INSTANCE);
    }
}
