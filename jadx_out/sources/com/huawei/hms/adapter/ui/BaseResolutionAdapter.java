package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f8128a;

    /* renamed from: b, reason: collision with root package name */
    public String f8129b = "";

    public final void a() {
        Activity b5 = b();
        if (b5 != null && !b5.isFinishing()) {
            b5.finish();
        }
    }

    public final Activity b() {
        WeakReference<Activity> weakReference = this.f8128a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void c() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f8129b);
        a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f8128a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        Bundle extras = intent.getExtras();
        this.f8129b = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
        if (extras == null) {
            c();
            return;
        }
        Parcelable parcelable = extras.getParcelable("resolution");
        if (parcelable == null) {
            c();
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                activity.startActivityForResult((Intent) parcelable, 1001);
                return;
            } catch (ActivityNotFoundException unused) {
                c();
                HMSLog.e("BaseResolutionAdapter", "ActivityNotFoundException:exception");
                return;
            }
        }
        if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), 1001, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                c();
                HMSLog.e("BaseResolutionAdapter", "SendIntentException:exception");
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f8128a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i5, int i6, Intent intent) {
        if (i5 != getRequestCode()) {
            return false;
        }
        HMSLog.i("BaseResolutionAdapter", "onBridgeActivityResult, resultCode: " + i6);
        if (i6 == 1001 || i6 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i6);
        }
        if (i6 != -1 && !intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) && !intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(null, this.f8129b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f8129b);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i5, KeyEvent keyEvent) {
        HMSLog.i("BaseResolutionAdapter", "On key up when resolve conn error");
    }
}
