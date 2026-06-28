package external.org.apache.commons.lang3;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final char f15959c = '$';

    /* renamed from: e, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f15961e;

    /* renamed from: f, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f15962f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f15963g;

    /* renamed from: h, reason: collision with root package name */
    private static final Map<String, String> f15964h;

    /* renamed from: a, reason: collision with root package name */
    public static final char f15957a = '.';

    /* renamed from: b, reason: collision with root package name */
    public static final String f15958b = String.valueOf(f15957a);

    /* renamed from: d, reason: collision with root package name */
    public static final String f15960d = String.valueOf('$');

    static {
        HashMap hashMap = new HashMap();
        f15961e = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        Class cls = Void.TYPE;
        hashMap.put(cls, cls);
        f15962f = new HashMap();
        for (Class<?> cls2 : hashMap.keySet()) {
            Class<?> cls3 = f15961e.get(cls2);
            if (!cls2.equals(cls3)) {
                f15962f.put(cls3, cls2);
            }
        }
        f15963g = new HashMap();
        f15964h = new HashMap();
        a(MethodReflectParams.INT, "I");
        a("boolean", "Z");
        a("float", "F");
        a(MethodReflectParams.LONG, "J");
        a(MethodReflectParams.SHORT, "S");
        a(MethodReflectParams.BYTE, "B");
        a(MethodReflectParams.DOUBLE, "D");
        a(MethodReflectParams.CHAR, "C");
    }

    public static boolean A(Class<?> cls, Class<?> cls2) {
        return B(cls, cls2, h.j(e.JAVA_1_5));
    }

    public static boolean B(Class<?> cls, Class<?> cls2, boolean z4) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z4) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = H(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = L(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (!cls2.isPrimitive()) {
                return false;
            }
            Class cls3 = Integer.TYPE;
            if (cls3.equals(cls)) {
                if (!Long.TYPE.equals(cls2) && !Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
                return true;
            }
            Class cls4 = Long.TYPE;
            if (cls4.equals(cls)) {
                if (!Float.TYPE.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
                return true;
            }
            if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
                return false;
            }
            Class cls5 = Float.TYPE;
            if (cls5.equals(cls)) {
                return Double.TYPE.equals(cls2);
            }
            if (Character.TYPE.equals(cls)) {
                if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
                return true;
            }
            if (Short.TYPE.equals(cls)) {
                if (!cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                    return false;
                }
                return true;
            }
            if (!Byte.TYPE.equals(cls)) {
                return false;
            }
            if (!Short.TYPE.equals(cls2) && !cls3.equals(cls2) && !cls4.equals(cls2) && !cls5.equals(cls2) && !Double.TYPE.equals(cls2)) {
                return false;
            }
            return true;
        }
        return cls2.isAssignableFrom(cls);
    }

    public static boolean C(Class<?>[] clsArr, Class<?>... clsArr2) {
        return D(clsArr, clsArr2, h.j(e.JAVA_1_5));
    }

    public static boolean D(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z4) {
        if (!a.S0(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = a.f15919b;
        }
        if (clsArr2 == null) {
            clsArr2 = a.f15919b;
        }
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            if (!B(clsArr[i5], clsArr2[i5], z4)) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(Class<?> cls) {
        return (cls == null || cls.getEnclosingClass() == null) ? false : true;
    }

    public static boolean F(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isPrimitive() || G(cls);
    }

    public static boolean G(Class<?> cls) {
        return f15962f.containsKey(cls);
    }

    public static Class<?> H(Class<?> cls) {
        if (cls != null && cls.isPrimitive()) {
            return f15961e.get(cls);
        }
        return cls;
    }

    public static Class<?>[] I(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            clsArr2[i5] = H(clsArr[i5]);
        }
        return clsArr2;
    }

    private static String J(String str) {
        String z4 = g.z(str);
        if (z4 != null) {
            if (z4.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                StringBuilder sb = new StringBuilder();
                while (z4.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                    z4 = z4.substring(0, z4.length() - 2);
                    sb.append("[");
                }
                String str2 = f15963g.get(z4);
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("L");
                    sb.append(z4);
                    sb.append(a1.i.f136b);
                }
                return sb.toString();
            }
            return z4;
        }
        throw new NullPointerException("className must not be null.");
    }

    public static Class<?>[] K(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return a.f15919b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            clsArr[i5] = cls;
        }
        return clsArr;
    }

    public static Class<?> L(Class<?> cls) {
        return f15962f.get(cls);
    }

    public static Class<?>[] M(Class<?>... clsArr) {
        if (clsArr == null) {
            return null;
        }
        if (clsArr.length == 0) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length];
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            clsArr2[i5] = L(clsArr[i5]);
        }
        return clsArr2;
    }

    private static void a(String str, String str2) {
        f15963g.put(str, str2);
        f15964h.put(str2, str);
    }

    public static List<Class<?>> b(List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Class.forName(it.next()));
            } catch (Exception unused) {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static List<String> c(List<Class<?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Class<?> cls : list) {
            if (cls == null) {
                arrayList.add(null);
            } else {
                arrayList.add(cls.getName());
            }
        }
        return arrayList;
    }

    public static List<Class<?>> d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e(cls, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    private static void e(Class<?> cls, HashSet<Class<?>> hashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (hashSet.add(cls2)) {
                    e(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }

    public static List<Class<?>> f(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            arrayList.add(superclass);
        }
        return arrayList;
    }

    private static String g(String str) {
        int length;
        String z4 = g.z(str);
        if (z4 == null) {
            return null;
        }
        int i5 = 0;
        while (z4.startsWith("[")) {
            i5++;
            z4 = z4.substring(1);
        }
        if (i5 < 1) {
            return z4;
        }
        if (z4.startsWith("L")) {
            if (z4.endsWith(a1.i.f136b)) {
                length = z4.length() - 1;
            } else {
                length = z4.length();
            }
            z4 = z4.substring(1, length);
        } else if (z4.length() > 0) {
            z4 = f15964h.get(z4.substring(0, 1));
        }
        StringBuilder sb = new StringBuilder(z4);
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
        return sb.toString();
    }

    public static Class<?> h(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return i(classLoader, str, true);
    }

    public static Class<?> i(ClassLoader classLoader, String str, boolean z4) throws ClassNotFoundException {
        try {
            Map<String, String> map = f15963g;
            if (map.containsKey(str)) {
                return Class.forName("[" + map.get(str), z4, classLoader).getComponentType();
            }
            return Class.forName(J(str), z4, classLoader);
        } catch (ClassNotFoundException e5) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                try {
                    return i(classLoader, str.substring(0, lastIndexOf) + '$' + str.substring(lastIndexOf + 1), z4);
                } catch (ClassNotFoundException unused) {
                    throw e5;
                }
            }
            throw e5;
        }
    }

    public static Class<?> j(String str) throws ClassNotFoundException {
        return k(str, true);
    }

    public static Class<?> k(String str, boolean z4) throws ClassNotFoundException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = d.class.getClassLoader();
        }
        return i(contextClassLoader, str, z4);
    }

    public static String l(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return n(cls.getName());
    }

    public static String m(Object obj, String str) {
        return obj == null ? str : n(obj.getClass().getName());
    }

    public static String n(String str) {
        return q(g(str));
    }

    public static String o(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return q(cls.getName());
    }

    public static String p(Object obj, String str) {
        return obj == null ? str : o(obj.getClass());
    }

    public static String q(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        while (str.charAt(0) == '[') {
            str = str.substring(1);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return str.substring(0, lastIndexOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method r(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) throws java.lang.SecurityException, java.lang.NoSuchMethodException {
        /*
            java.lang.reflect.Method r0 = r2.getMethod(r3, r4)
            java.lang.Class r1 = r0.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = d(r2)
            r0.addAll(r1)
            java.util.List r2 = f(r2)
            r0.addAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r2.next()
            java.lang.Class r0 = (java.lang.Class) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 != 0) goto L41
            goto L2a
        L41:
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class r1 = r0.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L2a
            return r0
        L54:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't find a public method for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = external.org.apache.commons.lang3.a.m3(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: external.org.apache.commons.lang3.d.r(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static String s(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return u(cls.getName());
    }

    public static String t(Object obj, String str) {
        return obj == null ? str : u(obj.getClass().getName());
    }

    public static String u(String str) {
        return x(g(str));
    }

    public static String v(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return x(cls.getName());
    }

    public static String w(Object obj, String str) {
        return obj == null ? str : v(obj.getClass());
    }

    public static String x(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
        }
        Map<String, String> map = f15964h;
        if (map.containsKey(str)) {
            str = map.get(str);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i5 = lastIndexOf + 1;
        }
        int indexOf = str.indexOf(36, i5);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', f15957a);
        }
        return substring + ((Object) sb);
    }

    public static String y(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return cls.getSimpleName();
    }

    public static String z(Object obj, String str) {
        return obj == null ? str : y(obj.getClass());
    }
}
