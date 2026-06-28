package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a:\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", ClientCookie.PATH_ATTR, "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        if (CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m3469getYimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight()) {
            return true;
        }
        return false;
    }

    public static final boolean isInOutline(@p4.l Outline outline, float f5, float f6, @p4.m Path path, @p4.m Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f5, f6);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f5, f6, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f5, f6, path, path2);
        }
        throw new kotlin.j0();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f5, float f6, Path path, Path path2, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            path = null;
        }
        if ((i5 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f5, f6, path, path2);
    }

    private static final boolean isInPath(Path path, float f5, float f6, Path path2, Path path3) {
        Rect rect = new Rect(f5 - 0.005f, f6 - 0.005f, f5 + 0.005f, f6 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo3626opN5in7k0(path, path2, PathOperation.Companion.m4025getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f5, float f6) {
        return rect.getLeft() <= f5 && f5 < rect.getRight() && rect.getTop() <= f6 && f6 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f5, float f6, Path path, Path path2) {
        Path path3;
        RoundRect roundRect = rounded.getRoundRect();
        if (f5 >= roundRect.getLeft() && f5 < roundRect.getRight() && f6 >= roundRect.getTop() && f6 < roundRect.getBottom()) {
            if (!cornersFit(roundRect)) {
                if (path2 == null) {
                    path3 = AndroidPath_androidKt.Path();
                } else {
                    path3 = path2;
                }
                path3.addRoundRect(roundRect);
                return isInPath(path3, f5, f6, path, path2);
            }
            float m3468getXimpl = CornerRadius.m3468getXimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            float m3469getYimpl = CornerRadius.m3469getYimpl(roundRect.m3543getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right = roundRect.getRight() - CornerRadius.m3468getXimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs());
            float m3469getYimpl2 = CornerRadius.m3469getYimpl(roundRect.m3544getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right2 = roundRect.getRight() - CornerRadius.m3468getXimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs());
            float bottom = roundRect.getBottom() - CornerRadius.m3469getYimpl(roundRect.m3542getBottomRightCornerRadiuskKHJgLs());
            float bottom2 = roundRect.getBottom() - CornerRadius.m3469getYimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs());
            float m3468getXimpl2 = CornerRadius.m3468getXimpl(roundRect.m3541getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            if (f5 < m3468getXimpl && f6 < m3469getYimpl) {
                return m5349isWithinEllipseVE1yxkc(f5, f6, roundRect.m3543getTopLeftCornerRadiuskKHJgLs(), m3468getXimpl, m3469getYimpl);
            }
            if (f5 < m3468getXimpl2 && f6 > bottom2) {
                return m5349isWithinEllipseVE1yxkc(f5, f6, roundRect.m3541getBottomLeftCornerRadiuskKHJgLs(), m3468getXimpl2, bottom2);
            }
            if (f5 > right && f6 < m3469getYimpl2) {
                return m5349isWithinEllipseVE1yxkc(f5, f6, roundRect.m3544getTopRightCornerRadiuskKHJgLs(), right, m3469getYimpl2);
            }
            if (f5 > right2 && f6 > bottom) {
                return m5349isWithinEllipseVE1yxkc(f5, f6, roundRect.m3542getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
            }
            return true;
        }
        return false;
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m5349isWithinEllipseVE1yxkc(float f5, float f6, long j5, float f7, float f8) {
        float f9 = f5 - f7;
        float f10 = f6 - f8;
        float m3468getXimpl = CornerRadius.m3468getXimpl(j5);
        float m3469getYimpl = CornerRadius.m3469getYimpl(j5);
        if (((f9 * f9) / (m3468getXimpl * m3468getXimpl)) + ((f10 * f10) / (m3469getYimpl * m3469getYimpl)) <= 1.0f) {
            return true;
        }
        return false;
    }
}
