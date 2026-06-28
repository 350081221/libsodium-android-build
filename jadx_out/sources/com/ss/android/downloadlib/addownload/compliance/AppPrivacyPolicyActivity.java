package com.ss.android.downloadlib.addownload.compliance;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.bytedance.gromore.R;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.ss.android.downloadlib.g.k;

@Instrumented
/* loaded from: classes3.dex */
public class AppPrivacyPolicyActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f9705a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f9706b;

    /* renamed from: c, reason: collision with root package name */
    private long f9707c;

    /* renamed from: d, reason: collision with root package name */
    private long f9708d;

    /* renamed from: e, reason: collision with root package name */
    private String f9709e;

    private void b() {
        this.f9705a = (ImageView) findViewById(R.id.f3534d0);
        this.f9706b = (WebView) findViewById(R.id.f3594x0);
        this.f9705a.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.a("lp_app_privacy_click_close", AppPrivacyPolicyActivity.this.f9708d);
                AppPrivacyPolicyActivity.this.finish();
            }
        });
        WebSettings settings = this.f9706b.getSettings();
        settings.setDefaultFontSize(16);
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setMixedContentMode(0);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        this.f9706b.setWebViewClient(new WebViewClient() { // from class: com.ss.android.downloadlib.addownload.compliance.AppPrivacyPolicyActivity.2
            private boolean a(Uri uri) {
                String scheme = uri.getScheme();
                if (!"http".equals(scheme) && !"https".equals(scheme)) {
                    return true;
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                boolean didCrash;
                if (Build.VERSION.SDK_INT < 26) {
                    return super.onRenderProcessGone(webView, renderProcessGoneDetail);
                }
                didCrash = renderProcessGoneDetail.didCrash();
                if (!didCrash) {
                    k.a("System killed the WebView rendering process to reclaim memory. Recreating...");
                    if (webView != null) {
                        ((ViewGroup) webView.getParent()).removeView(webView);
                        webView.destroy();
                    }
                    return true;
                }
                k.a("The WebView rendering process crashed!");
                if (webView != null) {
                    ((ViewGroup) webView.getParent()).removeView(webView);
                    webView.destroy();
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            @TargetApi(21)
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                return a(webResourceRequest.getUrl());
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return a(Uri.parse(str));
            }
        });
        a(this.f9706b);
        this.f9706b.setScrollBarStyle(0);
        this.f9706b.loadUrl(this.f9709e);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        g.a("lp_app_privacy_click_close", this.f9708d);
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        setContentView(R.layout.Y);
        if (a()) {
            b();
        } else {
            com.ss.android.socialbase.appdownloader.c.a((Activity) this);
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

    public static void a(Activity activity, long j5) {
        Intent intent = new Intent(activity, (Class<?>) AppPrivacyPolicyActivity.class);
        intent.putExtra("app_info_id", j5);
        activity.startActivity(intent);
    }

    private boolean a() {
        this.f9707c = getIntent().getLongExtra("app_info_id", 0L);
        com.ss.android.downloadlib.addownload.b.b a5 = c.a().a(this.f9707c);
        if (a5 == null) {
            return false;
        }
        this.f9708d = a5.f9632b;
        String str = a5.f9639i;
        this.f9709e = str;
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        this.f9709e = com.ss.android.downloadlib.addownload.k.j().optString("ad_privacy_backup_url", "https://sf6-ttcdn-tos.pstatp.com/obj/ad-tetris-site/personal-privacy-page.html");
        return true;
    }

    private void a(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }
}
