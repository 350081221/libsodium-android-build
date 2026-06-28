package external.org.apache.commons.lang3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f15918a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f15919b = new Class[0];

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f15920c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f15921d = new long[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Long[] f15922e = new Long[0];

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f15923f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final Integer[] f15924g = new Integer[0];

    /* renamed from: h, reason: collision with root package name */
    public static final short[] f15925h = new short[0];

    /* renamed from: i, reason: collision with root package name */
    public static final Short[] f15926i = new Short[0];

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f15927j = new byte[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Byte[] f15928k = new Byte[0];

    /* renamed from: l, reason: collision with root package name */
    public static final double[] f15929l = new double[0];

    /* renamed from: m, reason: collision with root package name */
    public static final Double[] f15930m = new Double[0];

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f15931n = new float[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Float[] f15932o = new Float[0];

    /* renamed from: p, reason: collision with root package name */
    public static final boolean[] f15933p = new boolean[0];

    /* renamed from: q, reason: collision with root package name */
    public static final Boolean[] f15934q = new Boolean[0];

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f15935r = new char[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Character[] f15936s = new Character[0];

    /* renamed from: t, reason: collision with root package name */
    public static final int f15937t = -1;

    public static short[] A(short[] sArr, short... sArr2) {
        if (sArr == null) {
            return J(sArr2);
        }
        if (sArr2 == null) {
            return J(sArr);
        }
        short[] sArr3 = new short[sArr.length + sArr2.length];
        System.arraycopy(sArr, 0, sArr3, 0, sArr.length);
        System.arraycopy(sArr2, 0, sArr3, sArr.length, sArr2.length);
        return sArr3;
    }

    public static boolean A0(short[] sArr) {
        return sArr == null || sArr.length == 0;
    }

    public static Float[] A1(Float[] fArr) {
        if (fArr != null && fArr.length != 0) {
            return fArr;
        }
        return f15932o;
    }

    public static void A2(Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            Object obj = objArr[length];
            objArr[length] = objArr[i5];
            objArr[i5] = obj;
            length--;
        }
    }

    public static boolean[] B(boolean[] zArr, boolean... zArr2) {
        if (zArr == null) {
            return K(zArr2);
        }
        if (zArr2 == null) {
            return K(zArr);
        }
        boolean[] zArr3 = new boolean[zArr.length + zArr2.length];
        System.arraycopy(zArr, 0, zArr3, 0, zArr.length);
        System.arraycopy(zArr2, 0, zArr3, zArr.length, zArr2.length);
        return zArr3;
    }

    public static boolean B0(boolean[] zArr) {
        return zArr == null || zArr.length == 0;
    }

    public static Integer[] B1(Integer[] numArr) {
        if (numArr != null && numArr.length != 0) {
            return numArr;
        }
        return f15924g;
    }

    public static void B2(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            short s5 = sArr[length];
            sArr[length] = sArr[i5];
            sArr[i5] = s5;
            length--;
        }
    }

    public static byte[] C(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean C0(Object obj, Object obj2) {
        return new external.org.apache.commons.lang3.builder.c().g(obj, obj2).w();
    }

    public static Long[] C1(Long[] lArr) {
        if (lArr != null && lArr.length != 0) {
            return lArr;
        }
        return f15922e;
    }

    public static void C2(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            boolean z4 = zArr[length];
            zArr[length] = zArr[i5];
            zArr[i5] = z4;
            length--;
        }
    }

    public static char[] D(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return (char[]) cArr.clone();
    }

    public static boolean D0(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? false : true;
    }

    public static Object[] D1(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            return objArr;
        }
        return f15918a;
    }

    public static byte[] D2(byte[] bArr, int i5, int i6) {
        if (bArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > bArr.length) {
            i6 = bArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15927j;
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, i5, bArr2, 0, i7);
        return bArr2;
    }

    public static double[] E(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return (double[]) dArr.clone();
    }

    public static boolean E0(char[] cArr) {
        return (cArr == null || cArr.length == 0) ? false : true;
    }

    public static Short[] E1(Short[] shArr) {
        if (shArr != null && shArr.length != 0) {
            return shArr;
        }
        return f15926i;
    }

    public static char[] E2(char[] cArr, int i5, int i6) {
        if (cArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > cArr.length) {
            i6 = cArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15935r;
        }
        char[] cArr2 = new char[i7];
        System.arraycopy(cArr, i5, cArr2, 0, i7);
        return cArr2;
    }

    public static float[] F(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public static boolean F0(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? false : true;
    }

    public static String[] F1(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            return strArr;
        }
        return f15920c;
    }

    public static double[] F2(double[] dArr, int i5, int i6) {
        if (dArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > dArr.length) {
            i6 = dArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15929l;
        }
        double[] dArr2 = new double[i7];
        System.arraycopy(dArr, i5, dArr2, 0, i7);
        return dArr2;
    }

    public static int[] G(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static boolean G0(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? false : true;
    }

    public static short[] G1(short[] sArr) {
        if (sArr != null && sArr.length != 0) {
            return sArr;
        }
        return f15925h;
    }

    public static float[] G2(float[] fArr, int i5, int i6) {
        if (fArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > fArr.length) {
            i6 = fArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15931n;
        }
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, i5, fArr2, 0, i7);
        return fArr2;
    }

    public static long[] H(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static boolean H0(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? false : true;
    }

    public static boolean[] H1(boolean[] zArr) {
        if (zArr != null && zArr.length != 0) {
            return zArr;
        }
        return f15933p;
    }

    public static int[] H2(int[] iArr, int i5, int i6) {
        if (iArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > iArr.length) {
            i6 = iArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15923f;
        }
        int[] iArr2 = new int[i7];
        System.arraycopy(iArr, i5, iArr2, 0, i7);
        return iArr2;
    }

    public static <T> T[] I(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) ((Object[]) tArr.clone());
    }

    public static boolean I0(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    private static Object I1(Object obj, int i5) {
        int X = X(obj);
        if (i5 >= 0 && i5 < X) {
            int i6 = X - 1;
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i6);
            System.arraycopy(obj, 0, newInstance, 0, i5);
            if (i5 < i6) {
                System.arraycopy(obj, i5 + 1, newInstance, i5, (X - i5) - 1);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i5 + ", Length: " + X);
    }

    public static long[] I2(long[] jArr, int i5, int i6) {
        if (jArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > jArr.length) {
            i6 = jArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15921d;
        }
        long[] jArr2 = new long[i7];
        System.arraycopy(jArr, i5, jArr2, 0, i7);
        return jArr2;
    }

    public static short[] J(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static <T> boolean J0(T[] tArr) {
        return (tArr == null || tArr.length == 0) ? false : true;
    }

    public static byte[] J1(byte[] bArr, int i5) {
        return (byte[]) I1(bArr, i5);
    }

    public static <T> T[] J2(T[] tArr, int i5, int i6) {
        if (tArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > tArr.length) {
            i6 = tArr.length;
        }
        int i7 = i6 - i5;
        Class<?> componentType = tArr.getClass().getComponentType();
        if (i7 <= 0) {
            return (T[]) ((Object[]) Array.newInstance(componentType, 0));
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(componentType, i7));
        System.arraycopy(tArr, i5, tArr2, 0, i7);
        return tArr2;
    }

    public static boolean[] K(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    public static boolean K0(short[] sArr) {
        return (sArr == null || sArr.length == 0) ? false : true;
    }

    public static char[] K1(char[] cArr, int i5) {
        return (char[]) I1(cArr, i5);
    }

    public static short[] K2(short[] sArr, int i5, int i6) {
        if (sArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > sArr.length) {
            i6 = sArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15925h;
        }
        short[] sArr2 = new short[i7];
        System.arraycopy(sArr, i5, sArr2, 0, i7);
        return sArr2;
    }

    public static boolean L(byte[] bArr, byte b5) {
        return Z(bArr, b5) != -1;
    }

    public static boolean L0(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? false : true;
    }

    public static double[] L1(double[] dArr, int i5) {
        return (double[]) I1(dArr, i5);
    }

    public static boolean[] L2(boolean[] zArr, int i5, int i6) {
        if (zArr == null) {
            return null;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 > zArr.length) {
            i6 = zArr.length;
        }
        int i7 = i6 - i5;
        if (i7 <= 0) {
            return f15933p;
        }
        boolean[] zArr2 = new boolean[i7];
        System.arraycopy(zArr, i5, zArr2, 0, i7);
        return zArr2;
    }

    public static boolean M(char[] cArr, char c5) {
        return b0(cArr, c5) != -1;
    }

    public static boolean M0(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 != null && bArr2.length > 0) {
            return false;
        }
        if (bArr2 != null || bArr == null || bArr.length <= 0) {
            return bArr == null || bArr2 == null || bArr.length == bArr2.length;
        }
        return false;
    }

    public static float[] M1(float[] fArr, int i5) {
        return (float[]) I1(fArr, i5);
    }

    public static <T> T[] M2(T... tArr) {
        return tArr;
    }

    public static boolean N(double[] dArr, double d5) {
        return d0(dArr, d5) != -1;
    }

    public static boolean N0(char[] cArr, char[] cArr2) {
        if (cArr == null && cArr2 != null && cArr2.length > 0) {
            return false;
        }
        if (cArr2 != null || cArr == null || cArr.length <= 0) {
            return cArr == null || cArr2 == null || cArr.length == cArr2.length;
        }
        return false;
    }

    public static int[] N1(int[] iArr, int i5) {
        return (int[]) I1(iArr, i5);
    }

    public static Map<Object, Object> N2(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap((int) (objArr.length * 1.5d));
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                hashMap.put(entry.getKey(), entry.getValue());
            } else if (obj instanceof Object[]) {
                Object[] objArr2 = (Object[]) obj;
                if (objArr2.length >= 2) {
                    hashMap.put(objArr2[0], objArr2[1]);
                } else {
                    throw new IllegalArgumentException("Array element " + i5 + ", '" + obj + "', has a length less than 2");
                }
            } else {
                throw new IllegalArgumentException("Array element " + i5 + ", '" + obj + "', is neither of type Map.Entry nor an Array");
            }
        }
        return hashMap;
    }

    public static boolean O(double[] dArr, double d5, double d6) {
        return g0(dArr, d5, 0, d6) != -1;
    }

    public static boolean O0(double[] dArr, double[] dArr2) {
        if (dArr == null && dArr2 != null && dArr2.length > 0) {
            return false;
        }
        if (dArr2 != null || dArr == null || dArr.length <= 0) {
            return dArr == null || dArr2 == null || dArr.length == dArr2.length;
        }
        return false;
    }

    public static long[] O1(long[] jArr, int i5) {
        return (long[]) I1(jArr, i5);
    }

    public static Boolean[] O2(boolean[] zArr) {
        Boolean bool;
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return f15934q;
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i5 = 0; i5 < zArr.length; i5++) {
            if (zArr[i5]) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            boolArr[i5] = bool;
        }
        return boolArr;
    }

    public static boolean P(float[] fArr, float f5) {
        return h0(fArr, f5) != -1;
    }

    public static boolean P0(float[] fArr, float[] fArr2) {
        if (fArr == null && fArr2 != null && fArr2.length > 0) {
            return false;
        }
        if (fArr2 != null || fArr == null || fArr.length <= 0) {
            return fArr == null || fArr2 == null || fArr.length == fArr2.length;
        }
        return false;
    }

    public static <T> T[] P1(T[] tArr, int i5) {
        return (T[]) ((Object[]) I1(tArr, i5));
    }

    public static Byte[] P2(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f15928k;
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr2[i5] = Byte.valueOf(bArr[i5]);
        }
        return bArr2;
    }

    public static boolean Q(int[] iArr, int i5) {
        return j0(iArr, i5) != -1;
    }

    public static boolean Q0(int[] iArr, int[] iArr2) {
        if (iArr == null && iArr2 != null && iArr2.length > 0) {
            return false;
        }
        if (iArr2 != null || iArr == null || iArr.length <= 0) {
            return iArr == null || iArr2 == null || iArr.length == iArr2.length;
        }
        return false;
    }

    public static short[] Q1(short[] sArr, int i5) {
        return (short[]) I1(sArr, i5);
    }

    public static Character[] Q2(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return f15936s;
        }
        Character[] chArr = new Character[cArr.length];
        for (int i5 = 0; i5 < cArr.length; i5++) {
            chArr[i5] = Character.valueOf(cArr[i5]);
        }
        return chArr;
    }

    public static boolean R(long[] jArr, long j5) {
        return l0(jArr, j5) != -1;
    }

    public static boolean R0(long[] jArr, long[] jArr2) {
        if (jArr == null && jArr2 != null && jArr2.length > 0) {
            return false;
        }
        if (jArr2 != null || jArr == null || jArr.length <= 0) {
            return jArr == null || jArr2 == null || jArr.length == jArr2.length;
        }
        return false;
    }

    public static boolean[] R1(boolean[] zArr, int i5) {
        return (boolean[]) I1(zArr, i5);
    }

    public static Double[] R2(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f15930m;
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr2[i5] = Double.valueOf(dArr[i5]);
        }
        return dArr2;
    }

    public static boolean S(Object[] objArr, Object obj) {
        return n0(objArr, obj) != -1;
    }

    public static boolean S0(Object[] objArr, Object[] objArr2) {
        if (objArr == null && objArr2 != null && objArr2.length > 0) {
            return false;
        }
        if (objArr2 != null || objArr == null || objArr.length <= 0) {
            return objArr == null || objArr2 == null || objArr.length == objArr2.length;
        }
        return false;
    }

    private static Object S1(Object obj, int... iArr) {
        int i5;
        int i6;
        int X = X(obj);
        if (H0(iArr)) {
            Arrays.sort(iArr);
            int length = iArr.length;
            int i7 = X;
            i5 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i6 = iArr[length];
                if (i6 < 0 || i6 >= X) {
                    break;
                }
                if (i6 < i7) {
                    i5++;
                    i7 = i6;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i6 + ", Length: " + X);
        }
        i5 = 0;
        int i8 = X - i5;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i8);
        if (i5 < X) {
            int length2 = iArr.length - 1;
            while (length2 >= 0) {
                int i9 = iArr[length2];
                int i10 = X - i9;
                if (i10 > 1) {
                    int i11 = i10 - 1;
                    i8 -= i11;
                    System.arraycopy(obj, i9 + 1, newInstance, i8, i11);
                }
                length2--;
                X = i9;
            }
            if (X > 0) {
                System.arraycopy(obj, 0, newInstance, 0, X);
            }
        }
        return newInstance;
    }

    public static Float[] S2(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f15932o;
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr2[i5] = Float.valueOf(fArr[i5]);
        }
        return fArr2;
    }

    public static boolean T(short[] sArr, short s5) {
        return p0(sArr, s5) != -1;
    }

    public static boolean T0(short[] sArr, short[] sArr2) {
        if (sArr == null && sArr2 != null && sArr2.length > 0) {
            return false;
        }
        if (sArr2 != null || sArr == null || sArr.length <= 0) {
            return sArr == null || sArr2 == null || sArr.length == sArr2.length;
        }
        return false;
    }

    public static byte[] T1(byte[] bArr, int... iArr) {
        return (byte[]) S1(bArr, G(iArr));
    }

    public static Integer[] T2(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return f15924g;
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            numArr[i5] = Integer.valueOf(iArr[i5]);
        }
        return numArr;
    }

    public static boolean U(boolean[] zArr, boolean z4) {
        return r0(zArr, z4) != -1;
    }

    public static boolean U0(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null && zArr2 != null && zArr2.length > 0) {
            return false;
        }
        if (zArr2 != null || zArr == null || zArr.length <= 0) {
            return zArr == null || zArr2 == null || zArr.length == zArr2.length;
        }
        return false;
    }

    public static char[] U1(char[] cArr, int... iArr) {
        return (char[]) S1(cArr, G(iArr));
    }

    public static Long[] U2(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return f15922e;
        }
        Long[] lArr = new Long[jArr.length];
        for (int i5 = 0; i5 < jArr.length; i5++) {
            lArr[i5] = Long.valueOf(jArr[i5]);
        }
        return lArr;
    }

    private static Object V(Object obj, Class<?> cls) {
        if (obj != null) {
            int length = Array.getLength(obj);
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            return newInstance;
        }
        return Array.newInstance(cls, 1);
    }

    public static boolean V0(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return obj.getClass().getName().equals(obj2.getClass().getName());
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double[] V1(double[] dArr, int... iArr) {
        return (double[]) S1(dArr, G(iArr));
    }

    public static Short[] V2(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return f15926i;
        }
        Short[] shArr = new Short[sArr.length];
        for (int i5 = 0; i5 < sArr.length; i5++) {
            shArr[i5] = Short.valueOf(sArr[i5]);
        }
        return shArr;
    }

    private static int[] W(HashSet<Integer> hashSet) {
        int[] iArr = new int[hashSet.size()];
        Iterator<Integer> it = hashSet.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = it.next().intValue();
            i5++;
        }
        return iArr;
    }

    public static int W0(byte[] bArr, byte b5) {
        return X0(bArr, b5, Integer.MAX_VALUE);
    }

    public static float[] W1(float[] fArr, int... iArr) {
        return (float[]) S1(fArr, G(iArr));
    }

    public static byte[] W2(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f15927j;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr2[i5] = bArr[i5].byteValue();
        }
        return bArr2;
    }

    public static int X(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int X0(byte[] bArr, byte b5, int i5) {
        if (bArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= bArr.length) {
            i5 = bArr.length - 1;
        }
        while (i5 >= 0) {
            if (b5 == bArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int[] X1(int[] iArr, int... iArr2) {
        return (int[]) S1(iArr, G(iArr2));
    }

    public static byte[] X2(Byte[] bArr, byte b5) {
        byte byteValue;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return f15927j;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            Byte b6 = bArr[i5];
            if (b6 == null) {
                byteValue = b5;
            } else {
                byteValue = b6.byteValue();
            }
            bArr2[i5] = byteValue;
        }
        return bArr2;
    }

    public static int Y(Object obj) {
        return new external.org.apache.commons.lang3.builder.d().g(obj).E();
    }

    public static int Y0(char[] cArr, char c5) {
        return Z0(cArr, c5, Integer.MAX_VALUE);
    }

    public static long[] Y1(long[] jArr, int... iArr) {
        return (long[]) S1(jArr, G(iArr));
    }

    public static char[] Y2(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f15935r;
        }
        char[] cArr = new char[chArr.length];
        for (int i5 = 0; i5 < chArr.length; i5++) {
            cArr[i5] = chArr[i5].charValue();
        }
        return cArr;
    }

    public static int Z(byte[] bArr, byte b5) {
        return a0(bArr, b5, 0);
    }

    public static int Z0(char[] cArr, char c5, int i5) {
        if (cArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= cArr.length) {
            i5 = cArr.length - 1;
        }
        while (i5 >= 0) {
            if (c5 == cArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static <T> T[] Z1(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) S1(tArr, G(iArr)));
    }

    public static char[] Z2(Character[] chArr, char c5) {
        char charValue;
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return f15935r;
        }
        char[] cArr = new char[chArr.length];
        for (int i5 = 0; i5 < chArr.length; i5++) {
            Character ch = chArr[i5];
            if (ch == null) {
                charValue = c5;
            } else {
                charValue = ch.charValue();
            }
            cArr[i5] = charValue;
        }
        return cArr;
    }

    private static Object a(Object obj, int i5, Object obj2, Class<?> cls) {
        if (obj == null) {
            if (i5 == 0) {
                Object newInstance = Array.newInstance(cls, 1);
                Array.set(newInstance, 0, obj2);
                return newInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i5 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i5 <= length && i5 >= 0) {
            Object newInstance2 = Array.newInstance(cls, length + 1);
            System.arraycopy(obj, 0, newInstance2, 0, i5);
            Array.set(newInstance2, i5, obj2);
            if (i5 < length) {
                System.arraycopy(obj, i5, newInstance2, i5 + 1, length - i5);
            }
            return newInstance2;
        }
        throw new IndexOutOfBoundsException("Index: " + i5 + ", Length: " + length);
    }

    public static int a0(byte[] bArr, byte b5, int i5) {
        if (bArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < bArr.length) {
            if (b5 == bArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int a1(double[] dArr, double d5) {
        return c1(dArr, d5, Integer.MAX_VALUE);
    }

    public static short[] a2(short[] sArr, int... iArr) {
        return (short[]) S1(sArr, G(iArr));
    }

    public static double[] a3(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f15929l;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            dArr2[i5] = dArr[i5].doubleValue();
        }
        return dArr2;
    }

    public static byte[] b(byte[] bArr, byte b5) {
        byte[] bArr2 = (byte[]) V(bArr, Byte.TYPE);
        bArr2[bArr2.length - 1] = b5;
        return bArr2;
    }

    public static int b0(char[] cArr, char c5) {
        return c0(cArr, c5, 0);
    }

    public static int b1(double[] dArr, double d5, double d6) {
        return d1(dArr, d5, Integer.MAX_VALUE, d6);
    }

    public static boolean[] b2(boolean[] zArr, int... iArr) {
        return (boolean[]) S1(zArr, G(iArr));
    }

    public static double[] b3(Double[] dArr, double d5) {
        double doubleValue;
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return f15929l;
        }
        double[] dArr2 = new double[dArr.length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            Double d6 = dArr[i5];
            if (d6 == null) {
                doubleValue = d5;
            } else {
                doubleValue = d6.doubleValue();
            }
            dArr2[i5] = doubleValue;
        }
        return dArr2;
    }

    public static byte[] c(byte[] bArr, int i5, byte b5) {
        return (byte[]) a(bArr, i5, Byte.valueOf(b5), Byte.TYPE);
    }

    public static int c0(char[] cArr, char c5, int i5) {
        if (cArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < cArr.length) {
            if (c5 == cArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int c1(double[] dArr, double d5, int i5) {
        if (v0(dArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= dArr.length) {
            i5 = dArr.length - 1;
        }
        while (i5 >= 0) {
            if (d5 == dArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static byte[] c2(byte[] bArr, byte b5) {
        int Z = Z(bArr, b5);
        if (Z == -1) {
            return C(bArr);
        }
        return J1(bArr, Z);
    }

    public static float[] c3(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f15931n;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            fArr2[i5] = fArr[i5].floatValue();
        }
        return fArr2;
    }

    public static char[] d(char[] cArr, char c5) {
        char[] cArr2 = (char[]) V(cArr, Character.TYPE);
        cArr2[cArr2.length - 1] = c5;
        return cArr2;
    }

    public static int d0(double[] dArr, double d5) {
        return f0(dArr, d5, 0);
    }

    public static int d1(double[] dArr, double d5, int i5, double d6) {
        if (v0(dArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= dArr.length) {
            i5 = dArr.length - 1;
        }
        double d7 = d5 - d6;
        double d8 = d5 + d6;
        while (i5 >= 0) {
            double d9 = dArr[i5];
            if (d9 >= d7 && d9 <= d8) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static char[] d2(char[] cArr, char c5) {
        int b02 = b0(cArr, c5);
        if (b02 == -1) {
            return D(cArr);
        }
        return K1(cArr, b02);
    }

    public static float[] d3(Float[] fArr, float f5) {
        float floatValue;
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return f15931n;
        }
        float[] fArr2 = new float[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            Float f6 = fArr[i5];
            if (f6 == null) {
                floatValue = f5;
            } else {
                floatValue = f6.floatValue();
            }
            fArr2[i5] = floatValue;
        }
        return fArr2;
    }

    public static char[] e(char[] cArr, int i5, char c5) {
        return (char[]) a(cArr, i5, Character.valueOf(c5), Character.TYPE);
    }

    public static int e0(double[] dArr, double d5, double d6) {
        return g0(dArr, d5, 0, d6);
    }

    public static int e1(float[] fArr, float f5) {
        return f1(fArr, f5, Integer.MAX_VALUE);
    }

    public static double[] e2(double[] dArr, double d5) {
        int d02 = d0(dArr, d5);
        if (d02 == -1) {
            return E(dArr);
        }
        return L1(dArr, d02);
    }

    public static int[] e3(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f15923f;
        }
        int[] iArr = new int[numArr.length];
        for (int i5 = 0; i5 < numArr.length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
        return iArr;
    }

    public static double[] f(double[] dArr, double d5) {
        double[] dArr2 = (double[]) V(dArr, Double.TYPE);
        dArr2[dArr2.length - 1] = d5;
        return dArr2;
    }

    public static int f0(double[] dArr, double d5, int i5) {
        if (v0(dArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < dArr.length) {
            if (d5 == dArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int f1(float[] fArr, float f5, int i5) {
        if (w0(fArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= fArr.length) {
            i5 = fArr.length - 1;
        }
        while (i5 >= 0) {
            if (f5 == fArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static float[] f2(float[] fArr, float f5) {
        int h02 = h0(fArr, f5);
        if (h02 == -1) {
            return F(fArr);
        }
        return M1(fArr, h02);
    }

    public static int[] f3(Integer[] numArr, int i5) {
        int intValue;
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return f15923f;
        }
        int[] iArr = new int[numArr.length];
        for (int i6 = 0; i6 < numArr.length; i6++) {
            Integer num = numArr[i6];
            if (num == null) {
                intValue = i5;
            } else {
                intValue = num.intValue();
            }
            iArr[i6] = intValue;
        }
        return iArr;
    }

    public static double[] g(double[] dArr, int i5, double d5) {
        return (double[]) a(dArr, i5, Double.valueOf(d5), Double.TYPE);
    }

    public static int g0(double[] dArr, double d5, int i5, double d6) {
        if (v0(dArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        double d7 = d5 - d6;
        double d8 = d5 + d6;
        while (i5 < dArr.length) {
            double d9 = dArr[i5];
            if (d9 >= d7 && d9 <= d8) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int g1(int[] iArr, int i5) {
        return h1(iArr, i5, Integer.MAX_VALUE);
    }

    public static int[] g2(int[] iArr, int i5) {
        int j02 = j0(iArr, i5);
        if (j02 == -1) {
            return G(iArr);
        }
        return N1(iArr, j02);
    }

    public static long[] g3(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f15921d;
        }
        long[] jArr = new long[lArr.length];
        for (int i5 = 0; i5 < lArr.length; i5++) {
            jArr[i5] = lArr[i5].longValue();
        }
        return jArr;
    }

    public static float[] h(float[] fArr, float f5) {
        float[] fArr2 = (float[]) V(fArr, Float.TYPE);
        fArr2[fArr2.length - 1] = f5;
        return fArr2;
    }

    public static int h0(float[] fArr, float f5) {
        return i0(fArr, f5, 0);
    }

    public static int h1(int[] iArr, int i5, int i6) {
        if (iArr == null || i6 < 0) {
            return -1;
        }
        if (i6 >= iArr.length) {
            i6 = iArr.length - 1;
        }
        while (i6 >= 0) {
            if (i5 == iArr[i6]) {
                return i6;
            }
            i6--;
        }
        return -1;
    }

    public static long[] h2(long[] jArr, long j5) {
        int l02 = l0(jArr, j5);
        if (l02 == -1) {
            return H(jArr);
        }
        return O1(jArr, l02);
    }

    public static long[] h3(Long[] lArr, long j5) {
        long longValue;
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return f15921d;
        }
        long[] jArr = new long[lArr.length];
        for (int i5 = 0; i5 < lArr.length; i5++) {
            Long l5 = lArr[i5];
            if (l5 == null) {
                longValue = j5;
            } else {
                longValue = l5.longValue();
            }
            jArr[i5] = longValue;
        }
        return jArr;
    }

    public static float[] i(float[] fArr, int i5, float f5) {
        return (float[]) a(fArr, i5, Float.valueOf(f5), Float.TYPE);
    }

    public static int i0(float[] fArr, float f5, int i5) {
        if (w0(fArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < fArr.length) {
            if (f5 == fArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int i1(long[] jArr, long j5) {
        return j1(jArr, j5, Integer.MAX_VALUE);
    }

    public static <T> T[] i2(T[] tArr, Object obj) {
        int n02 = n0(tArr, obj);
        if (n02 == -1) {
            return (T[]) I(tArr);
        }
        return (T[]) P1(tArr, n02);
    }

    public static short[] i3(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f15925h;
        }
        short[] sArr = new short[shArr.length];
        for (int i5 = 0; i5 < shArr.length; i5++) {
            sArr[i5] = shArr[i5].shortValue();
        }
        return sArr;
    }

    public static int[] j(int[] iArr, int i5) {
        int[] iArr2 = (int[]) V(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i5;
        return iArr2;
    }

    public static int j0(int[] iArr, int i5) {
        return k0(iArr, i5, 0);
    }

    public static int j1(long[] jArr, long j5, int i5) {
        if (jArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= jArr.length) {
            i5 = jArr.length - 1;
        }
        while (i5 >= 0) {
            if (j5 == jArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static short[] j2(short[] sArr, short s5) {
        int p02 = p0(sArr, s5);
        if (p02 == -1) {
            return J(sArr);
        }
        return Q1(sArr, p02);
    }

    public static short[] j3(Short[] shArr, short s5) {
        short shortValue;
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return f15925h;
        }
        short[] sArr = new short[shArr.length];
        for (int i5 = 0; i5 < shArr.length; i5++) {
            Short sh = shArr[i5];
            if (sh == null) {
                shortValue = s5;
            } else {
                shortValue = sh.shortValue();
            }
            sArr[i5] = shortValue;
        }
        return sArr;
    }

    public static int[] k(int[] iArr, int i5, int i6) {
        return (int[]) a(iArr, i5, Integer.valueOf(i6), Integer.TYPE);
    }

    public static int k0(int[] iArr, int i5, int i6) {
        if (iArr == null) {
            return -1;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < iArr.length) {
            if (i5 == iArr[i6]) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static int k1(Object[] objArr, Object obj) {
        return l1(objArr, obj, Integer.MAX_VALUE);
    }

    public static boolean[] k2(boolean[] zArr, boolean z4) {
        int r02 = r0(zArr, z4);
        if (r02 == -1) {
            return K(zArr);
        }
        return R1(zArr, r02);
    }

    public static boolean[] k3(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f15933p;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i5 = 0; i5 < boolArr.length; i5++) {
            zArr[i5] = boolArr[i5].booleanValue();
        }
        return zArr;
    }

    public static long[] l(long[] jArr, int i5, long j5) {
        return (long[]) a(jArr, i5, Long.valueOf(j5), Long.TYPE);
    }

    public static int l0(long[] jArr, long j5) {
        return m0(jArr, j5, 0);
    }

    public static int l1(Object[] objArr, Object obj, int i5) {
        if (objArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= objArr.length) {
            i5 = objArr.length - 1;
        }
        if (obj == null) {
            while (i5 >= 0) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5--;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i5 >= 0) {
                if (obj.equals(objArr[i5])) {
                    return i5;
                }
                i5--;
            }
        }
        return -1;
    }

    public static byte[] l2(byte[] bArr, byte... bArr2) {
        if (!t0(bArr) && !t0(bArr2)) {
            HashMap hashMap = new HashMap(bArr2.length);
            for (byte b5 : bArr2) {
                Byte valueOf = Byte.valueOf(b5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Byte b6 = (Byte) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int a02 = a0(bArr, b6.byteValue(), i6);
                    if (a02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(a02));
                    i5++;
                    i6 = a02 + 1;
                }
            }
            return T1(bArr, W(hashSet));
        }
        return C(bArr);
    }

    public static boolean[] l3(Boolean[] boolArr, boolean z4) {
        boolean booleanValue;
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return f15933p;
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i5 = 0; i5 < boolArr.length; i5++) {
            Boolean bool = boolArr[i5];
            if (bool == null) {
                booleanValue = z4;
            } else {
                booleanValue = bool.booleanValue();
            }
            zArr[i5] = booleanValue;
        }
        return zArr;
    }

    public static long[] m(long[] jArr, long j5) {
        long[] jArr2 = (long[]) V(jArr, Long.TYPE);
        jArr2[jArr2.length - 1] = j5;
        return jArr2;
    }

    public static int m0(long[] jArr, long j5, int i5) {
        if (jArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < jArr.length) {
            if (j5 == jArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int m1(short[] sArr, short s5) {
        return n1(sArr, s5, Integer.MAX_VALUE);
    }

    public static char[] m2(char[] cArr, char... cArr2) {
        if (!u0(cArr) && !u0(cArr2)) {
            HashMap hashMap = new HashMap(cArr2.length);
            for (char c5 : cArr2) {
                Character valueOf = Character.valueOf(c5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Character ch = (Character) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int c02 = c0(cArr, ch.charValue(), i6);
                    if (c02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(c02));
                    i5++;
                    i6 = c02 + 1;
                }
            }
            return U1(cArr, W(hashSet));
        }
        return D(cArr);
    }

    public static String m3(Object obj) {
        return n3(obj, "{}");
    }

    public static <T> T[] n(T[] tArr, int i5, T t5) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t5 != null) {
            cls = t5.getClass();
        } else {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        return (T[]) ((Object[]) a(tArr, i5, t5, cls));
    }

    public static int n0(Object[] objArr, Object obj) {
        return o0(objArr, obj, 0);
    }

    public static int n1(short[] sArr, short s5, int i5) {
        if (sArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= sArr.length) {
            i5 = sArr.length - 1;
        }
        while (i5 >= 0) {
            if (s5 == sArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static double[] n2(double[] dArr, double... dArr2) {
        if (!v0(dArr) && !v0(dArr2)) {
            HashMap hashMap = new HashMap(dArr2.length);
            for (double d5 : dArr2) {
                Double valueOf = Double.valueOf(d5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Double d6 = (Double) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int f02 = f0(dArr, d6.doubleValue(), i6);
                    if (f02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(f02));
                    i5++;
                    i6 = f02 + 1;
                }
            }
            return V1(dArr, W(hashSet));
        }
        return E(dArr);
    }

    public static String n3(Object obj, String str) {
        return obj == null ? str : new external.org.apache.commons.lang3.builder.g(obj, external.org.apache.commons.lang3.builder.h.SIMPLE_STYLE).g(obj).toString();
    }

    public static <T> T[] o(T[] tArr, T t5) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else if (t5 != null) {
            cls = t5.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        T[] tArr2 = (T[]) ((Object[]) V(tArr, cls));
        tArr2[tArr2.length - 1] = t5;
        return tArr2;
    }

    public static int o0(Object[] objArr, Object obj, int i5) {
        if (objArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (obj == null) {
            while (i5 < objArr.length) {
                if (objArr[i5] == null) {
                    return i5;
                }
                i5++;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i5 < objArr.length) {
                if (obj.equals(objArr[i5])) {
                    return i5;
                }
                i5++;
            }
        }
        return -1;
    }

    public static int o1(boolean[] zArr, boolean z4) {
        return p1(zArr, z4, Integer.MAX_VALUE);
    }

    public static float[] o2(float[] fArr, float... fArr2) {
        if (!w0(fArr) && !w0(fArr2)) {
            HashMap hashMap = new HashMap(fArr2.length);
            for (float f5 : fArr2) {
                Float valueOf = Float.valueOf(f5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Float f6 = (Float) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int i02 = i0(fArr, f6.floatValue(), i6);
                    if (i02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(i02));
                    i5++;
                    i6 = i02 + 1;
                }
            }
            return W1(fArr, W(hashSet));
        }
        return F(fArr);
    }

    public static short[] p(short[] sArr, int i5, short s5) {
        return (short[]) a(sArr, i5, Short.valueOf(s5), Short.TYPE);
    }

    public static int p0(short[] sArr, short s5) {
        return q0(sArr, s5, 0);
    }

    public static int p1(boolean[] zArr, boolean z4, int i5) {
        if (B0(zArr) || i5 < 0) {
            return -1;
        }
        if (i5 >= zArr.length) {
            i5 = zArr.length - 1;
        }
        while (i5 >= 0) {
            if (z4 == zArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static int[] p2(int[] iArr, int... iArr2) {
        if (!x0(iArr) && !x0(iArr2)) {
            HashMap hashMap = new HashMap(iArr2.length);
            for (int i5 : iArr2) {
                Integer valueOf = Integer.valueOf(i5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Integer num = (Integer) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i6 = 0;
                int i7 = 0;
                while (i6 < intValue) {
                    int k02 = k0(iArr, num.intValue(), i7);
                    if (k02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(k02));
                    i6++;
                    i7 = k02 + 1;
                }
            }
            return X1(iArr, W(hashSet));
        }
        return G(iArr);
    }

    public static short[] q(short[] sArr, short s5) {
        short[] sArr2 = (short[]) V(sArr, Short.TYPE);
        sArr2[sArr2.length - 1] = s5;
        return sArr2;
    }

    public static int q0(short[] sArr, short s5, int i5) {
        if (sArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < sArr.length) {
            if (s5 == sArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static byte[] q1(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        return f15927j;
    }

    public static long[] q2(long[] jArr, long... jArr2) {
        if (!y0(jArr) && !y0(jArr2)) {
            HashMap hashMap = new HashMap(jArr2.length);
            for (long j5 : jArr2) {
                Long valueOf = Long.valueOf(j5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Long l5 = (Long) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int m02 = m0(jArr, l5.longValue(), i6);
                    if (m02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(m02));
                    i5++;
                    i6 = m02 + 1;
                }
            }
            return Y1(jArr, W(hashSet));
        }
        return H(jArr);
    }

    public static boolean[] r(boolean[] zArr, int i5, boolean z4) {
        return (boolean[]) a(zArr, i5, Boolean.valueOf(z4), Boolean.TYPE);
    }

    public static int r0(boolean[] zArr, boolean z4) {
        return s0(zArr, z4, 0);
    }

    public static char[] r1(char[] cArr) {
        if (cArr != null && cArr.length != 0) {
            return cArr;
        }
        return f15935r;
    }

    public static <T> T[] r2(T[] tArr, T... tArr2) {
        if (!z0(tArr) && !z0(tArr2)) {
            HashMap hashMap = new HashMap(tArr2.length);
            for (T t5 : tArr2) {
                j3.b bVar = (j3.b) hashMap.get(t5);
                if (bVar == null) {
                    hashMap.put(t5, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int o02 = o0(tArr, key, i6);
                    if (o02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(o02));
                    i5++;
                    i6 = o02 + 1;
                }
            }
            return (T[]) Z1(tArr, W(hashSet));
        }
        return (T[]) I(tArr);
    }

    public static boolean[] s(boolean[] zArr, boolean z4) {
        boolean[] zArr2 = (boolean[]) V(zArr, Boolean.TYPE);
        zArr2[zArr2.length - 1] = z4;
        return zArr2;
    }

    public static int s0(boolean[] zArr, boolean z4, int i5) {
        if (B0(zArr)) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < zArr.length) {
            if (z4 == zArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static double[] s1(double[] dArr) {
        if (dArr != null && dArr.length != 0) {
            return dArr;
        }
        return f15929l;
    }

    public static short[] s2(short[] sArr, short... sArr2) {
        if (!A0(sArr) && !A0(sArr2)) {
            HashMap hashMap = new HashMap(sArr2.length);
            for (short s5 : sArr2) {
                Short valueOf = Short.valueOf(s5);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Short sh = (Short) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int q02 = q0(sArr, sh.shortValue(), i6);
                    if (q02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(q02));
                    i5++;
                    i6 = q02 + 1;
                }
            }
            return a2(sArr, W(hashSet));
        }
        return J(sArr);
    }

    public static byte[] t(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return C(bArr2);
        }
        if (bArr2 == null) {
            return C(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean t0(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static float[] t1(float[] fArr) {
        if (fArr != null && fArr.length != 0) {
            return fArr;
        }
        return f15931n;
    }

    public static boolean[] t2(boolean[] zArr, boolean... zArr2) {
        if (!B0(zArr) && !B0(zArr2)) {
            HashMap hashMap = new HashMap(zArr2.length);
            for (boolean z4 : zArr2) {
                Boolean valueOf = Boolean.valueOf(z4);
                j3.b bVar = (j3.b) hashMap.get(valueOf);
                if (bVar == null) {
                    hashMap.put(valueOf, new j3.b(1));
                } else {
                    bVar.increment();
                }
            }
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                Boolean bool = (Boolean) entry.getKey();
                int intValue = ((j3.b) entry.getValue()).intValue();
                int i5 = 0;
                int i6 = 0;
                while (i5 < intValue) {
                    int s02 = s0(zArr, bool.booleanValue(), i6);
                    if (s02 < 0) {
                        break;
                    }
                    hashSet.add(Integer.valueOf(s02));
                    i5++;
                    i6 = s02 + 1;
                }
            }
            return b2(zArr, W(hashSet));
        }
        return K(zArr);
    }

    public static char[] u(char[] cArr, char... cArr2) {
        if (cArr == null) {
            return D(cArr2);
        }
        if (cArr2 == null) {
            return D(cArr);
        }
        char[] cArr3 = new char[cArr.length + cArr2.length];
        System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
        System.arraycopy(cArr2, 0, cArr3, cArr.length, cArr2.length);
        return cArr3;
    }

    public static boolean u0(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    public static int[] u1(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            return iArr;
        }
        return f15923f;
    }

    public static void u2(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            byte b5 = bArr[length];
            bArr[length] = bArr[i5];
            bArr[i5] = b5;
            length--;
        }
    }

    public static double[] v(double[] dArr, double... dArr2) {
        if (dArr == null) {
            return E(dArr2);
        }
        if (dArr2 == null) {
            return E(dArr);
        }
        double[] dArr3 = new double[dArr.length + dArr2.length];
        System.arraycopy(dArr, 0, dArr3, 0, dArr.length);
        System.arraycopy(dArr2, 0, dArr3, dArr.length, dArr2.length);
        return dArr3;
    }

    public static boolean v0(double[] dArr) {
        return dArr == null || dArr.length == 0;
    }

    public static long[] v1(long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            return jArr;
        }
        return f15921d;
    }

    public static void v2(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            char c5 = cArr[length];
            cArr[length] = cArr[i5];
            cArr[i5] = c5;
            length--;
        }
    }

    public static float[] w(float[] fArr, float... fArr2) {
        if (fArr == null) {
            return F(fArr2);
        }
        if (fArr2 == null) {
            return F(fArr);
        }
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    public static boolean w0(float[] fArr) {
        return fArr == null || fArr.length == 0;
    }

    public static Boolean[] w1(Boolean[] boolArr) {
        if (boolArr != null && boolArr.length != 0) {
            return boolArr;
        }
        return f15934q;
    }

    public static void w2(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            double d5 = dArr[length];
            dArr[length] = dArr[i5];
            dArr[i5] = d5;
            length--;
        }
    }

    public static int[] x(int[] iArr, int... iArr2) {
        if (iArr == null) {
            return G(iArr2);
        }
        if (iArr2 == null) {
            return G(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static boolean x0(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static Byte[] x1(Byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        return f15928k;
    }

    public static void x2(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            float f5 = fArr[length];
            fArr[length] = fArr[i5];
            fArr[i5] = f5;
            length--;
        }
    }

    public static long[] y(long[] jArr, long... jArr2) {
        if (jArr == null) {
            return H(jArr2);
        }
        if (jArr2 == null) {
            return H(jArr);
        }
        long[] jArr3 = new long[jArr.length + jArr2.length];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static boolean y0(long[] jArr) {
        return jArr == null || jArr.length == 0;
    }

    public static Character[] y1(Character[] chArr) {
        if (chArr != null && chArr.length != 0) {
            return chArr;
        }
        return f15936s;
    }

    public static void y2(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            int i6 = iArr[length];
            iArr[length] = iArr[i5];
            iArr[i5] = i6;
            length--;
        }
    }

    public static <T> T[] z(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return (T[]) I(tArr2);
        }
        if (tArr2 == null) {
            return (T[]) I(tArr);
        }
        Class<?> componentType = tArr.getClass().getComponentType();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(componentType, tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
            return tArr3;
        } catch (ArrayStoreException e5) {
            Class<?> componentType2 = tArr2.getClass().getComponentType();
            if (!componentType.isAssignableFrom(componentType2)) {
                throw new IllegalArgumentException("Cannot store " + componentType2.getName() + " in an array of " + componentType.getName(), e5);
            }
            throw e5;
        }
    }

    public static boolean z0(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static Double[] z1(Double[] dArr) {
        if (dArr != null && dArr.length != 0) {
            return dArr;
        }
        return f15930m;
    }

    public static void z2(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i5 = 0; length > i5; i5++) {
            long j5 = jArr[length];
            jArr[length] = jArr[i5];
            jArr[i5] = j5;
            length--;
        }
    }
}
