package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes3.dex */
public class i {
    public static int a(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.c.O().getResources().getIdentifier(str, "layout", com.ss.android.socialbase.downloader.downloader.c.O().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int b(String str) {
        return a(com.ss.android.socialbase.downloader.downloader.c.O(), str);
    }

    public static int c(String str) {
        try {
            return a(str, com.ss.android.socialbase.downloader.downloader.c.O().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int d(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.c.O().getResources().getIdentifier(str, "style", com.ss.android.socialbase.downloader.downloader.c.O().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int e(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.c.O().getResources().getIdentifier(str, "id", com.ss.android.socialbase.downloader.downloader.c.O().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int f(String str) {
        try {
            return com.ss.android.socialbase.downloader.downloader.c.O().getResources().getIdentifier(str, TypedValues.Custom.S_COLOR, com.ss.android.socialbase.downloader.downloader.c.O().getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int b(String str, String str2) {
        try {
            return com.ss.android.socialbase.downloader.downloader.c.O().getResources().getIdentifier(str, "attr", str2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int a(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static int a(String str, String str2) {
        try {
            return com.ss.android.socialbase.downloader.downloader.c.O().getResources().getIdentifier(str, "drawable", str2);
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0;
        }
    }
}
