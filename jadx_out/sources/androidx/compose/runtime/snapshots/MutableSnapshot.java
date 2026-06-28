package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b \b\u0017\u0018\u0000 s2\u00020\u0001:\u0001sBE\b\u0000\u0012\u0006\u0010/\u001a\u00020\u001f\u0012\u0006\u0010p\u001a\u00020$\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\bq\u0010rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J8\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u001e\u0010\u0011\u001a\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u001d\u0010\u0019J5\u0010(\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J$\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0080\b¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b,\u0010\u0019J\u0017\u00102\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001fH\u0000¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u001fH\u0000¢\u0006\u0004\b3\u00101J\u0017\u00109\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u0017\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020$H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010B\u001a\u00020\u00022\u0006\u0010?\u001a\u00020>H\u0010¢\u0006\u0004\b@\u0010AR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010ER(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bF\u0010ER\"\u0010G\u001a\u00020\u001f8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u00101R:\u0010N\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010L2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010L8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR*\u0010U\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010[\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010<R\"\u0010`\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u00108R\u0016\u0010:\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010HR\"\u0010e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010hR\u0014\u0010o\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006t"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Lkotlin/r2;", "validateNotApplied", "validateNotAppliedOrPinned", "abandon", "releasePreviouslyPinnedSnapshotsLocked", "", "hasPendingChanges", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "takeNestedMutableSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "takeNestedSnapshot", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "innerApplyLocked$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", "T", "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lv3/a;)Ljava/lang/Object;", "advance", "id", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "Lv3/l;", "getReadObserver$runtime_release", "()Lv3/l;", "getWriteObserver$runtime_release", "writeCount", "I", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "Landroidx/compose/runtime/collection/IdentityArraySet;", "<set-?>", "modified", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setModified", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "", "merged", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousPinnedSnapshots", "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "applied", "Z", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lv3/l;Lv3/l;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2294:1\n978#1,2:2295\n984#1,3:2299\n987#1,6:2304\n978#1,2:2346\n984#1,3:2350\n987#1,6:2355\n978#1,9:2392\n987#1,6:2403\n1714#2:2297\n1714#2:2302\n1714#2:2310\n1714#2:2324\n1714#2:2348\n1714#2:2353\n1714#2:2381\n1714#2:2390\n1714#2:2401\n1714#2:2409\n1714#2:2411\n82#3:2298\n82#3:2303\n82#3:2311\n82#3:2325\n82#3:2349\n82#3:2354\n82#3:2382\n82#3:2391\n82#3:2402\n82#3:2410\n82#3:2412\n33#4,6:2312\n33#4,6:2318\n33#4,6:2340\n33#4,4:2377\n38#4:2383\n33#4,6:2384\n108#5,7:2326\n108#5,7:2333\n108#5,7:2363\n108#5,7:2370\n1#6:2361\n192#7:2362\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n676#1:2295,2\n676#1:2299,3\n676#1:2304,6\n808#1:2346,2\n808#1:2350,3\n808#1:2355,6\n995#1:2392,9\n995#1:2403,6\n677#1:2297\n676#1:2302\n728#1:2310\n781#1:2324\n809#1:2348\n808#1:2353\n961#1:2381\n986#1:2390\n995#1:2401\n998#1:2409\n1022#1:2411\n677#1:2298\n676#1:2303\n728#1:2311\n781#1:2325\n809#1:2349\n808#1:2354\n961#1:2382\n986#1:2391\n995#1:2402\n998#1:2410\n1022#1:2412\n767#1:2312,6\n773#1:2318,6\n786#1:2340,6\n958#1:2377,4\n958#1:2383\n969#1:2384,6\n784#1:2326,7\n785#1:2333,7\n873#1:2363,7\n908#1:2370,7\n855#1:2362\n*E\n"})
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;

    @m
    private List<? extends StateObject> merged;

    @m
    private IdentityArraySet<StateObject> modified;

    @l
    private SnapshotIdSet previousIds;

    @l
    private int[] previousPinnedSnapshots;

    @m
    private final v3.l<Object, r2> readObserver;
    private int snapshots;
    private int writeCount;

    @m
    private final v3.l<Object, r2> writeObserver;

    @l
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final int[] EmptyIntArray = new int[0];

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "()V", "EmptyIntArray", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public MutableSnapshot(int i5, @l SnapshotIdSet snapshotIdSet, @m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2) {
        super(i5, snapshotIdSet, null);
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    private final void abandon() {
        boolean T1;
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied();
            setModified(null);
            int id = getId();
            Object[] values = modified$runtime_release.getValues();
            int size = modified$runtime_release.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = values[i5];
                l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (StateRecord firstStateRecord = ((StateObject) obj).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
                    if (firstStateRecord.getSnapshotId$runtime_release() != id) {
                        T1 = e0.T1(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId$runtime_release()));
                        if (!T1) {
                        }
                    }
                    firstStateRecord.setSnapshotId$runtime_release(0);
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i5 = 0; i5 < length; i5++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i5]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, v3.l lVar, v3.l lVar2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i5 & 1) != 0) {
            lVar = null;
        }
        if ((i5 & 2) != 0) {
            lVar2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2);
    }

    private final void validateNotApplied() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    private final void validateNotAppliedOrPinned() {
        boolean z4;
        boolean z5 = true;
        if (this.applied) {
            if (((Snapshot) this).pinningTrackingHandle >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                z5 = false;
            }
        }
        if (z5) {
        } else {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    public final <T> T advance$runtime_release(@l v3.a<? extends T> aVar) {
        int i5;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        T invoke = aVar.invoke();
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    i5 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i5 + 1;
                    setId$runtime_release(i5);
                    snapshotIdSet = SnapshotKt.openSnapshots;
                    SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
                    r2 r2Var = r2.f19517a;
                    kotlin.jvm.internal.i0.d(1);
                } catch (Throwable th) {
                    kotlin.jvm.internal.i0.d(1);
                    kotlin.jvm.internal.i0.c(1);
                    throw th;
                }
            }
            kotlin.jvm.internal.i0.c(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return invoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ab A[Catch: all -> 0x015d, TryCatch #1 {, blocks: (B:7:0x0036, B:9:0x003d, B:12:0x0044, B:17:0x006c, B:18:0x00b1, B:68:0x0085, B:70:0x009f, B:75:0x00ab), top: B:6:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            mo3353nestedDeactivated$runtime_release(this);
        }
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    @m
    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    @l
    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    @l
    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public v3.l<Object, r2> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @m
    public v3.l<Object, r2> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        r15 = androidx.compose.runtime.snapshots.SnapshotKt.readable(r11, getId(), r2);
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult innerApplyLocked$runtime_release(int r19, @p4.m java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> r20, @p4.l androidx.compose.runtime.snapshots.SnapshotIdSet r21) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.innerApplyLocked$runtime_release(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo3352nestedActivated$runtime_release(@l Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo3353nestedDeactivated$runtime_release(@l Snapshot snapshot) {
        boolean z4;
        int i5 = this.snapshots;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i6 = i5 - 1;
            this.snapshots = i6;
            if (i6 == 0 && !this.applied) {
                abandon();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("no pending nested snapshots".toString());
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (!this.applied && !getDisposed$runtime_release()) {
            advance$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo3354recordModified$runtime_release(@l StateObject stateObject) {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new IdentityArraySet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    public final void recordPrevious$runtime_release(int i5) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(i5);
            r2 r2Var = r2.f19517a;
        }
    }

    public final void recordPreviousList$runtime_release(@l SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
            r2 r2Var = r2.f19517a;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i5) {
        int[] q32;
        if (i5 >= 0) {
            q32 = o.q3(this.previousPinnedSnapshots, i5);
            this.previousPinnedSnapshots = q32;
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(@l int[] iArr) {
        boolean z4;
        boolean z5 = true;
        if (iArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            z5 = false;
        }
        if (!z5) {
            iArr = o.s3(iArr2, iArr);
        }
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z4) {
        this.applied = z4;
    }

    public final void setMerged$runtime_release(@m List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified(@m IdentityArraySet<StateObject> identityArraySet) {
        this.modified = identityArraySet;
    }

    public final void setPreviousIds$runtime_release(@l SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(@l int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i5) {
        this.writeCount = i5;
    }

    @l
    public MutableSnapshot takeNestedMutableSnapshot(@m v3.l<Object, r2> lVar, @m v3.l<Object, r2> lVar2) {
        int i5;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        v3.l mergedWriteObserver;
        int i6;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i5 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i5 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i5);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(i5));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid$runtime_release, getId() + 1, i5);
            v3.l mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(lVar, getReadObserver$runtime_release(), false, 4, null);
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(lVar2, getWriteObserver$runtime_release());
            nestedMutableSnapshot = new NestedMutableSnapshot(i5, addRange, mergedReadObserver$default, mergedWriteObserver, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                i6 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i6 + 1;
                setId$runtime_release(i6);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
                r2 r2Var = r2.f19517a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot takeNestedSnapshot(@m v3.l<Object, r2> lVar) {
        int i5;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        int i6;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i5 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i5 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i5);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i5, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, i5), lVar, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                i6 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i6 + 1;
                setId$runtime_release(i6);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
                r2 r2Var = r2.f19517a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime_release() {
        int i5;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        r2 r2Var = r2.f19517a;
        if (getApplied$runtime_release() || getDisposed$runtime_release()) {
            return;
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            i5 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i5 + 1;
            setId$runtime_release(i5);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
    }
}
