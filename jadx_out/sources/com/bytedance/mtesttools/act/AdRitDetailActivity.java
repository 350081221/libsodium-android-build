package com.bytedance.mtesttools.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.mtesttools.d.b;
import com.bytedance.tools.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import j1.e;
import k1.h;
import k1.i;

@Instrumented
/* loaded from: classes2.dex */
public class AdRitDetailActivity extends com.bytedance.mtesttools.a.a {

    /* renamed from: c, reason: collision with root package name */
    ListView f3993c;

    /* renamed from: d, reason: collision with root package name */
    b f3994d;

    /* renamed from: e, reason: collision with root package name */
    TextView f3995e;

    /* renamed from: f, reason: collision with root package name */
    TextView f3996f;

    /* renamed from: g, reason: collision with root package name */
    e f3997g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        }
    }

    private void e() {
        b bVar = new b(this);
        this.f3994d = bVar;
        this.f3993c.setAdapter((ListAdapter) bVar);
        View inflate = LayoutInflater.from(this).inflate(R.layout.U0, (ViewGroup) this.f3993c, false);
        this.f3995e = (TextView) inflate.findViewById(R.id.f5699b3);
        this.f3996f = (TextView) inflate.findViewById(R.id.D);
        this.f3993c.addHeaderView(inflate);
        this.f3995e.setText(this.f3997g.b());
        this.f3996f.setText(com.bytedance.mtesttools.a.b.a(this.f3997g.c()));
        this.f3994d.d(this.f3997g.d());
    }

    private void f() {
        this.f3993c.setOnItemClickListener(new a());
    }

    @Override // com.bytedance.mtesttools.a.a
    protected int c() {
        return R.layout.f5889w0;
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f3994d != null) {
            Intent intent = new Intent();
            intent.putExtra("rit_id", this.f3997g.b());
            intent.putExtra("load_status", this.f3994d.a());
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i5, int i6, @Nullable Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i5 == 22 && i6 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("slot_id");
            int intExtra = intent.getIntExtra("load_status", 0);
            h.e(stringExtra, intExtra);
            b bVar = this.f3994d;
            if (bVar != null) {
                bVar.c(stringExtra, intExtra);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.mtesttools.a.a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        this.f3993c = (ListView) findViewById(R.id.B3);
        e eVar = (e) getIntent().getSerializableExtra("rit_config");
        this.f3997g = eVar;
        if (eVar == null) {
            i.b(this, "暂无数据，请稍后重试");
            finish();
            AppInstrumentation.onActivityCreateEnd();
        } else {
            d("广告位详情", true);
            e();
            f();
            AppInstrumentation.onActivityCreateEnd();
        }
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
