package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class g extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Activity, WeakReference<g>> f8066b = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final List<WeakReference<com.huawei.hmf.tasks.e<?>>> f8067a = new ArrayList();

    private static g a(Activity activity) {
        g gVar;
        WeakHashMap<Activity, WeakReference<g>> weakHashMap = f8066b;
        WeakReference<g> weakReference = weakHashMap.get(activity);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        try {
            g gVar2 = (g) fragmentManager.findFragmentByTag("com.huawei.hmf.tasks.lifecycle_fragment_tag");
            if (gVar2 == null) {
                try {
                    gVar = b(fragmentManager);
                } catch (ClassCastException e5) {
                    e = e5;
                    gVar = gVar2;
                    Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                    return gVar;
                }
            } else {
                gVar = gVar2;
            }
            try {
                weakHashMap.put(activity, new WeakReference<>(gVar));
            } catch (ClassCastException e6) {
                e = e6;
                Log.e("LifecycleCallbackFrg", "found LifecycleCallbackFragment but the type do not match. " + e.getMessage());
                return gVar;
            }
        } catch (ClassCastException e7) {
            e = e7;
            gVar = null;
        }
        return gVar;
    }

    private static g b(FragmentManager fragmentManager) {
        g gVar;
        g gVar2 = null;
        try {
            gVar = new g();
        } catch (Exception e5) {
            e = e5;
        }
        try {
            fragmentManager.beginTransaction().add(gVar, "com.huawei.hmf.tasks.lifecycle_fragment_tag").commitAllowingStateLoss();
            return gVar;
        } catch (Exception e6) {
            e = e6;
            gVar2 = gVar;
            Log.e("LifecycleCallbackFrg", "create fragment failed." + e.getMessage());
            return gVar2;
        }
    }

    public static void c(Activity activity, com.huawei.hmf.tasks.e eVar) {
        g a5 = a(activity);
        if (a5 != null) {
            synchronized (a5.f8067a) {
                a5.f8067a.add(new WeakReference<>(eVar));
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        synchronized (this.f8067a) {
            Iterator<WeakReference<com.huawei.hmf.tasks.e<?>>> it = this.f8067a.iterator();
            while (it.hasNext()) {
                com.huawei.hmf.tasks.e<?> eVar = it.next().get();
                if (eVar != null) {
                    eVar.cancel();
                }
            }
            this.f8067a.clear();
        }
    }
}
