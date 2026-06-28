package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;

@kotlin.i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aP\u0010\r\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"ImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "toPixelMap", "Landroidx/compose/ui/graphics/PixelMap;", "startX", "startY", "buffer", "", "bufferOffset", "stride", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageBitmapKt {
    @p4.l
    /* renamed from: ImageBitmap-x__-hDU, reason: not valid java name */
    public static final ImageBitmap m3958ImageBitmapx__hDU(int i5, int i6, int i7, boolean z4, @p4.l ColorSpace colorSpace) {
        return AndroidImageBitmap_androidKt.m3602ActualImageBitmapx__hDU(i5, i6, i7, z4, colorSpace);
    }

    /* renamed from: ImageBitmap-x__-hDU$default, reason: not valid java name */
    public static /* synthetic */ ImageBitmap m3959ImageBitmapx__hDU$default(int i5, int i6, int i7, boolean z4, ColorSpace colorSpace, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i7 = ImageBitmapConfig.Companion.m3954getArgb8888_sVssgQ();
        }
        if ((i8 & 8) != 0) {
            z4 = true;
        }
        if ((i8 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return m3958ImageBitmapx__hDU(i5, i6, i7, z4, colorSpace);
    }

    @p4.l
    public static final PixelMap toPixelMap(@p4.l ImageBitmap imageBitmap, int i5, int i6, int i7, int i8, @p4.l int[] iArr, int i9, int i10) {
        imageBitmap.readPixels(iArr, i5, i6, i7, i8, i9, i10);
        return new PixelMap(iArr, i7, i8, i9, i10);
    }

    public static /* synthetic */ PixelMap toPixelMap$default(ImageBitmap imageBitmap, int i5, int i6, int i7, int i8, int[] iArr, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = 0;
        }
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i7 = imageBitmap.getWidth();
        }
        if ((i11 & 8) != 0) {
            i8 = imageBitmap.getHeight();
        }
        if ((i11 & 16) != 0) {
            iArr = new int[i7 * i8];
        }
        if ((i11 & 32) != 0) {
            i9 = 0;
        }
        if ((i11 & 64) != 0) {
            i10 = i7;
        }
        return toPixelMap(imageBitmap, i5, i6, i7, i8, iArr, i9, i10);
    }
}
