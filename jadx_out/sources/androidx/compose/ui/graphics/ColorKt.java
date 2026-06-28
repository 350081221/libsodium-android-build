package androidx.compose.ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\f\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007¢\u0006\u0004\b\b\u0010\u000e\u001a7\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\n2\b\b\u0001\u0010\u0002\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\n2\b\b\u0003\u0010\u0004\u001a\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a,\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0082\b\u001a\u0016\u0010#\u001a\u00020 *\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0016\u0010&\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002\u001a\u0016\u0010+\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a%\u00100\u001a\u00020\u0007*\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0086\bø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u001f\u00106\u001a\u000201*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"\u001f\u00109\u001a\u000201*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", TypedValues.Custom.S_COLOR, "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", ForeAndBackgroundEvent.BACKGROUND, "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "fgC", "bgC", "fgA", "bgA", bi.ay, "compositeComponent", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "v", "saturate", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLv3/a;)J", "takeOrElse", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,673:1\n587#1:674\n587#1:675\n587#1:676\n646#1:677\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:674\n568#1:675\n569#1:676\n658#1:677\n*E\n"})
/* loaded from: classes.dex */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r9, float r10, float r11, float r12, @p4.l androidx.compose.ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f5, float f6, float f7, float f8, ColorSpace colorSpace, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            f8 = 1.0f;
        }
        if ((i5 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f5, f6, f7, f8, colorSpace);
    }

    private static final float compositeComponent(float f5, float f6, float f7, float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        return ((f5 * f7) + ((f6 * f8) * (1.0f - f7))) / f9;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m3779compositeOverOWjLjI(long j5, long j6) {
        boolean z4;
        float f5;
        boolean z5;
        float f6;
        long m3731convertvNxB06k = Color.m3731convertvNxB06k(j5, Color.m3738getColorSpaceimpl(j6));
        float m3736getAlphaimpl = Color.m3736getAlphaimpl(j6);
        float m3736getAlphaimpl2 = Color.m3736getAlphaimpl(m3731convertvNxB06k);
        float f7 = 1.0f - m3736getAlphaimpl2;
        float f8 = (m3736getAlphaimpl * f7) + m3736getAlphaimpl2;
        float m3740getRedimpl = Color.m3740getRedimpl(m3731convertvNxB06k);
        float m3740getRedimpl2 = Color.m3740getRedimpl(j6);
        float f9 = 0.0f;
        boolean z6 = true;
        if (f8 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            f5 = 0.0f;
        } else {
            f5 = ((m3740getRedimpl * m3736getAlphaimpl2) + ((m3740getRedimpl2 * m3736getAlphaimpl) * f7)) / f8;
        }
        float m3739getGreenimpl = Color.m3739getGreenimpl(m3731convertvNxB06k);
        float m3739getGreenimpl2 = Color.m3739getGreenimpl(j6);
        if (f8 == 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            f6 = 0.0f;
        } else {
            f6 = ((m3739getGreenimpl * m3736getAlphaimpl2) + ((m3739getGreenimpl2 * m3736getAlphaimpl) * f7)) / f8;
        }
        float m3737getBlueimpl = Color.m3737getBlueimpl(m3731convertvNxB06k);
        float m3737getBlueimpl2 = Color.m3737getBlueimpl(j6);
        if (f8 != 0.0f) {
            z6 = false;
        }
        if (!z6) {
            f9 = ((m3737getBlueimpl * m3736getAlphaimpl2) + ((m3737getBlueimpl2 * m3736getAlphaimpl) * f7)) / f8;
        }
        return Color(f5, f6, f9, f8, Color.m3738getColorSpaceimpl(j6));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m3780getComponents8_81llA(long j5) {
        return new float[]{Color.m3740getRedimpl(j5), Color.m3739getGreenimpl(j5), Color.m3737getBlueimpl(j5), Color.m3736getAlphaimpl(j5)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m3781isSpecified8_81llA(long j5) {
        return j5 != Color.Companion.m3770getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m3782isSpecified8_81llA$annotations(long j5) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m3783isUnspecified8_81llA(long j5) {
        return j5 == Color.Companion.m3770getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m3784isUnspecified8_81llA$annotations(long j5) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m3785lerpjxsXWHM(long j5, long j6, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m3731convertvNxB06k = Color.m3731convertvNxB06k(j5, oklab);
        long m3731convertvNxB06k2 = Color.m3731convertvNxB06k(j6, oklab);
        float m3736getAlphaimpl = Color.m3736getAlphaimpl(m3731convertvNxB06k);
        float m3740getRedimpl = Color.m3740getRedimpl(m3731convertvNxB06k);
        float m3739getGreenimpl = Color.m3739getGreenimpl(m3731convertvNxB06k);
        float m3737getBlueimpl = Color.m3737getBlueimpl(m3731convertvNxB06k);
        float m3736getAlphaimpl2 = Color.m3736getAlphaimpl(m3731convertvNxB06k2);
        float m3740getRedimpl2 = Color.m3740getRedimpl(m3731convertvNxB06k2);
        float m3739getGreenimpl2 = Color.m3739getGreenimpl(m3731convertvNxB06k2);
        float m3737getBlueimpl2 = Color.m3737getBlueimpl(m3731convertvNxB06k2);
        return Color.m3731convertvNxB06k(Color(MathHelpersKt.lerp(m3740getRedimpl, m3740getRedimpl2, f5), MathHelpersKt.lerp(m3739getGreenimpl, m3739getGreenimpl2, f5), MathHelpersKt.lerp(m3737getBlueimpl, m3737getBlueimpl2, f5), MathHelpersKt.lerp(m3736getAlphaimpl, m3736getAlphaimpl2, f5), oklab), Color.m3738getColorSpaceimpl(j6));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m3786luminance8_81llA(long j5) {
        ColorSpace m3738getColorSpaceimpl = Color.m3738getColorSpaceimpl(j5);
        if (ColorModel.m4139equalsimpl0(m3738getColorSpaceimpl.m4148getModelxdoWZVw(), ColorModel.Companion.m4146getRgbxdoWZVw())) {
            kotlin.jvm.internal.l0.n(m3738getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) m3738getColorSpaceimpl).getEotfFunc$ui_graphics_release();
            return saturate((float) ((eotfFunc$ui_graphics_release.invoke(Color.m3740getRedimpl(j5)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m3739getGreenimpl(j5)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m3737getBlueimpl(j5)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m4142toStringimpl(m3738getColorSpaceimpl.m4148getModelxdoWZVw()))).toString());
    }

    private static final float saturate(float f5) {
        float f6 = 0.0f;
        if (f5 > 0.0f) {
            f6 = 1.0f;
            if (f5 < 1.0f) {
                return f5;
            }
        }
        return f6;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m3787takeOrElseDxMtmZc(long j5, @p4.l v3.a<Color> aVar) {
        boolean z4;
        if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return aVar.invoke().m3744unboximpl();
        }
        return j5;
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m3788toArgb8_81llA(long j5) {
        return (int) kotlin.g2.l(Color.m3731convertvNxB06k(j5, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            i8 = 255;
        }
        return Color(i5, i6, i7, i8);
    }

    @Stable
    public static final long Color(@ColorInt int i5) {
        return Color.m3730constructorimpl(kotlin.g2.l(kotlin.g2.l(i5) << 32));
    }

    @Stable
    public static final long Color(long j5) {
        return Color.m3730constructorimpl(kotlin.g2.l(kotlin.g2.l(kotlin.g2.l(j5) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, to = 255) int i5, @IntRange(from = 0, to = 255) int i6, @IntRange(from = 0, to = 255) int i7, @IntRange(from = 0, to = 255) int i8) {
        return Color(((i5 & 255) << 16) | ((i8 & 255) << 24) | ((i6 & 255) << 8) | (i7 & 255));
    }
}
