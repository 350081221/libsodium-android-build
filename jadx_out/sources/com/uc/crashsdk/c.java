package com.uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11975a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11976b = false;

    private void a(Activity activity, int i5) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (1 == i5) {
            String unused = b.ad = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = b.ad = "";
        }
        b.D();
        if (g.L()) {
            b.O();
            weakHashMap = b.ab;
            synchronized (weakHashMap) {
                weakHashMap2 = b.ab;
                weakHashMap2.put(activity, Integer.valueOf(i5));
                a(i5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (g.L()) {
            b.O();
            weakHashMap = b.ab;
            synchronized (weakHashMap) {
                weakHashMap2 = b.ab;
                weakHashMap2.remove(activity);
                a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, 2);
    }

    private void a(int i5) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (e.u()) {
            com.uc.crashsdk.a.a.a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z4 = true;
        boolean z5 = 1 == i5;
        if (!z5) {
            weakHashMap2 = b.ab;
            Iterator it = weakHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
        }
        z4 = z5;
        if (this.f11975a != z4) {
            b.b(z4);
            this.f11975a = z4;
        }
        weakHashMap = b.ab;
        boolean isEmpty = weakHashMap.isEmpty();
        if (this.f11976b != isEmpty) {
            if (isEmpty) {
                b.w();
            }
            this.f11976b = isEmpty;
        }
    }
}
