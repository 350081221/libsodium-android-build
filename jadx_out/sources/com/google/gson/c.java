package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Field f7465a;

    public c(Field field) {
        com.google.gson.internal.a.b(field);
        this.f7465a = field;
    }

    Object a(Object obj) throws IllegalAccessException {
        return this.f7465a.get(obj);
    }

    public <T extends Annotation> T b(Class<T> cls) {
        return (T) this.f7465a.getAnnotation(cls);
    }

    public Collection<Annotation> c() {
        return Arrays.asList(this.f7465a.getAnnotations());
    }

    public Class<?> d() {
        return this.f7465a.getType();
    }

    public Type e() {
        return this.f7465a.getGenericType();
    }

    public Class<?> f() {
        return this.f7465a.getDeclaringClass();
    }

    public String g() {
        return this.f7465a.getName();
    }

    public boolean h(int i5) {
        return (i5 & this.f7465a.getModifiers()) != 0;
    }

    boolean i() {
        return this.f7465a.isSynthetic();
    }
}
