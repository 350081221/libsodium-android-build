package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefFloat {
    private Field field;

    public RefFloat(Class cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public float get(Object obj) {
        try {
            return this.field.getFloat(obj);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public void set(Object obj, float f5) {
        try {
            this.field.setFloat(obj, f5);
        } catch (Exception unused) {
        }
    }
}
