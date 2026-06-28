package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text2/input/UndoState;", "", "Lkotlin/r2;", "undo", "redo", "clearHistory", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "", "getCanUndo", "()Z", "getCanUndo$annotations", "()V", "canUndo", "getCanRedo", "getCanRedo$annotations", "canRedo", "<init>", "(Landroidx/compose/foundation/text2/input/TextFieldState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class UndoState {
    public static final int $stable = 0;

    @l
    private final TextFieldState state;

    public UndoState(@l TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }

    public final void clearHistory() {
        this.state.getTextUndoManager$foundation_release().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.state.getTextUndoManager$foundation_release().getCanRedo();
    }

    public final boolean getCanUndo() {
        return this.state.getTextUndoManager$foundation_release().getCanUndo();
    }

    public final void redo() {
        this.state.getTextUndoManager$foundation_release().redo(this.state);
    }

    public final void undo() {
        this.state.getTextUndoManager$foundation_release().undo(this.state);
    }
}
