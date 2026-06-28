package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "Lkotlin/r2;", "applyTo", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "newCursorPosition", "I", "getNewCursorPosition", "()I", "getText", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SetComposingTextCommand implements EditCommand {
    public static final int $stable = 0;

    @l
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public SetComposingTextCommand(@l AnnotatedString annotatedString, int i5) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i5;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@l EditingBuffer editingBuffer) {
        boolean z4;
        int length;
        int I;
        boolean z5;
        if (editingBuffer.hasComposition$ui_text_release()) {
            int compositionStart$ui_text_release = editingBuffer.getCompositionStart$ui_text_release();
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                editingBuffer.setComposition$ui_text_release(compositionStart$ui_text_release, getText().length() + compositionStart$ui_text_release);
            }
        } else {
            int selectionStart$ui_text_release = editingBuffer.getSelectionStart$ui_text_release();
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
            if (getText().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                editingBuffer.setComposition$ui_text_release(selectionStart$ui_text_release, getText().length() + selectionStart$ui_text_release);
            }
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i5 = this.newCursorPosition;
        if (i5 > 0) {
            length = (cursor$ui_text_release + i5) - 1;
        } else {
            length = (cursor$ui_text_release + i5) - getText().length();
        }
        I = u.I(length, 0, editingBuffer.getLength$ui_text_release());
        editingBuffer.setCursor$ui_text_release(I);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        if (l0.g(getText(), setComposingTextCommand.getText()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition) {
            return true;
        }
        return false;
    }

    @l
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @l
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    @l
    public String toString() {
        return "SetComposingTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public SetComposingTextCommand(@l String str, int i5) {
        this(new AnnotatedString(str, null, null, 6, null), i5);
    }
}
