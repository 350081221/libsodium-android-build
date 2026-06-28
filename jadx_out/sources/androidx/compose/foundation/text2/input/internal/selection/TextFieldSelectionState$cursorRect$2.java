package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorRect$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cursorRect$2 extends n0 implements a<Rect> {
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$cursorRect$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.this$0 = textFieldSelectionState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Rect invoke() {
        TextLayoutState textLayoutState;
        TransformedTextFieldState transformedTextFieldState;
        Density density;
        float right;
        float A;
        float t5;
        textLayoutState = this.this$0.textLayoutState;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        transformedTextFieldState = this.this$0.textFieldState;
        TextFieldCharSequence text = transformedTextFieldState.getText();
        if (!TextRange.m5539getCollapsedimpl(text.mo1076getSelectionInCharsd9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m5545getStartimpl(text.mo1076getSelectionInCharsd9O1mEE()));
        density = this.this$0.density;
        float mo304toPx0680j_4 = density.mo304toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr) {
            right = cursorRect.getLeft() + (mo304toPx0680j_4 / 2);
        } else {
            right = cursorRect.getRight() - (mo304toPx0680j_4 / 2);
        }
        float f5 = mo304toPx0680j_4 / 2;
        A = u.A(right, IntSize.m6214getWidthimpl(layoutResult.m5518getSizeYbymL2g()) - f5);
        t5 = u.t(A, f5);
        return new Rect(t5 - f5, cursorRect.getTop(), t5 + f5, cursorRect.getBottom());
    }
}
