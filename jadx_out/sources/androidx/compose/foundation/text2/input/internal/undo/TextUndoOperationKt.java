package androidx.compose.foundation.text2.input.internal.undo;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.EditingBuffer;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldState;", "Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "op", "Lkotlin/r2;", "undo", "redo", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,179:1\n218#2,14:180\n218#2,14:194\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text2/input/internal/undo/TextUndoOperationKt\n*L\n117#1:180,14\n128#1:194,14\n*E\n"})
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void redo(@l TextFieldState textFieldState, @l TextUndoOperation textUndoOperation) {
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPreText().length(), textUndoOperation.getPostText());
        mainBuffer$foundation_release.setSelection(TextRange.m5545getStartimpl(textUndoOperation.m1189getPostSelectiond9O1mEE()), TextRange.m5540getEndimpl(textUndoOperation.m1189getPostSelectiond9O1mEE()));
        TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer$foundation_release().toString(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA());
        textFieldState.setText(m1077TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, m1077TextFieldCharSequence3r_uNRQ);
    }

    public static final void undo(@l TextFieldState textFieldState, @l TextUndoOperation textUndoOperation) {
        TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.replace(textUndoOperation.getIndex(), textUndoOperation.getIndex() + textUndoOperation.getPostText().length(), textUndoOperation.getPreText());
        mainBuffer$foundation_release.setSelection(TextRange.m5545getStartimpl(textUndoOperation.m1190getPreSelectiond9O1mEE()), TextRange.m5540getEndimpl(textUndoOperation.m1190getPreSelectiond9O1mEE()));
        TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ = TextFieldCharSequenceKt.m1077TextFieldCharSequence3r_uNRQ(textFieldState.getMainBuffer$foundation_release().toString(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA());
        textFieldState.setText(m1077TextFieldCharSequence3r_uNRQ);
        textFieldState.notifyIme(text, m1077TextFieldCharSequence3r_uNRQ);
    }
}
