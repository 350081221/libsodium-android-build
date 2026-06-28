package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0010¢\u0006\u0002\b\u001bJ=\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "clamp", "", "x", "fromXyz", "", "v", "getMaxValue", "component", "getMinValue", "toXy", "", "v0", com.alipay.sdk.m.x.c.f3016c, com.alipay.sdk.m.x.c.f3017d, "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "y", bi.aG, bi.ay, "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,80:1\n25#2,3:81\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:81,3\n*E\n"})
/* loaded from: classes.dex */
public final class Xyz extends ColorSpace {
    public Xyz(@p4.l String str, int i5) {
        super(str, ColorModel.Companion.m4147getXyzxdoWZVw(), i5, null);
    }

    private final float clamp(float f5) {
        float H;
        H = u.H(f5, -2.0f, 2.0f);
        return H;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] fromXyz(@p4.l float[] fArr) {
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i5) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i5) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f5, float f6, float f7) {
        float clamp = clamp(f5);
        float clamp2 = clamp(f6);
        return (Float.floatToRawIntBits(clamp2) & 4294967295L) | (Float.floatToRawIntBits(clamp) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @p4.l
    public float[] toXyz(@p4.l float[] fArr) {
        fArr[0] = clamp(fArr[0]);
        fArr[1] = clamp(fArr[1]);
        fArr[2] = clamp(fArr[2]);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f5, float f6, float f7) {
        return clamp(f7);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4149xyzaToColorJlNiLsg$ui_graphics_release(float f5, float f6, float f7, float f8, @p4.l ColorSpace colorSpace) {
        return ColorKt.Color(clamp(f5), clamp(f6), clamp(f7), f8, colorSpace);
    }
}
