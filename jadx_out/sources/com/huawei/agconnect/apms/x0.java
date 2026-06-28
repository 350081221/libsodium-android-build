package com.huawei.agconnect.apms;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityRenderEvent;
import com.huawei.agconnect.apms.lifestyle.ApplicationStateMonitor;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes3.dex */
public class x0 extends y0 implements Application.ActivityLifecycleCallbacks {

    /* loaded from: classes3.dex */
    public static class bcd implements Runnable {
        public /* synthetic */ bcd(abc abcVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationStateMonitor.getInstance().activityStarted();
        }
    }

    /* loaded from: classes3.dex */
    public static class cde implements Runnable {
        public /* synthetic */ cde(abc abcVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationStateMonitor.getInstance().activityStopped();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        h1.fgh().abc();
        s1.efg().abc();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @TargetApi(29)
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        h1.fgh().bcd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @TargetApi(29)
    public void onActivityPostResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        h1.fgh().abc(weakReference);
        s1.efg().bcd(weakReference);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @TargetApi(29)
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        h1.fgh().cde();
        s1.efg().bcd();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @TargetApi(29)
    public void onActivityPreResumed(Activity activity) {
        s1.efg().cde();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        h1.fgh().bcd(weakReference);
        s1.efg().abc(weakReference);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        s1 efg = s1.efg();
        if (efg.abc == null) {
            s1.mno.warn("can not get frame metrics with null frame metrics aggregator.");
        } else if (!Agent.isDisabled() && weakReference.get() != null) {
            Activity activity2 = (Activity) weakReference.get();
            if (efg.bcd(activity2)) {
                efg.bcd.put(activity2, Long.valueOf(System.currentTimeMillis()));
                efg.abc.abc.abc(activity2);
            }
        }
        this.abc.submit(new bcd(null));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        SparseIntArray[] sparseIntArrayArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        WeakReference weakReference = new WeakReference(activity);
        s1 efg = s1.efg();
        abc abcVar = null;
        if (efg.abc == null) {
            s1.mno.warn("can not get frame metrics, because the android support library is not included.");
        } else if (weakReference.get() != null) {
            Activity activity2 = (Activity) weakReference.get();
            String abc2 = efg.abc(activity2);
            if (efg.bcd(activity2) && efg.bcd.containsKey(activity2)) {
                long currentTimeMillis = System.currentTimeMillis();
                Long l5 = efg.bcd.get(activity2);
                if (l5 != null) {
                    efg.bcd.remove(activity2);
                    try {
                        sparseIntArrayArr = efg.abc.abc.bcd(activity2);
                    } catch (Exception unused) {
                        s1.mno.warn(String.format(Locale.ENGLISH, "view not hardware accelerated, can not remove %s from frameMetricsAggregator.", abc2));
                        sparseIntArrayArr = null;
                    }
                    if (!Agent.isDisabled()) {
                        if (sparseIntArrayArr != null && sparseIntArrayArr.length != 0) {
                            SparseIntArray sparseIntArray = sparseIntArrayArr[0];
                            if (sparseIntArray != null) {
                                i8 = 0;
                                i9 = 0;
                                i10 = 0;
                                for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                                    int keyAt = sparseIntArray.keyAt(i11);
                                    int valueAt = sparseIntArray.valueAt(i11);
                                    i8 += valueAt;
                                    if (keyAt > 700) {
                                        i10 += valueAt;
                                    }
                                    if (keyAt > 16) {
                                        i9 += valueAt;
                                    }
                                }
                            } else {
                                i8 = 0;
                                i9 = 0;
                                i10 = 0;
                            }
                            i5 = i8 - efg.cde;
                            i6 = i9 - efg.def;
                            i7 = i10 - efg.efg;
                            efg.cde = i8;
                            efg.def = i9;
                            efg.efg = i10;
                        } else {
                            i5 = 0;
                            i6 = 0;
                            i7 = 0;
                        }
                        if (i5 == 0) {
                            s1.mno.warn(String.format(Locale.ENGLISH, "frame aggregator currentTotalFrames is 0， %s does not refresh any frames.", abc2));
                        } else {
                            yza.abc(new ActivityRenderEvent(l5.longValue(), abc2, currentTimeMillis - l5.longValue(), i6, i7, i5));
                        }
                    }
                }
            }
        }
        this.abc.submit(new cde(abcVar));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
