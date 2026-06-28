package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefStaticObject<T> {
    private Field field;

    public RefStaticObject(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public T get() {
        try {
            return (T) this.field.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public void set(T t5) {
        try {
            this.field.set(null, t5);
        } catch (Exception unused) {
        }
    }

    public Class<?> type() {
        return this.field.getType();
    }
}
