package mirror;

import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public class RefLong {
    private Field field;

    public RefLong(Class cls, Field field) throws NoSuchFieldException {
        Field declaredField = cls.getDeclaredField(field.getName());
        this.field = declaredField;
        declaredField.setAccessible(true);
    }

    public long get(Object obj) {
        try {
            return this.field.getLong(obj);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public void set(Object obj, long j5) {
        try {
            this.field.setLong(obj, j5);
        } catch (Exception unused) {
        }
    }
}
