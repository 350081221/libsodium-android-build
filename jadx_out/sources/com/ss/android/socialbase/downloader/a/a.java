package com.ss.android.socialbase.downloader.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.ss.android.socialbase.downloader.i.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Application f10405a;

    /* renamed from: b, reason: collision with root package name */
    private c f10406b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC0196a> f10407c;

    /* renamed from: d, reason: collision with root package name */
    private int f10408d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f10409e;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f10410f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f10411g;

    /* renamed from: h, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f10412h;

    /* renamed from: com.ss.android.socialbase.downloader.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0196a {
        @MainThread
        void b();

        @MainThread
        void c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f10414a = new a();
    }

    /* loaded from: classes3.dex */
    public interface c {
    }

    private Object[] d() {
        Object[] objArr;
        synchronized (this.f10407c) {
            if (this.f10407c.size() > 0) {
                objArr = this.f10407c.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f10410f = 1;
        Object[] d5 = d();
        if (d5 != null) {
            for (Object obj : d5) {
                ((InterfaceC0196a) obj).b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f10410f = 0;
        Object[] d5 = d();
        if (d5 != null) {
            for (Object obj : d5) {
                ((InterfaceC0196a) obj).c();
            }
        }
    }

    private boolean g() {
        try {
            Application application = this.f10405a;
            if (application == null) {
                return false;
            }
            return TextUtils.equals(application.getPackageName(), f.d(application));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private a() {
        this.f10407c = new ArrayList();
        this.f10410f = -1;
        this.f10411g = false;
        this.f10412h = new Application.ActivityLifecycleCallbacks() { // from class: com.ss.android.socialbase.downloader.a.a.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                a.this.f10411g = true;
                if (a.this.f10408d == 0 && activity != null) {
                    a.this.f10408d = activity.hashCode();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                int i5;
                int i6 = a.this.f10408d;
                a.this.f10411g = false;
                a aVar = a.this;
                if (activity != null) {
                    i5 = activity.hashCode();
                } else {
                    i5 = i6;
                }
                aVar.f10408d = i5;
                if (i6 == 0) {
                    a.this.e();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                int i5;
                a.this.f10409e = new WeakReference(activity);
                int i6 = a.this.f10408d;
                a aVar = a.this;
                if (activity != null) {
                    i5 = activity.hashCode();
                } else {
                    i5 = i6;
                }
                aVar.f10408d = i5;
                a.this.f10411g = false;
                if (i6 == 0) {
                    a.this.e();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                if (activity != null && activity.hashCode() == a.this.f10408d) {
                    a.this.f10408d = 0;
                    a.this.f();
                }
                a.this.f10411g = false;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public boolean b() {
        int i5 = this.f10410f;
        int i6 = i5;
        if (i5 == -1) {
            ?? g5 = g();
            this.f10410f = g5;
            i6 = g5;
        }
        return i6 == 1;
    }

    public boolean c() {
        return b() && !this.f10411g;
    }

    public static a a() {
        return b.f10414a;
    }

    public void b(InterfaceC0196a interfaceC0196a) {
        synchronized (this.f10407c) {
            this.f10407c.remove(interfaceC0196a);
        }
    }

    public void a(Context context) {
        if (this.f10405a == null && (context instanceof Application)) {
            synchronized (this) {
                if (this.f10405a == null) {
                    Application application = (Application) context;
                    this.f10405a = application;
                    application.registerActivityLifecycleCallbacks(this.f10412h);
                }
            }
        }
    }

    public void a(c cVar) {
        this.f10406b = cVar;
    }

    public void a(InterfaceC0196a interfaceC0196a) {
        if (interfaceC0196a == null) {
            return;
        }
        synchronized (this.f10407c) {
            if (!this.f10407c.contains(interfaceC0196a)) {
                this.f10407c.add(interfaceC0196a);
            }
        }
    }
}
