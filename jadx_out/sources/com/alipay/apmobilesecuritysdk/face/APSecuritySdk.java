package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.HashMap;
import java.util.Map;
import k0.b;
import p.f;

/* loaded from: classes2.dex */
public class APSecuritySdk implements f {

    /* renamed from: a, reason: collision with root package name */
    public static APSecuritySdk f2815a;
    public static APSecBgCheckerInterface bgChecker;

    /* renamed from: c, reason: collision with root package name */
    public static IDeviceInfo f2816c;

    /* renamed from: d, reason: collision with root package name */
    public static Object f2817d = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Context f2818b;

    /* loaded from: classes2.dex */
    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    /* loaded from: classes2.dex */
    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    public APSecuritySdk(Context context) {
        this.f2818b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f2816c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f2815a == null) {
            synchronized (f2817d) {
                if (f2815a == null) {
                    f2815a = new APSecuritySdk(context);
                }
            }
        }
        return f2815a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f2816c = iDeviceInfo;
    }

    @Override // p.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f2816c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String a5 = a.a(this.f2818b, "");
        if (f1.a.c(a5)) {
            initToken(0, new HashMap(), null);
        }
        return a5;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202311031119";
    }

    @Override // p.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f2816c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f2818b, "");
            tokenResult.clientKey = h.f(this.f2818b);
            tokenResult.apdid = a.a(this.f2818b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f2818b);
            if (f1.a.c(tokenResult.apdid) || f1.a.c(tokenResult.apdidToken) || f1.a.c(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i5, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i5);
        String b5 = h.b(this.f2818b);
        String c5 = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (f1.a.f(b5) && !f1.a.d(b5, c5)) {
            com.alipay.apmobilesecuritysdk.e.a.a(this.f2818b);
            d.a(this.f2818b);
            g.a(this.f2818b);
            i.h();
        }
        if (!f1.a.d(b5, c5)) {
            h.c(this.f2818b, c5);
        }
        String b6 = f1.a.b(map, b.f19026g, "");
        String b7 = f1.a.b(map, "tid", "");
        String b8 = f1.a.b(map, "userId", "");
        if (f1.a.c(b6)) {
            b6 = UtdidWrapper.getUtdid(this.f2818b);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(b.f19026g, b6);
        hashMap.put("tid", b7);
        hashMap.put("userId", b8);
        hashMap.put(TTDownloadField.TT_APP_NAME, "");
        hashMap.put("appKeyClient", "");
        hashMap.put("appchannel", "");
        hashMap.put("rpcVersion", "8");
        com.alipay.apmobilesecuritysdk.f.b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1
            @Override // java.lang.Runnable
            public void run() {
                new a(APSecuritySdk.this.f2818b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(APSecuritySdk.this.getTokenResult());
                }
            }
        });
    }

    @Override // p.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
