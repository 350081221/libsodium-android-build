package mirror;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class RefMethod<T> {
    private Method method;

    public RefMethod(Class<?> cls, Field field) throws NoSuchMethodException {
        int i5 = 0;
        if (field.isAnnotationPresent(MethodParams.class)) {
            Class<?>[] value = ((MethodParams) field.getAnnotation(MethodParams.class)).value();
            while (i5 < value.length) {
                Class<?> cls2 = value[i5];
                if (cls2.getClassLoader() == getClass().getClassLoader()) {
                    try {
                        Class.forName(cls2.getName());
                        value[i5] = (Class) cls2.getField("TYPE").get(null);
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
            while (i5 < value2.length) {
                Class<?> protoType = RefStaticMethod.getProtoType(value2[i5]);
                if (protoType == null) {
                    try {
                        protoType = Class.forName(value2[i5]);
                    } catch (ClassNotFoundException e5) {
                        e5.printStackTrace();
                    }
                }
                clsArr[i5] = protoType;
                i5++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(field.getName(), clsArr);
            this.method = declaredMethod2;
            declaredMethod2.setAccessible(true);
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

    public T call(Object obj, Object... objArr) {
        try {
            return (T) this.method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (IllegalArgumentException e6) {
            e6.printStackTrace();
            return null;
        } catch (SecurityException e7) {
            e7.printStackTrace();
            return null;
        } catch (InvocationTargetException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public T callWithException(Object obj, Object... objArr) throws Throwable {
        try {
            return (T) this.method.invoke(obj, objArr);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() != null) {
                throw e5.getCause();
            }
            throw e5;
        }
    }

    public Class<?>[] paramList() {
        return this.method.getParameterTypes();
    }
}
