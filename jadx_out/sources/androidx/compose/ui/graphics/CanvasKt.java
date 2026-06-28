package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u001a+\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u001a\"\u0010\u0011\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r\u001a&\u0010\u0013\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r\u001a,\u0010\u0016\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "image", "Landroidx/compose/ui/graphics/Canvas;", "Canvas", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "withSave", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/graphics/Paint;", "paint", "withSaveLayer", "", "degrees", "pivotX", "pivotY", "rotate", "radians", "rotateRad", "sx", "sy", "scale", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CanvasKt {
    @p4.l
    public static final Canvas Canvas(@p4.l ImageBitmap imageBitmap) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap);
    }

    public static final void rotate(@p4.l Canvas canvas, float f5, float f6, float f7) {
        boolean z4;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        canvas.translate(f6, f7);
        canvas.rotate(f5);
        canvas.translate(-f6, -f7);
    }

    public static final void rotateRad(@p4.l Canvas canvas, float f5, float f6, float f7) {
        rotate(canvas, DegreesKt.degrees(f5), f6, f7);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f5, float f6, float f7, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        rotateRad(canvas, f5, f6, f7);
    }

    public static final void scale(@p4.l Canvas canvas, float f5, float f6, float f7, float f8) {
        boolean z4;
        boolean z5 = true;
        if (f5 == 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (f6 != 1.0f) {
                z5 = false;
            }
            if (z5) {
                return;
            }
        }
        canvas.translate(f7, f8);
        canvas.scale(f5, f6);
        canvas.translate(-f7, -f8);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f6 = f5;
        }
        scale(canvas, f5, f6, f7, f8);
    }

    public static final void withSave(@p4.l Canvas canvas, @p4.l v3.a<r2> aVar) {
        try {
            canvas.save();
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restore();
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withSaveLayer(@p4.l Canvas canvas, @p4.l Rect rect, @p4.l Paint paint, @p4.l v3.a<r2> aVar) {
        try {
            canvas.saveLayer(rect, paint);
            aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restore();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
