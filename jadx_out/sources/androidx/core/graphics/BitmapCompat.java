package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public final class BitmapCompat {

    @RequiresApi(27)
    /* loaded from: classes2.dex */
    static class Api27Impl {
        private Api27Impl() {
        }

        @DoNotInline
        static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            Bitmap.Config config;
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config3 = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
                return bitmap.copy(config3, true);
            }
            return bitmap;
        }

        @DoNotInline
        static Bitmap createBitmapWithSourceColorspace(int i5, int i6, Bitmap bitmap, boolean z4) {
            ColorSpace colorSpace;
            ColorSpace.Named named;
            ColorSpace colorSpace2;
            Bitmap.Config config;
            Bitmap createBitmap;
            ColorSpace colorSpace3;
            boolean equals;
            Bitmap.Config config2 = bitmap.getConfig();
            colorSpace = bitmap.getColorSpace();
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace2 = ColorSpace.get(named);
            if (z4) {
                colorSpace3 = bitmap.getColorSpace();
                equals = colorSpace3.equals(colorSpace2);
                if (!equals) {
                    config2 = Bitmap.Config.RGBA_F16;
                    colorSpace = colorSpace2;
                    createBitmap = Bitmap.createBitmap(i5, i6, config2, bitmap.hasAlpha(), colorSpace);
                    return createBitmap;
                }
            }
            Bitmap.Config config3 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config3 == config) {
                config2 = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config2 = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            createBitmap = Bitmap.createBitmap(i5, i6, config2, bitmap.hasAlpha(), colorSpace);
            return createBitmap;
        }

        @DoNotInline
        static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            ColorSpace.Named named;
            ColorSpace colorSpace;
            Bitmap.Config config;
            ColorSpace colorSpace2;
            boolean equals;
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace = ColorSpace.get(named);
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.RGBA_F16;
            if (config2 == config) {
                colorSpace2 = bitmap.getColorSpace();
                equals = colorSpace2.equals(colorSpace);
                if (equals) {
                    return true;
                }
            }
            return false;
        }
    }

    @RequiresApi(29)
    /* loaded from: classes2.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void setPaintBlendMode(Paint paint) {
            BlendMode blendMode;
            blendMode = BlendMode.SRC;
            paint.setBlendMode(blendMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(31)
    /* loaded from: classes2.dex */
    public static class Api31Impl {
        private Api31Impl() {
        }

        @DoNotInline
        static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            HardwareBuffer hardwareBuffer;
            int format;
            Bitmap.Config config;
            hardwareBuffer = bitmap.getHardwareBuffer();
            format = hardwareBuffer.getFormat();
            if (format == 22) {
                config = Bitmap.Config.RGBA_F16;
                return config;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }

    private BitmapCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a6, code lost:
    
        if (androidx.core.graphics.BitmapCompat.Api27Impl.isAlreadyF16AndLinear(r11) == false) goto L122;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap createScaledBitmap(@androidx.annotation.NonNull android.graphics.Bitmap r21, int r22, int r23, @androidx.annotation.Nullable android.graphics.Rect r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.BitmapCompat.createScaledBitmap(android.graphics.Bitmap, int, int, android.graphics.Rect, boolean):android.graphics.Bitmap");
    }

    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z4) {
        bitmap.setHasMipMap(z4);
    }

    @VisibleForTesting
    static int sizeAtStep(int i5, int i6, int i7, int i8) {
        return i7 == 0 ? i6 : i7 > 0 ? i5 * (1 << (i8 - i7)) : i6 << ((-i7) - 1);
    }
}
