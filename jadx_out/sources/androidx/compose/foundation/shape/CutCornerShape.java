package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016JB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/CutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public CutCornerShape(@l CornerSize cornerSize, @l CornerSize cornerSize2, @l CornerSize cornerSize3, @l CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @l
    /* renamed from: createOutline-LjSzlW0 */
    public Outline mo806createOutlineLjSzlW0(long j5, float f5, float f6, float f7, float f8, @l LayoutDirection layoutDirection) {
        boolean z4;
        float f9;
        float f10;
        if (f5 + f6 + f8 + f7 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new Outline.Rectangle(SizeKt.m3583toRectuvyYCjk(j5));
        }
        Path Path = AndroidPath_androidKt.Path();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        if (layoutDirection == layoutDirection2) {
            f9 = f5;
        } else {
            f9 = f6;
        }
        Path.moveTo(0.0f, f9);
        Path.lineTo(f9, 0.0f);
        if (layoutDirection == layoutDirection2) {
            f5 = f6;
        }
        Path.lineTo(Size.m3562getWidthimpl(j5) - f5, 0.0f);
        Path.lineTo(Size.m3562getWidthimpl(j5), f5);
        if (layoutDirection == layoutDirection2) {
            f10 = f7;
        } else {
            f10 = f8;
        }
        Path.lineTo(Size.m3562getWidthimpl(j5), Size.m3559getHeightimpl(j5) - f10);
        Path.lineTo(Size.m3562getWidthimpl(j5) - f10, Size.m3559getHeightimpl(j5));
        if (layoutDirection == layoutDirection2) {
            f7 = f8;
        }
        Path.lineTo(f7, Size.m3559getHeightimpl(j5));
        Path.lineTo(0.0f, Size.m3559getHeightimpl(j5) - f7);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutCornerShape)) {
            return false;
        }
        CutCornerShape cutCornerShape = (CutCornerShape) obj;
        if (l0.g(getTopStart(), cutCornerShape.getTopStart()) && l0.g(getTopEnd(), cutCornerShape.getTopEnd()) && l0.g(getBottomEnd(), cutCornerShape.getBottomEnd()) && l0.g(getBottomStart(), cutCornerShape.getBottomStart())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @l
    public String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    @l
    public CutCornerShape copy(@l CornerSize cornerSize, @l CornerSize cornerSize2, @l CornerSize cornerSize3, @l CornerSize cornerSize4) {
        return new CutCornerShape(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }
}
