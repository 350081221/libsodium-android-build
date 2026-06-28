package com.huawei.secure.android.common.webview;

import android.util.Log;
import android.webkit.WebView;
import com.huawei.secure.android.common.util.o;
import com.huawei.secure.android.common.util.p;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9098c = "SafeGetUrl";

    /* renamed from: d, reason: collision with root package name */
    private static final long f9099d = 200;

    /* renamed from: a, reason: collision with root package name */
    private String f9100a;

    /* renamed from: b, reason: collision with root package name */
    private WebView f9101b;

    /* renamed from: com.huawei.secure.android.common.webview.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0167a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f9102a;

        RunnableC0167a(CountDownLatch countDownLatch) {
            this.f9102a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.d(aVar.f9101b.getUrl());
            this.f9102a.countDown();
        }
    }

    public a() {
    }

    public String b() {
        if (this.f9101b == null) {
            return "";
        }
        if (o.a()) {
            return this.f9101b.getUrl();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        p.a(new RunnableC0167a(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e5) {
            Log.e(f9098c, "getUrlMethod: InterruptedException " + e5.getMessage(), e5);
        }
        return this.f9100a;
    }

    public WebView c() {
        return this.f9101b;
    }

    public void d(String str) {
        this.f9100a = str;
    }

    public void e(WebView webView) {
        this.f9101b = webView;
    }

    public a(WebView webView) {
        this.f9101b = webView;
    }
}
