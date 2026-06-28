package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefStaticInt {
    private Field field;

    public RefStaticInt(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public int get() {
        try {
            return this.field.getInt(null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public void set(int i5) {
        try {
            this.field.setInt(null, i5);
        } catch (Exception unused) {
        }
    }
}
