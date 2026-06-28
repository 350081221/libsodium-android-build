package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import kotlin.i0;
import org.apache.http.cookie.ClientCookie;
import p4.l;

@DrawScopeMarker
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&JD\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&J$\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020$8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010&ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "", "left", "top", "right", "bottom", "Lkotlin/r2;", "inset", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "translate", "degrees", "Landroidx/compose/ui/geometry/Offset;", "pivot", "rotate-Uv8p0NA", "(FJ)V", "rotate", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "scale", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "getCenter-F1C5BW0", "center", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface DrawTransform {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4334getCenterF1C5BW0(@l DrawTransform drawTransform) {
            return DrawTransform.super.mo4206getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static /* synthetic */ void m4328clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i6 & 2) != 0) {
            i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
        }
        drawTransform.mo4204clipPathmtrdDE(path, i5);
    }

    /* renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static /* synthetic */ void m4329clipRectN_I0leg$default(DrawTransform drawTransform, float f5, float f6, float f7, float f8, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                f5 = 0.0f;
            }
            if ((i6 & 2) != 0) {
                f6 = 0.0f;
            }
            if ((i6 & 4) != 0) {
                f7 = Size.m3562getWidthimpl(drawTransform.mo4207getSizeNHjbRc());
            }
            if ((i6 & 8) != 0) {
                f8 = Size.m3559getHeightimpl(drawTransform.mo4207getSizeNHjbRc());
            }
            if ((i6 & 16) != 0) {
                i5 = ClipOp.Companion.m3723getIntersectrtfAjoo();
            }
            drawTransform.mo4205clipRectN_I0leg(f5, f6, f7, f8, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m4330rotateUv8p0NA$default(DrawTransform drawTransform, float f5, long j5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i5 & 2) != 0) {
            j5 = drawTransform.mo4206getCenterF1C5BW0();
        }
        drawTransform.mo4208rotateUv8p0NA(f5, j5);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m4331scale0AR0LA0$default(DrawTransform drawTransform, float f5, float f6, long j5, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i5 & 4) != 0) {
            j5 = drawTransform.mo4206getCenterF1C5BW0();
        }
        drawTransform.mo4209scale0AR0LA0(f5, f6, j5);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f5, float f6, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        drawTransform.translate(f5, f6);
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo4204clipPathmtrdDE(@l Path path, int i5);

    /* renamed from: clipRect-N_I0leg */
    void mo4205clipRectN_I0leg(float f5, float f6, float f7, float f8, int i5);

    /* renamed from: getCenter-F1C5BW0 */
    default long mo4206getCenterF1C5BW0() {
        float f5 = 2;
        return OffsetKt.Offset(Size.m3562getWidthimpl(mo4207getSizeNHjbRc()) / f5, Size.m3559getHeightimpl(mo4207getSizeNHjbRc()) / f5);
    }

    /* renamed from: getSize-NH-jbRc */
    long mo4207getSizeNHjbRc();

    void inset(float f5, float f6, float f7, float f8);

    /* renamed from: rotate-Uv8p0NA */
    void mo4208rotateUv8p0NA(float f5, long j5);

    /* renamed from: scale-0AR0LA0 */
    void mo4209scale0AR0LA0(float f5, float f6, long j5);

    /* renamed from: transform-58bKbWc */
    void mo4210transform58bKbWc(@l float[] fArr);

    void translate(float f5, float f6);
}
