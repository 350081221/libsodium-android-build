package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefDouble {
    private Field field;

    public RefDouble(Class cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public double get(Object obj) {
        try {
            return this.field.getDouble(obj);
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public void set(Object obj, double d5) {
        try {
            this.field.setDouble(obj, d5);
        } catch (Exception unused) {
        }
    }
}
