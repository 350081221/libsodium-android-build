package com.bytedance.pangle.util;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class d {
    public static <T> boolean a(@Nullable T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static <T> boolean a(@Nullable T[] tArr, T[] tArr2) {
        if (tArr2 == null) {
            return true;
        }
        for (T t5 : tArr2) {
            if (!a(tArr, t5)) {
                return false;
            }
        }
        return true;
    }

    private static <T> boolean a(@Nullable T[] tArr, T t5) {
        int i5;
        if (tArr != null) {
            i5 = 0;
            while (i5 < tArr.length) {
                T t6 = tArr[i5];
                if (t6 == t5 || (t6 != null && t6.equals(t5))) {
                    break;
                }
                i5++;
            }
        }
        i5 = -1;
        return i5 != -1;
    }
}
