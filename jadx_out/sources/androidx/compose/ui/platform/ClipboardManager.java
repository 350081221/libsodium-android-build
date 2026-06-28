package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ClipboardManager;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Lkotlin/r2;", "setText", "getText", "", "hasText", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ClipboardManager {
    @p4.m
    AnnotatedString getText();

    default boolean hasText() {
        AnnotatedString text = getText();
        if (text != null) {
            return text.length() > 0;
        }
        return false;
    }

    void setText(@p4.l AnnotatedString annotatedString);
}
