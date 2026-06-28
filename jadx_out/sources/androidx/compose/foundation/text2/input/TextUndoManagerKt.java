package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.UndoManagerKt;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.foundation.text2.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text2.input.internal.undo.TextEditType;
import androidx.compose.foundation.text2.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a.\u0010\f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000\"\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\t*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;", "next", "merge", "Landroidx/compose/foundation/text2/input/TextUndoManager;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "pre", "post", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "changes", "", "allowMerge", "Lkotlin/r2;", "recordChanges", "", "TEXT_UNDO_CAPACITY", "I", "isNewLineInsert", "(Landroidx/compose/foundation/text2/input/internal/undo/TextUndoOperation;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextUndoManagerKt {
    private static final int TEXT_UNDO_CAPACITY = 100;

    private static final boolean isNewLineInsert(TextUndoOperation textUndoOperation) {
        return l0.g(textUndoOperation.getPostText(), "\n") || l0.g(textUndoOperation.getPostText(), "\r\n");
    }

    @m
    public static final TextUndoOperation merge(@l TextUndoOperation textUndoOperation, @l TextUndoOperation textUndoOperation2) {
        if (!textUndoOperation.getCanMerge() || !textUndoOperation2.getCanMerge() || textUndoOperation2.getTimeInMillis() < textUndoOperation.getTimeInMillis() || textUndoOperation2.getTimeInMillis() - textUndoOperation.getTimeInMillis() >= UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS() || isNewLineInsert(textUndoOperation) || isNewLineInsert(textUndoOperation2) || textUndoOperation.getTextEditType() != textUndoOperation2.getTextEditType()) {
            return null;
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Insert && textUndoOperation.getIndex() + textUndoOperation.getPostText().length() == textUndoOperation2.getIndex()) {
            return new TextUndoOperation(textUndoOperation.getIndex(), "", textUndoOperation.getPostText() + textUndoOperation2.getPostText(), textUndoOperation.m1190getPreSelectiond9O1mEE(), textUndoOperation2.m1189getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
        }
        if (textUndoOperation.getTextEditType() == TextEditType.Delete && textUndoOperation.getDeletionType() == textUndoOperation2.getDeletionType() && (textUndoOperation.getDeletionType() == TextDeleteType.Start || textUndoOperation.getDeletionType() == TextDeleteType.End)) {
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex() + textUndoOperation2.getPreText().length()) {
                return new TextUndoOperation(textUndoOperation2.getIndex(), textUndoOperation2.getPreText() + textUndoOperation.getPreText(), "", textUndoOperation.m1190getPreSelectiond9O1mEE(), textUndoOperation2.m1189getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
            if (textUndoOperation.getIndex() == textUndoOperation2.getIndex()) {
                return new TextUndoOperation(textUndoOperation.getIndex(), textUndoOperation.getPreText() + textUndoOperation2.getPreText(), "", textUndoOperation.m1190getPreSelectiond9O1mEE(), textUndoOperation2.m1189getPostSelectiond9O1mEE(), textUndoOperation.getTimeInMillis(), false, 64, null);
            }
        }
        return null;
    }

    public static final void recordChanges(@l TextUndoManager textUndoManager, @l TextFieldCharSequence textFieldCharSequence, @l TextFieldCharSequence textFieldCharSequence2, @l TextFieldBuffer.ChangeList changeList, boolean z4) {
        if (changeList.getChangeCount() > 1) {
            textUndoManager.record(new TextUndoOperation(0, textFieldCharSequence.toString(), textFieldCharSequence2.toString(), textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE(), textFieldCharSequence2.mo1076getSelectionInCharsd9O1mEE(), 0L, false, 32, null));
            return;
        }
        if (changeList.getChangeCount() == 1) {
            long mo1064getOriginalRangejx7JFs = changeList.mo1064getOriginalRangejx7JFs(0);
            long mo1065getRangejx7JFs = changeList.mo1065getRangejx7JFs(0);
            if (!TextRange.m5539getCollapsedimpl(mo1064getOriginalRangejx7JFs) || !TextRange.m5539getCollapsedimpl(mo1065getRangejx7JFs)) {
                textUndoManager.record(new TextUndoOperation(TextRange.m5543getMinimpl(mo1064getOriginalRangejx7JFs), TextRangeKt.m5552substringFDrldGo(textFieldCharSequence, mo1064getOriginalRangejx7JFs), TextRangeKt.m5552substringFDrldGo(textFieldCharSequence2, mo1065getRangejx7JFs), textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE(), textFieldCharSequence2.mo1076getSelectionInCharsd9O1mEE(), 0L, z4, 32, null));
            }
        }
    }

    public static /* synthetic */ void recordChanges$default(TextUndoManager textUndoManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, boolean z4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z4 = true;
        }
        recordChanges(textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, z4);
    }
}
