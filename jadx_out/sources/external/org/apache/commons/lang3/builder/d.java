package external.org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class d implements a<Integer> {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Set<e>> f15941c = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f15942a;

    /* renamed from: b, reason: collision with root package name */
    private int f15943b;

    public d() {
        this.f15942a = 37;
        this.f15943b = 17;
    }

    public static int A(Object obj, Collection<String> collection) {
        return C(obj, f.t0(collection));
    }

    public static int B(Object obj, boolean z4) {
        return z(17, 37, obj, z4, null, new String[0]);
    }

    public static int C(Object obj, String... strArr) {
        return z(17, 37, obj, false, null, strArr);
    }

    static void D(Object obj) {
        synchronized (d.class) {
            if (u() == null) {
                f15941c.set(new HashSet());
            }
        }
        u().add(new e(obj));
    }

    static void F(Object obj) {
        Set<e> u4 = u();
        if (u4 != null) {
            u4.remove(new e(obj));
            synchronized (d.class) {
                Set<e> u5 = u();
                if (u5 != null && u5.isEmpty()) {
                    f15941c.remove();
                }
            }
        }
    }

    static Set<e> u() {
        return f15941c.get();
    }

    static boolean v(Object obj) {
        Set<e> u4 = u();
        if (u4 != null && u4.contains(new e(obj))) {
            return true;
        }
        return false;
    }

    private static void w(Object obj, Class<?> cls, d dVar, boolean z4, String[] strArr) {
        if (v(obj)) {
            return;
        }
        try {
            D(obj);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (Field field : declaredFields) {
                if (!external.org.apache.commons.lang3.a.S(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                    try {
                        dVar.g(field.get(obj));
                    } catch (IllegalAccessException unused) {
                        throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }
        } finally {
            F(obj);
        }
    }

    public static int x(int i5, int i6, Object obj) {
        return z(i5, i6, obj, false, null, new String[0]);
    }

    public static int y(int i5, int i6, Object obj, boolean z4) {
        return z(i5, i6, obj, z4, null, new String[0]);
    }

    public static <T> int z(int i5, int i6, T t5, boolean z4, Class<? super T> cls, String... strArr) {
        if (t5 != null) {
            d dVar = new d(i5, i6);
            Class<?> cls2 = t5.getClass();
            w(t5, cls2, dVar, z4, strArr);
            while (cls2.getSuperclass() != null && cls2 != cls) {
                cls2 = cls2.getSuperclass();
                w(t5, cls2, dVar, z4, strArr);
            }
            return dVar.E();
        }
        throw new IllegalArgumentException("The object to build a hash code for must not be null");
    }

    public int E() {
        return this.f15943b;
    }

    public d a(byte b5) {
        this.f15943b = (this.f15943b * this.f15942a) + b5;
        return this;
    }

    public d b(char c5) {
        this.f15943b = (this.f15943b * this.f15942a) + c5;
        return this;
    }

    public d c(double d5) {
        return f(Double.doubleToLongBits(d5));
    }

    public d d(float f5) {
        this.f15943b = (this.f15943b * this.f15942a) + Float.floatToIntBits(f5);
        return this;
    }

    public d e(int i5) {
        this.f15943b = (this.f15943b * this.f15942a) + i5;
        return this;
    }

    public d f(long j5) {
        this.f15943b = (this.f15943b * this.f15942a) + ((int) (j5 ^ (j5 >> 32)));
        return this;
    }

    public d g(Object obj) {
        if (obj == null) {
            this.f15943b *= this.f15942a;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                o((long[]) obj);
            } else if (obj instanceof int[]) {
                n((int[]) obj);
            } else if (obj instanceof short[]) {
                q((short[]) obj);
            } else if (obj instanceof char[]) {
                k((char[]) obj);
            } else if (obj instanceof byte[]) {
                j((byte[]) obj);
            } else if (obj instanceof double[]) {
                l((double[]) obj);
            } else if (obj instanceof float[]) {
                m((float[]) obj);
            } else if (obj instanceof boolean[]) {
                r((boolean[]) obj);
            } else {
                p((Object[]) obj);
            }
        } else {
            this.f15943b = (this.f15943b * this.f15942a) + obj.hashCode();
        }
        return this;
    }

    public d h(short s5) {
        this.f15943b = (this.f15943b * this.f15942a) + s5;
        return this;
    }

    public int hashCode() {
        return E();
    }

    public d i(boolean z4) {
        this.f15943b = (this.f15943b * this.f15942a) + (!z4 ? 1 : 0);
        return this;
    }

    public d j(byte[] bArr) {
        if (bArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (byte b5 : bArr) {
                a(b5);
            }
        }
        return this;
    }

    public d k(char[] cArr) {
        if (cArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (char c5 : cArr) {
                b(c5);
            }
        }
        return this;
    }

    public d l(double[] dArr) {
        if (dArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (double d5 : dArr) {
                c(d5);
            }
        }
        return this;
    }

    public d m(float[] fArr) {
        if (fArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (float f5 : fArr) {
                d(f5);
            }
        }
        return this;
    }

    public d n(int[] iArr) {
        if (iArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (int i5 : iArr) {
                e(i5);
            }
        }
        return this;
    }

    public d o(long[] jArr) {
        if (jArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (long j5 : jArr) {
                f(j5);
            }
        }
        return this;
    }

    public d p(Object[] objArr) {
        if (objArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (Object obj : objArr) {
                g(obj);
            }
        }
        return this;
    }

    public d q(short[] sArr) {
        if (sArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (short s5 : sArr) {
                h(s5);
            }
        }
        return this;
    }

    public d r(boolean[] zArr) {
        if (zArr == null) {
            this.f15943b *= this.f15942a;
        } else {
            for (boolean z4 : zArr) {
                i(z4);
            }
        }
        return this;
    }

    public d s(int i5) {
        this.f15943b = (this.f15943b * this.f15942a) + i5;
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer build() {
        return Integer.valueOf(E());
    }

    public d(int i5, int i6) {
        this.f15943b = 0;
        if (i5 != 0) {
            if (i5 % 2 == 0) {
                throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
            }
            if (i6 != 0) {
                if (i6 % 2 != 0) {
                    this.f15942a = i6;
                    this.f15943b = i5;
                    return;
                }
                throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
            }
            throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
        }
        throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
    }
}
