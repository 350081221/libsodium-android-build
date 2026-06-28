package com.bytedance.sdk.openadsdk.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f4756a = false;

    /* renamed from: b, reason: collision with root package name */
    private int f4757b = 0;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0125a f4758c;

    /* renamed from: com.bytedance.sdk.openadsdk.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0125a {
        void a();

        void b();
    }

    public Boolean a() {
        return Boolean.valueOf(f4756a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f4757b++;
        f4756a = false;
        InterfaceC0125a interfaceC0125a = this.f4758c;
        if (interfaceC0125a != null) {
            interfaceC0125a.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i5 = this.f4757b - 1;
        this.f4757b = i5;
        if (i5 == 0) {
            f4756a = true;
            InterfaceC0125a interfaceC0125a = this.f4758c;
            if (interfaceC0125a != null) {
                interfaceC0125a.a();
            }
        }
    }

    public void a(InterfaceC0125a interfaceC0125a) {
        this.f4758c = interfaceC0125a;
    }
}
