package com.bytedance.mtesttools.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.mtesttools.b.h;
import com.bytedance.mtesttools.c.a;
import com.bytedance.mtesttools.c.b;
import com.bytedance.mtesttools.d.d;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.tools.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import j1.f;
import k1.e;
import k1.g;
import k1.i;

@Instrumented
/* loaded from: classes2.dex */
public class AdSlotDetailActivity extends com.bytedance.mtesttools.a.a implements View.OnClickListener, com.bytedance.mtesttools.b.b {
    FrameLayout A;
    FrameLayout B;
    private com.bytedance.mtesttools.c.a C;
    private com.bytedance.mtesttools.c.b D;
    private int E;
    private int F = 1;

    /* renamed from: c, reason: collision with root package name */
    ListView f3999c;

    /* renamed from: d, reason: collision with root package name */
    d f4000d;

    /* renamed from: e, reason: collision with root package name */
    TextView f4001e;

    /* renamed from: f, reason: collision with root package name */
    TextView f4002f;

    /* renamed from: g, reason: collision with root package name */
    TextView f4003g;

    /* renamed from: h, reason: collision with root package name */
    ImageView f4004h;

    /* renamed from: i, reason: collision with root package name */
    TextView f4005i;

    /* renamed from: j, reason: collision with root package name */
    TextView f4006j;

    /* renamed from: k, reason: collision with root package name */
    TextView f4007k;

    /* renamed from: l, reason: collision with root package name */
    RelativeLayout f4008l;

    /* renamed from: m, reason: collision with root package name */
    TextView f4009m;

    /* renamed from: n, reason: collision with root package name */
    TextView f4010n;

    /* renamed from: o, reason: collision with root package name */
    View f4011o;

    /* renamed from: p, reason: collision with root package name */
    View f4012p;

    /* renamed from: q, reason: collision with root package name */
    TextView f4013q;

    /* renamed from: r, reason: collision with root package name */
    TextView f4014r;

    /* renamed from: s, reason: collision with root package name */
    TextView f4015s;

    /* renamed from: t, reason: collision with root package name */
    ProgressBar f4016t;

    /* renamed from: u, reason: collision with root package name */
    TextView f4017u;

    /* renamed from: v, reason: collision with root package name */
    f f4018v;

    /* renamed from: w, reason: collision with root package name */
    boolean f4019w;

    /* renamed from: x, reason: collision with root package name */
    h f4020x;

    /* renamed from: y, reason: collision with root package name */
    FrameLayout f4021y;

    /* renamed from: z, reason: collision with root package name */
    FrameLayout f4022z;

    /* loaded from: classes2.dex */
    class a implements b.d {
        a() {
        }

        @Override // com.bytedance.mtesttools.c.b.d
        public void a() {
        }

        @Override // com.bytedance.mtesttools.c.b.d
        public void a(int i5) {
            AdSlotDetailActivity.this.E = i5;
            if (AdSlotDetailActivity.this.E == 1) {
                if (AdSlotDetailActivity.this.f4018v.k() == 7) {
                    AdSlotDetailActivity.this.f4006j.setText("模版（模版2.0）");
                    return;
                } else {
                    AdSlotDetailActivity.this.f4006j.setText("模板（含广点通1.0）");
                    return;
                }
            }
            if (AdSlotDetailActivity.this.E == 2) {
                AdSlotDetailActivity.this.f4006j.setText("自渲染");
            } else {
                AdSlotDetailActivity.this.f4006j.setText("模板（含广点通2.0）");
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements a.d {
        b() {
        }

        @Override // com.bytedance.mtesttools.c.a.d
        public void a() {
        }

        @Override // com.bytedance.mtesttools.c.a.d
        public void a(int i5) {
            AdSlotDetailActivity.this.F = i5;
            if (AdSlotDetailActivity.this.F == 1) {
                AdSlotDetailActivity.this.f4009m.setText("竖版");
            } else {
                AdSlotDetailActivity.this.f4009m.setText("横版");
            }
        }
    }

    private void i() {
        d dVar = new d(this);
        this.f4000d = dVar;
        this.f3999c.setAdapter((ListAdapter) dVar);
        View inflate = LayoutInflater.from(this).inflate(R.layout.V0, (ViewGroup) this.f3999c, false);
        this.f4001e = (TextView) inflate.findViewById(R.id.f5828x3);
        this.f4002f = (TextView) inflate.findViewById(R.id.f5708d0);
        this.f4003g = (TextView) inflate.findViewById(R.id.D);
        this.f4004h = (ImageView) inflate.findViewById(R.id.I);
        this.f4005i = (TextView) inflate.findViewById(R.id.P);
        this.f4006j = (TextView) inflate.findViewById(R.id.C2);
        this.f4007k = (TextView) inflate.findViewById(R.id.D2);
        this.f4008l = (RelativeLayout) inflate.findViewById(R.id.f5692a2);
        this.f4009m = (TextView) inflate.findViewById(R.id.f5698b2);
        this.f4010n = (TextView) inflate.findViewById(R.id.f5704c2);
        this.f4011o = inflate.findViewById(R.id.E3);
        this.f4012p = inflate.findViewById(R.id.D3);
        this.f4013q = (TextView) inflate.findViewById(R.id.B);
        this.f4014r = (TextView) inflate.findViewById(R.id.f5834z);
        this.f4015s = (TextView) inflate.findViewById(R.id.f5829y);
        this.f4016t = (ProgressBar) inflate.findViewById(R.id.f5770n2);
        this.f4017u = (TextView) inflate.findViewById(R.id.f5788q2);
        this.f4022z = (FrameLayout) inflate.findViewById(R.id.Y);
        this.A = (FrameLayout) inflate.findViewById(R.id.U0);
        this.B = (FrameLayout) inflate.findViewById(R.id.N0);
        w();
        this.f3999c.addHeaderView(inflate);
        this.f4000d.f(g.a(this.f4018v.k(), this.f4018v.e()));
        if (this.f4018v.j()) {
            this.f4002f.setVisibility(0);
        } else {
            this.f4002f.setVisibility(8);
        }
        this.f4001e.setText(this.f4018v.i());
        this.f4003g.setText(com.bytedance.mtesttools.a.b.a(this.f4018v.k()));
        if (this.f4018v.f() > 0) {
            this.f4004h.setImageResource(this.f4018v.f());
        }
        this.f4005i.setText(this.f4018v.b());
    }

    private void j() {
        this.f4015s.setOnClickListener(this);
        this.f4007k.setOnClickListener(this);
        this.f4010n.setOnClickListener(this);
    }

    private void k() {
        this.f4000d.b();
        if (this.f4018v.k() == 5) {
            if (this.E == 0) {
                i.b(this, "请选择渲染类型");
                return;
            }
        } else if (MediationConstant.ADN_GDT.equals(this.f4018v.h()) && this.f4018v.k() == 7) {
            if (this.E == 0) {
                i.b(this, "请选择渲染类型");
                return;
            }
        } else if (MediationConstant.ADN_GDT.equals(this.f4018v.h()) && this.f4018v.k() == 2) {
            if (this.E == 0) {
                i.b(this, "请选择渲染类型");
                return;
            }
        } else if (MediationConstant.ADN_GDT.equals(this.f4018v.h()) && this.f4018v.k() == 8 && this.E == 0) {
            i.b(this, "请选择渲染类型");
            return;
        }
        u();
        h a5 = e.a(this.f4018v);
        this.f4020x = a5;
        if (a5 != null) {
            v();
            this.f4020x.e(this, this.f4018v, this.E, this.F, this);
        }
    }

    private void l() {
        h hVar = this.f4020x;
        if (hVar != null && hVar.i()) {
            this.f4019w = false;
            this.f4013q.setText("您还没有加载任何广告");
            this.f4014r.setVisibility(0);
            this.f4011o.setVisibility(8);
            this.f4012p.setVisibility(8);
            this.f4015s.setText("加载广告");
            switch (this.f4018v.k()) {
                case 1:
                    q();
                    return;
                case 2:
                    m();
                    return;
                case 3:
                    n();
                    return;
                case 4:
                case 6:
                default:
                    return;
                case 5:
                    s();
                    return;
                case 7:
                    r();
                    return;
                case 8:
                    o();
                    return;
                case 9:
                    t();
                    return;
                case 10:
                    p();
                    return;
            }
        }
        i.b(this, "正在缓存中，请稍后重试");
    }

    private void m() {
        this.f4020x.b(this, null);
    }

    private void n() {
        this.f4021y.setVisibility(0);
        this.f4020x.b(this, this.f4021y);
    }

    private void o() {
        this.f4020x.b(this, null);
    }

    private void p() {
        this.f4020x.b(this, null);
    }

    private void q() {
        this.f4022z.setVisibility(0);
        this.f4020x.b(this, this.f4022z);
    }

    private void r() {
        this.f4020x.b(this, null);
    }

    private void s() {
        this.A.setVisibility(0);
        this.f4020x.b(this, this.A);
    }

    private void t() {
        this.B.setVisibility(0);
        this.f4020x.b(this, this.B);
    }

    private void u() {
        FrameLayout frameLayout = this.f4022z;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        FrameLayout frameLayout3 = this.B;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
    }

    private void v() {
        this.f4013q.setVisibility(8);
        this.f4014r.setVisibility(8);
        this.f4015s.setVisibility(8);
        this.f4016t.setVisibility(0);
        this.f4017u.setVisibility(0);
    }

    private void w() {
        this.f4013q.setVisibility(0);
        this.f4014r.setVisibility(0);
        this.f4015s.setVisibility(0);
        this.f4016t.setVisibility(8);
        this.f4017u.setVisibility(8);
    }

    @Override // com.bytedance.mtesttools.b.b
    public void a(String str, com.bytedance.mtesttools.b.a aVar) {
        w();
        if (aVar == null) {
            this.f4019w = true;
            this.f4013q.setText("您的广告已加载成功");
            this.f4011o.setVisibility(0);
            this.f4012p.setVisibility(0);
            this.f4014r.setVisibility(8);
            this.f4015s.setText("展示广告");
            this.f4018v.a(1);
            this.f4000d.c(str);
            return;
        }
        this.f4014r.setVisibility(0);
        this.f4013q.setText("您的广告加载失败");
        this.f4015s.setText("重新加载");
        this.f4011o.setVisibility(8);
        this.f4012p.setVisibility(8);
        this.f4018v.a(2);
        this.f4000d.d(str, aVar);
    }

    @Override // com.bytedance.mtesttools.b.b
    public void b(String str, com.bytedance.mtesttools.b.a aVar) {
        if ("onAdSkip".equals(str) || "onAdDismiss".equals(str)) {
            this.f4021y.setVisibility(8);
        }
        if (aVar != null) {
            this.f4000d.d(str, aVar);
            return;
        }
        h hVar = this.f4020x;
        if (hVar != null) {
            this.f4000d.e(str, hVar);
        } else {
            this.f4000d.d(str, aVar);
        }
    }

    @Override // com.bytedance.mtesttools.a.a
    protected int c() {
        return R.layout.f5891x0;
    }

    @Override // android.app.Activity
    public void finish() {
        Intent intent = new Intent();
        f fVar = this.f4018v;
        if (fVar != null) {
            intent.putExtra("slot_id", fVar.i());
            intent.putExtra("load_status", this.f4018v.a());
        }
        setResult(-1, intent);
        super.finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.f5829y) {
            if (this.f4019w) {
                l();
                return;
            } else {
                k();
                return;
            }
        }
        if (id == R.id.D2) {
            if (this.f4018v == null) {
                return;
            }
            if (this.D == null) {
                this.D = new com.bytedance.mtesttools.c.b(this, this.f4018v.k(), new a());
            }
            this.D.show();
            return;
        }
        if (id == R.id.f5704c2) {
            if (this.C == null) {
                this.C = new com.bytedance.mtesttools.c.a(this, new b());
            }
            this.C.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.mtesttools.a.a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        this.f3999c = (ListView) findViewById(R.id.f5774o0);
        this.f4021y = (FrameLayout) findViewById(R.id.G3);
        f fVar = (f) getIntent().getSerializableExtra("water_fall_config");
        this.f4018v = fVar;
        if (fVar == null) {
            i.b(this, "暂无数据，请稍后重试");
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        d("代码位详情", true);
        i();
        j();
        if (this.f4018v.k() != 7 && this.f4018v.k() != 8) {
            this.f4008l.setVisibility(8);
        } else {
            this.f4008l.setVisibility(0);
            if (this.F == 1) {
                this.f4009m.setText("竖版");
            } else {
                this.f4009m.setText("横版");
            }
        }
        this.E = this.f4018v.c();
        if (this.f4018v.k() == 5) {
            if (this.f4018v.c() > 0) {
                this.f4007k.setVisibility(8);
                int i5 = this.E;
                if (i5 == 1) {
                    this.f4006j.setText("模板（含广点通1.0）");
                } else if (i5 == 2) {
                    this.f4006j.setText("自渲染");
                } else {
                    this.f4006j.setText("模板（含广点通2.0）");
                }
            } else {
                this.f4007k.setVisibility(0);
                this.f4006j.setText("—");
            }
        } else if (MediationConstant.ADN_GDT.equals(this.f4018v.h()) && this.f4018v.k() == 7) {
            if (this.f4018v.c() > 0) {
                this.f4007k.setVisibility(8);
                int i6 = this.E;
                if (i6 == 2) {
                    this.f4006j.setText("自渲染");
                } else if (i6 == 1) {
                    this.f4006j.setText("模版（模版2.0）");
                } else {
                    this.f4006j.setText("—");
                }
            } else {
                this.f4007k.setVisibility(0);
                this.f4006j.setText("—");
            }
        } else if (MediationConstant.ADN_GDT.equals(this.f4018v.h()) && this.f4018v.k() == 2) {
            if (this.f4018v.c() > 0) {
                this.f4007k.setVisibility(8);
                int i7 = this.E;
                if (i7 == 1) {
                    this.f4006j.setText("模板（含广点通1.0）");
                } else if (i7 == 2) {
                    this.f4006j.setText("自渲染");
                } else {
                    this.f4006j.setText("模板（含广点通2.0）");
                }
            } else {
                this.f4007k.setVisibility(0);
                this.f4006j.setText("—");
            }
        } else if (MediationConstant.ADN_GDT.equals(this.f4018v.h()) && this.f4018v.k() == 8) {
            if (this.f4018v.c() > 0) {
                this.f4007k.setVisibility(8);
                int i8 = this.E;
                if (i8 == 1) {
                    this.f4006j.setText("模板（含广点通1.0）");
                } else if (i8 == 2) {
                    this.f4006j.setText("自渲染");
                } else {
                    this.f4006j.setText("模板（含广点通2.0）");
                }
            } else {
                this.f4007k.setVisibility(0);
                this.f4006j.setText("—");
            }
        } else if (this.f4018v.k() == 9) {
            if (MediationConstant.ADN_GDT.equals(this.f4018v.h())) {
                this.f4007k.setVisibility(8);
                this.f4006j.setText("自渲染");
            } else if (MediationConstant.ADN_KS.equals(this.f4018v.h())) {
                this.f4007k.setVisibility(8);
                this.f4006j.setText("模板");
            } else {
                int i9 = this.E;
                if (i9 == 1) {
                    this.f4006j.setText("模板");
                } else if (i9 == 2) {
                    this.f4006j.setText("自渲染");
                } else {
                    this.f4006j.setText("-");
                }
            }
        } else {
            this.f4007k.setVisibility(8);
            this.f4006j.setText("—");
        }
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
