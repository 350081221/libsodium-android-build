package androidx.compose.foundation.text2.input.internal.selection;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cursorHandle$2 extends n0 implements a<TextFieldHandleState> {
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$cursorHandle$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.this$0 = textFieldSelectionState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0 != false) goto L15;
     */
    @Override // v3.a
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState invoke() {
        /*
            r8 = this;
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r8.this$0
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r0 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getTextFieldState$p(r0)
            androidx.compose.foundation.text2.input.TextFieldCharSequence r0 = r0.getText()
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r1 = r8.this$0
            boolean r1 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getShowCursorHandle(r1)
            r2 = 0
            if (r1 == 0) goto L3c
            long r3 = r0.mo1076getSelectionInCharsd9O1mEE()
            boolean r1 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r3)
            if (r1 == 0) goto L3c
            int r0 = r0.length()
            r1 = 1
            if (r0 <= 0) goto L26
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            if (r0 == 0) goto L3c
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r8.this$0
            androidx.compose.foundation.text.Handle r0 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r3 = androidx.compose.foundation.text.Handle.Cursor
            if (r0 == r3) goto L3b
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r8.this$0
            boolean r0 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getCursorHandleInBounds(r0)
            if (r0 == 0) goto L3c
        L3b:
            r2 = r1
        L3c:
            if (r2 != 0) goto L45
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState$Companion r0 = androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState r0 = r0.getHidden()
            return r0
        L45:
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState r0 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState
            r2 = 1
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r1 = r8.this$0
            androidx.compose.ui.geometry.Rect r1 = r1.getCursorRect()
            long r3 = r1.m3520getBottomCenterF1C5BW0()
            androidx.compose.ui.text.style.ResolvedTextDirection r5 = androidx.compose.ui.text.style.ResolvedTextDirection.Ltr
            r6 = 0
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$cursorHandle$2.invoke():androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState");
    }
}
