package external.org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class b implements a<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private int f15938a = 0;

    public static int A(Object obj, Object obj2, boolean z4, Class<?> cls, String... strArr) {
        if (obj == obj2) {
            return 0;
        }
        if (obj != null && obj2 != null) {
            Class<?> cls2 = obj.getClass();
            if (cls2.isInstance(obj2)) {
                b bVar = new b();
                w(obj, obj2, cls2, bVar, z4, strArr);
                while (cls2.getSuperclass() != null && cls2 != cls) {
                    cls2 = cls2.getSuperclass();
                    w(obj, obj2, cls2, bVar, z4, strArr);
                }
                return bVar.C();
            }
            throw new ClassCastException();
        }
        throw null;
    }

    public static int B(Object obj, Object obj2, String... strArr) {
        return A(obj, obj2, false, null, strArr);
    }

    private static void w(Object obj, Object obj2, Class<?> cls, b bVar, boolean z4, String[] strArr) {
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i5 = 0; i5 < declaredFields.length && bVar.f15938a == 0; i5++) {
            Field field = declaredFields[i5];
            if (!external.org.apache.commons.lang3.a.S(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                try {
                    bVar.g(field.get(obj), field.get(obj2));
                } catch (IllegalAccessException unused) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
    }

    public static int x(Object obj, Object obj2) {
        return A(obj, obj2, false, null, new String[0]);
    }

    public static int y(Object obj, Object obj2, Collection<String> collection) {
        return B(obj, obj2, f.t0(collection));
    }

    public static int z(Object obj, Object obj2, boolean z4) {
        return A(obj, obj2, z4, null, new String[0]);
    }

    public int C() {
        return this.f15938a;
    }

    public b a(byte b5, byte b6) {
        int i5;
        if (this.f15938a != 0) {
            return this;
        }
        if (b5 < b6) {
            i5 = -1;
        } else if (b5 > b6) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.f15938a = i5;
        return this;
    }

    public b b(char c5, char c6) {
        int i5;
        if (this.f15938a != 0) {
            return this;
        }
        if (c5 < c6) {
            i5 = -1;
        } else if (c5 > c6) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.f15938a = i5;
        return this;
    }

    public b c(double d5, double d6) {
        if (this.f15938a != 0) {
            return this;
        }
        this.f15938a = Double.compare(d5, d6);
        return this;
    }

    public b d(float f5, float f6) {
        if (this.f15938a != 0) {
            return this;
        }
        this.f15938a = Float.compare(f5, f6);
        return this;
    }

    public b e(int i5, int i6) {
        int i7;
        if (this.f15938a != 0) {
            return this;
        }
        if (i5 < i6) {
            i7 = -1;
        } else if (i5 > i6) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f15938a = i7;
        return this;
    }

    public b f(long j5, long j6) {
        int i5;
        if (this.f15938a != 0) {
            return this;
        }
        if (j5 < j6) {
            i5 = -1;
        } else if (j5 > j6) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.f15938a = i5;
        return this;
    }

    public b g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public b h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f15938a != 0) {
            return this;
        }
        if (obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f15938a = -1;
            return this;
        }
        if (obj2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                p((long[]) obj, (long[]) obj2);
            } else if (obj instanceof int[]) {
                o((int[]) obj, (int[]) obj2);
            } else if (obj instanceof short[]) {
                s((short[]) obj, (short[]) obj2);
            } else if (obj instanceof char[]) {
                l((char[]) obj, (char[]) obj2);
            } else if (obj instanceof byte[]) {
                k((byte[]) obj, (byte[]) obj2);
            } else if (obj instanceof double[]) {
                m((double[]) obj, (double[]) obj2);
            } else if (obj instanceof float[]) {
                n((float[]) obj, (float[]) obj2);
            } else if (obj instanceof boolean[]) {
                t((boolean[]) obj, (boolean[]) obj2);
            } else {
                r((Object[]) obj, (Object[]) obj2, comparator);
            }
        } else if (comparator == null) {
            this.f15938a = ((Comparable) obj).compareTo(obj2);
        } else {
            this.f15938a = comparator.compare(obj, obj2);
        }
        return this;
    }

    public b i(short s5, short s6) {
        int i5;
        if (this.f15938a != 0) {
            return this;
        }
        if (s5 < s6) {
            i5 = -1;
        } else if (s5 > s6) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.f15938a = i5;
        return this;
    }

    public b j(boolean z4, boolean z5) {
        if (this.f15938a != 0) {
            return this;
        }
        if (z4 == z5) {
            return this;
        }
        if (!z4) {
            this.f15938a = -1;
        } else {
            this.f15938a = 1;
        }
        return this;
    }

    public b k(byte[] bArr, byte[] bArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (bArr == bArr2) {
            return this;
        }
        int i5 = -1;
        if (bArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (bArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (bArr.length != bArr2.length) {
            if (bArr.length >= bArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < bArr.length && this.f15938a == 0; i6++) {
            a(bArr[i6], bArr2[i6]);
        }
        return this;
    }

    public b l(char[] cArr, char[] cArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (cArr == cArr2) {
            return this;
        }
        int i5 = -1;
        if (cArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (cArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (cArr.length != cArr2.length) {
            if (cArr.length >= cArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < cArr.length && this.f15938a == 0; i6++) {
            b(cArr[i6], cArr2[i6]);
        }
        return this;
    }

    public b m(double[] dArr, double[] dArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (dArr == dArr2) {
            return this;
        }
        int i5 = -1;
        if (dArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (dArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (dArr.length != dArr2.length) {
            if (dArr.length >= dArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < dArr.length && this.f15938a == 0; i6++) {
            c(dArr[i6], dArr2[i6]);
        }
        return this;
    }

    public b n(float[] fArr, float[] fArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (fArr == fArr2) {
            return this;
        }
        int i5 = -1;
        if (fArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (fArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (fArr.length != fArr2.length) {
            if (fArr.length >= fArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < fArr.length && this.f15938a == 0; i6++) {
            d(fArr[i6], fArr2[i6]);
        }
        return this;
    }

    public b o(int[] iArr, int[] iArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (iArr == iArr2) {
            return this;
        }
        int i5 = -1;
        if (iArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (iArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (iArr.length != iArr2.length) {
            if (iArr.length >= iArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < iArr.length && this.f15938a == 0; i6++) {
            e(iArr[i6], iArr2[i6]);
        }
        return this;
    }

    public b p(long[] jArr, long[] jArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (jArr == jArr2) {
            return this;
        }
        int i5 = -1;
        if (jArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (jArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (jArr.length != jArr2.length) {
            if (jArr.length >= jArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < jArr.length && this.f15938a == 0; i6++) {
            f(jArr[i6], jArr2[i6]);
        }
        return this;
    }

    public b q(Object[] objArr, Object[] objArr2) {
        return r(objArr, objArr2, null);
    }

    public b r(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f15938a != 0) {
            return this;
        }
        if (objArr == objArr2) {
            return this;
        }
        int i5 = -1;
        if (objArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (objArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (objArr.length != objArr2.length) {
            if (objArr.length >= objArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < objArr.length && this.f15938a == 0; i6++) {
            h(objArr[i6], objArr2[i6], comparator);
        }
        return this;
    }

    public b s(short[] sArr, short[] sArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (sArr == sArr2) {
            return this;
        }
        int i5 = -1;
        if (sArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (sArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (sArr.length != sArr2.length) {
            if (sArr.length >= sArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < sArr.length && this.f15938a == 0; i6++) {
            i(sArr[i6], sArr2[i6]);
        }
        return this;
    }

    public b t(boolean[] zArr, boolean[] zArr2) {
        if (this.f15938a != 0) {
            return this;
        }
        if (zArr == zArr2) {
            return this;
        }
        int i5 = -1;
        if (zArr == null) {
            this.f15938a = -1;
            return this;
        }
        if (zArr2 == null) {
            this.f15938a = 1;
            return this;
        }
        if (zArr.length != zArr2.length) {
            if (zArr.length >= zArr2.length) {
                i5 = 1;
            }
            this.f15938a = i5;
            return this;
        }
        for (int i6 = 0; i6 < zArr.length && this.f15938a == 0; i6++) {
            j(zArr[i6], zArr2[i6]);
        }
        return this;
    }

    public b u(int i5) {
        if (this.f15938a != 0) {
            return this;
        }
        this.f15938a = i5;
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer build() {
        return Integer.valueOf(C());
    }
}
