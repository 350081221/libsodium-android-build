package com.yuanqi.group.home;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.helper.compat.PermissionCompat;
import com.yqtech.multiapp.R;

@Instrumented
@TargetApi(23)
/* loaded from: classes3.dex */
public class PermissionRequestActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    private static final int f13861d = 995;

    /* renamed from: e, reason: collision with root package name */
    private static final String f13862e = "extra.permission";

    /* renamed from: f, reason: collision with root package name */
    private static final String f13863f = "extra.app_name";

    /* renamed from: g, reason: collision with root package name */
    private static final String f13864g = "extra.user_id";

    /* renamed from: h, reason: collision with root package name */
    private static final String f13865h = "extra.package_name";

    /* renamed from: a, reason: collision with root package name */
    private int f13866a;

    /* renamed from: b, reason: collision with root package name */
    private String f13867b;

    /* renamed from: c, reason: collision with root package name */
    private String f13868c;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        Toast.makeText(this, getString(R.string.start_app_failed, this.f13867b), 0).show();
    }

    public static void c(@NonNull Activity activity, @NonNull String[] strArr, @NonNull String str, int i5, @NonNull String str2, int i6) {
        Intent intent = new Intent(activity, (Class<?>) PermissionRequestActivity.class);
        intent.putExtra(f13862e, strArr);
        intent.putExtra(f13863f, str);
        intent.putExtra(f13865h, str2);
        intent.putExtra(f13864g, i5);
        activity.startActivityForResult(intent, i6);
        activity.overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        Intent intent = getIntent();
        String[] stringArrayExtra = intent.getStringArrayExtra(f13862e);
        this.f13867b = intent.getStringExtra(f13863f);
        this.f13868c = intent.getStringExtra(f13865h);
        this.f13866a = intent.getIntExtra(f13864g, -1);
        requestPermissions(stringArrayExtra, f13861d);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i5, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i5, strArr, iArr);
        if (PermissionCompat.isRequestGranted(iArr)) {
            Intent intent = new Intent();
            intent.putExtra("pkg", this.f13868c);
            intent.putExtra("user_id", this.f13866a);
            setResult(-1, intent);
        } else {
            runOnUiThread(new Runnable() { // from class: com.yuanqi.group.home.o0
                @Override // java.lang.Runnable
                public final void run() {
                    PermissionRequestActivity.this.b();
                }
            });
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
