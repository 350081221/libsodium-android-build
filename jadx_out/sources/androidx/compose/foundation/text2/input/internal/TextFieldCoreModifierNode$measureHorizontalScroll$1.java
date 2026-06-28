package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode$measureHorizontalScroll$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measureHorizontalScroll;
    final /* synthetic */ int $width;
    final /* synthetic */ TextFieldCoreModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$measureHorizontalScroll$1(TextFieldCoreModifierNode textFieldCoreModifierNode, MeasureScope measureScope, Placeable placeable, int i5) {
        super(1);
        this.this$0 = textFieldCoreModifierNode;
        this.$this_measureHorizontalScroll = measureScope;
        this.$placeable = placeable;
        this.$width = i5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        TransformedTextFieldState transformedTextFieldState;
        int m1115calculateOffsetToFollow5zctL8;
        Rect rect;
        boolean z4;
        ScrollState scrollState;
        TextLayoutState textLayoutState;
        transformedTextFieldState = this.this$0.textFieldState;
        long mo1076getSelectionInCharsd9O1mEE = transformedTextFieldState.getText().mo1076getSelectionInCharsd9O1mEE();
        m1115calculateOffsetToFollow5zctL8 = this.this$0.m1115calculateOffsetToFollow5zctL8(mo1076getSelectionInCharsd9O1mEE);
        if (m1115calculateOffsetToFollow5zctL8 >= 0) {
            MeasureScope measureScope = this.$this_measureHorizontalScroll;
            textLayoutState = this.this$0.textLayoutState;
            rect = TextFieldCoreModifierKt.getCursorRectInScroller(measureScope, m1115calculateOffsetToFollow5zctL8, textLayoutState.getLayoutResult(), this.$this_measureHorizontalScroll.getLayoutDirection() == LayoutDirection.Rtl, this.$placeable.getWidth());
        } else {
            rect = null;
        }
        this.this$0.updateScrollState(rect, this.$width, this.$placeable.getWidth());
        z4 = this.this$0.isFocused;
        if (z4) {
            this.this$0.previousSelection = TextRange.m5533boximpl(mo1076getSelectionInCharsd9O1mEE);
        }
        Placeable placeable = this.$placeable;
        scrollState = this.this$0.scrollState;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, -scrollState.getValue(), 0, 0.0f, 4, null);
    }
}
