package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "Lkotlin/r2;", "removeLastUndo", "Landroidx/compose/ui/text/input/TextFieldValue;", b.f22420d, "", "now", "snapshotIfNeeded", "forceNextSnapshot", "makeSnapshot", "undo", "redo", "", "maxStoredCharacters", "I", "getMaxStoredCharacters", "()I", "Landroidx/compose/foundation/text/UndoManager$Entry;", "undoStack", "Landroidx/compose/foundation/text/UndoManager$Entry;", "redoStack", "storedCharacters", "lastSnapshot", "Ljava/lang/Long;", "", "Z", "<init>", "(I)V", "Entry", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UndoManager {
    public static final int $stable = 8;
    private boolean forceNextSnapshot;

    @m
    private Long lastSnapshot;
    private final int maxStoredCharacters;

    @m
    private Entry redoStack;
    private int storedCharacters;

    @m
    private Entry undoStack;

    public UndoManager() {
        this(0, 1, null);
    }

    public UndoManager(int i5) {
        this.maxStoredCharacters = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:7:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[EDGE_INSN: B:13:0x0023->B:14:0x0023 BREAK  A[LOOP:0: B:7:0x000e->B:12:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void removeLastUndo() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.setNext(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j5);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(@l TextFieldValue textFieldValue) {
        TextFieldValue textFieldValue2;
        String str;
        TextFieldValue value;
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (entry != null) {
            textFieldValue2 = entry.getValue();
        } else {
            textFieldValue2 = null;
        }
        if (l0.g(textFieldValue, textFieldValue2)) {
            return;
        }
        String text = textFieldValue.getText();
        Entry entry2 = this.undoStack;
        if (entry2 != null && (value = entry2.getValue()) != null) {
            str = value.getText();
        } else {
            str = null;
        }
        if (l0.g(text, str)) {
            Entry entry3 = this.undoStack;
            if (entry3 != null) {
                entry3.setValue(textFieldValue);
                return;
            }
            return;
        }
        this.undoStack = new Entry(this.undoStack, textFieldValue);
        this.redoStack = null;
        int length = this.storedCharacters + textFieldValue.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    @m
    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry != null) {
            this.redoStack = entry.getNext();
            this.undoStack = new Entry(this.undoStack, entry.getValue());
            this.storedCharacters += entry.getValue().getText().length();
            return entry.getValue();
        }
        return null;
    }

    public final void snapshotIfNeeded(@l TextFieldValue textFieldValue, long j5) {
        long j6;
        if (!this.forceNextSnapshot) {
            Long l5 = this.lastSnapshot;
            if (l5 != null) {
                j6 = l5.longValue();
            } else {
                j6 = 0;
            }
            if (j5 <= j6 + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j5);
        makeSnapshot(textFieldValue);
    }

    @m
    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/UndoManager$Entry;", "", "next", b.f22420d, "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/foundation/text/UndoManager$Entry;Landroidx/compose/ui/text/input/TextFieldValue;)V", "getNext", "()Landroidx/compose/foundation/text/UndoManager$Entry;", "setNext", "(Landroidx/compose/foundation/text/UndoManager$Entry;)V", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Entry {

        @m
        private Entry next;

        @l
        private TextFieldValue value;

        public Entry(@m Entry entry, @l TextFieldValue textFieldValue) {
            this.next = entry;
            this.value = textFieldValue;
        }

        @m
        public final Entry getNext() {
            return this.next;
        }

        @l
        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(@m Entry entry) {
            this.next = entry;
        }

        public final void setValue(@l TextFieldValue textFieldValue) {
            this.value = textFieldValue;
        }

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i5, w wVar) {
            this((i5 & 1) != 0 ? null : entry, textFieldValue);
        }
    }

    public /* synthetic */ UndoManager(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 100000 : i5);
    }
}
