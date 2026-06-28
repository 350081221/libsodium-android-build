package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.NotInstalledHmsDialogHelper;

/* loaded from: classes3.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8130c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8131d;

    /* renamed from: a, reason: collision with root package name */
    public Activity f8132a;

    /* renamed from: b, reason: collision with root package name */
    public Dialog f8133b;

    /* loaded from: classes3.dex */
    public static class a implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f8134a;

        public a(Activity activity) {
            this.f8134a = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            HMSLog.i("NotInstalledHmsAdapter", "<Dialog onCancel>");
            SystemManager.getInstance().notifyUpdateResult(13);
            this.f8134a.finish();
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f8135a;

        public b(Activity activity) {
            this.f8135a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i5) {
            HMSLog.i("NotInstalledHmsAdapter", "<Dialog onClick>");
            SystemManager.getInstance().notifyUpdateResult(30);
            this.f8135a.finish();
        }
    }

    public static boolean getShowLock() {
        synchronized (f8130c) {
            HMSLog.i("NotInstalledHmsAdapter", "<canShowDialog> sIsShowingDialog: " + f8131d);
            if (f8131d) {
                return false;
            }
            f8131d = true;
            return true;
        }
    }

    public final void a(Activity activity) {
        Dialog dialog = this.f8133b;
        if (dialog != null && dialog.isShowing()) {
            this.f8133b.setOnCancelListener(null);
            this.f8133b.cancel();
        }
        this.f8133b = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new b(activity)).setOnCancelListener(new a(activity)).show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.i("NotInstalledHmsAdapter", "<getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityCreate>");
        if (activity != null && !activity.isFinishing()) {
            this.f8132a = activity;
            a(activity);
        } else {
            HMSLog.e("NotInstalledHmsAdapter", "<onBridgeActivityCreate> activity is null or finishing");
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityDestroy>");
        synchronized (f8130c) {
            f8131d = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i5, int i6, Intent intent) {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged>");
        Activity activity = this.f8132a;
        if (activity != null && !activity.isFinishing()) {
            a(this.f8132a);
        } else {
            HMSLog.e("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged> mActivity is null or finishing");
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i5, KeyEvent keyEvent) {
        HMSLog.i("NotInstalledHmsAdapter", "<onKeyUp>");
    }
}
