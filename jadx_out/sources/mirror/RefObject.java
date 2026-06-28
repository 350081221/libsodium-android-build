package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefObject<T> {
    private Field field;

    public RefObject(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public T get(Object obj) {
        try {
            return (T) this.field.get(obj);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean set(Object obj, T t5) {
        try {
            this.field.set(obj, t5);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
