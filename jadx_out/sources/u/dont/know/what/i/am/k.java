package u.dont.know.what.i.am;

import android.content.res.Resources;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipFile;
import u.dont.know.what.i.am.g;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, Field> f22530a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, Method> f22531b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, Constructor<?>> f22532c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap<Object, HashMap<String, Object>> f22533d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, ThreadLocal<AtomicInteger>> f22534e = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends ThreadLocal<AtomicInteger> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AtomicInteger initialValue() {
            return new AtomicInteger();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        public b(Throwable th) {
            super(th);
        }

        public b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        public c(Throwable th) {
            super(th);
        }
    }

    private k() {
    }

    private static Field A(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e5) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e5;
        }
    }

    public static Object A0(Class<?> cls, String str, Object obj) {
        return z0(cls, str, obj);
    }

    public static Field B(Class<?> cls, Class<?> cls2) {
        Class<?> cls3 = cls;
        do {
            for (Field field : cls3.getDeclaredFields()) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            cls3 = cls3.getSuperclass();
        } while (cls3 != null);
        throw new NoSuchFieldError("Field of type " + cls2.getName() + " in class " + cls.getName());
    }

    public static Object B0(Object obj, String str, Object obj2) {
        return z0(obj.getClass(), str, obj2);
    }

    public static Method C(Class<?> cls, String str, Class<?>... clsArr) {
        String str2 = cls.getName() + '#' + str + g0(clsArr) + "#bestmatch";
        HashMap<String, Method> hashMap = f22531b;
        if (hashMap.containsKey(str2)) {
            Method method = hashMap.get(str2);
            if (method != null) {
                return method;
            }
            throw new NoSuchMethodError(str2);
        }
        try {
            Method F = F(cls, str, clsArr);
            hashMap.put(str2, F);
            return F;
        } catch (NoSuchMethodError unused) {
            Method method2 = null;
            boolean z4 = true;
            while (true) {
                for (Method method3 : cls.getDeclaredMethods()) {
                    if ((z4 || !Modifier.isPrivate(method3.getModifiers())) && method3.getName().equals(str) && external.org.apache.commons.lang3.d.D(clsArr, method3.getParameterTypes(), true) && (method2 == null || external.org.apache.commons.lang3.reflect.a.a(method3.getParameterTypes(), method2.getParameterTypes(), clsArr) < 0)) {
                        method2 = method3;
                    }
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    break;
                }
                z4 = false;
            }
            if (method2 != null) {
                method2.setAccessible(true);
                f22531b.put(str2, method2);
                return method2;
            }
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError(str2);
            f22531b.put(str2, null);
            throw noSuchMethodError;
        }
    }

    public static void C0(Object obj, String str, boolean z4) {
        try {
            y(obj.getClass(), str).setBoolean(obj, z4);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method D(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?>[] clsArr2 = null;
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            if (clsArr[i5] == null) {
                if (clsArr2 == null) {
                    clsArr2 = f0(objArr);
                }
                clsArr[i5] = clsArr2[i5];
            }
        }
        return C(cls, str, clsArr);
    }

    public static void D0(Object obj, String str, byte b5) {
        try {
            y(obj.getClass(), str).setByte(obj, b5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method E(Class<?> cls, String str, Object... objArr) {
        return C(cls, str, f0(objArr));
    }

    public static void E0(Object obj, String str, char c5) {
        try {
            y(obj.getClass(), str).setChar(obj, c5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method F(Class<?> cls, String str, Class<?>... clsArr) {
        String str2 = cls.getName() + '#' + str + g0(clsArr) + "#exact";
        HashMap<String, Method> hashMap = f22531b;
        if (hashMap.containsKey(str2)) {
            Method method = hashMap.get(str2);
            if (method != null) {
                return method;
            }
            throw new NoSuchMethodError(str2);
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            hashMap.put(str2, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            f22531b.put(str2, null);
            throw new NoSuchMethodError(str2);
        }
    }

    public static void F0(Object obj, String str, double d5) {
        try {
            y(obj.getClass(), str).setDouble(obj, d5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method G(Class<?> cls, String str, Object... objArr) {
        return F(cls, str, d0(cls.getClassLoader(), objArr));
    }

    public static void G0(Object obj, String str, float f5) {
        try {
            y(obj.getClass(), str).setFloat(obj, f5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method H(String str, ClassLoader classLoader, String str2, Object... objArr) {
        return F(o(str, classLoader), str2, d0(classLoader, objArr));
    }

    public static void H0(Object obj, String str, int i5) {
        try {
            y(obj.getClass(), str).setInt(obj, i5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method I(Class<?> cls, String str, Object... objArr) {
        try {
            return G(cls, str, objArr);
        } catch (NoSuchMethodError | b unused) {
            return null;
        }
    }

    public static void I0(Object obj, String str, long j5) {
        try {
            y(obj.getClass(), str).setLong(obj, j5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method J(String str, ClassLoader classLoader, String str2, Object... objArr) {
        try {
            return H(str, classLoader, str2, objArr);
        } catch (NoSuchMethodError | b unused) {
            return null;
        }
    }

    public static void J0(Object obj, String str, Object obj2) {
        try {
            y(obj.getClass(), str).set(obj, obj2);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Method[] K(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        boolean z4;
        LinkedList linkedList = new LinkedList();
        for (Method method : cls.getDeclaredMethods()) {
            if (cls2 == null || cls2 == method.getReturnType()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (clsArr.length == parameterTypes.length) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < clsArr.length) {
                            if (clsArr[i5] != parameterTypes[i5]) {
                                z4 = false;
                                break;
                            }
                            i5++;
                        } else {
                            z4 = true;
                            break;
                        }
                    }
                    if (z4) {
                        method.setAccessible(true);
                        linkedList.add(method);
                    }
                }
            }
        }
        return (Method[]) linkedList.toArray(new Method[linkedList.size()]);
    }

    public static void K0(Object obj, String str, short s5) {
        try {
            y(obj.getClass(), str).setShort(obj, s5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Object L(Object obj, String str) {
        Object obj2;
        if (obj != null) {
            if (str != null) {
                WeakHashMap<Object, HashMap<String, Object>> weakHashMap = f22533d;
                synchronized (weakHashMap) {
                    HashMap<String, Object> hashMap = weakHashMap.get(obj);
                    if (hashMap == null) {
                        return null;
                    }
                    synchronized (hashMap) {
                        obj2 = hashMap.get(str);
                    }
                    return obj2;
                }
            }
            throw new NullPointerException("key must not be null");
        }
        throw new NullPointerException("object must not be null");
    }

    public static void L0(Class<?> cls, String str, boolean z4) {
        try {
            y(cls, str).setBoolean(null, z4);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Object M(Class<?> cls, String str) {
        return L(cls, str);
    }

    public static void M0(Class<?> cls, String str, byte b5) {
        try {
            y(cls, str).setByte(null, b5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Object N(Object obj, String str) {
        return L(obj.getClass(), str);
    }

    public static void N0(Class<?> cls, String str, char c5) {
        try {
            y(cls, str).setChar(null, c5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static boolean O(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getBoolean(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static void O0(Class<?> cls, String str, double d5) {
        try {
            y(cls, str).setDouble(null, d5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static byte P(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getByte(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static void P0(Class<?> cls, String str, float f5) {
        try {
            y(cls, str).setFloat(null, f5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static char Q(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getChar(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static void Q0(Class<?> cls, String str, int i5) {
        try {
            y(cls, str).setInt(null, i5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Class<?>[] R(Class<?>... clsArr) {
        return clsArr;
    }

    public static void R0(Class<?> cls, String str, long j5) {
        try {
            y(cls, str).setLong(null, j5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static double S(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getDouble(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static void S0(Class<?> cls, String str, Object obj) {
        try {
            y(cls, str).set(null, obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static int T(Member member, Class<?> cls) {
        Class<?>[] parameterTypes;
        if (member instanceof Method) {
            parameterTypes = ((Method) member).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) member).getParameterTypes();
        }
        for (int i5 = 0; i5 < parameterTypes.length; i5++) {
            if (parameterTypes[i5] == cls) {
                return i5;
            }
        }
        throw new NoSuchFieldError("No parameter of type " + cls + " found in " + member);
    }

    public static void T0(Class<?> cls, String str, short s5) {
        try {
            y(cls, str).setShort(null, s5);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static float U(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getFloat(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static int V(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getInt(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static long W(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getLong(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static String X(String str) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16);
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static int Y(String str) {
        return Z(str).get().get();
    }

    private static ThreadLocal<AtomicInteger> Z(String str) {
        ThreadLocal<AtomicInteger> threadLocal;
        HashMap<String, ThreadLocal<AtomicInteger>> hashMap = f22534e;
        synchronized (hashMap) {
            threadLocal = hashMap.get(str);
            if (threadLocal == null) {
                threadLocal = new a();
                hashMap.put(str, threadLocal);
            }
        }
        return threadLocal;
    }

    public static byte[] a(Resources resources, String str) throws IOException {
        return t0(resources.getAssets().open(str));
    }

    public static Object a0(Object obj, String str) {
        try {
            return y(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Object b(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return D(obj.getClass(), str, clsArr, objArr).invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (InvocationTargetException e7) {
            throw new c(e7.getCause());
        }
    }

    static Method b0(Method method) {
        int modifiers = method.getModifiers();
        if (!Modifier.isStatic(modifiers) && !Modifier.isPrivate(modifiers)) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<? super Object> superclass = method.getDeclaringClass().getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(name, parameterTypes);
                    int modifiers2 = declaredMethod.getModifiers();
                    if (!Modifier.isPrivate(modifiers2)) {
                        if (!Modifier.isAbstract(modifiers2)) {
                            return declaredMethod;
                        }
                    }
                    return null;
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        return null;
    }

    public static Object c(Object obj, String str, Object... objArr) {
        try {
            return E(obj.getClass(), str, objArr).invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (InvocationTargetException e7) {
            throw new c(e7.getCause());
        }
    }

    static Set<Method> c0(Class<?> cls) {
        HashSet hashSet = new HashSet();
        for (Method method : cls.getDeclaredMethods()) {
            Method b02 = b0(method);
            if (b02 != null) {
                hashSet.add(b02);
            }
        }
        return hashSet;
    }

    public static Object d(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return D(cls, str, clsArr, objArr).invoke(null, objArr);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (InvocationTargetException e7) {
            throw new c(e7.getCause());
        }
    }

    private static Class<?>[] d0(ClassLoader classLoader, Object[] objArr) {
        Class<?>[] clsArr = null;
        for (int length = objArr.length - 1; length >= 0; length--) {
            Object obj = objArr[length];
            if (obj != null) {
                if (!(obj instanceof g)) {
                    if (clsArr == null) {
                        clsArr = new Class[length + 1];
                    }
                    if (obj instanceof Class) {
                        clsArr[length] = (Class) obj;
                    } else if (obj instanceof String) {
                        clsArr[length] = o((String) obj, classLoader);
                    } else {
                        throw new b("parameter type must either be specified as Class or String", null);
                    }
                }
            } else {
                throw new b("parameter type must not be null", null);
            }
        }
        if (clsArr == null) {
            return new Class[0];
        }
        return clsArr;
    }

    public static Object e(Class<?> cls, String str, Object... objArr) {
        try {
            return E(cls, str, objArr).invoke(null, objArr);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (InvocationTargetException e7) {
            throw new c(e7.getCause());
        }
    }

    public static int e0(Member member, Class<?> cls) {
        Class<?>[] parameterTypes;
        if (member instanceof Method) {
            parameterTypes = ((Method) member).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) member).getParameterTypes();
        }
        int i5 = -1;
        for (int i6 = 0; i6 < parameterTypes.length; i6++) {
            if (parameterTypes[i6] == cls) {
                if (i5 == -1) {
                    i5 = i6;
                } else {
                    throw new NoSuchFieldError("More than one parameter of type " + cls + " found in " + member);
                }
            }
        }
        if (i5 != -1) {
            return i5;
        }
        throw new NoSuchFieldError("No parameter of type " + cls + " found in " + member);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(DexFile dexFile) {
        if (dexFile != null) {
            try {
                dexFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Class<?>[] f0(Object... objArr) {
        Class<?> cls;
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            clsArr[i5] = cls;
        }
        return clsArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String g0(Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("(");
        boolean z4 = true;
        for (Class<?> cls : clsArr) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(",");
            }
            if (cls != null) {
                sb.append(cls.getCanonicalName());
            } else {
                sb.append("null");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static short h0(Object obj, String str) {
        try {
            return y(obj.getClass(), str).getShort(obj);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static int i(String str) {
        return Z(str).get().decrementAndGet();
    }

    public static boolean i0(Class<?> cls, String str) {
        try {
            return y(cls, str).getBoolean(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    static boolean j(File file, String str) throws IOException {
        String readLine;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            do {
                try {
                    readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        g(bufferedReader2);
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    g(bufferedReader);
                    throw th;
                }
            } while (!readLine.contains(str));
            g(bufferedReader2);
            return true;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte j0(Class<?> cls, String str) {
        try {
            return y(cls, str).getByte(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static g.b k(Class<?> cls, Object... objArr) {
        if (objArr.length != 0 && (objArr[objArr.length - 1] instanceof g)) {
            return j.h(t(cls, d0(cls.getClassLoader(), objArr)), (g) objArr[objArr.length - 1]);
        }
        throw new IllegalArgumentException("no callback defined");
    }

    public static char k0(Class<?> cls, String str) {
        try {
            return y(cls, str).getChar(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static g.b l(String str, ClassLoader classLoader, Object... objArr) {
        return k(o(str, classLoader), objArr);
    }

    public static double l0(Class<?> cls, String str) {
        try {
            return y(cls, str).getDouble(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static g.b m(Class<?> cls, String str, Object... objArr) {
        if (objArr.length != 0 && (objArr[objArr.length - 1] instanceof g)) {
            return j.h(F(cls, str, d0(cls.getClassLoader(), objArr)), (g) objArr[objArr.length - 1]);
        }
        throw new IllegalArgumentException("no callback defined");
    }

    public static float m0(Class<?> cls, String str) {
        try {
            return y(cls, str).getFloat(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static g.b n(String str, ClassLoader classLoader, String str2, Object... objArr) {
        return m(o(str, classLoader), str2, objArr);
    }

    public static int n0(Class<?> cls, String str) {
        try {
            return y(cls, str).getInt(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Class<?> o(String str, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = j.f22513a;
        }
        try {
            return external.org.apache.commons.lang3.d.i(classLoader, str, false);
        } catch (ClassNotFoundException e5) {
            throw new b(e5);
        }
    }

    public static long o0(Class<?> cls, String str) {
        try {
            return y(cls, str).getLong(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Class<?> p(String str, ClassLoader classLoader) {
        try {
            return o(str, classLoader);
        } catch (b unused) {
            return null;
        }
    }

    public static Object p0(Class<?> cls, String str) {
        try {
            return y(cls, str).get(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Constructor<?> q(Class<?> cls, Class<?>... clsArr) {
        String str = cls.getName() + g0(clsArr) + "#bestmatch";
        HashMap<String, Constructor<?>> hashMap = f22532c;
        if (hashMap.containsKey(str)) {
            Constructor<?> constructor = hashMap.get(str);
            if (constructor != null) {
                return constructor;
            }
            throw new NoSuchMethodError(str);
        }
        try {
            Constructor<?> t5 = t(cls, clsArr);
            hashMap.put(str, t5);
            return t5;
        } catch (NoSuchMethodError unused) {
            Constructor<?> constructor2 = null;
            for (Constructor<?> constructor3 : cls.getDeclaredConstructors()) {
                if (external.org.apache.commons.lang3.d.D(clsArr, constructor3.getParameterTypes(), true) && (constructor2 == null || external.org.apache.commons.lang3.reflect.a.a(constructor3.getParameterTypes(), constructor2.getParameterTypes(), clsArr) < 0)) {
                    constructor2 = constructor3;
                }
            }
            if (constructor2 != null) {
                constructor2.setAccessible(true);
                f22532c.put(str, constructor2);
                return constructor2;
            }
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError(str);
            f22532c.put(str, null);
            throw noSuchMethodError;
        }
    }

    public static short q0(Class<?> cls, String str) {
        try {
            return y(cls, str).getShort(null);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        }
    }

    public static Constructor<?> r(Class<?> cls, Class<?>[] clsArr, Object[] objArr) {
        Class<?>[] clsArr2 = null;
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            if (clsArr[i5] == null) {
                if (clsArr2 == null) {
                    clsArr2 = f0(objArr);
                }
                clsArr[i5] = clsArr2[i5];
            }
        }
        return q(cls, clsArr);
    }

    public static Object r0(Object obj) {
        return a0(obj, "this$0");
    }

    public static Constructor<?> s(Class<?> cls, Object... objArr) {
        return q(cls, f0(objArr));
    }

    public static int s0(String str) {
        return Z(str).get().incrementAndGet();
    }

    public static Constructor<?> t(Class<?> cls, Class<?>... clsArr) {
        String str = cls.getName() + g0(clsArr) + "#exact";
        HashMap<String, Constructor<?>> hashMap = f22532c;
        if (hashMap.containsKey(str)) {
            Constructor<?> constructor = hashMap.get(str);
            if (constructor != null) {
                return constructor;
            }
            throw new NoSuchMethodError(str);
        }
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            hashMap.put(str, declaredConstructor);
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            f22532c.put(str, null);
            throw new NoSuchMethodError(str);
        }
    }

    static byte[] t0(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Constructor<?> u(Class<?> cls, Object... objArr) {
        return t(cls, d0(cls.getClassLoader(), objArr));
    }

    public static Object u0(Class<?> cls, Class<?>[] clsArr, Object... objArr) {
        try {
            return r(cls, clsArr, objArr).newInstance(objArr);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (InstantiationException e7) {
            throw new InstantiationError(e7.getMessage());
        } catch (InvocationTargetException e8) {
            throw new c(e8.getCause());
        }
    }

    public static Constructor<?> v(String str, ClassLoader classLoader, Object... objArr) {
        return t(o(str, classLoader), d0(classLoader, objArr));
    }

    public static Object v0(Class<?> cls, Object... objArr) {
        try {
            return s(cls, objArr).newInstance(objArr);
        } catch (IllegalAccessException e5) {
            j.m(e5);
            throw new IllegalAccessError(e5.getMessage());
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (InstantiationException e7) {
            throw new InstantiationError(e7.getMessage());
        } catch (InvocationTargetException e8) {
            throw new c(e8.getCause());
        }
    }

    public static Constructor<?> w(Class<?> cls, Object... objArr) {
        try {
            return u(cls, objArr);
        } catch (NoSuchMethodError | b unused) {
            return null;
        }
    }

    public static Object w0(Object obj, String str) {
        Object remove;
        if (obj != null) {
            if (str != null) {
                WeakHashMap<Object, HashMap<String, Object>> weakHashMap = f22533d;
                synchronized (weakHashMap) {
                    HashMap<String, Object> hashMap = weakHashMap.get(obj);
                    if (hashMap == null) {
                        return null;
                    }
                    synchronized (hashMap) {
                        remove = hashMap.remove(str);
                    }
                    return remove;
                }
            }
            throw new NullPointerException("key must not be null");
        }
        throw new NullPointerException("object must not be null");
    }

    public static Constructor<?> x(String str, ClassLoader classLoader, Object... objArr) {
        try {
            return v(str, classLoader, objArr);
        } catch (NoSuchMethodError | b unused) {
            return null;
        }
    }

    public static Object x0(Class<?> cls, String str) {
        return w0(cls, str);
    }

    public static Field y(Class<?> cls, String str) {
        String str2 = cls.getName() + '#' + str;
        HashMap<String, Field> hashMap = f22530a;
        if (hashMap.containsKey(str2)) {
            Field field = hashMap.get(str2);
            if (field != null) {
                return field;
            }
            throw new NoSuchFieldError(str2);
        }
        try {
            Field A = A(cls, str);
            A.setAccessible(true);
            hashMap.put(str2, A);
            return A;
        } catch (NoSuchFieldException unused) {
            f22530a.put(str2, null);
            throw new NoSuchFieldError(str2);
        }
    }

    public static Object y0(Object obj, String str) {
        return w0(obj.getClass(), str);
    }

    public static Field z(Class<?> cls, String str) {
        try {
            return y(cls, str);
        } catch (NoSuchFieldError unused) {
            return null;
        }
    }

    public static Object z0(Object obj, String str, Object obj2) {
        HashMap<String, Object> hashMap;
        Object put;
        if (obj != null) {
            if (str != null) {
                WeakHashMap<Object, HashMap<String, Object>> weakHashMap = f22533d;
                synchronized (weakHashMap) {
                    hashMap = weakHashMap.get(obj);
                    if (hashMap == null) {
                        hashMap = new HashMap<>();
                        weakHashMap.put(obj, hashMap);
                    }
                }
                synchronized (hashMap) {
                    put = hashMap.put(str, obj2);
                }
                return put;
            }
            throw new NullPointerException("key must not be null");
        }
        throw new NullPointerException("object must not be null");
    }
}
