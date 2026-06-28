package com.yuanqi.master.start;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.m.x.d;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.yqtech.multiapp.databinding.ActivityTextBinding;
import com.zzhoujay.richtext.f;
import com.zzhoujay.richtext.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/start/TextActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/yqtech/multiapp/databinding/ActivityTextBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class TextActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    public static final int f14866b = 8;

    /* renamed from: a, reason: collision with root package name */
    private ActivityTextBinding f14867a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(TextActivity this$0, View view) {
        l0.p(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m Bundle bundle) {
        TraceManager.startActivityTrace(TextActivity.class.getName());
        super.onCreate(bundle);
        ActivityTextBinding inflate = ActivityTextBinding.inflate(getLayoutInflater());
        l0.o(inflate, "inflate(...)");
        this.f14867a = inflate;
        ActivityTextBinding activityTextBinding = null;
        if (inflate == null) {
            l0.S("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        String stringExtra = getIntent().getStringExtra(d.f3030v);
        ActivityTextBinding activityTextBinding2 = this.f14867a;
        if (activityTextBinding2 == null) {
            l0.S("binding");
            activityTextBinding2 = null;
        }
        activityTextBinding2.toolbar.setTitle(stringExtra);
        ActivityTextBinding activityTextBinding3 = this.f14867a;
        if (activityTextBinding3 == null) {
            l0.S("binding");
            activityTextBinding3 = null;
        }
        activityTextBinding3.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.start.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextActivity.D(TextActivity.this, view);
            }
        });
        g.b j5 = f.j(getIntent().getStringExtra("content"));
        ActivityTextBinding activityTextBinding4 = this.f14867a;
        if (activityTextBinding4 == null) {
            l0.S("binding");
        } else {
            activityTextBinding = activityTextBinding4;
        }
        j5.q(activityTextBinding.tvContent);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(TextActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(TextActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(TextActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
