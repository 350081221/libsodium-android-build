package androidx.compose.foundation.text2.input.internal.selection;

import android.annotation.SuppressLint;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¨\u0006\n"}, d2 = {"textFieldMagnifierNode", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "isFocused", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextFieldMagnifier_androidKt {
    @l
    @SuppressLint({"ModifierFactoryExtensionFunction", "ModifierFactoryReturnType"})
    public static final TextFieldMagnifierNode textFieldMagnifierNode(@l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l TextLayoutState textLayoutState, boolean z4) {
        if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
            return new TextFieldMagnifierNodeImpl28(transformedTextFieldState, textFieldSelectionState, textLayoutState, z4);
        }
        return new TextFieldMagnifierNode() { // from class: androidx.compose.foundation.text2.input.internal.selection.AndroidTextFieldMagnifier_androidKt$textFieldMagnifierNode$1
            @Override // androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode
            public void update(@l TransformedTextFieldState transformedTextFieldState2, @l TextFieldSelectionState textFieldSelectionState2, @l TextLayoutState textLayoutState2, boolean z5) {
            }
        };
    }
}
