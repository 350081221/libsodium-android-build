package com.google.gson.internal.reflect;

import com.google.gson.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    private static Class f7722d;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7723b = d();

    /* renamed from: c, reason: collision with root package name */
    private final Field f7724c = c();

    private static Field c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private static Object d() {
        try {
            f7722d = Unsafe.class;
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.gson.internal.reflect.b
    public void b(AccessibleObject accessibleObject) {
        if (!e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e5) {
                throw new m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e5);
            }
        }
    }

    boolean e(AccessibleObject accessibleObject) {
        if (this.f7723b != null && this.f7724c != null) {
            try {
                f7722d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f7723b, accessibleObject, Long.valueOf(((Long) f7722d.getMethod("objectFieldOffset", Field.class).invoke(this.f7723b, this.f7724c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
