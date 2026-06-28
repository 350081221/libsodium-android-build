package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", com.alipay.sdk.m.x.c.f3016c, com.alipay.sdk.m.x.c.f3017d, "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", bi.aG, bi.ay, "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,141:1\n25#2,3:142\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:142,3\n*E\n"})
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", "A", "", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public Lab(@p4.l String str, int i5) {
        super(str, ColorModel.Companion.m4145getLabxdoWZVw(), i5, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] fromXyz(@p4.l float[] fArr) {
        float f5;
        float f6;
        float f7;
        float H;
        float H2;
        float H3;
        float f8 = fArr[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f9 = f8 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f10 = fArr[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f11 = fArr[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f9 > A) {
            f5 = (float) Math.pow(f9, 0.33333334f);
        } else {
            f5 = (f9 * B) + C;
        }
        if (f10 > A) {
            f6 = (float) Math.pow(f10, 0.33333334f);
        } else {
            f6 = (f10 * B) + C;
        }
        if (f11 > A) {
            f7 = (float) Math.pow(f11, 0.33333334f);
        } else {
            f7 = (f11 * B) + C;
        }
        float f12 = (116.0f * f6) - 16.0f;
        float f13 = (f5 - f6) * 500.0f;
        float f14 = (f6 - f7) * 200.0f;
        H = u.H(f12, 0.0f, 100.0f);
        fArr[0] = H;
        H2 = u.H(f13, -128.0f, 128.0f);
        fArr[1] = H2;
        H3 = u.H(f14, -128.0f, 128.0f);
        fArr[2] = H3;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i5) {
        return i5 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i5) {
        return i5 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f5, float f6, float f7) {
        float H;
        float H2;
        float f8;
        float f9;
        H = u.H(f5, 0.0f, 100.0f);
        H2 = u.H(f6, -128.0f, 128.0f);
        float f10 = (H + 16.0f) / 116.0f;
        float f11 = (H2 * 0.002f) + f10;
        if (f11 > D) {
            f8 = f11 * f11 * f11;
        } else {
            f8 = (f11 - C) * 0.12841855f;
        }
        if (f10 > D) {
            f9 = f10 * f10 * f10;
        } else {
            f9 = (f10 - C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        float f12 = f8 * illuminant.getD50Xyz$ui_graphics_release()[0];
        float f13 = f9 * illuminant.getD50Xyz$ui_graphics_release()[1];
        return (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] toXyz(@p4.l float[] fArr) {
        float H;
        float H2;
        float H3;
        float f5;
        float f6;
        float f7;
        H = u.H(fArr[0], 0.0f, 100.0f);
        fArr[0] = H;
        H2 = u.H(fArr[1], -128.0f, 128.0f);
        fArr[1] = H2;
        H3 = u.H(fArr[2], -128.0f, 128.0f);
        fArr[2] = H3;
        float f8 = (fArr[0] + 16.0f) / 116.0f;
        float f9 = (fArr[1] * 0.002f) + f8;
        float f10 = f8 - (H3 * 0.005f);
        if (f9 > D) {
            f5 = f9 * f9 * f9;
        } else {
            f5 = (f9 - C) * 0.12841855f;
        }
        if (f8 > D) {
            f6 = f8 * f8 * f8;
        } else {
            f6 = (f8 - C) * 0.12841855f;
        }
        if (f10 > D) {
            f7 = f10 * f10 * f10;
        } else {
            f7 = (f10 - C) * 0.12841855f;
        }
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f5 * illuminant.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f6 * illuminant.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f7 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f5, float f6, float f7) {
        float H;
        float H2;
        float f8;
        H = u.H(f5, 0.0f, 100.0f);
        H2 = u.H(f7, -128.0f, 128.0f);
        float f9 = ((H + 16.0f) / 116.0f) - (H2 * 0.005f);
        if (f9 > D) {
            f8 = f9 * f9 * f9;
        } else {
            f8 = 0.12841855f * (f9 - C);
        }
        return f8 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4149xyzaToColorJlNiLsg$ui_graphics_release(float f5, float f6, float f7, float f8, @p4.l ColorSpace colorSpace) {
        float f9;
        float f10;
        float f11;
        float H;
        float H2;
        float H3;
        Illuminant illuminant = Illuminant.INSTANCE;
        float f12 = f5 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f13 = f6 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f14 = f7 / illuminant.getD50Xyz$ui_graphics_release()[2];
        if (f12 > A) {
            f9 = (float) Math.pow(f12, 0.33333334f);
        } else {
            f9 = (f12 * B) + C;
        }
        if (f13 > A) {
            f10 = (float) Math.pow(f13, 0.33333334f);
        } else {
            f10 = (f13 * B) + C;
        }
        if (f14 > A) {
            f11 = (float) Math.pow(f14, 0.33333334f);
        } else {
            f11 = (f14 * B) + C;
        }
        float f15 = (116.0f * f10) - 16.0f;
        float f16 = (f9 - f10) * 500.0f;
        float f17 = (f10 - f11) * 200.0f;
        H = u.H(f15, 0.0f, 100.0f);
        H2 = u.H(f16, -128.0f, 128.0f);
        H3 = u.H(f17, -128.0f, 128.0f);
        return ColorKt.Color(H, H2, H3, f8, colorSpace);
    }
}
