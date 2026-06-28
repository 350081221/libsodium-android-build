package com.bytedance.tools.ui;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.tools.R;
import com.bytedance.tools.d.i;
import com.bytedance.tools.ui.view.DoubleColorBallAnimationView;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import java.util.UUID;
import m1.a;

@Instrumented
/* loaded from: classes2.dex */
public class FeedBackActivity extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private EditText f6320a;

    /* renamed from: b, reason: collision with root package name */
    private Button f6321b;

    /* renamed from: c, reason: collision with root package name */
    private DoubleColorBallAnimationView f6322c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6323d;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: com.bytedance.tools.ui.FeedBackActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0132a implements Runnable {
            RunnableC0132a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FeedBackActivity.this.K();
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (FeedBackActivity.this.f6323d) {
                return;
            }
            FeedBackActivity.this.f6323d = true;
            FeedBackActivity.this.C();
            Toast.makeText(FeedBackActivity.this, "问题反馈中，请稍等，需要上传穿山甲日志信息...", 0).show();
            new Thread(new RunnableC0132a()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6328a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6329b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6330c;

        c(String str, boolean z4, String str2) {
            this.f6328a = str;
            this.f6329b = z4;
            this.f6330c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(FeedBackActivity.this, this.f6328a, 0).show();
            FeedBackActivity.this.H();
            if (this.f6329b && FeedBackActivity.this.f6320a != null) {
                FeedBackActivity.this.f6320a.setText(this.f6330c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str, boolean z4, String str2) {
        runOnUiThread(new c(str, z4, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        String uuid = UUID.randomUUID().toString();
        com.bytedance.tools.b.b.d(new b(uuid), L(), uuid);
    }

    private String L() {
        Editable text;
        EditText editText = this.f6320a;
        if (editText != null && (text = editText.getText()) != null) {
            return text.toString();
        }
        return "";
    }

    public void C() {
        this.f6322c.setVisibility(0);
        this.f6322c.d();
    }

    public void H() {
        this.f6322c.e();
        this.f6322c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        if (!com.bytedance.tools.b.b.e()) {
            Toast.makeText(this, "初始化日志收集失败", 0).show();
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        com.a.a.a.a.l();
        setContentView(R.layout.C);
        i.a(this, (Toolbar) findViewById(R.id.f5724f4), "穿山甲SDK问题反馈");
        this.f6320a = (EditText) findViewById(R.id.R0);
        this.f6321b = (Button) findViewById(R.id.f5726g0);
        this.f6322c = (DoubleColorBallAnimationView) findViewById(R.id.H1);
        this.f6321b.setOnClickListener(new a());
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
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements a.InterfaceC0622a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6326a;

        b(String str) {
            this.f6326a = str;
        }

        @Override // m1.a.InterfaceC0622a
        public void a(String str) {
            FeedBackActivity.this.E("问题反馈成功！id=" + this.f6326a, true, this.f6326a);
            FeedBackActivity.this.f6323d = false;
        }

        @Override // m1.a.InterfaceC0622a
        public void a(int i5, String str) {
            FeedBackActivity.this.E("问题反馈失败：" + i5 + "," + str, false, this.f6326a);
            FeedBackActivity.this.f6323d = false;
        }
    }
}
