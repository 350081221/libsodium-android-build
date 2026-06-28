package mirror;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefConstructor<T> {
    private Constructor<?> ctor;

    public RefConstructor(Class<?> cls, Field field) throws NoSuchMethodException {
        if (field.isAnnotationPresent(MethodParams.class)) {
            this.ctor = cls.getDeclaredConstructor(((MethodParams) field.getAnnotation(MethodParams.class)).value());
        } else {
            int i5 = 0;
            if (field.isAnnotationPresent(MethodReflectParams.class)) {
                String[] value = ((MethodReflectParams) field.getAnnotation(MethodReflectParams.class)).value();
                Class<?>[] clsArr = new Class[value.length];
                while (i5 < value.length) {
                    try {
                        Class<?> protoType = RefStaticMethod.getProtoType(value[i5]);
                        clsArr[i5] = protoType == null ? Class.forName(value[i5]) : protoType;
                        i5++;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                this.ctor = cls.getDeclaredConstructor(clsArr);
            } else {
                this.ctor = cls.getDeclaredConstructor(new Class[0]);
            }
        }
        Constructor<?> constructor = this.ctor;
        if (constructor != null && !constructor.isAccessible()) {
            this.ctor.setAccessible(true);
        }
    }

    public T newInstance() {
        try {
            return (T) this.ctor.newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public T newInstance(Object... objArr) {
        try {
            return (T) this.ctor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
