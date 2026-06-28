package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.u;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0019\b\u0004\u0012\u0006\u00107\u001a\u00020+\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0006\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0007H&J$\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\n\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0011J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0011J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0000H ¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H ¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0002H ¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0002H\u0010¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0002H\u0010¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010*\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010\u001fJ\u000f\u0010.\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00107\u001a\u00020+2\u0006\u00106\u001a\u00020+8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010-\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bB\u00108\u0012\u0004\bC\u0010\u001fR$\u0010G\u001a\u00020+2\u0006\u0010D\u001a\u00020+8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bE\u0010-\"\u0004\bF\u0010;R\u0014\u0010J\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010?R\u0015\u0010N\u001a\u00020\u00078À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010?R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\"\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048 X \u0004¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u001c\u0010V\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010S8 X \u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0001\u0004Z[\\]¨\u0006^"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "Lkotlin/r2;", "dispose", "Lkotlin/Function1;", "readObserver", "takeNestedSnapshot", "", "hasPendingChanges", "T", "Lkotlin/Function0;", "block", "enter", "(Lv3/a;)Ljava/lang/Object;", "makeCurrent", "snapshot", "restoreCurrent", "unsafeEnter", "oldSnapshot", "unsafeLeave", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeAndReleasePinning$runtime_release", "closeAndReleasePinning", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotDisposed$runtime_release", "validateNotDisposed", "releasePinnedSnapshotLocked$runtime_release", "releasePinnedSnapshotLocked", "", "takeoverPinnedSnapshot$runtime_release", "()I", "takeoverPinnedSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "<set-?>", "id", "I", "getId", "setId$runtime_release", "(I)V", "disposed", "Z", "getDisposed$runtime_release", "()Z", "setDisposed$runtime_release", "(Z)V", "pinningTrackingHandle", "getPinningTrackingHandle$annotations", t0.b.f22420d, "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getReadOnly", "readOnly", "isPinned$runtime_release", "isPinned", "getReadObserver$runtime_release", "()Lv3/l;", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "modified", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2294:1\n1714#2:2295\n1714#2:2297\n82#3:2296\n82#3:2298\n1#4:2299\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n91#1:2295\n241#1:2297\n91#1:2296\n241#1:2298\n*E\n"})
/* loaded from: classes.dex */
public abstract class Snapshot {
    private boolean disposed;
    private int id;

    @l
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u001e\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J6\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J$\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\b¢\u0006\u0004\b\u0010\u0010\u000eJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0005H\u0001J6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0002\b\u0014H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0015\u0010\u000eJ&\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0016J\u001a\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u0003J\b\u0010\u001f\u001a\u00020\u001eH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\u0005H\u0001J\u0012\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0001R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "Lkotlin/Function1;", "Lkotlin/r2;", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeSnapshot", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "takeMutableSnapshot", "T", "Lkotlin/Function0;", "block", "global", "(Lv3/a;)Ljava/lang/Object;", "R", "withMutableSnapshot", "observe", "(Lv3/l;Lv3/l;Lv3/a;)Ljava/lang/Object;", "createNonObservableSnapshot", "Landroidx/compose/runtime/DisallowComposableCalls;", "withoutReadObservation", "Lkotlin/Function2;", "", "observer", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "registerApplyObserver", "registerGlobalWriteObserver", "notifyObjectsInitialized", "sendApplyNotifications", "", "openSnapshotCount", "removeCurrent", "previous", "restoreCurrent", "getCurrent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "current", "", "isApplyObserverNotificationPending", "()Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2294:1\n1#2:2295\n129#3,5:2296\n129#3,5:2301\n129#3,5:2306\n1714#4:2311\n1714#4:2313\n1714#4:2315\n1714#4:2317\n1714#4:2319\n82#5:2312\n82#5:2314\n82#5:2316\n82#5:2318\n82#5:2320\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n439#1:2296,5\n476#1:2301,5\n498#1:2306,5\n514#1:2311\n541#1:2313\n579#1:2315\n518#1:2317\n546#1:2319\n514#1:2312\n541#1:2314\n579#1:2316\n518#1:2318\n546#1:2320\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, v3.l lVar, v3.l lVar2, v3.a aVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                lVar = null;
            }
            if ((i5 & 2) != 0) {
                lVar2 = null;
            }
            return companion.observe(lVar, lVar2, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$6(p pVar) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(u.n4(SnapshotKt.access$getApplyObservers$p(), pVar));
                r2 r2Var = r2.f19517a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$9(v3.l lVar) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(u.n4(SnapshotKt.access$getGlobalWriteObservers$p(), lVar));
                r2 r2Var = r2.f19517a;
            }
            SnapshotKt.access$advanceGlobalSnapshot();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, v3.l lVar, v3.l lVar2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                lVar = null;
            }
            if ((i5 & 2) != 0) {
                lVar2 = null;
            }
            return companion.takeMutableSnapshot(lVar, lVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, v3.l lVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                lVar = null;
            }
            return companion.takeSnapshot(lVar);
        }

        @l
        @a1
        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.access$getThreadSnapshot$p().get(), null, false, 6, null);
        }

        @l
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final <T> T global(@l v3.a<? extends T> aVar) {
            Snapshot removeCurrent = removeCurrent();
            T invoke = aVar.invoke();
            Snapshot.Companion.restoreCurrent(removeCurrent);
            return invoke;
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.access$getPendingApplyObserverCount$p().get() > 0;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2, @l v3.a<? extends T> aVar) {
            MutableSnapshot mutableSnapshot;
            Snapshot transparentObserverMutableSnapshot;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                if (lVar == null) {
                    return aVar.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(lVar);
            } else {
                if (snapshot instanceof MutableSnapshot) {
                    mutableSnapshot = (MutableSnapshot) snapshot;
                } else {
                    mutableSnapshot = null;
                }
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(mutableSnapshot, lVar, lVar2, true, false);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    return aVar.invoke();
                } finally {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return u.S5(SnapshotKt.access$getOpenSnapshots$p()).size();
        }

        @l
        public final ObserverHandle registerApplyObserver(@l final p<? super Set<? extends Object>, ? super Snapshot, r2> pVar) {
            SnapshotKt.access$advanceGlobalSnapshot(SnapshotKt.access$getEmptyLambda$p());
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(u.B4(SnapshotKt.access$getApplyObservers$p(), pVar));
                r2 r2Var = r2.f19517a;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.a
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$6(p.this);
                }
            };
        }

        @l
        public final ObserverHandle registerGlobalWriteObserver(@l final v3.l<Object, r2> lVar) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(u.B4(SnapshotKt.access$getGlobalWriteObservers$p(), lVar));
                r2 r2Var = r2.f19517a;
            }
            SnapshotKt.access$advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.b
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$9(v3.l.this);
                }
            };
        }

        @a1
        @m
        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(null);
            }
            return snapshot;
        }

        @a1
        public final void restoreCurrent(@m Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
            }
        }

        public final void sendApplyNotifications() {
            boolean z4;
            synchronized (SnapshotKt.getLock()) {
                IdentityArraySet<StateObject> modified$runtime_release = ((GlobalSnapshot) SnapshotKt.access$getCurrentGlobalSnapshot$p().get()).getModified$runtime_release();
                z4 = false;
                if (modified$runtime_release != null) {
                    if (modified$runtime_release.isNotEmpty()) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                SnapshotKt.access$advanceGlobalSnapshot();
            }
        }

        @l
        public final MutableSnapshot takeMutableSnapshot(@m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2) {
            MutableSnapshot mutableSnapshot;
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            if (currentSnapshot instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) currentSnapshot;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null && (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2)) != null) {
                return takeNestedMutableSnapshot;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        @l
        public final Snapshot takeSnapshot(@m v3.l<Object, r2> lVar) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(lVar);
        }

        public final <R> R withMutableSnapshot(@l v3.a<? extends R> aVar) {
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    R invoke = aVar.invoke();
                    kotlin.jvm.internal.i0.d(1);
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    kotlin.jvm.internal.i0.c(1);
                    takeMutableSnapshot$default.apply().check();
                    return invoke;
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            } finally {
                kotlin.jvm.internal.i0.d(1);
                takeMutableSnapshot$default.dispose();
                kotlin.jvm.internal.i0.c(1);
            }
        }

        public final <T> T withoutReadObservation(@l v3.a<? extends T> aVar) {
            Snapshot createNonObservableSnapshot = createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    return aVar.invoke();
                } finally {
                    kotlin.jvm.internal.i0.d(1);
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    kotlin.jvm.internal.i0.c(1);
                }
            } finally {
                kotlin.jvm.internal.i0.d(1);
                createNonObservableSnapshot.dispose();
                kotlin.jvm.internal.i0.c(1);
            }
        }
    }

    private Snapshot(int i5, SnapshotIdSet snapshotIdSet) {
        int i6;
        this.invalid = snapshotIdSet;
        this.id = i5;
        if (i5 != 0) {
            i6 = SnapshotKt.trackPinning(i5, getInvalid$runtime_release());
        } else {
            i6 = -1;
        }
        this.pinningTrackingHandle = i6;
    }

    public /* synthetic */ Snapshot(int i5, SnapshotIdSet snapshotIdSet, w wVar) {
        this(i5, snapshotIdSet);
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, v3.l lVar, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i5 & 1) != 0) {
            lVar = null;
        }
        return snapshot.takeNestedSnapshot(lVar);
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            r2 r2Var = r2.f19517a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(getId()));
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            r2 r2Var = r2.f19517a;
        }
    }

    public final <T> T enter(@l v3.a<? extends T> aVar) {
        Snapshot makeCurrent = makeCurrent();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            restoreCurrent(makeCurrent);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    @l
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    @m
    public abstract IdentityArraySet<StateObject> getModified$runtime_release();

    @m
    public abstract v3.l<Object, r2> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    @l
    public abstract Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    @m
    public abstract v3.l<Object, r2> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    @a1
    @m
    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        SnapshotKt.access$getThreadSnapshot$p().set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo3352nestedActivated$runtime_release(@l Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo3353nestedDeactivated$runtime_release(@l Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo3354recordModified$runtime_release(@l StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i5 = this.pinningTrackingHandle;
        if (i5 >= 0) {
            SnapshotKt.releasePinningLocked(i5);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    @a1
    public void restoreCurrent(@m Snapshot snapshot) {
        SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z4) {
        this.disposed = z4;
    }

    public void setId$runtime_release(int i5) {
        this.id = i5;
    }

    public void setInvalid$runtime_release(@l SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setWriteCount$runtime_release(int i5) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    @l
    public abstract Snapshot takeNestedSnapshot(@m v3.l<Object, r2> lVar);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i5 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i5;
    }

    @ExperimentalComposeApi
    @m
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(@m Snapshot snapshot) {
        boolean z4;
        if (SnapshotKt.access$getThreadSnapshot$p().get() == this) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            restoreCurrent(snapshot);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void validateNotDisposed$runtime_release() {
        if (!(!this.disposed)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
