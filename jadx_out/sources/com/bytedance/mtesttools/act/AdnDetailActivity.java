package com.bytedance.mtesttools.act;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.mtesttools.a.a;
import com.bytedance.tools.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import j1.d;
import k1.f;
import k1.i;

@Instrumented
/* loaded from: classes2.dex */
public class AdnDetailActivity extends a {

    /* renamed from: c, reason: collision with root package name */
    private d f4025c;

    /* renamed from: d, reason: collision with root package name */
    TextView f4026d;

    /* renamed from: e, reason: collision with root package name */
    TextView f4027e;

    /* renamed from: f, reason: collision with root package name */
    TextView f4028f;

    /* renamed from: g, reason: collision with root package name */
    TextView f4029g;

    /* renamed from: h, reason: collision with root package name */
    TextView f4030h;

    /* renamed from: i, reason: collision with root package name */
    TextView f4031i;

    /* renamed from: j, reason: collision with root package name */
    TextView f4032j;

    /* renamed from: k, reason: collision with root package name */
    TextView f4033k;

    private void e() {
        this.f4026d.setText(k1.a.f());
        String a5 = this.f4025c.a();
        if (!TextUtils.isEmpty(a5)) {
            this.f4027e.setText(a5);
        } else {
            this.f4027e.setText("—");
        }
        String b5 = this.f4025c.b();
        if (!TextUtils.isEmpty(b5)) {
            this.f4028f.setText(b5);
        } else {
            this.f4028f.setText("—");
        }
        boolean e5 = f.e(this.f4025c.c());
        j1.a g5 = f.g(this.f4025c.c());
        if (e5) {
            if (g5 == null) {
                this.f4029g.setText("未找到");
                this.f4029g.setEnabled(false);
            } else {
                this.f4029g.setEnabled(true);
                this.f4029g.setSelected(false);
                this.f4029g.setText(g5.a());
            }
            this.f4032j.setVisibility(8);
        } else {
            String o5 = f.o(this.f4025c.c());
            if (!TextUtils.isEmpty(o5)) {
                this.f4029g.setText(o5);
                if (k1.a.d(this.f4025c.c(), o5)) {
                    this.f4029g.setEnabled(true);
                    this.f4029g.setSelected(false);
                    this.f4032j.setVisibility(8);
                } else {
                    this.f4029g.setEnabled(false);
                    this.f4032j.setVisibility(0);
                }
            } else {
                this.f4029g.setText("未找到");
                this.f4029g.setEnabled(false);
                this.f4032j.setVisibility(8);
            }
        }
        if (e5) {
            if (g5 == null) {
                this.f4030h.setText("未找到");
                this.f4030h.setEnabled(false);
            } else {
                this.f4030h.setEnabled(true);
                this.f4030h.setSelected(false);
                this.f4030h.setText(g5.b());
            }
            this.f4033k.setVisibility(8);
        } else {
            String q5 = f.q(this.f4025c.c());
            if (!TextUtils.isEmpty(q5)) {
                this.f4030h.setText(q5);
                if (k1.a.g(this.f4025c.c(), q5)) {
                    this.f4030h.setEnabled(true);
                    this.f4030h.setSelected(false);
                    this.f4033k.setVisibility(8);
                } else {
                    this.f4030h.setEnabled(false);
                    this.f4033k.setVisibility(0);
                }
            } else {
                this.f4030h.setText("未找到");
                this.f4030h.setEnabled(false);
                this.f4033k.setVisibility(8);
            }
        }
        if (e5) {
            this.f4031i.setEnabled(true);
            this.f4031i.setSelected(true);
            this.f4031i.setText("不支持检测");
        } else if (f.c(this, this.f4025c.c())) {
            this.f4031i.setText("已找到");
            this.f4031i.setEnabled(true);
            this.f4031i.setSelected(false);
        } else {
            this.f4031i.setText("未找到");
            this.f4031i.setEnabled(false);
        }
    }

    @Override // com.bytedance.mtesttools.a.a
    protected int c() {
        return R.layout.f5893y0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.mtesttools.a.a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        d dVar = (d) getIntent().getSerializableExtra("adn_config");
        this.f4025c = dVar;
        if (dVar == null) {
            i.b(this, "暂无数据，请稍后重试");
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        d(this.f4025c.d() + "组件接入", true);
        this.f4026d = (TextView) findViewById(R.id.O1);
        this.f4027e = (TextView) findViewById(R.id.T);
        this.f4028f = (TextView) findViewById(R.id.U);
        this.f4029g = (TextView) findViewById(R.id.Q);
        this.f4030h = (TextView) findViewById(R.id.G);
        this.f4031i = (TextView) findViewById(R.id.K1);
        this.f4032j = (TextView) findViewById(R.id.N);
        this.f4033k = (TextView) findViewById(R.id.E);
        e();
        AppInstrumentation.onActivityCreateEnd();
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
