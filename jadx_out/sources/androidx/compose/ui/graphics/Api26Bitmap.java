package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0001¢\u0006\u0002\b\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Bitmap {

    @p4.l
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @p4.l
    @DoNotInline
    @u3.m
    public static final ColorSpace composeColorSpace$ui_graphics_release(@p4.l Bitmap bitmap) {
        android.graphics.ColorSpace colorSpace;
        ColorSpace composeColorSpace;
        colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (composeColorSpace = AndroidColorSpace_androidKt.toComposeColorSpace(colorSpace)) == null) ? ColorSpaces.INSTANCE.getSrgb() : composeColorSpace;
    }

    @p4.l
    @DoNotInline
    @u3.m
    /* renamed from: createBitmap-x__-hDU$ui_graphics_release */
    public static final Bitmap m3641createBitmapx__hDU$ui_graphics_release(int i5, int i6, int i7, boolean z4, @p4.l ColorSpace colorSpace) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i5, i6, AndroidImageBitmap_androidKt.m3603toBitmapConfig1JJdX4A(i7), z4, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace));
        return createBitmap;
    }
}
