package com.bytedance.pangle.util;

import android.text.TextUtils;
import java.io.File;

/* loaded from: classes2.dex */
public final class c {
    public static String[] a(File file) {
        String[] a5 = com.bytedance.pangle.util.a.b.a(file);
        if (TextUtils.isEmpty(a5[0])) {
            return com.bytedance.pangle.util.a.a.a(file);
        }
        return a5;
    }
}
