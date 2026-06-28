package mirror;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class RefStaticMethod<T> {
    private Method method;
    private String name;
    private String parent;

    public RefStaticMethod(Class<?> cls, Field field) throws NoSuchMethodException {
        Class<?> cls2;
        this.name = field.getName();
        this.parent = cls.getName();
        int i5 = 0;
        if (field.isAnnotationPresent(MethodParams.class)) {
            Class<?>[] value = ((MethodParams) field.getAnnotation(MethodParams.class)).value();
            while (i5 < value.length) {
                Class<?> cls3 = value[i5];
                if (cls3.getClassLoader() == getClass().getClassLoader()) {
                    try {
                        Class.forName(cls3.getName());
                        value[i5] = (Class) cls3.getField("TYPE").get(null);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                i5++;
            }
            Method declaredMethod = cls.getDeclaredMethod(field.getName(), value);
            this.method = declaredMethod;
            declaredMethod.setAccessible(true);
        } else if (field.isAnnotationPresent(MethodReflectParams.class)) {
            String[] value2 = ((MethodReflectParams) field.getAnnotation(MethodReflectParams.class)).value();
            Class<?>[] clsArr = new Class[value2.length];
            Class<?>[] clsArr2 = new Class[value2.length];
            boolean z4 = false;
            while (i5 < value2.length) {
                Class<?> protoType = getProtoType(value2[i5]);
                if (protoType == null) {
                    try {
                        protoType = Class.forName(value2[i5]);
                    } catch (ClassNotFoundException e5) {
                        e5.printStackTrace();
                    }
                }
                clsArr[i5] = protoType;
                if ("java.util.HashSet".equals(value2[i5])) {
                    try {
                        cls2 = Class.forName("android.util.ArraySet");
                    } catch (ClassNotFoundException unused) {
                        cls2 = protoType;
                    }
                    if (cls2 != null) {
                        clsArr2[i5] = cls2;
                    } else {
                        clsArr2[i5] = protoType;
                    }
                    z4 = true;
                } else {
                    clsArr2[i5] = protoType;
                }
                i5++;
            }
            try {
                this.method = cls.getDeclaredMethod(field.getName(), clsArr);
            } catch (Exception e6) {
                e6.printStackTrace();
                if (z4) {
                    this.method = cls.getDeclaredMethod(field.getName(), clsArr2);
                }
            }
            this.method.setAccessible(true);
        } else {
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                Method method = declaredMethods[i5];
                if (method.getName().equals(field.getName())) {
                    this.method = method;
                    method.setAccessible(true);
                    break;
                }
                i5++;
            }
        }
        if (this.method != null) {
        } else {
            throw new NoSuchMethodException(field.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> getProtoType(String str) {
        if (str.equals(com.swift.sandhook.annotation.MethodReflectParams.INT)) {
            return Integer.TYPE;
        }
        if (str.equals(com.swift.sandhook.annotation.MethodReflectParams.LONG)) {
            return Long.TYPE;
        }
        if (str.equals("boolean")) {
            return Boolean.TYPE;
        }
        if (str.equals(com.swift.sandhook.annotation.MethodReflectParams.BYTE)) {
            return Byte.TYPE;
        }
        if (str.equals(com.swift.sandhook.annotation.MethodReflectParams.SHORT)) {
            return Short.TYPE;
        }
        if (str.equals(com.swift.sandhook.annotation.MethodReflectParams.CHAR)) {
            return Character.TYPE;
        }
        if (str.equals("float")) {
            return Float.TYPE;
        }
        if (str.equals(com.swift.sandhook.annotation.MethodReflectParams.DOUBLE)) {
            return Double.TYPE;
        }
        if (str.equals("void")) {
            return Void.TYPE;
        }
        return null;
    }

    public T call(Object... objArr) {
        try {
            return (T) this.method.invoke(null, objArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public T callWithException(Object... objArr) throws Throwable {
        try {
            return (T) this.method.invoke(null, objArr);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() != null) {
                throw e5.getCause();
            }
            throw e5;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RefStaticMethod{");
        sb.append(this.parent);
        sb.append("@");
        sb.append(this.name);
        sb.append(" find=");
        sb.append(this.method != null);
        sb.append('}');
        return sb.toString();
    }
}
