package androidx.compose.foundation.text2.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.text.f0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEBUG_CLASS", "", "SIC_DEBUG", "", "getSIC_DEBUG$annotations", "()V", "TAG", "toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatelessInputConnection_androidKt {

    @l
    private static final String DEBUG_CLASS = "StatelessInputConnection";
    public static final boolean SIC_DEBUG = false;

    @l
    private static final String TAG = "StatelessIC";

    @VisibleForTesting
    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        boolean S2;
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m5543getMinimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE());
        extractedText.selectionEnd = TextRange.m5542getMaximpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE());
        S2 = f0.S2(textFieldCharSequence, '\n', false, 2, null);
        extractedText.flags = !S2 ? 1 : 0;
        return extractedText;
    }
}
