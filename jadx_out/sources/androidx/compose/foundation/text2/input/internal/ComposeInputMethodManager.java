package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J(\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;", "", "Lkotlin/r2;", "restartInput", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "sendKeyEvent", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ComposeInputMethodManager {
    void hideSoftInput();

    void restartInput();

    void sendKeyEvent(@l KeyEvent keyEvent);

    void showSoftInput();

    void updateExtractedText(int i5, @l ExtractedText extractedText);

    void updateSelection(int i5, int i6, int i7, int i8);
}
