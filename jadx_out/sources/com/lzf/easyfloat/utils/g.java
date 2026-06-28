package com.lzf.easyfloat.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lzf.easyfloat.data.FloatConfig;
import com.umeng.analytics.pro.bi;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0007R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/lzf/easyfloat/utils/g;", "", "Landroid/app/Activity;", "activity", "Lkotlin/r2;", bi.aJ, socket.g.f22386a, "", "isShow", "", TTDownloadField.TT_TAG, "n", "(ZLjava/lang/String;)Lkotlin/r2;", "j", "Landroid/app/Application;", "application", "m", "k", "b", "Landroid/app/Application;", "i", "()Landroid/app/Application;", "l", "(Landroid/app/Application;)V", "", "c", "I", "activityCount", "Ljava/lang/ref/WeakReference;", "d", "Ljava/lang/ref/WeakReference;", "mTopActivity", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final g f9290a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static Application f9291b;

    /* renamed from: c, reason: collision with root package name */
    private static int f9292c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private static WeakReference<Activity> f9293d;

    @i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000f"}, d2 = {"com/lzf/easyfloat/utils/g$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/r2;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@m Activity activity, @m Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@m Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@m Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@m Activity activity) {
            if (activity != null) {
                WeakReference weakReference = g.f9293d;
                if (weakReference != null) {
                    weakReference.clear();
                }
                g gVar = g.f9290a;
                g.f9293d = new WeakReference(activity);
                gVar.h(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@m Activity activity, @m Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@m Activity activity) {
            if (activity == null) {
                return;
            }
            g gVar = g.f9290a;
            g.f9292c++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@m Activity activity) {
            if (activity != null) {
                g.f9292c--;
                g.f9290a.g(activity);
            }
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Activity activity) {
        IBinder iBinder;
        View decorView;
        if (!activity.isFinishing() && k()) {
            return;
        }
        for (Map.Entry<String, com.lzf.easyfloat.core.d> entry : com.lzf.easyfloat.core.e.f9234a.g().entrySet()) {
            String key = entry.getKey();
            com.lzf.easyfloat.core.d value = entry.getValue();
            boolean z4 = true;
            if (activity.isFinishing() && (iBinder = value.u().token) != null) {
                Window window = activity.getWindow();
                IBinder iBinder2 = null;
                if (window != null && (decorView = window.getDecorView()) != null) {
                    iBinder2 = decorView.getWindowToken();
                }
                if (l0.g(iBinder, iBinder2)) {
                    com.lzf.easyfloat.core.e.f9234a.c(key, true);
                }
            }
            FloatConfig r5 = value.r();
            g gVar = f9290a;
            if (!gVar.k() && value.r().getShowPattern() != m2.a.CURRENT_ACTIVITY) {
                if (r5.getShowPattern() == m2.a.FOREGROUND || !r5.getNeedShow$easyfloat_release()) {
                    z4 = false;
                }
                gVar.n(z4, key);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Activity activity) {
        for (Map.Entry<String, com.lzf.easyfloat.core.d> entry : com.lzf.easyfloat.core.e.f9234a.g().entrySet()) {
            String key = entry.getKey();
            FloatConfig r5 = entry.getValue().r();
            if (r5.getShowPattern() != m2.a.CURRENT_ACTIVITY) {
                if (r5.getShowPattern() == m2.a.BACKGROUND) {
                    f9290a.n(false, key);
                } else if (r5.getNeedShow$easyfloat_release()) {
                    f9290a.n(!r5.getFilterSet().contains(activity.getComponentName().getClassName()), key);
                }
            }
        }
    }

    private final r2 n(boolean z4, String str) {
        return com.lzf.easyfloat.core.e.j(com.lzf.easyfloat.core.e.f9234a, z4, str, false, 4, null);
    }

    static /* synthetic */ r2 o(g gVar, boolean z4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = gVar.k();
        }
        return gVar.n(z4, str);
    }

    @l
    public final Application i() {
        Application application = f9291b;
        if (application != null) {
            return application;
        }
        l0.S("application");
        return null;
    }

    @m
    public final Activity j() {
        WeakReference<Activity> weakReference = f9293d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final boolean k() {
        return f9292c > 0;
    }

    public final void l(@l Application application) {
        l0.p(application, "<set-?>");
        f9291b = application;
    }

    public final void m(@l Application application) {
        l0.p(application, "application");
        l(application);
        application.registerActivityLifecycleCallbacks(new a());
    }
}
