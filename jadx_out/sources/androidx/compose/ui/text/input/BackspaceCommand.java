package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/input/BackspaceCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "Lkotlin/r2;", "applyTo", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BackspaceCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@l EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.delete$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release());
            return;
        }
        if (editingBuffer.getCursor$ui_text_release() == -1) {
            int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
            int selectionEnd$ui_text_release = editingBuffer.getSelectionEnd$ui_text_release();
            editingBuffer.setCursor$ui_text_release(editingBuffer.getSelectionStart$ui_text_release());
            editingBuffer.delete$ui_text_release(selectionStart$ui_text_release, selectionEnd$ui_text_release);
            return;
        }
        if (editingBuffer.getCursor$ui_text_release() == 0) {
            return;
        }
        editingBuffer.delete$ui_text_release(JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer.toString(), editingBuffer.getCursor$ui_text_release()), editingBuffer.getCursor$ui_text_release());
    }

    public boolean equals(@m Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public int hashCode() {
        return l1.d(BackspaceCommand.class).hashCode();
    }

    @l
    public String toString() {
        return "BackspaceCommand()";
    }
}
