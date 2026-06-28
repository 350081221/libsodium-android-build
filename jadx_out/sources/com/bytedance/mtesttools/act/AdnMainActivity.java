package com.bytedance.mtesttools.act;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.bytedance.mtesttools.a.a;
import com.bytedance.mtesttools.d.c;
import com.bytedance.tools.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import k1.h;

@Instrumented
/* loaded from: classes2.dex */
public class AdnMainActivity extends a {

    /* renamed from: c, reason: collision with root package name */
    ListView f4034c;

    /* renamed from: d, reason: collision with root package name */
    c f4035d;

    private void e() {
        c cVar = new c(this);
        this.f4035d = cVar;
        this.f4034c.setAdapter((ListAdapter) cVar);
    }

    private void f() {
    }

    private void g() {
        this.f4035d.b(h.a());
    }

    @Override // com.bytedance.mtesttools.a.a
    protected int c() {
        return R.layout.f5895z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.mtesttools.a.a, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        this.f4034c = (ListView) findViewById(R.id.L);
        d("组件整体接入情况", true);
        e();
        f();
        g();
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
