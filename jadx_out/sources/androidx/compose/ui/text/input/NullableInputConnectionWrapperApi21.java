package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0012\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010.\u001a\u00020-\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200¢\u0006\u0004\b7\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u0012\u0010!\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0016J\u001c\u0010&\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010$2\b\u0010\u0007\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010)\u001a\u0004\u0018\u00010(H\u0016J\"\u0010,\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0014R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R(\u0010.\u001a\u0004\u0018\u00010-2\b\u00103\u001a\u0004\u0018\u00010-8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "Lkotlin/r2;", "disposeDelegate", "closeConnection", "", "p0", "p1", "", "getTextBeforeCursor", "getTextAfterCursor", "getSelectedText", "getCursorCapsMode", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "", "deleteSurroundingText", "deleteSurroundingTextInCodePoints", "setComposingText", "setComposingRegion", "finishComposingText", "commitText", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "setSelection", "performEditorAction", "performContextMenuAction", "beginBatchEdit", "endBatchEdit", "Landroid/view/KeyEvent;", "sendKeyEvent", "clearMetaKeyStates", "reportFullscreenMode", "", "Landroid/os/Bundle;", "performPrivateCommand", "requestCursorUpdates", "Landroid/os/Handler;", "getHandler", "Landroid/view/inputmethod/InputContentInfo;", "p2", "commitContent", "Landroid/view/inputmethod/InputConnection;", "delegate", "closeDelegate", "Lkotlin/Function0;", "onConnectionClosed", "Lv3/a;", "<set-?>", "Landroid/view/inputmethod/InputConnection;", "getDelegate", "()Landroid/view/inputmethod/InputConnection;", "<init>", "(Landroid/view/inputmethod/InputConnection;Lv3/a;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi21 implements NullableInputConnectionWrapper {

    @m
    private InputConnection delegate;

    @l
    private final v3.a<r2> onConnectionClosed;

    public NullableInputConnectionWrapperApi21(@l InputConnection inputConnection, @l v3.a<r2> aVar) {
        this.onConnectionClosed = aVar;
        this.delegate = inputConnection;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.delegate != null) {
            disposeDelegate();
            this.onConnectionClosed.invoke();
        }
    }

    protected void closeDelegate(@l InputConnection inputConnection) {
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@m CompletionInfo completionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@l InputContentInfo inputContentInfo, int i5, @m Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@m CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@m CharSequence charSequence, int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i5, int i6) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i5, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        return false;
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapper
    public final void disposeDelegate() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            closeDelegate(inputConnection);
            this.delegate = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i5);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @m
    public final InputConnection getDelegate() {
        return this.delegate;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public ExtractedText getExtractedText(@m ExtractedTextRequest extractedTextRequest, int i5) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.delegate;
        return (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i5)) == null) ? new ExtractedText() : extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @l
    public CharSequence getSelectedText(int i5) {
        CharSequence selectedText;
        InputConnection inputConnection = this.delegate;
        return (inputConnection == null || (selectedText = inputConnection.getSelectedText(i5)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public CharSequence getTextAfterCursor(int i5, int i6) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i5, i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @m
    public CharSequence getTextBeforeCursor(int i5, int i6) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i5, i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@m String str, @m Bundle bundle) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z4) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z4);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@m KeyEvent keyEvent) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i5, int i6) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i5, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@m CharSequence charSequence, int i5) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i5);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i5, int i6) {
        InputConnection inputConnection = this.delegate;
        if (inputConnection != null) {
            return inputConnection.setSelection(i5, i6);
        }
        return false;
    }
}
