package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\f\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0010\u001a\u00020\tR$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "failedCommand", "", "generateBatchErrorMessage", "toStringForLog", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "Lkotlin/r2;", "reset", "apply", "toTextFieldValue", "<set-?>", "mBufferState", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n33#2,6:180\n1#3:186\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:180,6\n*E\n"})
/* loaded from: classes.dex */
public final class EditProcessor {
    public static final int $stable = 8;

    @l
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m5550getZerod9O1mEE(), (TextRange) null, (w) null);

    @l
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m5783getSelectiond9O1mEE(), (w) null);

    private final String generateBatchErrorMessage(List<? extends EditCommand> list, EditCommand editCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.getLength$ui_text_release() + ", composition=" + this.mBuffer.m5703getCompositionMzsxiRA$ui_text_release() + ", selection=" + ((Object) TextRange.m5548toStringimpl(this.mBuffer.m5704getSelectiond9O1mEE$ui_text_release())) + "):");
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        e0.h3(list, sb, "\n", null, null, 0, null, new EditProcessor$generateBatchErrorMessage$1$1(editCommand, this), 60, null);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return editCommand.toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return editCommand.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown EditCommand: ");
        String t5 = l1.d(editCommand.getClass()).t();
        if (t5 == null) {
            t5 = "{anonymous EditCommand}";
        }
        sb3.append(t5);
        return sb3.toString();
    }

    @l
    public final TextFieldValue apply(@l List<? extends EditCommand> list) {
        EditCommand editCommand;
        Exception e5;
        long TextRange;
        EditCommand editCommand2;
        TextRange textRange = null;
        try {
            int size = list.size();
            int i5 = 0;
            editCommand = null;
            while (i5 < size) {
                try {
                    editCommand2 = list.get(i5);
                } catch (Exception e6) {
                    e5 = e6;
                }
                try {
                    editCommand2.applyTo(this.mBuffer);
                    i5++;
                    editCommand = editCommand2;
                } catch (Exception e7) {
                    e5 = e7;
                    editCommand = editCommand2;
                    throw new RuntimeException(generateBatchErrorMessage(list, editCommand), e5);
                }
            }
            AnnotatedString annotatedString$ui_text_release = this.mBuffer.toAnnotatedString$ui_text_release();
            long m5704getSelectiond9O1mEE$ui_text_release = this.mBuffer.m5704getSelectiond9O1mEE$ui_text_release();
            TextRange m5533boximpl = TextRange.m5533boximpl(m5704getSelectiond9O1mEE$ui_text_release);
            m5533boximpl.m5549unboximpl();
            if (!TextRange.m5544getReversedimpl(this.mBufferState.m5783getSelectiond9O1mEE())) {
                textRange = m5533boximpl;
            }
            if (textRange != null) {
                TextRange = textRange.m5549unboximpl();
            } else {
                TextRange = TextRangeKt.TextRange(TextRange.m5542getMaximpl(m5704getSelectiond9O1mEE$ui_text_release), TextRange.m5543getMinimpl(m5704getSelectiond9O1mEE$ui_text_release));
            }
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text_release, TextRange, this.mBuffer.m5703getCompositionMzsxiRA$ui_text_release(), (w) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e8) {
            editCommand = null;
            e5 = e8;
        }
    }

    @l
    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    @l
    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(@l TextFieldValue textFieldValue, @m TextInputSession textInputSession) {
        boolean z4 = true;
        boolean z5 = !l0.g(textFieldValue.m5782getCompositionMzsxiRA(), this.mBuffer.m5703getCompositionMzsxiRA$ui_text_release());
        boolean z6 = false;
        if (!l0.g(this.mBufferState.getAnnotatedString(), textFieldValue.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValue.getAnnotatedString(), textFieldValue.m5783getSelectiond9O1mEE(), (w) null);
        } else if (!TextRange.m5538equalsimpl0(this.mBufferState.m5783getSelectiond9O1mEE(), textFieldValue.m5783getSelectiond9O1mEE())) {
            this.mBuffer.setSelection$ui_text_release(TextRange.m5543getMinimpl(textFieldValue.m5783getSelectiond9O1mEE()), TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE()));
            z6 = true;
            z4 = false;
        } else {
            z4 = false;
        }
        if (textFieldValue.m5782getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m5539getCollapsedimpl(textFieldValue.m5782getCompositionMzsxiRA().m5549unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m5543getMinimpl(textFieldValue.m5782getCompositionMzsxiRA().m5549unboximpl()), TextRange.m5542getMaximpl(textFieldValue.m5782getCompositionMzsxiRA().m5549unboximpl()));
        }
        if (z4 || (!z6 && z5)) {
            this.mBuffer.commitComposition$ui_text_release();
            textFieldValue = TextFieldValue.m5778copy3r_uNRQ$default(textFieldValue, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.mBufferState;
        this.mBufferState = textFieldValue;
        if (textInputSession != null) {
            textInputSession.updateState(textFieldValue2, textFieldValue);
        }
    }

    @l
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
