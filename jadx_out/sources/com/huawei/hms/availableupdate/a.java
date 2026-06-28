package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8337b = new a();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f8338a;

    public boolean a(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity a5 = a();
        if (a5 != null && !a5.isFinishing()) {
            activity.finish();
            HMSLog.i("UpdateAdapterMgr", "finish one");
            return false;
        }
        this.f8338a = new WeakReference<>(activity);
        return true;
    }

    public void b(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity a5 = a();
        if (activity != null && activity.equals(a5)) {
            HMSLog.i("UpdateAdapterMgr", "reset");
            this.f8338a = null;
        }
    }

    public final Activity a() {
        WeakReference<Activity> weakReference = this.f8338a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
