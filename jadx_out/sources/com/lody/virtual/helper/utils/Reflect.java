package com.lody.virtual.helper.utils;

import com.umeng.analytics.pro.bi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Reflect {
    private final boolean isClass = true;
    private final Object object;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class NULL {
        private NULL() {
        }
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
    }

    public static <T extends AccessibleObject> T accessible(T t5) {
        if (t5 == null) {
            return null;
        }
        if (t5 instanceof Member) {
            Member member = (Member) t5;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t5;
            }
        }
        if (!t5.isAccessible()) {
            t5.setAccessible(true);
        }
        return t5;
    }

    public static Object defaultValue(Class<?> cls) {
        Class<?> wrapper = wrapper(cls);
        if (wrapper != null && wrapper.isPrimitive()) {
            if (Boolean.class == wrapper) {
                return Boolean.FALSE;
            }
            if (Number.class.isAssignableFrom(wrapper)) {
                return 0;
            }
            if (Character.class == wrapper) {
                return (char) 0;
            }
        }
        return null;
    }

    private Field field0(String str) throws ReflectException {
        Class<?> type = type();
        try {
            return type.getField(str);
        } catch (NoSuchFieldException e5) {
            do {
                try {
                    return (Field) accessible(type.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    type = type.getSuperclass();
                }
            } while (type != null);
            throw new ReflectException(e5);
        }
    }

    private static Class<?> forName(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public static String getMethodDetails(Method method) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(Modifier.toString(method.getModifiers()));
        sb.append(" ");
        sb.append(method.getReturnType().getName());
        sb.append(" ");
        sb.append(method.getName());
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> cls : parameterTypes) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        if (parameterTypes.length > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(")");
        return sb.toString();
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (method.getName().equals(str) && match(method.getParameterTypes(), clsArr)) {
            return true;
        }
        return false;
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < clsArr2.length; i5++) {
            if (clsArr2[i5] != NULL.class && !wrapper(clsArr[i5]).isAssignableFrom(wrapper(clsArr2[i5]))) {
                return false;
            }
        }
        return true;
    }

    private boolean matchObject(Class<?>[] clsArr) {
        return clsArr.length > 0 && clsArr[0].isAssignableFrom(Object[].class);
    }

    private boolean matchObjectMethod(Method method, String str, Class<?>[] clsArr) {
        if (method.getName().equals(str) && matchObject(method.getParameterTypes())) {
            return true;
        }
        return false;
    }

    public static Reflect on(String str) throws ReflectException {
        return on(forName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> type = type();
        for (Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : type.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private static Class<?>[] types(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                cls = NULL.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i5] = cls;
        }
        return clsArr;
    }

    private static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
            return cls;
        }
        return cls;
    }

    public <P> P as(Class<P> cls) {
        final boolean z4 = this.object instanceof Map;
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.lody.virtual.helper.utils.Reflect.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                int length;
                String name = method.getName();
                try {
                    return Reflect.on(Reflect.this.object).call(name, objArr).get();
                } catch (ReflectException e5) {
                    if (z4) {
                        Map map = (Map) Reflect.this.object;
                        if (objArr == null) {
                            length = 0;
                        } else {
                            length = objArr.length;
                        }
                        if (length == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (length == 0 && name.startsWith(bi.ae)) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (length == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e5;
                }
            }
        });
    }

    public Reflect call(String str) throws ReflectException {
        return call(str, new Object[0]);
    }

    public Reflect callBest(String str, Object... objArr) throws ReflectException {
        Class<?>[] types = types(objArr);
        Method[] declaredMethods = type().getDeclaredMethods();
        int length = declaredMethods.length;
        Method method = null;
        int i5 = 0;
        char c5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            Method method2 = declaredMethods[i5];
            if (isSimilarSignature(method2, str, types)) {
                c5 = 2;
                method = method2;
                break;
            }
            if (matchObjectMethod(method2, str, types)) {
                c5 = 1;
            } else {
                if (method2.getName().equals(str)) {
                    if (method2.getParameterTypes().length == 0) {
                        if (c5 != 0) {
                        }
                    }
                }
                i5++;
            }
            method = method2;
            i5++;
        }
        if (method != null) {
            if (c5 == 0) {
                objArr = new Object[0];
            }
            if (c5 == 1) {
                objArr = new Object[]{objArr};
            }
            return on(method, this.object, objArr);
        }
        throw new ReflectException("no method found for " + str, new NoSuchMethodException("No best method " + str + " with params " + Arrays.toString(types) + " could be found on type " + type() + "."));
    }

    public Reflect create() throws ReflectException {
        return create(new Object[0]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Reflect) && this.object.equals(((Reflect) obj).get());
    }

    public Method exactMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> type = type();
        try {
            return type.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return type.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    type = type.getSuperclass();
                }
            } while (type != null);
            throw new NoSuchMethodException();
        }
    }

    public Reflect field(String str) throws ReflectException {
        try {
            return on(field0(str).get(this.object));
        } catch (Exception e5) {
            throw new ReflectException(this.object.getClass().getName(), e5);
        }
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> type = type();
        do {
            for (Field field : type.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    public <T> T get() {
        return (T) this.object;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public <T> T opt(String str) {
        try {
            return (T) field(str).get();
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void printFields() {
        Map<String, Reflect> fields;
        Class<?> cls;
        String obj;
        if (this.object == null || (fields = fields()) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Reflect> entry : fields.entrySet()) {
            String key = entry.getKey();
            Object obj2 = entry.getValue().object;
            if (obj2 == null) {
                obj = "null";
            } else {
                obj = obj2.toString();
            }
            sb.append(key + " = " + obj);
            sb.append('\n');
        }
        if (this.isClass) {
            cls = (Class) this.object;
        } else {
            cls = this.object.getClass();
        }
        VLog.e(cls.getSimpleName(), sb.toString());
    }

    public Reflect set(String str, Object obj) throws ReflectException {
        try {
            Field field0 = field0(str);
            field0.setAccessible(true);
            field0.set(this.object, unwrap(obj));
            return this;
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        if (this.isClass) {
            return (Class) this.object;
        }
        return this.object.getClass();
    }

    public static Reflect on(String str, ClassLoader classLoader) throws ReflectException {
        return on(forName(str, classLoader));
    }

    public Reflect call(String str, Object... objArr) throws ReflectException {
        Class<?>[] types = types(objArr);
        try {
            try {
                return on(exactMethod(str, types), this.object, objArr);
            } catch (NoSuchMethodException e5) {
                throw new ReflectException(e5);
            }
        } catch (NoSuchMethodException unused) {
            return on(similarMethod(str, types), this.object, objArr);
        }
    }

    public Reflect create(Object... objArr) throws ReflectException {
        Class<?>[] types = types(objArr);
        try {
            return on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e5) {
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), types)) {
                    return on(constructor, objArr);
                }
            }
            throw new ReflectException(e5);
        }
    }

    public <T> T get(String str) throws ReflectException {
        return (T) field(str).get();
    }

    private static Class<?> forName(String str, ClassLoader classLoader) throws ReflectException {
        try {
            return Class.forName(str, true, classLoader);
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private static Reflect on(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }

    private static Reflect on(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            accessible(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return on(obj);
            }
            return on(method.invoke(obj, objArr));
        } catch (Exception e5) {
            throw new ReflectException(e5);
        }
    }
}
