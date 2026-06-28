package com.zzhoujay.richtext.ext;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes3.dex */
public class b {
    public static boolean a(Context context) {
        Activity b5 = b(context);
        if (b5 == null || b5.isFinishing() || b5.isDestroyed()) {
            return false;
        }
        return true;
    }

    public static Activity b(Context context) {
        boolean z4;
        if (context == null) {
            return null;
        }
        while (true) {
            z4 = context instanceof Activity;
            if (z4 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z4) {
            return null;
        }
        return (Activity) context;
    }
}
