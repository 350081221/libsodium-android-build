package com.yuanqi.group.home.device;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.VirtualCore;
import com.yqtech.multiapp.R;
import com.yuanqi.group.abs.ui.VActivity;
import com.yuanqi.group.home.adapters.DevicePagerAdapter;

@Instrumented
/* loaded from: classes3.dex */
public class DeviceSettingsActivity extends VActivity {

    /* renamed from: a, reason: collision with root package name */
    private Toolbar f13962a;

    /* renamed from: b, reason: collision with root package name */
    private TabLayout f13963b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPager f13964c;

    private void H() {
        setSupportActionBar(this.f13962a);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        setContentView(R.layout.activity_mock_devices);
        Toolbar toolbar = (Toolbar) findViewById(R.id.clone_app_tool_bar);
        this.f13962a = toolbar;
        this.f13963b = (TabLayout) toolbar.findViewById(R.id.clone_app_tab_layout);
        this.f13964c = (ViewPager) findViewById(R.id.clone_app_view_pager);
        H();
        this.f13964c.setAdapter(new DevicePagerAdapter(getSupportFragmentManager()));
        if (VirtualCore.get().getTargetSdkVersion() >= 23) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PHONE_STATE"}, 0);
        } else {
            this.f13963b.setupWithViewPager(this.f13964c);
        }
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // com.yuanqi.group.abs.ui.VActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i5, @NonNull String[] strArr, @NonNull int[] iArr) {
        for (int i6 : iArr) {
            if (i6 == 0) {
                this.f13963b.setupWithViewPager(this.f13964c);
                return;
            }
        }
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
