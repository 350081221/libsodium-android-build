package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefBoolean {
    private Field field;

    public RefBoolean(Class<?> cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public boolean get(Object obj) {
        try {
            return this.field.getBoolean(obj);
        } catch (Exception unused) {
            return false;
        }
    }

    public void set(Object obj, boolean z4) {
        try {
            this.field.setBoolean(obj, z4);
        } catch (Exception unused) {
        }
    }
}
