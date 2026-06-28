package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.b1;
import kotlin.i0;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¨\u0006\u0006"}, d2 = {"excludeFromSystemGesture", "Landroidx/compose/ui/Modifier;", "exclusion", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@u3.h(name = "ExcludeFromSystemGestureKt")
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @p4.l
    @kotlin.k(message = "Use systemGestureExclusion", replaceWith = @b1(expression = "systemGestureExclusion", imports = {}))
    public static final Modifier excludeFromSystemGesture(@p4.l Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @p4.l
    @kotlin.k(message = "Use systemGestureExclusion", replaceWith = @b1(expression = "systemGestureExclusion", imports = {}))
    public static final Modifier excludeFromSystemGesture(@p4.l Modifier modifier, @p4.l v3.l<? super LayoutCoordinates, Rect> lVar) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, lVar);
    }
}
