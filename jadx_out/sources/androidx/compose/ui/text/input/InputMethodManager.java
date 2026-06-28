package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManager;", "", "", "isActive", "Lkotlin/r2;", "restartInput", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface InputMethodManager {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(@l CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i5, @l ExtractedText extractedText);

    void updateSelection(int i5, int i6, int i7, int i8);
}
