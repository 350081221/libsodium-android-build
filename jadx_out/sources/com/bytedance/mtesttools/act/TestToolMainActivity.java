package com.bytedance.mtesttools.act;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.tools.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import j1.c;
import j1.e;
import k1.f;
import k1.h;

@Instrumented
/* loaded from: classes2.dex */
public class TestToolMainActivity extends com.bytedance.mtesttools.a.a implements View.OnClickListener {

    /* renamed from: c, reason: collision with root package name */
    ExpandableListView f4036c;

    /* renamed from: d, reason: collision with root package name */
    com.bytedance.mtesttools.d.a f4037d;

    /* renamed from: e, reason: collision with root package name */
    TextView f4038e;

    /* renamed from: f, reason: collision with root package name */
    TextView f4039f;

    /* renamed from: g, reason: collision with root package name */
    TextView f4040g;

    /* renamed from: h, reason: collision with root package name */
    TextView f4041h;

    /* renamed from: i, reason: collision with root package name */
    RelativeLayout f4042i;

    /* renamed from: j, reason: collision with root package name */
    TextView f4043j;

    /* renamed from: k, reason: collision with root package name */
    TextView f4044k;

    /* renamed from: l, reason: collision with root package name */
    TextView f4045l;

    /* renamed from: m, reason: collision with root package name */
    TextView f4046m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ExpandableListView.OnChildClickListener {
        a() {
        }

        @Override // android.widget.ExpandableListView.OnChildClickListener
        public boolean onChildClick(ExpandableListView expandableListView, View view, int i5, int i6, long j5) {
            c group = TestToolMainActivity.this.f4037d.getGroup(i5);
            if (group != null && group.e() != null && group.e().size() > i6) {
                e eVar = group.e().get(i6);
                Intent intent = new Intent(TestToolMainActivity.this.getApplicationContext(), (Class<?>) AdRitDetailActivity.class);
                intent.putExtra("rit_config", eVar);
                TestToolMainActivity.this.startActivityForResult(intent, 33);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements ExpandableListView.OnGroupClickListener {
        b() {
        }

        @Override // android.widget.ExpandableListView.OnGroupClickListener
        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i5, long j5) {
            return true;
        }
    }

    private void e() {
        k1.a.j();
    }

    private void f() {
        k1.a.k();
    }

    private void g() {
        this.f4037d = new com.bytedance.mtesttools.d.a(this);
        this.f4036c.setGroupIndicator(null);
        this.f4036c.setDivider(null);
        this.f4036c.setChildDivider(null);
        this.f4036c.setOnChildClickListener(new a());
        this.f4036c.setOnGroupClickListener(new b());
        this.f4036c.setAdapter(this.f4037d);
        View inflate = LayoutInflater.from(this).inflate(R.layout.T0, (ViewGroup) this.f4036c, false);
        this.f4038e = (TextView) inflate.findViewById(R.id.O1);
        this.f4039f = (TextView) inflate.findViewById(R.id.T3);
        this.f4040g = (TextView) inflate.findViewById(R.id.M0);
        this.f4041h = (TextView) inflate.findViewById(R.id.f5825x0);
        this.f4042i = (RelativeLayout) inflate.findViewById(R.id.K);
        this.f4043j = (TextView) inflate.findViewById(R.id.O);
        this.f4044k = (TextView) inflate.findViewById(R.id.F);
        this.f4045l = (TextView) inflate.findViewById(R.id.f5747j3);
        this.f4046m = (TextView) inflate.findViewById(R.id.K1);
        this.f4036c.addHeaderView(inflate);
    }

    private void h() {
        this.f4042i.setOnClickListener(this);
    }

    private void i() {
        String str;
        String f5 = k1.a.f();
        this.f4038e.setText("Android " + f5);
        String i5 = k1.a.i();
        String h5 = k1.a.h();
        if (!TextUtils.isEmpty(i5) && !TextUtils.isEmpty(h5)) {
            this.f4039f.setText(i5 + " " + h5);
        }
        String h6 = h.h(this);
        if (TextUtils.isEmpty(h6)) {
            String a5 = k1.a.a(this);
            if (!TextUtils.isEmpty(a5)) {
                str = "OAID：\n" + a5;
            } else {
                str = "暂无";
            }
        } else {
            str = "IMEI：\n" + h6;
        }
        this.f4040g.setText(str);
        if (k1.a.b()) {
            this.f4041h.setText("已到达");
            this.f4041h.setEnabled(true);
            this.f4041h.setSelected(false);
        } else {
            this.f4041h.setEnabled(false);
            this.f4041h.setText("未到达");
        }
    }

    private void j() {
        h.b(this);
        this.f4043j.setText(f.a() + " 家广告网络");
        boolean f5 = f.f(h.f19061a);
        boolean i5 = f.i(h.f19061a);
        boolean d5 = f.d(this, h.f19061a);
        if (f5) {
            this.f4044k.setEnabled(true);
            this.f4044k.setSelected(false);
        } else {
            this.f4044k.setEnabled(false);
        }
        if (i5) {
            this.f4045l.setEnabled(true);
            this.f4045l.setSelected(false);
        } else {
            this.f4045l.setEnabled(false);
        }
        if (d5) {
            this.f4046m.setEnabled(true);
            this.f4046m.setSelected(false);
        } else {
            this.f4046m.setEnabled(false);
        }
        this.f4037d.d(h.i());
        int groupCount = this.f4037d.getGroupCount();
        if (groupCount == 0) {
            return;
        }
        for (int i6 = 0; i6 < groupCount; i6++) {
            this.f4036c.expandGroup(i6);
        }
    }

    private void k() {
        startActivity(new Intent(getApplicationContext(), (Class<?>) AdnMainActivity.class));
    }

    @Override // com.bytedance.mtesttools.a.a
    protected int c() {
        return R.layout.D0;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i5, int i6, @Nullable Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i5 == 33 && i6 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("rit_id");
            int intExtra = intent.getIntExtra("load_status", 0);
            com.bytedance.mtesttools.d.a aVar = this.f4037d;
            if (aVar != null) {
                aVar.c(stringExtra, intExtra);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.K) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.mtesttools.a.a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        e();
        this.f4036c = (ExpandableListView) findViewById(R.id.f5824x);
        d("穿山甲聚合测试工具", false);
        g();
        h();
        i();
        j();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f();
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
