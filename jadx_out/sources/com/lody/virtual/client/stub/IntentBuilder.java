package com.lody.virtual.client.stub;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Process;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.ServiceData;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class IntentBuilder {
    private static final AtomicInteger sServiceBindCounter = new AtomicInteger(0);

    public static Intent createBindProxyServiceIntent(int i5, boolean z4, ServiceInfo serviceInfo, Intent intent, int i6, int i7, IServiceConnection iServiceConnection) {
        Intent intent2 = new Intent();
        intent2.setClassName(StubManifest.getStubPackageName(z4), StubManifest.getStubServiceName(i5));
        intent2.setType(String.format(Locale.ENGLISH, "bind_service_%d_%d_%s|%s", Integer.valueOf(Process.myPid()), Integer.valueOf(sServiceBindCounter.getAndIncrement()), serviceInfo.packageName, serviceInfo.name));
        new ServiceData.ServiceBindData(new ComponentName(serviceInfo.packageName, serviceInfo.name), serviceInfo, intent, i6, i7, iServiceConnection).saveToIntent(intent2);
        return intent2;
    }

    public static Intent createStartProxyServiceIntent(int i5, boolean z4, ServiceInfo serviceInfo, Intent intent, int i6) {
        Intent intent2 = new Intent();
        intent2.setClassName(StubManifest.getStubPackageName(z4), StubManifest.getStubServiceName(i5));
        new ServiceData.ServiceStartData(new ComponentName(serviceInfo.packageName, serviceInfo.name), serviceInfo, intent, i6).saveToIntent(intent2);
        return intent2;
    }

    public static Intent createStopProxyServiceIntent(int i5, boolean z4, ComponentName componentName, int i6, int i7, IBinder iBinder) {
        Intent intent = new Intent();
        intent.setClassName(StubManifest.getStubPackageName(z4), StubManifest.getStubServiceName(i5));
        new ServiceData.ServiceStopData(i6, componentName, i7, iBinder).saveToIntent(intent);
        return intent;
    }

    public static ComponentName getProxyComponentName(ClientConfig clientConfig) {
        return new ComponentName(StubManifest.getStubPackageName(clientConfig.isExt), StubManifest.getStubServiceName(clientConfig.vpid));
    }
}
