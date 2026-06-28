package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a:\u0010\t\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aD\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aN\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a:\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a0\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aF\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001aF\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b\u001a.\u0010\u0015\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003H\u0086\b¨\u0006\u001e"}, d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lkotlin/r2;", "Lkotlin/u;", "block", "withSave", "", "x", "y", "withTranslation", "degrees", "pivotX", "pivotY", "withRotation", "withScale", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "Landroid/graphics/Rect;", "clipRect", "withClip", "Landroid/graphics/RectF;", "", "left", "top", "right", "bottom", "Landroid/graphics/Path;", "clipPath", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CanvasKt {
    public static final void withClip(@p4.l Canvas canvas, @p4.l Rect rect, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withMatrix(@p4.l Canvas canvas, @p4.l Matrix matrix, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withRotation(@p4.l Canvas canvas, float f5, float f6, float f7, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.rotate(f5, f6, f7);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f5, float f6, float f7, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f5, f6, f7);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withSave(@p4.l Canvas canvas, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withScale(@p4.l Canvas canvas, float f5, float f6, float f7, float f8, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.scale(f5, f6, f7, f8);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f5, float f6, float f7, float f8, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 1.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        if ((i5 & 8) != 0) {
            f8 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f5, f6, f7, f8);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withSkew(@p4.l Canvas canvas, float f5, float f6, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.skew(f5, f6);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f5, float f6, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f5, f6);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withTranslation(@p4.l Canvas canvas, float f5, float f6, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.translate(f5, f6);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f5, float f6, v3.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f5, f6);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withClip(@p4.l Canvas canvas, @p4.l RectF rectF, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withClip(@p4.l Canvas canvas, int i5, int i6, int i7, int i8, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.clipRect(i5, i6, i7, i8);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withClip(@p4.l Canvas canvas, float f5, float f6, float f7, float f8, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.clipRect(f5, f6, f7, f8);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }

    public static final void withClip(@p4.l Canvas canvas, @p4.l Path path, @p4.l v3.l<? super Canvas, r2> lVar) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            kotlin.jvm.internal.i0.d(1);
            canvas.restoreToCount(save);
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
