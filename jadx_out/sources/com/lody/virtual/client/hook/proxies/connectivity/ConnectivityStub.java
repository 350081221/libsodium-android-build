package com.lody.virtual.client.hook.proxies.connectivity;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.net.IConnectivityManager;

/* loaded from: classes3.dex */
public class ConnectivityStub extends BinderInvocationProxy {
    public ConnectivityStub() {
        super(IConnectivityManager.Stub.asInterface, "connectivity");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("isTetheringSupported", Boolean.TRUE));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("requestNetwork"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getNetworkCapabilities"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("listenForNetwork"));
    }
}
