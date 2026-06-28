package com.google.gson.internal.reflect;

import com.google.gson.internal.f;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final b f7721a;

    static {
        f7721a = f.c() < 9 ? new a() : new c();
    }

    public static b a() {
        return f7721a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
