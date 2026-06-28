package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "getBottomEnd", "()Landroidx/compose/foundation/shape/CornerSize;", "getBottomStart", "getTopEnd", "getTopStart", "copy", "all", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements Shape {
    public static final int $stable = 0;

    @l
    private final CornerSize bottomEnd;

    @l
    private final CornerSize bottomStart;

    @l
    private final CornerSize topEnd;

    @l
    private final CornerSize topStart;

    public CornerBasedShape(@l CornerSize cornerSize, @l CornerSize cornerSize2, @l CornerSize cornerSize3, @l CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public static /* synthetic */ CornerBasedShape copy$default(CornerBasedShape cornerBasedShape, CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                cornerSize = cornerBasedShape.topStart;
            }
            if ((i5 & 2) != 0) {
                cornerSize2 = cornerBasedShape.topEnd;
            }
            if ((i5 & 4) != 0) {
                cornerSize3 = cornerBasedShape.bottomEnd;
            }
            if ((i5 & 8) != 0) {
                cornerSize4 = cornerBasedShape.bottomStart;
            }
            return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    @l
    public final CornerBasedShape copy(@l CornerSize cornerSize) {
        return copy(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    @l
    public abstract CornerBasedShape copy(@l CornerSize cornerSize, @l CornerSize cornerSize2, @l CornerSize cornerSize3, @l CornerSize cornerSize4);

    @l
    /* renamed from: createOutline-LjSzlW0 */
    public abstract Outline mo806createOutlineLjSzlW0(long j5, float f5, float f6, float f7, float f8, @l LayoutDirection layoutDirection);

    @Override // androidx.compose.ui.graphics.Shape
    @l
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo251createOutlinePq9zytI(long j5, @l LayoutDirection layoutDirection, @l Density density) {
        boolean z4;
        float mo814toPxTmRCtEA = this.topStart.mo814toPxTmRCtEA(j5, density);
        float mo814toPxTmRCtEA2 = this.topEnd.mo814toPxTmRCtEA(j5, density);
        float mo814toPxTmRCtEA3 = this.bottomEnd.mo814toPxTmRCtEA(j5, density);
        float mo814toPxTmRCtEA4 = this.bottomStart.mo814toPxTmRCtEA(j5, density);
        float m3561getMinDimensionimpl = Size.m3561getMinDimensionimpl(j5);
        float f5 = mo814toPxTmRCtEA + mo814toPxTmRCtEA4;
        if (f5 > m3561getMinDimensionimpl) {
            float f6 = m3561getMinDimensionimpl / f5;
            mo814toPxTmRCtEA *= f6;
            mo814toPxTmRCtEA4 *= f6;
        }
        float f7 = mo814toPxTmRCtEA4;
        float f8 = mo814toPxTmRCtEA2 + mo814toPxTmRCtEA3;
        if (f8 > m3561getMinDimensionimpl) {
            float f9 = m3561getMinDimensionimpl / f8;
            mo814toPxTmRCtEA2 *= f9;
            mo814toPxTmRCtEA3 *= f9;
        }
        if (mo814toPxTmRCtEA >= 0.0f && mo814toPxTmRCtEA2 >= 0.0f && mo814toPxTmRCtEA3 >= 0.0f && f7 >= 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return mo806createOutlineLjSzlW0(j5, mo814toPxTmRCtEA, mo814toPxTmRCtEA2, mo814toPxTmRCtEA3, f7, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo814toPxTmRCtEA + ", topEnd = " + mo814toPxTmRCtEA2 + ", bottomEnd = " + mo814toPxTmRCtEA3 + ", bottomStart = " + f7 + ")!").toString());
    }

    @l
    public final CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    @l
    public final CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @l
    public final CornerSize getTopEnd() {
        return this.topEnd;
    }

    @l
    public final CornerSize getTopStart() {
        return this.topStart;
    }
}
