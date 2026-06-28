package external.org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public class f extends g {

    /* renamed from: e, reason: collision with root package name */
    private boolean f15946e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15947f;

    /* renamed from: g, reason: collision with root package name */
    protected String[] f15948g;

    /* renamed from: h, reason: collision with root package name */
    private Class<?> f15949h;

    public f(Object obj) {
        super(obj);
        this.f15946e = false;
        this.f15947f = false;
        this.f15949h = null;
    }

    public static String A0(Object obj, Collection<String> collection) {
        return B0(obj, t0(collection));
    }

    public static String B0(Object obj, String... strArr) {
        return new f(obj).r0(strArr).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] t0(Collection<String> collection) {
        if (collection == null) {
            return external.org.apache.commons.lang3.a.f15920c;
        }
        return u0(collection.toArray());
    }

    static String[] u0(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(external.org.apache.commons.lang3.a.f15920c);
    }

    public static String v0(Object obj) {
        return z0(obj, null, false, false, null);
    }

    public static String w0(Object obj, h hVar) {
        return z0(obj, hVar, false, false, null);
    }

    public static String x0(Object obj, h hVar, boolean z4) {
        return z0(obj, hVar, z4, false, null);
    }

    public static String y0(Object obj, h hVar, boolean z4, boolean z5) {
        return z0(obj, hVar, z4, z5, null);
    }

    public static <T> String z0(T t5, h hVar, boolean z4, boolean z5, Class<? super T> cls) {
        return new f(t5, hVar, null, cls, z4, z5).toString();
    }

    protected boolean h0(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !n0()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !m0()) {
            return false;
        }
        String[] strArr = this.f15948g;
        if (strArr != null && Arrays.binarySearch(strArr, field.getName()) >= 0) {
            return false;
        }
        return true;
    }

    protected void i0(Class<?> cls) {
        if (cls.isArray()) {
            o0(Z());
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (Field field : declaredFields) {
            String name = field.getName();
            if (h0(field)) {
                try {
                    n(name, l0(field));
                } catch (IllegalAccessException e5) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e5.getMessage());
                }
            }
        }
    }

    public String[] j0() {
        return (String[]) this.f15948g.clone();
    }

    public Class<?> k0() {
        return this.f15949h;
    }

    protected Object l0(Field field) throws IllegalArgumentException, IllegalAccessException {
        return field.get(Z());
    }

    public boolean m0() {
        return this.f15946e;
    }

    public boolean n0() {
        return this.f15947f;
    }

    public f o0(Object obj) {
        b0().reflectionAppendArrayDetail(a0(), null, obj);
        return this;
    }

    public void p0(boolean z4) {
        this.f15946e = z4;
    }

    public void q0(boolean z4) {
        this.f15947f = z4;
    }

    public f r0(String... strArr) {
        if (strArr == null) {
            this.f15948g = null;
        } else {
            String[] u02 = u0(strArr);
            this.f15948g = u02;
            Arrays.sort(u02);
        }
        return this;
    }

    public void s0(Class<?> cls) {
        Object Z;
        if (cls != null && (Z = Z()) != null && !cls.isInstance(Z)) {
            throw new IllegalArgumentException("Specified class is not a superclass of the object");
        }
        this.f15949h = cls;
    }

    @Override // external.org.apache.commons.lang3.builder.g
    public String toString() {
        if (Z() == null) {
            return b0().getNullText();
        }
        Class<?> cls = Z().getClass();
        i0(cls);
        while (cls.getSuperclass() != null && cls != k0()) {
            cls = cls.getSuperclass();
            i0(cls);
        }
        return super.toString();
    }

    public f(Object obj, h hVar) {
        super(obj, hVar);
        this.f15946e = false;
        this.f15947f = false;
        this.f15949h = null;
    }

    public f(Object obj, h hVar, StringBuffer stringBuffer) {
        super(obj, hVar, stringBuffer);
        this.f15946e = false;
        this.f15947f = false;
        this.f15949h = null;
    }

    public <T> f(T t5, h hVar, StringBuffer stringBuffer, Class<? super T> cls, boolean z4, boolean z5) {
        super(t5, hVar, stringBuffer);
        this.f15946e = false;
        this.f15947f = false;
        this.f15949h = null;
        s0(cls);
        q0(z4);
        p0(z5);
    }
}
