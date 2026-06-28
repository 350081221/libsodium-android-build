package com.lody.virtual.helper.compat;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class ObjectsCompat {
    public static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
