package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import f1.a;
import java.util.HashMap;
import k0.b;

/* loaded from: classes2.dex */
public class TMNTokenClient {

    /* renamed from: a, reason: collision with root package name */
    public static TMNTokenClient f2823a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2824b;

    /* loaded from: classes2.dex */
    public interface InitResultListener {
        void onResult(String str, int i5);
    }

    public TMNTokenClient(Context context) {
        this.f2824b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f2824b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f2823a == null) {
            synchronized (TMNTokenClient.class) {
                if (f2823a == null) {
                    f2823a = new TMNTokenClient(context);
                }
            }
        }
        return f2823a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.c(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.c(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put(b.f19026g, UtdidWrapper.getUtdid(this.f2824b));
        hashMap.put("tid", "");
        hashMap.put("userId", "");
        hashMap.put(TTDownloadField.TT_APP_NAME, str);
        hashMap.put("appKeyClient", str2);
        hashMap.put("appchannel", "openapi");
        hashMap.put("sessionId", str3);
        hashMap.put("rpcVersion", "8");
        com.alipay.apmobilesecuritysdk.f.b.a().a(new Runnable() { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1
            @Override // java.lang.Runnable
            public void run() {
                int a5 = new com.alipay.apmobilesecuritysdk.a.a(TMNTokenClient.this.f2824b).a(hashMap);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (a5 != 0) {
                    initResultListener2.onResult("", a5);
                } else {
                    initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(TMNTokenClient.this.f2824b, str), 0);
                }
            }
        });
    }
}
