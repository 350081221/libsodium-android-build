package com.bytedance.tools.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tools.R;
import com.bytedance.tools.d.d;
import com.bytedance.tools.d.i;
import com.bytedance.tools.d.j;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import java.util.ArrayList;
import java.util.List;

@Instrumented
/* loaded from: classes2.dex */
public class ToolsActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    List<LinearLayout> f6332a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    List<TextView> f6333b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    List<View> f6334c = new ArrayList();

    /* loaded from: classes2.dex */
    class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i5, float f5, int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i5) {
            ToolsActivity.this.C(i5);
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPager f6336a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6337b;

        b(ViewPager viewPager, int i5) {
            this.f6336a = viewPager;
            this.f6337b = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f6336a.setCurrentItem(this.f6337b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(int i5) {
        String str = "test_tool_basic_info";
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    str = "test_tool_slot_info";
                }
            } else {
                str = "test_tool_overall_info";
            }
        }
        j.c(this, str);
        for (int i6 = 0; i6 < this.f6333b.size(); i6++) {
            if (i5 == i6) {
                this.f6333b.get(i6).setTextColor(Color.parseColor("#161823"));
                this.f6334c.get(i6).setBackgroundColor(Color.parseColor("#161823"));
                this.f6333b.get(i6).getPaint().setFakeBoldText(true);
            } else {
                this.f6333b.get(i6).setTextColor(Color.parseColor("#80161823"));
                this.f6334c.get(i6).setBackgroundColor(Color.parseColor("#ffffff"));
                this.f6333b.get(i6).getPaint().setFakeBoldText(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        setContentView(R.layout.F);
        if (!d.d(this)) {
            Toast.makeText(this, "穿山甲SDK或不存在，无法使用测试工具", 0).show();
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        j.c(this, "test_tool_start");
        this.f6332a.add(findViewById(R.id.f5690a0));
        this.f6332a.add(findViewById(R.id.X0));
        this.f6332a.add(findViewById(R.id.f5705c3));
        this.f6333b.add(findViewById(R.id.f5702c0));
        this.f6333b.add(findViewById(R.id.Z0));
        this.f6333b.add(findViewById(R.id.f5717e3));
        this.f6334c.add(findViewById(R.id.f5696b0));
        this.f6334c.add(findViewById(R.id.Y0));
        this.f6334c.add(findViewById(R.id.f5711d3));
        C(0);
        i.a(this, (Toolbar) findViewById(R.id.f5724f4), "穿山甲SDK测试工具");
        com.bytedance.tools.ui.ui.main.a aVar = new com.bytedance.tools.ui.ui.main.a(this, getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.R4);
        viewPager.setAdapter(aVar);
        viewPager.addOnPageChangeListener(new a());
        for (int i5 = 0; i5 < this.f6332a.size(); i5++) {
            this.f6332a.get(i5).setOnClickListener(new b(viewPager, i5));
        }
        AppInstrumentation.onActivityCreateEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        j.c(this, "test_tool_close");
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
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
