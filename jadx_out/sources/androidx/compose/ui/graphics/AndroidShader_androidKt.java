package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;

@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aL\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u001d\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0016\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001\u001a\u001e\u0010\"\u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001\u001a0\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001\u001a&\u0010'\u001a\u00020&2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002*\n\u0010(\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "numTransparentColors", "", "makeTransparentColors", "stops", "", "makeTransparentStops", "Lkotlin/r2;", "validateColorStops", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n69#2,6:207\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:207,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidShader_androidKt {
    @p4.l
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m3634ActualImageShaderF49vj9s(@p4.l ImageBitmap imageBitmap, int i5, int i6) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m3639toAndroidTileMode0vamqd0(i5), AndroidTileMode_androidKt.m3639toAndroidTileMode0vamqd0(i6));
    }

    @p4.l
    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m3635ActualLinearGradientShaderVjE6UOU(long j5, long j6, @p4.l List<Color> list, @p4.m List<Float> list2, int i5) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m3639toAndroidTileMode0vamqd0(i5));
    }

    @p4.l
    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m3636ActualRadialGradientShader8uybcMk(long j5, float f5, @p4.l List<Color> list, @p4.m List<Float> list2, int i5) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), f5, makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors), AndroidTileMode_androidKt.m3639toAndroidTileMode0vamqd0(i5));
    }

    @p4.l
    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m3637ActualSweepGradientShader9KIMszo(long j5, @p4.l List<Color> list, @p4.m List<Float> list2) {
        validateColorStops(list, list2);
        int countTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), makeTransparentColors(list, countTransparentColors), makeTransparentStops(list2, list, countTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(@p4.l List<Color> list) {
        int G;
        boolean z4;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        G = kotlin.collections.w.G(list);
        int i5 = 0;
        for (int i6 = 1; i6 < G; i6++) {
            if (Color.m3736getAlphaimpl(list.get(i6).m3744unboximpl()) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i5++;
            }
        }
        return i5;
    }

    @p4.l
    @VisibleForTesting
    public static final int[] makeTransparentColors(@p4.l List<Color> list, int i5) {
        int G;
        boolean z4;
        int i6;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = ColorKt.m3788toArgb8_81llA(list.get(i7).m3744unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i5];
        G = kotlin.collections.w.G(list);
        int size2 = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size2; i9++) {
            long m3744unboximpl = list.get(i9).m3744unboximpl();
            if (Color.m3736getAlphaimpl(m3744unboximpl) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i9 == 0) {
                    i6 = i8 + 1;
                    iArr2[i8] = ColorKt.m3788toArgb8_81llA(Color.m3733copywmQWz5c$default(list.get(1).m3744unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i9 == G) {
                    i6 = i8 + 1;
                    iArr2[i8] = ColorKt.m3788toArgb8_81llA(Color.m3733copywmQWz5c$default(list.get(i9 - 1).m3744unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i10 = i8 + 1;
                    iArr2[i8] = ColorKt.m3788toArgb8_81llA(Color.m3733copywmQWz5c$default(list.get(i9 - 1).m3744unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i8 = i10 + 1;
                    iArr2[i10] = ColorKt.m3788toArgb8_81llA(Color.m3733copywmQWz5c$default(list.get(i9 + 1).m3744unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i8 = i6;
            } else {
                iArr2[i8] = ColorKt.m3788toArgb8_81llA(m3744unboximpl);
                i8++;
            }
        }
        return iArr2;
    }

    @VisibleForTesting
    @p4.m
    public static final float[] makeTransparentStops(@p4.m List<Float> list, @p4.l List<Color> list2, int i5) {
        float f5;
        int G;
        float f6;
        int G2;
        int G3;
        float f7;
        boolean z4;
        float[] P5;
        if (i5 == 0) {
            if (list != null) {
                P5 = kotlin.collections.e0.P5(list);
                return P5;
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i5];
        if (list != null) {
            f5 = list.get(0).floatValue();
        } else {
            f5 = 0.0f;
        }
        fArr[0] = f5;
        G = kotlin.collections.w.G(list2);
        int i6 = 1;
        for (int i7 = 1; i7 < G; i7++) {
            long m3744unboximpl = list2.get(i7).m3744unboximpl();
            if (list != null) {
                f7 = list.get(i7).floatValue();
            } else {
                G3 = kotlin.collections.w.G(list2);
                f7 = i7 / G3;
            }
            int i8 = i6 + 1;
            fArr[i6] = f7;
            if (Color.m3736getAlphaimpl(m3744unboximpl) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i6 = i8 + 1;
                fArr[i8] = f7;
            } else {
                i6 = i8;
            }
        }
        if (list != null) {
            G2 = kotlin.collections.w.G(list2);
            f6 = list.get(G2).floatValue();
        } else {
            f6 = 1.0f;
        }
        fArr[i6] = f6;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
