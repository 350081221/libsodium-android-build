package com.lody.virtual.client.hook.proxies.network;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import mirror.android.net.INetworkStatsService;
import mirror.android.net.TrafficStats;

/* loaded from: classes3.dex */
public class NetworkStatsServiceStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "netstats";

    public NetworkStatsServiceStub() {
        super(INetworkStatsService.Stub.asInterface, SERVER_NAME);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        if (TrafficStats.sStatsService() != null) {
            TrafficStats.sStatsService(getInvocationStub().getProxyInterface());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("incrementOperationCount"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getUidStats"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getDataLayerSnapshotForUid"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("registerUsageCallback"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("openSessionForUsageStats"));
    }
}
