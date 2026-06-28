package com.huawei.agconnect.core;

import com.huawei.agconnect.annotation.AutoCreated;
import com.huawei.agconnect.annotation.SharedInstance;
import com.huawei.agconnect.annotation.Singleton;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public class Service {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f7787a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f7788b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7789c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7790d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7791e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7792f;

    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        Class<?> f7793a;

        /* renamed from: b, reason: collision with root package name */
        Class<?> f7794b;

        /* renamed from: c, reason: collision with root package name */
        Object f7795c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7796d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f7797e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7798f;

        public Service build() {
            Class<?> cls = this.f7793a;
            if (cls == null) {
                throw new IllegalArgumentException("the interface parameter cannot be NULL");
            }
            Class<?> cls2 = this.f7794b;
            if (cls2 == null) {
                Object obj = this.f7795c;
                if (obj == null) {
                    throw new IllegalArgumentException("the clazz or object parameter must set one");
                }
                Service service = new Service(cls, obj);
                service.f7790d = this.f7796d;
                return service;
            }
            if (cls2.isInterface() || !Modifier.isPublic(this.f7794b.getModifiers())) {
                throw new IllegalArgumentException("the clazz parameter cant be interface type or not public");
            }
            Service service2 = new Service((Class) this.f7793a, (Class) this.f7794b);
            service2.f7790d = this.f7796d;
            service2.f7791e = this.f7797e;
            service2.f7792f = this.f7798f;
            return service2;
        }

        public Builder isAutoCreated(boolean z4) {
            this.f7798f = z4;
            return this;
        }

        public Builder isSharedInstance(boolean z4) {
            this.f7797e = z4;
            return this;
        }

        public Builder isSingleton(boolean z4) {
            this.f7796d = z4;
            return this;
        }

        public Builder setClass(Class<?> cls) {
            this.f7794b = cls;
            return this;
        }

        public Builder setInterface(Class<?> cls) {
            this.f7793a = cls;
            return this;
        }

        public Builder setObject(Object obj) {
            this.f7795c = obj;
            return this;
        }
    }

    private Service(Class<?> cls, Class<?> cls2) {
        this.f7787a = cls;
        this.f7788b = cls2;
        this.f7789c = null;
    }

    private Service(Class<?> cls, Object obj) {
        this.f7787a = cls;
        this.f7788b = null;
        this.f7789c = obj;
    }

    public static Builder builder(Class<?> cls) {
        return new Builder().setInterface(cls).setClass(cls).isSingleton(cls.isAnnotationPresent(Singleton.class)).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    public static Builder builder(Class<?> cls, Class<?> cls2) {
        return new Builder().setInterface(cls).setClass(cls2).isSingleton(cls2.isAnnotationPresent(Singleton.class)).isSharedInstance(cls2.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls2.isAnnotationPresent(AutoCreated.class));
    }

    public static Builder builder(Class<?> cls, Object obj) {
        return new Builder().setInterface(cls).setObject(obj).isSingleton(true).isSharedInstance(cls.isAnnotationPresent(SharedInstance.class)).isAutoCreated(cls.isAnnotationPresent(AutoCreated.class));
    }

    public Object getInstance() {
        return this.f7789c;
    }

    public Class<?> getInterface() {
        return this.f7787a;
    }

    public Class<?> getType() {
        return this.f7788b;
    }

    public boolean isAutoCreated() {
        return this.f7792f;
    }

    public boolean isSharedInstance() {
        return this.f7791e;
    }

    public boolean isSingleton() {
        return this.f7790d;
    }
}
