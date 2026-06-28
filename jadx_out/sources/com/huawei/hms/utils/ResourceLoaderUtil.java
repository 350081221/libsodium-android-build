package com.huawei.hms.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes3.dex */
public abstract class ResourceLoaderUtil {

    /* renamed from: a, reason: collision with root package name */
    public static Context f8859a;

    /* renamed from: b, reason: collision with root package name */
    public static String f8860b;

    public static int getAnimId(String str) {
        return f8859a.getResources().getIdentifier(str, "anim", f8860b);
    }

    public static int getColorId(String str) {
        return f8859a.getResources().getIdentifier(str, TypedValues.Custom.S_COLOR, f8860b);
    }

    public static Drawable getDrawable(String str) {
        return f8859a.getResources().getDrawable(getDrawableId(str));
    }

    public static int getDrawableId(String str) {
        return f8859a.getResources().getIdentifier(str, "drawable", f8860b);
    }

    public static int getIdId(String str) {
        return f8859a.getResources().getIdentifier(str, "id", f8860b);
    }

    public static int getLayoutId(String str) {
        return f8859a.getResources().getIdentifier(str, "layout", f8860b);
    }

    public static String getString(String str) {
        return f8859a.getResources().getString(getStringId(str));
    }

    public static int getStringId(String str) {
        return f8859a.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, f8860b);
    }

    public static int getStyleId(String str) {
        return f8859a.getResources().getIdentifier(str, "style", f8860b);
    }

    public static Context getmContext() {
        return f8859a;
    }

    public static void setmContext(Context context) {
        f8859a = context;
        f8860b = context.getPackageName();
    }

    public static String getString(String str, Object... objArr) {
        return f8859a.getResources().getString(getStringId(str), objArr);
    }
}
