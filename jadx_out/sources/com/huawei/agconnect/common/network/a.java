package com.huawei.agconnect.common.network;

import android.content.Context;
import android.os.Bundle;
import com.huawei.agconnect.common.api.HaConnector;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import com.huawei.agconnect.common.network.AccessNetworkManager;
import com.huawei.agconnect.credential.obs.x;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class a extends AccessNetworkManager {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7735a = "com.huawei.agconnect.AccessNetwork";

    /* renamed from: b, reason: collision with root package name */
    private final List<AccessNetworkManager.AccessNetworkCallback> f7736b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Context f7737c = x.a().b();

    private void a() {
        Iterator<AccessNetworkManager.AccessNetworkCallback> it = this.f7736b.iterator();
        while (it.hasNext()) {
            it.next().onNetWorkReady();
        }
    }

    private void a(AccessNetworkManager.AccessNetworkCallback accessNetworkCallback) {
        if (canAccessNetwork()) {
            accessNetworkCallback.onNetWorkReady();
        }
    }

    private void a(boolean z4) {
        b.a().a(z4);
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public void addCallback(AccessNetworkManager.AccessNetworkCallback accessNetworkCallback) {
        if (accessNetworkCallback != null) {
            this.f7736b.add(accessNetworkCallback);
            a(accessNetworkCallback);
        }
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public boolean canAccessNetwork() {
        Bundle bundle = SafeAppInfo.safeGetApplicationInfo(this.f7737c.getPackageManager(), this.f7737c.getPackageName(), 128).metaData;
        return bundle == null || !"false".equalsIgnoreCase(String.valueOf(bundle.get(f7735a))) || b.a().b();
    }

    @Override // com.huawei.agconnect.common.network.AccessNetworkManager
    public void setAccessNetwork(boolean z4) {
        a(z4);
        HaConnector.getInstance().setAnalyticsEnabled(z4);
        if (z4) {
            a();
        }
    }
}
