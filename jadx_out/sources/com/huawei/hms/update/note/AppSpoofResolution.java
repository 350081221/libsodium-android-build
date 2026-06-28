package com.huawei.hms.update.note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes3.dex */
public class AppSpoofResolution implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public Activity f8804a;

    /* renamed from: b, reason: collision with root package name */
    public b f8805b;

    /* loaded from: classes3.dex */
    public class a implements AbstractDialog.Callback {
        public a() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            com.huawei.hms.availableupdate.b.f8339c.a(true);
            AppSpoofResolution.this.f8805b = null;
            AppSpoofResolution.this.a();
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            com.huawei.hms.availableupdate.b.f8339c.a(true);
            AppSpoofResolution.this.f8805b = null;
            AppSpoofResolution.this.a();
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends AbstractPromptDialog {
        public b() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
            String str = "com.huawei.hwid";
            String applicationName = new PackageManagerHelper(context).getApplicationName("com.huawei.hwid");
            if (!TextUtils.isEmpty(applicationName)) {
                str = applicationName;
            }
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_is_spoof", str);
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        @Override // com.huawei.hms.ui.AbstractPromptDialog, com.huawei.hms.ui.AbstractDialog
        public String onGetTitleString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_spoof_hints");
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public final void b() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            b bVar = this.f8805b;
            if (bVar == null) {
                this.f8805b = new b(null);
            } else {
                bVar.dismiss();
            }
            HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution showPromptdlg to resolve conn error");
            this.f8805b.show(activity, new a());
        }
    }

    public Activity getActivity() {
        return this.f8804a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityCreate");
        this.f8804a = activity;
        com.huawei.hms.availableupdate.b bVar = com.huawei.hms.availableupdate.b.f8339c;
        bVar.a(activity);
        bVar.a(false);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityDestroy");
        com.huawei.hms.availableupdate.b bVar = com.huawei.hms.availableupdate.b.f8339c;
        if (bVar.a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        bVar.b(this.f8804a);
        this.f8804a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i5, int i6, Intent intent) {
        if (i5 != getRequestCode()) {
            return false;
        }
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityResult");
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f8805b == null) {
            return;
        }
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution re show prompt dialog");
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i5, KeyEvent keyEvent) {
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution On key up when resolve spoof error");
    }

    public final void a() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        HMSLog.i("AppSpoofResolution", "enter AppSpoofResolution finishBridgeActivity：");
        if (com.huawei.hms.availableupdate.b.f8339c.a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        activity.finish();
    }
}
