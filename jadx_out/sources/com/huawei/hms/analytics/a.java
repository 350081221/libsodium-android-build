package com.huawei.hms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.analytics.core.log.HiLog;

/* loaded from: classes3.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private static a ijk;
    private Runnable fgh;
    public bh ikl;
    public boolean lmn = false;
    private boolean hij = true;
    public boolean klm = true;
    private final Handler ghi = new Handler(Looper.getMainLooper());
    private long efg = 0;
    private boolean def = false;

    static /* synthetic */ boolean ikl(a aVar) {
        aVar.lmn = false;
        return false;
    }

    public static a lmn(Context context) {
        synchronized (a.class) {
            if (ijk == null) {
                ijk = new a();
                Application lmn = context instanceof Application ? (Application) context : dg.lmn();
                if (lmn != null) {
                    lmn.registerActivityLifecycleCallbacks(ijk);
                } else {
                    HiLog.e("LifecycleRingback", "application is null.register activity lifecycle failed");
                }
            }
        }
        return ijk;
    }

    static /* synthetic */ void lmn(a aVar, long j5) {
        HiLog.d("LifecycleRingback", "Background. Pause time: ".concat(String.valueOf(j5)));
        bh bhVar = aVar.ikl;
        if (bhVar != null) {
            bhVar.klm(j5);
        }
        if (aVar.klm) {
            bh bhVar2 = aVar.ikl;
            if (bhVar2 != null) {
                bhVar2.lmn();
                aVar.ikl.klm();
            }
            fgh.lmn().klm();
        }
    }

    public final void lmn() {
        if (this.def) {
            return;
        }
        this.def = true;
        cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (!ar.lmn().lmn.fgh) {
                    HiLog.w("LifecycleRingback", "auto collect is closed");
                    return;
                }
                if (!(a.this.ikl instanceof ghi) || !ba.lmn()) {
                    HiLog.i("LifecycleRingback", "is OpennessInit Complete: " + ba.lmn());
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("$StartType", ar.lmn().lmn.f8142d);
                    ((ghi) a.this.ikl).klm("$LaunchApp", new dj("$LaunchApp", bundle), 0L);
                    HiLog.d("LifecycleRingback", "onLaunchAppEvent");
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(final Activity activity) {
        HiLog.d("LifecycleRingback", "onActivityPaused called.");
        this.hij = true;
        Runnable runnable = this.fgh;
        if (runnable != null) {
            this.ghi.removeCallbacks(runnable);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        long j5 = bcd.lmn().ghi;
        long j6 = this.efg;
        if (j6 != 0 && j5 != 0 && (j5 <= j6 || j5 > currentTimeMillis)) {
            bcd.lmn().hij = null;
            HiLog.d("LifecycleRingback", "Clear previous page info");
        }
        Handler handler = this.ghi;
        Runnable runnable2 = new Runnable() { // from class: com.huawei.hms.analytics.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!a.this.lmn || !a.this.hij) {
                    HiLog.i("LifecycleRingback", "still foreground");
                    return;
                }
                a.ikl(a.this);
                try {
                    a.lmn(a.this, currentTimeMillis);
                } catch (Throwable th) {
                    HiLog.w("LifecycleRingback", "lifecycle callback onReport error");
                    di.lmn(th);
                }
            }
        };
        this.fgh = runnable2;
        handler.postDelayed(runnable2, 200L);
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("LifecycleRingback", "auto collect is closed");
        } else if (ba.lmn()) {
            final bcd lmn = bcd.lmn();
            HiLog.d("ActivityStatCommander", "onScreenExitDelayed with time: ".concat(String.valueOf(currentTimeMillis)));
            lmn.fgh = true;
            lmn.efg.postDelayed(new Runnable() { // from class: com.huawei.hms.analytics.bcd.2
                final /* synthetic */ long klm;
                final /* synthetic */ Activity lmn;

                public AnonymousClass2(final Activity activity2, final long currentTimeMillis2) {
                    r2 = activity2;
                    r3 = currentTimeMillis2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (bcd.this.fgh) {
                        HiLog.i("ActivityStatCommander", "isExitDelayed = true");
                        try {
                            bcd.this.lmn(r3);
                        } catch (Throwable th) {
                            HiLog.w("ActivityStatCommander", "onScreenExit error: " + th.getMessage());
                            di.lmn(th);
                        }
                    }
                }
            }, 100L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(final Activity activity) {
        HiLog.d("LifecycleRingback", "onActivityResumed called.");
        final long currentTimeMillis = System.currentTimeMillis();
        this.efg = currentTimeMillis;
        this.hij = false;
        boolean z4 = !this.lmn;
        this.lmn = true;
        Runnable runnable = this.fgh;
        if (runnable != null) {
            this.ghi.removeCallbacks(runnable);
        }
        if (!z4 || this.ikl == null) {
            HiLog.d("LifecycleRingback", "still foreground.");
        } else {
            HiLog.d("LifecycleRingback", "foreground. Resume time: ".concat(String.valueOf(currentTimeMillis)));
            this.ikl.lmn(currentTimeMillis);
        }
        if (this.ikl != null) {
            lmn();
        }
        if (ba.lmn()) {
            bcd.lmn().lmn(activity, new Bundle(), currentTimeMillis);
        } else {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        bcd.lmn().lmn(activity, new Bundle(), currentTimeMillis);
                    } else {
                        HiLog.w("LifecycleRingback", "opennessInitComplete is false");
                    }
                }
            });
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
}
