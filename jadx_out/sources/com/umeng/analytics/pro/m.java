package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;

@TargetApi(14)
/* loaded from: classes3.dex */
public class m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static m f12657a = new m();

    /* renamed from: b, reason: collision with root package name */
    private final int f12658b = 3000;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12659c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12660d = true;

    /* renamed from: e, reason: collision with root package name */
    private Handler f12661e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<n> f12662f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private a f12663g = new a();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m.this.f12659c && m.this.f12660d) {
                m.this.f12659c = false;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> went background.");
                for (int i5 = 0; i5 < m.this.f12662f.size(); i5++) {
                    ((n) m.this.f12662f.get(i5)).n();
                }
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
        }
    }

    private m() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f12660d = true;
        a aVar = this.f12663g;
        if (aVar != null) {
            this.f12661e.removeCallbacks(aVar);
            this.f12661e.postDelayed(this.f12663g, a1.b.f90a);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f12660d = false;
        this.f12659c = true;
        a aVar = this.f12663g;
        if (aVar != null) {
            this.f12661e.removeCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public synchronized void b(n nVar) {
        if (nVar != null) {
            for (int i5 = 0; i5 < this.f12662f.size(); i5++) {
                if (this.f12662f.get(i5) == nVar) {
                    this.f12662f.remove(i5);
                }
            }
        }
    }

    public static void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f12657a);
        }
    }

    public static m a() {
        return f12657a;
    }

    public synchronized void a(n nVar) {
        if (nVar != null) {
            this.f12662f.add(nVar);
        }
    }
}
