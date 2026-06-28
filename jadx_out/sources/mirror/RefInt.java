package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefInt {
    private Field field;

    public RefInt(Class cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public int get(Object obj) {
        try {
            return this.field.getInt(obj);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void set(Object obj, int i5) {
        try {
            this.field.setInt(obj, i5);
        } catch (Exception unused) {
        }
    }
}
