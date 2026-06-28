package com.huawei.hms.framework.common;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes3.dex */
public class SettingUtil {
    private static final String TAG = "SettingUtil";

    public static int getSecureInt(ContentResolver contentResolver, String str, int i5) {
        try {
            return Settings.Secure.getInt(contentResolver, str, i5);
        } catch (RuntimeException e5) {
            Logger.e(TAG, "Settings Secure getInt throwFromSystemServer:", e5);
            return i5;
        }
    }

    public static int getSystemInt(ContentResolver contentResolver, String str, int i5) {
        try {
            return Settings.System.getInt(contentResolver, str, i5);
        } catch (RuntimeException e5) {
            Logger.e(TAG, "Settings System getInt throwFromSystemServer:", e5);
            return i5;
        }
    }
}
