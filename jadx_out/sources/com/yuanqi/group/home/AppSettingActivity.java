package com.yuanqi.group.home;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VPackageManager;
import com.yqtech.multiapp.R;
import com.yuanqi.group.abs.ui.VActivity;

@Instrumented
/* loaded from: classes3.dex */
public class AppSettingActivity extends VActivity {

    /* renamed from: a, reason: collision with root package name */
    private com.yuanqi.group.home.models.i f13801a;

    /* renamed from: b, reason: collision with root package name */
    private int f13802b;

    /* renamed from: c, reason: collision with root package name */
    private PackageInfo f13803c;

    private void I() {
        String str;
        boolean cleanPackageData = VirtualCore.get().cleanPackageData(this.f13803c.packageName, this.f13802b);
        StringBuilder sb = new StringBuilder();
        sb.append("clean app data ");
        if (cleanPackageData) {
            str = "success.";
        } else {
            str = "failed.";
        }
        sb.append(str);
        Toast.makeText(this, sb.toString(), 0).show();
    }

    public static void J(Context context, String str, int i5) {
        Intent intent = new Intent(context, (Class<?>) AppSettingActivity.class);
        intent.putExtra("extra.PKG", str);
        intent.putExtra("extra.UserId", i5);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view) {
        I();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra.PKG");
        this.f13802b = intent.getIntExtra("extra.UserId", -1);
        this.f13801a = t2.i.d().e(stringExtra);
        PackageInfo packageInfo = VPackageManager.get().getPackageInfo(stringExtra, 0, this.f13802b);
        this.f13803c = packageInfo;
        if (this.f13801a != null && packageInfo != null) {
            E();
            setTitle(R.string.app_settings);
            setContentView(R.layout.activity_app_setting);
            ImageView imageView = (ImageView) findViewById(R.id.app_icon);
            TextView textView = (TextView) findViewById(R.id.app_name);
            imageView.setImageDrawable(this.f13801a.f14035c);
            textView.setText(this.f13801a.f14034b);
            findViewById(R.id.btn_clean_data).setOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.group.home.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppSettingActivity.this.K(view);
                }
            });
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        finish();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yuanqi.group.abs.ui.VActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
