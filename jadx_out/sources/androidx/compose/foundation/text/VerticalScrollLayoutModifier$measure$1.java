package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.math.d;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier$measure$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ int $height;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ VerticalScrollLayoutModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalScrollLayoutModifier$measure$1(MeasureScope measureScope, VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i5) {
        super(1);
        this.$this_measure = measureScope;
        this.this$0 = verticalScrollLayoutModifier;
        this.$placeable = placeable;
        this.$height = i5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        Rect cursorRectInScroller;
        int L0;
        MeasureScope measureScope = this.$this_measure;
        int cursorOffset = this.this$0.getCursorOffset();
        TransformedText transformedText = this.this$0.getTransformedText();
        TextLayoutResultProxy invoke = this.this$0.getTextLayoutResultProvider().invoke();
        cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(measureScope, cursorOffset, transformedText, invoke != null ? invoke.getValue() : null, false, this.$placeable.getWidth());
        this.this$0.getScrollerPosition().update(Orientation.Vertical, cursorRectInScroller, this.$height, this.$placeable.getHeight());
        float f5 = -this.this$0.getScrollerPosition().getOffset();
        Placeable placeable = this.$placeable;
        L0 = d.L0(f5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, L0, 0.0f, 4, null);
    }
}
