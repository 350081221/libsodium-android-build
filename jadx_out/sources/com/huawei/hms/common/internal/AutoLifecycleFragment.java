package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* loaded from: classes3.dex */
public class AutoLifecycleFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<a> f8363a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f8364b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HuaweiApiClient f8365a;

        public a(int i5, HuaweiApiClient huaweiApiClient) {
            this.f8365a = huaweiApiClient;
        }

        public void a() {
            this.f8365a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment == null) {
                AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
                fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
                return autoLifecycleFragment2;
            }
            return autoLifecycleFragment;
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e5);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8364b = true;
        for (int i5 = 0; i5 < this.f8363a.size(); i5++) {
            this.f8363a.valueAt(i5).f8365a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8364b = false;
        for (int i5 = 0; i5 < this.f8363a.size(); i5++) {
            this.f8363a.valueAt(i5).f8365a.disconnect();
        }
    }

    public void startAutoMange(int i5, HuaweiApiClient huaweiApiClient) {
        boolean z4;
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        if (this.f8363a.indexOfKey(i5) < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkState(z4, "Already managing a HuaweiApiClient with this clientId: " + i5);
        this.f8363a.put(i5, new a(i5, huaweiApiClient));
        if (this.f8364b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i5) {
        a aVar = this.f8363a.get(i5);
        this.f8363a.remove(i5);
        if (aVar != null) {
            aVar.a();
        }
    }
}
