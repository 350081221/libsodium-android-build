package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

@i0(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0000\u001a8\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010$\u001a\u00020%*\u00020%2\u0006\u0010&\u001a\u00020\u00112\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a(\u0010)\u001a\u00020**\u00020%2\b\b\u0002\u0010+\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020-ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"absRcpResponse", "", "x", bi.ay, "b", "c", "d", socket.g.f22386a, "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "mul3x3Float3_0", "", "r0", "r1", "r2", "mul3x3Float3_1", "mul3x3Float3_2", "rcpResponse", "e", "f", "response", "adapt", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "Landroidx/compose/ui/graphics/colorspace/Connector;", "destination", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d5, double d6, double d7, double d8, double d9, double d10) {
        return Math.copySign(rcpResponse(d5 < 0.0d ? -d5 : d5, d6, d7, d8, d9, d10), d5);
    }

    public static final double absResponse(double d5, double d6, double d7, double d8, double d9, double d10) {
        return Math.copySign(response(d5 < 0.0d ? -d5 : d5, d6, d7, d8, d9, d10), d5);
    }

    @p4.l
    @u3.i
    public static final ColorSpace adapt(@p4.l ColorSpace colorSpace, @p4.l WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    @p4.l
    @u3.i
    public static final ColorSpace adapt(@p4.l ColorSpace colorSpace, @p4.l WhitePoint whitePoint, @p4.l Adaptation adaptation) {
        if (ColorModel.m4139equalsimpl0(colorSpace.m4148getModelxdoWZVw(), ColorModel.Companion.m4146getRgbxdoWZVw())) {
            l0.n(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (compare(rgb.getWhitePoint(), whitePoint)) {
                return colorSpace;
            }
            return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
        }
        return colorSpace;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @p4.l
    public static final float[] chromaticAdaptation(@p4.l float[] fArr, @p4.l float[] fArr2, @p4.l float[] fArr3) {
        float[] mul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] mul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{mul3x3Float32[0] / mul3x3Float3[0], mul3x3Float32[1] / mul3x3Float3[1], mul3x3Float32[2] / mul3x3Float3[2]}, fArr));
    }

    public static final boolean compare(@p4.l TransferParameters transferParameters, @p4.m TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    @p4.l
    /* renamed from: connect-YBCOT_4 */
    public static final Connector m4150connectYBCOT_4(@p4.l ColorSpace colorSpace, @p4.l ColorSpace colorSpace2, int i5) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (colorSpace == colorSpaces.getSrgb()) {
            if (colorSpace2 == colorSpaces.getSrgb()) {
                return Connector.Companion.getSrgbIdentity$ui_graphics_release();
            }
            if (colorSpace2 == colorSpaces.getOklab() && RenderIntent.m4160equalsimpl0(i5, RenderIntent.Companion.m4165getPerceptualuksYyKA())) {
                return Connector.Companion.getSrgbToOklabPerceptual$ui_graphics_release();
            }
        } else if (colorSpace == colorSpaces.getOklab() && colorSpace2 == colorSpaces.getSrgb() && RenderIntent.m4160equalsimpl0(i5, RenderIntent.Companion.m4165getPerceptualuksYyKA())) {
            return Connector.Companion.getOklabToSrgbPerceptual$ui_graphics_release();
        }
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace);
        }
        long m4148getModelxdoWZVw = colorSpace.m4148getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        w wVar = null;
        if (ColorModel.m4139equalsimpl0(m4148getModelxdoWZVw, companion.m4146getRgbxdoWZVw()) && ColorModel.m4139equalsimpl0(colorSpace2.m4148getModelxdoWZVw(), companion.m4146getRgbxdoWZVw())) {
            l0.n(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            l0.n(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i5, wVar);
        }
        return new Connector(colorSpace, colorSpace2, i5, wVar);
    }

    /* renamed from: connect-YBCOT_4$default */
    public static /* synthetic */ Connector m4151connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i6 & 2) != 0) {
            i5 = RenderIntent.Companion.m4165getPerceptualuksYyKA();
        }
        return m4150connectYBCOT_4(colorSpace, colorSpace2, i5);
    }

    @p4.l
    public static final float[] inverse3x3(@p4.l float[] fArr) {
        float f5 = fArr[0];
        float f6 = fArr[3];
        float f7 = fArr[6];
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = fArr[2];
        float f12 = fArr[5];
        float f13 = fArr[8];
        float f14 = (f9 * f13) - (f10 * f12);
        float f15 = (f10 * f11) - (f8 * f13);
        float f16 = (f8 * f12) - (f9 * f11);
        float f17 = (f5 * f14) + (f6 * f15) + (f7 * f16);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f14 / f17;
        fArr2[1] = f15 / f17;
        fArr2[2] = f16 / f17;
        fArr2[3] = ((f7 * f12) - (f6 * f13)) / f17;
        fArr2[4] = ((f13 * f5) - (f7 * f11)) / f17;
        fArr2[5] = ((f11 * f6) - (f12 * f5)) / f17;
        fArr2[6] = ((f6 * f10) - (f7 * f9)) / f17;
        fArr2[7] = ((f7 * f8) - (f10 * f5)) / f17;
        fArr2[8] = ((f5 * f9) - (f6 * f8)) / f17;
        return fArr2;
    }

    @p4.l
    public static final float[] mul3x3(@p4.l float[] fArr, @p4.l float[] fArr2) {
        float f5 = fArr[0] * fArr2[0];
        float f6 = fArr[3];
        float f7 = fArr2[1];
        float f8 = fArr[6];
        float f9 = fArr2[2];
        float f10 = fArr[1];
        float f11 = fArr2[0];
        float f12 = fArr[4];
        float f13 = fArr[7];
        float f14 = fArr[2] * f11;
        float f15 = fArr[5];
        float f16 = f14 + (fArr2[1] * f15);
        float f17 = fArr[8];
        float f18 = fArr[0];
        float f19 = fArr2[3] * f18;
        float f20 = fArr2[4];
        float f21 = f19 + (f6 * f20);
        float f22 = fArr2[5];
        float f23 = fArr[1];
        float f24 = fArr2[3];
        float f25 = fArr[2];
        float f26 = f18 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = f26 + (f27 * f28);
        float f30 = fArr2[8];
        float f31 = fArr2[6];
        return new float[]{f5 + (f6 * f7) + (f8 * f9), (f10 * f11) + (f7 * f12) + (f13 * f9), f16 + (f9 * f17), f21 + (f8 * f22), (f23 * f24) + (f12 * f20) + (f13 * f22), (f24 * f25) + (f15 * fArr2[4]) + (f22 * f17), f29 + (f8 * f30), (f23 * f31) + (fArr[4] * f28) + (f13 * f30), (f25 * f31) + (fArr[5] * fArr2[7]) + (f17 * f30)};
    }

    @p4.l
    public static final float[] mul3x3Diag(@p4.l float[] fArr, @p4.l float[] fArr2) {
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        return new float[]{fArr[0] * fArr2[0], fArr[1] * fArr2[1], fArr[2] * fArr2[2], fArr2[3] * f5, fArr2[4] * f6, fArr2[5] * f7, f5 * fArr2[6], f6 * fArr2[7], f7 * fArr2[8]};
    }

    @p4.l
    public static final float[] mul3x3Float3(@p4.l float[] fArr, @p4.l float[] fArr2) {
        float f5 = fArr2[0];
        float f6 = fArr2[1];
        float f7 = fArr2[2];
        fArr2[0] = (fArr[0] * f5) + (fArr[3] * f6) + (fArr[6] * f7);
        fArr2[1] = (fArr[1] * f5) + (fArr[4] * f6) + (fArr[7] * f7);
        fArr2[2] = (fArr[2] * f5) + (fArr[5] * f6) + (fArr[8] * f7);
        return fArr2;
    }

    public static final float mul3x3Float3_0(@p4.l float[] fArr, float f5, float f6, float f7) {
        return (fArr[0] * f5) + (fArr[3] * f6) + (fArr[6] * f7);
    }

    public static final float mul3x3Float3_1(@p4.l float[] fArr, float f5, float f6, float f7) {
        return (fArr[1] * f5) + (fArr[4] * f6) + (fArr[7] * f7);
    }

    public static final float mul3x3Float3_2(@p4.l float[] fArr, float f5, float f6, float f7) {
        return (fArr[2] * f5) + (fArr[5] * f6) + (fArr[8] * f7);
    }

    public static final double rcpResponse(double d5, double d6, double d7, double d8, double d9, double d10) {
        return d5 >= d9 * d8 ? (Math.pow(d5, 1.0d / d10) - d7) / d6 : d5 / d8;
    }

    public static final double response(double d5, double d6, double d7, double d8, double d9, double d10) {
        return d5 >= d9 ? Math.pow((d6 * d5) + d7, d10) : d5 * d8;
    }

    public static final double rcpResponse(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        return d5 >= d9 * d8 ? (Math.pow(d5 - d10, 1.0d / d12) - d7) / d6 : (d5 - d11) / d8;
    }

    public static final double response(double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        return d5 >= d9 ? Math.pow((d6 * d5) + d7, d12) + d10 : (d8 * d5) + d11;
    }

    public static final boolean compare(@p4.l WhitePoint whitePoint, @p4.l WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(@p4.l float[] fArr, @p4.l float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (Float.compare(fArr[i5], fArr2[i5]) != 0 && Math.abs(fArr[i5] - fArr2[i5]) > 0.001f) {
                return false;
            }
        }
        return true;
    }
}
