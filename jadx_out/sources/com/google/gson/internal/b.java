package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f7514a = new Type[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public a(Type type) {
            this.componentType = b.b(type);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof GenericArrayType) && b.f(this, (GenericArrayType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return b.u(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0148b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public C0148b(Type type, Type type2, Type... typeArr) {
            Type b5;
            boolean z4;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z5 = true;
                if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (type == null && !z4) {
                    z5 = false;
                }
                com.google.gson.internal.a.a(z5);
            }
            if (type == null) {
                b5 = null;
            } else {
                b5 = b.b(type);
            }
            this.ownerType = b5;
            this.rawType = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                com.google.gson.internal.a.b(this.typeArguments[i5]);
                b.c(this.typeArguments[i5]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i5] = b.b(typeArr3[i5]);
            }
        }

        public boolean equals(Object obj) {
            if ((obj instanceof ParameterizedType) && b.f(this, (ParameterizedType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ b.m(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return b.u(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.u(this.rawType));
            sb.append("<");
            sb.append(b.u(this.typeArguments[0]));
            for (int i5 = 1; i5 < length; i5++) {
                sb.append(", ");
                sb.append(b.u(this.typeArguments[i5]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z4;
            boolean z5;
            if (typeArr2.length <= 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            com.google.gson.internal.a.a(z4);
            if (typeArr.length == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.google.gson.internal.a.a(z5);
            if (typeArr2.length == 1) {
                com.google.gson.internal.a.b(typeArr2[0]);
                b.c(typeArr2[0]);
                com.google.gson.internal.a.a(typeArr[0] == Object.class);
                this.lowerBound = b.b(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            com.google.gson.internal.a.b(typeArr[0]);
            b.c(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = b.b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            if ((obj instanceof WildcardType) && b.f(this, (WildcardType) obj)) {
                return true;
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : b.f7514a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            int i5;
            Type type = this.lowerBound;
            if (type != null) {
                i5 = type.hashCode() + 31;
            } else {
                i5 = 1;
            }
            return i5 ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + b.u(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + b.u(this.upperBound);
        }
    }

    private b() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.gson.internal.b$a] */
    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new a(b(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0148b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    static void c(Type type) {
        com.google.gson.internal.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static boolean e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type l5 = l(type, cls, Collection.class);
        if (l5 instanceof WildcardType) {
            l5 = ((WildcardType) l5).getUpperBounds()[0];
        }
        if (l5 instanceof ParameterizedType) {
            return ((ParameterizedType) l5).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i5 = 0; i5 < length; i5++) {
                Class<?> cls3 = interfaces[i5];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i5];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return i(cls.getGenericInterfaces()[i5], interfaces[i5], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type l5 = l(type, cls, Map.class);
        if (l5 instanceof ParameterizedType) {
            return ((ParameterizedType) l5).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.google.gson.internal.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.google.gson.internal.a.a(cls2.isAssignableFrom(cls));
        return p(type, cls, i(type, cls, cls2));
    }

    static int m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static int n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (obj.equals(objArr[i5])) {
                return i5;
            }
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType o(Type type, Type type2, Type... typeArr) {
        return new C0148b(type, type2, typeArr);
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashSet());
    }

    private static Type q(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        boolean z4;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = r(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type q5 = q(type, cls, componentType, collection);
                if (componentType != q5) {
                    return a(q5);
                }
                return cls2;
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type q6 = q(type, cls, genericComponentType, collection);
            if (genericComponentType != q6) {
                return a(q6);
            }
            return genericArrayType;
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type q7 = q(type, cls, ownerType, collection);
            if (q7 != ownerType) {
                z4 = true;
            } else {
                z4 = false;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i5 = 0; i5 < length; i5++) {
                Type q8 = q(type, cls, actualTypeArguments[i5], collection);
                if (q8 != actualTypeArguments[i5]) {
                    if (!z4) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z4 = true;
                    }
                    actualTypeArguments[i5] = q8;
                }
            }
            if (z4) {
                return o(q7, parameterizedType.getRawType(), actualTypeArguments);
            }
            return parameterizedType;
        }
        boolean z5 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z5) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type q9 = q(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (q9 != lowerBounds[0]) {
                    return t(q9);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type q10 = q(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (q10 != upperBounds[0]) {
                        return s(q10);
                    }
                }
            }
        }
        return type3;
    }

    static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d5 = d(typeVariable);
        if (d5 == null) {
            return typeVariable;
        }
        Type i5 = i(type, cls, d5);
        if (i5 instanceof ParameterizedType) {
            return ((ParameterizedType) i5).getActualTypeArguments()[n(d5.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    public static WildcardType s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(typeArr, f7514a);
    }

    public static WildcardType t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new c(new Type[]{Object.class}, typeArr);
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
