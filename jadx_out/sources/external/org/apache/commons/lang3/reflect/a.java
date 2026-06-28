package external.org.apache.commons.lang3.reflect;

import external.org.apache.commons.lang3.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f16047a = 7;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f16048b = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    public static int a(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float d5 = d(clsArr3, clsArr);
        float d6 = d(clsArr3, clsArr2);
        if (d5 < d6) {
            return -1;
        }
        if (d6 < d5) {
            return 1;
        }
        return 0;
    }

    private static float b(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return c(cls, cls2);
        }
        float f5 = 0.0f;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && d.A(cls, cls2)) {
                    f5 += 0.25f;
                    break;
                }
                f5 += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        if (cls == null) {
            return f5 + 1.5f;
        }
        return f5;
    }

    private static float c(Class<?> cls, Class<?> cls2) {
        float f5;
        if (!cls.isPrimitive()) {
            cls = d.L(cls);
            f5 = 0.1f;
        } else {
            f5 = 0.0f;
        }
        int i5 = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = f16048b;
            if (i5 >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i5]) {
                f5 += 0.1f;
                if (i5 < clsArr.length - 1) {
                    cls = clsArr[i5 + 1];
                }
            }
            i5++;
        }
        return f5;
    }

    private static float d(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f5 = 0.0f;
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            f5 += b(clsArr[i5], clsArr2[i5]);
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Member member) {
        return (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) ? false : true;
    }

    static boolean f(int i5) {
        return (i5 & 7) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void g(AccessibleObject accessibleObject) {
        if (accessibleObject != 0 && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (Modifier.isPublic(member.getModifiers()) && f(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                } catch (SecurityException unused) {
                }
            }
        }
    }
}
