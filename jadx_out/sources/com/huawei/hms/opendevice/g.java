package com.huawei.hms.opendevice;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes3.dex */
public class g implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f8722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f8723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f8724c;

    public g(h hVar, Bundle bundle, Context context) {
        this.f8724c = hVar;
        this.f8722a = bundle;
        this.f8723b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnection serviceConnection;
        Messenger messenger;
        HMSLog.i("RemoteService", "remote service onConnected");
        this.f8724c.f8726b = new Messenger(iBinder);
        Message obtain = Message.obtain();
        obtain.setData(this.f8722a);
        try {
            messenger = this.f8724c.f8726b;
            messenger.send(obtain);
        } catch (RemoteException unused) {
            HMSLog.i("RemoteService", "remote service message send failed");
        }
        HMSLog.i("RemoteService", "remote service unbindservice");
        Context context = this.f8723b;
        serviceConnection = this.f8724c.f8725a;
        context.unbindService(serviceConnection);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("RemoteService", "remote service onDisconnected");
        this.f8724c.f8726b = null;
    }
}
