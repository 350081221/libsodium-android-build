package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.text.f0;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/ui/text/input/TextFieldValue;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputState_androidKt {
    @l
    public static final ExtractedText toExtractedText(@l TextFieldValue textFieldValue) {
        boolean S2;
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m5543getMinimpl(textFieldValue.m5783getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m5542getMaximpl(textFieldValue.m5783getSelectiond9O1mEE());
        S2 = f0.S2(textFieldValue.getText(), '\n', false, 2, null);
        extractedText.flags = !S2 ? 1 : 0;
        return extractedText;
    }
}
