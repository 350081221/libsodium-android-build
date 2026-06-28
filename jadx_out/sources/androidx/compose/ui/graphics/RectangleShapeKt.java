package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectangleShapeKt {

    @p4.l
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @p4.l
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.ui.graphics.Shape
        @p4.l
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo251createOutlinePq9zytI(long j5, @p4.l LayoutDirection layoutDirection, @p4.l Density density) {
            return new Outline.Rectangle(SizeKt.m3583toRectuvyYCjk(j5));
        }
    };

    @p4.l
    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
