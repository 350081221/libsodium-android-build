package com.lody.virtual.client.hook.proxies.oem.vivo;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import mirror.oem.vivo.ISuperResolutionManager;

/* loaded from: classes3.dex */
public class SuperResolutionManagerStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "SuperResolutionManager";

    public SuperResolutionManagerStub() {
        super(ISuperResolutionManager.Stub.TYPE, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstPkgMethodProxy("registerPackageSettingStateChangeListener"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("unRegisterPackageSettingStateChangeListener"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("registerSuperResolutionStateChange"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("unRegisterSuperResolutionStateChange"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getPackageSettingState"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("putPackageSettingState"));
    }
}
