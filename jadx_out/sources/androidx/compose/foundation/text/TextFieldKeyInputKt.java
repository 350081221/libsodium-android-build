package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/TextFieldValue;", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "", "editable", "singleLine", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "textFieldKeyInput-2WJ9YEU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;ZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;I)Landroidx/compose/ui/Modifier;", "textFieldKeyInput", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt {
    @l
    /* renamed from: textFieldKeyInput-2WJ9YEU, reason: not valid java name */
    public static final Modifier m910textFieldKeyInput2WJ9YEU(@l Modifier modifier, @l TextFieldState textFieldState, @l TextFieldSelectionManager textFieldSelectionManager, @l TextFieldValue textFieldValue, @l v3.l<? super TextFieldValue, r2> lVar, boolean z4, boolean z5, @l OffsetMapping offsetMapping, @l UndoManager undoManager, int i5) {
        return ComposedModifierKt.composed$default(modifier, null, new TextFieldKeyInputKt$textFieldKeyInput$2(textFieldState, textFieldSelectionManager, textFieldValue, z4, z5, offsetMapping, undoManager, lVar, i5), 1, null);
    }

    /* renamed from: textFieldKeyInput-2WJ9YEU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m911textFieldKeyInput2WJ9YEU$default(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, v3.l lVar, boolean z4, boolean z5, OffsetMapping offsetMapping, UndoManager undoManager, int i5, int i6, Object obj) {
        v3.l lVar2;
        if ((i6 & 8) != 0) {
            lVar2 = TextFieldKeyInputKt$textFieldKeyInput$1.INSTANCE;
        } else {
            lVar2 = lVar;
        }
        return m910textFieldKeyInput2WJ9YEU(modifier, textFieldState, textFieldSelectionManager, textFieldValue, lVar2, z4, z5, offsetMapping, undoManager, i5);
    }
}
