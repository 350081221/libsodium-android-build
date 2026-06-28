package external.org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class c implements a<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Set<k3.b<e, e>>> f15939b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private boolean f15940a = true;

    public static boolean A(Object obj, Object obj2, boolean z4) {
        return B(obj, obj2, z4, null, new String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r2.isInstance(r11) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0029, code lost:
    
        if (r1.isInstance(r12) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean B(java.lang.Object r11, java.lang.Object r12, boolean r13, java.lang.Class<?> r14, java.lang.String... r15) {
        /*
            if (r11 != r12) goto L4
            r11 = 1
            return r11
        L4:
            r0 = 0
            if (r11 == 0) goto L56
            if (r12 != 0) goto La
            goto L56
        La:
            java.lang.Class r1 = r11.getClass()
            java.lang.Class r2 = r12.getClass()
            boolean r3 = r1.isInstance(r12)
            if (r3 == 0) goto L1f
            boolean r3 = r2.isInstance(r11)
            if (r3 != 0) goto L2d
            goto L2c
        L1f:
            boolean r3 = r2.isInstance(r11)
            if (r3 == 0) goto L56
            boolean r3 = r1.isInstance(r12)
            if (r3 != 0) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            external.org.apache.commons.lang3.builder.c r10 = new external.org.apache.commons.lang3.builder.c
            r10.<init>()
            r4 = r11
            r5 = r12
            r6 = r1
            r7 = r10
            r8 = r13
            r9 = r15
            y(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L56
        L3b:
            java.lang.Class r2 = r1.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L56
            if (r2 == 0) goto L51
            if (r1 == r14) goto L51
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L56
            r2 = r11
            r3 = r12
            r4 = r1
            r5 = r10
            r6 = r13
            r7 = r15
            y(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.IllegalArgumentException -> L56
            goto L3b
        L51:
            boolean r11 = r10.w()
            return r11
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: external.org.apache.commons.lang3.builder.c.B(java.lang.Object, java.lang.Object, boolean, java.lang.Class, java.lang.String[]):boolean");
    }

    public static boolean C(Object obj, Object obj2, String... strArr) {
        return B(obj, obj2, false, null, strArr);
    }

    static void D(Object obj, Object obj2) {
        synchronized (c.class) {
            if (v() == null) {
                f15939b.set(new HashSet());
            }
        }
        v().add(u(obj, obj2));
    }

    static void G(Object obj, Object obj2) {
        Set<k3.b<e, e>> v4 = v();
        if (v4 != null) {
            v4.remove(u(obj, obj2));
            synchronized (c.class) {
                Set<k3.b<e, e>> v5 = v();
                if (v5 != null && v5.isEmpty()) {
                    f15939b.remove();
                }
            }
        }
    }

    static k3.b<e, e> u(Object obj, Object obj2) {
        return k3.b.of(new e(obj), new e(obj2));
    }

    static Set<k3.b<e, e>> v() {
        return f15939b.get();
    }

    static boolean x(Object obj, Object obj2) {
        Set<k3.b<e, e>> v4 = v();
        k3.b<e, e> u4 = u(obj, obj2);
        k3.b of = k3.b.of(u4.getLeft(), u4.getRight());
        if (v4 != null && (v4.contains(u4) || v4.contains(of))) {
            return true;
        }
        return false;
    }

    private static void y(Object obj, Object obj2, Class<?> cls, c cVar, boolean z4, String[] strArr) {
        if (x(obj, obj2)) {
            return;
        }
        try {
            D(obj, obj2);
            Field[] declaredFields = cls.getDeclaredFields();
            AccessibleObject.setAccessible(declaredFields, true);
            for (int i5 = 0; i5 < declaredFields.length && cVar.f15940a; i5++) {
                Field field = declaredFields[i5];
                if (!external.org.apache.commons.lang3.a.S(strArr, field.getName()) && field.getName().indexOf(36) == -1 && ((z4 || !Modifier.isTransient(field.getModifiers())) && !Modifier.isStatic(field.getModifiers()))) {
                    try {
                        cVar.g(field.get(obj), field.get(obj2));
                    } catch (IllegalAccessException unused) {
                        throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }
        } finally {
            G(obj, obj2);
        }
    }

    public static boolean z(Object obj, Object obj2, Collection<String> collection) {
        return C(obj, obj2, f.t0(collection));
    }

    public void E() {
        this.f15940a = true;
    }

    protected void F(boolean z4) {
        this.f15940a = z4;
    }

    public c a(byte b5, byte b6) {
        boolean z4;
        if (!this.f15940a) {
            return this;
        }
        if (b5 == b6) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15940a = z4;
        return this;
    }

    public c b(char c5, char c6) {
        boolean z4;
        if (!this.f15940a) {
            return this;
        }
        if (c5 == c6) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15940a = z4;
        return this;
    }

    public c c(double d5, double d6) {
        if (!this.f15940a) {
            return this;
        }
        return f(Double.doubleToLongBits(d5), Double.doubleToLongBits(d6));
    }

    public c d(float f5, float f6) {
        if (!this.f15940a) {
            return this;
        }
        return e(Float.floatToIntBits(f5), Float.floatToIntBits(f6));
    }

    public c e(int i5, int i6) {
        boolean z4;
        if (!this.f15940a) {
            return this;
        }
        if (i5 == i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15940a = z4;
        return this;
    }

    public c f(long j5, long j6) {
        boolean z4;
        if (!this.f15940a) {
            return this;
        }
        if (j5 == j6) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15940a = z4;
        return this;
    }

    public c g(Object obj, Object obj2) {
        if (!this.f15940a) {
            return this;
        }
        if (obj == obj2) {
            return this;
        }
        if (obj != null && obj2 != null) {
            if (!obj.getClass().isArray()) {
                this.f15940a = obj.equals(obj2);
            } else if (obj.getClass() != obj2.getClass()) {
                F(false);
            } else if (obj instanceof long[]) {
                o((long[]) obj, (long[]) obj2);
            } else if (obj instanceof int[]) {
                n((int[]) obj, (int[]) obj2);
            } else if (obj instanceof short[]) {
                q((short[]) obj, (short[]) obj2);
            } else if (obj instanceof char[]) {
                k((char[]) obj, (char[]) obj2);
            } else if (obj instanceof byte[]) {
                j((byte[]) obj, (byte[]) obj2);
            } else if (obj instanceof double[]) {
                l((double[]) obj, (double[]) obj2);
            } else if (obj instanceof float[]) {
                m((float[]) obj, (float[]) obj2);
            } else if (obj instanceof boolean[]) {
                r((boolean[]) obj, (boolean[]) obj2);
            } else {
                p((Object[]) obj, (Object[]) obj2);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c h(short s5, short s6) {
        boolean z4;
        if (!this.f15940a) {
            return this;
        }
        if (s5 == s6) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f15940a = z4;
        return this;
    }

    public c i(boolean z4, boolean z5) {
        boolean z6;
        if (!this.f15940a) {
            return this;
        }
        if (z4 == z5) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f15940a = z6;
        return this;
    }

    public c j(byte[] bArr, byte[] bArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (bArr == bArr2) {
            return this;
        }
        if (bArr != null && bArr2 != null) {
            if (bArr.length != bArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < bArr.length && this.f15940a; i5++) {
                a(bArr[i5], bArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c k(char[] cArr, char[] cArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (cArr == cArr2) {
            return this;
        }
        if (cArr != null && cArr2 != null) {
            if (cArr.length != cArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < cArr.length && this.f15940a; i5++) {
                b(cArr[i5], cArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c l(double[] dArr, double[] dArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (dArr == dArr2) {
            return this;
        }
        if (dArr != null && dArr2 != null) {
            if (dArr.length != dArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < dArr.length && this.f15940a; i5++) {
                c(dArr[i5], dArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c m(float[] fArr, float[] fArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (fArr == fArr2) {
            return this;
        }
        if (fArr != null && fArr2 != null) {
            if (fArr.length != fArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < fArr.length && this.f15940a; i5++) {
                d(fArr[i5], fArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c n(int[] iArr, int[] iArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (iArr == iArr2) {
            return this;
        }
        if (iArr != null && iArr2 != null) {
            if (iArr.length != iArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < iArr.length && this.f15940a; i5++) {
                e(iArr[i5], iArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c o(long[] jArr, long[] jArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (jArr == jArr2) {
            return this;
        }
        if (jArr != null && jArr2 != null) {
            if (jArr.length != jArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < jArr.length && this.f15940a; i5++) {
                f(jArr[i5], jArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c p(Object[] objArr, Object[] objArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (objArr == objArr2) {
            return this;
        }
        if (objArr != null && objArr2 != null) {
            if (objArr.length != objArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < objArr.length && this.f15940a; i5++) {
                g(objArr[i5], objArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c q(short[] sArr, short[] sArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (sArr == sArr2) {
            return this;
        }
        if (sArr != null && sArr2 != null) {
            if (sArr.length != sArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < sArr.length && this.f15940a; i5++) {
                h(sArr[i5], sArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c r(boolean[] zArr, boolean[] zArr2) {
        if (!this.f15940a) {
            return this;
        }
        if (zArr == zArr2) {
            return this;
        }
        if (zArr != null && zArr2 != null) {
            if (zArr.length != zArr2.length) {
                F(false);
                return this;
            }
            for (int i5 = 0; i5 < zArr.length && this.f15940a; i5++) {
                i(zArr[i5], zArr2[i5]);
            }
            return this;
        }
        F(false);
        return this;
    }

    public c s(boolean z4) {
        if (!this.f15940a) {
            return this;
        }
        this.f15940a = z4;
        return this;
    }

    @Override // external.org.apache.commons.lang3.builder.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean build() {
        return Boolean.valueOf(w());
    }

    public boolean w() {
        return this.f15940a;
    }
}
