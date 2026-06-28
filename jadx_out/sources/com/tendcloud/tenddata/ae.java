package com.tendcloud.tenddata;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11373a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f11374b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11375c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11376d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(Object obj, Method method) {
        if (obj != null) {
            if (method != null) {
                this.f11373a = obj;
                this.f11374b = method;
                method.setAccessible(true);
                this.f11375c = ((method.hashCode() + 31) * 31) + obj.hashCode();
                return;
            }
            throw new NullPointerException("EventHandler method cannot be null.");
        }
        throw new NullPointerException("EventHandler target cannot be null.");
    }

    public boolean a() {
        return this.f11376d;
    }

    public void b() {
        this.f11376d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            if (ae.class != obj.getClass()) {
                return false;
            }
            ae aeVar = (ae) obj;
            if (this.f11374b.equals(aeVar.f11374b)) {
                if (this.f11373a == aeVar.f11373a) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void handleEvent(Object obj) {
        if (!this.f11376d) {
            h.eForInternal(toString() + " has been invalidated and can no longer handle events.");
        }
        try {
            this.f11374b.invoke(this.f11373a, obj);
        } catch (Throwable unused) {
        }
    }

    public int hashCode() {
        return this.f11375c;
    }

    public String toString() {
        return "[EventHandler " + this.f11374b + "]";
    }
}
