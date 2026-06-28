package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", com.alipay.sdk.m.x.c.f3016c, com.alipay.sdk.m.x.c.f3017d, "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", bi.aG, bi.ay, "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
/* loaded from: classes.dex */
public final class Oklab extends ColorSpace {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private static final float[] InverseM1;

    @p4.l
    private static final float[] InverseM2;

    @p4.l
    private static final float[] M1;

    @p4.l
    private static final float[] M2;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab$Companion;", "", "()V", "InverseM1", "", "InverseM2", "M1", "M2", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] mul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        M1 = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(mul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    public Oklab(@p4.l String str, int i5) {
        super(str, ColorModel.Companion.m4145getLabxdoWZVw(), i5, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] fromXyz(@p4.l float[] fArr) {
        ColorSpaceKt.mul3x3Float3(M1, fArr);
        double d5 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d5));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d5));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d5));
        ColorSpaceKt.mul3x3Float3(M2, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i5) {
        return i5 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i5) {
        return i5 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f5, float f6, float f7) {
        float H;
        float H2;
        float H3;
        H = u.H(f5, 0.0f, 1.0f);
        H2 = u.H(f6, -0.5f, 0.5f);
        H3 = u.H(f7, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, H, H2, H3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, H, H2, H3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, H, H2, H3);
        float f8 = mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0;
        float f9 = mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1;
        float f10 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        float[] fArr2 = InverseM1;
        float mul3x3Float3_02 = ColorSpaceKt.mul3x3Float3_0(fArr2, f8, f9, f10);
        float mul3x3Float3_12 = ColorSpaceKt.mul3x3Float3_1(fArr2, f8, f9, f10);
        return (Float.floatToRawIntBits(mul3x3Float3_02) << 32) | (Float.floatToRawIntBits(mul3x3Float3_12) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] toXyz(@p4.l float[] fArr) {
        float H;
        float H2;
        float H3;
        H = u.H(fArr[0], 0.0f, 1.0f);
        fArr[0] = H;
        H2 = u.H(fArr[1], -0.5f, 0.5f);
        fArr[1] = H2;
        H3 = u.H(fArr[2], -0.5f, 0.5f);
        fArr[2] = H3;
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f5 = fArr[0];
        fArr[0] = f5 * f5 * f5;
        float f6 = fArr[1];
        fArr[1] = f6 * f6 * f6;
        float f7 = fArr[2];
        fArr[2] = f7 * f7 * f7;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f5, float f6, float f7) {
        float H;
        float H2;
        float H3;
        H = u.H(f5, 0.0f, 1.0f);
        H2 = u.H(f6, -0.5f, 0.5f);
        H3 = u.H(f7, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, H, H2, H3);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, H, H2, H3);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, H, H2, H3);
        float f8 = mul3x3Float3_2 * mul3x3Float3_2 * mul3x3Float3_2;
        return ColorSpaceKt.mul3x3Float3_2(InverseM1, mul3x3Float3_0 * mul3x3Float3_0 * mul3x3Float3_0, mul3x3Float3_1 * mul3x3Float3_1 * mul3x3Float3_1, f8);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4149xyzaToColorJlNiLsg$ui_graphics_release(float f5, float f6, float f7, float f8, @p4.l ColorSpace colorSpace) {
        float[] fArr = M1;
        float mul3x3Float3_0 = ColorSpaceKt.mul3x3Float3_0(fArr, f5, f6, f7);
        float mul3x3Float3_1 = ColorSpaceKt.mul3x3Float3_1(fArr, f5, f6, f7);
        float mul3x3Float3_2 = ColorSpaceKt.mul3x3Float3_2(fArr, f5, f6, f7);
        double d5 = 0.33333334f;
        float signum = Math.signum(mul3x3Float3_0) * ((float) Math.pow(Math.abs(mul3x3Float3_0), d5));
        float signum2 = Math.signum(mul3x3Float3_1) * ((float) Math.pow(Math.abs(mul3x3Float3_1), d5));
        float signum3 = Math.signum(mul3x3Float3_2) * ((float) Math.pow(Math.abs(mul3x3Float3_2), d5));
        float[] fArr2 = M2;
        return ColorKt.Color(ColorSpaceKt.mul3x3Float3_0(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_1(fArr2, signum, signum2, signum3), ColorSpaceKt.mul3x3Float3_2(fArr2, signum, signum2, signum3), f8, colorSpace);
    }
}
