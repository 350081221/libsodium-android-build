package org.osmdroid.views.overlay.advancedpolyline;

import android.graphics.Color;

/* loaded from: classes4.dex */
public class a {
    public static int a(float f5, float f6, float f7) {
        int round;
        int round2;
        int round3;
        int round4;
        float abs = (1.0f - Math.abs((f7 * 2.0f) - 1.0f)) * f6;
        float f8 = f7 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f5 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f5) / 60) {
            case 0:
                round = Math.round((abs + f8) * 255.0f);
                round2 = Math.round((abs2 + f8) * 255.0f);
                round3 = Math.round(f8 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f8) * 255.0f);
                round2 = Math.round((abs + f8) * 255.0f);
                round3 = Math.round(f8 * 255.0f);
                break;
            case 2:
                round = Math.round(f8 * 255.0f);
                round2 = Math.round((abs + f8) * 255.0f);
                round3 = Math.round((abs2 + f8) * 255.0f);
                break;
            case 3:
                round = Math.round(f8 * 255.0f);
                round4 = Math.round((abs2 + f8) * 255.0f);
                round3 = Math.round((abs + f8) * 255.0f);
                round2 = round4;
                break;
            case 4:
                round = Math.round((abs2 + f8) * 255.0f);
                round4 = Math.round(f8 * 255.0f);
                round3 = Math.round((abs + f8) * 255.0f);
                round2 = round4;
                break;
            case 5:
            case 6:
                round = Math.round((abs + f8) * 255.0f);
                round2 = Math.round(f8 * 255.0f);
                round3 = Math.round((abs2 + f8) * 255.0f);
                break;
            default:
                round = 0;
                round3 = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(c(round, 0, 255), c(round2, 0, 255), c(round3, 0, 255));
    }

    public static float b(float f5, float f6, float f7) {
        return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
    }

    private static int c(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
    }
}
