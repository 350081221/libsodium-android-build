package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.colorspace.ColorSpace;

@kotlin.i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u000e\u001a\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0006*\u00020\u0011H\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    @p4.l
    /* renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m3602ActualImageBitmapx__hDU(int i5, int i6, int i7, boolean z4, @p4.l ColorSpace colorSpace) {
        Bitmap createBitmap;
        Bitmap.Config m3603toBitmapConfig1JJdX4A = m3603toBitmapConfig1JJdX4A(i7);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Api26Bitmap.m3641createBitmapx__hDU$ui_graphics_release(i5, i6, i7, z4, colorSpace);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i5, i6, m3603toBitmapConfig1JJdX4A);
            createBitmap.setHasAlpha(z4);
        }
        return new AndroidImageBitmap(createBitmap);
    }

    @p4.l
    public static final Bitmap asAndroidBitmap(@p4.l ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @p4.l
    public static final ImageBitmap asImageBitmap(@p4.l Bitmap bitmap) {
        return new AndroidImageBitmap(bitmap);
    }

    @p4.l
    /* renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m3603toBitmapConfig1JJdX4A(int i5) {
        Bitmap.Config config;
        Bitmap.Config config2;
        ImageBitmapConfig.Companion companion = ImageBitmapConfig.Companion;
        if (ImageBitmapConfig.m3949equalsimpl0(i5, companion.m3954getArgb8888_sVssgQ())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (ImageBitmapConfig.m3949equalsimpl0(i5, companion.m3953getAlpha8_sVssgQ())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (ImageBitmapConfig.m3949equalsimpl0(i5, companion.m3957getRgb565_sVssgQ())) {
            return Bitmap.Config.RGB_565;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && ImageBitmapConfig.m3949equalsimpl0(i5, companion.m3955getF16_sVssgQ())) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i6 >= 26 && ImageBitmapConfig.m3949equalsimpl0(i5, companion.m3956getGpu_sVssgQ())) {
            config = Bitmap.Config.HARDWARE;
            return config;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(@p4.l Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        if (config == Bitmap.Config.ALPHA_8) {
            return ImageBitmapConfig.Companion.m3953getAlpha8_sVssgQ();
        }
        if (config == Bitmap.Config.RGB_565) {
            return ImageBitmapConfig.Companion.m3957getRgb565_sVssgQ();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return ImageBitmapConfig.Companion.m3954getArgb8888_sVssgQ();
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            config3 = Bitmap.Config.RGBA_F16;
            if (config == config3) {
                return ImageBitmapConfig.Companion.m3955getF16_sVssgQ();
            }
        }
        if (i5 >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return ImageBitmapConfig.Companion.m3956getGpu_sVssgQ();
            }
        }
        return ImageBitmapConfig.Companion.m3954getArgb8888_sVssgQ();
    }
}
