package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class o {

    /* loaded from: classes2.dex */
    static class a extends o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f7716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f7717b;

        a(Method method, Object obj) {
            this.f7716a = method;
            this.f7717b = obj;
        }

        @Override // com.google.gson.internal.o
        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return (T) this.f7716a.invoke(this.f7717b, cls);
        }
    }

    /* loaded from: classes2.dex */
    static class b extends o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f7718a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7719b;

        b(Method method, int i5) {
            this.f7718a = method;
            this.f7719b = i5;
        }

        @Override // com.google.gson.internal.o
        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return (T) this.f7718a.invoke(null, cls, Integer.valueOf(this.f7719b));
        }
    }

    /* loaded from: classes2.dex */
    static class c extends o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f7720a;

        c(Method method) {
            this.f7720a = method;
        }

        @Override // com.google.gson.internal.o
        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return (T) this.f7720a.invoke(null, cls, Object.class);
        }
    }

    /* loaded from: classes2.dex */
    static class d extends o {
        d() {
        }

        @Override // com.google.gson.internal.o
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    public static o b() {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(Unsafe.class.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
