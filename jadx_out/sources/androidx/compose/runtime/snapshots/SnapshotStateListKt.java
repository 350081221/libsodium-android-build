package androidx.compose.runtime.snapshots;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a\b\u0010\u0007\u001a\u00020\u0000H\u0002\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "modificationError", "", "index", "size", "Lkotlin/r2;", "validateRange", "invalidIteratorSet", "", "sync", "Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotStateListKt {

    @l
    private static final Object sync = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateRange(int i5, int i6) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < i6) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i5 + ") is out of bound of [0, " + i6 + ')');
    }
}
