package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;

@kotlin.i0(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0001\u001a\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002\u001a \u0010\u0012\u001a\u00020\u0013*\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"delinearized", "", "rgbComponent", "", "dynamicDarkColorScheme", "Landroidx/compose/material3/ColorScheme;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "dynamicDarkColorScheme31", "tonalPalette", "Landroidx/compose/material3/TonalPalette;", "dynamicDarkColorScheme34", "dynamicLightColorScheme", "dynamicLightColorScheme31", "dynamicLightColorScheme34", "dynamicTonalPalette", "labInvf", "ft", "setLuminance", "Landroidx/compose/ui/graphics/Color;", "newLuminance", "setLuminance-DxMtmZc", "(JF)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@u3.h(name = "DynamicTonalPaletteKt")
/* loaded from: classes.dex */
public final class DynamicTonalPaletteKt {
    private static final int delinearized(float f5) {
        double pow;
        int K0;
        double d5 = f5 / 100;
        if (d5 <= 0.0031308d) {
            pow = d5 * 12.92d;
        } else {
            pow = (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        K0 = kotlin.math.d.K0(pow * 255.0d);
        return MathUtils.clamp(K0, 0, 255);
    }

    @p4.l
    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme(@p4.l Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicDarkColorScheme34(context);
        }
        return dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    @p4.l
    @RequiresApi(31)
    public static final ColorScheme dynamicDarkColorScheme31(@p4.l TonalPalette tonalPalette) {
        long m2562getPrimary800d7_KjU = tonalPalette.m2562getPrimary800d7_KjU();
        long m2556getPrimary200d7_KjU = tonalPalette.m2556getPrimary200d7_KjU();
        long m2557getPrimary300d7_KjU = tonalPalette.m2557getPrimary300d7_KjU();
        long m2563getPrimary900d7_KjU = tonalPalette.m2563getPrimary900d7_KjU();
        long m2558getPrimary400d7_KjU = tonalPalette.m2558getPrimary400d7_KjU();
        long m2575getSecondary800d7_KjU = tonalPalette.m2575getSecondary800d7_KjU();
        long m2569getSecondary200d7_KjU = tonalPalette.m2569getSecondary200d7_KjU();
        long m2570getSecondary300d7_KjU = tonalPalette.m2570getSecondary300d7_KjU();
        long m2576getSecondary900d7_KjU = tonalPalette.m2576getSecondary900d7_KjU();
        long m2588getTertiary800d7_KjU = tonalPalette.m2588getTertiary800d7_KjU();
        long m2582getTertiary200d7_KjU = tonalPalette.m2582getTertiary200d7_KjU();
        long m2583getTertiary300d7_KjU = tonalPalette.m2583getTertiary300d7_KjU();
        long m2589getTertiary900d7_KjU = tonalPalette.m2589getTertiary900d7_KjU();
        long m2541getNeutralVariant60d7_KjU = tonalPalette.m2541getNeutralVariant60d7_KjU();
        long m2546getNeutralVariant900d7_KjU = tonalPalette.m2546getNeutralVariant900d7_KjU();
        long m2541getNeutralVariant60d7_KjU2 = tonalPalette.m2541getNeutralVariant60d7_KjU();
        long m2546getNeutralVariant900d7_KjU2 = tonalPalette.m2546getNeutralVariant900d7_KjU();
        long m2537getNeutralVariant300d7_KjU = tonalPalette.m2537getNeutralVariant300d7_KjU();
        long m2544getNeutralVariant800d7_KjU = tonalPalette.m2544getNeutralVariant800d7_KjU();
        long m2546getNeutralVariant900d7_KjU3 = tonalPalette.m2546getNeutralVariant900d7_KjU();
        long m2534getNeutralVariant200d7_KjU = tonalPalette.m2534getNeutralVariant200d7_KjU();
        long m2542getNeutralVariant600d7_KjU = tonalPalette.m2542getNeutralVariant600d7_KjU();
        long m2537getNeutralVariant300d7_KjU2 = tonalPalette.m2537getNeutralVariant300d7_KjU();
        long m2529getNeutralVariant00d7_KjU = tonalPalette.m2529getNeutralVariant00d7_KjU();
        long m2536getNeutralVariant240d7_KjU = tonalPalette.m2536getNeutralVariant240d7_KjU();
        long m2541getNeutralVariant60d7_KjU3 = tonalPalette.m2541getNeutralVariant60d7_KjU();
        return ColorSchemeKt.m1722darkColorSchemeCXl9yA$default(m2562getPrimary800d7_KjU, m2556getPrimary200d7_KjU, m2557getPrimary300d7_KjU, m2563getPrimary900d7_KjU, m2558getPrimary400d7_KjU, m2575getSecondary800d7_KjU, m2569getSecondary200d7_KjU, m2570getSecondary300d7_KjU, m2576getSecondary900d7_KjU, m2588getTertiary800d7_KjU, m2582getTertiary200d7_KjU, m2583getTertiary300d7_KjU, m2589getTertiary900d7_KjU, m2541getNeutralVariant60d7_KjU, m2546getNeutralVariant900d7_KjU, m2541getNeutralVariant60d7_KjU2, m2546getNeutralVariant900d7_KjU2, m2537getNeutralVariant300d7_KjU, m2544getNeutralVariant800d7_KjU, tonalPalette.m2562getPrimary800d7_KjU(), m2546getNeutralVariant900d7_KjU3, m2534getNeutralVariant200d7_KjU, 0L, 0L, 0L, 0L, m2542getNeutralVariant600d7_KjU, m2537getNeutralVariant300d7_KjU2, m2529getNeutralVariant00d7_KjU, m2536getNeutralVariant240d7_KjU, tonalPalette.m2532getNeutralVariant120d7_KjU(), tonalPalette.m2533getNeutralVariant170d7_KjU(), tonalPalette.m2535getNeutralVariant220d7_KjU(), tonalPalette.m2530getNeutralVariant100d7_KjU(), tonalPalette.m2538getNeutralVariant40d7_KjU(), m2541getNeutralVariant60d7_KjU3, 62914560, 0, null);
    }

    @p4.l
    @RequiresApi(34)
    public static final ColorScheme dynamicDarkColorScheme34(@p4.l Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long m1677getColorWaAFU9c = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_50);
        long m1677getColorWaAFU9c2 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_500);
        long m1677getColorWaAFU9c3 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_300);
        long m1677getColorWaAFU9c4 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_400);
        long m1677getColorWaAFU9c5 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_action1_dark);
        long m1677getColorWaAFU9c6 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_800);
        long m1677getColorWaAFU9c7 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_900);
        long m1677getColorWaAFU9c8 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_600);
        long m1677getColorWaAFU9c9 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_700);
        long m1677getColorWaAFU9c10 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_dark_blue_grey_700);
        long m1677getColorWaAFU9c11 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_dark_blue_grey_800);
        long m1677getColorWaAFU9c12 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_dark_blue_grey_1000);
        long m1677getColorWaAFU9c13 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_dark_blue_grey_600);
        long m1677getColorWaAFU9c14 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_dark_blue_grey_900);
        long m1677getColorWaAFU9c15 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_100);
        long m1677getColorWaAFU9c16 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_200);
        long m1677getColorWaAFU9c17 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_300);
        long m1677getColorWaAFU9c18 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_grey_100);
        long m1677getColorWaAFU9c19 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_grey_1000);
        long m1677getColorWaAFU9c20 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_900);
        long m1677getColorWaAFU9c21 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_grey_800);
        long m1677getColorWaAFU9c22 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_grey_200);
        long m1677getColorWaAFU9c23 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_keyboard_divider_line);
        long m1677getColorWaAFU9c24 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_800);
        long m1677getColorWaAFU9c25 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_900);
        return ColorSchemeKt.m1722darkColorSchemeCXl9yA$default(m1677getColorWaAFU9c, m1677getColorWaAFU9c2, m1677getColorWaAFU9c3, m1677getColorWaAFU9c4, m1677getColorWaAFU9c5, m1677getColorWaAFU9c6, m1677getColorWaAFU9c7, m1677getColorWaAFU9c8, m1677getColorWaAFU9c9, m1677getColorWaAFU9c10, m1677getColorWaAFU9c11, m1677getColorWaAFU9c12, m1677getColorWaAFU9c13, m1677getColorWaAFU9c14, m1677getColorWaAFU9c15, m1677getColorWaAFU9c16, m1677getColorWaAFU9c17, m1677getColorWaAFU9c18, m1677getColorWaAFU9c19, colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_50), m1677getColorWaAFU9c20, m1677getColorWaAFU9c21, 0L, 0L, 0L, 0L, m1677getColorWaAFU9c22, m1677getColorWaAFU9c23, 0L, m1677getColorWaAFU9c24, colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_500), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_600), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_700), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_400), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_50), m1677getColorWaAFU9c25, 331350016, 0, null);
    }

    @p4.l
    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme(@p4.l Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicLightColorScheme34(context);
        }
        return dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    @p4.l
    @RequiresApi(31)
    public static final ColorScheme dynamicLightColorScheme31(@p4.l TonalPalette tonalPalette) {
        long m2558getPrimary400d7_KjU = tonalPalette.m2558getPrimary400d7_KjU();
        long m2555getPrimary1000d7_KjU = tonalPalette.m2555getPrimary1000d7_KjU();
        long m2563getPrimary900d7_KjU = tonalPalette.m2563getPrimary900d7_KjU();
        long m2554getPrimary100d7_KjU = tonalPalette.m2554getPrimary100d7_KjU();
        long m2562getPrimary800d7_KjU = tonalPalette.m2562getPrimary800d7_KjU();
        long m2571getSecondary400d7_KjU = tonalPalette.m2571getSecondary400d7_KjU();
        long m2568getSecondary1000d7_KjU = tonalPalette.m2568getSecondary1000d7_KjU();
        long m2576getSecondary900d7_KjU = tonalPalette.m2576getSecondary900d7_KjU();
        long m2567getSecondary100d7_KjU = tonalPalette.m2567getSecondary100d7_KjU();
        long m2584getTertiary400d7_KjU = tonalPalette.m2584getTertiary400d7_KjU();
        long m2581getTertiary1000d7_KjU = tonalPalette.m2581getTertiary1000d7_KjU();
        long m2589getTertiary900d7_KjU = tonalPalette.m2589getTertiary900d7_KjU();
        long m2580getTertiary100d7_KjU = tonalPalette.m2580getTertiary100d7_KjU();
        long m2551getNeutralVariant980d7_KjU = tonalPalette.m2551getNeutralVariant980d7_KjU();
        long m2530getNeutralVariant100d7_KjU = tonalPalette.m2530getNeutralVariant100d7_KjU();
        long m2551getNeutralVariant980d7_KjU2 = tonalPalette.m2551getNeutralVariant980d7_KjU();
        long m2530getNeutralVariant100d7_KjU2 = tonalPalette.m2530getNeutralVariant100d7_KjU();
        long m2546getNeutralVariant900d7_KjU = tonalPalette.m2546getNeutralVariant900d7_KjU();
        long m2537getNeutralVariant300d7_KjU = tonalPalette.m2537getNeutralVariant300d7_KjU();
        long m2534getNeutralVariant200d7_KjU = tonalPalette.m2534getNeutralVariant200d7_KjU();
        long m2549getNeutralVariant950d7_KjU = tonalPalette.m2549getNeutralVariant950d7_KjU();
        long m2540getNeutralVariant500d7_KjU = tonalPalette.m2540getNeutralVariant500d7_KjU();
        long m2544getNeutralVariant800d7_KjU = tonalPalette.m2544getNeutralVariant800d7_KjU();
        long m2529getNeutralVariant00d7_KjU = tonalPalette.m2529getNeutralVariant00d7_KjU();
        long m2551getNeutralVariant980d7_KjU3 = tonalPalette.m2551getNeutralVariant980d7_KjU();
        long m2545getNeutralVariant870d7_KjU = tonalPalette.m2545getNeutralVariant870d7_KjU();
        return ColorSchemeKt.m1726lightColorSchemeCXl9yA$default(m2558getPrimary400d7_KjU, m2555getPrimary1000d7_KjU, m2563getPrimary900d7_KjU, m2554getPrimary100d7_KjU, m2562getPrimary800d7_KjU, m2571getSecondary400d7_KjU, m2568getSecondary1000d7_KjU, m2576getSecondary900d7_KjU, m2567getSecondary100d7_KjU, m2584getTertiary400d7_KjU, m2581getTertiary1000d7_KjU, m2589getTertiary900d7_KjU, m2580getTertiary100d7_KjU, m2551getNeutralVariant980d7_KjU, m2530getNeutralVariant100d7_KjU, m2551getNeutralVariant980d7_KjU2, m2530getNeutralVariant100d7_KjU2, m2546getNeutralVariant900d7_KjU, m2537getNeutralVariant300d7_KjU, tonalPalette.m2558getPrimary400d7_KjU(), m2534getNeutralVariant200d7_KjU, m2549getNeutralVariant950d7_KjU, 0L, 0L, 0L, 0L, m2540getNeutralVariant500d7_KjU, m2544getNeutralVariant800d7_KjU, m2529getNeutralVariant00d7_KjU, m2551getNeutralVariant980d7_KjU3, tonalPalette.m2548getNeutralVariant940d7_KjU(), tonalPalette.m2547getNeutralVariant920d7_KjU(), tonalPalette.m2546getNeutralVariant900d7_KjU(), tonalPalette.m2550getNeutralVariant960d7_KjU(), tonalPalette.m2531getNeutralVariant1000d7_KjU(), m2545getNeutralVariant870d7_KjU, 62914560, 0, null);
    }

    @p4.l
    @RequiresApi(34)
    public static final ColorScheme dynamicLightColorScheme34(@p4.l Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        long m1677getColorWaAFU9c = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_action1_dark);
        long m1677getColorWaAFU9c2 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_action1_light);
        long m1677getColorWaAFU9c3 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_accent_light);
        long m1677getColorWaAFU9c4 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_action1);
        long m1677getColorWaAFU9c5 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_cyan_50);
        long m1677getColorWaAFU9c6 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_200);
        long m1677getColorWaAFU9c7 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_300);
        long m1677getColorWaAFU9c8 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_background);
        long m1677getColorWaAFU9c9 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_100);
        long m1677getColorWaAFU9c10 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_500);
        long m1677getColorWaAFU9c11 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_600);
        long m1677getColorWaAFU9c12 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_400);
        long m1677getColorWaAFU9c13 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_50);
        long m1677getColorWaAFU9c14 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_700);
        long m1677getColorWaAFU9c15 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_800);
        long m1677getColorWaAFU9c16 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_900);
        long m1677getColorWaAFU9c17 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_grey_800);
        long m1677getColorWaAFU9c18 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body3);
        long m1677getColorWaAFU9c19 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body3_dark);
        long m1677getColorWaAFU9c20 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_200);
        long m1677getColorWaAFU9c21 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_green_300);
        long m1677getColorWaAFU9c22 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body3_light);
        long m1677getColorWaAFU9c23 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_highlight_light);
        long m1677getColorWaAFU9c24 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body2_dark);
        long m1677getColorWaAFU9c25 = colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body2_light);
        return ColorSchemeKt.m1726lightColorSchemeCXl9yA$default(m1677getColorWaAFU9c, m1677getColorWaAFU9c2, m1677getColorWaAFU9c3, m1677getColorWaAFU9c4, m1677getColorWaAFU9c5, m1677getColorWaAFU9c6, m1677getColorWaAFU9c7, m1677getColorWaAFU9c8, m1677getColorWaAFU9c9, m1677getColorWaAFU9c10, m1677getColorWaAFU9c11, m1677getColorWaAFU9c12, m1677getColorWaAFU9c13, m1677getColorWaAFU9c14, m1677getColorWaAFU9c15, m1677getColorWaAFU9c16, m1677getColorWaAFU9c17, m1677getColorWaAFU9c18, m1677getColorWaAFU9c19, colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_action1_dark), m1677getColorWaAFU9c20, m1677getColorWaAFU9c21, 0L, 0L, 0L, 0L, m1677getColorWaAFU9c22, m1677getColorWaAFU9c23, 0L, m1677getColorWaAFU9c24, colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body1_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body1_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body2), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_blue_grey_900), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_body1), m1677getColorWaAFU9c25, 331350016, 0, null);
    }

    @p4.l
    @RequiresApi(31)
    public static final TonalPalette dynamicTonalPalette(@p4.l Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.INSTANCE;
        return new TonalPalette(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Blue_700), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Blue_800), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 98.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 96.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.GM2_grey_800), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 94.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 92.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Indigo_700), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 87.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Indigo_800), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Pink_700), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Pink_800), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_700), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Red_700), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 24.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 22.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Red_800), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 17.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 12.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Teal_700), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 6.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Purple_800), 4.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.Teal_800), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_device_default), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_device_default_50), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 98.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 96.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_device_default_700), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 94.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 92.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_device_default_dark), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 87.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_device_default_dark_60_percent_opacity), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_device_default_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_material_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accent_material_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.autofill_background_material_dark), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 24.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 22.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.autofill_background_material_light), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 17.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 12.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.autofilled_highlight), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 6.0f), m1866setLuminanceDxMtmZc(colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.accessibility_focus_highlight), 4.0f), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_device_default), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_holo_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_holo_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_material_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_cache_hint_selector_material_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_device_default_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_device_default_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_floating_device_default_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_floating_device_default_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_floating_material_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_floating_material_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_holo_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_holo_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_leanback_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_leanback_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_material_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.background_material_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_dark_disabled), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_dark_inverse), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_disabled_holo_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_disabled_holo_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_holo_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_holo_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_inverse_holo_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_inverse_holo_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_light_disabled), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.bright_foreground_light_inverse), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.btn_colored_background_material), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.btn_colored_borderless_text_material), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.btn_colored_text_material), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.btn_default_material_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.btn_default_material_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.btn_watch_default_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.button_material_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.button_material_light), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.button_normal_device_default_dark), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_accent), colorResourceHelper.m1677getColorWaAFU9c(context, android.R.color.car_accent_dark), null);
    }

    private static final float labInvf(float f5) {
        float f6 = f5 * f5 * f5;
        return f6 > 0.008856452f ? f6 : ((116 * f5) - 16) / 903.2963f;
    }

    /* renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m1866setLuminanceDxMtmZc(long j5, @FloatRange(from = 0.0d, to = 100.0d) float f5) {
        boolean z4;
        double d5 = f5;
        boolean z5 = true;
        if (d5 < 1.0E-4d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (d5 <= 99.9999d) {
            z5 = false;
        }
        if (z4 | z5) {
            int delinearized = delinearized(100 * labInvf((f5 + 16) / 116));
            return ColorKt.Color$default(delinearized, delinearized, delinearized, 0, 8, null);
        }
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        long m3731convertvNxB06k = Color.m3731convertvNxB06k(j5, colorSpaces.getCieLab());
        return Color.m3731convertvNxB06k(ColorKt.Color$default(f5, Color.m3726component2impl(m3731convertvNxB06k), Color.m3727component3impl(m3731convertvNxB06k), 0.0f, colorSpaces.getCieLab(), 8, null), colorSpaces.getSrgb());
    }
}
