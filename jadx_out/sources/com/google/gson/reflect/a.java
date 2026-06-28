package com.google.gson.reflect;

import com.google.gson.internal.b;
import external.org.apache.commons.lang3.d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    final Class<? super T> f7729a;

    /* renamed from: b, reason: collision with root package name */
    final Type f7730b;

    /* renamed from: c, reason: collision with root package name */
    final int f7731c;

    protected a() {
        Type g5 = g(getClass());
        this.f7730b = g5;
        this.f7729a = (Class<? super T>) b.k(g5);
        this.f7731c = g5.hashCode();
    }

    private static AssertionError a(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append(d.f15957a);
        return new AssertionError(sb.toString());
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> c(Type type) {
        return new a<>(type);
    }

    public static a<?> d(Type type) {
        return new a<>(b.a(type));
    }

    public static a<?> e(Type type, Type... typeArr) {
        return new a<>(b.o(null, type, typeArr));
    }

    static Type g(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean l(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type = (Class) type;
                while (type.isArray()) {
                    type = type.getComponentType();
                }
            }
            return m(type, (ParameterizedType) genericComponentType, new HashMap());
        }
        return true;
    }

    private static boolean m(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        ParameterizedType parameterizedType2;
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class<?> k5 = b.k(type);
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type;
        } else {
            parameterizedType2 = null;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable<Class<?>>[] typeParameters = k5.getTypeParameters();
            for (int i5 = 0; i5 < actualTypeArguments.length; i5++) {
                Type type2 = actualTypeArguments[i5];
                TypeVariable<Class<?>> typeVariable = typeParameters[i5];
                while (type2 instanceof TypeVariable) {
                    type2 = map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (o(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type type3 : k5.getGenericInterfaces()) {
            if (m(type3, parameterizedType, new HashMap(map))) {
                return true;
            }
        }
        return m(k5.getGenericSuperclass(), parameterizedType, new HashMap(map));
    }

    private static boolean n(Type type, Type type2, Map<String, Type> map) {
        if (!type2.equals(type) && (!(type instanceof TypeVariable) || !type2.equals(map.get(((TypeVariable) type).getName())))) {
            return false;
        }
        return true;
    }

    private static boolean o(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i5 = 0; i5 < actualTypeArguments.length; i5++) {
            if (!n(actualTypeArguments[i5], actualTypeArguments2[i5], map)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && b.f(this.f7730b, ((a) obj).f7730b)) {
            return true;
        }
        return false;
    }

    public final Class<? super T> f() {
        return this.f7729a;
    }

    public final Type h() {
        return this.f7730b;
    }

    public final int hashCode() {
        return this.f7731c;
    }

    @Deprecated
    public boolean i(a<?> aVar) {
        return k(aVar.h());
    }

    @Deprecated
    public boolean j(Class<?> cls) {
        return k(cls);
    }

    @Deprecated
    public boolean k(Type type) {
        if (type == null) {
            return false;
        }
        if (this.f7730b.equals(type)) {
            return true;
        }
        Type type2 = this.f7730b;
        if (type2 instanceof Class) {
            return this.f7729a.isAssignableFrom(b.k(type));
        }
        if (type2 instanceof ParameterizedType) {
            return m(type, (ParameterizedType) type2, new HashMap());
        }
        if (type2 instanceof GenericArrayType) {
            if (!this.f7729a.isAssignableFrom(b.k(type)) || !l(type, (GenericArrayType) this.f7730b)) {
                return false;
            }
            return true;
        }
        throw a(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
    }

    public final String toString() {
        return b.u(this.f7730b);
    }

    a(Type type) {
        Type b5 = b.b((Type) com.google.gson.internal.a.b(type));
        this.f7730b = b5;
        this.f7729a = (Class<? super T>) b.k(b5);
        this.f7731c = b5.hashCode();
    }
}
