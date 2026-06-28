package org.apache.http.util;

@Deprecated
/* loaded from: assets/org.apache.http.legacy.boot */
public final class LangUtils {
    public static final int HASH_OFFSET = 37;
    public static final int HASH_SEED = 17;

    private LangUtils() {
    }

    public static int hashCode(int seed, int hashcode) {
        return (seed * 37) + hashcode;
    }

    public static int hashCode(int i5, boolean z4) {
        return hashCode(i5, z4 ? 1 : 0);
    }

    public static int hashCode(int seed, Object obj) {
        return hashCode(seed, obj != null ? obj.hashCode() : 0);
    }

    public static boolean equals(Object obj1, Object obj2) {
        return obj1 == null ? obj2 == null : obj1.equals(obj2);
    }

    public static boolean equals(Object[] a12, Object[] a22) {
        if (a12 == null) {
            return a22 == null;
        }
        if (a22 == null || a12.length != a22.length) {
            return false;
        }
        for (int i5 = 0; i5 < a12.length; i5++) {
            if (!equals(a12[i5], a22[i5])) {
                return false;
            }
        }
        return true;
    }
}
