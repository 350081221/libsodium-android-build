package com.bytedance.tools.d;

import android.content.Context;

/* loaded from: classes2.dex */
public class k {
    private static float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float b(Context context, float f5) {
        return (f5 * a(context)) + 0.5f;
    }
}
