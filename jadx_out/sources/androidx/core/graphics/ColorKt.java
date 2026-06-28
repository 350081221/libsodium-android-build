package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;

@kotlin.i0(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001f\u001a\u00020\u0019*\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0087\u0002\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020#H\u0087\b\u001a\r\u0010$\u001a\u00020\u0005*\u00020\u0001H\u0087\b\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0000\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\n*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\"\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003\"\u0016\u0010\u0016\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006¨\u0006%"}, d2 = {"alpha", "", "getAlpha", "(I)I", "", "", "(J)F", "blue", "getBlue", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "green", "getGreen", "isSrgb", "", "(J)Z", "isWideGamut", "luminance", "getLuminance", "(I)F", "red", "getRed", "component1", "Landroid/graphics/Color;", "component2", "component3", "component4", "convertTo", "Landroid/graphics/ColorSpace$Named;", "plus", "c", "toColor", "toColorInt", "", "toColorLong", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ColorKt {
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(@p4.l Color color) {
        float component;
        component = color.getComponent(0);
        return component;
    }

    public static final int component1(@ColorInt int i5) {
        return (i5 >> 24) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(@p4.l Color color) {
        float component;
        component = color.getComponent(1);
        return component;
    }

    public static final int component2(@ColorInt int i5) {
        return (i5 >> 16) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(@p4.l Color color) {
        float component;
        component = color.getComponent(2);
        return component;
    }

    public static final int component3(@ColorInt int i5) {
        return (i5 >> 8) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(@p4.l Color color) {
        float component;
        component = color.getComponent(3);
        return component;
    }

    public static final int component4(@ColorInt int i5) {
        return i5 & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i5, @p4.l ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(i5, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getAlpha(long j5) {
        float alpha;
        alpha = Color.alpha(j5);
        return alpha;
    }

    public static final int getAlpha(@ColorInt int i5) {
        return (i5 >> 24) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getBlue(long j5) {
        float blue;
        blue = Color.blue(j5);
        return blue;
    }

    public static final int getBlue(@ColorInt int i5) {
        return i5 & 255;
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorSpace getColorSpace(long j5) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j5);
        return colorSpace;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getGreen(long j5) {
        float green;
        green = Color.green(j5);
        return green;
    }

    public static final int getGreen(@ColorInt int i5) {
        return (i5 >> 8) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(@ColorInt int i5) {
        return Color.luminance(i5);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getRed(long j5) {
        float red;
        red = Color.red(j5);
        return red;
    }

    public static final int getRed(@ColorInt int i5) {
        return (i5 >> 16) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isSrgb(long j5) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j5);
        return isSrgb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long j5) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j5);
        return isWideGamut;
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color plus(@p4.l Color color, @p4.l Color color2) {
        return ColorUtils.compositeColors(color2, color);
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color toColor(@ColorInt int i5) {
        Color valueOf;
        valueOf = Color.valueOf(i5);
        return valueOf;
    }

    @ColorInt
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int toColorInt(long j5) {
        int argb;
        argb = Color.toArgb(j5);
        return argb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long toColorLong(@ColorInt int i5) {
        long pack;
        pack = Color.pack(i5);
        return pack;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(long j5) {
        float red;
        red = Color.red(j5);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(long j5) {
        float green;
        green = Color.green(j5);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(long j5) {
        float blue;
        blue = Color.blue(j5);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(long j5) {
        float alpha;
        alpha = Color.alpha(j5);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i5, @p4.l ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(i5, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(long j5) {
        float luminance;
        luminance = Color.luminance(j5);
        return luminance;
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color toColor(long j5) {
        Color valueOf;
        valueOf = Color.valueOf(j5);
        return valueOf;
    }

    @ColorInt
    public static final int toColorInt(@p4.l String str) {
        return Color.parseColor(str);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j5, @p4.l ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(j5, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j5, @p4.l ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(j5, colorSpace);
        return convert;
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color convertTo(@p4.l Color color, @p4.l ColorSpace.Named named) {
        ColorSpace colorSpace;
        Color convert;
        colorSpace = ColorSpace.get(named);
        convert = color.convert(colorSpace);
        return convert;
    }

    @p4.l
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color convertTo(@p4.l Color color, @p4.l ColorSpace colorSpace) {
        Color convert;
        convert = color.convert(colorSpace);
        return convert;
    }
}
