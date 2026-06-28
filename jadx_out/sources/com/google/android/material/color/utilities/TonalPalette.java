package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d5, double d6, Hct hct) {
        this.hue = d5;
        this.chroma = d6;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d5, double d6) {
        Hct from = Hct.from(d5, d6, 50.0d);
        Hct hct = from;
        double abs = Math.abs(from.getChroma() - d6);
        for (double d7 = 1.0d; d7 < 50.0d; d7 += 1.0d) {
            if (Math.round(d6) == Math.round(hct.getChroma())) {
                return hct;
            }
            Hct from2 = Hct.from(d5, d6, 50.0d + d7);
            double abs2 = Math.abs(from2.getChroma() - d6);
            if (abs2 < abs) {
                hct = from2;
                abs = abs2;
            }
            Hct from3 = Hct.from(d5, d6, 50.0d - d7);
            double abs3 = Math.abs(from3.getChroma() - d6);
            if (abs3 < abs) {
                hct = from3;
                abs = abs3;
            }
        }
        return hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d5, double d6) {
        return new TonalPalette(d5, d6, createKeyColor(d5, d6));
    }

    public static TonalPalette fromInt(int i5) {
        return fromHct(Hct.fromInt(i5));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d5) {
        return Hct.from(this.hue, this.chroma, d5);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i5) {
        Integer num = this.cache.get(Integer.valueOf(i5));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i5).toInt());
            this.cache.put(Integer.valueOf(i5), num);
        }
        return num.intValue();
    }
}
