package com.bytedance.pangle.activity;

import android.app.Activity;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f4257a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4258b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4259c;

    /* renamed from: d, reason: collision with root package name */
    private Method f4260d;

    public a(@NonNull Activity activity, int i5, @NonNull String str) {
        this.f4257a = activity;
        this.f4258b = str;
        this.f4259c = i5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NonNull View view) {
        if (this.f4260d == null) {
            try {
                Method method = this.f4257a.getClass().getMethod(this.f4258b, View.class);
                if (method != null) {
                    this.f4260d = method;
                }
            } catch (NoSuchMethodException unused) {
            }
            throw new IllegalStateException("Could not find method " + this.f4258b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f4259c);
        }
        try {
            this.f4260d.invoke(this.f4257a, view);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
        } catch (InvocationTargetException e6) {
            throw new IllegalStateException("Could not execute method for android:onClick", e6);
        }
    }
}
