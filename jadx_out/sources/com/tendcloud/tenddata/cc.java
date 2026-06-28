package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.tendcloud.tenddata.by;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.ch;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
class cc implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public cb.a f11583a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownLatch f11584b = new CountDownLatch(2);

    /* renamed from: c, reason: collision with root package name */
    public b f11585c = new b();

    /* renamed from: d, reason: collision with root package name */
    public a f11586d = new a();

    /* loaded from: classes3.dex */
    public class a extends by.a {
        public a() {
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int i5, long j5, boolean z4, float f5, double d5, String str) {
            h.iForInternal("SSSS", "OAIDCallback.callback(" + i5 + "," + j5 + "," + z4 + "," + f5 + "," + d5 + "," + str + ")");
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int i5, Bundle bundle) {
            h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult retcode=" + i5 + " retInfo=" + bundle);
            if (i5 == 0 && bundle != null) {
                cb.a aVar = cc.this.f11583a;
                if (aVar != null) {
                    aVar.id = bundle.getString("oa_id_flag");
                    h.iForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult success:" + cc.this.f11583a.id);
                }
            } else {
                h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult error retcode=$ " + i5);
            }
            cc.this.f11584b.countDown();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends by.a {
        public b() {
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int i5, long j5, boolean z4, float f5, double d5, String str) {
            h.iForInternal("SSSS", "OAIDLimitCallback.callback(" + i5 + "," + j5 + "," + z4 + "," + f5 + "," + d5 + "," + str + ")");
        }

        @Override // com.tendcloud.tenddata.by
        public void callback(int i5, Bundle bundle) {
            h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult retCode=" + i5 + " retInfo= " + bundle);
            if (i5 == 0 && bundle != null) {
                if (cc.this.f11583a != null) {
                    boolean z4 = bundle.getBoolean("oa_id_limit_state");
                    cc.this.f11583a.isLimit = z4;
                    h.iForInternal("SSSS-AdvertisingIdPlatform", "OAIDLimitCallback handleResult success  isLimit=" + z4);
                }
            } else {
                h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDLimitCallback handleResult error retCode= " + i5);
            }
            cc.this.f11584b.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h.iForInternal("SSSS-AdvertisingIdPlatform", "onServiceConnected ");
        this.f11583a = new cb.a();
        if (iBinder == null) {
            h.iForInternal("SSSS", "service connected but service is null");
            return;
        }
        h.iForInternal("SSSS", "service connected and do get");
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDService");
        if (queryLocalInterface == null) {
            h.iForInternal("SSSS", "local interface is null");
        } else {
            h.iForInternal("SSSS", "local interface class:" + queryLocalInterface.getClass().getCanonicalName());
        }
        ch.a.C0231a c0231a = new ch.a.C0231a(iBinder);
        c0231a.a(this.f11586d);
        c0231a.b(this.f11585c);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        h.iForInternal("AdvertisingIdPlatform", "onServiceDisconnected ");
        this.f11584b.countDown();
        this.f11584b.countDown();
    }

    public final void unbind(Context context) {
        h.iForInternal("AdvertisingIdPlatform", "disconnect");
        try {
            context.unbindService(this);
        } catch (Exception e5) {
            h.eForInternal("AdvertisingIdPlatform", "OAIDClientImpl#disconnect#Disconnect error::" + e5.getMessage());
        }
    }
}
