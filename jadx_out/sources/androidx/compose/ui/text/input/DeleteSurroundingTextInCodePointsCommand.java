package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "Lkotlin/r2;", "applyTo", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "lengthBeforeCursor", "I", "getLengthBeforeCursor", "()I", "lengthAfterCursor", "getLengthAfterCursor", "<init>", "(II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i5, int i6) {
        boolean z4;
        this.lengthBeforeCursor = i5;
        this.lengthAfterCursor = i6;
        if (i5 >= 0 && i6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i5 + " and " + i6 + " respectively.").toString());
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@l EditingBuffer editingBuffer) {
        boolean isSurrogatePair;
        boolean isSurrogatePair2;
        int i5 = this.lengthBeforeCursor;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            if (editingBuffer.getSelectionStart$ui_text_release() > i6) {
                isSurrogatePair2 = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionStart$ui_text_release() - i6) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i6));
                if (isSurrogatePair2) {
                    i6++;
                }
            }
            if (i6 == editingBuffer.getSelectionStart$ui_text_release()) {
                break;
            }
        }
        int i8 = this.lengthAfterCursor;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9++;
            if (editingBuffer.getSelectionEnd$ui_text_release() + i9 < editingBuffer.getLength$ui_text_release()) {
                isSurrogatePair = EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionEnd$ui_text_release() + i9) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release() + i9));
                if (isSurrogatePair) {
                    i9++;
                }
            }
            if (editingBuffer.getSelectionEnd$ui_text_release() + i9 == editingBuffer.getLength$ui_text_release()) {
                break;
            }
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release() + i9);
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionStart$ui_text_release() - i6, editingBuffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        if (this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @l
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
