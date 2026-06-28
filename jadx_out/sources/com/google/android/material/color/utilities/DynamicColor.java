package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z4, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z4;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d5) {
        if (!tonePrefersLightForeground(d5) || toneAllowsLightForeground(d5)) {
            return d5;
        }
        return 49.0d;
    }

    public static double foregroundTone(double d5, double d6) {
        boolean z4;
        double lighterUnsafe = Contrast.lighterUnsafe(d5, d6);
        double darkerUnsafe = Contrast.darkerUnsafe(d5, d6);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d5);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d5);
        if (tonePrefersLightForeground(d5)) {
            if (Math.abs(ratioOfTones - ratioOfTones2) < 0.1d && ratioOfTones < d6 && ratioOfTones2 < d6) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ratioOfTones < d6 && ratioOfTones < ratioOfTones2 && !z4) {
                return darkerUnsafe;
            }
            return lighterUnsafe;
        }
        if (ratioOfTones2 >= d6 || ratioOfTones2 >= ratioOfTones) {
            return darkerUnsafe;
        }
        return lighterUnsafe;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i5) {
        final Hct fromInt = Hct.fromInt(i5);
        final TonalPalette fromInt2 = TonalPalette.fromInt(i5);
        return fromPalette(str, new Function() { // from class: com.google.android.material.color.utilities.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette lambda$fromArgb$0;
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0(TonalPalette.this, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            }
        }, new Function() { // from class: com.google.android.material.color.utilities.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromArgb$1;
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1(Hct.this, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            }
        });
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static boolean toneAllowsLightForeground(double d5) {
        return Math.round(d5) <= 49;
    }

    public static boolean tonePrefersLightForeground(double d5) {
        return Math.round(d5) < 60;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i5 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i5;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i5 & ViewCompat.MEASURED_SIZE_MASK);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        boolean z4;
        double d5;
        boolean z5;
        boolean z6;
        DynamicColor dynamicColor;
        DynamicColor dynamicColor2;
        double d6;
        double d7;
        if (dynamicScheme.contrastLevel < 0.0d) {
            z4 = true;
        } else {
            z4 = false;
        }
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function != null) {
            ToneDeltaPair apply = function.apply(dynamicScheme);
            DynamicColor roleA = apply.getRoleA();
            DynamicColor roleB = apply.getRoleB();
            double delta = apply.getDelta();
            TonePolarity polarity = apply.getPolarity();
            boolean stayTogether = apply.getStayTogether();
            double tone = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            if (polarity != TonePolarity.NEARER && ((polarity != TonePolarity.LIGHTER || dynamicScheme.isDark) && (polarity != TonePolarity.DARKER || !dynamicScheme.isDark))) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                dynamicColor = roleA;
            } else {
                dynamicColor = roleB;
            }
            if (z6) {
                dynamicColor2 = roleB;
            } else {
                dynamicColor2 = roleA;
            }
            boolean equals = this.name.equals(dynamicColor.name);
            if (dynamicScheme.isDark) {
                d6 = 1.0d;
            } else {
                d6 = -1.0d;
            }
            double contrast = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double contrast2 = dynamicColor2.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            double doubleValue = dynamicColor.tone.apply(dynamicScheme).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue) < contrast) {
                doubleValue = foregroundTone(tone, contrast);
            }
            double d8 = doubleValue;
            double doubleValue2 = dynamicColor2.tone.apply(dynamicScheme).doubleValue();
            if (Contrast.ratioOfTones(tone, doubleValue2) < contrast2) {
                doubleValue2 = foregroundTone(tone, contrast2);
            }
            if (z4) {
                d8 = foregroundTone(tone, contrast);
                doubleValue2 = foregroundTone(tone, contrast2);
            }
            if ((doubleValue2 - d8) * d6 < delta) {
                double d9 = delta * d6;
                doubleValue2 = MathUtils.clampDouble(0.0d, 100.0d, d8 + d9);
                if ((doubleValue2 - d8) * d6 < delta) {
                    d8 = MathUtils.clampDouble(0.0d, 100.0d, doubleValue2 - d9);
                }
            }
            if (50.0d <= d8 && d8 < 60.0d) {
                if (d6 > 0.0d) {
                    d8 = 60.0d;
                    d7 = Math.max(doubleValue2, (delta * d6) + 60.0d);
                } else {
                    d7 = Math.min(doubleValue2, (delta * d6) + 49.0d);
                    d8 = 49.0d;
                }
            } else if (50.0d <= doubleValue2 && doubleValue2 < 60.0d) {
                if (stayTogether) {
                    if (d6 > 0.0d) {
                        d7 = Math.max(doubleValue2, (delta * d6) + 60.0d);
                        d8 = 60.0d;
                    } else {
                        d7 = Math.min(doubleValue2, (delta * d6) + 49.0d);
                        d8 = 49.0d;
                    }
                } else if (d6 > 0.0d) {
                    d7 = 60.0d;
                } else {
                    d7 = 49.0d;
                }
            } else {
                d7 = doubleValue2;
            }
            if (equals) {
                return d8;
            }
            return d7;
        }
        double doubleValue3 = this.tone.apply(dynamicScheme).doubleValue();
        Function<DynamicScheme, DynamicColor> function2 = this.background;
        if (function2 == null) {
            return doubleValue3;
        }
        double tone2 = function2.apply(dynamicScheme).getTone(dynamicScheme);
        double contrast3 = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        if (Contrast.ratioOfTones(tone2, doubleValue3) < contrast3) {
            doubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (z4) {
            doubleValue3 = foregroundTone(tone2, contrast3);
        }
        if (this.isBackground && 50.0d <= doubleValue3 && doubleValue3 < 60.0d) {
            if (Contrast.ratioOfTones(49.0d, tone2) >= contrast3) {
                d5 = 49.0d;
            } else {
                d5 = 60.0d;
            }
        } else {
            d5 = doubleValue3;
        }
        if (this.secondBackground != null) {
            double tone3 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            double tone4 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
            double max = Math.max(tone3, tone4);
            double min = Math.min(tone3, tone4);
            if (Contrast.ratioOfTones(max, d5) >= contrast3 && Contrast.ratioOfTones(min, d5) >= contrast3) {
                return d5;
            }
            double lighter = Contrast.lighter(max, contrast3);
            double darker = Contrast.darker(min, contrast3);
            ArrayList arrayList = new ArrayList();
            if (lighter != -1.0d) {
                arrayList.add(Double.valueOf(lighter));
            }
            if (darker != -1.0d) {
                arrayList.add(Double.valueOf(darker));
            }
            if (!tonePrefersLightForeground(tone3) && !tonePrefersLightForeground(tone4)) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                if (lighter == -1.0d) {
                    return 100.0d;
                }
                return lighter;
            }
            if (arrayList.size() == 1) {
                return ((Double) arrayList.get(0)).doubleValue();
            }
            if (darker == -1.0d) {
                return 0.0d;
            }
            return darker;
        }
        return d5;
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z4) {
        return new DynamicColor(str, function, function2, z4, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z4, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z4;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }
}
