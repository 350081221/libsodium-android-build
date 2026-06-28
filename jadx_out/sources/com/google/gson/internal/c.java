package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.h<?>> f7632a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.internal.reflect.b f7633b = com.google.gson.internal.reflect.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> implements com.google.gson.internal.k<T> {
        a() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class b<T> implements com.google.gson.internal.k<T> {
        b() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0151c<T> implements com.google.gson.internal.k<T> {
        C0151c() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class d<T> implements com.google.gson.internal.k<T> {
        d() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new com.google.gson.internal.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class e<T> implements com.google.gson.internal.k<T> {

        /* renamed from: a, reason: collision with root package name */
        private final o f7638a = o.b();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f7639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f7640c;

        e(Class cls, Type type) {
            this.f7639b = cls;
            this.f7640c = type;
        }

        @Override // com.google.gson.internal.k
        public T a() {
            try {
                return (T) this.f7638a.c(this.f7639b);
            } catch (Exception e5) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f7640c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e5);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class f<T> implements com.google.gson.internal.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.h f7642a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f7643b;

        f(com.google.gson.h hVar, Type type) {
            this.f7642a = hVar;
            this.f7643b = type;
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) this.f7642a.a(this.f7643b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class g<T> implements com.google.gson.internal.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.h f7645a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f7646b;

        g(com.google.gson.h hVar, Type type) {
            this.f7645a = hVar;
            this.f7646b = type;
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) this.f7645a.a(this.f7646b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class h<T> implements com.google.gson.internal.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f7648a;

        h(Constructor constructor) {
            this.f7648a = constructor;
        }

        @Override // com.google.gson.internal.k
        public T a() {
            try {
                return (T) this.f7648a.newInstance(null);
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InstantiationException e6) {
                throw new RuntimeException("Failed to invoke " + this.f7648a + " with no args", e6);
            } catch (InvocationTargetException e7) {
                throw new RuntimeException("Failed to invoke " + this.f7648a + " with no args", e7.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class i<T> implements com.google.gson.internal.k<T> {
        i() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class j<T> implements com.google.gson.internal.k<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f7651a;

        j(Type type) {
            this.f7651a = type;
        }

        @Override // com.google.gson.internal.k
        public T a() {
            Type type = this.f7651a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new com.google.gson.m("Invalid EnumSet type: " + this.f7651a.toString());
            }
            throw new com.google.gson.m("Invalid EnumSet type: " + this.f7651a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class k<T> implements com.google.gson.internal.k<T> {
        k() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class l<T> implements com.google.gson.internal.k<T> {
        l() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class m<T> implements com.google.gson.internal.k<T> {
        m() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class n<T> implements com.google.gson.internal.k<T> {
        n() {
        }

        @Override // com.google.gson.internal.k
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, com.google.gson.h<?>> map) {
        this.f7632a = map;
    }

    private <T> com.google.gson.internal.k<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f7633b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> com.google.gson.internal.k<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l();
            }
            return new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(com.google.gson.reflect.a.c(((ParameterizedType) type).getActualTypeArguments()[0]).f())) {
                return new C0151c();
            }
            return new d();
        }
        return null;
    }

    private <T> com.google.gson.internal.k<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> com.google.gson.internal.k<T> a(com.google.gson.reflect.a<T> aVar) {
        Type h5 = aVar.h();
        Class<? super T> f5 = aVar.f();
        com.google.gson.h<?> hVar = this.f7632a.get(h5);
        if (hVar != null) {
            return new f(hVar, h5);
        }
        com.google.gson.h<?> hVar2 = this.f7632a.get(f5);
        if (hVar2 != null) {
            return new g(hVar2, h5);
        }
        com.google.gson.internal.k<T> b5 = b(f5);
        if (b5 != null) {
            return b5;
        }
        com.google.gson.internal.k<T> c5 = c(h5, f5);
        if (c5 != null) {
            return c5;
        }
        return d(h5, f5);
    }

    public String toString() {
        return this.f7632a.toString();
    }
}
