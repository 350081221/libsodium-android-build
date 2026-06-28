package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JF\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H&J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\tH&J\b\u0010\u0010\u001a\u00020\tH&J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016JD\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputService;", "", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/r2;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "oldValue", "newValue", "updateState", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(@l Rect rect) {
    }

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(@l TextFieldValue textFieldValue, @l ImeOptions imeOptions, @l v3.l<? super List<? extends EditCommand>, r2> lVar, @l v3.l<? super ImeAction, r2> lVar2);

    void stopInput();

    void updateState(@m TextFieldValue textFieldValue, @l TextFieldValue textFieldValue2);

    default void updateTextLayoutResult(@l TextFieldValue textFieldValue, @l OffsetMapping offsetMapping, @l TextLayoutResult textLayoutResult, @l v3.l<? super Matrix, r2> lVar, @l Rect rect, @l Rect rect2) {
    }
}
