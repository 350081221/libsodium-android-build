package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.a;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f8136a;

    /* renamed from: b, reason: collision with root package name */
    public int f8137b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8138c = false;

    public final boolean a(Intent intent, Activity activity) {
        if (!intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            return false;
        }
        HMSLog.i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
        Intent intent2 = new Intent();
        intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
        intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
        intent2.setComponent(componentName);
        activity.startActivityForResult(intent2, 1001);
        return true;
    }

    public final Activity b() {
        WeakReference<Activity> weakReference = this.f8136a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.i("UpdateAdapter", "activity == null");
            c();
            return;
        }
        activity.getApplicationContext();
        this.f8136a = new WeakReference<>(activity);
        if (!a.f8337b.a(b())) {
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        int intExtra = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
        this.f8137b = intExtra;
        if (intExtra == 0) {
            c();
            return;
        }
        if (intent.hasExtra("installHMS")) {
            this.f8138c = true;
        }
        a(intent, activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("UpdateAdapter", "onBridgeActivityDestroy");
        a.f8337b.b(b());
        this.f8136a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i5, int i6, Intent intent) {
        if (i5 != getRequestCode()) {
            return false;
        }
        HMSLog.i("UpdateAdapter", "onBridgeActivityResult " + i6);
        if (i6 == -1) {
            if (intent != null) {
                if (intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0) == 1) {
                    HMSLog.i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    a();
                    return true;
                }
                a(intent);
            }
        } else if (i6 == 0) {
            HMSLog.i("UpdateAdapter", "Activity.RESULT_CANCELED");
            Activity b5 = b();
            if (b5 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(b5.getApplicationContext()).getHMSPackageName();
            if (!this.f8138c && !a(b5, hMSPackageName, this.f8137b)) {
                SystemManager.getInstance().notifyUpdateResult(0);
            } else {
                HMSLog.i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            }
        } else if (i6 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i5, KeyEvent keyEvent) {
        HMSLog.i("UpdateAdapter", "On key up when resolve conn error");
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        if (intExtra == 0) {
            HMSLog.i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (intExtra == 13) {
            HMSLog.i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (intExtra == 8) {
            HMSLog.i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(intExtra);
        }
    }

    public final void a() {
        Activity b5 = b();
        if (b5 == null || b5.isFinishing()) {
            return;
        }
        b5.finish();
    }

    public final boolean a(Context context, String str, int i5) {
        if (context == null || TextUtils.isEmpty(str) || i5 == 0) {
            return false;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        return PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i5;
    }
}
