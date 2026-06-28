package com.lody.virtual.helper.compat;

import android.os.Build;
import s.a;

/* loaded from: classes3.dex */
public class BuildCompat {
    private static ROMType sRomType;

    /* loaded from: classes3.dex */
    public enum ROMType {
        EMUI,
        MIUI,
        FLYME,
        COLOR_OS,
        LETV,
        VIVO,
        _360,
        SAMSUNG,
        OTHER
    }

    public static int getPreviewSDKInt() {
        try {
            return Build.VERSION.PREVIEW_SDK_INT;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static ROMType getROMType() {
        if (sRomType == null) {
            if (isEMUI()) {
                sRomType = ROMType.EMUI;
            } else if (isMIUI()) {
                sRomType = ROMType.MIUI;
            } else if (isFlyme()) {
                sRomType = ROMType.FLYME;
            } else if (isColorOS()) {
                sRomType = ROMType.COLOR_OS;
            } else if (is360UI()) {
                sRomType = ROMType._360;
            } else if (isLetv()) {
                sRomType = ROMType.LETV;
            } else if (isVivo()) {
                sRomType = ROMType.VIVO;
            } else if (isSamsung()) {
                sRomType = ROMType.SAMSUNG;
            } else {
                sRomType = ROMType.OTHER;
            }
        }
        return sRomType;
    }

    public static boolean is360UI() {
        String str = SystemPropertiesCompat.get("ro.build.uiversion");
        if (str != null && str.toUpperCase().contains("360UI")) {
            return true;
        }
        return false;
    }

    public static boolean isColorOS() {
        if (!SystemPropertiesCompat.isExist("ro.build.version.opporom") && !SystemPropertiesCompat.isExist("ro.rom.different.version")) {
            return false;
        }
        return true;
    }

    public static boolean isEMUI() {
        if (Build.DISPLAY.toUpperCase().startsWith("EMUI")) {
            return true;
        }
        String str = SystemPropertiesCompat.get(a.f22319a);
        if (str != null && str.contains("EmotionUI")) {
            return true;
        }
        return false;
    }

    public static boolean isFlyme() {
        return Build.DISPLAY.toLowerCase().contains("flyme");
    }

    public static boolean isLetv() {
        return Build.MANUFACTURER.equalsIgnoreCase("Letv");
    }

    public static boolean isMIUI() {
        if (SystemPropertiesCompat.getInt("ro.miui.ui.version.code", 0) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isOreo() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 25 || (i5 == 25 && getPreviewSDKInt() > 0);
    }

    public static boolean isPie() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 27 || (i5 == 27 && getPreviewSDKInt() > 0);
    }

    public static boolean isQ() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 28 || (i5 == 28 && getPreviewSDKInt() > 0);
    }

    public static boolean isR() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 29 || (i5 == 29 && getPreviewSDKInt() > 0);
    }

    public static boolean isS() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 30 || (i5 == 30 && getPreviewSDKInt() > 0);
    }

    public static boolean isSL() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 31 || (i5 == 31 && getPreviewSDKInt() > 0);
    }

    public static boolean isSamsung() {
        return "samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isTiramisu() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 32 || (i5 == 32 && getPreviewSDKInt() > 0);
    }

    public static boolean isUpsideDownCake() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 33 || (i5 == 33 && getPreviewSDKInt() > 0);
    }

    public static boolean isVivo() {
        return SystemPropertiesCompat.isExist("ro.vivo.os.build.display.id");
    }
}
