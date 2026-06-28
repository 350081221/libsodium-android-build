package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lkotlin/r2;", "onPlaced", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface LayoutAwareModifierNode extends DelegatableNode {
    default void onPlaced(@l LayoutCoordinates layoutCoordinates) {
    }

    /* renamed from: onRemeasured-ozmzZPI */
    default void mo294onRemeasuredozmzZPI(long j5) {
    }
}
