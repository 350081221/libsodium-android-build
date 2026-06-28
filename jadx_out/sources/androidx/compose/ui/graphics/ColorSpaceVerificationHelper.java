package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class ColorSpaceVerificationHelper {

    @p4.l
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    @u3.m
    @p4.l
    @DoNotInline
    @RequiresApi(26)
    public static final ColorSpace androidColorSpace(@p4.l androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace.Named named;
        ColorSpace colorSpace2;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        ColorSpace.Named named2;
        ColorSpace colorSpace3;
        ColorSpace.Named named3;
        ColorSpace colorSpace4;
        ColorSpace.Named named4;
        ColorSpace colorSpace5;
        ColorSpace.Named named5;
        ColorSpace colorSpace6;
        ColorSpace.Named named6;
        ColorSpace colorSpace7;
        ColorSpace.Named named7;
        ColorSpace colorSpace8;
        ColorSpace.Named named8;
        ColorSpace colorSpace9;
        ColorSpace.Named named9;
        ColorSpace colorSpace10;
        ColorSpace.Named named10;
        ColorSpace colorSpace11;
        ColorSpace.Named named11;
        ColorSpace colorSpace12;
        ColorSpace.Named named12;
        ColorSpace colorSpace13;
        ColorSpace.Named named13;
        ColorSpace colorSpace14;
        ColorSpace.Named named14;
        ColorSpace colorSpace15;
        ColorSpace.Named named15;
        ColorSpace colorSpace16;
        ColorSpace.Named named16;
        ColorSpace colorSpace17;
        ColorSpace.Named named17;
        ColorSpace colorSpace18;
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getSrgb())) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace18 = ColorSpace.get(named17);
            return colorSpace18;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getAces())) {
            named16 = ColorSpace.Named.ACES;
            colorSpace17 = ColorSpace.get(named16);
            return colorSpace17;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getAcescg())) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace16 = ColorSpace.get(named15);
            return colorSpace16;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getAdobeRgb())) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace15 = ColorSpace.get(named14);
            return colorSpace15;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getBt2020())) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace14 = ColorSpace.get(named13);
            return colorSpace14;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getBt709())) {
            named12 = ColorSpace.Named.BT709;
            colorSpace13 = ColorSpace.get(named12);
            return colorSpace13;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getCieLab())) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace12 = ColorSpace.get(named11);
            return colorSpace12;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getCieXyz())) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace11 = ColorSpace.get(named10);
            return colorSpace11;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getDciP3())) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace10 = ColorSpace.get(named9);
            return colorSpace10;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getDisplayP3())) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace9 = ColorSpace.get(named8);
            return colorSpace9;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getExtendedSrgb())) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace8 = ColorSpace.get(named7);
            return colorSpace8;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named6);
            return colorSpace7;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getLinearSrgb())) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace6 = ColorSpace.get(named5);
            return colorSpace6;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getNtsc1953())) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace5 = ColorSpace.get(named4);
            return colorSpace5;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getProPhotoRgb())) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace4 = ColorSpace.get(named3);
            return colorSpace4;
        }
        if (kotlin.jvm.internal.l0.g(colorSpace, colorSpaces.getSmpteC())) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace3 = ColorSpace.get(named2);
            return colorSpace3;
        }
        if (colorSpace instanceof Rgb) {
            Rgb rgb2 = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            TransferParameters transferParameters2 = rgb2.getTransferParameters();
            if (transferParameters2 != null) {
                transferParameters = new ColorSpace.Rgb.TransferParameters(transferParameters2.getA(), transferParameters2.getB(), transferParameters2.getC(), transferParameters2.getD(), transferParameters2.getE(), transferParameters2.getF(), transferParameters2.getGamma());
            } else {
                transferParameters = null;
            }
            if (transferParameters != null) {
                rgb = new ColorSpace.Rgb(colorSpace.getName(), ((Rgb) colorSpace).getPrimaries$ui_graphics_release(), xyz$ui_graphics_release, transferParameters);
            } else {
                String name = colorSpace.getName();
                Rgb rgb3 = (Rgb) colorSpace;
                float[] primaries$ui_graphics_release = rgb3.getPrimaries$ui_graphics_release();
                final v3.l<Double, Double> oetf = rgb3.getOetf();
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.c2
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d5) {
                        double androidColorSpace$lambda$0;
                        androidColorSpace$lambda$0 = ColorSpaceVerificationHelper.androidColorSpace$lambda$0(v3.l.this, d5);
                        return androidColorSpace$lambda$0;
                    }
                };
                final v3.l<Double, Double> eotf = rgb3.getEotf();
                rgb = new ColorSpace.Rgb(name, primaries$ui_graphics_release, xyz$ui_graphics_release, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.d2
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d5) {
                        double androidColorSpace$lambda$1;
                        androidColorSpace$lambda$1 = ColorSpaceVerificationHelper.androidColorSpace$lambda$1(v3.l.this, d5);
                        return androidColorSpace$lambda$1;
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
            }
            return rgb;
        }
        named = ColorSpace.Named.SRGB;
        colorSpace2 = ColorSpace.get(named);
        return colorSpace2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(v3.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(v3.l lVar, double d5) {
        return ((Number) lVar.invoke(Double.valueOf(d5))).doubleValue();
    }

    @u3.m
    @p4.l
    @DoNotInline
    @RequiresApi(26)
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(@p4.l final ColorSpace colorSpace) {
        int id;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        WhitePoint whitePoint2;
        float[] whitePoint3;
        float[] whitePoint4;
        TransferParameters transferParameters2;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id2;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        float[] whitePoint5;
        float[] whitePoint6;
        float[] whitePoint7;
        id = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id == ordinal) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        named2 = ColorSpace.Named.ACES;
        ordinal2 = named2.ordinal();
        if (id == ordinal2) {
            return ColorSpaces.INSTANCE.getAces();
        }
        named3 = ColorSpace.Named.ACESCG;
        ordinal3 = named3.ordinal();
        if (id == ordinal3) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        named4 = ColorSpace.Named.ADOBE_RGB;
        ordinal4 = named4.ordinal();
        if (id == ordinal4) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        named5 = ColorSpace.Named.BT2020;
        ordinal5 = named5.ordinal();
        if (id == ordinal5) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        named6 = ColorSpace.Named.BT709;
        ordinal6 = named6.ordinal();
        if (id == ordinal6) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        named7 = ColorSpace.Named.CIE_LAB;
        ordinal7 = named7.ordinal();
        if (id == ordinal7) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        named8 = ColorSpace.Named.CIE_XYZ;
        ordinal8 = named8.ordinal();
        if (id == ordinal8) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        named9 = ColorSpace.Named.DCI_P3;
        ordinal9 = named9.ordinal();
        if (id == ordinal9) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        named10 = ColorSpace.Named.DISPLAY_P3;
        ordinal10 = named10.ordinal();
        if (id == ordinal10) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        named11 = ColorSpace.Named.EXTENDED_SRGB;
        ordinal11 = named11.ordinal();
        if (id == ordinal11) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        ordinal12 = named12.ordinal();
        if (id == ordinal12) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        named13 = ColorSpace.Named.LINEAR_SRGB;
        ordinal13 = named13.ordinal();
        if (id == ordinal13) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        named14 = ColorSpace.Named.NTSC_1953;
        ordinal14 = named14.ordinal();
        if (id == ordinal14) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        named15 = ColorSpace.Named.PRO_PHOTO_RGB;
        ordinal15 = named15.ordinal();
        if (id == ordinal15) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        named16 = ColorSpace.Named.SMPTE_C;
        ordinal16 = named16.ordinal();
        if (id == ordinal16) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (colorSpace instanceof ColorSpace.Rgb) {
            ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
            transferParameters = rgb.getTransferParameters();
            whitePoint = rgb.getWhitePoint();
            if (whitePoint.length == 3) {
                whitePoint5 = rgb.getWhitePoint();
                float f5 = whitePoint5[0];
                whitePoint6 = rgb.getWhitePoint();
                float f6 = whitePoint6[1];
                whitePoint7 = rgb.getWhitePoint();
                whitePoint2 = new WhitePoint(f5, f6, whitePoint7[2]);
            } else {
                whitePoint3 = rgb.getWhitePoint();
                float f7 = whitePoint3[0];
                whitePoint4 = rgb.getWhitePoint();
                whitePoint2 = new WhitePoint(f7, whitePoint4[1]);
            }
            WhitePoint whitePoint8 = whitePoint2;
            if (transferParameters != null) {
                d5 = transferParameters.g;
                d6 = transferParameters.a;
                d7 = transferParameters.b;
                d8 = transferParameters.c;
                d9 = transferParameters.d;
                d10 = transferParameters.e;
                d11 = transferParameters.f;
                transferParameters2 = new TransferParameters(d5, d6, d7, d8, d9, d10, d11);
            } else {
                transferParameters2 = null;
            }
            name = rgb.getName();
            primaries = rgb.getPrimaries();
            transform = rgb.getTransform();
            DoubleFunction doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.e2
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d12) {
                    double composeColorSpace$lambda$2;
                    composeColorSpace$lambda$2 = ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d12);
                    return composeColorSpace$lambda$2;
                }
            };
            DoubleFunction doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.f2
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d12) {
                    double composeColorSpace$lambda$3;
                    composeColorSpace$lambda$3 = ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d12);
                    return composeColorSpace$lambda$3;
                }
            };
            minValue = colorSpace.getMinValue(0);
            maxValue = colorSpace.getMaxValue(0);
            id2 = rgb.getId();
            return new Rgb(name, primaries, whitePoint8, transform, doubleFunction, doubleFunction2, minValue, maxValue, transferParameters2, id2);
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace colorSpace, double d5) {
        DoubleUnaryOperator oetf;
        oetf = ((ColorSpace.Rgb) colorSpace).getOetf();
        return oetf.applyAsDouble(d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace colorSpace, double d5) {
        DoubleUnaryOperator eotf;
        eotf = ((ColorSpace.Rgb) colorSpace).getEotf();
        return eotf.applyAsDouble(d5);
    }
}
