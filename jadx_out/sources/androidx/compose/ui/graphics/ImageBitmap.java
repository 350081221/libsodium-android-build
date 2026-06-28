package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJL\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u000bH&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "Lkotlin/r2;", "readPixels", "prepareToDraw", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "", "getHasAlpha", "()Z", "hasAlpha", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "config", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ImageBitmap {

    @p4.l
    public static final Companion Companion = Companion.$$INSTANCE;

    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void readPixels$default(ImageBitmap imageBitmap, int[] iArr, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (obj == null) {
            int i17 = 0;
            if ((i11 & 2) != 0) {
                i12 = 0;
            } else {
                i12 = i5;
            }
            if ((i11 & 4) != 0) {
                i13 = 0;
            } else {
                i13 = i6;
            }
            if ((i11 & 8) != 0) {
                i14 = imageBitmap.getWidth();
            } else {
                i14 = i7;
            }
            if ((i11 & 16) != 0) {
                i15 = imageBitmap.getHeight();
            } else {
                i15 = i8;
            }
            if ((i11 & 32) == 0) {
                i17 = i9;
            }
            if ((i11 & 64) != 0) {
                i16 = i14;
            } else {
                i16 = i10;
            }
            imageBitmap.readPixels(iArr, i12, i13, i14, i15, i17, i16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
    }

    @p4.l
    ColorSpace getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo3601getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(@p4.l int[] iArr, int i5, int i6, int i7, int i8, int i9, int i10);
}
