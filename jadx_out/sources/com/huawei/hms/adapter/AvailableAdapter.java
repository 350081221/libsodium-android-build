package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes3.dex */
public class AvailableAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final int f8119a;

    /* renamed from: b, reason: collision with root package name */
    public AvailableCallBack f8120b;

    /* renamed from: d, reason: collision with root package name */
    public SystemObserver f8122d = new a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8121c = false;

    /* loaded from: classes3.dex */
    public interface AvailableCallBack {
        void onComplete(int i5);
    }

    /* loaded from: classes3.dex */
    public class a implements SystemObserver {
        public a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i5) {
            AvailableCallBack a5 = AvailableAdapter.this.a();
            if (a5 == null) {
                HMSLog.e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            a5.onComplete(i5);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i5) {
            AvailableCallBack a5 = AvailableAdapter.this.a();
            if (a5 == null) {
                HMSLog.e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            a5.onComplete(i5);
            return true;
        }
    }

    public AvailableAdapter(int i5) {
        this.f8119a = i5;
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a5 = a(context);
        if (a5 != 0) {
            return a5;
        }
        if (HMSPackageManager.getInstance(context).isApkNeedUpdate(this.f8119a)) {
            HMSLog.i("AvailableAdapter", "The current version does not meet the target version requirements");
            return 2;
        }
        return a5;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a5 = a(context);
        if (a5 != 0) {
            return a5;
        }
        if (HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.f8119a)) {
            HMSLog.i("AvailableAdapter", "The current version does not meet the minimum version requirements");
            return 2;
        }
        return a5;
    }

    public boolean isUserNoticeError(int i5) {
        return i5 == 29;
    }

    public boolean isUserResolvableError(int i5) {
        return i5 == 1 || i5 == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z4) {
        this.f8121c = z4;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity != null && availableCallBack != null) {
            if (UIUtil.isBackground(activity)) {
                HMSLog.i("AvailableAdapter", "current app is in Background");
                availableCallBack.onComplete(28);
            } else {
                HMSLog.i("AvailableAdapter", "startNotice");
                this.f8120b = availableCallBack;
                SystemManager.getSystemNotifier().registerObserver(this.f8122d);
                activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
            }
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity != null && availableCallBack != null) {
            if (UIUtil.isBackground(activity)) {
                HMSLog.i("AvailableAdapter", "current app is in Background");
                availableCallBack.onComplete(28);
                return;
            }
            if (!a(activity)) {
                a(activity, availableCallBack);
                return;
            }
            HMSLog.i("AvailableAdapter", "startResolution");
            this.f8120b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f8122d);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f8119a);
            if (this.f8121c) {
                intentStartBridgeActivity.putExtra("installHMS", "installHMS");
            }
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, true);
            activity.startActivity(intentStartBridgeActivity);
        }
    }

    public final int a(Context context) {
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is not installed");
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.i("AvailableAdapter", "HMS is spoofed");
            return 29;
        }
        if (!PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            return 0;
        }
        HMSLog.i("AvailableAdapter", "HMS is disabled");
        return 3;
    }

    public final void a(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (NotInstalledHmsAdapter.getShowLock()) {
            this.f8120b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f8122d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
            return;
        }
        availableCallBack.onComplete(31);
    }

    public final boolean a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).getHmsVersionCode() < 40000000) {
            return false;
        }
        HMSLog.i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
        return true;
    }

    public final AvailableCallBack a() {
        return this.f8120b;
    }
}
