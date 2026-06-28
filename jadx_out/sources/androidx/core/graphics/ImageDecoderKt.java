package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import kotlin.r2;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b\u001aR\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b¨\u0006\u000f"}, d2 = {"Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/v0;", "name", "info", "source", "Lkotlin/r2;", "Lkotlin/u;", "action", "Landroid/graphics/Bitmap;", "decodeBitmap", "Landroid/graphics/drawable/Drawable;", "decodeDrawable", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes2.dex */
public final class ImageDecoderKt {
    @p4.l
    @RequiresApi(28)
    public static final Bitmap decodeBitmap(@p4.l ImageDecoder.Source source, @p4.l final v3.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, r2> qVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(@p4.l ImageDecoder imageDecoder, @p4.l ImageDecoder.ImageInfo imageInfo, @p4.l ImageDecoder.Source source2) {
                qVar.invoke(imageDecoder, imageInfo, source2);
            }
        });
        return decodeBitmap;
    }

    @p4.l
    @RequiresApi(28)
    public static final Drawable decodeDrawable(@p4.l ImageDecoder.Source source, @p4.l final v3.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, r2> qVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(@p4.l ImageDecoder imageDecoder, @p4.l ImageDecoder.ImageInfo imageInfo, @p4.l ImageDecoder.Source source2) {
                qVar.invoke(imageDecoder, imageInfo, source2);
            }
        });
        return decodeDrawable;
    }
}
