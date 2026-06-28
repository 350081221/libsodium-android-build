package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.diffdev.IDiffDevOAuth;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a implements IDiffDevOAuth {

    /* renamed from: c, reason: collision with root package name */
    private b f11249c;

    /* renamed from: a, reason: collision with root package name */
    private Handler f11247a = null;

    /* renamed from: b, reason: collision with root package name */
    private List<OAuthListener> f11248b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private OAuthListener f11250d = new C0226a();

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0226a implements OAuthListener {

        /* renamed from: com.tencent.mm.opensdk.diffdev.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0227a implements Runnable {
            RunnableC0227a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(a.this.f11248b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((OAuthListener) it.next()).onQrcodeScanned();
                }
            }
        }

        C0226a() {
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
            Log.d("MicroMsg.SDK.ListenerWrapper", String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
            a.this.f11249c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f11248b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onAuthGotQrcode(String str, byte[] bArr) {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = " + str);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(a.this.f11248b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
            }
        }

        @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
        public void onQrcodeScanned() {
            Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
            if (a.this.f11247a != null) {
                a.this.f11247a.post(new RunnableC0227a());
            }
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void addListener(OAuthListener oAuthListener) {
        if (this.f11248b.contains(oAuthListener)) {
            return;
        }
        this.f11248b.add(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean auth(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = " + str);
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
            if (this.f11247a == null) {
                this.f11247a = new Handler(Looper.getMainLooper());
            }
            if (!this.f11248b.contains(oAuthListener)) {
                this.f11248b.add(oAuthListener);
            }
            if (this.f11249c != null) {
                Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
                return true;
            }
            b bVar = new b(str, str2, str3, str4, str5, this.f11250d);
            this.f11249c = bVar;
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        }
        Log.d("MicroMsg.SDK.DiffDevOAuth", String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
        return false;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void detach() {
        Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f11248b.clear();
        stopAuth();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeAllListeners() {
        this.f11248b.clear();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public void removeListener(OAuthListener oAuthListener) {
        this.f11248b.remove(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public boolean stopAuth() {
        boolean z4;
        Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            b bVar = this.f11249c;
            z4 = bVar == null ? true : bVar.a();
        } catch (Exception e5) {
            Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e5.getMessage());
            z4 = false;
        }
        this.f11249c = null;
        return z4;
    }
}
