package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;

@kotlin.i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0001¨\u0006\b"}, d2 = {"toAndroidRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/IntRect;", "toAndroidRectF", "Landroid/graphics/RectF;", "toComposeIntRect", "toComposeRect", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectHelper_androidKt {
    @p4.l
    @kotlin.k(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @kotlin.b1(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    public static final Rect toAndroidRect(@p4.l androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    @p4.l
    public static final RectF toAndroidRectF(@p4.l androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    @p4.l
    public static final IntRect toComposeIntRect(@p4.l Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @p4.l
    public static final androidx.compose.ui.geometry.Rect toComposeRect(@p4.l Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @p4.l
    public static final Rect toAndroidRect(@p4.l IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
