package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

@kotlin.i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0002\u001a\b\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\"\u0010\u000b\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000e\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u000f*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u0012*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u0012H\u0000\u001a\u0017\u0010\u0016\u001a\u00020\u0015*\u00060\u0002j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\"\u0010\u001a\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001d\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\n\u001a\u0017\u0010\u001e\u001a\u00020\u001b*\u00060\u0002j\u0002`\u0005H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0010\u0010 \u001a\u00020\u000f*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010!\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0000\u001a\u0017\u0010#\u001a\u00020\"*\u00060\u0002j\u0002`\u0005H\u0000¢\u0006\u0004\b#\u0010\u001f\u001a\"\u0010%\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\"H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010\n\u001a\u0017\u0010'\u001a\u00020&*\u00060\u0002j\u0002`\u0005H\u0000¢\u0006\u0004\b'\u0010\u001f\u001a\"\u0010)\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010\n\u001a\u0010\u0010*\u001a\u00020\u000f*\u00060\u0002j\u0002`\u0005H\u0000\u001a\u0018\u0010+\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020\u000fH\u0000\u001a\u0017\u0010-\u001a\u00020,*\u00060\u0002j\u0002`\u0005H\u0000¢\u0006\u0004\b-\u0010\u001f\u001a\"\u0010/\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u0006\u0010\r\u001a\u00020,H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010\n\u001a \u00102\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\u000e\u0010\r\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0000\u001a\u001a\u00104\u001a\u00020\b*\u00060\u0002j\u0002`\u00052\b\u0010\r\u001a\u0004\u0018\u000103H\u0000*\n\u00105\"\u00020\u00022\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "Paint", "Landroid/graphics/Paint;", "asComposePaint", "makeNativePaint", "Landroidx/compose/ui/graphics/NativePaint;", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "Lkotlin/r2;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", t0.b.f22420d, "setNativeColorFilter", "", "getNativeAlpha", "setNativeAlpha", "", "getNativeAntiAlias", "setNativeAntiAlias", "Landroidx/compose/ui/graphics/Color;", "getNativeColor", "(Landroid/graphics/Paint;)J", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColor", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeStyle--5YerkU", "setNativeStyle", "getNativeStyle", "(Landroid/graphics/Paint;)I", "getNativeStrokeWidth", "setNativeStrokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeJoin", "getNativeStrokeMiterLimit", "setNativeStrokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativeFilterQuality", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeShader", "Landroidx/compose/ui/graphics/PathEffect;", "setNativePathEffect", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @p4.l
    public static final Paint Paint() {
        return new AndroidPaint();
    }

    @p4.l
    public static final Paint asComposePaint(@p4.l android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(@p4.l android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(@p4.l android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(@p4.l android.graphics.Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(@p4.l android.graphics.Paint paint) {
        if (!paint.isFilterBitmap()) {
            return FilterQuality.Companion.m3835getNonefv9h1I();
        }
        return FilterQuality.Companion.m3833getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(@p4.l android.graphics.Paint paint) {
        int i5;
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i5 = -1;
        } else {
            i5 = WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    return StrokeCap.Companion.m4085getButtKaPHkGw();
                }
                return StrokeCap.Companion.m4087getSquareKaPHkGw();
            }
            return StrokeCap.Companion.m4086getRoundKaPHkGw();
        }
        return StrokeCap.Companion.m4085getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(@p4.l android.graphics.Paint paint) {
        int i5;
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i5 = -1;
        } else {
            i5 = WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    return StrokeJoin.Companion.m4096getMiterLxFBmk8();
                }
                return StrokeJoin.Companion.m4097getRoundLxFBmk8();
            }
            return StrokeJoin.Companion.m4095getBevelLxFBmk8();
        }
        return StrokeJoin.Companion.m4096getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(@p4.l android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(@p4.l android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(@p4.l android.graphics.Paint paint) {
        int i5;
        Paint.Style style = paint.getStyle();
        if (style == null) {
            i5 = -1;
        } else {
            i5 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        }
        if (i5 == 1) {
            return PaintingStyle.Companion.m4001getStrokeTiuSbCo();
        }
        return PaintingStyle.Companion.m4000getFillTiuSbCo();
    }

    @p4.l
    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(@p4.l android.graphics.Paint paint, float f5) {
        paint.setAlpha((int) Math.rint(f5 * 255.0f));
    }

    public static final void setNativeAntiAlias(@p4.l android.graphics.Paint paint, boolean z4) {
        paint.setAntiAlias(z4);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m3618setNativeBlendModeGB0RdKg(@p4.l android.graphics.Paint paint, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m4135setBlendModeGB0RdKg(paint, i5);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m3586toPorterDuffModes9anfk8(i5)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m3619setNativeColor4WTKRHQ(@p4.l android.graphics.Paint paint, long j5) {
        paint.setColor(ColorKt.m3788toArgb8_81llA(j5));
    }

    public static final void setNativeColorFilter(@p4.l android.graphics.Paint paint, @p4.m ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m3620setNativeFilterQuality50PEsBU(@p4.l android.graphics.Paint paint, int i5) {
        paint.setFilterBitmap(!FilterQuality.m3828equalsimpl0(i5, FilterQuality.Companion.m3835getNonefv9h1I()));
    }

    public static final void setNativePathEffect(@p4.l android.graphics.Paint paint, @p4.m PathEffect pathEffect) {
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        paint.setPathEffect(androidPathEffect != null ? androidPathEffect.getNativePathEffect() : null);
    }

    public static final void setNativeShader(@p4.l android.graphics.Paint paint, @p4.m Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m3621setNativeStrokeCapCSYIeUk(@p4.l android.graphics.Paint paint, int i5) {
        Paint.Cap cap;
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m4081equalsimpl0(i5, companion.m4087getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m4081equalsimpl0(i5, companion.m4086getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else if (StrokeCap.m4081equalsimpl0(i5, companion.m4085getButtKaPHkGw())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m3622setNativeStrokeJoinkLtJ_vA(@p4.l android.graphics.Paint paint, int i5) {
        Paint.Join join;
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m4091equalsimpl0(i5, companion.m4096getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m4091equalsimpl0(i5, companion.m4095getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else if (StrokeJoin.m4091equalsimpl0(i5, companion.m4097getRoundLxFBmk8())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void setNativeStrokeMiterLimit(@p4.l android.graphics.Paint paint, float f5) {
        paint.setStrokeMiter(f5);
    }

    public static final void setNativeStrokeWidth(@p4.l android.graphics.Paint paint, float f5) {
        paint.setStrokeWidth(f5);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m3623setNativeStyle5YerkU(@p4.l android.graphics.Paint paint, int i5) {
        Paint.Style style;
        if (PaintingStyle.m3996equalsimpl0(i5, PaintingStyle.Companion.m4001getStrokeTiuSbCo())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
