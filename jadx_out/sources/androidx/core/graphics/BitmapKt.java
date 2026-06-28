package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0086\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b\u001a7\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0087\b\u001a\u0015\u0010\u001a\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\n\u001a\u0015\u0010\u001a\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001bH\u0086\n¨\u0006\u001c"}, d2 = {"Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/r2;", "Lkotlin/u;", "block", "applyCanvas", "", "x", "y", "get", TypedValues.Custom.S_COLOR, "set", "width", "height", "", "filter", "scale", "Landroid/graphics/Bitmap$Config;", "config", "createBitmap", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "Landroid/graphics/Point;", bi.aA, "contains", "Landroid/graphics/PointF;", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BitmapKt {
    @p4.l
    public static final Bitmap applyCanvas(@p4.l Bitmap bitmap, @p4.l v3.l<? super Canvas, r2> lVar) {
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(@p4.l Bitmap bitmap, @p4.l Point point) {
        int i5;
        int width = bitmap.getWidth();
        int i6 = point.x;
        return (i6 >= 0 && i6 < width) && (i5 = point.y) >= 0 && i5 < bitmap.getHeight();
    }

    @p4.l
    public static final Bitmap createBitmap(int i5, int i6, @p4.l Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i6, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i5, int i6, Bitmap.Config config, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    public static final int get(@p4.l Bitmap bitmap, int i5, int i6) {
        return bitmap.getPixel(i5, i6);
    }

    @p4.l
    public static final Bitmap scale(@p4.l Bitmap bitmap, int i5, int i6, boolean z4) {
        return Bitmap.createScaledBitmap(bitmap, i5, i6, z4);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z4 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i5, i6, z4);
    }

    public static final void set(@p4.l Bitmap bitmap, int i5, int i6, @ColorInt int i7) {
        bitmap.setPixel(i5, i6, i7);
    }

    public static final boolean contains(@p4.l Bitmap bitmap, @p4.l PointF pointF) {
        float f5 = pointF.x;
        if (f5 >= 0.0f && f5 < bitmap.getWidth()) {
            float f6 = pointF.y;
            if (f6 >= 0.0f && f6 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Bitmap createBitmap(int i5, int i6, @p4.l Bitmap.Config config, boolean z4, @p4.l ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap(i5, i6, config, z4, colorSpace);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i5, int i6, Bitmap.Config config, boolean z4, ColorSpace colorSpace, int i7, Object obj) {
        Bitmap createBitmap;
        ColorSpace.Named named;
        if ((i7 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i7 & 8) != 0) {
            z4 = true;
        }
        if ((i7 & 16) != 0) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
        }
        createBitmap = Bitmap.createBitmap(i5, i6, config, z4, colorSpace);
        return createBitmap;
    }
}
