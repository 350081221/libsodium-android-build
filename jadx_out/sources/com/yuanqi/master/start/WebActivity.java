package com.yuanqi.master.start;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.m.x.d;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.yqtech.multiapp.databinding.ActivityWebBinding;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/yuanqi/master/start/WebActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "binding", "Lcom/yqtech/multiapp/databinding/ActivityWebBinding;", "initView", "", "loadUrl", "url", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class WebActivity extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14868c = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final String f14869a = "WebActivity";

    /* renamed from: b, reason: collision with root package name */
    private ActivityWebBinding f14870b;

    @i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/yuanqi/master/start/WebActivity$loadUrl$2", "Landroid/webkit/WebChromeClient;", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends WebChromeClient {
        a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@m WebView webView, int i5) {
            super.onProgressChanged(webView, i5);
            Log.d(WebActivity.this.f14869a, "onProgressChanged: " + i5);
            ActivityWebBinding activityWebBinding = WebActivity.this.f14870b;
            ActivityWebBinding activityWebBinding2 = null;
            if (activityWebBinding == null) {
                l0.S("binding");
                activityWebBinding = null;
            }
            activityWebBinding.progressBar.setProgress(i5);
            if (i5 == 100) {
                ActivityWebBinding activityWebBinding3 = WebActivity.this.f14870b;
                if (activityWebBinding3 == null) {
                    l0.S("binding");
                } else {
                    activityWebBinding2 = activityWebBinding3;
                }
                activityWebBinding2.progressBar.setVisibility(8);
            }
        }
    }

    private final void F() {
        String stringExtra = getIntent().getStringExtra(d.f3030v);
        if (stringExtra == null) {
            stringExtra = "WebView";
        }
        ActivityWebBinding activityWebBinding = this.f14870b;
        ActivityWebBinding activityWebBinding2 = null;
        if (activityWebBinding == null) {
            l0.S("binding");
            activityWebBinding = null;
        }
        activityWebBinding.toolbar.setTitle(stringExtra);
        ActivityWebBinding activityWebBinding3 = this.f14870b;
        if (activityWebBinding3 == null) {
            l0.S("binding");
        } else {
            activityWebBinding2 = activityWebBinding3;
        }
        activityWebBinding2.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.yuanqi.master.start.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebActivity.G(WebActivity.this, view);
            }
        });
        String stringExtra2 = getIntent().getStringExtra("url");
        if (stringExtra2 == null) {
            stringExtra2 = "https://www.baidu.com";
        }
        H(stringExtra2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(WebActivity this$0, View view) {
        l0.p(this$0, "this$0");
        this$0.finish();
    }

    private final void H(String str) {
        ActivityWebBinding activityWebBinding = this.f14870b;
        ActivityWebBinding activityWebBinding2 = null;
        if (activityWebBinding == null) {
            l0.S("binding");
            activityWebBinding = null;
        }
        WebSettings settings = activityWebBinding.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportMultipleWindows(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setCacheMode(1);
        ActivityWebBinding activityWebBinding3 = this.f14870b;
        if (activityWebBinding3 == null) {
            l0.S("binding");
            activityWebBinding3 = null;
        }
        activityWebBinding3.webView.setWebChromeClient(new a());
        ActivityWebBinding activityWebBinding4 = this.f14870b;
        if (activityWebBinding4 == null) {
            l0.S("binding");
        } else {
            activityWebBinding2 = activityWebBinding4;
        }
        activityWebBinding2.webView.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m Bundle bundle) {
        TraceManager.startActivityTrace(WebActivity.class.getName());
        super.onCreate(bundle);
        ActivityWebBinding inflate = ActivityWebBinding.inflate(getLayoutInflater());
        l0.o(inflate, "inflate(...)");
        this.f14870b = inflate;
        if (inflate == null) {
            l0.S("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        F();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(WebActivity.class.getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(WebActivity.class.getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(WebActivity.class.getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
