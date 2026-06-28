package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation;
import androidx.compose.foundation.text2.input.internal.undo.TextUndoOperationKt;
import androidx.compose.foundation.text2.input.internal.undo.UndoManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B#\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR/\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text2/input/TextUndoManager;", "", "Lkotlin/r2;", "flush", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "undo", "redo", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "op", "record", "clearHistory", "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;", "undoManager", "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;", "<set-?>", "stagingUndo$delegate", "Landroidx/compose/runtime/MutableState;", "getStagingUndo", "()Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "setStagingUndo", "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)V", "stagingUndo", "", "getCanUndo", "()Z", "canUndo", "getCanRedo", "canRedo", "initialStagingUndo", "<init>", "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n81#2:268\n107#2,2:269\n495#3,4:271\n500#3:280\n495#3,4:281\n500#3:290\n129#4,5:275\n129#4,5:285\n1#5:291\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager\n*L\n47#1:268\n47#1:269,2\n73#1:271,4\n73#1:280\n98#1:281,4\n98#1:290\n73#1:275,5\n98#1:285,5\n*E\n"})
/* loaded from: classes.dex */
public final class TextUndoManager {

    @l
    private final MutableState stagingUndo$delegate;

    @l
    private final UndoManager<TextUndoOperation> undoManager;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text2/input/TextUndoManager$Companion;", "", "()V", "Saver", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        @StabilityInferred(parameters = 0)
        @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0014\u0010\n\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R \u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text2/input/TextUndoManager;", "", "()V", "undoManagerSaver", "Landroidx/compose/foundation/text2/input/internal/undo/UndoManager;", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "restore", b.f22420d, "save", "Landroidx/compose/runtime/saveable/SaverScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nTextUndoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver\n+ 2 UndoManager.kt\nandroidx/compose/foundation/text2/input/internal/undo/UndoManager$Companion\n*L\n1#1,267:1\n125#2:268\n171#2:269\n*S KotlinDebug\n*F\n+ 1 TextUndoManager.kt\nandroidx/compose/foundation/text2/input/TextUndoManager$Companion$Saver\n*L\n105#1:268\n105#1:269\n*E\n"})
        /* loaded from: classes.dex */
        public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextUndoManager, Object> {
            public static final int $stable;

            @l
            public static final Saver INSTANCE = new Saver();

            @l
            private static final androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> undoManagerSaver;

            static {
                UndoManager.Companion companion = UndoManager.Companion;
                final androidx.compose.runtime.saveable.Saver<TextUndoOperation, Object> saver = TextUndoOperation.Companion.getSaver();
                undoManagerSaver = new androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object>() { // from class: androidx.compose.foundation.text2.input.TextUndoManager$Companion$Saver$special$$inlined$createSaver$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // androidx.compose.runtime.saveable.Saver
                    @l
                    public UndoManager<TextUndoOperation> restore(@l Object obj) {
                        List i5;
                        List a5;
                        List i6;
                        List a6;
                        l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                        List list = (List) obj;
                        int intValue = ((Number) list.get(0)).intValue();
                        int intValue2 = ((Number) list.get(1)).intValue();
                        int intValue3 = ((Number) list.get(2)).intValue();
                        Saver saver2 = Saver.this;
                        i5 = v.i();
                        int i7 = 3;
                        while (i7 < intValue2 + 3) {
                            Object restore = saver2.restore(list.get(i7));
                            l0.m(restore);
                            i5.add(restore);
                            i7++;
                        }
                        a5 = v.a(i5);
                        Saver saver3 = Saver.this;
                        i6 = v.i();
                        while (i7 < intValue2 + intValue3 + 3) {
                            Object restore2 = saver3.restore(list.get(i7));
                            l0.m(restore2);
                            i6.add(restore2);
                            i7++;
                        }
                        a6 = v.a(i6);
                        return new UndoManager<>(a5, a6, intValue);
                    }

                    @Override // androidx.compose.runtime.saveable.Saver
                    @l
                    public Object save(@l SaverScope saverScope, @l UndoManager<TextUndoOperation> undoManager) {
                        List i5;
                        int i6;
                        SnapshotStateList snapshotStateList;
                        SnapshotStateList snapshotStateList2;
                        SnapshotStateList snapshotStateList3;
                        SnapshotStateList snapshotStateList4;
                        List a5;
                        Saver saver2 = Saver.this;
                        i5 = v.i();
                        i6 = ((UndoManager) undoManager).capacity;
                        i5.add(Integer.valueOf(i6));
                        snapshotStateList = ((UndoManager) undoManager).undoStack;
                        i5.add(Integer.valueOf(snapshotStateList.size()));
                        snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                        i5.add(Integer.valueOf(snapshotStateList2.size()));
                        snapshotStateList3 = ((UndoManager) undoManager).undoStack;
                        int size = snapshotStateList3.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            i5.add(saver2.save(saverScope, snapshotStateList3.get(i7)));
                        }
                        snapshotStateList4 = ((UndoManager) undoManager).redoStack;
                        int size2 = snapshotStateList4.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            i5.add(saver2.save(saverScope, snapshotStateList4.get(i8)));
                        }
                        a5 = v.a(i5);
                        return a5;
                    }
                };
                $stable = 8;
            }

            private Saver() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.saveable.Saver
            @m
            public TextUndoManager restore(@l Object obj) {
                l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                TextUndoOperation restore = obj2 != null ? TextUndoOperation.Companion.getSaver().restore(obj2) : null;
                androidx.compose.runtime.saveable.Saver<UndoManager<TextUndoOperation>, Object> saver = undoManagerSaver;
                l0.m(obj3);
                UndoManager<TextUndoOperation> restore2 = saver.restore(obj3);
                l0.m(restore2);
                return new TextUndoManager(restore, restore2);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            @l
            public Object save(@l SaverScope saverScope, @l TextUndoManager textUndoManager) {
                List L;
                Object[] objArr = new Object[2];
                TextUndoOperation stagingUndo = textUndoManager.getStagingUndo();
                objArr[0] = stagingUndo != null ? TextUndoOperation.Companion.getSaver().save(saverScope, stagingUndo) : null;
                objArr[1] = undoManagerSaver.save(saverScope, textUndoManager.undoManager);
                L = w.L(objArr);
                return L;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextUndoManager() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TextUndoManager(@m TextUndoOperation textUndoOperation, @l UndoManager<TextUndoOperation> undoManager) {
        MutableState mutableStateOf$default;
        this.undoManager = undoManager;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(textUndoOperation, null, 2, null);
        this.stagingUndo$delegate = mutableStateOf$default;
    }

    private final void flush() {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                TextUndoOperation stagingUndo = getStagingUndo();
                if (stagingUndo != null) {
                    this.undoManager.record(stagingUndo);
                }
                setStagingUndo(null);
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextUndoOperation getStagingUndo() {
        return (TextUndoOperation) this.stagingUndo$delegate.getValue();
    }

    private final void setStagingUndo(TextUndoOperation textUndoOperation) {
        this.stagingUndo$delegate.setValue(textUndoOperation);
    }

    public final void clearHistory() {
        setStagingUndo(null);
        this.undoManager.clearHistory();
    }

    public final boolean getCanRedo() {
        return this.undoManager.getCanRedo$foundation_release() && getStagingUndo() == null;
    }

    public final boolean getCanUndo() {
        return this.undoManager.getCanUndo$foundation_release() || getStagingUndo() != null;
    }

    public final void record(@l TextUndoOperation textUndoOperation) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                TextUndoOperation stagingUndo = getStagingUndo();
                if (stagingUndo == null) {
                    setStagingUndo(textUndoOperation);
                    return;
                }
                TextUndoOperation merge = TextUndoManagerKt.merge(stagingUndo, textUndoOperation);
                if (merge != null) {
                    setStagingUndo(merge);
                } else {
                    flush();
                    setStagingUndo(textUndoOperation);
                }
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    public final void redo(@l TextFieldState textFieldState) {
        if (!getCanRedo()) {
            return;
        }
        TextUndoOperationKt.redo(textFieldState, this.undoManager.redo());
    }

    public final void undo(@l TextFieldState textFieldState) {
        if (!getCanUndo()) {
            return;
        }
        flush();
        TextUndoOperationKt.undo(textFieldState, this.undoManager.undo());
    }

    public /* synthetic */ TextUndoManager(TextUndoOperation textUndoOperation, UndoManager undoManager, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? null : textUndoOperation, (i5 & 2) != 0 ? new UndoManager(null, null, 100, 3, null) : undoManager);
    }
}
