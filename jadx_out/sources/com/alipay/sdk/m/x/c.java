package com.alipay.sdk.m.x;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public abstract class c extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3016c = "v1";

    /* renamed from: d, reason: collision with root package name */
    public static final String f3017d = "v2";

    /* renamed from: a, reason: collision with root package name */
    public Activity f3018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3019b;

    public c(Activity activity, String str) {
        super(activity);
        this.f3018a = activity;
        this.f3019b = str;
    }

    public static void j(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public abstract void k(String str);

    public void l(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            CookieSyncManager.createInstance(this.f3018a.getApplicationContext()).sync();
            CookieManager.getInstance().setCookie(str, str2);
            CookieSyncManager.getInstance().sync();
        }
    }

    public boolean m() {
        return f3016c.equals(this.f3019b);
    }

    public abstract boolean n();

    public abstract void o();
}
