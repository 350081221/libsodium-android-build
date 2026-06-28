package com.lody.virtual.helper.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public class BitmapUtils {
    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap.Config config;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap warrperIcon(Bitmap bitmap, int i5, int i6) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= i5 && height >= i6) {
            Matrix matrix = new Matrix();
            matrix.postScale(i5 / width, i6 / height);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        }
        return bitmap;
    }
}
