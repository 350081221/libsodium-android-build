package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.secure.android.common.webview.f;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public class SafeWebView extends WebView {

    /* renamed from: f, reason: collision with root package name */
    private static final String f9087f = "SafeWebView";

    /* renamed from: a, reason: collision with root package name */
    private String f9088a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f9089b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f9090c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f9091d;

    /* renamed from: e, reason: collision with root package name */
    private f f9092e;

    /* loaded from: classes3.dex */
    private static class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final SslErrorHandler f9093a;

        b(SslErrorHandler sslErrorHandler) {
            this.f9093a = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i5) {
            this.f9093a.cancel();
        }
    }

    /* loaded from: classes3.dex */
    private static class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final SslErrorHandler f9094a;

        c(SslErrorHandler sslErrorHandler) {
            this.f9094a = sslErrorHandler;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i5) {
            this.f9094a.proceed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class d extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        private WebViewClient f9095a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9096b;

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z4);
            } else {
                super.doUpdateVisitedHistory(webView, str, z4);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null && !this.f9096b) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else if (!SafeWebView.this.c(str)) {
                SafeWebView.this.d(webView, str);
            } else {
                super.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i5, String str, String str2) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i5, str, str2);
            } else {
                super.onReceivedError(webView, i5, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean onRenderProcessGone;
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                onRenderProcessGone = webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
                return onRenderProcessGone;
            }
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i5, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i5, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i5, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f5, float f6) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f5, f6);
            } else {
                super.onScaleChanged(webView, f5, f6);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
            }
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        private d(WebViewClient webViewClient, boolean z4) {
            this.f9095a = webViewClient;
            this.f9096b = z4;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f9095a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public SafeWebView(Context context) {
        super(context);
        a();
    }

    private void a() {
        com.huawei.secure.android.common.webview.b.f(this);
        setWebViewClient(null);
    }

    private boolean b(String str) {
        return URLUtil.isHttpUrl(str);
    }

    @TargetApi(9)
    public boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.secure.android.common.util.e.l(f9087f, "url is null");
            return false;
        }
        if (!URLUtil.isNetworkUrl(str)) {
            return true;
        }
        String[] whitelistWithPath = getWhitelistWithPath();
        String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
        String[] whitelist = getWhitelist();
        if (whitelistWithPath != null && whitelistWithPath.length != 0) {
            return e.c(str, whitelistWithPath);
        }
        if (whitelistNotMatchSubDomain != null && whitelistNotMatchSubDomain.length != 0) {
            return e.h(str, whitelistNotMatchSubDomain);
        }
        return e.e(str, whitelist);
    }

    public final void d(WebView webView, String str) {
        com.huawei.secure.android.common.util.e.m(f9087f, "onCheckError url is not in white list ", str);
        webView.stopLoading();
        String defaultErrorPage = getDefaultErrorPage();
        if (!TextUtils.isEmpty(defaultErrorPage)) {
            webView.loadUrl(defaultErrorPage);
        } else if (getWebViewLoadCallBack() != null) {
            Log.e(f9087f, "onPageStarted WebViewLoadCallBack");
            getWebViewLoadCallBack().a(str, f.a.URL_NOT_IN_WHITE_LIST);
        }
    }

    @Deprecated
    protected final void e(String str, String str2, String str3, String str4, SslErrorHandler sslErrorHandler) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        c cVar = new c(sslErrorHandler);
        b bVar = new b(sslErrorHandler);
        builder.setMessage(str2);
        builder.setPositiveButton(str3, cVar);
        builder.setNegativeButton(str4, bVar);
        builder.create().show();
    }

    public String getDefaultErrorPage() {
        return this.f9088a;
    }

    public f getWebViewLoadCallBack() {
        return this.f9092e;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f9089b;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.f9090c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f9090c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.f9091d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (b(str)) {
            Log.e(f9087f, "loadDataWithBaseURL: http url , not safe");
            if (!TextUtils.isEmpty(this.f9088a)) {
                super.loadDataWithBaseURL(this.f9088a, str2, str3, str4, str5);
                return;
            } else {
                if (getWebViewLoadCallBack() != null) {
                    Log.e(f9087f, "WebViewLoadCallBack");
                    getWebViewLoadCallBack().a(str, f.a.HTTP_URL);
                    return;
                }
                return;
            }
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (b(str)) {
            Log.e(f9087f, "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f9088a)) {
                super.loadUrl(this.f9088a);
                return;
            } else {
                if (getWebViewLoadCallBack() != null) {
                    Log.e(f9087f, "WebViewLoadCallBack");
                    getWebViewLoadCallBack().a(str, f.a.HTTP_URL);
                    return;
                }
                return;
            }
        }
        super.loadUrl(str);
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (b(str)) {
            Log.e(f9087f, "postUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f9088a)) {
                super.postUrl(this.f9088a, bArr);
                return;
            } else {
                if (getWebViewLoadCallBack() != null) {
                    Log.e(f9087f, "WebViewLoadCallBack");
                    getWebViewLoadCallBack().a(str, f.a.HTTP_URL);
                    return;
                }
                return;
            }
        }
        super.postUrl(str, bArr);
    }

    public void setDefaultErrorPage(String str) {
        this.f9088a = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new d(webViewClient, true));
    }

    public void setWebViewLoadCallBack(f fVar) {
        this.f9092e = fVar;
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.f9089b = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.f9090c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f9090c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.f9091d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWebViewClient(WebViewClient webViewClient, boolean z4) {
        super.setWebViewClient(new d(webViewClient, z4));
    }

    public SafeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        a();
    }

    @TargetApi(21)
    public SafeWebView(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        a();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (b(str)) {
            Log.e(f9087f, "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f9088a)) {
                super.loadUrl(this.f9088a, map);
                return;
            } else {
                if (getWebViewLoadCallBack() != null) {
                    Log.e(f9087f, "WebViewLoadCallBack");
                    getWebViewLoadCallBack().a(str, f.a.HTTP_URL);
                    return;
                }
                return;
            }
        }
        super.loadUrl(str, map);
    }
}
