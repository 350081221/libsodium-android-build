package com.lody.virtual.client.hook.proxies.appops;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import mirror.android.app.AppOpsManager;
import mirror.com.android.internal.app.IAppOpsService;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class AppOpsManagerStub extends BinderInvocationProxy {
    public AppOpsManagerStub() {
        super(IAppOpsService.Stub.asInterface, "appops");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        if (AppOpsManager.mService != null) {
            try {
                AppOpsManager.mService.set((android.app.AppOpsManager) VirtualCore.get().getContext().getSystemService("appops"), getInvocationStub().getProxyInterface());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
    }
}
