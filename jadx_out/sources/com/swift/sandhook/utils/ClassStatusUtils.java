package com.swift.sandhook.utils;

import com.swift.sandhook.SandHookConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public class ClassStatusUtils {
    static Field fieldStatusOfClass;

    static {
        try {
            Field declaredField = Class.class.getDeclaredField("status");
            fieldStatusOfClass = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    public static int getClassStatus(Class cls, boolean z4) {
        int i5 = 0;
        if (cls == null) {
            return 0;
        }
        try {
            i5 = fieldStatusOfClass.getInt(cls);
        } catch (Throwable unused) {
        }
        if (z4) {
            return (int) (toUnsignedLong(i5) >> 28);
        }
        return i5;
    }

    public static boolean isInitialized(Class cls) {
        if (fieldStatusOfClass == null) {
            return true;
        }
        if (SandHookConfig.SDK_INT >= 28) {
            if (getClassStatus(cls, true) >= 14) {
                return true;
            }
            return false;
        }
        if (SandHookConfig.SDK_INT == 27) {
            if (getClassStatus(cls, false) == 11) {
                return true;
            }
            return false;
        }
        if (getClassStatus(cls, false) == 10) {
            return true;
        }
        return false;
    }

    public static boolean isStaticAndNoInited(Member member) {
        if (!(member instanceof Method)) {
            return false;
        }
        Class<?> declaringClass = member.getDeclaringClass();
        if (!Modifier.isStatic(member.getModifiers()) || isInitialized(declaringClass)) {
            return false;
        }
        return true;
    }

    public static long toUnsignedLong(int i5) {
        return i5 & 4294967295L;
    }
}
