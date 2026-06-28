package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\u0007\u001a\u00020\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R/\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R/\u0010)\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010-\u001a\u0004\u0018\u00010\u00012\b\u0010*\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "pin", "Lkotlin/r2;", "release", "onDisposed", "", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "(I)V", "index", "pinsCount$delegate", "getPinsCount", "setPinsCount", "pinsCount", "parentHandle$delegate", "Landroidx/compose/runtime/MutableState;", "getParentHandle", "()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "setParentHandle", "(Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;)V", "parentHandle", "_parentPinnableContainer$delegate", "get_parentPinnableContainer", "()Landroidx/compose/ui/layout/PinnableContainer;", "set_parentPinnableContainer", "(Landroidx/compose/ui/layout/PinnableContainer;)V", "_parentPinnableContainer", b.f22420d, "getParentPinnableContainer", "setParentPinnableContainer", "parentPinnableContainer", "<init>", "(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n75#2:175\n108#2,2:176\n75#2:178\n108#2,2:179\n81#3:181\n107#3,2:182\n81#3:184\n107#3,2:185\n495#4,4:187\n500#4:196\n129#5,5:191\n1#6:197\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem\n*L\n117#1:175\n117#1:176,2\n123#1:178\n123#1:179,2\n128#1:181\n128#1:182,2\n134#1:184\n134#1:185,2\n137#1:187,4\n137#1:196\n137#1:191,5\n*E\n"})
/* loaded from: classes.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    @l
    private final MutableState _parentPinnableContainer$delegate;

    @m
    private final Object key;

    @l
    private final MutableState parentHandle$delegate;

    @l
    private final LazyLayoutPinnedItemList pinnedItemList;

    @l
    private final MutableIntState index$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);

    @l
    private final MutableIntState pinsCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);

    public LazyLayoutPinnableItem(@m Object obj, @l LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentHandle$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._parentPinnableContainer$delegate = mutableStateOf$default2;
    }

    private final PinnableContainer.PinnedHandle getParentHandle() {
        return (PinnableContainer.PinnedHandle) this.parentHandle$delegate.getValue();
    }

    private final int getPinsCount() {
        return this.pinsCount$delegate.getIntValue();
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void setParentHandle(PinnableContainer.PinnedHandle pinnedHandle) {
        this.parentHandle$delegate.setValue(pinnedHandle);
    }

    private final void setPinsCount(int i5) {
        this.pinsCount$delegate.setIntValue(i5);
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    @m
    public Object getKey() {
        return this.key;
    }

    @m
    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i5 = 0; i5 < pinsCount; i5++) {
            release();
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    @l
    public PinnableContainer.PinnedHandle pin() {
        PinnableContainer.PinnedHandle pinnedHandle;
        if (getPinsCount() == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            if (parentPinnableContainer != null) {
                pinnedHandle = parentPinnableContainer.pin();
            } else {
                pinnedHandle = null;
            }
            setParentHandle(pinnedHandle);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        boolean z4;
        if (getPinsCount() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setPinsCount(getPinsCount() - 1);
            if (getPinsCount() == 0) {
                this.pinnedItemList.release$foundation_release(this);
                PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                if (parentHandle != null) {
                    parentHandle.release();
                }
                setParentHandle(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once".toString());
    }

    public void setIndex(int i5) {
        this.index$delegate.setIntValue(i5);
    }

    public final void setParentPinnableContainer(@m PinnableContainer pinnableContainer) {
        PinnableContainer.PinnedHandle pinnedHandle;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                if (pinnableContainer != get_parentPinnableContainer()) {
                    set_parentPinnableContainer(pinnableContainer);
                    if (getPinsCount() > 0) {
                        PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                        if (parentHandle != null) {
                            parentHandle.release();
                        }
                        if (pinnableContainer != null) {
                            pinnedHandle = pinnableContainer.pin();
                        } else {
                            pinnedHandle = null;
                        }
                        setParentHandle(pinnedHandle);
                    }
                }
                r2 r2Var = r2.f19517a;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }
}
