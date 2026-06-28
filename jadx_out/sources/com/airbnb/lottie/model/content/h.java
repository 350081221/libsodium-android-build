package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;

/* loaded from: classes2.dex */
public enum h {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1432a;

        static {
            int[] iArr = new int[h.values().length];
            f1432a = iArr;
            try {
                iArr[h.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1432a[h.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1432a[h.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1432a[h.DARKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1432a[h.LIGHTEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1432a[h.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1432a[h.MULTIPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1432a[h.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1432a[h.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1432a[h.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1432a[h.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1432a[h.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1432a[h.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1432a[h.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1432a[h.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f1432a[h.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f1432a[h.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f1432a[h.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Nullable
    public BlendModeCompat toNativeBlendMode() {
        int i5 = a.f1432a[ordinal()];
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    if (i5 != 5) {
                        if (i5 != 6) {
                            return null;
                        }
                        return BlendModeCompat.PLUS;
                    }
                    return BlendModeCompat.LIGHTEN;
                }
                return BlendModeCompat.DARKEN;
            }
            return BlendModeCompat.OVERLAY;
        }
        return BlendModeCompat.SCREEN;
    }
}
