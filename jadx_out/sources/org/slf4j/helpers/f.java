package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    static final char f22244a = '{';

    /* renamed from: b, reason: collision with root package name */
    static final char f22245b = '}';

    /* renamed from: c, reason: collision with root package name */
    static final String f22246c = "{}";

    /* renamed from: d, reason: collision with root package name */
    private static final char f22247d = '\\';

    public static final d a(String str, Object[] objArr) {
        int i5;
        Throwable j5 = j(objArr);
        if (str == null) {
            return new d(null, objArr, j5);
        }
        if (objArr == null) {
            return new d(str);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i6 = 0;
        int i7 = 0;
        while (i6 < objArr.length) {
            int indexOf = str.indexOf(f22246c, i7);
            if (indexOf == -1) {
                if (i7 == 0) {
                    return new d(str, objArr, j5);
                }
                stringBuffer.append(str.substring(i7, str.length()));
                return new d(stringBuffer.toString(), objArr, j5);
            }
            if (m(str, indexOf)) {
                if (!l(str, indexOf)) {
                    i6--;
                    stringBuffer.append(str.substring(i7, indexOf - 1));
                    stringBuffer.append(f22244a);
                    i5 = indexOf + 1;
                    i7 = i5;
                    i6++;
                } else {
                    stringBuffer.append(str.substring(i7, indexOf - 1));
                    e(stringBuffer, objArr[i6], new HashMap());
                }
            } else {
                stringBuffer.append(str.substring(i7, indexOf));
                e(stringBuffer, objArr[i6], new HashMap());
            }
            i5 = indexOf + 2;
            i7 = i5;
            i6++;
        }
        stringBuffer.append(str.substring(i7, str.length()));
        if (i6 < objArr.length - 1) {
            return new d(stringBuffer.toString(), objArr, j5);
        }
        return new d(stringBuffer.toString(), objArr, null);
    }

    private static void b(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(zArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void c(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append((int) bArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void d(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(cArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void e(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            p(stringBuffer, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            b(stringBuffer, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            c(stringBuffer, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            d(stringBuffer, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            q(stringBuffer, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            k(stringBuffer, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            n(stringBuffer, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            g(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            f(stringBuffer, (double[]) obj);
        } else {
            o(stringBuffer, (Object[]) obj, map);
        }
    }

    private static void f(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(dArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void g(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(fArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    public static final d h(String str, Object obj) {
        return a(str, new Object[]{obj});
    }

    public static final d i(String str, Object obj, Object obj2) {
        return a(str, new Object[]{obj, obj2});
    }

    static final Throwable j(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    private static void k(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(iArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    static final boolean l(String str, int i5) {
        return i5 >= 2 && str.charAt(i5 - 2) == '\\';
    }

    static final boolean m(String str, int i5) {
        return i5 != 0 && str.charAt(i5 - 1) == '\\';
    }

    private static void n(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append(jArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    private static void o(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                e(stringBuffer, objArr[i5], map);
                if (i5 != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append(']');
    }

    private static void p(StringBuffer stringBuffer, Object obj) {
        try {
            stringBuffer.append(obj.toString());
        } catch (Throwable th) {
            System.err.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]");
            th.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    private static void q(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            stringBuffer.append((int) sArr[i5]);
            if (i5 != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }
}
