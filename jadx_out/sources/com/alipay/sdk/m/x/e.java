package com.alipay.sdk.m.x;

import a1.k;
import a1.n;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class e extends LinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public static Handler f3059m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public ImageView f3060a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3061b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f3062c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f3063d;

    /* renamed from: e, reason: collision with root package name */
    public WebView f3064e;

    /* renamed from: f, reason: collision with root package name */
    public final C0099e f3065f;

    /* renamed from: g, reason: collision with root package name */
    public f f3066g;

    /* renamed from: h, reason: collision with root package name */
    public g f3067h;

    /* renamed from: i, reason: collision with root package name */
    public h f3068i;

    /* renamed from: j, reason: collision with root package name */
    public final y0.a f3069j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnClickListener f3070k;

    /* renamed from: l, reason: collision with root package name */
    public final float f3071l;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: com.alipay.sdk.m.x.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0098a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ View f3073a;

            public RunnableC0098a(View view) {
                this.f3073a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3073a.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = e.this.f3068i;
            if (hVar != null) {
                view.setEnabled(false);
                e.f3059m.postDelayed(new RunnableC0098a(view), 256L);
                if (view == e.this.f3060a) {
                    hVar.g(e.this);
                } else if (view == e.this.f3062c) {
                    hVar.f(e.this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements DownloadListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f3075a;

        public b(Context context) {
            this.f3075a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f3075a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return e.this.f3066g.h(e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i5) {
            if (e.this.f3065f.f3080b) {
                if (i5 > 90) {
                    e.this.f3063d.setVisibility(4);
                    return;
                }
                if (e.this.f3063d.getVisibility() == 4) {
                    e.this.f3063d.setVisibility(0);
                }
                e.this.f3063d.setProgress(i5);
                return;
            }
            e.this.f3063d.setVisibility(8);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            e.this.f3066g.d(e.this, str);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (!e.this.f3067h.a(e.this, str)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (!e.this.f3067h.c(e.this, str)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i5, String str, String str2) {
            if (!e.this.f3067h.e(e.this, i5, str, str2)) {
                super.onReceivedError(webView, i5, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (!e.this.f3067h.i(e.this, sslErrorHandler, sslError)) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!e.this.f3067h.b(e.this, str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            return true;
        }
    }

    /* renamed from: com.alipay.sdk.m.x.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0099e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3079a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3080b;

        public C0099e(boolean z4, boolean z5) {
            this.f3079a = z4;
            this.f3080b = z5;
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
        void d(e eVar, String str);

        boolean h(e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    /* loaded from: classes2.dex */
    public interface g {
        boolean a(e eVar, String str);

        boolean b(e eVar, String str);

        boolean c(e eVar, String str);

        boolean e(e eVar, int i5, String str, String str2);

        boolean i(e eVar, SslErrorHandler sslErrorHandler, SslError sslError);
    }

    /* loaded from: classes2.dex */
    public interface h {
        void f(e eVar);

        void g(e eVar);
    }

    public e(Context context, y0.a aVar, C0099e c0099e) {
        this(context, null, aVar, c0099e);
    }

    private int a(int i5) {
        return (int) (i5 * this.f3071l);
    }

    private void d(Context context) {
        int i5;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        if (this.f3065f.f3079a) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        linearLayout.setVisibility(i5);
        ImageView imageView = new ImageView(context);
        this.f3060a = imageView;
        imageView.setOnClickListener(this.f3070k);
        this.f3060a.setScaleType(ImageView.ScaleType.CENTER);
        this.f3060a.setImageDrawable(k.a(k.f143a, context));
        this.f3060a.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f3060a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(a(1), a(25)));
        TextView textView = new TextView(context);
        this.f3061b = textView;
        textView.setTextColor(-15658735);
        this.f3061b.setTextSize(17.0f);
        this.f3061b.setMaxLines(1);
        this.f3061b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f3061b, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.f3062c = imageView2;
        imageView2.setOnClickListener(this.f3070k);
        this.f3062c.setScaleType(ImageView.ScaleType.CENTER);
        this.f3062c.setImageDrawable(k.a(k.f144b, context));
        this.f3062c.setPadding(a(12), 0, a(12), 0);
        linearLayout.addView(this.f3062c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, a(48)));
    }

    private void j(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f3063d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f3063d.setMax(100);
        this.f3063d.setBackgroundColor(-218103809);
        addView(this.f3063d, new LinearLayout.LayoutParams(-1, a(2)));
    }

    private void l(Context context) {
        WebView webView = new WebView(context);
        this.f3064e = webView;
        webView.setVerticalScrollbarOverlay(true);
        e(this.f3064e, context);
        WebSettings settings = this.f3064e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f3064e.setVerticalScrollbarOverlay(true);
        this.f3064e.setDownloadListener(new b(context));
        try {
            try {
                this.f3064e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f3064e.removeJavascriptInterface("accessibility");
                this.f3064e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Exception unused) {
                Method method = this.f3064e.getClass().getMethod("removeJavascriptInterface", new Class[0]);
                if (method != null) {
                    method.invoke(this.f3064e, "searchBoxJavaBridge_");
                    method.invoke(this.f3064e, "accessibility");
                    method.invoke(this.f3064e, "accessibilityTraversal");
                }
            }
        } catch (Throwable unused2) {
        }
        com.alipay.sdk.m.x.c.j(this.f3064e);
        addView(this.f3064e, new LinearLayout.LayoutParams(-1, -1));
    }

    public void c() {
        removeAllViews();
        this.f3064e.removeAllViews();
        this.f3064e.setWebViewClient(null);
        this.f3064e.setWebChromeClient(null);
        this.f3064e.destroy();
    }

    public void e(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.getSettings().setUserAgentString(userAgentString + n.a0(context));
    }

    public void f(String str) {
        this.f3064e.loadUrl(str);
        com.alipay.sdk.m.x.c.j(this.f3064e);
    }

    public void g(String str, byte[] bArr) {
        this.f3064e.postUrl(str, bArr);
    }

    public ImageView getBackButton() {
        return this.f3060a;
    }

    public ProgressBar getProgressbar() {
        return this.f3063d;
    }

    public ImageView getRefreshButton() {
        return this.f3062c;
    }

    public TextView getTitle() {
        return this.f3061b;
    }

    public String getUrl() {
        return this.f3064e.getUrl();
    }

    public WebView getWebView() {
        return this.f3064e;
    }

    public void setChromeProxy(f fVar) {
        this.f3066g = fVar;
        if (fVar == null) {
            this.f3064e.setWebChromeClient(null);
        } else {
            this.f3064e.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f3067h = gVar;
        if (gVar == null) {
            this.f3064e.setWebViewClient(null);
        } else {
            this.f3064e.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f3068i = hVar;
    }

    public e(Context context, AttributeSet attributeSet, y0.a aVar, C0099e c0099e) {
        super(context, attributeSet);
        this.f3070k = new a();
        this.f3065f = c0099e == null ? new C0099e(false, false) : c0099e;
        this.f3069j = aVar;
        this.f3071l = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        d(context);
        j(context);
        l(context);
    }
}
