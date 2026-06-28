package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.ui.geometry.Rect;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n1#2:1236\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$observeTextToolbarVisibility$2 extends n0 implements a<Rect> {
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$observeTextToolbarVisibility$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.this$0 = textFieldSelectionState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002a, code lost:
    
        if (r0 == androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r3 != androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Cursor) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r0 = true;
     */
    @Override // v3.a
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.geometry.Rect invoke() {
        /*
            r6 = this;
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r6.this$0
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r0 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getTextFieldState$p(r0)
            androidx.compose.foundation.text2.input.TextFieldCharSequence r0 = r0.getText()
            long r0 = r0.mo1076getSelectionInCharsd9O1mEE()
            boolean r0 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L20
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r3 = r6.this$0
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r3 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getTextToolbarState(r3)
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r4 = androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Cursor
            if (r3 == r4) goto L2c
        L20:
            if (r0 != 0) goto L2e
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r6.this$0
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r0 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getTextToolbarState(r0)
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r3 = androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.Selection
            if (r0 != r3) goto L2e
        L2c:
            r0 = r1
            goto L2f
        L2e:
            r0 = r2
        L2f:
            if (r0 == 0) goto L42
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r6.this$0
            androidx.compose.foundation.text.Handle r0 = r0.getDraggingHandle()
            if (r0 != 0) goto L42
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r6.this$0
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 != 0) goto L4c
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r0 = r0.getZero()
            goto La5
        L4c:
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = r6.this$0
            androidx.compose.ui.layout.LayoutCoordinates r0 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getTextLayoutCoordinates(r0)
            r1 = 0
            if (r0 == 0) goto L5a
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            goto L5b
        L5a:
            r0 = r1
        L5b:
            if (r0 == 0) goto L9f
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r2 = r6.this$0
            androidx.compose.ui.layout.LayoutCoordinates r2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getTextLayoutCoordinates(r2)
            if (r2 == 0) goto L72
            long r3 = r0.m3528getTopLeftF1C5BW0()
            long r2 = r2.mo5007localToRootMKHz9U(r3)
            androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m3482boximpl(r2)
            goto L73
        L72:
            r2 = r1
        L73:
            kotlin.jvm.internal.l0.m(r2)
            long r2 = r2.m3503unboximpl()
            long r4 = r0.m3526getSizeNHjbRc()
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.RectKt.m3533Recttz77jQw(r2, r4)
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r2 = r6.this$0
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.access$getContentRect(r2)
            boolean r3 = r0.overlaps(r2)
            if (r3 == 0) goto L8f
            r1 = r2
        L8f:
            if (r1 == 0) goto L98
            androidx.compose.ui.geometry.Rect r0 = r1.intersect(r0)
            if (r0 == 0) goto L98
            goto La5
        L98:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r0 = r0.getZero()
            goto La5
        L9f:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r0 = r0.getZero()
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2.invoke():androidx.compose.ui.geometry.Rect");
    }
}
