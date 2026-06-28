package androidx.compose.ui.geometry;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableRectKt {
    @l
    public static final Rect toRect(@l MutableRect mutableRect) {
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
