package com.alipay.sdk.m.x;

import a1.n;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.ImageView;
import com.alipay.sdk.m.x.e;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lody.virtual.server.content.SyncStorageEngine;
import g0.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends com.alipay.sdk.m.x.c implements e.f, e.g, e.h {
    public static final String A = "action";
    public static final String B = "pushWindow";
    public static final String C = "h5JsFuncCallback";
    public static final String D = "sdkInfo";
    public static final String E = "canUseTaoLogin";
    public static final String F = "taoLogin";

    /* renamed from: l, reason: collision with root package name */
    public static final String f3020l = "sdk_result_code:";

    /* renamed from: m, reason: collision with root package name */
    public static final String f3021m = "alipayjsbridge://";

    /* renamed from: n, reason: collision with root package name */
    public static final String f3022n = "onBack";

    /* renamed from: o, reason: collision with root package name */
    public static final String f3023o = "setTitle";

    /* renamed from: p, reason: collision with root package name */
    public static final String f3024p = "onRefresh";

    /* renamed from: q, reason: collision with root package name */
    public static final String f3025q = "showBackButton";

    /* renamed from: r, reason: collision with root package name */
    public static final String f3026r = "onExit";

    /* renamed from: s, reason: collision with root package name */
    public static final String f3027s = "onLoadJs";

    /* renamed from: t, reason: collision with root package name */
    public static final String f3028t = "callNativeFunc";

    /* renamed from: u, reason: collision with root package name */
    public static final String f3029u = "back";

    /* renamed from: v, reason: collision with root package name */
    public static final String f3030v = "title";

    /* renamed from: w, reason: collision with root package name */
    public static final String f3031w = "refresh";

    /* renamed from: x, reason: collision with root package name */
    public static final String f3032x = "backButton";

    /* renamed from: y, reason: collision with root package name */
    public static final String f3033y = "refreshButton";

    /* renamed from: z, reason: collision with root package name */
    public static final String f3034z = "exit";

    /* renamed from: e, reason: collision with root package name */
    public boolean f3035e;

    /* renamed from: f, reason: collision with root package name */
    public String f3036f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3037g;

    /* renamed from: h, reason: collision with root package name */
    public final y0.a f3038h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3039i;

    /* renamed from: j, reason: collision with root package name */
    public com.alipay.sdk.m.x.e f3040j;

    /* renamed from: k, reason: collision with root package name */
    public d1.c f3041k;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f3018a.finish();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.x.e f3043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.alipay.sdk.m.x.e eVar) {
            super(null);
            this.f3043a = eVar;
        }

        @Override // com.alipay.sdk.m.x.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3043a.c();
            d.this.f3037g = false;
        }
    }

    /* loaded from: classes2.dex */
    public class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.alipay.sdk.m.x.e f3045a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3046b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.alipay.sdk.m.x.e eVar, String str) {
            super(null);
            this.f3045a = eVar;
            this.f3046b = str;
        }

        @Override // com.alipay.sdk.m.x.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.f3045a);
            d.this.f3040j.f(this.f3046b);
            d.this.f3037g = false;
        }
    }

    /* renamed from: com.alipay.sdk.m.x.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0097d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f3048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f3049b;

        /* renamed from: com.alipay.sdk.m.x.d$d$a */
        /* loaded from: classes2.dex */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i5) {
                RunnableC0097d.this.f3049b.cancel();
                i0.a.i(d.this.f3038h, i0.b.f16155k, i0.b.A, "2");
                g0.b.c(g0.b.a());
                RunnableC0097d.this.f3048a.finish();
            }
        }

        public RunnableC0097d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f3048a = activity;
            this.f3049b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.b.b(this.f3048a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<com.alipay.sdk.m.x.e> f3052a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3053b;

        /* renamed from: c, reason: collision with root package name */
        public final String f3054c;

        /* renamed from: d, reason: collision with root package name */
        public final JSONObject f3055d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3056e = false;

        public f(com.alipay.sdk.m.x.e eVar, String str, String str2, JSONObject jSONObject) {
            this.f3052a = new WeakReference<>(eVar);
            this.f3053b = str;
            this.f3054c = str2;
            this.f3055d = jSONObject;
        }

        public static String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return str.replace("'", "");
        }

        public void b(JSONObject jSONObject) {
            com.alipay.sdk.m.x.e eVar;
            if (this.f3056e || (eVar = (com.alipay.sdk.m.x.e) n.i(this.f3052a)) == null) {
                return;
            }
            this.f3056e = true;
            eVar.f(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.f3054c), a(jSONObject.toString())));
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f3057a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3058b;

        public g(f fVar, String str) {
            this.f3057a = fVar;
            this.f3058b = str;
        }

        @Override // g0.d.a
        public void a(boolean z4, JSONObject jSONObject, String str) {
            try {
                this.f3057a.b(new JSONObject().put(SyncStorageEngine.MESG_SUCCESS, z4).put("random", this.f3058b).put(PluginConstants.KEY_ERROR_CODE, jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, y0.a aVar, String str) {
        super(activity, str);
        this.f3035e = true;
        this.f3036f = HttpGet.METHOD_NAME;
        this.f3037g = false;
        this.f3040j = null;
        this.f3041k = new d1.c();
        this.f3038h = aVar;
        A();
    }

    private synchronized boolean A() {
        try {
            com.alipay.sdk.m.x.e eVar = new com.alipay.sdk.m.x.e(this.f3018a, this.f3038h, new e.C0099e(!m(), !m()));
            this.f3040j = eVar;
            eVar.setChromeProxy(this);
            this.f3040j.setWebClientProxy(this);
            this.f3040j.setWebEventProxy(this);
            addView(this.f3040j);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    private void B() {
        com.alipay.sdk.m.x.e eVar = this.f3040j;
        if (eVar != null) {
            eVar.getWebView().loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    private synchronized void C() {
        WebView webView = this.f3040j.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            d1.c cVar = this.f3041k;
            if (cVar != null && !cVar.c()) {
                y();
            } else {
                s(false);
            }
        }
    }

    private synchronized void q(String str, String str2, String str3) {
        char c5;
        com.alipay.sdk.m.x.e eVar = this.f3040j;
        if (eVar == null) {
            return;
        }
        JSONObject c02 = n.c0(str3);
        f fVar = new f(eVar, str, str2, c02);
        Context context = eVar.getContext();
        try {
            String str4 = fVar.f3053b;
            int i5 = 4;
            switch (str4.hashCode()) {
                case -1785164386:
                    if (str4.equals(E)) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case -552487705:
                    if (str4.equals(F)) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3015911:
                    if (str4.equals(f3029u)) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 3127582:
                    if (str4.equals(f3034z)) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 110371416:
                    if (str4.equals(f3030v)) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1085444827:
                    if (str4.equals("refresh")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1703426986:
                    if (str4.equals(B)) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1906413305:
                    if (str4.equals(f3032x)) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1947723784:
                    if (str4.equals(D)) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2033767917:
                    if (str4.equals(f3033y)) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    if (c02.has(f3030v)) {
                        eVar.getTitle().setText(c02.optString(f3030v, ""));
                        break;
                    }
                    break;
                case 1:
                    eVar.getWebView().reload();
                    break;
                case 2:
                    C();
                    break;
                case 3:
                    g0.b.c(c02.optString("result", null));
                    s(c02.optBoolean(SyncStorageEngine.MESG_SUCCESS, false));
                    break;
                case 4:
                    boolean optBoolean = c02.optBoolean("show", true);
                    ImageView backButton = eVar.getBackButton();
                    if (optBoolean) {
                        i5 = 0;
                    }
                    backButton.setVisibility(i5);
                    break;
                case 5:
                    boolean optBoolean2 = c02.optBoolean("show", true);
                    ImageView refreshButton = eVar.getRefreshButton();
                    if (optBoolean2) {
                        i5 = 0;
                    }
                    refreshButton.setVisibility(i5);
                    break;
                case 6:
                    w(c02.optString("url"), c02.optString(f3030v, ""));
                    break;
                case 7:
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sdk_version", "15.8.17");
                    jSONObject.put("app_name", this.f3038h.h());
                    jSONObject.put("app_version", this.f3038h.m());
                    fVar.b(jSONObject);
                    break;
                case '\b':
                    String url = eVar.getUrl();
                    if (!n.A(this.f3038h, url)) {
                        i0.a.i(this.f3038h, i0.b.f16157l, "jsUrlErr", url);
                        break;
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        boolean c6 = g0.d.c(this.f3038h, context);
                        jSONObject2.put("enabled", c6);
                        i0.a.d(this.f3038h, i0.b.f16157l, i0.b.f16174t0, String.valueOf(c6));
                        fVar.b(jSONObject2);
                        break;
                    }
                case '\t':
                    String url2 = eVar.getUrl();
                    if (!n.A(this.f3038h, url2)) {
                        i0.a.i(this.f3038h, i0.b.f16157l, "jsUrlErr", url2);
                        break;
                    } else {
                        String optString = c02.optString("random");
                        JSONObject optJSONObject = c02.optJSONObject("options");
                        if (!TextUtils.isEmpty("random") && optJSONObject != null) {
                            String optString2 = optJSONObject.optString("url");
                            String optString3 = optJSONObject.optString("action");
                            if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && (context instanceof Activity)) {
                                g0.d.b(this.f3038h, (Activity) context, 1010, optString2, optString3, new g(fVar, optString));
                                break;
                            }
                        }
                    }
                    break;
            }
        } catch (Throwable th) {
            i0.a.f(this.f3038h, i0.b.f16157l, "jInfoErr", th, str);
        }
    }

    private synchronized void s(boolean z4) {
        g0.b.d(z4);
        this.f3018a.finish();
    }

    private synchronized void v(String str) {
        int i5;
        Map<String, String> I = n.I(this.f3038h, str);
        if (str.startsWith(f3028t)) {
            q(I.get("func"), I.get("cbId"), I.get("data"));
        } else if (str.startsWith(f3022n)) {
            C();
        } else if (str.startsWith(f3023o) && I.containsKey(f3030v)) {
            this.f3040j.getTitle().setText(I.get(f3030v));
        } else if (str.startsWith(f3024p)) {
            this.f3040j.getWebView().reload();
        } else if (str.startsWith(f3025q) && I.containsKey("bshow")) {
            boolean equals = TextUtils.equals("true", I.get("bshow"));
            ImageView backButton = this.f3040j.getBackButton();
            if (equals) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            backButton.setVisibility(i5);
        } else if (str.startsWith(f3026r)) {
            g0.b.c(I.get("result"));
            s(TextUtils.equals("true", I.get("bsucc")));
        } else if (str.startsWith(f3027s)) {
            this.f3040j.f("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    private synchronized boolean w(String str, String str2) {
        com.alipay.sdk.m.x.e eVar = this.f3040j;
        try {
            com.alipay.sdk.m.x.e eVar2 = new com.alipay.sdk.m.x.e(this.f3018a, this.f3038h, new e.C0099e(!m(), !m()));
            this.f3040j = eVar2;
            eVar2.setChromeProxy(this);
            this.f3040j.setWebClientProxy(this);
            this.f3040j.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f3040j.getTitle().setText(str2);
            }
            this.f3037g = true;
            this.f3041k.b(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.f3040j.setAnimation(translateAnimation);
            addView(this.f3040j);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    private synchronized boolean y() {
        if (this.f3041k.c()) {
            this.f3018a.finish();
        } else {
            this.f3037g = true;
            com.alipay.sdk.m.x.e eVar = this.f3040j;
            this.f3040j = this.f3041k.d();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(eVar));
            eVar.setAnimation(translateAnimation);
            removeView(eVar);
            addView(this.f3040j);
        }
        return true;
    }

    private synchronized void z() {
        Activity activity = this.f3018a;
        com.alipay.sdk.m.x.e eVar = this.f3040j;
        if (activity != null && eVar != null) {
            if (this.f3035e) {
                activity.finish();
            } else {
                eVar.f("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, String str) {
        i0.a.d(this.f3038h, i0.b.f16157l, "h5ldd", SystemClock.elapsedRealtime() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + n.f0(str));
        B();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean b(com.alipay.sdk.m.x.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity activity = this.f3018a;
        if (activity == null) {
            return true;
        }
        if (n.B(this.f3038h, str, activity)) {
            return true;
        }
        if (str.startsWith(f3021m)) {
            v(str.substring(17));
        } else if (TextUtils.equals(str, k0.a.f19010q)) {
            s(false);
        } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                activity.startActivity(intent);
            } catch (Throwable th) {
                i0.a.g(this.f3038h, i0.b.f16157l, th);
            }
        } else {
            this.f3040j.f(str);
        }
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean c(com.alipay.sdk.m.x.e eVar, String str) {
        i0.a.d(this.f3038h, i0.b.f16157l, "h5ld", SystemClock.elapsedRealtime() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + n.f0(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            B();
        }
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized void d(com.alipay.sdk.m.x.e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.f3040j.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean e(com.alipay.sdk.m.x.e eVar, int i5, String str, String str2) {
        this.f3039i = true;
        i0.a.i(this.f3038h, i0.b.f16155k, i0.b.f16183y, "onReceivedError:" + i5 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void f(com.alipay.sdk.m.x.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void g(com.alipay.sdk.m.x.e eVar) {
        z();
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized boolean h(com.alipay.sdk.m.x.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains(f3020l)) {
            this.f3018a.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean i(com.alipay.sdk.m.x.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f3018a;
        if (activity == null) {
            return true;
        }
        i0.a.i(this.f3038h, i0.b.f16155k, i0.b.f16185z, "2-" + sslError);
        activity.runOnUiThread(new RunnableC0097d(activity, sslErrorHandler));
        return true;
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void k(String str) {
        if (HttpPost.METHOD_NAME.equals(this.f3036f)) {
            this.f3040j.g(str, null);
        } else {
            this.f3040j.f(str);
        }
        com.alipay.sdk.m.x.c.j(this.f3040j.getWebView());
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized boolean n() {
        Activity activity = this.f3018a;
        if (activity == null) {
            return true;
        }
        if (m()) {
            com.alipay.sdk.m.x.e eVar = this.f3040j;
            if (eVar != null && eVar.getWebView() != null) {
                if (eVar.getWebView().canGoBack()) {
                    if (x()) {
                        g0.c b5 = g0.c.b(g0.c.NETWORK_ERROR.b());
                        g0.b.c(g0.b.b(b5.b(), b5.a(), ""));
                        activity.finish();
                    }
                } else {
                    g0.b.c(g0.b.a());
                    activity.finish();
                }
                return true;
            }
            activity.finish();
            return true;
        }
        if (!this.f3037g) {
            z();
        }
        return true;
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void o() {
        this.f3040j.c();
        this.f3041k.a();
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent;
        if (this.f3037g) {
            onInterceptTouchEvent = true;
        } else {
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    public synchronized void r(String str, String str2, boolean z4) {
        this.f3036f = str2;
        this.f3040j.getTitle().setText(str);
        this.f3035e = z4;
    }

    public boolean x() {
        return this.f3039i;
    }
}
