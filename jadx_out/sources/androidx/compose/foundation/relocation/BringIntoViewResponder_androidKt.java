package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"defaultBringIntoViewParent", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "toRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewResponder_androidKt {
    @l
    public static final BringIntoViewParent defaultBringIntoViewParent(@l final CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode) {
        return new BringIntoViewParent() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1
            @Override // androidx.compose.foundation.relocation.BringIntoViewParent
            @m
            public final Object bringChildIntoView(@l LayoutCoordinates layoutCoordinates, @l a<Rect> aVar, @l d<? super r2> dVar) {
                Rect rect;
                android.graphics.Rect rect2;
                View view = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(CompositionLocalConsumerModifierNode.this, AndroidCompositionLocals_androidKt.getLocalView());
                long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
                Rect invoke = aVar.invoke();
                if (invoke != null) {
                    rect = invoke.m3530translatek4lQ0M(positionInRoot);
                } else {
                    rect = null;
                }
                if (rect != null) {
                    rect2 = BringIntoViewResponder_androidKt.toRect(rect);
                    view.requestRectangleOnScreen(rect2, false);
                }
                return r2.f19517a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect toRect(Rect rect) {
        return new android.graphics.Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
