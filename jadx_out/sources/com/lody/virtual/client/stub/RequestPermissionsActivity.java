package com.lody.virtual.client.stub;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.helper.compat.BundleCompat;
import com.lody.virtual.server.IRequestPermissionsResult;

@Instrumented
@TargetApi(23)
/* loaded from: classes3.dex */
public class RequestPermissionsActivity extends Activity {
    private static final int REQUEST_PERMISSION_CODE = 996;
    private IRequestPermissionsResult mCallBack;

    public static void request(Context context, boolean z4, String[] strArr, IRequestPermissionsResult iRequestPermissionsResult) {
        Intent intent = new Intent();
        if (z4) {
            intent.setClassName(StubManifest.EXT_PACKAGE_NAME, RequestPermissionsActivity.class.getName());
        } else {
            intent.setClassName(StubManifest.PACKAGE_NAME, RequestPermissionsActivity.class.getName());
        }
        intent.setFlags(268435456);
        intent.putExtra("permissions", strArr);
        BundleCompat.putBinder(intent, "callback", iRequestPermissionsResult.asBinder());
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("permissions");
        IBinder binder = BundleCompat.getBinder(intent, "callback");
        if (binder != null && stringArrayExtra != null) {
            this.mCallBack = IRequestPermissionsResult.Stub.asInterface(binder);
            requestPermissions(stringArrayExtra, REQUEST_PERMISSION_CODE);
            AppInstrumentation.onActivityCreateEnd();
        } else {
            finish();
            AppInstrumentation.onActivityCreateEnd();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i5, strArr, iArr);
        IRequestPermissionsResult iRequestPermissionsResult = this.mCallBack;
        if (iRequestPermissionsResult != null) {
            try {
                if (!iRequestPermissionsResult.onResult(i5, strArr, iArr)) {
                    runOnUiThread(new Runnable() { // from class: com.lody.virtual.client.stub.RequestPermissionsActivity.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(RequestPermissionsActivity.this, "Request permission failed.", 0).show();
                        }
                    });
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
