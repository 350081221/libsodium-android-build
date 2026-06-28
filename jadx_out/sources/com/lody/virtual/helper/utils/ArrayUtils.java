package com.lody.virtual.helper.utils;

import com.lody.virtual.helper.compat.ObjectsCompat;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ArrayUtils {
    public static void checkOffsetAndCount(int i5, int i6, int i7) throws ArrayIndexOutOfBoundsException {
        if ((i6 | i7) < 0 || i6 > i5 || i5 - i6 < i7) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
    }

    public static <T> boolean contains(T[] tArr, T t5) {
        return indexOf(tArr, t5) != -1;
    }

    public static <T> T getFirst(Object[] objArr, Class<?> cls) {
        int indexOfFirst = indexOfFirst(objArr, cls);
        if (indexOfFirst != -1) {
            return (T) objArr[indexOfFirst];
        }
        return null;
    }

    public static <T> int indexOf(T[] tArr, T t5) {
        if (tArr == null) {
            return -1;
        }
        for (int i5 = 0; i5 < tArr.length; i5++) {
            if (ObjectsCompat.equals(tArr[i5], t5)) {
                return i5;
            }
        }
        return -1;
    }

    public static int indexOfFirst(Object[] objArr, Class<?> cls) {
        if (!isEmpty(objArr)) {
            int i5 = -1;
            for (Object obj : objArr) {
                i5++;
                if (obj != null && cls.isInstance(obj)) {
                    return i5;
                }
            }
        }
        return -1;
    }

    public static int indexOfLast(Object[] objArr, Class<?> cls) {
        if (!isEmpty(objArr)) {
            for (int length = objArr.length; length > 0; length--) {
                int i5 = length - 1;
                Object obj = objArr[i5];
                if (obj != null && obj.getClass() == cls) {
                    return i5;
                }
            }
            return -1;
        }
        return -1;
    }

    public static int indexOfObject(Object[] objArr, Class<?> cls, int i5) {
        if (objArr == null) {
            return -1;
        }
        while (i5 < objArr.length) {
            if (cls.isInstance(objArr[i5])) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static <T> boolean isEmpty(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static int protoIndexOf(Class<?>[] clsArr, Class<?> cls) {
        if (clsArr == null) {
            return -1;
        }
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            if (clsArr[i5] == cls) {
                return i5;
            }
        }
        return -1;
    }

    public static Object[] push(Object[] objArr, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        objArr2[objArr.length] = obj;
        return objArr2;
    }

    public static <T> T[] trimToSize(T[] tArr, int i5) {
        if (tArr != null && i5 != 0) {
            if (tArr.length == i5) {
                return tArr;
            }
            return (T[]) Arrays.copyOf(tArr, i5);
        }
        return null;
    }

    public static boolean contains(int[] iArr, int i5) {
        if (iArr == null) {
            return false;
        }
        for (int i6 : iArr) {
            if (i6 == i5) {
                return true;
            }
        }
        return false;
    }

    public static int indexOf(Object[] objArr, Class<?> cls, int i5) {
        if (!isEmpty(objArr)) {
            int i6 = -1;
            for (Object obj : objArr) {
                i6++;
                if (obj != null && obj.getClass() == cls && i5 - 1 <= 0) {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int protoIndexOf(Class<?>[] clsArr, Class<?> cls, int i5) {
        if (clsArr == null) {
            return -1;
        }
        while (i5 < clsArr.length) {
            if (cls == clsArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }
}
